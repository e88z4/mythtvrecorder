
package mythtvapi.myth;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStorageGroupDir complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStorageGroupDir">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StorageGroupDir" type="{http://mythtv.org}StorageGroupDir" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStorageGroupDir", propOrder = {
    "storageGroupDir"
})
public class ArrayOfStorageGroupDir {

    @XmlElement(name = "StorageGroupDir", nillable = true)
    protected List<StorageGroupDir> storageGroupDir;

    /**
     * Gets the value of the storageGroupDir property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storageGroupDir property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStorageGroupDir().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StorageGroupDir }
     * 
     * 
     */
    public List<StorageGroupDir> getStorageGroupDir() {
        if (storageGroupDir == null) {
            storageGroupDir = new ArrayList<StorageGroupDir>();
        }
        return this.storageGroupDir;
    }

}
