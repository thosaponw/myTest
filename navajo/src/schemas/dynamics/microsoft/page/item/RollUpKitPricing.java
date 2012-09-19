
package schemas.dynamics.microsoft.page.item;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Roll_up_Kit_Pricing.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Roll_up_Kit_Pricing">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Never"/>
 *     &lt;enumeration value="Optional"/>
 *     &lt;enumeration value="Always"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Roll_up_Kit_Pricing")
@XmlEnum
public enum RollUpKitPricing {

    @XmlEnumValue("Never")
    NEVER("Never"),
    @XmlEnumValue("Optional")
    OPTIONAL("Optional"),
    @XmlEnumValue("Always")
    ALWAYS("Always");
    private final String value;

    RollUpKitPricing(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RollUpKitPricing fromValue(String v) {
        for (RollUpKitPricing c: RollUpKitPricing.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
