
package mythtvapi.content;

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
 *         &lt;element name="GetLiveStreamResult" type="{http://mythtv.org}LiveStreamInfo" minOccurs="0"/>
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
    "getLiveStreamResult"
})
@XmlRootElement(name = "GetLiveStreamResponse")
public class GetLiveStreamResponse {

    @XmlElementRef(name = "GetLiveStreamResult", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<LiveStreamInfo> getLiveStreamResult;

    /**
     * Gets the value of the getLiveStreamResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LiveStreamInfo }{@code >}
     *     
     */
    public JAXBElement<LiveStreamInfo> getGetLiveStreamResult() {
        return getLiveStreamResult;
    }

    /**
     * Sets the value of the getLiveStreamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LiveStreamInfo }{@code >}
     *     
     */
    public void setGetLiveStreamResult(JAXBElement<LiveStreamInfo> value) {
        this.getLiveStreamResult = value;
    }

}
