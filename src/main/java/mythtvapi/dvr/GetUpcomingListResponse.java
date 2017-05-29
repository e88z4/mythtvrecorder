
package mythtvapi.dvr;

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
 *         &lt;element name="GetUpcomingListResult" type="{http://mythtv.org}ProgramList" minOccurs="0"/>
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
    "getUpcomingListResult"
})
@XmlRootElement(name = "GetUpcomingListResponse")
public class GetUpcomingListResponse {

    @XmlElementRef(name = "GetUpcomingListResult", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<ProgramList> getUpcomingListResult;

    /**
     * Gets the value of the getUpcomingListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProgramList }{@code >}
     *     
     */
    public JAXBElement<ProgramList> getGetUpcomingListResult() {
        return getUpcomingListResult;
    }

    /**
     * Sets the value of the getUpcomingListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProgramList }{@code >}
     *     
     */
    public void setGetUpcomingListResult(JAXBElement<ProgramList> value) {
        this.getUpcomingListResult = value;
    }

}
