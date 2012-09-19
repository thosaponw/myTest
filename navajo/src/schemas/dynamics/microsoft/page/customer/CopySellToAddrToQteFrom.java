
package schemas.dynamics.microsoft.page.customer;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Copy_Sell_to_Addr_to_Qte_From.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Copy_Sell_to_Addr_to_Qte_From">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Company"/>
 *     &lt;enumeration value="Person"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Copy_Sell_to_Addr_to_Qte_From")
@XmlEnum
public enum CopySellToAddrToQteFrom {

    @XmlEnumValue("Company")
    COMPANY("Company"),
    @XmlEnumValue("Person")
    PERSON("Person");
    private final String value;

    CopySellToAddrToQteFrom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CopySellToAddrToQteFrom fromValue(String v) {
        for (CopySellToAddrToQteFrom c: CopySellToAddrToQteFrom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
