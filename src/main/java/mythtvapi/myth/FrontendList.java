
package mythtvapi.myth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FrontendList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrontendList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Frontends" type="{http://mythtv.org}ArrayOfFrontend" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrontendList", propOrder = {
    "frontends"
})
public class FrontendList {

    @XmlElement(name = "Frontends")
    protected ArrayOfFrontend frontends;

    /**
     * Gets the value of the frontends property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFrontend }
     *     
     */
    public ArrayOfFrontend getFrontends() {
        return frontends;
    }

    /**
     * Sets the value of the frontends property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFrontend }
     *     
     */
    public void setFrontends(ArrayOfFrontend value) {
        this.frontends = value;
    }

}
