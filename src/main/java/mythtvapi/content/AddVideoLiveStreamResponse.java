
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
 *         &lt;element name="AddVideoLiveStreamResult" type="{http://mythtv.org}LiveStreamInfo" minOccurs="0"/>
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
    "addVideoLiveStreamResult"
})
@XmlRootElement(name = "AddVideoLiveStreamResponse")
public class AddVideoLiveStreamResponse {

    @XmlElementRef(name = "AddVideoLiveStreamResult", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<LiveStreamInfo> addVideoLiveStreamResult;

    /**
     * Gets the value of the addVideoLiveStreamResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LiveStreamInfo }{@code >}
     *     
     */
    public JAXBElement<LiveStreamInfo> getAddVideoLiveStreamResult() {
        return addVideoLiveStreamResult;
    }

    /**
     * Sets the value of the addVideoLiveStreamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LiveStreamInfo }{@code >}
     *     
     */
    public void setAddVideoLiveStreamResult(JAXBElement<LiveStreamInfo> value) {
        this.addVideoLiveStreamResult = value;
    }

}
