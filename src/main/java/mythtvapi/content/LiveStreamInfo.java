
package mythtvapi.content;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LiveStreamInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LiveStreamInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Bitrate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AudioBitrate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SegmentSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxSegments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StartSegment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CurrentSegment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SegmentCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PercentComplete" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastModified" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RelativeURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusInt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StatusMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceHost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceWidth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SourceHeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AudioOnlyBitrate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiveStreamInfo", propOrder = {
    "id",
    "width",
    "height",
    "bitrate",
    "audioBitrate",
    "segmentSize",
    "maxSegments",
    "startSegment",
    "currentSegment",
    "segmentCount",
    "percentComplete",
    "created",
    "lastModified",
    "relativeURL",
    "fullURL",
    "statusStr",
    "statusInt",
    "statusMessage",
    "sourceFile",
    "sourceHost",
    "sourceWidth",
    "sourceHeight",
    "audioOnlyBitrate"
})
public class LiveStreamInfo {

    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElement(name = "Width")
    protected Integer width;
    @XmlElement(name = "Height")
    protected Integer height;
    @XmlElement(name = "Bitrate")
    protected Integer bitrate;
    @XmlElement(name = "AudioBitrate")
    protected Integer audioBitrate;
    @XmlElement(name = "SegmentSize")
    protected Integer segmentSize;
    @XmlElement(name = "MaxSegments")
    protected Integer maxSegments;
    @XmlElement(name = "StartSegment")
    protected Integer startSegment;
    @XmlElement(name = "CurrentSegment")
    protected Integer currentSegment;
    @XmlElement(name = "SegmentCount")
    protected Integer segmentCount;
    @XmlElement(name = "PercentComplete")
    protected Integer percentComplete;
    @XmlElementRef(name = "Created", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> created;
    @XmlElementRef(name = "LastModified", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastModified;
    @XmlElement(name = "RelativeURL")
    protected String relativeURL;
    @XmlElement(name = "FullURL")
    protected String fullURL;
    @XmlElement(name = "StatusStr")
    protected String statusStr;
    @XmlElement(name = "StatusInt")
    protected Integer statusInt;
    @XmlElement(name = "StatusMessage")
    protected String statusMessage;
    @XmlElement(name = "SourceFile")
    protected String sourceFile;
    @XmlElement(name = "SourceHost")
    protected String sourceHost;
    @XmlElement(name = "SourceWidth")
    protected Integer sourceWidth;
    @XmlElement(name = "SourceHeight")
    protected Integer sourceHeight;
    @XmlElement(name = "AudioOnlyBitrate")
    protected Integer audioOnlyBitrate;

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
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWidth(Integer value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeight(Integer value) {
        this.height = value;
    }

    /**
     * Gets the value of the bitrate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBitrate() {
        return bitrate;
    }

    /**
     * Sets the value of the bitrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBitrate(Integer value) {
        this.bitrate = value;
    }

    /**
     * Gets the value of the audioBitrate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAudioBitrate() {
        return audioBitrate;
    }

    /**
     * Sets the value of the audioBitrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAudioBitrate(Integer value) {
        this.audioBitrate = value;
    }

    /**
     * Gets the value of the segmentSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSegmentSize() {
        return segmentSize;
    }

    /**
     * Sets the value of the segmentSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSegmentSize(Integer value) {
        this.segmentSize = value;
    }

    /**
     * Gets the value of the maxSegments property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxSegments() {
        return maxSegments;
    }

    /**
     * Sets the value of the maxSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxSegments(Integer value) {
        this.maxSegments = value;
    }

    /**
     * Gets the value of the startSegment property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartSegment() {
        return startSegment;
    }

    /**
     * Sets the value of the startSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartSegment(Integer value) {
        this.startSegment = value;
    }

    /**
     * Gets the value of the currentSegment property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentSegment() {
        return currentSegment;
    }

    /**
     * Sets the value of the currentSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentSegment(Integer value) {
        this.currentSegment = value;
    }

    /**
     * Gets the value of the segmentCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSegmentCount() {
        return segmentCount;
    }

    /**
     * Sets the value of the segmentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSegmentCount(Integer value) {
        this.segmentCount = value;
    }

    /**
     * Gets the value of the percentComplete property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPercentComplete() {
        return percentComplete;
    }

    /**
     * Sets the value of the percentComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPercentComplete(Integer value) {
        this.percentComplete = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCreated(JAXBElement<XMLGregorianCalendar> value) {
        this.created = value;
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
     * Gets the value of the relativeURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelativeURL() {
        return relativeURL;
    }

    /**
     * Sets the value of the relativeURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelativeURL(String value) {
        this.relativeURL = value;
    }

    /**
     * Gets the value of the fullURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullURL() {
        return fullURL;
    }

    /**
     * Sets the value of the fullURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullURL(String value) {
        this.fullURL = value;
    }

    /**
     * Gets the value of the statusStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusStr() {
        return statusStr;
    }

    /**
     * Sets the value of the statusStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusStr(String value) {
        this.statusStr = value;
    }

    /**
     * Gets the value of the statusInt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatusInt() {
        return statusInt;
    }

    /**
     * Sets the value of the statusInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatusInt(Integer value) {
        this.statusInt = value;
    }

    /**
     * Gets the value of the statusMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * Sets the value of the statusMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusMessage(String value) {
        this.statusMessage = value;
    }

    /**
     * Gets the value of the sourceFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceFile() {
        return sourceFile;
    }

    /**
     * Sets the value of the sourceFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceFile(String value) {
        this.sourceFile = value;
    }

    /**
     * Gets the value of the sourceHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceHost() {
        return sourceHost;
    }

    /**
     * Sets the value of the sourceHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceHost(String value) {
        this.sourceHost = value;
    }

    /**
     * Gets the value of the sourceWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSourceWidth() {
        return sourceWidth;
    }

    /**
     * Sets the value of the sourceWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSourceWidth(Integer value) {
        this.sourceWidth = value;
    }

    /**
     * Gets the value of the sourceHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSourceHeight() {
        return sourceHeight;
    }

    /**
     * Sets the value of the sourceHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSourceHeight(Integer value) {
        this.sourceHeight = value;
    }

    /**
     * Gets the value of the audioOnlyBitrate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAudioOnlyBitrate() {
        return audioOnlyBitrate;
    }

    /**
     * Sets the value of the audioOnlyBitrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAudioOnlyBitrate(Integer value) {
        this.audioOnlyBitrate = value;
    }

}
