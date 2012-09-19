
package schemas.dynamics.microsoft.page.customer;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Tax_Document_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Tax_Document_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_blank_"/>
 *     &lt;enumeration value="Document_Post"/>
 *     &lt;enumeration value="Group_Batch"/>
 *     &lt;enumeration value="Prompt"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Tax_Document_Type")
@XmlEnum
public enum TaxDocumentType {

    @XmlEnumValue("_blank_")
    BLANK("_blank_"),
    @XmlEnumValue("Document_Post")
    DOCUMENT_POST("Document_Post"),
    @XmlEnumValue("Group_Batch")
    GROUP_BATCH("Group_Batch"),
    @XmlEnumValue("Prompt")
    PROMPT("Prompt");
    private final String value;

    TaxDocumentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxDocumentType fromValue(String v) {
        for (TaxDocumentType c: TaxDocumentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
