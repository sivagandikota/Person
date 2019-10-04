
package com.sap.xi.edi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PaymentCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentCard"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentCardType" type="{http://sap.com/xi/EDI}PaymentCardTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardID" type="{http://sap.com/xi/EDI}PaymentCardID" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardValidityEndDate" type="{http://sap.com/xi/EDI}Date" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardHolderName" type="{http://sap.com/xi/EDI}LANGUAGEINDEPENDENT_Name" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardBillingAmount" type="{http://sap.com/xi/EDI}Amount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCard", propOrder = {
    "paymentCardType",
    "paymentCardID",
    "paymentCardValidityEndDate",
    "paymentCardHolderName",
    "paymentCardBillingAmount"
})
public class PaymentCard {

    @XmlElement(name = "PaymentCardType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentCardType;
    @XmlElement(name = "PaymentCardID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentCardID;
    @XmlElement(name = "PaymentCardValidityEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paymentCardValidityEndDate;
    @XmlElement(name = "PaymentCardHolderName")
    protected String paymentCardHolderName;
    @XmlElement(name = "PaymentCardBillingAmount")
    protected Amount paymentCardBillingAmount;

    /**
     * Gets the value of the paymentCardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCardType() {
        return paymentCardType;
    }

    /**
     * Sets the value of the paymentCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCardType(String value) {
        this.paymentCardType = value;
    }

    /**
     * Gets the value of the paymentCardID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCardID() {
        return paymentCardID;
    }

    /**
     * Sets the value of the paymentCardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCardID(String value) {
        this.paymentCardID = value;
    }

    /**
     * Gets the value of the paymentCardValidityEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentCardValidityEndDate() {
        return paymentCardValidityEndDate;
    }

    /**
     * Sets the value of the paymentCardValidityEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentCardValidityEndDate(XMLGregorianCalendar value) {
        this.paymentCardValidityEndDate = value;
    }

    /**
     * Gets the value of the paymentCardHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCardHolderName() {
        return paymentCardHolderName;
    }

    /**
     * Sets the value of the paymentCardHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCardHolderName(String value) {
        this.paymentCardHolderName = value;
    }

    /**
     * Gets the value of the paymentCardBillingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getPaymentCardBillingAmount() {
        return paymentCardBillingAmount;
    }

    /**
     * Sets the value of the paymentCardBillingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setPaymentCardBillingAmount(Amount value) {
        this.paymentCardBillingAmount = value;
    }

}
