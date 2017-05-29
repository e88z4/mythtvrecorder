
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
 *         &lt;element name="GetVideoMultiplexListResult" type="{http://mythtv.org}VideoMultiplexList" minOccurs="0"/>
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
    "getVideoMultiplexListResult"
})
@XmlRootElement(name = "GetVideoMultiplexListResponse")
public class GetVideoMultiplexListResponse {

    @XmlElementRef(name = "GetVideoMultiplexListResult", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<VideoMultiplexList> getVideoMultiplexListResult;

    /**
     * Gets the value of the getVideoMultiplexListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VideoMultiplexList }{@code >}
     *     
     */
    public JAXBElement<VideoMultiplexList> getGetVideoMultiplexListResult() {
        return getVideoMultiplexListResult;
    }

    /**
     * Sets the value of the getVideoMultiplexListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VideoMultiplexList }{@code >}
     *     
     */
    public void setGetVideoMultiplexListResult(JAXBElement<VideoMultiplexList> value) {
        this.getVideoMultiplexListResult = value;
    }

}
