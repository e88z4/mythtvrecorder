
package mythtvapi.video;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfArtworkItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfArtworkItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArtworkItem" type="{http://mythtv.org}ArtworkItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfArtworkItem", propOrder = {
    "artworkItem"
})
public class ArrayOfArtworkItem {

    @XmlElement(name = "ArtworkItem", nillable = true)
    protected List<ArtworkItem> artworkItem;

    /**
     * Gets the value of the artworkItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artworkItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtworkItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArtworkItem }
     * 
     * 
     */
    public List<ArtworkItem> getArtworkItem() {
        if (artworkItem == null) {
            artworkItem = new ArrayList<ArtworkItem>();
        }
        return this.artworkItem;
    }

}
