
package mythtvapi.guide;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Program complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Program">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CatType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Repeat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VideoProps" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AudioProps" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SubProps" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SeriesId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProgramId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Stars" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="LastModified" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ProgramFlags" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Airdate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Inetref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Season" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Episode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalEpisodes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FileSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Channel" type="{http://mythtv.org}ChannelInfo" minOccurs="0"/>
 *         &lt;element name="Recording" type="{http://mythtv.org}RecordingInfo" minOccurs="0"/>
 *         &lt;element name="Artwork" type="{http://mythtv.org}ArtworkInfoList" minOccurs="0"/>
 *         &lt;element name="Cast" type="{http://mythtv.org}CastMemberList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Program", propOrder = {
    "startTime",
    "endTime",
    "title",
    "subTitle",
    "category",
    "catType",
    "repeat",
    "videoProps",
    "audioProps",
    "subProps",
    "seriesId",
    "programId",
    "stars",
    "lastModified",
    "programFlags",
    "airdate",
    "description",
    "inetref",
    "season",
    "episode",
    "totalEpisodes",
    "fileSize",
    "fileName",
    "hostName",
    "channel",
    "recording",
    "artwork",
    "cast"
})
public class Program {

    @XmlElementRef(name = "StartTime", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startTime;
    @XmlElementRef(name = "EndTime", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> endTime;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "SubTitle")
    protected String subTitle;
    @XmlElement(name = "Category")
    protected String category;
    @XmlElement(name = "CatType")
    protected String catType;
    @XmlElement(name = "Repeat")
    protected Boolean repeat;
    @XmlElement(name = "VideoProps")
    protected Integer videoProps;
    @XmlElement(name = "AudioProps")
    protected Integer audioProps;
    @XmlElement(name = "SubProps")
    protected Integer subProps;
    @XmlElement(name = "SeriesId")
    protected String seriesId;
    @XmlElement(name = "ProgramId")
    protected String programId;
    @XmlElement(name = "Stars")
    protected Double stars;
    @XmlElementRef(name = "LastModified", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastModified;
    @XmlElement(name = "ProgramFlags")
    protected Integer programFlags;
    @XmlElementRef(name = "Airdate", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> airdate;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Inetref")
    protected String inetref;
    @XmlElement(name = "Season")
    protected Integer season;
    @XmlElement(name = "Episode")
    protected Integer episode;
    @XmlElement(name = "TotalEpisodes")
    protected Integer totalEpisodes;
    @XmlElement(name = "FileSize")
    protected Long fileSize;
    @XmlElement(name = "FileName")
    protected String fileName;
    @XmlElement(name = "HostName")
    protected String hostName;
    @XmlElementRef(name = "Channel", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<ChannelInfo> channel;
    @XmlElementRef(name = "Recording", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<RecordingInfo> recording;
    @XmlElementRef(name = "Artwork", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<ArtworkInfoList> artwork;
    @XmlElementRef(name = "Cast", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<CastMemberList> cast;

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
     * Gets the value of the catType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatType() {
        return catType;
    }

    /**
     * Sets the value of the catType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatType(String value) {
        this.catType = value;
    }

    /**
     * Gets the value of the repeat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRepeat() {
        return repeat;
    }

    /**
     * Sets the value of the repeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRepeat(Boolean value) {
        this.repeat = value;
    }

    /**
     * Gets the value of the videoProps property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVideoProps() {
        return videoProps;
    }

    /**
     * Sets the value of the videoProps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVideoProps(Integer value) {
        this.videoProps = value;
    }

    /**
     * Gets the value of the audioProps property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAudioProps() {
        return audioProps;
    }

    /**
     * Sets the value of the audioProps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAudioProps(Integer value) {
        this.audioProps = value;
    }

    /**
     * Gets the value of the subProps property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubProps() {
        return subProps;
    }

    /**
     * Sets the value of the subProps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubProps(Integer value) {
        this.subProps = value;
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
     * Gets the value of the stars property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStars() {
        return stars;
    }

    /**
     * Sets the value of the stars property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStars(Double value) {
        this.stars = value;
    }

    /**
     * Gets the value of the lastModified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastModified() {
        return lastModified;
    }

    /**
     * Sets the value of the lastModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastModified(JAXBElement<XMLGregorianCalendar> value) {
        this.lastModified = value;
    }

    /**
     * Gets the value of the programFlags property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProgramFlags() {
        return programFlags;
    }

    /**
     * Sets the value of the programFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProgramFlags(Integer value) {
        this.programFlags = value;
    }

    /**
     * Gets the value of the airdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAirdate() {
        return airdate;
    }

    /**
     * Sets the value of the airdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAirdate(JAXBElement<XMLGregorianCalendar> value) {
        this.airdate = value;
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
     * Gets the value of the season property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeason() {
        return season;
    }

    /**
     * Sets the value of the season property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeason(Integer value) {
        this.season = value;
    }

    /**
     * Gets the value of the episode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEpisode() {
        return episode;
    }

    /**
     * Sets the value of the episode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEpisode(Integer value) {
        this.episode = value;
    }

    /**
     * Gets the value of the totalEpisodes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalEpisodes() {
        return totalEpisodes;
    }

    /**
     * Sets the value of the totalEpisodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalEpisodes(Integer value) {
        this.totalEpisodes = value;
    }

    /**
     * Gets the value of the fileSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFileSize(Long value) {
        this.fileSize = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
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
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChannelInfo }{@code >}
     *     
     */
    public JAXBElement<ChannelInfo> getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChannelInfo }{@code >}
     *     
     */
    public void setChannel(JAXBElement<ChannelInfo> value) {
        this.channel = value;
    }

    /**
     * Gets the value of the recording property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RecordingInfo }{@code >}
     *     
     */
    public JAXBElement<RecordingInfo> getRecording() {
        return recording;
    }

    /**
     * Sets the value of the recording property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RecordingInfo }{@code >}
     *     
     */
    public void setRecording(JAXBElement<RecordingInfo> value) {
        this.recording = value;
    }

    /**
     * Gets the value of the artwork property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArtworkInfoList }{@code >}
     *     
     */
    public JAXBElement<ArtworkInfoList> getArtwork() {
        return artwork;
    }

    /**
     * Sets the value of the artwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArtworkInfoList }{@code >}
     *     
     */
    public void setArtwork(JAXBElement<ArtworkInfoList> value) {
        this.artwork = value;
    }

    /**
     * Gets the value of the cast property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CastMemberList }{@code >}
     *     
     */
    public JAXBElement<CastMemberList> getCast() {
        return cast;
    }

    /**
     * Sets the value of the cast property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CastMemberList }{@code >}
     *     
     */
    public void setCast(JAXBElement<CastMemberList> value) {
        this.cast = value;
    }

}
