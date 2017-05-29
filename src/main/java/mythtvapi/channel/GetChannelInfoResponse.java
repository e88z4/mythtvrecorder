
package mythtvapi.channel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetChannelInfoResult" type="{http://mythtv.org}ChannelInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getChannelInfoResult"
})
@XmlRootElement(name = "GetChannelInfoResponse")
public class GetChannelInfoResponse {

    @XmlElementRef(name = "GetChannelInfoResult", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<ChannelInfo> getChannelInfoResult;

    /**
     * Gets the value of the getChannelInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChannelInfo }{@code >}
     *     
     */
    public JAXBElement<ChannelInfo> getGetChannelInfoResult() {
        return getChannelInfoResult;
    }

    /**
     * Sets the value of the getChannelInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChannelInfo }{@code >}
     *     
     */
    public void setGetChannelInfoResult(JAXBElement<ChannelInfo> value) {
        this.getChannelInfoResult = value;
    }

}
