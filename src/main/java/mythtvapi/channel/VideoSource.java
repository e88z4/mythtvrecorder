
package mythtvapi.channel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoSource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SourceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Grabber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FreqTable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UseEIT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConfigPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NITId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoSource", propOrder = {
    "id",
    "sourceName",
    "grabber",
    "userId",
    "freqTable",
    "lineupId",
    "password",
    "useEIT",
    "configPath",
    "nitId"
})
public class VideoSource {

    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElement(name = "SourceName")
    protected String sourceName;
    @XmlElement(name = "Grabber")
    protected String grabber;
    @XmlElement(name = "UserId")
    protected String userId;
    @XmlElement(name = "FreqTable")
    protected String freqTable;
    @XmlElement(name = "LineupId")
    protected String lineupId;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "UseEIT")
    protected Boolean useEIT;
    @XmlElement(name = "ConfigPath")
    protected String configPath;
    @XmlElement(name = "NITId")
    protected Integer nitId;

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
     * Gets the value of the sourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
     * Sets the value of the sourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceName(String value) {
        this.sourceName = value;
    }

    /**
     * Gets the value of the grabber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrabber() {
        return grabber;
    }

    /**
     * Sets the value of the grabber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrabber(String value) {
        this.grabber = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the freqTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreqTable() {
        return freqTable;
    }

    /**
     * Sets the value of the freqTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreqTable(String value) {
        this.freqTable = value;
    }

    /**
     * Gets the value of the lineupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineupId() {
        return lineupId;
    }

    /**
     * Sets the value of the lineupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineupId(String value) {
        this.lineupId = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the useEIT property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseEIT() {
        return useEIT;
    }

    /**
     * Sets the value of the useEIT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseEIT(Boolean value) {
        this.useEIT = value;
    }

    /**
     * Gets the value of the configPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigPath() {
        return configPath;
    }

    /**
     * Sets the value of the configPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigPath(String value) {
        this.configPath = value;
    }

    /**
     * Gets the value of the nitId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNITId() {
        return nitId;
    }

    /**
     * Sets the value of the nitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNITId(Integer value) {
        this.nitId = value;
    }

}
