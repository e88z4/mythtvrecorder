
package mythtvapi.capture;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCaptureCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCaptureCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CaptureCard" type="{http://mythtv.org}CaptureCard" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCaptureCard", propOrder = {
    "captureCard"
})
public class ArrayOfCaptureCard {

    @XmlElement(name = "CaptureCard", nillable = true)
    protected List<CaptureCard> captureCard;

    /**
     * Gets the value of the captureCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the captureCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCaptureCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CaptureCard }
     * 
     * 
     */
    public List<CaptureCard> getCaptureCard() {
        if (captureCard == null) {
            captureCard = new ArrayList<CaptureCard>();
        }
        return this.captureCard;
    }

}
