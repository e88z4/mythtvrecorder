
package mythtvapi.myth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogMessageList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogMessageList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HostNames" type="{http://mythtv.org}ArrayOfLabelValue" minOccurs="0"/>
 *         &lt;element name="Applications" type="{http://mythtv.org}ArrayOfLabelValue" minOccurs="0"/>
 *         &lt;element name="LogMessages" type="{http://mythtv.org}ArrayOfLogMessage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogMessageList", propOrder = {
    "hostNames",
    "applications",
    "logMessages"
})
public class LogMessageList {

    @XmlElement(name = "HostNames")
    protected ArrayOfLabelValue hostNames;
    @XmlElement(name = "Applications")
    protected ArrayOfLabelValue applications;
    @XmlElement(name = "LogMessages")
    protected ArrayOfLogMessage logMessages;

    /**
     * Gets the value of the hostNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLabelValue }
     *     
     */
    public ArrayOfLabelValue getHostNames() {
        return hostNames;
    }

    /**
     * Sets the value of the hostNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLabelValue }
     *     
     */
    public void setHostNames(ArrayOfLabelValue value) {
        this.hostNames = value;
    }

    /**
     * Gets the value of the applications property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLabelValue }
     *     
     */
    public ArrayOfLabelValue getApplications() {
        return applications;
    }

    /**
     * Sets the value of the applications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLabelValue }
     *     
     */
    public void setApplications(ArrayOfLabelValue value) {
        this.applications = value;
    }

    /**
     * Gets the value of the logMessages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLogMessage }
     *     
     */
    public ArrayOfLogMessage getLogMessages() {
        return logMessages;
    }

    /**
     * Sets the value of the logMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLogMessage }
     *     
     */
    public void setLogMessages(ArrayOfLogMessage value) {
        this.logMessages = value;
    }

}
