
package mythtvapi.guide;

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
 *         &lt;element name="GetChannelGroupListResult" type="{http://mythtv.org}ChannelGroupList" minOccurs="0"/>
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
    "getChannelGroupListResult"
})
@XmlRootElement(name = "GetChannelGroupListResponse")
public class GetChannelGroupListResponse {

    @XmlElementRef(name = "GetChannelGroupListResult", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<ChannelGroupList> getChannelGroupListResult;

    /**
     * Gets the value of the getChannelGroupListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChannelGroupList }{@code >}
     *     
     */
    public JAXBElement<ChannelGroupList> getGetChannelGroupListResult() {
        return getChannelGroupListResult;
    }

    /**
     * Sets the value of the getChannelGroupListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChannelGroupList }{@code >}
     *     
     */
    public void setGetChannelGroupListResult(JAXBElement<ChannelGroupList> value) {
        this.getChannelGroupListResult = value;
    }

}
