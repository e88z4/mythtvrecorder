
package mythtvapi.guide;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChannelGroupList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChannelGroupList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChannelGroups" type="{http://mythtv.org}ArrayOfChannelGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelGroupList", propOrder = {
    "channelGroups"
})
public class ChannelGroupList {

    @XmlElement(name = "ChannelGroups")
    protected ArrayOfChannelGroup channelGroups;

    /**
     * Gets the value of the channelGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChannelGroup }
     *     
     */
    public ArrayOfChannelGroup getChannelGroups() {
        return channelGroups;
    }

    /**
     * Sets the value of the channelGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChannelGroup }
     *     
     */
    public void setChannelGroups(ArrayOfChannelGroup value) {
        this.channelGroups = value;
    }

}
