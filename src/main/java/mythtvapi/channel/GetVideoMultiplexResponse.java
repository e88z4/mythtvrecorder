
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
 *         &lt;element name="GetVideoMultiplexResult" type="{http://mythtv.org}VideoMultiplex" minOccurs="0"/>
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
    "getVideoMultiplexResult"
})
@XmlRootElement(name = "GetVideoMultiplexResponse")
public class GetVideoMultiplexResponse {

    @XmlElementRef(name = "GetVideoMultiplexResult", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<VideoMultiplex> getVideoMultiplexResult;

    /**
     * Gets the value of the getVideoMultiplexResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VideoMultiplex }{@code >}
     *     
     */
    public JAXBElement<VideoMultiplex> getGetVideoMultiplexResult() {
        return getVideoMultiplexResult;
    }

    /**
     * Sets the value of the getVideoMultiplexResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VideoMultiplex }{@code >}
     *     
     */
    public void setGetVideoMultiplexResult(JAXBElement<VideoMultiplex> value) {
        this.getVideoMultiplexResult = value;
    }

}
