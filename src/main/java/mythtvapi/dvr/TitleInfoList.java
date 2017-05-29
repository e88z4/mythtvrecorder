
package mythtvapi.dvr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TitleInfoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TitleInfoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TitleInfos" type="{http://mythtv.org}ArrayOfTitleInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TitleInfoList", propOrder = {
    "titleInfos"
})
public class TitleInfoList {

    @XmlElement(name = "TitleInfos")
    protected ArrayOfTitleInfo titleInfos;

    /**
     * Gets the value of the titleInfos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTitleInfo }
     *     
     */
    public ArrayOfTitleInfo getTitleInfos() {
        return titleInfos;
    }

    /**
     * Sets the value of the titleInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTitleInfo }
     *     
     */
    public void setTitleInfos(ArrayOfTitleInfo value) {
        this.titleInfos = value;
    }

}
