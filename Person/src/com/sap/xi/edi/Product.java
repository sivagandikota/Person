
package com.sap.xi.edi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GlobalTradeItemNumber" type="{http://sap.com/xi/EDI}ProductStandardID" minOccurs="0"/&gt;
 *         &lt;element name="BuyerProductID" type="{http://sap.com/xi/EDI}ProductPartyID" minOccurs="0"/&gt;
 *         &lt;element name="SupplierProductID" type="{http://sap.com/xi/EDI}ProductPartyID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product", propOrder = {
    "globalTradeItemNumber",
    "buyerProductID",
    "supplierProductID"
})
public class Product {

    @XmlElement(name = "GlobalTradeItemNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String globalTradeItemNumber;
    @XmlElement(name = "BuyerProductID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String buyerProductID;
    @XmlElement(name = "SupplierProductID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String supplierProductID;

    /**
     * Gets the value of the globalTradeItemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalTradeItemNumber() {
        return globalTradeItemNumber;
    }

    /**
     * Sets the value of the globalTradeItemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalTradeItemNumber(String value) {
        this.globalTradeItemNumber = value;
    }

    /**
     * Gets the value of the buyerProductID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerProductID() {
        return buyerProductID;
    }

    /**
     * Sets the value of the buyerProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerProductID(String value) {
        this.buyerProductID = value;
    }

    /**
     * Gets the value of the supplierProductID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierProductID() {
        return supplierProductID;
    }

    /**
     * Sets the value of the supplierProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierProductID(String value) {
        this.supplierProductID = value;
    }

}
