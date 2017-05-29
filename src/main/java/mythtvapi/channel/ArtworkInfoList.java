
package mythtvapi.channel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArtworkInfoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArtworkInfoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArtworkInfos" type="{http://mythtv.org}ArrayOfArtworkInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArtworkInfoList", propOrder = {
    "artworkInfos"
})
public class ArtworkInfoList {

    @XmlElement(name = "ArtworkInfos")
    protected ArrayOfArtworkInfo artworkInfos;

    /**
     * Gets the value of the artworkInfos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArtworkInfo }
     *     
     */
    public ArrayOfArtworkInfo getArtworkInfos() {
        return artworkInfos;
    }

    /**
     * Sets the value of the artworkInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArtworkInfo }
     *     
     */
    public void setArtworkInfos(ArrayOfArtworkInfo value) {
        this.artworkInfos = value;
    }

}
