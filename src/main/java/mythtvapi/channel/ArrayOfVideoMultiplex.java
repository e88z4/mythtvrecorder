
package mythtvapi.channel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVideoMultiplex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVideoMultiplex">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VideoMultiplex" type="{http://mythtv.org}VideoMultiplex" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVideoMultiplex", propOrder = {
    "videoMultiplex"
})
public class ArrayOfVideoMultiplex {

    @XmlElement(name = "VideoMultiplex", nillable = true)
    protected List<VideoMultiplex> videoMultiplex;

    /**
     * Gets the value of the videoMultiplex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoMultiplex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoMultiplex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoMultiplex }
     * 
     * 
     */
    public List<VideoMultiplex> getVideoMultiplex() {
        if (videoMultiplex == null) {
            videoMultiplex = new ArrayList<VideoMultiplex>();
        }
        return this.videoMultiplex;
    }

}
