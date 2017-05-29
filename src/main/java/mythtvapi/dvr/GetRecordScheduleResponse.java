
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
 *         &lt;element name="GetRecordScheduleResult" type="{http://mythtv.org}RecRule" minOccurs="0"/>
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
    "getRecordScheduleResult"
})
@XmlRootElement(name = "GetRecordScheduleResponse")
public class GetRecordScheduleResponse {

    @XmlElementRef(name = "GetRecordScheduleResult", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<RecRule> getRecordScheduleResult;

    /**
     * Gets the value of the getRecordScheduleResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RecRule }{@code >}
     *     
     */
    public JAXBElement<RecRule> getGetRecordScheduleResult() {
        return getRecordScheduleResult;
    }

    /**
     * Sets the value of the getRecordScheduleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RecRule }{@code >}
     *     
     */
    public void setGetRecordScheduleResult(JAXBElement<RecRule> value) {
        this.getRecordScheduleResult = value;
    }

}
