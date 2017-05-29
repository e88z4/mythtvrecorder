
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
 *         &lt;element name="GetRecordedCommBreakResult" type="{http://mythtv.org}CutList" minOccurs="0"/>
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
    "getRecordedCommBreakResult"
})
@XmlRootElement(name = "GetRecordedCommBreakResponse")
public class GetRecordedCommBreakResponse {

    @XmlElementRef(name = "GetRecordedCommBreakResult", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<CutList> getRecordedCommBreakResult;

    /**
     * Gets the value of the getRecordedCommBreakResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CutList }{@code >}
     *     
     */
    public JAXBElement<CutList> getGetRecordedCommBreakResult() {
        return getRecordedCommBreakResult;
    }

    /**
     * Sets the value of the getRecordedCommBreakResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CutList }{@code >}
     *     
     */
    public void setGetRecordedCommBreakResult(JAXBElement<CutList> value) {
        this.getRecordedCommBreakResult = value;
    }

}
