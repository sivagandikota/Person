
package com.sap.xi.edi;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SalesOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActionCode" type="{http://sap.com/xi/EDI}ActionCode" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseOrderID" type="{http://sap.com/xi/EDI}BusinessTransactionDocumentID" minOccurs="0"/&gt;
 *         &lt;element name="PurchasingDocumentType" type="{http://sap.com/xi/EDI}BusinessTransactionDocumentTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="PurchasingOrganization" type="{http://sap.com/xi/EDI}Organisation" minOccurs="0"/&gt;
 *         &lt;element name="PurchasingGroup" type="{http://sap.com/xi/EDI}Group" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseOrderCreationDate" type="{http://sap.com/xi/EDI}Date" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseOrderLastChangeDate" type="{http://sap.com/xi/EDI}Date" minOccurs="0"/&gt;
 *         &lt;element name="SalesOrderID" type="{http://sap.com/xi/EDI}BusinessTransactionDocumentID" minOccurs="0"/&gt;
 *         &lt;element name="SalesDocumentType" type="{http://sap.com/xi/EDI}BusinessTransactionDocumentTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="SalesOrganization" type="{http://sap.com/xi/EDI}Organisation" minOccurs="0"/&gt;
 *         &lt;element name="DistributionChannel" type="{http://sap.com/xi/EDI}DistributionChannelCode" minOccurs="0"/&gt;
 *         &lt;element name="OrganizationDivision" type="{http://sap.com/xi/EDI}DivisionCode" minOccurs="0"/&gt;
 *         &lt;element name="SalesGroup" type="{http://sap.com/xi/EDI}Group" minOccurs="0"/&gt;
 *         &lt;element name="SalesOffice" type="{http://sap.com/xi/EDI}Office" minOccurs="0"/&gt;
 *         &lt;element name="TransactionCurrency" type="{http://sap.com/xi/EDI}CurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="BuyerCompanyCodeCurrency" type="{http://sap.com/xi/EDI}CurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="BuyerExchangeRate" type="{http://sap.com/xi/EDI}ExchangeRateRate" minOccurs="0"/&gt;
 *         &lt;element name="CorrespondenceExternalReference" type="{http://sap.com/xi/EDI}Reference" minOccurs="0"/&gt;
 *         &lt;element name="ItemListIsCompletelyTransferred" type="{http://sap.com/xi/EDI}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="RetsMgmtIsActive" type="{http://sap.com/xi/EDI}RetsMgmtIsActive_GFN" minOccurs="0"/&gt;
 *         &lt;element name="Party" type="{http://sap.com/xi/EDI}Party" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RequestedDeliveryDate" type="{http://sap.com/xi/EDI}Date" minOccurs="0"/&gt;
 *         &lt;element name="UnloadingPointName" type="{http://sap.com/xi/EDI}LocationPoint" minOccurs="0"/&gt;
 *         &lt;element name="ReceivingPoint" type="{http://sap.com/xi/EDI}LocationPoint" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryBlockReason" type="{http://sap.com/xi/EDI}DeliveryBlockingReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="CompleteDeliveryIsDefined" type="{http://sap.com/xi/EDI}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="OrderCombinationIsAllowed" type="{http://sap.com/xi/EDI}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="HeaderIncoterms" type="{http://sap.com/xi/EDI}Incoterms" minOccurs="0"/&gt;
 *         &lt;element name="PaymentTerms" type="{http://sap.com/xi/EDI}CashDiscountTerms" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCard" type="{http://sap.com/xi/EDI}PaymentCard" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://sap.com/xi/EDI}Text" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OrderItem" type="{http://sap.com/xi/EDI}SalesOrderItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Attachment" type="{http://sap.com/xi/EDI}AttachmentSD" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://SAPCustomFields.com/YY1_}YY1_B7AOVEXIVYUCS25ZLFREKAXGT4_YY1_EDIUUID"/&gt;
 *         &lt;group ref="{http://SAPCustomFields.com/YY1_}YY1_IC4MJ4WWFAPM4GXP33BQCGJ7YA_YY1_POTypes"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
//,
//    "yy1EDIUUID",
//    "yy1POTypes"
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrder", propOrder = {
    "actionCode",
    "purchaseOrderID",
    "purchasingDocumentType",
    "purchasingOrganization",
    "purchasingGroup",
    "purchaseOrderCreationDate",
    "purchaseOrderLastChangeDate",
    "salesOrderID",
    "salesDocumentType",
    "salesOrganization",
    "distributionChannel",
    "organizationDivision",
    "salesGroup",
    "salesOffice",
    "transactionCurrency",
    "buyerCompanyCodeCurrency",
    "buyerExchangeRate",
    "correspondenceExternalReference",
    "itemListIsCompletelyTransferred",
    "retsMgmtIsActive",
    "party",
    "requestedDeliveryDate",
    "unloadingPointName",
    "receivingPoint",
    "deliveryBlockReason",
    "completeDeliveryIsDefined",
    "orderCombinationIsAllowed",
    "headerIncoterms",
    "paymentTerms",
    "paymentCard",
    "text",
    "orderItem",
    "attachment"
})
public class SalesOrder {

    @XmlElement(name = "ActionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String actionCode;
    @XmlElement(name = "PurchaseOrderID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String purchaseOrderID;
    @XmlElement(name = "PurchasingDocumentType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String purchasingDocumentType;
    @XmlElement(name = "PurchasingOrganization")
    protected String purchasingOrganization;
    @XmlElement(name = "PurchasingGroup")
    protected String purchasingGroup;
    @XmlElement(name = "PurchaseOrderCreationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar purchaseOrderCreationDate;
    @XmlElement(name = "PurchaseOrderLastChangeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar purchaseOrderLastChangeDate;
    @XmlElement(name = "SalesOrderID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String salesOrderID;
    @XmlElement(name = "SalesDocumentType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String salesDocumentType;
    @XmlElement(name = "SalesOrganization")
    protected String salesOrganization;
    @XmlElement(name = "DistributionChannel")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String distributionChannel;
    @XmlElement(name = "OrganizationDivision")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String organizationDivision;
    @XmlElement(name = "SalesGroup")
    protected String salesGroup;
    @XmlElement(name = "SalesOffice")
    protected String salesOffice;
    @XmlElement(name = "TransactionCurrency")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String transactionCurrency;
    @XmlElement(name = "BuyerCompanyCodeCurrency")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String buyerCompanyCodeCurrency;
    @XmlElement(name = "BuyerExchangeRate")
    protected BigDecimal buyerExchangeRate;
    @XmlElement(name = "CorrespondenceExternalReference")
    protected String correspondenceExternalReference;
    @XmlElement(name = "ItemListIsCompletelyTransferred")
    protected Boolean itemListIsCompletelyTransferred;
    @XmlElement(name = "RetsMgmtIsActive")
    protected Boolean retsMgmtIsActive;
    @XmlElement(name = "Party")
    protected List<Party> party;
    @XmlElement(name = "RequestedDeliveryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requestedDeliveryDate;
    @XmlElement(name = "UnloadingPointName")
    protected String unloadingPointName;
    @XmlElement(name = "ReceivingPoint")
    protected String receivingPoint;
    @XmlElement(name = "DeliveryBlockReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String deliveryBlockReason;
    @XmlElement(name = "CompleteDeliveryIsDefined")
    protected Boolean completeDeliveryIsDefined;
    @XmlElement(name = "OrderCombinationIsAllowed")
    protected Boolean orderCombinationIsAllowed;
    @XmlElement(name = "HeaderIncoterms")
    protected Incoterms headerIncoterms;
    @XmlElement(name = "PaymentTerms")
    protected CashDiscountTerms paymentTerms;
    @XmlElement(name = "PaymentCard")
    protected PaymentCard paymentCard;
    @XmlElement(name = "Text")
    protected List<Text> text;
    @XmlElement(name = "OrderItem")
    protected List<SalesOrderItem> orderItem;
    @XmlElement(name = "Attachment")
    protected List<AttachmentSD> attachment;
//    @XmlElementRef(name = "YY1_EDIUUID", namespace = "http://SAPCustomFields.com/YY1_", type = JAXBElement.class, required = false)
//    protected JAXBElement<String> yy1EDIUUID;
//    @XmlElementRef(name = "YY1_POTypes", namespace = "http://SAPCustomFields.com/YY1_", type = JAXBElement.class, required = false)
//    protected JAXBElement<String> yy1POTypes;

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

    /**
     * Gets the value of the purchaseOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseOrderID() {
        return purchaseOrderID;
    }

    /**
     * Sets the value of the purchaseOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseOrderID(String value) {
        this.purchaseOrderID = value;
    }

    /**
     * Gets the value of the purchasingDocumentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchasingDocumentType() {
        return purchasingDocumentType;
    }

    /**
     * Sets the value of the purchasingDocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchasingDocumentType(String value) {
        this.purchasingDocumentType = value;
    }

    /**
     * Gets the value of the purchasingOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchasingOrganization() {
        return purchasingOrganization;
    }

    /**
     * Sets the value of the purchasingOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchasingOrganization(String value) {
        this.purchasingOrganization = value;
    }

    /**
     * Gets the value of the purchasingGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchasingGroup() {
        return purchasingGroup;
    }

    /**
     * Sets the value of the purchasingGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchasingGroup(String value) {
        this.purchasingGroup = value;
    }

    /**
     * Gets the value of the purchaseOrderCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPurchaseOrderCreationDate() {
        return purchaseOrderCreationDate;
    }

    /**
     * Sets the value of the purchaseOrderCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPurchaseOrderCreationDate(XMLGregorianCalendar value) {
        this.purchaseOrderCreationDate = value;
    }

    /**
     * Gets the value of the purchaseOrderLastChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPurchaseOrderLastChangeDate() {
        return purchaseOrderLastChangeDate;
    }

    /**
     * Sets the value of the purchaseOrderLastChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPurchaseOrderLastChangeDate(XMLGregorianCalendar value) {
        this.purchaseOrderLastChangeDate = value;
    }

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
     * Gets the value of the salesDocumentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesDocumentType() {
        return salesDocumentType;
    }

    /**
     * Sets the value of the salesDocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesDocumentType(String value) {
        this.salesDocumentType = value;
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
     * Gets the value of the buyerCompanyCodeCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerCompanyCodeCurrency() {
        return buyerCompanyCodeCurrency;
    }

    /**
     * Sets the value of the buyerCompanyCodeCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerCompanyCodeCurrency(String value) {
        this.buyerCompanyCodeCurrency = value;
    }

    /**
     * Gets the value of the buyerExchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBuyerExchangeRate() {
        return buyerExchangeRate;
    }

    /**
     * Sets the value of the buyerExchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBuyerExchangeRate(BigDecimal value) {
        this.buyerExchangeRate = value;
    }

    /**
     * Gets the value of the correspondenceExternalReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondenceExternalReference() {
        return correspondenceExternalReference;
    }

    /**
     * Sets the value of the correspondenceExternalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondenceExternalReference(String value) {
        this.correspondenceExternalReference = value;
    }

    /**
     * Gets the value of the itemListIsCompletelyTransferred property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isItemListIsCompletelyTransferred() {
        return itemListIsCompletelyTransferred;
    }

    /**
     * Sets the value of the itemListIsCompletelyTransferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItemListIsCompletelyTransferred(Boolean value) {
        this.itemListIsCompletelyTransferred = value;
    }

    /**
     * Gets the value of the retsMgmtIsActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetsMgmtIsActive() {
        return retsMgmtIsActive;
    }

    /**
     * Sets the value of the retsMgmtIsActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetsMgmtIsActive(Boolean value) {
        this.retsMgmtIsActive = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the party property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Party }
     * 
     * 
     */
    public List<Party> getParty() {
        if (party == null) {
            party = new ArrayList<Party>();
        }
        return this.party;
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
     * Gets the value of the unloadingPointName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnloadingPointName() {
        return unloadingPointName;
    }

    /**
     * Sets the value of the unloadingPointName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnloadingPointName(String value) {
        this.unloadingPointName = value;
    }

    /**
     * Gets the value of the receivingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivingPoint() {
        return receivingPoint;
    }

    /**
     * Sets the value of the receivingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivingPoint(String value) {
        this.receivingPoint = value;
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
     * Gets the value of the orderCombinationIsAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderCombinationIsAllowed() {
        return orderCombinationIsAllowed;
    }

    /**
     * Sets the value of the orderCombinationIsAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderCombinationIsAllowed(Boolean value) {
        this.orderCombinationIsAllowed = value;
    }

    /**
     * Gets the value of the headerIncoterms property.
     * 
     * @return
     *     possible object is
     *     {@link Incoterms }
     *     
     */
    public Incoterms getHeaderIncoterms() {
        return headerIncoterms;
    }

    /**
     * Sets the value of the headerIncoterms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Incoterms }
     *     
     */
    public void setHeaderIncoterms(Incoterms value) {
        this.headerIncoterms = value;
    }

    /**
     * Gets the value of the paymentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link CashDiscountTerms }
     *     
     */
    public CashDiscountTerms getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * Sets the value of the paymentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashDiscountTerms }
     *     
     */
    public void setPaymentTerms(CashDiscountTerms value) {
        this.paymentTerms = value;
    }

    /**
     * Gets the value of the paymentCard property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard }
     *     
     */
    public PaymentCard getPaymentCard() {
        return paymentCard;
    }

    /**
     * Sets the value of the paymentCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard }
     *     
     */
    public void setPaymentCard(PaymentCard value) {
        this.paymentCard = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Text }
     * 
     * 
     */
    public List<Text> getText() {
        if (text == null) {
            text = new ArrayList<Text>();
        }
        return this.text;
    }

    /**
     * Gets the value of the orderItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderItem }
     * 
     * 
     */
    public List<SalesOrderItem> getOrderItem() {
        if (orderItem == null) {
            orderItem = new ArrayList<SalesOrderItem>();
        }
        return this.orderItem;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentSD }
     * 
     * 
     */
    public List<AttachmentSD> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<AttachmentSD>();
        }
        return this.attachment;
    }

    /**
     * Gets the value of the yy1EDIUUID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    public JAXBElement<String> getYY1EDIUUID() {
//        return yy1EDIUUID;
//    }

    /**
     * Sets the value of the yy1EDIUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    public void setYY1EDIUUID(JAXBElement<String> value) {
//        this.yy1EDIUUID = value;
//    }

    /**
     * Gets the value of the yy1POTypes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    public JAXBElement<String> getYY1POTypes() {
//        return yy1POTypes;
//    }

    /**
     * Sets the value of the yy1POTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    public void setYY1POTypes(JAXBElement<String> value) {
//        this.yy1POTypes = value;
//    }

}
