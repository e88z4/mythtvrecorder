
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
 *         &lt;element name="GetProgramArtworkListResult" type="{http://mythtv.org}ArtworkInfoList" minOccurs="0"/>
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
    "getProgramArtworkListResult"
})
@XmlRootElement(name = "GetProgramArtworkListResponse")
public class GetProgramArtworkListResponse {

    @XmlElementRef(name = "GetProgramArtworkListResult", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<ArtworkInfoList> getProgramArtworkListResult;

    /**
     * Gets the value of the getProgramArtworkListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArtworkInfoList }{@code >}
     *     
     */
    public JAXBElement<ArtworkInfoList> getGetProgramArtworkListResult() {
        return getProgramArtworkListResult;
    }

    /**
     * Sets the value of the getProgramArtworkListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArtworkInfoList }{@code >}
     *     
     */
    public void setGetProgramArtworkListResult(JAXBElement<ArtworkInfoList> value) {
        this.getProgramArtworkListResult = value;
    }

}
