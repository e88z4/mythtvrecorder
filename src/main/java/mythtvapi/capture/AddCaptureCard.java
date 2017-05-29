
package mythtvapi.capture;

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
 *         &lt;element name="VideoDevice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AudioDevice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VBIDevice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AudioRateLimit" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="HostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DVBSWFilter" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="DVBSatType" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="DVBWaitForSeqStart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SkipBTAudio" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DVBOnDemand" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DVBDiSEqCType" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="FirewireSpeed" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="FirewireModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirewireConnection" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="SignalTimeout" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="ChannelTimeout" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="DVBTuningDelay" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="Contrast" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="Brightness" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="Colour" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="Hue" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="DiSEqCId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="DVBEITScan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "videoDevice",
    "audioDevice",
    "vbiDevice",
    "cardType",
    "audioRateLimit",
    "hostName",
    "dvbswFilter",
    "dvbSatType",
    "dvbWaitForSeqStart",
    "skipBTAudio",
    "dvbOnDemand",
    "dvbDiSEqCType",
    "firewireSpeed",
    "firewireModel",
    "firewireConnection",
    "signalTimeout",
    "channelTimeout",
    "dvbTuningDelay",
    "contrast",
    "brightness",
    "colour",
    "hue",
    "diSEqCId",
    "dvbeitScan"
})
@XmlRootElement(name = "AddCaptureCard")
public class AddCaptureCard {

    @XmlElementRef(name = "VideoDevice", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> videoDevice;
    @XmlElementRef(name = "AudioDevice", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> audioDevice;
    @XmlElementRef(name = "VBIDevice", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vbiDevice;
    @XmlElementRef(name = "CardType", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardType;
    @XmlElementRef(name = "AudioRateLimit", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> audioRateLimit;
    @XmlElementRef(name = "HostName", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hostName;
    @XmlElementRef(name = "DVBSWFilter", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> dvbswFilter;
    @XmlElementRef(name = "DVBSatType", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> dvbSatType;
    @XmlElementRef(name = "DVBWaitForSeqStart", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dvbWaitForSeqStart;
    @XmlElementRef(name = "SkipBTAudio", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> skipBTAudio;
    @XmlElementRef(name = "DVBOnDemand", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dvbOnDemand;
    @XmlElementRef(name = "DVBDiSEqCType", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> dvbDiSEqCType;
    @XmlElementRef(name = "FirewireSpeed", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> firewireSpeed;
    @XmlElementRef(name = "FirewireModel", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firewireModel;
    @XmlElementRef(name = "FirewireConnection", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> firewireConnection;
    @XmlElementRef(name = "SignalTimeout", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> signalTimeout;
    @XmlElementRef(name = "ChannelTimeout", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> channelTimeout;
    @XmlElementRef(name = "DVBTuningDelay", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> dvbTuningDelay;
    @XmlElementRef(name = "Contrast", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> contrast;
    @XmlElementRef(name = "Brightness", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> brightness;
    @XmlElementRef(name = "Colour", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> colour;
    @XmlElementRef(name = "Hue", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> hue;
    @XmlElementRef(name = "DiSEqCId", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> diSEqCId;
    @XmlElementRef(name = "DVBEITScan", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dvbeitScan;

    /**
     * Gets the value of the videoDevice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVideoDevice() {
        return videoDevice;
    }

    /**
     * Sets the value of the videoDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVideoDevice(JAXBElement<String> value) {
        this.videoDevice = value;
    }

    /**
     * Gets the value of the audioDevice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAudioDevice() {
        return audioDevice;
    }

    /**
     * Sets the value of the audioDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAudioDevice(JAXBElement<String> value) {
        this.audioDevice = value;
    }

    /**
     * Gets the value of the vbiDevice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVBIDevice() {
        return vbiDevice;
    }

    /**
     * Sets the value of the vbiDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVBIDevice(JAXBElement<String> value) {
        this.vbiDevice = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardType(JAXBElement<String> value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the audioRateLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAudioRateLimit() {
        return audioRateLimit;
    }

    /**
     * Sets the value of the audioRateLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAudioRateLimit(JAXBElement<Long> value) {
        this.audioRateLimit = value;
    }

    /**
     * Gets the value of the hostName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHostName() {
        return hostName;
    }

    /**
     * Sets the value of the hostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHostName(JAXBElement<String> value) {
        this.hostName = value;
    }

    /**
     * Gets the value of the dvbswFilter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDVBSWFilter() {
        return dvbswFilter;
    }

    /**
     * Sets the value of the dvbswFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDVBSWFilter(JAXBElement<Long> value) {
        this.dvbswFilter = value;
    }

    /**
     * Gets the value of the dvbSatType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDVBSatType() {
        return dvbSatType;
    }

    /**
     * Sets the value of the dvbSatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDVBSatType(JAXBElement<Long> value) {
        this.dvbSatType = value;
    }

    /**
     * Gets the value of the dvbWaitForSeqStart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDVBWaitForSeqStart() {
        return dvbWaitForSeqStart;
    }

    /**
     * Sets the value of the dvbWaitForSeqStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDVBWaitForSeqStart(JAXBElement<Boolean> value) {
        this.dvbWaitForSeqStart = value;
    }

    /**
     * Gets the value of the skipBTAudio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSkipBTAudio() {
        return skipBTAudio;
    }

    /**
     * Sets the value of the skipBTAudio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSkipBTAudio(JAXBElement<Boolean> value) {
        this.skipBTAudio = value;
    }

    /**
     * Gets the value of the dvbOnDemand property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDVBOnDemand() {
        return dvbOnDemand;
    }

    /**
     * Sets the value of the dvbOnDemand property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDVBOnDemand(JAXBElement<Boolean> value) {
        this.dvbOnDemand = value;
    }

    /**
     * Gets the value of the dvbDiSEqCType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDVBDiSEqCType() {
        return dvbDiSEqCType;
    }

    /**
     * Sets the value of the dvbDiSEqCType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDVBDiSEqCType(JAXBElement<Long> value) {
        this.dvbDiSEqCType = value;
    }

    /**
     * Gets the value of the firewireSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getFirewireSpeed() {
        return firewireSpeed;
    }

    /**
     * Sets the value of the firewireSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setFirewireSpeed(JAXBElement<Long> value) {
        this.firewireSpeed = value;
    }

    /**
     * Gets the value of the firewireModel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirewireModel() {
        return firewireModel;
    }

    /**
     * Sets the value of the firewireModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirewireModel(JAXBElement<String> value) {
        this.firewireModel = value;
    }

    /**
     * Gets the value of the firewireConnection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getFirewireConnection() {
        return firewireConnection;
    }

    /**
     * Sets the value of the firewireConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setFirewireConnection(JAXBElement<Long> value) {
        this.firewireConnection = value;
    }

    /**
     * Gets the value of the signalTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSignalTimeout() {
        return signalTimeout;
    }

    /**
     * Sets the value of the signalTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSignalTimeout(JAXBElement<Long> value) {
        this.signalTimeout = value;
    }

    /**
     * Gets the value of the channelTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getChannelTimeout() {
        return channelTimeout;
    }

    /**
     * Sets the value of the channelTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setChannelTimeout(JAXBElement<Long> value) {
        this.channelTimeout = value;
    }

    /**
     * Gets the value of the dvbTuningDelay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDVBTuningDelay() {
        return dvbTuningDelay;
    }

    /**
     * Sets the value of the dvbTuningDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDVBTuningDelay(JAXBElement<Long> value) {
        this.dvbTuningDelay = value;
    }

    /**
     * Gets the value of the contrast property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getContrast() {
        return contrast;
    }

    /**
     * Sets the value of the contrast property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setContrast(JAXBElement<Long> value) {
        this.contrast = value;
    }

    /**
     * Gets the value of the brightness property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getBrightness() {
        return brightness;
    }

    /**
     * Sets the value of the brightness property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setBrightness(JAXBElement<Long> value) {
        this.brightness = value;
    }

    /**
     * Gets the value of the colour property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getColour() {
        return colour;
    }

    /**
     * Sets the value of the colour property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setColour(JAXBElement<Long> value) {
        this.colour = value;
    }

    /**
     * Gets the value of the hue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getHue() {
        return hue;
    }

    /**
     * Sets the value of the hue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setHue(JAXBElement<Long> value) {
        this.hue = value;
    }

    /**
     * Gets the value of the diSEqCId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDiSEqCId() {
        return diSEqCId;
    }

    /**
     * Sets the value of the diSEqCId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDiSEqCId(JAXBElement<Long> value) {
        this.diSEqCId = value;
    }

    /**
     * Gets the value of the dvbeitScan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDVBEITScan() {
        return dvbeitScan;
    }

    /**
     * Sets the value of the dvbeitScan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDVBEITScan(JAXBElement<Boolean> value) {
        this.dvbeitScan = value;
    }

}
