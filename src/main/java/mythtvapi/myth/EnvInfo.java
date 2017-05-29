
package mythtvapi.myth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnvInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnvInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LANG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LCALL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LCCTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HOME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MYTHCONFDIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvInfo", propOrder = {
    "lang",
    "lcall",
    "lcctype",
    "home",
    "mythconfdir"
})
public class EnvInfo {

    @XmlElement(name = "LANG")
    protected String lang;
    @XmlElement(name = "LCALL")
    protected String lcall;
    @XmlElement(name = "LCCTYPE")
    protected String lcctype;
    @XmlElement(name = "HOME")
    protected String home;
    @XmlElement(name = "MYTHCONFDIR")
    protected String mythconfdir;

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANG() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANG(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the lcall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLCALL() {
        return lcall;
    }

    /**
     * Sets the value of the lcall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLCALL(String value) {
        this.lcall = value;
    }

    /**
     * Gets the value of the lcctype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLCCTYPE() {
        return lcctype;
    }

    /**
     * Sets the value of the lcctype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLCCTYPE(String value) {
        this.lcctype = value;
    }

    /**
     * Gets the value of the home property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOME() {
        return home;
    }

    /**
     * Sets the value of the home property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOME(String value) {
        this.home = value;
    }

    /**
     * Gets the value of the mythconfdir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMYTHCONFDIR() {
        return mythconfdir;
    }

    /**
     * Sets the value of the mythconfdir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMYTHCONFDIR(String value) {
        this.mythconfdir = value;
    }

}
