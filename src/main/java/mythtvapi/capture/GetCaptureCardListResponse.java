
package mythtvapi.capture;

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
 *         &lt;element name="GetCaptureCardListResult" type="{http://mythtv.org}CaptureCardList" minOccurs="0"/>
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
    "getCaptureCardListResult"
})
@XmlRootElement(name = "GetCaptureCardListResponse")
public class GetCaptureCardListResponse {

    @XmlElementRef(name = "GetCaptureCardListResult", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<CaptureCardList> getCaptureCardListResult;

    /**
     * Gets the value of the getCaptureCardListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CaptureCardList }{@code >}
     *     
     */
    public JAXBElement<CaptureCardList> getGetCaptureCardListResult() {
        return getCaptureCardListResult;
    }

    /**
     * Sets the value of the getCaptureCardListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CaptureCardList }{@code >}
     *     
     */
    public void setGetCaptureCardListResult(JAXBElement<CaptureCardList> value) {
        this.getCaptureCardListResult = value;
    }

}
