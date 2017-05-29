
package mythtvapi.myth;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Version" type="{http://mythtv.org}VersionInfo" minOccurs="0"/>
 *         &lt;element name="Database" type="{http://mythtv.org}DatabaseInfo" minOccurs="0"/>
 *         &lt;element name="WOL" type="{http://mythtv.org}WOLInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionInfo", propOrder = {
    "version",
    "database",
    "wol"
})
public class ConnectionInfo {

    @XmlElementRef(name = "Version", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<VersionInfo> version;
    @XmlElementRef(name = "Database", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<DatabaseInfo> database;
    @XmlElementRef(name = "WOL", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<WOLInfo> wol;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VersionInfo }{@code >}
     *     
     */
    public JAXBElement<VersionInfo> getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VersionInfo }{@code >}
     *     
     */
    public void setVersion(JAXBElement<VersionInfo> value) {
        this.version = value;
    }

    /**
     * Gets the value of the database property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DatabaseInfo }{@code >}
     *     
     */
    public JAXBElement<DatabaseInfo> getDatabase() {
        return database;
    }

    /**
     * Sets the value of the database property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DatabaseInfo }{@code >}
     *     
     */
    public void setDatabase(JAXBElement<DatabaseInfo> value) {
        this.database = value;
    }

    /**
     * Gets the value of the wol property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WOLInfo }{@code >}
     *     
     */
    public JAXBElement<WOLInfo> getWOL() {
        return wol;
    }

    /**
     * Sets the value of the wol property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WOLInfo }{@code >}
     *     
     */
    public void setWOL(JAXBElement<WOLInfo> value) {
        this.wol = value;
    }

}
