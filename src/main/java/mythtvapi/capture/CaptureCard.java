
package mythtvapi.capture;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaptureCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaptureCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
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
@XmlType(name = "CaptureCard", propOrder = {
    "cardId",
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
public class CaptureCard {

    @XmlElement(name = "CardId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long cardId;
    @XmlElement(name = "VideoDevice")
    protected String videoDevice;
    @XmlElement(name = "AudioDevice")
    protected String audioDevice;
    @XmlElement(name = "VBIDevice")
    protected String vbiDevice;
    @XmlElement(name = "CardType")
    protected String cardType;
    @XmlElement(name = "AudioRateLimit")
    @XmlSchemaType(name = "unsignedInt")
    protected Long audioRateLimit;
    @XmlElement(name = "HostName")
    protected String hostName;
    @XmlElement(name = "DVBSWFilter")
    @XmlSchemaType(name = "unsignedInt")
    protected Long dvbswFilter;
    @XmlElement(name = "DVBSatType")
    @XmlSchemaType(name = "unsignedInt")
    protected Long dvbSatType;
    @XmlElement(name = "DVBWaitForSeqStart")
    protected Boolean dvbWaitForSeqStart;
    @XmlElement(name = "SkipBTAudio")
    protected Boolean skipBTAudio;
    @XmlElement(name = "DVBOnDemand")
    protected Boolean dvbOnDemand;
    @XmlElement(name = "DVBDiSEqCType")
    @XmlSchemaType(name = "unsignedInt")
    protected Long dvbDiSEqCType;
    @XmlElement(name = "FirewireSpeed")
    @XmlSchemaType(name = "unsignedInt")
    protected Long firewireSpeed;
    @XmlElement(name = "FirewireModel")
    protected String firewireModel;
    @XmlElement(name = "FirewireConnection")
    @XmlSchemaType(name = "unsignedInt")
    protected Long firewireConnection;
    @XmlElement(name = "SignalTimeout")
    @XmlSchemaType(name = "unsignedInt")
    protected Long signalTimeout;
    @XmlElement(name = "ChannelTimeout")
    @XmlSchemaType(name = "unsignedInt")
    protected Long channelTimeout;
    @XmlElement(name = "DVBTuningDelay")
    @XmlSchemaType(name = "unsignedInt")
    protected Long dvbTuningDelay;
    @XmlElement(name = "Contrast")
    @XmlSchemaType(name = "unsignedInt")
    protected Long contrast;
    @XmlElement(name = "Brightness")
    @XmlSchemaType(name = "unsignedInt")
    protected Long brightness;
    @XmlElement(name = "Colour")
    @XmlSchemaType(name = "unsignedInt")
    protected Long colour;
    @XmlElement(name = "Hue")
    @XmlSchemaType(name = "unsignedInt")
    protected Long hue;
    @XmlElement(name = "DiSEqCId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long diSEqCId;
    @XmlElement(name = "DVBEITScan")
    protected Boolean dvbeitScan;

    /**
     * Gets the value of the cardId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCardId() {
        return cardId;
    }

    /**
     * Sets the value of the cardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCardId(Long value) {
        this.cardId = value;
    }

    /**
     * Gets the value of the videoDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoDevice() {
        return videoDevice;
    }

    /**
     * Sets the value of the videoDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoDevice(String value) {
        this.videoDevice = value;
    }

    /**
     * Gets the value of the audioDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioDevice() {
        return audioDevice;
    }

    /**
     * Sets the value of the audioDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioDevice(String value) {
        this.audioDevice = value;
    }

    /**
     * Gets the value of the vbiDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVBIDevice() {
        return vbiDevice;
    }

    /**
     * Sets the value of the vbiDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVBIDevice(String value) {
        this.vbiDevice = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the audioRateLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAudioRateLimit() {
        return audioRateLimit;
    }

    /**
     * Sets the value of the audioRateLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAudioRateLimit(Long value) {
        this.audioRateLimit = value;
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
     * Gets the value of the dvbswFilter property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDVBSWFilter() {
        return dvbswFilter;
    }

    /**
     * Sets the value of the dvbswFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDVBSWFilter(Long value) {
        this.dvbswFilter = value;
    }

    /**
     * Gets the value of the dvbSatType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDVBSatType() {
        return dvbSatType;
    }

    /**
     * Sets the value of the dvbSatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDVBSatType(Long value) {
        this.dvbSatType = value;
    }

    /**
     * Gets the value of the dvbWaitForSeqStart property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDVBWaitForSeqStart() {
        return dvbWaitForSeqStart;
    }

    /**
     * Sets the value of the dvbWaitForSeqStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDVBWaitForSeqStart(Boolean value) {
        this.dvbWaitForSeqStart = value;
    }

    /**
     * Gets the value of the skipBTAudio property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipBTAudio() {
        return skipBTAudio;
    }

    /**
     * Sets the value of the skipBTAudio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipBTAudio(Boolean value) {
        this.skipBTAudio = value;
    }

    /**
     * Gets the value of the dvbOnDemand property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDVBOnDemand() {
        return dvbOnDemand;
    }

    /**
     * Sets the value of the dvbOnDemand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDVBOnDemand(Boolean value) {
        this.dvbOnDemand = value;
    }

    /**
     * Gets the value of the dvbDiSEqCType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDVBDiSEqCType() {
        return dvbDiSEqCType;
    }

    /**
     * Sets the value of the dvbDiSEqCType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDVBDiSEqCType(Long value) {
        this.dvbDiSEqCType = value;
    }

    /**
     * Gets the value of the firewireSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFirewireSpeed() {
        return firewireSpeed;
    }

    /**
     * Sets the value of the firewireSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFirewireSpeed(Long value) {
        this.firewireSpeed = value;
    }

    /**
     * Gets the value of the firewireModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirewireModel() {
        return firewireModel;
    }

    /**
     * Sets the value of the firewireModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirewireModel(String value) {
        this.firewireModel = value;
    }

    /**
     * Gets the value of the firewireConnection property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFirewireConnection() {
        return firewireConnection;
    }

    /**
     * Sets the value of the firewireConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFirewireConnection(Long value) {
        this.firewireConnection = value;
    }

    /**
     * Gets the value of the signalTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSignalTimeout() {
        return signalTimeout;
    }

    /**
     * Sets the value of the signalTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSignalTimeout(Long value) {
        this.signalTimeout = value;
    }

    /**
     * Gets the value of the channelTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getChannelTimeout() {
        return channelTimeout;
    }

    /**
     * Sets the value of the channelTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setChannelTimeout(Long value) {
        this.channelTimeout = value;
    }

    /**
     * Gets the value of the dvbTuningDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDVBTuningDelay() {
        return dvbTuningDelay;
    }

    /**
     * Sets the value of the dvbTuningDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDVBTuningDelay(Long value) {
        this.dvbTuningDelay = value;
    }

    /**
     * Gets the value of the contrast property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContrast() {
        return contrast;
    }

    /**
     * Sets the value of the contrast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContrast(Long value) {
        this.contrast = value;
    }

    /**
     * Gets the value of the brightness property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBrightness() {
        return brightness;
    }

    /**
     * Sets the value of the brightness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBrightness(Long value) {
        this.brightness = value;
    }

    /**
     * Gets the value of the colour property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getColour() {
        return colour;
    }

    /**
     * Sets the value of the colour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setColour(Long value) {
        this.colour = value;
    }

    /**
     * Gets the value of the hue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHue() {
        return hue;
    }

    /**
     * Sets the value of the hue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHue(Long value) {
        this.hue = value;
    }

    /**
     * Gets the value of the diSEqCId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDiSEqCId() {
        return diSEqCId;
    }

    /**
     * Sets the value of the diSEqCId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDiSEqCId(Long value) {
        this.diSEqCId = value;
    }

    /**
     * Gets the value of the dvbeitScan property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDVBEITScan() {
        return dvbeitScan;
    }

    /**
     * Sets the value of the dvbeitScan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDVBEITScan(Boolean value) {
        this.dvbeitScan = value;
    }

}
