package mythtvrecorder;

import mythtvapi.channel.Channel;
import mythtvapi.channel.ChannelServices;
import mythtvapi.dvr.*;
import mythtvapi.dvr.Program;
import mythtvapi.guide.*;
import mythtvapi.service.MythHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;

public class App 
{
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main( String[] args )
    {
        System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");

        String wsdlLocation = "http://%s:%d/%s/wsdl";
        Properties configurationProperties = LoadConfigurationProperties("config.properties");

        String host = configurationProperties.getProperty("apiServiceHost");
        int port = Integer.parseInt(configurationProperties.getProperty("apiServicePort"));

        try {
            URL dvrApiServiceUrl = new URL(String.format(wsdlLocation,host,port, MythHelper.ServiceType.Dvr.name()));
            URL guideApiServiceUrl = new URL(String.format(wsdlLocation,host,port, MythHelper.ServiceType.Guide.name()));
            URL channelApiServiceUrl = new URL(String.format(wsdlLocation,host,port, MythHelper.ServiceType.Channel.name()));

            DvrServices dvrServices = new DvrServices(dvrApiServiceUrl);
            Dvr dvr = dvrServices.getBasicHttpBindingDvr();

            GuideServices guideServices = new GuideServices(guideApiServiceUrl);
            Guide guide = guideServices.getBasicHttpBindingGuide();

            ChannelServices channelService = new ChannelServices(channelApiServiceUrl);
            Channel channel = channelService.getBasicHttpBindingChannel();



            LocalDateTime localDateTime = LocalDateTime.now();
            XMLGregorianCalendar startDateTime = MythHelper.GetXMLGregorianCalendar(localDateTime.minusHours(2));
            XMLGregorianCalendar endDateTime = MythHelper.GetXMLGregorianCalendar(localDateTime.plusHours(2));

            ProgramGuide programGuide = guide.getProgramGuide(startDateTime,endDateTime, true, null,null,null);

            for(mythtvapi.guide.ChannelInfo channelInfo : programGuide.getChannels().getChannelInfo())
            {
                for (mythtvapi.guide.Program program : channelInfo.getPrograms().getProgram())
                {
                    System.out.println(program.getTitle() + " " + program.isRepeat());
                }
            }
        }
        catch (Exception ex)
        {
            logger.error(ex);
        }

    }

    public static Properties LoadConfigurationProperties(String filename)
    {
        ClassLoader classLoader = App.class.getClassLoader();
        Properties properties = new Properties();
        InputStream inputStream = null;

        try{
            inputStream = classLoader.getResourceAsStream(filename);
            properties.load(inputStream);
        }
        catch(IOException ioException)
        {
            logger.error(ioException.getMessage());
            logger.debug(ioException.getStackTrace());
        }
        finally {
            if(inputStream != null)
            {
                try
                {
                    inputStream.close();
                }
                catch (IOException ex)
                {
                    logger.error(ex.getMessage());
                    logger.debug(ex.getStackTrace());
                }
            }

        }
        return properties;
    }
}
