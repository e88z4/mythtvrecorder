
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
 *         &lt;element name="UpdateRecordedWatchedStatusResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "updateRecordedWatchedStatusResult"
})
@XmlRootElement(name = "UpdateRecordedWatchedStatusResponse")
public class UpdateRecordedWatchedStatusResponse {

    @XmlElementRef(name = "UpdateRecordedWatchedStatusResult", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> updateRecordedWatchedStatusResult;

    /**
     * Gets the value of the updateRecordedWatchedStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUpdateRecordedWatchedStatusResult() {
        return updateRecordedWatchedStatusResult;
    }

    /**
     * Sets the value of the updateRecordedWatchedStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUpdateRecordedWatchedStatusResult(JAXBElement<Boolean> value) {
        this.updateRecordedWatchedStatusResult = value;
    }

}
