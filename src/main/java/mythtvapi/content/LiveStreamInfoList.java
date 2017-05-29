
package mythtvapi.content;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LiveStreamInfoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LiveStreamInfoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LiveStreamInfos" type="{http://mythtv.org}ArrayOfLiveStreamInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiveStreamInfoList", propOrder = {
    "liveStreamInfos"
})
public class LiveStreamInfoList {

    @XmlElement(name = "LiveStreamInfos")
    protected ArrayOfLiveStreamInfo liveStreamInfos;

    /**
     * Gets the value of the liveStreamInfos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLiveStreamInfo }
     *     
     */
    public ArrayOfLiveStreamInfo getLiveStreamInfos() {
        return liveStreamInfos;
    }

    /**
     * Sets the value of the liveStreamInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLiveStreamInfo }
     *     
     */
    public void setLiveStreamInfos(ArrayOfLiveStreamInfo value) {
        this.liveStreamInfos = value;
    }

}
