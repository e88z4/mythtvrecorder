
package mythtvapi.myth;

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
 *         &lt;element name="GetTimeZoneResult" type="{http://mythtv.org}TimeZoneInfo" minOccurs="0"/>
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
    "getTimeZoneResult"
})
@XmlRootElement(name = "GetTimeZoneResponse")
public class GetTimeZoneResponse {

    @XmlElementRef(name = "GetTimeZoneResult", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeZoneInfo> getTimeZoneResult;

    /**
     * Gets the value of the getTimeZoneResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeZoneInfo }{@code >}
     *     
     */
    public JAXBElement<TimeZoneInfo> getGetTimeZoneResult() {
        return getTimeZoneResult;
    }

    /**
     * Sets the value of the getTimeZoneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeZoneInfo }{@code >}
     *     
     */
    public void setGetTimeZoneResult(JAXBElement<TimeZoneInfo> value) {
        this.getTimeZoneResult = value;
    }

}
