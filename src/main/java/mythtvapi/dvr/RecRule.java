
package mythtvapi.dvr;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RecRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ParentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Season" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="Episode" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SeriesId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProgramId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Inetref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CallSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FindDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FindTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SearchType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecPriority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PreferredInput" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="StartOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EndOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DupMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DupIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Filter" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="RecProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StorageGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlayGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoExpire" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaxEpisodes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxNewest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AutoCommflag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AutoTranscode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AutoMetaLookup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AutoUserJob1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AutoUserJob2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AutoUserJob3" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AutoUserJob4" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Transcoder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NextRecording" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastRecorded" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastDeleted" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="AverageDelay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecRule", propOrder = {
    "id",
    "parentId",
    "inactive",
    "title",
    "subTitle",
    "description",
    "season",
    "episode",
    "category",
    "startTime",
    "endTime",
    "seriesId",
    "programId",
    "inetref",
    "chanId",
    "callSign",
    "findDay",
    "findTime",
    "type",
    "searchType",
    "recPriority",
    "preferredInput",
    "startOffset",
    "endOffset",
    "dupMethod",
    "dupIn",
    "filter",
    "recProfile",
    "recGroup",
    "storageGroup",
    "playGroup",
    "autoExpire",
    "maxEpisodes",
    "maxNewest",
    "autoCommflag",
    "autoTranscode",
    "autoMetaLookup",
    "autoUserJob1",
    "autoUserJob2",
    "autoUserJob3",
    "autoUserJob4",
    "transcoder",
    "nextRecording",
    "lastRecorded",
    "lastDeleted",
    "averageDelay"
})
public class RecRule {

    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElement(name = "ParentId")
    protected Integer parentId;
    @XmlElement(name = "Inactive")
    protected Boolean inactive;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "SubTitle")
    protected String subTitle;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Season")
    @XmlSchemaType(name = "unsignedInt")
    protected Long season;
    @XmlElement(name = "Episode")
    @XmlSchemaType(name = "unsignedInt")
    protected Long episode;
    @XmlElement(name = "Category")
    protected String category;
    @XmlElementRef(name = "StartTime", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startTime;
    @XmlElementRef(name = "EndTime", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> endTime;
    @XmlElement(name = "SeriesId")
    protected String seriesId;
    @XmlElement(name = "ProgramId")
    protected String programId;
    @XmlElement(name = "Inetref")
    protected String inetref;
    @XmlElement(name = "ChanId")
    protected Integer chanId;
    @XmlElement(name = "CallSign")
    protected String callSign;
    @XmlElement(name = "FindDay")
    protected Integer findDay;
    @XmlElementRef(name = "FindTime", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> findTime;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "SearchType")
    protected String searchType;
    @XmlElement(name = "RecPriority")
    protected Integer recPriority;
    @XmlElement(name = "PreferredInput")
    @XmlSchemaType(name = "unsignedInt")
    protected Long preferredInput;
    @XmlElement(name = "StartOffset")
    protected Integer startOffset;
    @XmlElement(name = "EndOffset")
    protected Integer endOffset;
    @XmlElement(name = "DupMethod")
    protected String dupMethod;
    @XmlElement(name = "DupIn")
    protected String dupIn;
    @XmlElement(name = "Filter")
    @XmlSchemaType(name = "unsignedInt")
    protected Long filter;
    @XmlElement(name = "RecProfile")
    protected String recProfile;
    @XmlElement(name = "RecGroup")
    protected String recGroup;
    @XmlElement(name = "StorageGroup")
    protected String storageGroup;
    @XmlElement(name = "PlayGroup")
    protected String playGroup;
    @XmlElement(name = "AutoExpire")
    protected Boolean autoExpire;
    @XmlElement(name = "MaxEpisodes")
    protected Integer maxEpisodes;
    @XmlElement(name = "MaxNewest")
    protected Boolean maxNewest;
    @XmlElement(name = "AutoCommflag")
    protected Boolean autoCommflag;
    @XmlElement(name = "AutoTranscode")
    protected Boolean autoTranscode;
    @XmlElement(name = "AutoMetaLookup")
    protected Boolean autoMetaLookup;
    @XmlElement(name = "AutoUserJob1")
    protected Boolean autoUserJob1;
    @XmlElement(name = "AutoUserJob2")
    protected Boolean autoUserJob2;
    @XmlElement(name = "AutoUserJob3")
    protected Boolean autoUserJob3;
    @XmlElement(name = "AutoUserJob4")
    protected Boolean autoUserJob4;
    @XmlElement(name = "Transcoder")
    protected Integer transcoder;
    @XmlElementRef(name = "NextRecording", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> nextRecording;
    @XmlElementRef(name = "LastRecorded", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastRecorded;
    @XmlElementRef(name = "LastDeleted", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastDeleted;
    @XmlElement(name = "AverageDelay")
    protected Integer averageDelay;

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
     * Gets the value of the parentId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParentId(Integer value) {
        this.parentId = value;
    }

    /**
     * Gets the value of the inactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInactive() {
        return inactive;
    }

    /**
     * Sets the value of the inactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInactive(Boolean value) {
        this.inactive = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the subTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * Sets the value of the subTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTitle(String value) {
        this.subTitle = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the season property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeason() {
        return season;
    }

    /**
     * Sets the value of the season property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeason(Long value) {
        this.season = value;
    }

    /**
     * Gets the value of the episode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEpisode() {
        return episode;
    }

    /**
     * Sets the value of the episode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEpisode(Long value) {
        this.episode = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartTime(JAXBElement<XMLGregorianCalendar> value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndTime(JAXBElement<XMLGregorianCalendar> value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the seriesId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesId() {
        return seriesId;
    }

    /**
     * Sets the value of the seriesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesId(String value) {
        this.seriesId = value;
    }

    /**
     * Gets the value of the programId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramId() {
        return programId;
    }

    /**
     * Sets the value of the programId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramId(String value) {
        this.programId = value;
    }

    /**
     * Gets the value of the inetref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInetref() {
        return inetref;
    }

    /**
     * Sets the value of the inetref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInetref(String value) {
        this.inetref = value;
    }

    /**
     * Gets the value of the chanId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChanId() {
        return chanId;
    }

    /**
     * Sets the value of the chanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChanId(Integer value) {
        this.chanId = value;
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
     * Gets the value of the findDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFindDay() {
        return findDay;
    }

    /**
     * Sets the value of the findDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFindDay(Integer value) {
        this.findDay = value;
    }

    /**
     * Gets the value of the findTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFindTime() {
        return findTime;
    }

    /**
     * Sets the value of the findTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFindTime(JAXBElement<XMLGregorianCalendar> value) {
        this.findTime = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the searchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchType() {
        return searchType;
    }

    /**
     * Sets the value of the searchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchType(String value) {
        this.searchType = value;
    }

    /**
     * Gets the value of the recPriority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecPriority() {
        return recPriority;
    }

    /**
     * Sets the value of the recPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecPriority(Integer value) {
        this.recPriority = value;
    }

    /**
     * Gets the value of the preferredInput property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPreferredInput() {
        return preferredInput;
    }

    /**
     * Sets the value of the preferredInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPreferredInput(Long value) {
        this.preferredInput = value;
    }

    /**
     * Gets the value of the startOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartOffset() {
        return startOffset;
    }

    /**
     * Sets the value of the startOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartOffset(Integer value) {
        this.startOffset = value;
    }

    /**
     * Gets the value of the endOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEndOffset() {
        return endOffset;
    }

    /**
     * Sets the value of the endOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEndOffset(Integer value) {
        this.endOffset = value;
    }

    /**
     * Gets the value of the dupMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDupMethod() {
        return dupMethod;
    }

    /**
     * Sets the value of the dupMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDupMethod(String value) {
        this.dupMethod = value;
    }

    /**
     * Gets the value of the dupIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDupIn() {
        return dupIn;
    }

    /**
     * Sets the value of the dupIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDupIn(String value) {
        this.dupIn = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFilter(Long value) {
        this.filter = value;
    }

    /**
     * Gets the value of the recProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecProfile() {
        return recProfile;
    }

    /**
     * Sets the value of the recProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecProfile(String value) {
        this.recProfile = value;
    }

    /**
     * Gets the value of the recGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecGroup() {
        return recGroup;
    }

    /**
     * Sets the value of the recGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecGroup(String value) {
        this.recGroup = value;
    }

    /**
     * Gets the value of the storageGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageGroup() {
        return storageGroup;
    }

    /**
     * Sets the value of the storageGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageGroup(String value) {
        this.storageGroup = value;
    }

    /**
     * Gets the value of the playGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlayGroup() {
        return playGroup;
    }

    /**
     * Sets the value of the playGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlayGroup(String value) {
        this.playGroup = value;
    }

    /**
     * Gets the value of the autoExpire property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoExpire() {
        return autoExpire;
    }

    /**
     * Sets the value of the autoExpire property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoExpire(Boolean value) {
        this.autoExpire = value;
    }

    /**
     * Gets the value of the maxEpisodes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxEpisodes() {
        return maxEpisodes;
    }

    /**
     * Sets the value of the maxEpisodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxEpisodes(Integer value) {
        this.maxEpisodes = value;
    }

    /**
     * Gets the value of the maxNewest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaxNewest() {
        return maxNewest;
    }

    /**
     * Sets the value of the maxNewest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaxNewest(Boolean value) {
        this.maxNewest = value;
    }

    /**
     * Gets the value of the autoCommflag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoCommflag() {
        return autoCommflag;
    }

    /**
     * Sets the value of the autoCommflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoCommflag(Boolean value) {
        this.autoCommflag = value;
    }

    /**
     * Gets the value of the autoTranscode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoTranscode() {
        return autoTranscode;
    }

    /**
     * Sets the value of the autoTranscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoTranscode(Boolean value) {
        this.autoTranscode = value;
    }

    /**
     * Gets the value of the autoMetaLookup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoMetaLookup() {
        return autoMetaLookup;
    }

    /**
     * Sets the value of the autoMetaLookup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoMetaLookup(Boolean value) {
        this.autoMetaLookup = value;
    }

    /**
     * Gets the value of the autoUserJob1 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoUserJob1() {
        return autoUserJob1;
    }

    /**
     * Sets the value of the autoUserJob1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoUserJob1(Boolean value) {
        this.autoUserJob1 = value;
    }

    /**
     * Gets the value of the autoUserJob2 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoUserJob2() {
        return autoUserJob2;
    }

    /**
     * Sets the value of the autoUserJob2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoUserJob2(Boolean value) {
        this.autoUserJob2 = value;
    }

    /**
     * Gets the value of the autoUserJob3 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoUserJob3() {
        return autoUserJob3;
    }

    /**
     * Sets the value of the autoUserJob3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoUserJob3(Boolean value) {
        this.autoUserJob3 = value;
    }

    /**
     * Gets the value of the autoUserJob4 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoUserJob4() {
        return autoUserJob4;
    }

    /**
     * Sets the value of the autoUserJob4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoUserJob4(Boolean value) {
        this.autoUserJob4 = value;
    }

    /**
     * Gets the value of the transcoder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTranscoder() {
        return transcoder;
    }

    /**
     * Sets the value of the transcoder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTranscoder(Integer value) {
        this.transcoder = value;
    }

    /**
     * Gets the value of the nextRecording property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getNextRecording() {
        return nextRecording;
    }

    /**
     * Sets the value of the nextRecording property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setNextRecording(JAXBElement<XMLGregorianCalendar> value) {
        this.nextRecording = value;
    }

    /**
     * Gets the value of the lastRecorded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastRecorded() {
        return lastRecorded;
    }

    /**
     * Sets the value of the lastRecorded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastRecorded(JAXBElement<XMLGregorianCalendar> value) {
        this.lastRecorded = value;
    }

    /**
     * Gets the value of the lastDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastDeleted() {
        return lastDeleted;
    }

    /**
     * Sets the value of the lastDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastDeleted(JAXBElement<XMLGregorianCalendar> value) {
        this.lastDeleted = value;
    }

    /**
     * Gets the value of the averageDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAverageDelay() {
        return averageDelay;
    }

    /**
     * Sets the value of the averageDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAverageDelay(Integer value) {
        this.averageDelay = value;
    }

}
