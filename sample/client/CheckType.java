
package sample.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="checkType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXAM"/>
 *     &lt;enumeration value="PASSFAIL"/>
 *     &lt;enumeration value="PASSFAIL_DIFFERENTIAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "checkType")
@XmlEnum
public enum CheckType {

    EXAM,
    PASSFAIL,
    PASSFAIL_DIFFERENTIAL;

    public String value() {
        return name();
    }

    public static CheckType fromValue(String v) {
        return valueOf(v);
    }

}
