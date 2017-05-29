
package mythtvapi.video;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VideoLookup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoLookup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Season" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Episode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Tagline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Certification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Inetref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Collectionref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomePage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReleaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UserRating" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Countries" type="{http://mythtv.org}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Popularity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Budget" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Revenue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IMDB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TMSRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Artwork" type="{http://mythtv.org}ArrayOfArtworkItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoLookup", propOrder = {
    "title",
    "subTitle",
    "season",
    "episode",
    "year",
    "tagline",
    "description",
    "certification",
    "inetref",
    "collectionref",
    "homePage",
    "releaseDate",
    "userRating",
    "length",
    "language",
    "countries",
    "popularity",
    "budget",
    "revenue",
    "imdb",
    "tmsRef",
    "artwork"
})
public class VideoLookup {

    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "SubTitle")
    protected String subTitle;
    @XmlElement(name = "Season")
    protected Integer season;
    @XmlElement(name = "Episode")
    protected Integer episode;
    @XmlElement(name = "Year")
    protected Integer year;
    @XmlElement(name = "Tagline")
    protected String tagline;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Certification")
    protected String certification;
    @XmlElement(name = "Inetref")
    protected String inetref;
    @XmlElement(name = "Collectionref")
    protected String collectionref;
    @XmlElement(name = "HomePage")
    protected String homePage;
    @XmlElementRef(name = "ReleaseDate", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> releaseDate;
    @XmlElement(name = "UserRating")
    protected Float userRating;
    @XmlElement(name = "Length")
    protected Integer length;
    @XmlElement(name = "Language")
    protected String language;
    @XmlElement(name = "Countries")
    protected ArrayOfString countries;
    @XmlElement(name = "Popularity")
    protected Integer popularity;
    @XmlElement(name = "Budget")
    protected Integer budget;
    @XmlElement(name = "Revenue")
    protected Integer revenue;
    @XmlElement(name = "IMDB")
    protected String imdb;
    @XmlElement(name = "TMSRef")
    protected String tmsRef;
    @XmlElement(name = "Artwork")
    protected ArrayOfArtworkItem artwork;

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
     * Gets the value of the subTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * Sets the value of the subTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTitle(String value) {
        this.subTitle = value;
    }

    /**
     * Gets the value of the season property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeason() {
        return season;
    }

    /**
     * Sets the value of the season property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeason(Integer value) {
        this.season = value;
    }

    /**
     * Gets the value of the episode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEpisode() {
        return episode;
    }

    /**
     * Sets the value of the episode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEpisode(Integer value) {
        this.episode = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYear(Integer value) {
        this.year = value;
    }

    /**
     * Gets the value of the tagline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagline() {
        return tagline;
    }

    /**
     * Sets the value of the tagline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagline(String value) {
        this.tagline = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the certification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertification() {
        return certification;
    }

    /**
     * Sets the value of the certification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertification(String value) {
        this.certification = value;
    }

    /**
     * Gets the value of the inetref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInetref() {
        return inetref;
    }

    /**
     * Sets the value of the inetref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInetref(String value) {
        this.inetref = value;
    }

    /**
     * Gets the value of the collectionref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionref() {
        return collectionref;
    }

    /**
     * Sets the value of the collectionref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionref(String value) {
        this.collectionref = value;
    }

    /**
     * Gets the value of the homePage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePage() {
        return homePage;
    }

    /**
     * Sets the value of the homePage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePage(String value) {
        this.homePage = value;
    }

    /**
     * Gets the value of the releaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getReleaseDate() {
        return releaseDate;
    }

    /**
     * Sets the value of the releaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setReleaseDate(JAXBElement<XMLGregorianCalendar> value) {
        this.releaseDate = value;
    }

    /**
     * Gets the value of the userRating property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getUserRating() {
        return userRating;
    }

    /**
     * Sets the value of the userRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setUserRating(Float value) {
        this.userRating = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLength(Integer value) {
        this.length = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the countries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getCountries() {
        return countries;
    }

    /**
     * Sets the value of the countries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setCountries(ArrayOfString value) {
        this.countries = value;
    }

    /**
     * Gets the value of the popularity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPopularity() {
        return popularity;
    }

    /**
     * Sets the value of the popularity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPopularity(Integer value) {
        this.popularity = value;
    }

    /**
     * Gets the value of the budget property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBudget() {
        return budget;
    }

    /**
     * Sets the value of the budget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBudget(Integer value) {
        this.budget = value;
    }

    /**
     * Gets the value of the revenue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRevenue() {
        return revenue;
    }

    /**
     * Sets the value of the revenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRevenue(Integer value) {
        this.revenue = value;
    }

    /**
     * Gets the value of the imdb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMDB() {
        return imdb;
    }

    /**
     * Sets the value of the imdb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMDB(String value) {
        this.imdb = value;
    }

    /**
     * Gets the value of the tmsRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMSRef() {
        return tmsRef;
    }

    /**
     * Sets the value of the tmsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMSRef(String value) {
        this.tmsRef = value;
    }

    /**
     * Gets the value of the artwork property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArtworkItem }
     *     
     */
    public ArrayOfArtworkItem getArtwork() {
        return artwork;
    }

    /**
     * Sets the value of the artwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArtworkItem }
     *     
     */
    public void setArtwork(ArrayOfArtworkItem value) {
        this.artwork = value;
    }

}
