
package mythtvapi.channel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineupList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineupList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Lineups" type="{http://mythtv.org}ArrayOfLineup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineupList", propOrder = {
    "lineups"
})
public class LineupList {

    @XmlElement(name = "Lineups")
    protected ArrayOfLineup lineups;

    /**
     * Gets the value of the lineups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLineup }
     *     
     */
    public ArrayOfLineup getLineups() {
        return lineups;
    }

    /**
     * Sets the value of the lineups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLineup }
     *     
     */
    public void setLineups(ArrayOfLineup value) {
        this.lineups = value;
    }

}
