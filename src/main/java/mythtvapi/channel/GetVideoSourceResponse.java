
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
 *         &lt;element name="GetVideoSourceResult" type="{http://mythtv.org}VideoSource" minOccurs="0"/>
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
    "getVideoSourceResult"
})
@XmlRootElement(name = "GetVideoSourceResponse")
public class GetVideoSourceResponse {

    @XmlElementRef(name = "GetVideoSourceResult", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<VideoSource> getVideoSourceResult;

    /**
     * Gets the value of the getVideoSourceResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VideoSource }{@code >}
     *     
     */
    public JAXBElement<VideoSource> getGetVideoSourceResult() {
        return getVideoSourceResult;
    }

    /**
     * Sets the value of the getVideoSourceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VideoSource }{@code >}
     *     
     */
    public void setGetVideoSourceResult(JAXBElement<VideoSource> value) {
        this.getVideoSourceResult = value;
    }

}
