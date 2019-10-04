
package com.sap.xi.edi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ItemIncoterms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemIncoterms"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IncotermsClassification" type="{http://sap.com/xi/EDI}IncotermsClassificationCode" minOccurs="0"/&gt;
 *         &lt;element name="IncotermsLocation1" type="{http://sap.com/xi/EDI}IncotermsTransferLocationNameLong" minOccurs="0"/&gt;
 *         &lt;element name="IncotermsLocation2" type="{http://sap.com/xi/EDI}IncotermsTransferLocationNameLong" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemIncoterms", propOrder = {
    "incotermsClassification",
    "incotermsLocation1",
    "incotermsLocation2"
})
public class ItemIncoterms {

    @XmlElement(name = "IncotermsClassification")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String incotermsClassification;
    @XmlElement(name = "IncotermsLocation1")
    protected String incotermsLocation1;
    @XmlElement(name = "IncotermsLocation2")
    protected String incotermsLocation2;

    /**
     * Gets the value of the incotermsClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncotermsClassification() {
        return incotermsClassification;
    }

    /**
     * Sets the value of the incotermsClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncotermsClassification(String value) {
        this.incotermsClassification = value;
    }

    /**
     * Gets the value of the incotermsLocation1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncotermsLocation1() {
        return incotermsLocation1;
    }

    /**
     * Sets the value of the incotermsLocation1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncotermsLocation1(String value) {
        this.incotermsLocation1 = value;
    }

    /**
     * Gets the value of the incotermsLocation2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncotermsLocation2() {
        return incotermsLocation2;
    }

    /**
     * Sets the value of the incotermsLocation2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncotermsLocation2(String value) {
        this.incotermsLocation2 = value;
    }

}
