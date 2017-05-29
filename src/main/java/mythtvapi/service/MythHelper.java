package mythtvapi.service;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * Created by felix on 12/05/17.
 */
public class MythHelper {

    public enum ServiceType{
        Capture,Channel,Content,Dvr,Guide,Myth,Video
    }

    public static XMLGregorianCalendar GetXMLGregorianCalendar(LocalDateTime localDateTime) throws DatatypeConfigurationException
    {
        return GetXMLGregorianCalendar(
                localDateTime.getYear(),
                localDateTime.getMonthValue()-1,
                localDateTime.getDayOfMonth(),
                localDateTime.getHour(),
                localDateTime.getMinute(),
                localDateTime.getSecond()
                );
    }

    private static XMLGregorianCalendar GetXMLGregorianCalendar(int year, int gregorianCalendarMonth, int date, int hourOfTheDay, int minute, int second) throws DatatypeConfigurationException
    {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.set(year, gregorianCalendarMonth,date,hourOfTheDay, minute, second);
        calendar.setTimeZone(TimeZone.getDefault());
        return DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
    }

    public static LocalDateTime GetLocalDateTime (XMLGregorianCalendar xmlGregorianCalendar)
    {
        GregorianCalendar calendar = xmlGregorianCalendar.toGregorianCalendar();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH+1);
        int dayOfTheMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        return LocalDateTime.of(year,month,dayOfTheMonth,hour,minute,second);
    }
}
