
package mythtvapi.channel;

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
 *         &lt;element name="GetXMLTVIdListResult" type="{http://mythtv.org}ArrayOfString" minOccurs="0"/>
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
    "getXMLTVIdListResult"
})
@XmlRootElement(name = "GetXMLTVIdListResponse")
public class GetXMLTVIdListResponse {

    @XmlElementRef(name = "GetXMLTVIdListResult", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfString> getXMLTVIdListResult;

    /**
     * Gets the value of the getXMLTVIdListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public JAXBElement<ArrayOfString> getGetXMLTVIdListResult() {
        return getXMLTVIdListResult;
    }

    /**
     * Sets the value of the getXMLTVIdListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public void setGetXMLTVIdListResult(JAXBElement<ArrayOfString> value) {
        this.getXMLTVIdListResult = value;
    }

}
