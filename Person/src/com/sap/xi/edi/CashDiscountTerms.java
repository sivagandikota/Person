
package com.sap.xi.edi;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CashDiscountTerms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CashDiscountTerms"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BuyerPaymentTermsID" type="{http://sap.com/xi/EDI}PaymentTerms" minOccurs="0"/&gt;
 *         &lt;element name="SupplierPaymentTermsID" type="{http://sap.com/xi/EDI}PaymentTerms" minOccurs="0"/&gt;
 *         &lt;element name="FixedValueDate" type="{http://sap.com/xi/EDI}Date" minOccurs="0"/&gt;
 *         &lt;element name="CashDiscount1Percent" type="{http://sap.com/xi/EDI}CashDiscountPercent" minOccurs="0"/&gt;
 *         &lt;element name="CashDiscount1Days" type="{http://sap.com/xi/EDI}CashDiscountDaysValue" minOccurs="0"/&gt;
 *         &lt;element name="CashDiscount1Description" type="{http://sap.com/xi/EDI}LANGUAGEINDEPENDENT_LONG_Text" minOccurs="0"/&gt;
 *         &lt;element name="CashDiscount2Percent" type="{http://sap.com/xi/EDI}CashDiscountPercent" minOccurs="0"/&gt;
 *         &lt;element name="CashDiscount2Days" type="{http://sap.com/xi/EDI}CashDiscountDaysValue" minOccurs="0"/&gt;
 *         &lt;element name="CashDiscount2Description" type="{http://sap.com/xi/EDI}LANGUAGEINDEPENDENT_LONG_Text" minOccurs="0"/&gt;
 *         &lt;element name="NetPaymentDays" type="{http://sap.com/xi/EDI}NetPaymentDays" minOccurs="0"/&gt;
 *         &lt;element name="NetPaymentDescription" type="{http://sap.com/xi/EDI}LANGUAGEINDEPENDENT_LONG_Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashDiscountTerms", propOrder = {
    "buyerPaymentTermsID",
    "supplierPaymentTermsID",
    "fixedValueDate",
    "cashDiscount1Percent",
    "cashDiscount1Days",
    "cashDiscount1Description",
    "cashDiscount2Percent",
    "cashDiscount2Days",
    "cashDiscount2Description",
    "netPaymentDays",
    "netPaymentDescription"
})
public class CashDiscountTerms {

    @XmlElement(name = "BuyerPaymentTermsID")
    protected String buyerPaymentTermsID;
    @XmlElement(name = "SupplierPaymentTermsID")
    protected String supplierPaymentTermsID;
    @XmlElement(name = "FixedValueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fixedValueDate;
    @XmlElement(name = "CashDiscount1Percent")
    protected BigDecimal cashDiscount1Percent;
    @XmlElement(name = "CashDiscount1Days")
    protected Integer cashDiscount1Days;
    @XmlElement(name = "CashDiscount1Description")
    protected String cashDiscount1Description;
    @XmlElement(name = "CashDiscount2Percent")
    protected BigDecimal cashDiscount2Percent;
    @XmlElement(name = "CashDiscount2Days")
    protected Integer cashDiscount2Days;
    @XmlElement(name = "CashDiscount2Description")
    protected String cashDiscount2Description;
    @XmlElement(name = "NetPaymentDays")
    protected Integer netPaymentDays;
    @XmlElement(name = "NetPaymentDescription")
    protected String netPaymentDescription;

    /**
     * Gets the value of the buyerPaymentTermsID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerPaymentTermsID() {
        return buyerPaymentTermsID;
    }

    /**
     * Sets the value of the buyerPaymentTermsID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerPaymentTermsID(String value) {
        this.buyerPaymentTermsID = value;
    }

    /**
     * Gets the value of the supplierPaymentTermsID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierPaymentTermsID() {
        return supplierPaymentTermsID;
    }

    /**
     * Sets the value of the supplierPaymentTermsID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierPaymentTermsID(String value) {
        this.supplierPaymentTermsID = value;
    }

    /**
     * Gets the value of the fixedValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFixedValueDate() {
        return fixedValueDate;
    }

    /**
     * Sets the value of the fixedValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFixedValueDate(XMLGregorianCalendar value) {
        this.fixedValueDate = value;
    }

    /**
     * Gets the value of the cashDiscount1Percent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCashDiscount1Percent() {
        return cashDiscount1Percent;
    }

    /**
     * Sets the value of the cashDiscount1Percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCashDiscount1Percent(BigDecimal value) {
        this.cashDiscount1Percent = value;
    }

    /**
     * Gets the value of the cashDiscount1Days property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCashDiscount1Days() {
        return cashDiscount1Days;
    }

    /**
     * Sets the value of the cashDiscount1Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCashDiscount1Days(Integer value) {
        this.cashDiscount1Days = value;
    }

    /**
     * Gets the value of the cashDiscount1Description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashDiscount1Description() {
        return cashDiscount1Description;
    }

    /**
     * Sets the value of the cashDiscount1Description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashDiscount1Description(String value) {
        this.cashDiscount1Description = value;
    }

    /**
     * Gets the value of the cashDiscount2Percent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCashDiscount2Percent() {
        return cashDiscount2Percent;
    }

    /**
     * Sets the value of the cashDiscount2Percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCashDiscount2Percent(BigDecimal value) {
        this.cashDiscount2Percent = value;
    }

    /**
     * Gets the value of the cashDiscount2Days property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCashDiscount2Days() {
        return cashDiscount2Days;
    }

    /**
     * Sets the value of the cashDiscount2Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCashDiscount2Days(Integer value) {
        this.cashDiscount2Days = value;
    }

    /**
     * Gets the value of the cashDiscount2Description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashDiscount2Description() {
        return cashDiscount2Description;
    }

    /**
     * Sets the value of the cashDiscount2Description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashDiscount2Description(String value) {
        this.cashDiscount2Description = value;
    }

    /**
     * Gets the value of the netPaymentDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNetPaymentDays() {
        return netPaymentDays;
    }

    /**
     * Sets the value of the netPaymentDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNetPaymentDays(Integer value) {
        this.netPaymentDays = value;
    }

    /**
     * Gets the value of the netPaymentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetPaymentDescription() {
        return netPaymentDescription;
    }

    /**
     * Sets the value of the netPaymentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetPaymentDescription(String value) {
        this.netPaymentDescription = value;
    }

}
