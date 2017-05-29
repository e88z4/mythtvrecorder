
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
 *         &lt;element name="GetFrontendsResult" type="{http://mythtv.org}FrontendList" minOccurs="0"/>
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
    "getFrontendsResult"
})
@XmlRootElement(name = "GetFrontendsResponse")
public class GetFrontendsResponse {

    @XmlElementRef(name = "GetFrontendsResult", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<FrontendList> getFrontendsResult;

    /**
     * Gets the value of the getFrontendsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FrontendList }{@code >}
     *     
     */
    public JAXBElement<FrontendList> getGetFrontendsResult() {
        return getFrontendsResult;
    }

    /**
     * Sets the value of the getFrontendsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FrontendList }{@code >}
     *     
     */
    public void setGetFrontendsResult(JAXBElement<FrontendList> value) {
        this.getFrontendsResult = value;
    }

}
