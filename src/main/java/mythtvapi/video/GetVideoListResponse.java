
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
 *         &lt;element name="GetVideoListResult" type="{http://mythtv.org}VideoMetadataInfoList" minOccurs="0"/>
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
    "getVideoListResult"
})
@XmlRootElement(name = "GetVideoListResponse")
public class GetVideoListResponse {

    @XmlElementRef(name = "GetVideoListResult", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<VideoMetadataInfoList> getVideoListResult;

    /**
     * Gets the value of the getVideoListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VideoMetadataInfoList }{@code >}
     *     
     */
    public JAXBElement<VideoMetadataInfoList> getGetVideoListResult() {
        return getVideoListResult;
    }

    /**
     * Sets the value of the getVideoListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VideoMetadataInfoList }{@code >}
     *     
     */
    public void setGetVideoListResult(JAXBElement<VideoMetadataInfoList> value) {
        this.getVideoListResult = value;
    }

}
