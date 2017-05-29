
package mythtvapi.dvr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CutList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CutList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cuttings" type="{http://mythtv.org}ArrayOfCutting" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CutList", propOrder = {
    "cuttings"
})
public class CutList {

    @XmlElement(name = "Cuttings")
    protected ArrayOfCutting cuttings;

    /**
     * Gets the value of the cuttings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCutting }
     *     
     */
    public ArrayOfCutting getCuttings() {
        return cuttings;
    }

    /**
     * Sets the value of the cuttings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCutting }
     *     
     */
    public void setCuttings(ArrayOfCutting value) {
        this.cuttings = value;
    }

}
