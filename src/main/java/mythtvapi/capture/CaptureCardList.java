
package mythtvapi.capture;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaptureCardList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaptureCardList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CaptureCards" type="{http://mythtv.org}ArrayOfCaptureCard" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaptureCardList", propOrder = {
    "captureCards"
})
public class CaptureCardList {

    @XmlElement(name = "CaptureCards")
    protected ArrayOfCaptureCard captureCards;

    /**
     * Gets the value of the captureCards property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCaptureCard }
     *     
     */
    public ArrayOfCaptureCard getCaptureCards() {
        return captureCards;
    }

    /**
     * Sets the value of the captureCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCaptureCard }
     *     
     */
    public void setCaptureCards(ArrayOfCaptureCard value) {
        this.captureCards = value;
    }

}
