
package schemas.dynamics.microsoft.page.item;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Components_on_Sales_Orders.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Components_on_Sales_Orders">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_blank_"/>
 *     &lt;enumeration value="Show"/>
 *     &lt;enumeration value="Do_Not_Show"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Components_on_Sales_Orders")
@XmlEnum
public enum ComponentsOnSalesOrders {

    @XmlEnumValue("_blank_")
    BLANK("_blank_"),
    @XmlEnumValue("Show")
    SHOW("Show"),
    @XmlEnumValue("Do_Not_Show")
    DO_NOT_SHOW("Do_Not_Show");
    private final String value;

    ComponentsOnSalesOrders(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComponentsOnSalesOrders fromValue(String v) {
        for (ComponentsOnSalesOrders c: ComponentsOnSalesOrders.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
