
package mythtvapi.channel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MplexID" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="SourceID" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="ChannelID" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="CallSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChannelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChannelNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceID" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="ATSCMajorChannel" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="ATSCMinorChannel" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="UseEIT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Visible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FrequencyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Icon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XMLTVID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mplexID",
    "sourceID",
    "channelID",
    "callSign",
    "channelName",
    "channelNumber",
    "serviceID",
    "atscMajorChannel",
    "atscMinorChannel",
    "useEIT",
    "visible",
    "frequencyID",
    "icon",
    "format",
    "xmltvid",
    "defaultAuthority"
})
@XmlRootElement(name = "UpdateDBChannel")
public class UpdateDBChannel {

    @XmlElementRef(name = "MplexID", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> mplexID;
    @XmlElementRef(name = "SourceID", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> sourceID;
    @XmlElementRef(name = "ChannelID", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> channelID;
    @XmlElementRef(name = "CallSign", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> callSign;
    @XmlElementRef(name = "ChannelName", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> channelName;
    @XmlElementRef(name = "ChannelNumber", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> channelNumber;
    @XmlElementRef(name = "ServiceID", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> serviceID;
    @XmlElementRef(name = "ATSCMajorChannel", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> atscMajorChannel;
    @XmlElementRef(name = "ATSCMinorChannel", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> atscMinorChannel;
    @XmlElementRef(name = "UseEIT", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> useEIT;
    @XmlElementRef(name = "Visible", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> visible;
    @XmlElementRef(name = "FrequencyID", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> frequencyID;
    @XmlElementRef(name = "Icon", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> icon;
    @XmlElementRef(name = "Format", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> format;
    @XmlElementRef(name = "XMLTVID", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xmltvid;
    @XmlElementRef(name = "DefaultAuthority", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> defaultAuthority;

    /**
     * Gets the value of the mplexID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getMplexID() {
        return mplexID;
    }

    /**
     * Sets the value of the mplexID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setMplexID(JAXBElement<Long> value) {
        this.mplexID = value;
    }

    /**
     * Gets the value of the sourceID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSourceID() {
        return sourceID;
    }

    /**
     * Sets the value of the sourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSourceID(JAXBElement<Long> value) {
        this.sourceID = value;
    }

    /**
     * Gets the value of the channelID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getChannelID() {
        return channelID;
    }

    /**
     * Sets the value of the channelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setChannelID(JAXBElement<Long> value) {
        this.channelID = value;
    }

    /**
     * Gets the value of the callSign property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallSign() {
        return callSign;
    }

    /**
     * Sets the value of the callSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallSign(JAXBElement<String> value) {
        this.callSign = value;
    }

    /**
     * Gets the value of the channelName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChannelName() {
        return channelName;
    }

    /**
     * Sets the value of the channelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChannelName(JAXBElement<String> value) {
        this.channelName = value;
    }

    /**
     * Gets the value of the channelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChannelNumber() {
        return channelNumber;
    }

    /**
     * Sets the value of the channelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChannelNumber(JAXBElement<String> value) {
        this.channelNumber = value;
    }

    /**
     * Gets the value of the serviceID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getServiceID() {
        return serviceID;
    }

    /**
     * Sets the value of the serviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setServiceID(JAXBElement<Long> value) {
        this.serviceID = value;
    }

    /**
     * Gets the value of the atscMajorChannel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getATSCMajorChannel() {
        return atscMajorChannel;
    }

    /**
     * Sets the value of the atscMajorChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setATSCMajorChannel(JAXBElement<Long> value) {
        this.atscMajorChannel = value;
    }

    /**
     * Gets the value of the atscMinorChannel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getATSCMinorChannel() {
        return atscMinorChannel;
    }

    /**
     * Sets the value of the atscMinorChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setATSCMinorChannel(JAXBElement<Long> value) {
        this.atscMinorChannel = value;
    }

    /**
     * Gets the value of the useEIT property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUseEIT() {
        return useEIT;
    }

    /**
     * Sets the value of the useEIT property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUseEIT(JAXBElement<Boolean> value) {
        this.useEIT = value;
    }

    /**
     * Gets the value of the visible property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setVisible(JAXBElement<Boolean> value) {
        this.visible = value;
    }

    /**
     * Gets the value of the frequencyID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFrequencyID() {
        return frequencyID;
    }

    /**
     * Sets the value of the frequencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFrequencyID(JAXBElement<String> value) {
        this.frequencyID = value;
    }

    /**
     * Gets the value of the icon property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIcon() {
        return icon;
    }

    /**
     * Sets the value of the icon property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIcon(JAXBElement<String> value) {
        this.icon = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormat(JAXBElement<String> value) {
        this.format = value;
    }

    /**
     * Gets the value of the xmltvid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXMLTVID() {
        return xmltvid;
    }

    /**
     * Sets the value of the xmltvid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXMLTVID(JAXBElement<String> value) {
        this.xmltvid = value;
    }

    /**
     * Gets the value of the defaultAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDefaultAuthority() {
        return defaultAuthority;
    }

    /**
     * Sets the value of the defaultAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDefaultAuthority(JAXBElement<String> value) {
        this.defaultAuthority = value;
    }

}
