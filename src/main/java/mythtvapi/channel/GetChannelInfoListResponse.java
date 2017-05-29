
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
 *         &lt;element name="GetChannelInfoListResult" type="{http://mythtv.org}ChannelInfoList" minOccurs="0"/>
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
    "getChannelInfoListResult"
})
@XmlRootElement(name = "GetChannelInfoListResponse")
public class GetChannelInfoListResponse {

    @XmlElementRef(name = "GetChannelInfoListResult", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<ChannelInfoList> getChannelInfoListResult;

    /**
     * Gets the value of the getChannelInfoListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChannelInfoList }{@code >}
     *     
     */
    public JAXBElement<ChannelInfoList> getGetChannelInfoListResult() {
        return getChannelInfoListResult;
    }

    /**
     * Sets the value of the getChannelInfoListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChannelInfoList }{@code >}
     *     
     */
    public void setGetChannelInfoListResult(JAXBElement<ChannelInfoList> value) {
        this.getChannelInfoListResult = value;
    }

}
