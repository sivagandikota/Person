
package com.sap.xi.edi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrderItemScheduleLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemScheduleLine"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestedDeliveryDate" type="{http://sap.com/xi/EDI}Date" minOccurs="0"/&gt;
 *         &lt;element name="RequestedDeliveryTime" type="{http://sap.com/xi/EDI}Time" minOccurs="0"/&gt;
 *         &lt;element name="ScheduleLineOrderQuantity" type="{http://sap.com/xi/EDI}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmedDeliveryDate" type="{http://sap.com/xi/EDI}Date" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmedDeliveryTime" type="{http://sap.com/xi/EDI}Time" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmedOrderQuantityByMaterialAvailableCheck" type="{http://sap.com/xi/EDI}Quantity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemScheduleLine", propOrder = {
    "requestedDeliveryDate",
    "requestedDeliveryTime",
    "scheduleLineOrderQuantity",
    "confirmedDeliveryDate",
    "confirmedDeliveryTime",
    "confirmedOrderQuantityByMaterialAvailableCheck"
})
public class OrderItemScheduleLine {

    @XmlElement(name = "RequestedDeliveryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requestedDeliveryDate;
    @XmlElement(name = "RequestedDeliveryTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar requestedDeliveryTime;
    @XmlElement(name = "ScheduleLineOrderQuantity")
    protected Quantity scheduleLineOrderQuantity;
    @XmlElement(name = "ConfirmedDeliveryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar confirmedDeliveryDate;
    @XmlElement(name = "ConfirmedDeliveryTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar confirmedDeliveryTime;
    @XmlElement(name = "ConfirmedOrderQuantityByMaterialAvailableCheck")
    protected Quantity confirmedOrderQuantityByMaterialAvailableCheck;

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
     * Gets the value of the requestedDeliveryTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestedDeliveryTime() {
        return requestedDeliveryTime;
    }

    /**
     * Sets the value of the requestedDeliveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestedDeliveryTime(XMLGregorianCalendar value) {
        this.requestedDeliveryTime = value;
    }

    /**
     * Gets the value of the scheduleLineOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getScheduleLineOrderQuantity() {
        return scheduleLineOrderQuantity;
    }

    /**
     * Sets the value of the scheduleLineOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setScheduleLineOrderQuantity(Quantity value) {
        this.scheduleLineOrderQuantity = value;
    }

    /**
     * Gets the value of the confirmedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConfirmedDeliveryDate() {
        return confirmedDeliveryDate;
    }

    /**
     * Sets the value of the confirmedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConfirmedDeliveryDate(XMLGregorianCalendar value) {
        this.confirmedDeliveryDate = value;
    }

    /**
     * Gets the value of the confirmedDeliveryTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConfirmedDeliveryTime() {
        return confirmedDeliveryTime;
    }

    /**
     * Sets the value of the confirmedDeliveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConfirmedDeliveryTime(XMLGregorianCalendar value) {
        this.confirmedDeliveryTime = value;
    }

    /**
     * Gets the value of the confirmedOrderQuantityByMaterialAvailableCheck property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getConfirmedOrderQuantityByMaterialAvailableCheck() {
        return confirmedOrderQuantityByMaterialAvailableCheck;
    }

    /**
     * Sets the value of the confirmedOrderQuantityByMaterialAvailableCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setConfirmedOrderQuantityByMaterialAvailableCheck(Quantity value) {
        this.confirmedOrderQuantityByMaterialAvailableCheck = value;
    }

}
