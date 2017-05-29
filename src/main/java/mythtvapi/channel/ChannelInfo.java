
package mythtvapi.channel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChannelInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChannelInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChanId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="ChanNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IconURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChannelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MplexId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="ATSCMajorChan" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="ATSCMinorChan" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="Format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FrequencyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FineTune" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ChanFilters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InputId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CommFree" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UseEIT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Visible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="XMLTVID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultAuth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Programs" type="{http://mythtv.org}ArrayOfProgram" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelInfo", propOrder = {
    "chanId",
    "chanNum",
    "callSign",
    "iconURL",
    "channelName",
    "mplexId",
    "serviceId",
    "atscMajorChan",
    "atscMinorChan",
    "format",
    "frequencyId",
    "fineTune",
    "chanFilters",
    "sourceId",
    "inputId",
    "commFree",
    "useEIT",
    "visible",
    "xmltvid",
    "defaultAuth",
    "programs"
})
public class ChannelInfo {

    @XmlElement(name = "ChanId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long chanId;
    @XmlElement(name = "ChanNum")
    protected String chanNum;
    @XmlElement(name = "CallSign")
    protected String callSign;
    @XmlElement(name = "IconURL")
    protected String iconURL;
    @XmlElement(name = "ChannelName")
    protected String channelName;
    @XmlElement(name = "MplexId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long mplexId;
    @XmlElement(name = "ServiceId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long serviceId;
    @XmlElement(name = "ATSCMajorChan")
    @XmlSchemaType(name = "unsignedInt")
    protected Long atscMajorChan;
    @XmlElement(name = "ATSCMinorChan")
    @XmlSchemaType(name = "unsignedInt")
    protected Long atscMinorChan;
    @XmlElement(name = "Format")
    protected String format;
    @XmlElement(name = "FrequencyId")
    protected String frequencyId;
    @XmlElement(name = "FineTune")
    protected Integer fineTune;
    @XmlElement(name = "ChanFilters")
    protected String chanFilters;
    @XmlElement(name = "SourceId")
    protected Integer sourceId;
    @XmlElement(name = "InputId")
    protected Integer inputId;
    @XmlElement(name = "CommFree")
    protected Boolean commFree;
    @XmlElement(name = "UseEIT")
    protected Boolean useEIT;
    @XmlElement(name = "Visible")
    protected Boolean visible;
    @XmlElement(name = "XMLTVID")
    protected String xmltvid;
    @XmlElement(name = "DefaultAuth")
    protected String defaultAuth;
    @XmlElement(name = "Programs")
    protected ArrayOfProgram programs;

    /**
     * Gets the value of the chanId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getChanId() {
        return chanId;
    }

    /**
     * Sets the value of the chanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setChanId(Long value) {
        this.chanId = value;
    }

    /**
     * Gets the value of the chanNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChanNum() {
        return chanNum;
    }

    /**
     * Sets the value of the chanNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChanNum(String value) {
        this.chanNum = value;
    }

    /**
     * Gets the value of the callSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallSign() {
        return callSign;
    }

    /**
     * Sets the value of the callSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallSign(String value) {
        this.callSign = value;
    }

    /**
     * Gets the value of the iconURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconURL() {
        return iconURL;
    }

    /**
     * Sets the value of the iconURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconURL(String value) {
        this.iconURL = value;
    }

    /**
     * Gets the value of the channelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * Sets the value of the channelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelName(String value) {
        this.channelName = value;
    }

    /**
     * Gets the value of the mplexId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMplexId() {
        return mplexId;
    }

    /**
     * Sets the value of the mplexId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMplexId(Long value) {
        this.mplexId = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServiceId(Long value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the atscMajorChan property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getATSCMajorChan() {
        return atscMajorChan;
    }

    /**
     * Sets the value of the atscMajorChan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setATSCMajorChan(Long value) {
        this.atscMajorChan = value;
    }

    /**
     * Gets the value of the atscMinorChan property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getATSCMinorChan() {
        return atscMinorChan;
    }

    /**
     * Sets the value of the atscMinorChan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setATSCMinorChan(Long value) {
        this.atscMinorChan = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the frequencyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequencyId() {
        return frequencyId;
    }

    /**
     * Sets the value of the frequencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequencyId(String value) {
        this.frequencyId = value;
    }

    /**
     * Gets the value of the fineTune property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFineTune() {
        return fineTune;
    }

    /**
     * Sets the value of the fineTune property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFineTune(Integer value) {
        this.fineTune = value;
    }

    /**
     * Gets the value of the chanFilters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChanFilters() {
        return chanFilters;
    }

    /**
     * Sets the value of the chanFilters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChanFilters(String value) {
        this.chanFilters = value;
    }

    /**
     * Gets the value of the sourceId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSourceId(Integer value) {
        this.sourceId = value;
    }

    /**
     * Gets the value of the inputId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInputId() {
        return inputId;
    }

    /**
     * Sets the value of the inputId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInputId(Integer value) {
        this.inputId = value;
    }

    /**
     * Gets the value of the commFree property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommFree() {
        return commFree;
    }

    /**
     * Sets the value of the commFree property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommFree(Boolean value) {
        this.commFree = value;
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
     * Gets the value of the visible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisible(Boolean value) {
        this.visible = value;
    }

    /**
     * Gets the value of the xmltvid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLTVID() {
        return xmltvid;
    }

    /**
     * Sets the value of the xmltvid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLTVID(String value) {
        this.xmltvid = value;
    }

    /**
     * Gets the value of the defaultAuth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultAuth() {
        return defaultAuth;
    }

    /**
     * Sets the value of the defaultAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultAuth(String value) {
        this.defaultAuth = value;
    }

    /**
     * Gets the value of the programs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProgram }
     *     
     */
    public ArrayOfProgram getPrograms() {
        return programs;
    }

    /**
     * Sets the value of the programs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProgram }
     *     
     */
    public void setPrograms(ArrayOfProgram value) {
        this.programs = value;
    }

}
