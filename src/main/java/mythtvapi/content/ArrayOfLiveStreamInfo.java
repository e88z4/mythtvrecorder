
package mythtvapi.content;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLiveStreamInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLiveStreamInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LiveStreamInfo" type="{http://mythtv.org}LiveStreamInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLiveStreamInfo", propOrder = {
    "liveStreamInfo"
})
public class ArrayOfLiveStreamInfo {

    @XmlElement(name = "LiveStreamInfo", nillable = true)
    protected List<LiveStreamInfo> liveStreamInfo;

    /**
     * Gets the value of the liveStreamInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the liveStreamInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLiveStreamInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LiveStreamInfo }
     * 
     * 
     */
    public List<LiveStreamInfo> getLiveStreamInfo() {
        if (liveStreamInfo == null) {
            liveStreamInfo = new ArrayList<LiveStreamInfo>();
        }
        return this.liveStreamInfo;
    }

}
