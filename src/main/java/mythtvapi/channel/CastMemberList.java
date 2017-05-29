
package mythtvapi.channel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CastMemberList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CastMemberList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CastMembers" type="{http://mythtv.org}ArrayOfCastMember" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CastMemberList", propOrder = {
    "castMembers"
})
public class CastMemberList {

    @XmlElement(name = "CastMembers")
    protected ArrayOfCastMember castMembers;

    /**
     * Gets the value of the castMembers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCastMember }
     *     
     */
    public ArrayOfCastMember getCastMembers() {
        return castMembers;
    }

    /**
     * Sets the value of the castMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCastMember }
     *     
     */
    public void setCastMembers(ArrayOfCastMember value) {
        this.castMembers = value;
    }

}
