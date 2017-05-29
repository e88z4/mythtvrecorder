
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
 *         &lt;element name="GetProgramGuideResult" type="{http://mythtv.org}ProgramGuide" minOccurs="0"/>
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
    "getProgramGuideResult"
})
@XmlRootElement(name = "GetProgramGuideResponse")
public class GetProgramGuideResponse {

    @XmlElementRef(name = "GetProgramGuideResult", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<ProgramGuide> getProgramGuideResult;

    /**
     * Gets the value of the getProgramGuideResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProgramGuide }{@code >}
     *     
     */
    public JAXBElement<ProgramGuide> getGetProgramGuideResult() {
        return getProgramGuideResult;
    }

    /**
     * Sets the value of the getProgramGuideResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProgramGuide }{@code >}
     *     
     */
    public void setGetProgramGuideResult(JAXBElement<ProgramGuide> value) {
        this.getProgramGuideResult = value;
    }

}
