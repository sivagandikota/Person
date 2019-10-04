
package com.sap.xi.edi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalesOrderMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageHeader" type="{http://sap.com/xi/EDI}BusinessDocumentMessageHeader"/&gt;
 *         &lt;element name="Order" type="{http://sap.com/xi/EDI}SalesOrder"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderMessage", propOrder = {
    "messageHeader",
    "order"
})
public class SalesOrderMessage {

    @XmlElement(name = "MessageHeader", required = true)
    protected BusinessDocumentMessageHeader messageHeader;
    @XmlElement(name = "Order", required = true)
    protected SalesOrder order;

    /**
     * Gets the value of the messageHeader property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentMessageHeader }
     *     
     */
    public BusinessDocumentMessageHeader getMessageHeader() {
        return messageHeader;
    }

    /**
     * Sets the value of the messageHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentMessageHeader }
     *     
     */
    public void setMessageHeader(BusinessDocumentMessageHeader value) {
        this.messageHeader = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrder }
     *     
     */
    public SalesOrder getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrder }
     *     
     */
    public void setOrder(SalesOrder value) {
        this.order = value;
    }

}
