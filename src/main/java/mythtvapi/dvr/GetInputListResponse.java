
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
 *         &lt;element name="GetInputListResult" type="{http://mythtv.org}InputList" minOccurs="0"/>
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
    "getInputListResult"
})
@XmlRootElement(name = "GetInputListResponse")
public class GetInputListResponse {

    @XmlElementRef(name = "GetInputListResult", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<InputList> getInputListResult;

    /**
     * Gets the value of the getInputListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InputList }{@code >}
     *     
     */
    public JAXBElement<InputList> getGetInputListResult() {
        return getInputListResult;
    }

    /**
     * Sets the value of the getInputListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InputList }{@code >}
     *     
     */
    public void setGetInputListResult(JAXBElement<InputList> value) {
        this.getInputListResult = value;
    }

}
