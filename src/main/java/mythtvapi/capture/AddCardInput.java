
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
 *         &lt;element name="CardId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="SourceId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="InputName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChangerDevice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChangerModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TuneChan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartChan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DishnetEIT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RecPriority" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="Quicktune" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="SchedOrder" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="LiveTVOrder" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
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
    "cardId",
    "sourceId",
    "inputName",
    "externalCommand",
    "changerDevice",
    "changerModel",
    "hostName",
    "tuneChan",
    "startChan",
    "displayName",
    "dishnetEIT",
    "recPriority",
    "quicktune",
    "schedOrder",
    "liveTVOrder"
})
@XmlRootElement(name = "AddCardInput")
public class AddCardInput {

    @XmlElementRef(name = "CardId", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> cardId;
    @XmlElementRef(name = "SourceId", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> sourceId;
    @XmlElementRef(name = "InputName", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inputName;
    @XmlElementRef(name = "ExternalCommand", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> externalCommand;
    @XmlElementRef(name = "ChangerDevice", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> changerDevice;
    @XmlElementRef(name = "ChangerModel", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> changerModel;
    @XmlElementRef(name = "HostName", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hostName;
    @XmlElementRef(name = "TuneChan", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tuneChan;
    @XmlElementRef(name = "StartChan", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> startChan;
    @XmlElementRef(name = "DisplayName", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> displayName;
    @XmlElementRef(name = "DishnetEIT", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dishnetEIT;
    @XmlElementRef(name = "RecPriority", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> recPriority;
    @XmlElementRef(name = "Quicktune", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> quicktune;
    @XmlElementRef(name = "SchedOrder", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> schedOrder;
    @XmlElementRef(name = "LiveTVOrder", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> liveTVOrder;

    /**
     * Gets the value of the cardId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCardId() {
        return cardId;
    }

    /**
     * Sets the value of the cardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCardId(JAXBElement<Long> value) {
        this.cardId = value;
    }

    /**
     * Gets the value of the sourceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSourceId(JAXBElement<Long> value) {
        this.sourceId = value;
    }

    /**
     * Gets the value of the inputName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInputName() {
        return inputName;
    }

    /**
     * Sets the value of the inputName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInputName(JAXBElement<String> value) {
        this.inputName = value;
    }

    /**
     * Gets the value of the externalCommand property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExternalCommand() {
        return externalCommand;
    }

    /**
     * Sets the value of the externalCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExternalCommand(JAXBElement<String> value) {
        this.externalCommand = value;
    }

    /**
     * Gets the value of the changerDevice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChangerDevice() {
        return changerDevice;
    }

    /**
     * Sets the value of the changerDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChangerDevice(JAXBElement<String> value) {
        this.changerDevice = value;
    }

    /**
     * Gets the value of the changerModel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChangerModel() {
        return changerModel;
    }

    /**
     * Sets the value of the changerModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChangerModel(JAXBElement<String> value) {
        this.changerModel = value;
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
     * Gets the value of the tuneChan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTuneChan() {
        return tuneChan;
    }

    /**
     * Sets the value of the tuneChan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTuneChan(JAXBElement<String> value) {
        this.tuneChan = value;
    }

    /**
     * Gets the value of the startChan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStartChan() {
        return startChan;
    }

    /**
     * Sets the value of the startChan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStartChan(JAXBElement<String> value) {
        this.startChan = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisplayName(JAXBElement<String> value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the dishnetEIT property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDishnetEIT() {
        return dishnetEIT;
    }

    /**
     * Sets the value of the dishnetEIT property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDishnetEIT(JAXBElement<Boolean> value) {
        this.dishnetEIT = value;
    }

    /**
     * Gets the value of the recPriority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRecPriority() {
        return recPriority;
    }

    /**
     * Sets the value of the recPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRecPriority(JAXBElement<Long> value) {
        this.recPriority = value;
    }

    /**
     * Gets the value of the quicktune property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getQuicktune() {
        return quicktune;
    }

    /**
     * Sets the value of the quicktune property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setQuicktune(JAXBElement<Long> value) {
        this.quicktune = value;
    }

    /**
     * Gets the value of the schedOrder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSchedOrder() {
        return schedOrder;
    }

    /**
     * Sets the value of the schedOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSchedOrder(JAXBElement<Long> value) {
        this.schedOrder = value;
    }

    /**
     * Gets the value of the liveTVOrder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLiveTVOrder() {
        return liveTVOrder;
    }

    /**
     * Sets the value of the liveTVOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLiveTVOrder(JAXBElement<Long> value) {
        this.liveTVOrder = value;
    }

}
