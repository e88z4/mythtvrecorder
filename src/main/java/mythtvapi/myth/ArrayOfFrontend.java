
package mythtvapi.myth;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFrontend complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFrontend">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Frontend" type="{http://mythtv.org}Frontend" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFrontend", propOrder = {
    "frontend"
})
public class ArrayOfFrontend {

    @XmlElement(name = "Frontend", nillable = true)
    protected List<Frontend> frontend;

    /**
     * Gets the value of the frontend property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frontend property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrontend().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Frontend }
     * 
     * 
     */
    public List<Frontend> getFrontend() {
        if (frontend == null) {
            frontend = new ArrayList<Frontend>();
        }
        return this.frontend;
    }

}
