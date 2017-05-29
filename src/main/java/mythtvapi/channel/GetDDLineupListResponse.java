
package mythtvapi.channel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetDDLineupListResult" type="{http://mythtv.org}LineupList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getDDLineupListResult"
})
@XmlRootElement(name = "GetDDLineupListResponse")
public class GetDDLineupListResponse {

    @XmlElementRef(name = "GetDDLineupListResult", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<LineupList> getDDLineupListResult;

    /**
     * Gets the value of the getDDLineupListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LineupList }{@code >}
     *     
     */
    public JAXBElement<LineupList> getGetDDLineupListResult() {
        return getDDLineupListResult;
    }

    /**
     * Sets the value of the getDDLineupListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LineupList }{@code >}
     *     
     */
    public void setGetDDLineupListResult(JAXBElement<LineupList> value) {
        this.getDDLineupListResult = value;
    }

}
