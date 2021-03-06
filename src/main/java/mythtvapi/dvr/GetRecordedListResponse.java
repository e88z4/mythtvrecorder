
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
 *         &lt;element name="GetRecordedListResult" type="{http://mythtv.org}ProgramList" minOccurs="0"/>
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
    "getRecordedListResult"
})
@XmlRootElement(name = "GetRecordedListResponse")
public class GetRecordedListResponse {

    @XmlElementRef(name = "GetRecordedListResult", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<ProgramList> getRecordedListResult;

    /**
     * Gets the value of the getRecordedListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProgramList }{@code >}
     *     
     */
    public JAXBElement<ProgramList> getGetRecordedListResult() {
        return getRecordedListResult;
    }

    /**
     * Sets the value of the getRecordedListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProgramList }{@code >}
     *     
     */
    public void setGetRecordedListResult(JAXBElement<ProgramList> value) {
        this.getRecordedListResult = value;
    }

}
