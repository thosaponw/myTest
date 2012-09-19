
package schemas.dynamics.microsoft.page.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Customer_Filter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Customer_Filter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Field" type="{urn:microsoft-dynamics-schemas/page/customer}Customer_Fields"/>
 *         &lt;element name="Criteria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer_Filter", propOrder = {
    "field",
    "criteria"
})
public class CustomerFilter {

    @XmlElement(name = "Field", required = true)
    protected CustomerFields field;
    @XmlElement(name = "Criteria", required = true)
    protected String criteria;

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerFields }
     *     
     */
    public CustomerFields getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerFields }
     *     
     */
    public void setField(CustomerFields value) {
        this.field = value;
    }

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriteria(String value) {
        this.criteria = value;
    }

}
