
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
 *         &lt;element name="GetBackendInfoResult" type="{http://mythtv.org}BackendInfo" minOccurs="0"/>
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
    "getBackendInfoResult"
})
@XmlRootElement(name = "GetBackendInfoResponse")
public class GetBackendInfoResponse {

    @XmlElementRef(name = "GetBackendInfoResult", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<BackendInfo> getBackendInfoResult;

    /**
     * Gets the value of the getBackendInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BackendInfo }{@code >}
     *     
     */
    public JAXBElement<BackendInfo> getGetBackendInfoResult() {
        return getBackendInfoResult;
    }

    /**
     * Sets the value of the getBackendInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BackendInfo }{@code >}
     *     
     */
    public void setGetBackendInfoResult(JAXBElement<BackendInfo> value) {
        this.getBackendInfoResult = value;
    }

}
