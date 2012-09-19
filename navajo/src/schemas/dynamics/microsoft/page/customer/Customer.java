
package schemas.dynamics.microsoft.page.customer;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Customer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Post_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Primary_Contact_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country_Region_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Search_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Balance_LCY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Credit_Limit_LCY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Post_Dated_Checks_LCY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="_Balance_LCY_ABS_Post_Dated_Checks_LCY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Salesperson_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Responsibility_Center" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service_Zone_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Blocked" type="{urn:microsoft-dynamics-schemas/page/customer}Blocked" minOccurs="0"/>
 *         &lt;element name="Last_Date_Modified" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Fax_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="E_Mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Home_Page" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IC_Partner_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bill_to_Customer_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Invoice_Copies" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Invoice_Disc_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Copy_Sell_to_Addr_to_Qte_From" type="{urn:microsoft-dynamics-schemas/page/customer}Copy_Sell_to_Addr_to_Qte_From" minOccurs="0"/>
 *         &lt;element name="Tax_Document_Type" type="{urn:microsoft-dynamics-schemas/page/customer}Tax_Document_Type" minOccurs="0"/>
 *         &lt;element name="Gen_Bus_Posting_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VAT_Bus_Posting_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WHT_Business_Posting_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Posting_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Price_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Disc_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Allow_Line_Disc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Prices_Including_VAT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Prepayment_Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Application_Method" type="{urn:microsoft-dynamics-schemas/page/customer}Application_Method" minOccurs="0"/>
 *         &lt;element name="Payment_Terms_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Payment_Method_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reminder_Terms_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fin_Charge_Terms_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Liq_Payment_Terms_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Print_Statements" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Last_Statement_No" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Block_Payment_Tolerance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Location_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Combine_Shipments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Reserve" type="{urn:microsoft-dynamics-schemas/page/customer}Reserve" minOccurs="0"/>
 *         &lt;element name="Shipping_Advice" type="{urn:microsoft-dynamics-schemas/page/customer}Shipping_Advice" minOccurs="0"/>
 *         &lt;element name="Shipment_Method_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipping_Agent_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipping_Agent_Service_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipping_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Base_Calendar_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customized_Calendar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Language_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Components_on_Sales_Orders" type="{urn:microsoft-dynamics-schemas/page/customer}Components_on_Sales_Orders" minOccurs="0"/>
 *         &lt;element name="Components_on_Shipments" type="{urn:microsoft-dynamics-schemas/page/customer}Components_on_Shipments" minOccurs="0"/>
 *         &lt;element name="Components_on_Invoices" type="{urn:microsoft-dynamics-schemas/page/customer}Components_on_Invoices" minOccurs="0"/>
 *         &lt;element name="VAT_Registration_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IRD_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ABN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ABN_Division_Part_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Registered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer", propOrder = {
    "key",
    "no",
    "name",
    "address",
    "address2",
    "postCode",
    "county",
    "phoneNo",
    "primaryContactNo",
    "contact",
    "city",
    "countryRegionCode",
    "searchName",
    "balanceLCY",
    "creditLimitLCY",
    "postDatedChecksLCY",
    "balanceLCYABSPostDatedChecksLCY",
    "salespersonCode",
    "responsibilityCenter",
    "serviceZoneCode",
    "blocked",
    "lastDateModified",
    "faxNo",
    "eMail",
    "homePage",
    "icPartnerCode",
    "billToCustomerNo",
    "invoiceCopies",
    "invoiceDiscCode",
    "copySellToAddrToQteFrom",
    "taxDocumentType",
    "genBusPostingGroup",
    "vatBusPostingGroup",
    "whtBusinessPostingGroup",
    "customerPostingGroup",
    "customerPriceGroup",
    "customerDiscGroup",
    "allowLineDisc",
    "pricesIncludingVAT",
    "prepaymentPercent",
    "applicationMethod",
    "paymentTermsCode",
    "paymentMethodCode",
    "reminderTermsCode",
    "finChargeTermsCode",
    "liqPaymentTermsCode",
    "printStatements",
    "lastStatementNo",
    "blockPaymentTolerance",
    "locationCode",
    "combineShipments",
    "reserve",
    "shippingAdvice",
    "shipmentMethodCode",
    "shippingAgentCode",
    "shippingAgentServiceCode",
    "shippingTime",
    "baseCalendarCode",
    "customizedCalendar",
    "currencyCode",
    "languageCode",
    "componentsOnSalesOrders",
    "componentsOnShipments",
    "componentsOnInvoices",
    "vatRegistrationNo",
    "irdNo",
    "abn",
    "abnDivisionPartNo",
    "registered"
})
public class Customer {

    @XmlElement(name = "Key")
    protected String key;
    @XmlElement(name = "No")
    protected String no;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "Address_2")
    protected String address2;
    @XmlElement(name = "Post_Code")
    protected String postCode;
    @XmlElement(name = "County")
    protected String county;
    @XmlElement(name = "Phone_No")
    protected String phoneNo;
    @XmlElement(name = "Primary_Contact_No")
    protected String primaryContactNo;
    @XmlElement(name = "Contact")
    protected String contact;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "Country_Region_Code")
    protected String countryRegionCode;
    @XmlElement(name = "Search_Name")
    protected String searchName;
    @XmlElement(name = "Balance_LCY")
    protected BigDecimal balanceLCY;
    @XmlElement(name = "Credit_Limit_LCY")
    protected BigDecimal creditLimitLCY;
    @XmlElement(name = "Post_Dated_Checks_LCY")
    protected BigDecimal postDatedChecksLCY;
    @XmlElement(name = "_Balance_LCY_ABS_Post_Dated_Checks_LCY")
    protected BigDecimal balanceLCYABSPostDatedChecksLCY;
    @XmlElement(name = "Salesperson_Code")
    protected String salespersonCode;
    @XmlElement(name = "Responsibility_Center")
    protected String responsibilityCenter;
    @XmlElement(name = "Service_Zone_Code")
    protected String serviceZoneCode;
    @XmlElement(name = "Blocked")
    protected Blocked blocked;
    @XmlElement(name = "Last_Date_Modified")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastDateModified;
    @XmlElement(name = "Fax_No")
    protected String faxNo;
    @XmlElement(name = "E_Mail")
    protected String eMail;
    @XmlElement(name = "Home_Page")
    protected String homePage;
    @XmlElement(name = "IC_Partner_Code")
    protected String icPartnerCode;
    @XmlElement(name = "Bill_to_Customer_No")
    protected String billToCustomerNo;
    @XmlElement(name = "Invoice_Copies")
    protected Integer invoiceCopies;
    @XmlElement(name = "Invoice_Disc_Code")
    protected String invoiceDiscCode;
    @XmlElement(name = "Copy_Sell_to_Addr_to_Qte_From")
    protected CopySellToAddrToQteFrom copySellToAddrToQteFrom;
    @XmlElement(name = "Tax_Document_Type")
    protected TaxDocumentType taxDocumentType;
    @XmlElement(name = "Gen_Bus_Posting_Group")
    protected String genBusPostingGroup;
    @XmlElement(name = "VAT_Bus_Posting_Group")
    protected String vatBusPostingGroup;
    @XmlElement(name = "WHT_Business_Posting_Group")
    protected String whtBusinessPostingGroup;
    @XmlElement(name = "Customer_Posting_Group")
    protected String customerPostingGroup;
    @XmlElement(name = "Customer_Price_Group")
    protected String customerPriceGroup;
    @XmlElement(name = "Customer_Disc_Group")
    protected String customerDiscGroup;
    @XmlElement(name = "Allow_Line_Disc")
    protected Boolean allowLineDisc;
    @XmlElement(name = "Prices_Including_VAT")
    protected Boolean pricesIncludingVAT;
    @XmlElement(name = "Prepayment_Percent")
    protected BigDecimal prepaymentPercent;
    @XmlElement(name = "Application_Method")
    protected ApplicationMethod applicationMethod;
    @XmlElement(name = "Payment_Terms_Code")
    protected String paymentTermsCode;
    @XmlElement(name = "Payment_Method_Code")
    protected String paymentMethodCode;
    @XmlElement(name = "Reminder_Terms_Code")
    protected String reminderTermsCode;
    @XmlElement(name = "Fin_Charge_Terms_Code")
    protected String finChargeTermsCode;
    @XmlElement(name = "Liq_Payment_Terms_Code")
    protected String liqPaymentTermsCode;
    @XmlElement(name = "Print_Statements")
    protected Boolean printStatements;
    @XmlElement(name = "Last_Statement_No")
    protected Integer lastStatementNo;
    @XmlElement(name = "Block_Payment_Tolerance")
    protected Boolean blockPaymentTolerance;
    @XmlElement(name = "Location_Code")
    protected String locationCode;
    @XmlElement(name = "Combine_Shipments")
    protected Boolean combineShipments;
    @XmlElement(name = "Reserve")
    protected Reserve reserve;
    @XmlElement(name = "Shipping_Advice")
    protected ShippingAdvice shippingAdvice;
    @XmlElement(name = "Shipment_Method_Code")
    protected String shipmentMethodCode;
    @XmlElement(name = "Shipping_Agent_Code")
    protected String shippingAgentCode;
    @XmlElement(name = "Shipping_Agent_Service_Code")
    protected String shippingAgentServiceCode;
    @XmlElement(name = "Shipping_Time")
    protected String shippingTime;
    @XmlElement(name = "Base_Calendar_Code")
    protected String baseCalendarCode;
    @XmlElement(name = "Customized_Calendar")
    protected String customizedCalendar;
    @XmlElement(name = "Currency_Code")
    protected String currencyCode;
    @XmlElement(name = "Language_Code")
    protected String languageCode;
    @XmlElement(name = "Components_on_Sales_Orders")
    protected ComponentsOnSalesOrders componentsOnSalesOrders;
    @XmlElement(name = "Components_on_Shipments")
    protected ComponentsOnShipments componentsOnShipments;
    @XmlElement(name = "Components_on_Invoices")
    protected ComponentsOnInvoices componentsOnInvoices;
    @XmlElement(name = "VAT_Registration_No")
    protected String vatRegistrationNo;
    @XmlElement(name = "IRD_No")
    protected String irdNo;
    @XmlElement(name = "ABN")
    protected String abn;
    @XmlElement(name = "ABN_Division_Part_No")
    protected String abnDivisionPartNo;
    @XmlElement(name = "Registered")
    protected Boolean registered;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the no property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNo() {
        return no;
    }

    /**
     * Sets the value of the no property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNo(String value) {
        this.no = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * Gets the value of the phoneNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * Sets the value of the phoneNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNo(String value) {
        this.phoneNo = value;
    }

    /**
     * Gets the value of the primaryContactNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryContactNo() {
        return primaryContactNo;
    }

    /**
     * Sets the value of the primaryContactNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryContactNo(String value) {
        this.primaryContactNo = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact(String value) {
        this.contact = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the countryRegionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryRegionCode() {
        return countryRegionCode;
    }

    /**
     * Sets the value of the countryRegionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryRegionCode(String value) {
        this.countryRegionCode = value;
    }

    /**
     * Gets the value of the searchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchName() {
        return searchName;
    }

    /**
     * Sets the value of the searchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchName(String value) {
        this.searchName = value;
    }

    /**
     * Gets the value of the balanceLCY property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalanceLCY() {
        return balanceLCY;
    }

    /**
     * Sets the value of the balanceLCY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalanceLCY(BigDecimal value) {
        this.balanceLCY = value;
    }

    /**
     * Gets the value of the creditLimitLCY property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditLimitLCY() {
        return creditLimitLCY;
    }

    /**
     * Sets the value of the creditLimitLCY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditLimitLCY(BigDecimal value) {
        this.creditLimitLCY = value;
    }

    /**
     * Gets the value of the postDatedChecksLCY property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPostDatedChecksLCY() {
        return postDatedChecksLCY;
    }

    /**
     * Sets the value of the postDatedChecksLCY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPostDatedChecksLCY(BigDecimal value) {
        this.postDatedChecksLCY = value;
    }

    /**
     * Gets the value of the balanceLCYABSPostDatedChecksLCY property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalanceLCYABSPostDatedChecksLCY() {
        return balanceLCYABSPostDatedChecksLCY;
    }

    /**
     * Sets the value of the balanceLCYABSPostDatedChecksLCY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalanceLCYABSPostDatedChecksLCY(BigDecimal value) {
        this.balanceLCYABSPostDatedChecksLCY = value;
    }

    /**
     * Gets the value of the salespersonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalespersonCode() {
        return salespersonCode;
    }

    /**
     * Sets the value of the salespersonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalespersonCode(String value) {
        this.salespersonCode = value;
    }

    /**
     * Gets the value of the responsibilityCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsibilityCenter() {
        return responsibilityCenter;
    }

    /**
     * Sets the value of the responsibilityCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsibilityCenter(String value) {
        this.responsibilityCenter = value;
    }

    /**
     * Gets the value of the serviceZoneCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceZoneCode() {
        return serviceZoneCode;
    }

    /**
     * Sets the value of the serviceZoneCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceZoneCode(String value) {
        this.serviceZoneCode = value;
    }

    /**
     * Gets the value of the blocked property.
     * 
     * @return
     *     possible object is
     *     {@link Blocked }
     *     
     */
    public Blocked getBlocked() {
        return blocked;
    }

    /**
     * Sets the value of the blocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Blocked }
     *     
     */
    public void setBlocked(Blocked value) {
        this.blocked = value;
    }

    /**
     * Gets the value of the lastDateModified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDateModified() {
        return lastDateModified;
    }

    /**
     * Sets the value of the lastDateModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDateModified(XMLGregorianCalendar value) {
        this.lastDateModified = value;
    }

    /**
     * Gets the value of the faxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNo() {
        return faxNo;
    }

    /**
     * Sets the value of the faxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNo(String value) {
        this.faxNo = value;
    }

    /**
     * Gets the value of the eMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * Sets the value of the eMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMail(String value) {
        this.eMail = value;
    }

    /**
     * Gets the value of the homePage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePage() {
        return homePage;
    }

    /**
     * Sets the value of the homePage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePage(String value) {
        this.homePage = value;
    }

    /**
     * Gets the value of the icPartnerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICPartnerCode() {
        return icPartnerCode;
    }

    /**
     * Sets the value of the icPartnerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICPartnerCode(String value) {
        this.icPartnerCode = value;
    }

    /**
     * Gets the value of the billToCustomerNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToCustomerNo() {
        return billToCustomerNo;
    }

    /**
     * Sets the value of the billToCustomerNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToCustomerNo(String value) {
        this.billToCustomerNo = value;
    }

    /**
     * Gets the value of the invoiceCopies property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInvoiceCopies() {
        return invoiceCopies;
    }

    /**
     * Sets the value of the invoiceCopies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInvoiceCopies(Integer value) {
        this.invoiceCopies = value;
    }

    /**
     * Gets the value of the invoiceDiscCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceDiscCode() {
        return invoiceDiscCode;
    }

    /**
     * Sets the value of the invoiceDiscCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceDiscCode(String value) {
        this.invoiceDiscCode = value;
    }

    /**
     * Gets the value of the copySellToAddrToQteFrom property.
     * 
     * @return
     *     possible object is
     *     {@link CopySellToAddrToQteFrom }
     *     
     */
    public CopySellToAddrToQteFrom getCopySellToAddrToQteFrom() {
        return copySellToAddrToQteFrom;
    }

    /**
     * Sets the value of the copySellToAddrToQteFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopySellToAddrToQteFrom }
     *     
     */
    public void setCopySellToAddrToQteFrom(CopySellToAddrToQteFrom value) {
        this.copySellToAddrToQteFrom = value;
    }

    /**
     * Gets the value of the taxDocumentType property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDocumentType }
     *     
     */
    public TaxDocumentType getTaxDocumentType() {
        return taxDocumentType;
    }

    /**
     * Sets the value of the taxDocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDocumentType }
     *     
     */
    public void setTaxDocumentType(TaxDocumentType value) {
        this.taxDocumentType = value;
    }

    /**
     * Gets the value of the genBusPostingGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenBusPostingGroup() {
        return genBusPostingGroup;
    }

    /**
     * Sets the value of the genBusPostingGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenBusPostingGroup(String value) {
        this.genBusPostingGroup = value;
    }

    /**
     * Gets the value of the vatBusPostingGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATBusPostingGroup() {
        return vatBusPostingGroup;
    }

    /**
     * Sets the value of the vatBusPostingGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVATBusPostingGroup(String value) {
        this.vatBusPostingGroup = value;
    }

    /**
     * Gets the value of the whtBusinessPostingGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWHTBusinessPostingGroup() {
        return whtBusinessPostingGroup;
    }

    /**
     * Sets the value of the whtBusinessPostingGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWHTBusinessPostingGroup(String value) {
        this.whtBusinessPostingGroup = value;
    }

    /**
     * Gets the value of the customerPostingGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPostingGroup() {
        return customerPostingGroup;
    }

    /**
     * Sets the value of the customerPostingGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPostingGroup(String value) {
        this.customerPostingGroup = value;
    }

    /**
     * Gets the value of the customerPriceGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPriceGroup() {
        return customerPriceGroup;
    }

    /**
     * Sets the value of the customerPriceGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPriceGroup(String value) {
        this.customerPriceGroup = value;
    }

    /**
     * Gets the value of the customerDiscGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerDiscGroup() {
        return customerDiscGroup;
    }

    /**
     * Sets the value of the customerDiscGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerDiscGroup(String value) {
        this.customerDiscGroup = value;
    }

    /**
     * Gets the value of the allowLineDisc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowLineDisc() {
        return allowLineDisc;
    }

    /**
     * Sets the value of the allowLineDisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowLineDisc(Boolean value) {
        this.allowLineDisc = value;
    }

    /**
     * Gets the value of the pricesIncludingVAT property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPricesIncludingVAT() {
        return pricesIncludingVAT;
    }

    /**
     * Sets the value of the pricesIncludingVAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPricesIncludingVAT(Boolean value) {
        this.pricesIncludingVAT = value;
    }

    /**
     * Gets the value of the prepaymentPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrepaymentPercent() {
        return prepaymentPercent;
    }

    /**
     * Sets the value of the prepaymentPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrepaymentPercent(BigDecimal value) {
        this.prepaymentPercent = value;
    }

    /**
     * Gets the value of the applicationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationMethod }
     *     
     */
    public ApplicationMethod getApplicationMethod() {
        return applicationMethod;
    }

    /**
     * Sets the value of the applicationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationMethod }
     *     
     */
    public void setApplicationMethod(ApplicationMethod value) {
        this.applicationMethod = value;
    }

    /**
     * Gets the value of the paymentTermsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTermsCode() {
        return paymentTermsCode;
    }

    /**
     * Sets the value of the paymentTermsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTermsCode(String value) {
        this.paymentTermsCode = value;
    }

    /**
     * Gets the value of the paymentMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethodCode() {
        return paymentMethodCode;
    }

    /**
     * Sets the value of the paymentMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethodCode(String value) {
        this.paymentMethodCode = value;
    }

    /**
     * Gets the value of the reminderTermsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReminderTermsCode() {
        return reminderTermsCode;
    }

    /**
     * Sets the value of the reminderTermsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReminderTermsCode(String value) {
        this.reminderTermsCode = value;
    }

    /**
     * Gets the value of the finChargeTermsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinChargeTermsCode() {
        return finChargeTermsCode;
    }

    /**
     * Sets the value of the finChargeTermsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinChargeTermsCode(String value) {
        this.finChargeTermsCode = value;
    }

    /**
     * Gets the value of the liqPaymentTermsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiqPaymentTermsCode() {
        return liqPaymentTermsCode;
    }

    /**
     * Sets the value of the liqPaymentTermsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiqPaymentTermsCode(String value) {
        this.liqPaymentTermsCode = value;
    }

    /**
     * Gets the value of the printStatements property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrintStatements() {
        return printStatements;
    }

    /**
     * Sets the value of the printStatements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintStatements(Boolean value) {
        this.printStatements = value;
    }

    /**
     * Gets the value of the lastStatementNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastStatementNo() {
        return lastStatementNo;
    }

    /**
     * Sets the value of the lastStatementNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastStatementNo(Integer value) {
        this.lastStatementNo = value;
    }

    /**
     * Gets the value of the blockPaymentTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlockPaymentTolerance() {
        return blockPaymentTolerance;
    }

    /**
     * Sets the value of the blockPaymentTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlockPaymentTolerance(Boolean value) {
        this.blockPaymentTolerance = value;
    }

    /**
     * Gets the value of the locationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
    }

    /**
     * Gets the value of the combineShipments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCombineShipments() {
        return combineShipments;
    }

    /**
     * Sets the value of the combineShipments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCombineShipments(Boolean value) {
        this.combineShipments = value;
    }

    /**
     * Gets the value of the reserve property.
     * 
     * @return
     *     possible object is
     *     {@link Reserve }
     *     
     */
    public Reserve getReserve() {
        return reserve;
    }

    /**
     * Sets the value of the reserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reserve }
     *     
     */
    public void setReserve(Reserve value) {
        this.reserve = value;
    }

    /**
     * Gets the value of the shippingAdvice property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingAdvice }
     *     
     */
    public ShippingAdvice getShippingAdvice() {
        return shippingAdvice;
    }

    /**
     * Sets the value of the shippingAdvice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingAdvice }
     *     
     */
    public void setShippingAdvice(ShippingAdvice value) {
        this.shippingAdvice = value;
    }

    /**
     * Gets the value of the shipmentMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentMethodCode() {
        return shipmentMethodCode;
    }

    /**
     * Sets the value of the shipmentMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentMethodCode(String value) {
        this.shipmentMethodCode = value;
    }

    /**
     * Gets the value of the shippingAgentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAgentCode() {
        return shippingAgentCode;
    }

    /**
     * Sets the value of the shippingAgentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAgentCode(String value) {
        this.shippingAgentCode = value;
    }

    /**
     * Gets the value of the shippingAgentServiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAgentServiceCode() {
        return shippingAgentServiceCode;
    }

    /**
     * Sets the value of the shippingAgentServiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAgentServiceCode(String value) {
        this.shippingAgentServiceCode = value;
    }

    /**
     * Gets the value of the shippingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingTime() {
        return shippingTime;
    }

    /**
     * Sets the value of the shippingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingTime(String value) {
        this.shippingTime = value;
    }

    /**
     * Gets the value of the baseCalendarCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCalendarCode() {
        return baseCalendarCode;
    }

    /**
     * Sets the value of the baseCalendarCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCalendarCode(String value) {
        this.baseCalendarCode = value;
    }

    /**
     * Gets the value of the customizedCalendar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomizedCalendar() {
        return customizedCalendar;
    }

    /**
     * Sets the value of the customizedCalendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomizedCalendar(String value) {
        this.customizedCalendar = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the componentsOnSalesOrders property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentsOnSalesOrders }
     *     
     */
    public ComponentsOnSalesOrders getComponentsOnSalesOrders() {
        return componentsOnSalesOrders;
    }

    /**
     * Sets the value of the componentsOnSalesOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentsOnSalesOrders }
     *     
     */
    public void setComponentsOnSalesOrders(ComponentsOnSalesOrders value) {
        this.componentsOnSalesOrders = value;
    }

    /**
     * Gets the value of the componentsOnShipments property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentsOnShipments }
     *     
     */
    public ComponentsOnShipments getComponentsOnShipments() {
        return componentsOnShipments;
    }

    /**
     * Sets the value of the componentsOnShipments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentsOnShipments }
     *     
     */
    public void setComponentsOnShipments(ComponentsOnShipments value) {
        this.componentsOnShipments = value;
    }

    /**
     * Gets the value of the componentsOnInvoices property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentsOnInvoices }
     *     
     */
    public ComponentsOnInvoices getComponentsOnInvoices() {
        return componentsOnInvoices;
    }

    /**
     * Sets the value of the componentsOnInvoices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentsOnInvoices }
     *     
     */
    public void setComponentsOnInvoices(ComponentsOnInvoices value) {
        this.componentsOnInvoices = value;
    }

    /**
     * Gets the value of the vatRegistrationNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATRegistrationNo() {
        return vatRegistrationNo;
    }

    /**
     * Sets the value of the vatRegistrationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVATRegistrationNo(String value) {
        this.vatRegistrationNo = value;
    }

    /**
     * Gets the value of the irdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIRDNo() {
        return irdNo;
    }

    /**
     * Sets the value of the irdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIRDNo(String value) {
        this.irdNo = value;
    }

    /**
     * Gets the value of the abn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABN() {
        return abn;
    }

    /**
     * Sets the value of the abn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABN(String value) {
        this.abn = value;
    }

    /**
     * Gets the value of the abnDivisionPartNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABNDivisionPartNo() {
        return abnDivisionPartNo;
    }

    /**
     * Sets the value of the abnDivisionPartNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABNDivisionPartNo(String value) {
        this.abnDivisionPartNo = value;
    }

    /**
     * Gets the value of the registered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegistered() {
        return registered;
    }

    /**
     * Sets the value of the registered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegistered(Boolean value) {
        this.registered = value;
    }

}
