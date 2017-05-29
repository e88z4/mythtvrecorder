
package mythtvapi.video;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVideoLookup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVideoLookup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VideoLookup" type="{http://mythtv.org}VideoLookup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVideoLookup", propOrder = {
    "videoLookup"
})
public class ArrayOfVideoLookup {

    @XmlElement(name = "VideoLookup", nillable = true)
    protected List<VideoLookup> videoLookup;

    /**
     * Gets the value of the videoLookup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoLookup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoLookup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoLookup }
     * 
     * 
     */
    public List<VideoLookup> getVideoLookup() {
        if (videoLookup == null) {
            videoLookup = new ArrayList<VideoLookup>();
        }
        return this.videoLookup;
    }

}
