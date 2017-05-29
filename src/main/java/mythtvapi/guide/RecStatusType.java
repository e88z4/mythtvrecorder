
package mythtvapi.guide;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecStatus.Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecStatus.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Failing"/>
 *     &lt;enumeration value="MissedFuture"/>
 *     &lt;enumeration value="Tuning"/>
 *     &lt;enumeration value="Failed"/>
 *     &lt;enumeration value="TunerBusy"/>
 *     &lt;enumeration value="LowDiskSpace"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="Missed"/>
 *     &lt;enumeration value="Aborted"/>
 *     &lt;enumeration value="Recorded"/>
 *     &lt;enumeration value="Recording"/>
 *     &lt;enumeration value="WillRecord"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="DontRecord"/>
 *     &lt;enumeration value="PreviousRecording"/>
 *     &lt;enumeration value="CurrentRecording"/>
 *     &lt;enumeration value="EarlierShowing"/>
 *     &lt;enumeration value="TooManyRecordings"/>
 *     &lt;enumeration value="NotListed"/>
 *     &lt;enumeration value="Conflict"/>
 *     &lt;enumeration value="LaterShowing"/>
 *     &lt;enumeration value="Repeat"/>
 *     &lt;enumeration value="Inactive"/>
 *     &lt;enumeration value="NeverRecord"/>
 *     &lt;enumeration value="Offline"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RecStatus.Type")
@XmlEnum
public enum RecStatusType {

    @XmlEnumValue("Failing")
    FAILING("Failing"),
    @XmlEnumValue("MissedFuture")
    MISSED_FUTURE("MissedFuture"),
    @XmlEnumValue("Tuning")
    TUNING("Tuning"),
    @XmlEnumValue("Failed")
    FAILED("Failed"),
    @XmlEnumValue("TunerBusy")
    TUNER_BUSY("TunerBusy"),
    @XmlEnumValue("LowDiskSpace")
    LOW_DISK_SPACE("LowDiskSpace"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Missed")
    MISSED("Missed"),
    @XmlEnumValue("Aborted")
    ABORTED("Aborted"),
    @XmlEnumValue("Recorded")
    RECORDED("Recorded"),
    @XmlEnumValue("Recording")
    RECORDING("Recording"),
    @XmlEnumValue("WillRecord")
    WILL_RECORD("WillRecord"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("DontRecord")
    DONT_RECORD("DontRecord"),
    @XmlEnumValue("PreviousRecording")
    PREVIOUS_RECORDING("PreviousRecording"),
    @XmlEnumValue("CurrentRecording")
    CURRENT_RECORDING("CurrentRecording"),
    @XmlEnumValue("EarlierShowing")
    EARLIER_SHOWING("EarlierShowing"),
    @XmlEnumValue("TooManyRecordings")
    TOO_MANY_RECORDINGS("TooManyRecordings"),
    @XmlEnumValue("NotListed")
    NOT_LISTED("NotListed"),
    @XmlEnumValue("Conflict")
    CONFLICT("Conflict"),
    @XmlEnumValue("LaterShowing")
    LATER_SHOWING("LaterShowing"),
    @XmlEnumValue("Repeat")
    REPEAT("Repeat"),
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),
    @XmlEnumValue("NeverRecord")
    NEVER_RECORD("NeverRecord"),
    @XmlEnumValue("Offline")
    OFFLINE("Offline");
    private final String value;

    RecStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecStatusType fromValue(String v) {
        for (RecStatusType c: RecStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
