
package mythtvapi.myth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LogArgs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogInfo", propOrder = {
    "logArgs"
})
public class LogInfo {

    @XmlElement(name = "LogArgs")
    protected String logArgs;

    /**
     * Gets the value of the logArgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogArgs() {
        return logArgs;
    }

    /**
     * Sets the value of the logArgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogArgs(String value) {
        this.logArgs = value;
    }

}
