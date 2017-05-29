
package mythtvapi.channel;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * Interface Version 1.5 - 
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ChannelServices", targetNamespace = "http://mythtv.org", wsdlLocation = "file:/tmp/mythtv/wsdl")
public class ChannelServices
    extends Service
{

    private final static URL CHANNELSERVICES_WSDL_LOCATION;
    private final static WebServiceException CHANNELSERVICES_EXCEPTION;
    private final static QName CHANNELSERVICES_QNAME = new QName("http://mythtv.org", "ChannelServices");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/tmp/mythtv/wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CHANNELSERVICES_WSDL_LOCATION = url;
        CHANNELSERVICES_EXCEPTION = e;
    }

    public ChannelServices() {
        super(__getWsdlLocation(), CHANNELSERVICES_QNAME);
    }

    public ChannelServices(WebServiceFeature... features) {
        super(__getWsdlLocation(), CHANNELSERVICES_QNAME, features);
    }

    public ChannelServices(URL wsdlLocation) {
        super(wsdlLocation, CHANNELSERVICES_QNAME);
    }

    public ChannelServices(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CHANNELSERVICES_QNAME, features);
    }

    public ChannelServices(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ChannelServices(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Channel
     */
    @WebEndpoint(name = "BasicHttpBinding_Channel")
    public Channel getBasicHttpBindingChannel() {
        return super.getPort(new QName("http://mythtv.org", "BasicHttpBinding_Channel"), Channel.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Channel
     */
    @WebEndpoint(name = "BasicHttpBinding_Channel")
    public Channel getBasicHttpBindingChannel(WebServiceFeature... features) {
        return super.getPort(new QName("http://mythtv.org", "BasicHttpBinding_Channel"), Channel.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CHANNELSERVICES_EXCEPTION!= null) {
            throw CHANNELSERVICES_EXCEPTION;
        }
        return CHANNELSERVICES_WSDL_LOCATION;
    }

}
