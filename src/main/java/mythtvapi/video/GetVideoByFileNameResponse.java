
package mythtvapi.video;

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
 *         &lt;element name="GetVideoByFileNameResult" type="{http://mythtv.org}VideoMetadataInfo" minOccurs="0"/>
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
    "getVideoByFileNameResult"
})
@XmlRootElement(name = "GetVideoByFileNameResponse")
public class GetVideoByFileNameResponse {

    @XmlElementRef(name = "GetVideoByFileNameResult", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<VideoMetadataInfo> getVideoByFileNameResult;

    /**
     * Gets the value of the getVideoByFileNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VideoMetadataInfo }{@code >}
     *     
     */
    public JAXBElement<VideoMetadataInfo> getGetVideoByFileNameResult() {
        return getVideoByFileNameResult;
    }

    /**
     * Sets the value of the getVideoByFileNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VideoMetadataInfo }{@code >}
     *     
     */
    public void setGetVideoByFileNameResult(JAXBElement<VideoMetadataInfo> value) {
        this.getVideoByFileNameResult = value;
    }

}
