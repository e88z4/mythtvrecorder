
package mythtvapi.dvr;

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
 *         &lt;element name="SetSavedBookmarkResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "setSavedBookmarkResult"
})
@XmlRootElement(name = "SetSavedBookmarkResponse")
public class SetSavedBookmarkResponse {

    @XmlElementRef(name = "SetSavedBookmarkResult", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> setSavedBookmarkResult;

    /**
     * Gets the value of the setSavedBookmarkResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSetSavedBookmarkResult() {
        return setSavedBookmarkResult;
    }

    /**
     * Sets the value of the setSavedBookmarkResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSetSavedBookmarkResult(JAXBElement<Boolean> value) {
        this.setSavedBookmarkResult = value;
    }

}
