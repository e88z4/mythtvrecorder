
package mythtvapi.content;

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
 *         &lt;element name="GetRecordingArtworkResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getRecordingArtworkResult"
})
@XmlRootElement(name = "GetRecordingArtworkResponse")
public class GetRecordingArtworkResponse {

    @XmlElementRef(name = "GetRecordingArtworkResult", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> getRecordingArtworkResult;

    /**
     * Gets the value of the getRecordingArtworkResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGetRecordingArtworkResult() {
        return getRecordingArtworkResult;
    }

    /**
     * Sets the value of the getRecordingArtworkResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGetRecordingArtworkResult(JAXBElement<String> value) {
        this.getRecordingArtworkResult = value;
    }

}
