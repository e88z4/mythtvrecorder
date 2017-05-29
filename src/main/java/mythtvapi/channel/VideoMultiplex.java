
package mythtvapi.channel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VideoMultiplex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoMultiplex">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MplexId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SourceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TransportId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NetworkId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Frequency" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Inversion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SymbolRate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FEC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Polarity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Modulation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bandwidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LPCodeRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HPCodeRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransmissionMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GuardInterval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Visible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Constellation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hierarchy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModulationSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RollOff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SIStandard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UpdateTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "VideoMultiplex", propOrder = {
    "mplexId",
    "sourceId",
    "transportId",
    "networkId",
    "frequency",
    "inversion",
    "symbolRate",
    "fec",
    "polarity",
    "modulation",
    "bandwidth",
    "lpCodeRate",
    "hpCodeRate",
    "transmissionMode",
    "guardInterval",
    "visible",
    "constellation",
    "hierarchy",
    "modulationSystem",
    "rollOff",
    "siStandard",
    "serviceVersion",
    "updateTimeStamp",
    "defaultAuthority"
})
public class VideoMultiplex {

    @XmlElement(name = "MplexId")
    protected Integer mplexId;
    @XmlElement(name = "SourceId")
    protected Integer sourceId;
    @XmlElement(name = "TransportId")
    protected Integer transportId;
    @XmlElement(name = "NetworkId")
    protected Integer networkId;
    @XmlElement(name = "Frequency")
    protected Long frequency;
    @XmlElement(name = "Inversion")
    protected String inversion;
    @XmlElement(name = "SymbolRate")
    protected Long symbolRate;
    @XmlElement(name = "FEC")
    protected String fec;
    @XmlElement(name = "Polarity")
    protected String polarity;
    @XmlElement(name = "Modulation")
    protected String modulation;
    @XmlElement(name = "Bandwidth")
    protected String bandwidth;
    @XmlElement(name = "LPCodeRate")
    protected String lpCodeRate;
    @XmlElement(name = "HPCodeRate")
    protected String hpCodeRate;
    @XmlElement(name = "TransmissionMode")
    protected String transmissionMode;
    @XmlElement(name = "GuardInterval")
    protected String guardInterval;
    @XmlElement(name = "Visible")
    protected Boolean visible;
    @XmlElement(name = "Constellation")
    protected String constellation;
    @XmlElement(name = "Hierarchy")
    protected String hierarchy;
    @XmlElement(name = "ModulationSystem")
    protected String modulationSystem;
    @XmlElement(name = "RollOff")
    protected String rollOff;
    @XmlElement(name = "SIStandard")
    protected String siStandard;
    @XmlElement(name = "ServiceVersion")
    protected Integer serviceVersion;
    @XmlElementRef(name = "UpdateTimeStamp", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> updateTimeStamp;
    @XmlElement(name = "DefaultAuthority")
    protected String defaultAuthority;

    /**
     * Gets the value of the mplexId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMplexId() {
        return mplexId;
    }

    /**
     * Sets the value of the mplexId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMplexId(Integer value) {
        this.mplexId = value;
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
     * Gets the value of the transportId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransportId() {
        return transportId;
    }

    /**
     * Sets the value of the transportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransportId(Integer value) {
        this.transportId = value;
    }

    /**
     * Gets the value of the networkId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNetworkId() {
        return networkId;
    }

    /**
     * Sets the value of the networkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNetworkId(Integer value) {
        this.networkId = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFrequency(Long value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the inversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInversion() {
        return inversion;
    }

    /**
     * Sets the value of the inversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInversion(String value) {
        this.inversion = value;
    }

    /**
     * Gets the value of the symbolRate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSymbolRate() {
        return symbolRate;
    }

    /**
     * Sets the value of the symbolRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSymbolRate(Long value) {
        this.symbolRate = value;
    }

    /**
     * Gets the value of the fec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFEC() {
        return fec;
    }

    /**
     * Sets the value of the fec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFEC(String value) {
        this.fec = value;
    }

    /**
     * Gets the value of the polarity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolarity() {
        return polarity;
    }

    /**
     * Sets the value of the polarity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolarity(String value) {
        this.polarity = value;
    }

    /**
     * Gets the value of the modulation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModulation() {
        return modulation;
    }

    /**
     * Sets the value of the modulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModulation(String value) {
        this.modulation = value;
    }

    /**
     * Gets the value of the bandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBandwidth() {
        return bandwidth;
    }

    /**
     * Sets the value of the bandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBandwidth(String value) {
        this.bandwidth = value;
    }

    /**
     * Gets the value of the lpCodeRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLPCodeRate() {
        return lpCodeRate;
    }

    /**
     * Sets the value of the lpCodeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLPCodeRate(String value) {
        this.lpCodeRate = value;
    }

    /**
     * Gets the value of the hpCodeRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHPCodeRate() {
        return hpCodeRate;
    }

    /**
     * Sets the value of the hpCodeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHPCodeRate(String value) {
        this.hpCodeRate = value;
    }

    /**
     * Gets the value of the transmissionMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransmissionMode() {
        return transmissionMode;
    }

    /**
     * Sets the value of the transmissionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransmissionMode(String value) {
        this.transmissionMode = value;
    }

    /**
     * Gets the value of the guardInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuardInterval() {
        return guardInterval;
    }

    /**
     * Sets the value of the guardInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuardInterval(String value) {
        this.guardInterval = value;
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
     * Gets the value of the constellation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstellation() {
        return constellation;
    }

    /**
     * Sets the value of the constellation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstellation(String value) {
        this.constellation = value;
    }

    /**
     * Gets the value of the hierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchy() {
        return hierarchy;
    }

    /**
     * Sets the value of the hierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchy(String value) {
        this.hierarchy = value;
    }

    /**
     * Gets the value of the modulationSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModulationSystem() {
        return modulationSystem;
    }

    /**
     * Sets the value of the modulationSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModulationSystem(String value) {
        this.modulationSystem = value;
    }

    /**
     * Gets the value of the rollOff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRollOff() {
        return rollOff;
    }

    /**
     * Sets the value of the rollOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRollOff(String value) {
        this.rollOff = value;
    }

    /**
     * Gets the value of the siStandard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIStandard() {
        return siStandard;
    }

    /**
     * Sets the value of the siStandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIStandard(String value) {
        this.siStandard = value;
    }

    /**
     * Gets the value of the serviceVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServiceVersion() {
        return serviceVersion;
    }

    /**
     * Sets the value of the serviceVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServiceVersion(Integer value) {
        this.serviceVersion = value;
    }

    /**
     * Gets the value of the updateTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    /**
     * Sets the value of the updateTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setUpdateTimeStamp(JAXBElement<XMLGregorianCalendar> value) {
        this.updateTimeStamp = value;
    }

    /**
     * Gets the value of the defaultAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultAuthority() {
        return defaultAuthority;
    }

    /**
     * Sets the value of the defaultAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultAuthority(String value) {
        this.defaultAuthority = value;
    }

}
