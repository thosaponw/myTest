
package schemas.dynamics.microsoft.page.customer;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Customer_Fields.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Customer_Fields">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="No"/>
 *     &lt;enumeration value="Name"/>
 *     &lt;enumeration value="Address"/>
 *     &lt;enumeration value="Address_2"/>
 *     &lt;enumeration value="Post_Code"/>
 *     &lt;enumeration value="County"/>
 *     &lt;enumeration value="Phone_No"/>
 *     &lt;enumeration value="Primary_Contact_No"/>
 *     &lt;enumeration value="Contact"/>
 *     &lt;enumeration value="City"/>
 *     &lt;enumeration value="Country_Region_Code"/>
 *     &lt;enumeration value="Search_Name"/>
 *     &lt;enumeration value="Balance_LCY"/>
 *     &lt;enumeration value="Credit_Limit_LCY"/>
 *     &lt;enumeration value="Post_Dated_Checks_LCY"/>
 *     &lt;enumeration value="_Balance_LCY_ABS_Post_Dated_Checks_LCY"/>
 *     &lt;enumeration value="Salesperson_Code"/>
 *     &lt;enumeration value="Responsibility_Center"/>
 *     &lt;enumeration value="Service_Zone_Code"/>
 *     &lt;enumeration value="Blocked"/>
 *     &lt;enumeration value="Last_Date_Modified"/>
 *     &lt;enumeration value="Fax_No"/>
 *     &lt;enumeration value="E_Mail"/>
 *     &lt;enumeration value="Home_Page"/>
 *     &lt;enumeration value="IC_Partner_Code"/>
 *     &lt;enumeration value="Bill_to_Customer_No"/>
 *     &lt;enumeration value="Invoice_Copies"/>
 *     &lt;enumeration value="Invoice_Disc_Code"/>
 *     &lt;enumeration value="Copy_Sell_to_Addr_to_Qte_From"/>
 *     &lt;enumeration value="Tax_Document_Type"/>
 *     &lt;enumeration value="Gen_Bus_Posting_Group"/>
 *     &lt;enumeration value="VAT_Bus_Posting_Group"/>
 *     &lt;enumeration value="WHT_Business_Posting_Group"/>
 *     &lt;enumeration value="Customer_Posting_Group"/>
 *     &lt;enumeration value="Customer_Price_Group"/>
 *     &lt;enumeration value="Customer_Disc_Group"/>
 *     &lt;enumeration value="Allow_Line_Disc"/>
 *     &lt;enumeration value="Prices_Including_VAT"/>
 *     &lt;enumeration value="Prepayment_Percent"/>
 *     &lt;enumeration value="Application_Method"/>
 *     &lt;enumeration value="Payment_Terms_Code"/>
 *     &lt;enumeration value="Payment_Method_Code"/>
 *     &lt;enumeration value="Reminder_Terms_Code"/>
 *     &lt;enumeration value="Fin_Charge_Terms_Code"/>
 *     &lt;enumeration value="Liq_Payment_Terms_Code"/>
 *     &lt;enumeration value="Print_Statements"/>
 *     &lt;enumeration value="Last_Statement_No"/>
 *     &lt;enumeration value="Block_Payment_Tolerance"/>
 *     &lt;enumeration value="Location_Code"/>
 *     &lt;enumeration value="Combine_Shipments"/>
 *     &lt;enumeration value="Reserve"/>
 *     &lt;enumeration value="Shipping_Advice"/>
 *     &lt;enumeration value="Shipment_Method_Code"/>
 *     &lt;enumeration value="Shipping_Agent_Code"/>
 *     &lt;enumeration value="Shipping_Agent_Service_Code"/>
 *     &lt;enumeration value="Shipping_Time"/>
 *     &lt;enumeration value="Base_Calendar_Code"/>
 *     &lt;enumeration value="Customized_Calendar"/>
 *     &lt;enumeration value="Currency_Code"/>
 *     &lt;enumeration value="Language_Code"/>
 *     &lt;enumeration value="Components_on_Sales_Orders"/>
 *     &lt;enumeration value="Components_on_Shipments"/>
 *     &lt;enumeration value="Components_on_Invoices"/>
 *     &lt;enumeration value="VAT_Registration_No"/>
 *     &lt;enumeration value="IRD_No"/>
 *     &lt;enumeration value="ABN"/>
 *     &lt;enumeration value="ABN_Division_Part_No"/>
 *     &lt;enumeration value="Registered"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Customer_Fields")
@XmlEnum
public enum CustomerFields {

    @XmlEnumValue("No")
    NO("No"),
    @XmlEnumValue("Name")
    NAME("Name"),
    @XmlEnumValue("Address")
    ADDRESS("Address"),
    @XmlEnumValue("Address_2")
    ADDRESS_2("Address_2"),
    @XmlEnumValue("Post_Code")
    POST_CODE("Post_Code"),
    @XmlEnumValue("County")
    COUNTY("County"),
    @XmlEnumValue("Phone_No")
    PHONE_NO("Phone_No"),
    @XmlEnumValue("Primary_Contact_No")
    PRIMARY_CONTACT_NO("Primary_Contact_No"),
    @XmlEnumValue("Contact")
    CONTACT("Contact"),
    @XmlEnumValue("City")
    CITY("City"),
    @XmlEnumValue("Country_Region_Code")
    COUNTRY_REGION_CODE("Country_Region_Code"),
    @XmlEnumValue("Search_Name")
    SEARCH_NAME("Search_Name"),
    @XmlEnumValue("Balance_LCY")
    BALANCE_LCY("Balance_LCY"),
    @XmlEnumValue("Credit_Limit_LCY")
    CREDIT_LIMIT_LCY("Credit_Limit_LCY"),
    @XmlEnumValue("Post_Dated_Checks_LCY")
    POST_DATED_CHECKS_LCY("Post_Dated_Checks_LCY"),
    @XmlEnumValue("_Balance_LCY_ABS_Post_Dated_Checks_LCY")
    BALANCE_LCY_ABS_POST_DATED_CHECKS_LCY("_Balance_LCY_ABS_Post_Dated_Checks_LCY"),
    @XmlEnumValue("Salesperson_Code")
    SALESPERSON_CODE("Salesperson_Code"),
    @XmlEnumValue("Responsibility_Center")
    RESPONSIBILITY_CENTER("Responsibility_Center"),
    @XmlEnumValue("Service_Zone_Code")
    SERVICE_ZONE_CODE("Service_Zone_Code"),
    @XmlEnumValue("Blocked")
    BLOCKED("Blocked"),
    @XmlEnumValue("Last_Date_Modified")
    LAST_DATE_MODIFIED("Last_Date_Modified"),
    @XmlEnumValue("Fax_No")
    FAX_NO("Fax_No"),
    @XmlEnumValue("E_Mail")
    E_MAIL("E_Mail"),
    @XmlEnumValue("Home_Page")
    HOME_PAGE("Home_Page"),
    @XmlEnumValue("IC_Partner_Code")
    IC_PARTNER_CODE("IC_Partner_Code"),
    @XmlEnumValue("Bill_to_Customer_No")
    BILL_TO_CUSTOMER_NO("Bill_to_Customer_No"),
    @XmlEnumValue("Invoice_Copies")
    INVOICE_COPIES("Invoice_Copies"),
    @XmlEnumValue("Invoice_Disc_Code")
    INVOICE_DISC_CODE("Invoice_Disc_Code"),
    @XmlEnumValue("Copy_Sell_to_Addr_to_Qte_From")
    COPY_SELL_TO_ADDR_TO_QTE_FROM("Copy_Sell_to_Addr_to_Qte_From"),
    @XmlEnumValue("Tax_Document_Type")
    TAX_DOCUMENT_TYPE("Tax_Document_Type"),
    @XmlEnumValue("Gen_Bus_Posting_Group")
    GEN_BUS_POSTING_GROUP("Gen_Bus_Posting_Group"),
    @XmlEnumValue("VAT_Bus_Posting_Group")
    VAT_BUS_POSTING_GROUP("VAT_Bus_Posting_Group"),
    @XmlEnumValue("WHT_Business_Posting_Group")
    WHT_BUSINESS_POSTING_GROUP("WHT_Business_Posting_Group"),
    @XmlEnumValue("Customer_Posting_Group")
    CUSTOMER_POSTING_GROUP("Customer_Posting_Group"),
    @XmlEnumValue("Customer_Price_Group")
    CUSTOMER_PRICE_GROUP("Customer_Price_Group"),
    @XmlEnumValue("Customer_Disc_Group")
    CUSTOMER_DISC_GROUP("Customer_Disc_Group"),
    @XmlEnumValue("Allow_Line_Disc")
    ALLOW_LINE_DISC("Allow_Line_Disc"),
    @XmlEnumValue("Prices_Including_VAT")
    PRICES_INCLUDING_VAT("Prices_Including_VAT"),
    @XmlEnumValue("Prepayment_Percent")
    PREPAYMENT_PERCENT("Prepayment_Percent"),
    @XmlEnumValue("Application_Method")
    APPLICATION_METHOD("Application_Method"),
    @XmlEnumValue("Payment_Terms_Code")
    PAYMENT_TERMS_CODE("Payment_Terms_Code"),
    @XmlEnumValue("Payment_Method_Code")
    PAYMENT_METHOD_CODE("Payment_Method_Code"),
    @XmlEnumValue("Reminder_Terms_Code")
    REMINDER_TERMS_CODE("Reminder_Terms_Code"),
    @XmlEnumValue("Fin_Charge_Terms_Code")
    FIN_CHARGE_TERMS_CODE("Fin_Charge_Terms_Code"),
    @XmlEnumValue("Liq_Payment_Terms_Code")
    LIQ_PAYMENT_TERMS_CODE("Liq_Payment_Terms_Code"),
    @XmlEnumValue("Print_Statements")
    PRINT_STATEMENTS("Print_Statements"),
    @XmlEnumValue("Last_Statement_No")
    LAST_STATEMENT_NO("Last_Statement_No"),
    @XmlEnumValue("Block_Payment_Tolerance")
    BLOCK_PAYMENT_TOLERANCE("Block_Payment_Tolerance"),
    @XmlEnumValue("Location_Code")
    LOCATION_CODE("Location_Code"),
    @XmlEnumValue("Combine_Shipments")
    COMBINE_SHIPMENTS("Combine_Shipments"),
    @XmlEnumValue("Reserve")
    RESERVE("Reserve"),
    @XmlEnumValue("Shipping_Advice")
    SHIPPING_ADVICE("Shipping_Advice"),
    @XmlEnumValue("Shipment_Method_Code")
    SHIPMENT_METHOD_CODE("Shipment_Method_Code"),
    @XmlEnumValue("Shipping_Agent_Code")
    SHIPPING_AGENT_CODE("Shipping_Agent_Code"),
    @XmlEnumValue("Shipping_Agent_Service_Code")
    SHIPPING_AGENT_SERVICE_CODE("Shipping_Agent_Service_Code"),
    @XmlEnumValue("Shipping_Time")
    SHIPPING_TIME("Shipping_Time"),
    @XmlEnumValue("Base_Calendar_Code")
    BASE_CALENDAR_CODE("Base_Calendar_Code"),
    @XmlEnumValue("Customized_Calendar")
    CUSTOMIZED_CALENDAR("Customized_Calendar"),
    @XmlEnumValue("Currency_Code")
    CURRENCY_CODE("Currency_Code"),
    @XmlEnumValue("Language_Code")
    LANGUAGE_CODE("Language_Code"),
    @XmlEnumValue("Components_on_Sales_Orders")
    COMPONENTS_ON_SALES_ORDERS("Components_on_Sales_Orders"),
    @XmlEnumValue("Components_on_Shipments")
    COMPONENTS_ON_SHIPMENTS("Components_on_Shipments"),
    @XmlEnumValue("Components_on_Invoices")
    COMPONENTS_ON_INVOICES("Components_on_Invoices"),
    @XmlEnumValue("VAT_Registration_No")
    VAT_REGISTRATION_NO("VAT_Registration_No"),
    @XmlEnumValue("IRD_No")
    IRD_NO("IRD_No"),
    ABN("ABN"),
    @XmlEnumValue("ABN_Division_Part_No")
    ABN_DIVISION_PART_NO("ABN_Division_Part_No"),
    @XmlEnumValue("Registered")
    REGISTERED("Registered");
    private final String value;

    CustomerFields(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerFields fromValue(String v) {
        for (CustomerFields c: CustomerFields.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
