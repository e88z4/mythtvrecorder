
package mythtvapi.dvr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRecRuleFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRecRuleFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecRuleFilter" type="{http://mythtv.org}RecRuleFilter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRecRuleFilter", propOrder = {
    "recRuleFilter"
})
public class ArrayOfRecRuleFilter {

    @XmlElement(name = "RecRuleFilter", nillable = true)
    protected List<RecRuleFilter> recRuleFilter;

    /**
     * Gets the value of the recRuleFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recRuleFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecRuleFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecRuleFilter }
     * 
     * 
     */
    public List<RecRuleFilter> getRecRuleFilter() {
        if (recRuleFilter == null) {
            recRuleFilter = new ArrayList<RecRuleFilter>();
        }
        return this.recRuleFilter;
    }

}
