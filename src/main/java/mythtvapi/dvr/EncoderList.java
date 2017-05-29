
package mythtvapi.dvr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncoderList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EncoderList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Encoders" type="{http://mythtv.org}ArrayOfEncoder" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncoderList", propOrder = {
    "encoders"
})
public class EncoderList {

    @XmlElement(name = "Encoders")
    protected ArrayOfEncoder encoders;

    /**
     * Gets the value of the encoders property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEncoder }
     *     
     */
    public ArrayOfEncoder getEncoders() {
        return encoders;
    }

    /**
     * Sets the value of the encoders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEncoder }
     *     
     */
    public void setEncoders(ArrayOfEncoder value) {
        this.encoders = value;
    }

}
