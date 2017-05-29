
package mythtvapi.myth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StorageGroupDirList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StorageGroupDirList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StorageGroupDirs" type="{http://mythtv.org}ArrayOfStorageGroupDir" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageGroupDirList", propOrder = {
    "storageGroupDirs"
})
public class StorageGroupDirList {

    @XmlElement(name = "StorageGroupDirs")
    protected ArrayOfStorageGroupDir storageGroupDirs;

    /**
     * Gets the value of the storageGroupDirs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStorageGroupDir }
     *     
     */
    public ArrayOfStorageGroupDir getStorageGroupDirs() {
        return storageGroupDirs;
    }

    /**
     * Sets the value of the storageGroupDirs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStorageGroupDir }
     *     
     */
    public void setStorageGroupDirs(ArrayOfStorageGroupDir value) {
        this.storageGroupDirs = value;
    }

}
