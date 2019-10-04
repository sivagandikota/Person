
package com.sap.xi.sd_sls;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sap.xi.sd.Incoterms;
import com.sap.xi.sd.Partner;
import com.sap.xi.sd.PaymentPlanItem;
import com.sap.xi.sd.PricingElement;


/**
 * <p>Java class for SalesOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SalesOrderID" type="{http://sap.com/xi/SD/Global2}SalesOrder_GFN" minOccurs="0"/>
 *         &lt;element name="ExternalDocumentID" type="{http://sap.com/xi/SD/Global2}ExternalReferenceKeyID" minOccurs="0"/>
 *         &lt;element name="ExternalDocLastChangeDateTime" type="{http://sap.com/xi/SD/Global2}GLOBAL_DateTime" minOccurs="0"/>
 *         &lt;element name="SalesOrderType" type="{http://sap.com/xi/SD/Global2}SalesDocumentType_GFN" minOccurs="0"/>
 *         &lt;element name="SalesOrganization" type="{http://sap.com/xi/SD/Global2}SalesOrganization_GFN" minOccurs="0"/>
 *         &lt;element name="DistributionChannel" type="{http://sap.com/xi/SD/Global2}DistributionChannelCode" minOccurs="0"/>
 *         &lt;element name="OrganizationDivision" type="{http://sap.com/xi/SD/Global2}DivisionCode" minOccurs="0"/>
 *         &lt;element name="SalesGroup" type="{http://sap.com/xi/SD/Global2}SalesGroup_GFN" minOccurs="0"/>
 *         &lt;element name="SalesOffice" type="{http://sap.com/xi/SD/Global2}SalesOffice_GFN" minOccurs="0"/>
 *         &lt;element name="SalesDistrict" type="{http://sap.com/xi/SD/Global2}SalesDistrict_GFN" minOccurs="0"/>
 *         &lt;element name="PurchaseOrderByCustomer" type="{http://sap.com/xi/SD/Global2}PurchaseOrderByCustomer_GFN" minOccurs="0"/>
 *         &lt;element name="CustomerPurchaseOrderType" type="{http://sap.com/xi/SD/Global2}CustomerPurchaseOrderType_GFN" minOccurs="0"/>
 *         &lt;element name="CustomerPurchaseOrderDate" type="{http://sap.com/xi/SD/Global2}Date" minOccurs="0"/>
 *         &lt;element name="SalesOrderDate" type="{http://sap.com/xi/SD/Global2}Date" minOccurs="0"/>
 *         &lt;element name="SDDocumentReason" type="{http://sap.com/xi/SD/Global2}SDDocumentReason_GFN" minOccurs="0"/>
 *         &lt;element name="TransactionCurrency" type="{http://sap.com/xi/SD/Global2}CurrencyCode" minOccurs="0"/>
 *         &lt;element name="PriceDetnExchangeRate" type="{http://sap.com/xi/SD/Global2}ExchangeRateRate" minOccurs="0"/>
 *         &lt;element name="PricingDate" type="{http://sap.com/xi/SD/Global2}Date" minOccurs="0"/>
 *         &lt;element name="HeaderBillingBlockReason" type="{http://sap.com/xi/SD/Global2}HeaderBillingBlockReason_GFN" minOccurs="0"/>
 *         &lt;element name="CustomerPaymentTerms" type="{http://sap.com/xi/SD/Global2}CashDiscountTermsCode" minOccurs="0"/>
 *         &lt;element name="PaymentMethod" type="{http://sap.com/xi/SD/Global2}PaymentProcedureCode" minOccurs="0"/>
 *         &lt;element name="AssignmentReference" type="{http://sap.com/xi/SD/Global2}AssignmentReference_GFN" minOccurs="0"/>
 *         &lt;element name="RequestedDeliveryDate" type="{http://sap.com/xi/SD/Global2}Date" minOccurs="0"/>
 *         &lt;element name="ShippingCondition" type="{http://sap.com/xi/SD/Global2}ShippingCondition_GFN" minOccurs="0"/>
 *         &lt;element name="ShippingType" type="{http://sap.com/xi/SD/Global2}ShippingType_GFN" minOccurs="0"/>
 *         &lt;element name="DeliveryBlockReason" type="{http://sap.com/xi/SD/Global2}DeliveryBlockingReasonCode" minOccurs="0"/>
 *         &lt;element name="CompleteDeliveryIsDefined" type="{http://sap.com/xi/SD/Global2}Indicator" minOccurs="0"/>
 *         &lt;element name="Incoterms" type="{http://sap.com/xi/SD}Incoterms" minOccurs="0"/>
 *         &lt;element name="PricingElement" type="{http://sap.com/xi/SD}PricingElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Partner" type="{http://sap.com/xi/SD}Partner" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentPlanItem" type="{http://sap.com/xi/SD}PaymentPlanItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Item" type="{http://sap.com/xi/SD-SLS}SalesOrderItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="itemListCompleteTransmissionIndicator" use="required" type="{http://sap.com/xi/SD/Global2}Indicator" />
 *       &lt;attribute name="pricingElementListCompleteTransmissionIndicator" use="required" type="{http://sap.com/xi/SD/Global2}Indicator" />
 *       &lt;attribute name="partnerListCompleteTransmissionIndicator" use="required" type="{http://sap.com/xi/SD/Global2}Indicator" />
 *       &lt;attribute name="paymentPlanItemListCompleteTransmissionIndicator" use="required" type="{http://sap.com/xi/SD/Global2}Indicator" />
 *       &lt;attribute name="actionCode" use="required" type="{http://sap.com/xi/SD/Global2}ActionCode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrder", propOrder = {
    "salesOrderID",
    "externalDocumentID",
    "externalDocLastChangeDateTime",
    "salesOrderType",
    "salesOrganization",
    "distributionChannel",
    "organizationDivision",
    "salesGroup",
    "salesOffice",
    "salesDistrict",
    "purchaseOrderByCustomer",
    "customerPurchaseOrderType",
    "customerPurchaseOrderDate",
    "salesOrderDate",
    "sdDocumentReason",
    "transactionCurrency",
    "priceDetnExchangeRate",
    "pricingDate",
    "headerBillingBlockReason",
    "customerPaymentTerms",
    "paymentMethod",
    "assignmentReference",
    "requestedDeliveryDate",
    "shippingCondition",
    "shippingType",
    "deliveryBlockReason",
    "completeDeliveryIsDefined",
    "incoterms",
    "pricingElement",
    "partner",
    "paymentPlanItem",
    "item"
})
public class SalesOrder {

    @XmlElement(name = "SalesOrderID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String salesOrderID;
    @XmlElement(name = "ExternalDocumentID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String externalDocumentID;
    @XmlElement(name = "ExternalDocLastChangeDateTime")
    protected XMLGregorianCalendar externalDocLastChangeDateTime;
    @XmlElement(name = "SalesOrderType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String salesOrderType;
    @XmlElement(name = "SalesOrganization")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String salesOrganization;
    @XmlElement(name = "DistributionChannel")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String distributionChannel;
    @XmlElement(name = "OrganizationDivision")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String organizationDivision;
    @XmlElement(name = "SalesGroup")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String salesGroup;
    @XmlElement(name = "SalesOffice")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String salesOffice;
    @XmlElement(name = "SalesDistrict")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String salesDistrict;
    @XmlElement(name = "PurchaseOrderByCustomer")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String purchaseOrderByCustomer;
    @XmlElement(name = "CustomerPurchaseOrderType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String customerPurchaseOrderType;
    @XmlElement(name = "CustomerPurchaseOrderDate")
    protected XMLGregorianCalendar customerPurchaseOrderDate;
    @XmlElement(name = "SalesOrderDate")
    protected XMLGregorianCalendar salesOrderDate;
    @XmlElement(name = "SDDocumentReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sdDocumentReason;
    @XmlElement(name = "TransactionCurrency")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String transactionCurrency;
    @XmlElement(name = "PriceDetnExchangeRate")
    protected BigDecimal priceDetnExchangeRate;
    @XmlElement(name = "PricingDate")
    protected XMLGregorianCalendar pricingDate;
    @XmlElement(name = "HeaderBillingBlockReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String headerBillingBlockReason;
    @XmlElement(name = "CustomerPaymentTerms")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String customerPaymentTerms;
    @XmlElement(name = "PaymentMethod")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String paymentMethod;
    @XmlElement(name = "AssignmentReference")
    protected String assignmentReference;
    @XmlElement(name = "RequestedDeliveryDate")
    protected XMLGregorianCalendar requestedDeliveryDate;
    @XmlElement(name = "ShippingCondition")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shippingCondition;
    @XmlElement(name = "ShippingType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shippingType;
    @XmlElement(name = "DeliveryBlockReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String deliveryBlockReason;
    @XmlElement(name = "CompleteDeliveryIsDefined")
    protected Boolean completeDeliveryIsDefined;
    @XmlElement(name = "Incoterms")
    protected Incoterms incoterms;
    @XmlElement(name = "PricingElement")
    protected List<PricingElement> pricingElement;
    @XmlElement(name = "Partner")
    protected List<Partner> partner;
    @XmlElement(name = "PaymentPlanItem")
    protected List<PaymentPlanItem> paymentPlanItem;
    @XmlElement(name = "Item")
    protected List<SalesOrderItem> item;
    @XmlAttribute(name = "itemListCompleteTransmissionIndicator", required = true)
    protected boolean itemListCompleteTransmissionIndicator;
    @XmlAttribute(name = "pricingElementListCompleteTransmissionIndicator", required = true)
    protected boolean pricingElementListCompleteTransmissionIndicator;
    @XmlAttribute(name = "partnerListCompleteTransmissionIndicator", required = true)
    protected boolean partnerListCompleteTransmissionIndicator;
    @XmlAttribute(name = "paymentPlanItemListCompleteTransmissionIndicator", required = true)
    protected boolean paymentPlanItemListCompleteTransmissionIndicator;
    @XmlAttribute(name = "actionCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

    /**
     * Gets the value of the salesOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOrderID() {
        return salesOrderID;
    }

    /**
     * Sets the value of the salesOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOrderID(String value) {
        this.salesOrderID = value;
    }

    /**
     * Gets the value of the externalDocumentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalDocumentID() {
        return externalDocumentID;
    }

    /**
     * Sets the value of the externalDocumentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalDocumentID(String value) {
        this.externalDocumentID = value;
    }

    /**
     * Gets the value of the externalDocLastChangeDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExternalDocLastChangeDateTime() {
        return externalDocLastChangeDateTime;
    }

    /**
     * Sets the value of the externalDocLastChangeDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExternalDocLastChangeDateTime(XMLGregorianCalendar value) {
        this.externalDocLastChangeDateTime = value;
    }

    /**
     * Gets the value of the salesOrderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOrderType() {
        return salesOrderType;
    }

    /**
     * Sets the value of the salesOrderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOrderType(String value) {
        this.salesOrderType = value;
    }

    /**
     * Gets the value of the salesOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOrganization() {
        return salesOrganization;
    }

    /**
     * Sets the value of the salesOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOrganization(String value) {
        this.salesOrganization = value;
    }

    /**
     * Gets the value of the distributionChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributionChannel() {
        return distributionChannel;
    }

    /**
     * Sets the value of the distributionChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributionChannel(String value) {
        this.distributionChannel = value;
    }

    /**
     * Gets the value of the organizationDivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationDivision() {
        return organizationDivision;
    }

    /**
     * Sets the value of the organizationDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationDivision(String value) {
        this.organizationDivision = value;
    }

    /**
     * Gets the value of the salesGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesGroup() {
        return salesGroup;
    }

    /**
     * Sets the value of the salesGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesGroup(String value) {
        this.salesGroup = value;
    }

    /**
     * Gets the value of the salesOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOffice() {
        return salesOffice;
    }

    /**
     * Sets the value of the salesOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOffice(String value) {
        this.salesOffice = value;
    }

    /**
     * Gets the value of the salesDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesDistrict() {
        return salesDistrict;
    }

    /**
     * Sets the value of the salesDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesDistrict(String value) {
        this.salesDistrict = value;
    }

    /**
     * Gets the value of the purchaseOrderByCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseOrderByCustomer() {
        return purchaseOrderByCustomer;
    }

    /**
     * Sets the value of the purchaseOrderByCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseOrderByCustomer(String value) {
        this.purchaseOrderByCustomer = value;
    }

    /**
     * Gets the value of the customerPurchaseOrderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPurchaseOrderType() {
        return customerPurchaseOrderType;
    }

    /**
     * Sets the value of the customerPurchaseOrderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPurchaseOrderType(String value) {
        this.customerPurchaseOrderType = value;
    }

    /**
     * Gets the value of the customerPurchaseOrderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCustomerPurchaseOrderDate() {
        return customerPurchaseOrderDate;
    }

    /**
     * Sets the value of the customerPurchaseOrderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCustomerPurchaseOrderDate(XMLGregorianCalendar value) {
        this.customerPurchaseOrderDate = value;
    }

    /**
     * Gets the value of the salesOrderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSalesOrderDate() {
        return salesOrderDate;
    }

    /**
     * Sets the value of the salesOrderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSalesOrderDate(XMLGregorianCalendar value) {
        this.salesOrderDate = value;
    }

    /**
     * Gets the value of the sdDocumentReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDDocumentReason() {
        return sdDocumentReason;
    }

    /**
     * Sets the value of the sdDocumentReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDDocumentReason(String value) {
        this.sdDocumentReason = value;
    }

    /**
     * Gets the value of the transactionCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCurrency() {
        return transactionCurrency;
    }

    /**
     * Sets the value of the transactionCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCurrency(String value) {
        this.transactionCurrency = value;
    }

    /**
     * Gets the value of the priceDetnExchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceDetnExchangeRate() {
        return priceDetnExchangeRate;
    }

    /**
     * Sets the value of the priceDetnExchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceDetnExchangeRate(BigDecimal value) {
        this.priceDetnExchangeRate = value;
    }

    /**
     * Gets the value of the pricingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPricingDate() {
        return pricingDate;
    }

    /**
     * Sets the value of the pricingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPricingDate(XMLGregorianCalendar value) {
        this.pricingDate = value;
    }

    /**
     * Gets the value of the headerBillingBlockReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderBillingBlockReason() {
        return headerBillingBlockReason;
    }

    /**
     * Sets the value of the headerBillingBlockReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderBillingBlockReason(String value) {
        this.headerBillingBlockReason = value;
    }

    /**
     * Gets the value of the customerPaymentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPaymentTerms() {
        return customerPaymentTerms;
    }

    /**
     * Sets the value of the customerPaymentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPaymentTerms(String value) {
        this.customerPaymentTerms = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the assignmentReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignmentReference() {
        return assignmentReference;
    }

    /**
     * Sets the value of the assignmentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignmentReference(String value) {
        this.assignmentReference = value;
    }

    /**
     * Gets the value of the requestedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestedDeliveryDate() {
        return requestedDeliveryDate;
    }

    /**
     * Sets the value of the requestedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestedDeliveryDate(XMLGregorianCalendar value) {
        this.requestedDeliveryDate = value;
    }

    /**
     * Gets the value of the shippingCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCondition() {
        return shippingCondition;
    }

    /**
     * Sets the value of the shippingCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCondition(String value) {
        this.shippingCondition = value;
    }

    /**
     * Gets the value of the shippingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingType() {
        return shippingType;
    }

    /**
     * Sets the value of the shippingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingType(String value) {
        this.shippingType = value;
    }

    /**
     * Gets the value of the deliveryBlockReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryBlockReason() {
        return deliveryBlockReason;
    }

    /**
     * Sets the value of the deliveryBlockReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryBlockReason(String value) {
        this.deliveryBlockReason = value;
    }

    /**
     * Gets the value of the completeDeliveryIsDefined property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompleteDeliveryIsDefined() {
        return completeDeliveryIsDefined;
    }

    /**
     * Sets the value of the completeDeliveryIsDefined property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompleteDeliveryIsDefined(Boolean value) {
        this.completeDeliveryIsDefined = value;
    }

    /**
     * Gets the value of the incoterms property.
     * 
     * @return
     *     possible object is
     *     {@link Incoterms }
     *     
     */
    public Incoterms getIncoterms() {
        return incoterms;
    }

    /**
     * Sets the value of the incoterms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Incoterms }
     *     
     */
    public void setIncoterms(Incoterms value) {
        this.incoterms = value;
    }

    /**
     * Gets the value of the pricingElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricingElement }
     * 
     * 
     */
    public List<PricingElement> getPricingElement() {
        if (pricingElement == null) {
            pricingElement = new ArrayList<PricingElement>();
        }
        return this.pricingElement;
    }

    /**
     * Gets the value of the partner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Partner }
     * 
     * 
     */
    public List<Partner> getPartner() {
        if (partner == null) {
            partner = new ArrayList<Partner>();
        }
        return this.partner;
    }

    /**
     * Gets the value of the paymentPlanItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentPlanItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentPlanItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentPlanItem }
     * 
     * 
     */
    public List<PaymentPlanItem> getPaymentPlanItem() {
        if (paymentPlanItem == null) {
            paymentPlanItem = new ArrayList<PaymentPlanItem>();
        }
        return this.paymentPlanItem;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderItem }
     * 
     * 
     */
    public List<SalesOrderItem> getItem() {
        if (item == null) {
            item = new ArrayList<SalesOrderItem>();
        }
        return this.item;
    }

    /**
     * Gets the value of the itemListCompleteTransmissionIndicator property.
     * 
     */
    public boolean isItemListCompleteTransmissionIndicator() {
        return itemListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the itemListCompleteTransmissionIndicator property.
     * 
     */
    public void setItemListCompleteTransmissionIndicator(boolean value) {
        this.itemListCompleteTransmissionIndicator = value;
    }

    /**
     * Gets the value of the pricingElementListCompleteTransmissionIndicator property.
     * 
     */
    public boolean isPricingElementListCompleteTransmissionIndicator() {
        return pricingElementListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the pricingElementListCompleteTransmissionIndicator property.
     * 
     */
    public void setPricingElementListCompleteTransmissionIndicator(boolean value) {
        this.pricingElementListCompleteTransmissionIndicator = value;
    }

    /**
     * Gets the value of the partnerListCompleteTransmissionIndicator property.
     * 
     */
    public boolean isPartnerListCompleteTransmissionIndicator() {
        return partnerListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the partnerListCompleteTransmissionIndicator property.
     * 
     */
    public void setPartnerListCompleteTransmissionIndicator(boolean value) {
        this.partnerListCompleteTransmissionIndicator = value;
    }

    /**
     * Gets the value of the paymentPlanItemListCompleteTransmissionIndicator property.
     * 
     */
    public boolean isPaymentPlanItemListCompleteTransmissionIndicator() {
        return paymentPlanItemListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the paymentPlanItemListCompleteTransmissionIndicator property.
     * 
     */
    public void setPaymentPlanItemListCompleteTransmissionIndicator(boolean value) {
        this.paymentPlanItemListCompleteTransmissionIndicator = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

}
