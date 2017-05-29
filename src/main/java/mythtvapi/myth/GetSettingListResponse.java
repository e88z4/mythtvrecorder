
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
 *         &lt;element name="GetSettingListResult" type="{http://mythtv.org}SettingList" minOccurs="0"/>
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
    "getSettingListResult"
})
@XmlRootElement(name = "GetSettingListResponse")
public class GetSettingListResponse {

    @XmlElementRef(name = "GetSettingListResult", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<SettingList> getSettingListResult;

    /**
     * Gets the value of the getSettingListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SettingList }{@code >}
     *     
     */
    public JAXBElement<SettingList> getGetSettingListResult() {
        return getSettingListResult;
    }

    /**
     * Sets the value of the getSettingListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SettingList }{@code >}
     *     
     */
    public void setGetSettingListResult(JAXBElement<SettingList> value) {
        this.getSettingListResult = value;
    }

}
