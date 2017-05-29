
package mythtvapi.myth;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BackendInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BackendInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Build" type="{http://mythtv.org}BuildInfo" minOccurs="0"/>
 *         &lt;element name="Env" type="{http://mythtv.org}EnvInfo" minOccurs="0"/>
 *         &lt;element name="Log" type="{http://mythtv.org}LogInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BackendInfo", propOrder = {
    "build",
    "env",
    "log"
})
public class BackendInfo {

    @XmlElementRef(name = "Build", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<BuildInfo> build;
    @XmlElementRef(name = "Env", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<EnvInfo> env;
    @XmlElementRef(name = "Log", namespace = "http://mythtv.org", type = JAXBElement.class, required = false)
    protected JAXBElement<LogInfo> log;

    /**
     * Gets the value of the build property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BuildInfo }{@code >}
     *     
     */
    public JAXBElement<BuildInfo> getBuild() {
        return build;
    }

    /**
     * Sets the value of the build property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BuildInfo }{@code >}
     *     
     */
    public void setBuild(JAXBElement<BuildInfo> value) {
        this.build = value;
    }

    /**
     * Gets the value of the env property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnvInfo }{@code >}
     *     
     */
    public JAXBElement<EnvInfo> getEnv() {
        return env;
    }

    /**
     * Sets the value of the env property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnvInfo }{@code >}
     *     
     */
    public void setEnv(JAXBElement<EnvInfo> value) {
        this.env = value;
    }

    /**
     * Gets the value of the log property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LogInfo }{@code >}
     *     
     */
    public JAXBElement<LogInfo> getLog() {
        return log;
    }

    /**
     * Sets the value of the log property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LogInfo }{@code >}
     *     
     */
    public void setLog(JAXBElement<LogInfo> value) {
        this.log = value;
    }

}
