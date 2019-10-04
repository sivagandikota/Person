
package com.sap.xi.edi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SalesOrderItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActionCode" type="{http://sap.com/xi/EDI}ActionCode" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseOrderItemID" type="{http://sap.com/xi/EDI}BusinessTransactionDocumentItemID" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseOrderItemCategory" type="{http://sap.com/xi/EDI}BusinessTransactionDocumentItemTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="SalesOrderItemID" type="{http://sap.com/xi/EDI}BusinessTransactionDocumentItemID" minOccurs="0"/&gt;
 *         &lt;element name="SalesOrderItemCategory" type="{http://sap.com/xi/EDI}BusinessTransactionDocumentItemTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="OrderItemText" type="{http://sap.com/xi/EDI}LANGUAGEINDEPENDENT_LONG_Text" minOccurs="0"/&gt;
 *         &lt;element name="ReturnInformation" type="{http://sap.com/xi/EDI}ReturnInformation" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceDocument" type="{http://sap.com/xi/EDI}ReferenceDocument" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RequestedQuantity" type="{http://sap.com/xi/EDI}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="ProductType" type="{http://sap.com/xi/EDI}ProductTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="Product" type="{http://sap.com/xi/EDI}Product" minOccurs="0"/&gt;
 *         &lt;element name="ExpectedNetPrice" type="{http://sap.com/xi/EDI}Price" minOccurs="0"/&gt;
 *         &lt;element name="ExpectedNetAmount" type="{http://sap.com/xi/EDI}Amount" minOccurs="0"/&gt;
 *         &lt;element name="MaximumNumberOfPartialDelivery" type="{http://sap.com/xi/EDI}MaximumNumberOfPartialDelivery" minOccurs="0"/&gt;
 *         &lt;element name="UnloadingPointName" type="{http://sap.com/xi/EDI}LocationPoint" minOccurs="0"/&gt;
 *         &lt;element name="ReceivingPoint" type="{http://sap.com/xi/EDI}LocationPoint" minOccurs="0"/&gt;
 *         &lt;element name="Party" type="{http://sap.com/xi/EDI}Party" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ItemIncoterms" type="{http://sap.com/xi/EDI}ItemIncoterms" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://sap.com/xi/EDI}Text" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ScheduleLine" type="{http://sap.com/xi/EDI}OrderItemScheduleLine" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderItem", propOrder = {
    "actionCode",
    "purchaseOrderItemID",
    "purchaseOrderItemCategory",
    "salesOrderItemID",
    "salesOrderItemCategory",
    "orderItemText",
    "returnInformation",
    "referenceDocument",
    "requestedQuantity",
    "productType",
    "product",
    "expectedNetPrice",
    "expectedNetAmount",
    "maximumNumberOfPartialDelivery",
    "unloadingPointName",
    "receivingPoint",
    "party",
    "itemIncoterms",
    "text",
    "scheduleLine"
})
public class SalesOrderItem {

    @XmlElement(name = "ActionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String actionCode;
    @XmlElement(name = "PurchaseOrderItemID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String purchaseOrderItemID;
    @XmlElement(name = "PurchaseOrderItemCategory")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String purchaseOrderItemCategory;
    @XmlElement(name = "SalesOrderItemID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String salesOrderItemID;
    @XmlElement(name = "SalesOrderItemCategory")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String salesOrderItemCategory;
    @XmlElement(name = "OrderItemText")
    protected String orderItemText;
    @XmlElement(name = "ReturnInformation")
    protected ReturnInformation returnInformation;
    @XmlElement(name = "ReferenceDocument")
    protected List<ReferenceDocument> referenceDocument;
    @XmlElement(name = "RequestedQuantity")
    protected Quantity requestedQuantity;
    @XmlElement(name = "ProductType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String productType;
    @XmlElement(name = "Product")
    protected Product product;
    @XmlElement(name = "ExpectedNetPrice")
    protected Price expectedNetPrice;
    @XmlElement(name = "ExpectedNetAmount")
    protected Amount expectedNetAmount;
    @XmlElement(name = "MaximumNumberOfPartialDelivery")
    protected Integer maximumNumberOfPartialDelivery;
    @XmlElement(name = "UnloadingPointName")
    protected String unloadingPointName;
    @XmlElement(name = "ReceivingPoint")
    protected String receivingPoint;
    @XmlElement(name = "Party")
    protected List<Party> party;
    @XmlElement(name = "ItemIncoterms")
    protected ItemIncoterms itemIncoterms;
    @XmlElement(name = "Text")
    protected List<Text> text;
    @XmlElement(name = "ScheduleLine")
    protected List<OrderItemScheduleLine> scheduleLine;

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
     * Gets the value of the purchaseOrderItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseOrderItemID() {
        return purchaseOrderItemID;
    }

    /**
     * Sets the value of the purchaseOrderItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseOrderItemID(String value) {
        this.purchaseOrderItemID = value;
    }

    /**
     * Gets the value of the purchaseOrderItemCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseOrderItemCategory() {
        return purchaseOrderItemCategory;
    }

    /**
     * Sets the value of the purchaseOrderItemCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseOrderItemCategory(String value) {
        this.purchaseOrderItemCategory = value;
    }

    /**
     * Gets the value of the salesOrderItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOrderItemID() {
        return salesOrderItemID;
    }

    /**
     * Sets the value of the salesOrderItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOrderItemID(String value) {
        this.salesOrderItemID = value;
    }

    /**
     * Gets the value of the salesOrderItemCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOrderItemCategory() {
        return salesOrderItemCategory;
    }

    /**
     * Sets the value of the salesOrderItemCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOrderItemCategory(String value) {
        this.salesOrderItemCategory = value;
    }

    /**
     * Gets the value of the orderItemText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderItemText() {
        return orderItemText;
    }

    /**
     * Sets the value of the orderItemText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderItemText(String value) {
        this.orderItemText = value;
    }

    /**
     * Gets the value of the returnInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnInformation }
     *     
     */
    public ReturnInformation getReturnInformation() {
        return returnInformation;
    }

    /**
     * Sets the value of the returnInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnInformation }
     *     
     */
    public void setReturnInformation(ReturnInformation value) {
        this.returnInformation = value;
    }

    /**
     * Gets the value of the referenceDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceDocument }
     * 
     * 
     */
    public List<ReferenceDocument> getReferenceDocument() {
        if (referenceDocument == null) {
            referenceDocument = new ArrayList<ReferenceDocument>();
        }
        return this.referenceDocument;
    }

    /**
     * Gets the value of the requestedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getRequestedQuantity() {
        return requestedQuantity;
    }

    /**
     * Sets the value of the requestedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setRequestedQuantity(Quantity value) {
        this.requestedQuantity = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduct(Product value) {
        this.product = value;
    }

    /**
     * Gets the value of the expectedNetPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getExpectedNetPrice() {
        return expectedNetPrice;
    }

    /**
     * Sets the value of the expectedNetPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setExpectedNetPrice(Price value) {
        this.expectedNetPrice = value;
    }

    /**
     * Gets the value of the expectedNetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getExpectedNetAmount() {
        return expectedNetAmount;
    }

    /**
     * Sets the value of the expectedNetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setExpectedNetAmount(Amount value) {
        this.expectedNetAmount = value;
    }

    /**
     * Gets the value of the maximumNumberOfPartialDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumNumberOfPartialDelivery() {
        return maximumNumberOfPartialDelivery;
    }

    /**
     * Sets the value of the maximumNumberOfPartialDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumNumberOfPartialDelivery(Integer value) {
        this.maximumNumberOfPartialDelivery = value;
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
     * Gets the value of the itemIncoterms property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIncoterms }
     *     
     */
    public ItemIncoterms getItemIncoterms() {
        return itemIncoterms;
    }

    /**
     * Sets the value of the itemIncoterms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIncoterms }
     *     
     */
    public void setItemIncoterms(ItemIncoterms value) {
        this.itemIncoterms = value;
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
     * Gets the value of the scheduleLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduleLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduleLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderItemScheduleLine }
     * 
     * 
     */
    public List<OrderItemScheduleLine> getScheduleLine() {
        if (scheduleLine == null) {
            scheduleLine = new ArrayList<OrderItemScheduleLine>();
        }
        return this.scheduleLine;
    }

}
