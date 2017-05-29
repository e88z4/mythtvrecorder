
package mythtvapi.myth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StorageGroupDir complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StorageGroupDir">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DirName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DirRead" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DirWrite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="KiBFree" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageGroupDir", propOrder = {
    "id",
    "groupName",
    "hostName",
    "dirName",
    "dirRead",
    "dirWrite",
    "kiBFree"
})
public class StorageGroupDir {

    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElement(name = "GroupName")
    protected String groupName;
    @XmlElement(name = "HostName")
    protected String hostName;
    @XmlElement(name = "DirName")
    protected String dirName;
    @XmlElement(name = "DirRead")
    protected Boolean dirRead;
    @XmlElement(name = "DirWrite")
    protected Boolean dirWrite;
    @XmlElement(name = "KiBFree")
    @XmlSchemaType(name = "unsignedInt")
    protected Long kiBFree;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the hostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * Sets the value of the hostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostName(String value) {
        this.hostName = value;
    }

    /**
     * Gets the value of the dirName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirName() {
        return dirName;
    }

    /**
     * Sets the value of the dirName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirName(String value) {
        this.dirName = value;
    }

    /**
     * Gets the value of the dirRead property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDirRead() {
        return dirRead;
    }

    /**
     * Sets the value of the dirRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirRead(Boolean value) {
        this.dirRead = value;
    }

    /**
     * Gets the value of the dirWrite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDirWrite() {
        return dirWrite;
    }

    /**
     * Sets the value of the dirWrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirWrite(Boolean value) {
        this.dirWrite = value;
    }

    /**
     * Gets the value of the kiBFree property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKiBFree() {
        return kiBFree;
    }

    /**
     * Sets the value of the kiBFree property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKiBFree(Long value) {
        this.kiBFree = value;
    }

}
