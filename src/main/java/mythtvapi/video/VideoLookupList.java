
package mythtvapi.video;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VideoLookupList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoLookupList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AsOf" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProtoVer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VideoLookups" type="{http://mythtv.org}ArrayOfVideoLookup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoLookupList", propOrder = {
    "count",
    "asOf",
    "version",
    "protoVer",
    "videoLookups"
})
public class VideoLookupList {

    @XmlElement(name = "Count")
    protected Integer count;
    @XmlElementRef(name = "AsOf", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> asOf;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "ProtoVer")
    protected String protoVer;
    @XmlElement(name = "VideoLookups")
    protected ArrayOfVideoLookup videoLookups;

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCount(Integer value) {
        this.count = value;
    }

    /**
     * Gets the value of the asOf property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAsOf() {
        return asOf;
    }

    /**
     * Sets the value of the asOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAsOf(JAXBElement<XMLGregorianCalendar> value) {
        this.asOf = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the protoVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtoVer() {
        return protoVer;
    }

    /**
     * Sets the value of the protoVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtoVer(String value) {
        this.protoVer = value;
    }

    /**
     * Gets the value of the videoLookups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVideoLookup }
     *     
     */
    public ArrayOfVideoLookup getVideoLookups() {
        return videoLookups;
    }

    /**
     * Sets the value of the videoLookups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVideoLookup }
     *     
     */
    public void setVideoLookups(ArrayOfVideoLookup value) {
        this.videoLookups = value;
    }

}
