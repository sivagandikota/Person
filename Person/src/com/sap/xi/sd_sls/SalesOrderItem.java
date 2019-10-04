
package com.sap.xi.sd_sls;

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
import com.sap.xi.sd.ItemIncoterms;
import com.sap.xi.sd.Partner;
import com.sap.xi.sd.PricingElement;
import com.sap.xi.sd.global2.Quantity;


/**
 * <p>Java class for SalesOrderItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SalesOrderItemID" type="{http://sap.com/xi/SD/Global2}SalesOrderItem_GFN" minOccurs="0"/>
 *         &lt;element name="ExternalItemID" type="{http://sap.com/xi/SD/Global2}ExternalReferenceItemID" minOccurs="0"/>
 *         &lt;element name="HigherLevelItem" type="{http://sap.com/xi/SD/Global2}HigherLevelItem_GFN" minOccurs="0"/>
 *         &lt;element name="SalesOrderItemCategory" type="{http://sap.com/xi/SD/Global2}SalesOrderItemCategory_GFN" minOccurs="0"/>
 *         &lt;element name="SalesOrderItemText" type="{http://sap.com/xi/SD/Global2}LANGUAGEINDEPENDENT_SHORT_Description" minOccurs="0"/>
 *         &lt;element name="PurchaseOrderByCustomer" type="{http://sap.com/xi/SD/Global2}PurchaseOrderByCustomer_GFN" minOccurs="0"/>
 *         &lt;element name="PricingDate" type="{http://sap.com/xi/SD/Global2}Date" minOccurs="0"/>
 *         &lt;element name="CustomerPaymentTerms" type="{http://sap.com/xi/SD/Global2}CashDiscountTermsCode" minOccurs="0"/>
 *         &lt;element name="SalesDocumentRjcnReason" type="{http://sap.com/xi/SD/Global2}SalesDocumentRjcnReason_GFN" minOccurs="0"/>
 *         &lt;element name="ItemBillingBlockReason" type="{http://sap.com/xi/SD/Global2}ItemBillingBlockReason_GFN" minOccurs="0"/>
 *         &lt;element name="RequestedQuantity" type="{http://sap.com/xi/SD/Global2}Quantity" minOccurs="0"/>
 *         &lt;element name="Material" type="{http://sap.com/xi/SD/Global2}Material_GFN" minOccurs="0"/>
 *         &lt;element name="MaterialGroup" type="{http://sap.com/xi/SD/Global2}MaterialGroup_GFN" minOccurs="0"/>
 *         &lt;element name="Plant" type="{http://sap.com/xi/SD/Global2}PlantID" minOccurs="0"/>
 *         &lt;element name="StorageLocation" type="{http://sap.com/xi/SD/Global2}StorageLocationInternalID" minOccurs="0"/>
 *         &lt;element name="DeliveryGroup" type="{http://sap.com/xi/SD/Global2}DeliveryGroup_GFN" minOccurs="0"/>
 *         &lt;element name="ShippingPoint" type="{http://sap.com/xi/SD/Global2}ShippingPoint_GFN" minOccurs="0"/>
 *         &lt;element name="ShippingType" type="{http://sap.com/xi/SD/Global2}ShippingType_GFN" minOccurs="0"/>
 *         &lt;element name="DeliveryPriority" type="{http://sap.com/xi/SD/Global2}DeliveryPriority_GFN" minOccurs="0"/>
 *         &lt;element name="ItemIncoterms" type="{http://sap.com/xi/SD}ItemIncoterms" minOccurs="0"/>
 *         &lt;element name="PricingElement" type="{http://sap.com/xi/SD}PricingElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Partner" type="{http://sap.com/xi/SD}Partner" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="pricingElementListCompleteTransmissionIndicator" use="required" type="{http://sap.com/xi/SD/Global2}Indicator" />
 *       &lt;attribute name="partnerListCompleteTransmissionIndicator" use="required" type="{http://sap.com/xi/SD/Global2}Indicator" />
 *       &lt;attribute name="actionCode" use="required" type="{http://sap.com/xi/SD/Global2}ActionCode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderItem", propOrder = {
    "salesOrderItemID",
    "externalItemID",
    "higherLevelItem",
    "salesOrderItemCategory",
    "salesOrderItemText",
    "purchaseOrderByCustomer",
    "pricingDate",
    "customerPaymentTerms",
    "salesDocumentRjcnReason",
    "itemBillingBlockReason",
    "requestedQuantity",
    "material",
    "materialGroup",
    "plant",
    "storageLocation",
    "deliveryGroup",
    "shippingPoint",
    "shippingType",
    "deliveryPriority",
    "itemIncoterms",
    "pricingElement",
    "partner"
})
public class SalesOrderItem {

    @XmlElement(name = "SalesOrderItemID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String salesOrderItemID;
    @XmlElement(name = "ExternalItemID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String externalItemID;
    @XmlElement(name = "HigherLevelItem")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String higherLevelItem;
    @XmlElement(name = "SalesOrderItemCategory")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String salesOrderItemCategory;
    @XmlElement(name = "SalesOrderItemText")
    protected String salesOrderItemText;
    @XmlElement(name = "PurchaseOrderByCustomer")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String purchaseOrderByCustomer;
    @XmlElement(name = "PricingDate")
    protected XMLGregorianCalendar pricingDate;
    @XmlElement(name = "CustomerPaymentTerms")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String customerPaymentTerms;
    @XmlElement(name = "SalesDocumentRjcnReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String salesDocumentRjcnReason;
    @XmlElement(name = "ItemBillingBlockReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String itemBillingBlockReason;
    @XmlElement(name = "RequestedQuantity")
    protected Quantity requestedQuantity;
    @XmlElement(name = "Material")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String material;
    @XmlElement(name = "MaterialGroup")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String materialGroup;
    @XmlElement(name = "Plant")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String plant;
    @XmlElement(name = "StorageLocation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String storageLocation;
    @XmlElement(name = "DeliveryGroup")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String deliveryGroup;
    @XmlElement(name = "ShippingPoint")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shippingPoint;
    @XmlElement(name = "ShippingType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shippingType;
    @XmlElement(name = "DeliveryPriority")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String deliveryPriority;
    @XmlElement(name = "ItemIncoterms")
    protected ItemIncoterms itemIncoterms;
    @XmlElement(name = "PricingElement")
    protected List<PricingElement> pricingElement;
    @XmlElement(name = "Partner")
    protected List<Partner> partner;
    @XmlAttribute(name = "pricingElementListCompleteTransmissionIndicator", required = true)
    protected boolean pricingElementListCompleteTransmissionIndicator;
    @XmlAttribute(name = "partnerListCompleteTransmissionIndicator", required = true)
    protected boolean partnerListCompleteTransmissionIndicator;
    @XmlAttribute(name = "actionCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

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
     * Gets the value of the externalItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalItemID() {
        return externalItemID;
    }

    /**
     * Sets the value of the externalItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalItemID(String value) {
        this.externalItemID = value;
    }

    /**
     * Gets the value of the higherLevelItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHigherLevelItem() {
        return higherLevelItem;
    }

    /**
     * Sets the value of the higherLevelItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHigherLevelItem(String value) {
        this.higherLevelItem = value;
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
     * Gets the value of the salesOrderItemText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOrderItemText() {
        return salesOrderItemText;
    }

    /**
     * Sets the value of the salesOrderItemText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOrderItemText(String value) {
        this.salesOrderItemText = value;
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
     * Gets the value of the salesDocumentRjcnReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesDocumentRjcnReason() {
        return salesDocumentRjcnReason;
    }

    /**
     * Sets the value of the salesDocumentRjcnReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesDocumentRjcnReason(String value) {
        this.salesDocumentRjcnReason = value;
    }

    /**
     * Gets the value of the itemBillingBlockReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemBillingBlockReason() {
        return itemBillingBlockReason;
    }

    /**
     * Sets the value of the itemBillingBlockReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemBillingBlockReason(String value) {
        this.itemBillingBlockReason = value;
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
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Sets the value of the material property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterial(String value) {
        this.material = value;
    }

    /**
     * Gets the value of the materialGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialGroup() {
        return materialGroup;
    }

    /**
     * Sets the value of the materialGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialGroup(String value) {
        this.materialGroup = value;
    }

    /**
     * Gets the value of the plant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlant() {
        return plant;
    }

    /**
     * Sets the value of the plant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlant(String value) {
        this.plant = value;
    }

    /**
     * Gets the value of the storageLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageLocation() {
        return storageLocation;
    }

    /**
     * Sets the value of the storageLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageLocation(String value) {
        this.storageLocation = value;
    }

    /**
     * Gets the value of the deliveryGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryGroup() {
        return deliveryGroup;
    }

    /**
     * Sets the value of the deliveryGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryGroup(String value) {
        this.deliveryGroup = value;
    }

    /**
     * Gets the value of the shippingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingPoint() {
        return shippingPoint;
    }

    /**
     * Sets the value of the shippingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingPoint(String value) {
        this.shippingPoint = value;
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
     * Gets the value of the deliveryPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryPriority() {
        return deliveryPriority;
    }

    /**
     * Sets the value of the deliveryPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryPriority(String value) {
        this.deliveryPriority = value;
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
