
package mythtvapi.video;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVideoMetadataInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVideoMetadataInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VideoMetadataInfo" type="{http://mythtv.org}VideoMetadataInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVideoMetadataInfo", propOrder = {
    "videoMetadataInfo"
})
public class ArrayOfVideoMetadataInfo {

    @XmlElement(name = "VideoMetadataInfo", nillable = true)
    protected List<VideoMetadataInfo> videoMetadataInfo;

    /**
     * Gets the value of the videoMetadataInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoMetadataInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoMetadataInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoMetadataInfo }
     * 
     * 
     */
    public List<VideoMetadataInfo> getVideoMetadataInfo() {
        if (videoMetadataInfo == null) {
            videoMetadataInfo = new ArrayList<VideoMetadataInfo>();
        }
        return this.videoMetadataInfo;
    }

}
