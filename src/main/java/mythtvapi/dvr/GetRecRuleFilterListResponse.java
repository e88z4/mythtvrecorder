
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
 *         &lt;element name="GetRecRuleFilterListResult" type="{http://mythtv.org}RecRuleFilterList" minOccurs="0"/>
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
    "getRecRuleFilterListResult"
})
@XmlRootElement(name = "GetRecRuleFilterListResponse")
public class GetRecRuleFilterListResponse {

    @XmlElementRef(name = "GetRecRuleFilterListResult", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<RecRuleFilterList> getRecRuleFilterListResult;

    /**
     * Gets the value of the getRecRuleFilterListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RecRuleFilterList }{@code >}
     *     
     */
    public JAXBElement<RecRuleFilterList> getGetRecRuleFilterListResult() {
        return getRecRuleFilterListResult;
    }

    /**
     * Sets the value of the getRecRuleFilterListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RecRuleFilterList }{@code >}
     *     
     */
    public void setGetRecRuleFilterListResult(JAXBElement<RecRuleFilterList> value) {
        this.getRecRuleFilterListResult = value;
    }

}
