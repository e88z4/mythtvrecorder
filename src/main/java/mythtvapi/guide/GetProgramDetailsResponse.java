
package mythtvapi.guide;

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
 *         &lt;element name="GetProgramDetailsResult" type="{http://mythtv.org}Program" minOccurs="0"/>
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
    "getProgramDetailsResult"
})
@XmlRootElement(name = "GetProgramDetailsResponse")
public class GetProgramDetailsResponse {

    @XmlElementRef(name = "GetProgramDetailsResult", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Program> getProgramDetailsResult;

    /**
     * Gets the value of the getProgramDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Program }{@code >}
     *     
     */
    public JAXBElement<Program> getGetProgramDetailsResult() {
        return getProgramDetailsResult;
    }

    /**
     * Sets the value of the getProgramDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Program }{@code >}
     *     
     */
    public void setGetProgramDetailsResult(JAXBElement<Program> value) {
        this.getProgramDetailsResult = value;
    }

}
