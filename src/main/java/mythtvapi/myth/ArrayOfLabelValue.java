
package mythtvapi.myth;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLabelValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLabelValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LabelValue" type="{http://mythtv.org}LabelValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLabelValue", propOrder = {
    "labelValue"
})
public class ArrayOfLabelValue {

    @XmlElement(name = "LabelValue", nillable = true)
    protected List<LabelValue> labelValue;

    /**
     * Gets the value of the labelValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labelValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabelValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabelValue }
     * 
     * 
     */
    public List<LabelValue> getLabelValue() {
        if (labelValue == null) {
            labelValue = new ArrayList<LabelValue>();
        }
        return this.labelValue;
    }

}
