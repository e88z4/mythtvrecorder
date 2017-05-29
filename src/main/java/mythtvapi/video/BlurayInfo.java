
package mythtvapi.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BlurayInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BlurayInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AltTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiscLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiscNum" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="TotalDiscNum" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="TitleCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="ThumbCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="ThumbPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TopMenuSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FirstPlaySupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NumHDMVTitles" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="NumBDJTitles" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="NumUnsupportedTitles" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="AACSDetected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LibAACSDetected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AACSHandled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BDPlusDetected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LibBDPlusDetected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BDPlusHandled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlurayInfo", propOrder = {
    "path",
    "title",
    "altTitle",
    "discLang",
    "discNum",
    "totalDiscNum",
    "titleCount",
    "thumbCount",
    "thumbPath",
    "topMenuSupported",
    "firstPlaySupported",
    "numHDMVTitles",
    "numBDJTitles",
    "numUnsupportedTitles",
    "aacsDetected",
    "libAACSDetected",
    "aacsHandled",
    "bdPlusDetected",
    "libBDPlusDetected",
    "bdPlusHandled"
})
public class BlurayInfo {

    @XmlElement(name = "Path")
    protected String path;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "AltTitle")
    protected String altTitle;
    @XmlElement(name = "DiscLang")
    protected String discLang;
    @XmlElement(name = "DiscNum")
    @XmlSchemaType(name = "unsignedInt")
    protected Long discNum;
    @XmlElement(name = "TotalDiscNum")
    @XmlSchemaType(name = "unsignedInt")
    protected Long totalDiscNum;
    @XmlElement(name = "TitleCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long titleCount;
    @XmlElement(name = "ThumbCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long thumbCount;
    @XmlElement(name = "ThumbPath")
    protected String thumbPath;
    @XmlElement(name = "TopMenuSupported")
    protected Boolean topMenuSupported;
    @XmlElement(name = "FirstPlaySupported")
    protected Boolean firstPlaySupported;
    @XmlElement(name = "NumHDMVTitles")
    @XmlSchemaType(name = "unsignedInt")
    protected Long numHDMVTitles;
    @XmlElement(name = "NumBDJTitles")
    @XmlSchemaType(name = "unsignedInt")
    protected Long numBDJTitles;
    @XmlElement(name = "NumUnsupportedTitles")
    @XmlSchemaType(name = "unsignedInt")
    protected Long numUnsupportedTitles;
    @XmlElement(name = "AACSDetected")
    protected Boolean aacsDetected;
    @XmlElement(name = "LibAACSDetected")
    protected Boolean libAACSDetected;
    @XmlElement(name = "AACSHandled")
    protected Boolean aacsHandled;
    @XmlElement(name = "BDPlusDetected")
    protected Boolean bdPlusDetected;
    @XmlElement(name = "LibBDPlusDetected")
    protected Boolean libBDPlusDetected;
    @XmlElement(name = "BDPlusHandled")
    protected Boolean bdPlusHandled;

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
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
     * Gets the value of the altTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltTitle() {
        return altTitle;
    }

    /**
     * Sets the value of the altTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltTitle(String value) {
        this.altTitle = value;
    }

    /**
     * Gets the value of the discLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscLang() {
        return discLang;
    }

    /**
     * Sets the value of the discLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscLang(String value) {
        this.discLang = value;
    }

    /**
     * Gets the value of the discNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDiscNum() {
        return discNum;
    }

    /**
     * Sets the value of the discNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDiscNum(Long value) {
        this.discNum = value;
    }

    /**
     * Gets the value of the totalDiscNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalDiscNum() {
        return totalDiscNum;
    }

    /**
     * Sets the value of the totalDiscNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalDiscNum(Long value) {
        this.totalDiscNum = value;
    }

    /**
     * Gets the value of the titleCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTitleCount() {
        return titleCount;
    }

    /**
     * Sets the value of the titleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTitleCount(Long value) {
        this.titleCount = value;
    }

    /**
     * Gets the value of the thumbCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getThumbCount() {
        return thumbCount;
    }

    /**
     * Sets the value of the thumbCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setThumbCount(Long value) {
        this.thumbCount = value;
    }

    /**
     * Gets the value of the thumbPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbPath() {
        return thumbPath;
    }

    /**
     * Sets the value of the thumbPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbPath(String value) {
        this.thumbPath = value;
    }

    /**
     * Gets the value of the topMenuSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTopMenuSupported() {
        return topMenuSupported;
    }

    /**
     * Sets the value of the topMenuSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTopMenuSupported(Boolean value) {
        this.topMenuSupported = value;
    }

    /**
     * Gets the value of the firstPlaySupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFirstPlaySupported() {
        return firstPlaySupported;
    }

    /**
     * Sets the value of the firstPlaySupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFirstPlaySupported(Boolean value) {
        this.firstPlaySupported = value;
    }

    /**
     * Gets the value of the numHDMVTitles property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumHDMVTitles() {
        return numHDMVTitles;
    }

    /**
     * Sets the value of the numHDMVTitles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumHDMVTitles(Long value) {
        this.numHDMVTitles = value;
    }

    /**
     * Gets the value of the numBDJTitles property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumBDJTitles() {
        return numBDJTitles;
    }

    /**
     * Sets the value of the numBDJTitles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumBDJTitles(Long value) {
        this.numBDJTitles = value;
    }

    /**
     * Gets the value of the numUnsupportedTitles property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumUnsupportedTitles() {
        return numUnsupportedTitles;
    }

    /**
     * Sets the value of the numUnsupportedTitles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumUnsupportedTitles(Long value) {
        this.numUnsupportedTitles = value;
    }

    /**
     * Gets the value of the aacsDetected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAACSDetected() {
        return aacsDetected;
    }

    /**
     * Sets the value of the aacsDetected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAACSDetected(Boolean value) {
        this.aacsDetected = value;
    }

    /**
     * Gets the value of the libAACSDetected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLibAACSDetected() {
        return libAACSDetected;
    }

    /**
     * Sets the value of the libAACSDetected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLibAACSDetected(Boolean value) {
        this.libAACSDetected = value;
    }

    /**
     * Gets the value of the aacsHandled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAACSHandled() {
        return aacsHandled;
    }

    /**
     * Sets the value of the aacsHandled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAACSHandled(Boolean value) {
        this.aacsHandled = value;
    }

    /**
     * Gets the value of the bdPlusDetected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBDPlusDetected() {
        return bdPlusDetected;
    }

    /**
     * Sets the value of the bdPlusDetected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBDPlusDetected(Boolean value) {
        this.bdPlusDetected = value;
    }

    /**
     * Gets the value of the libBDPlusDetected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLibBDPlusDetected() {
        return libBDPlusDetected;
    }

    /**
     * Sets the value of the libBDPlusDetected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLibBDPlusDetected(Boolean value) {
        this.libBDPlusDetected = value;
    }

    /**
     * Gets the value of the bdPlusHandled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBDPlusHandled() {
        return bdPlusHandled;
    }

    /**
     * Sets the value of the bdPlusHandled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBDPlusHandled(Boolean value) {
        this.bdPlusHandled = value;
    }

}
