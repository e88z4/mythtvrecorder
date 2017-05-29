
package mythtvapi.dvr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Input complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Input">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="CardId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="SourceId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="InputName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuickTune" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RecPriority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ScheduleOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LiveTVOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Input", propOrder = {
    "id",
    "cardId",
    "sourceId",
    "inputName",
    "displayName",
    "quickTune",
    "recPriority",
    "scheduleOrder",
    "liveTVOrder"
})
public class Input {

    @XmlElement(name = "Id")
    @XmlSchemaType(name = "unsignedInt")
    protected Long id;
    @XmlElement(name = "CardId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long cardId;
    @XmlElement(name = "SourceId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long sourceId;
    @XmlElement(name = "InputName")
    protected String inputName;
    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "QuickTune")
    protected Boolean quickTune;
    @XmlElement(name = "RecPriority")
    protected Integer recPriority;
    @XmlElement(name = "ScheduleOrder")
    protected Integer scheduleOrder;
    @XmlElement(name = "LiveTVOrder")
    protected Integer liveTVOrder;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

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
     * Gets the value of the sourceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSourceId(Long value) {
        this.sourceId = value;
    }

    /**
     * Gets the value of the inputName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputName() {
        return inputName;
    }

    /**
     * Sets the value of the inputName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputName(String value) {
        this.inputName = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the quickTune property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuickTune() {
        return quickTune;
    }

    /**
     * Sets the value of the quickTune property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuickTune(Boolean value) {
        this.quickTune = value;
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
     * Gets the value of the scheduleOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScheduleOrder() {
        return scheduleOrder;
    }

    /**
     * Sets the value of the scheduleOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScheduleOrder(Integer value) {
        this.scheduleOrder = value;
    }

    /**
     * Gets the value of the liveTVOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLiveTVOrder() {
        return liveTVOrder;
    }

    /**
     * Sets the value of the liveTVOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLiveTVOrder(Integer value) {
        this.liveTVOrder = value;
    }

}
