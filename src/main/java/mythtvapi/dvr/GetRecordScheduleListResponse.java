
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
 *         &lt;element name="GetRecordScheduleListResult" type="{http://mythtv.org}RecRuleList" minOccurs="0"/>
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
    "getRecordScheduleListResult"
})
@XmlRootElement(name = "GetRecordScheduleListResponse")
public class GetRecordScheduleListResponse {

    @XmlElementRef(name = "GetRecordScheduleListResult", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<RecRuleList> getRecordScheduleListResult;

    /**
     * Gets the value of the getRecordScheduleListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RecRuleList }{@code >}
     *     
     */
    public JAXBElement<RecRuleList> getGetRecordScheduleListResult() {
        return getRecordScheduleListResult;
    }

    /**
     * Sets the value of the getRecordScheduleListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RecRuleList }{@code >}
     *     
     */
    public void setGetRecordScheduleListResult(JAXBElement<RecRuleList> value) {
        this.getRecordScheduleListResult = value;
    }

}
