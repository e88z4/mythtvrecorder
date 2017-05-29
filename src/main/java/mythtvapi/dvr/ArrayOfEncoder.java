
package mythtvapi.dvr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEncoder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEncoder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Encoder" type="{http://mythtv.org}Encoder" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEncoder", propOrder = {
    "encoder"
})
public class ArrayOfEncoder {

    @XmlElement(name = "Encoder", nillable = true)
    protected List<Encoder> encoder;

    /**
     * Gets the value of the encoder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encoder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEncoder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Encoder }
     * 
     * 
     */
    public List<Encoder> getEncoder() {
        if (encoder == null) {
            encoder = new ArrayList<Encoder>();
        }
        return this.encoder;
    }

}
