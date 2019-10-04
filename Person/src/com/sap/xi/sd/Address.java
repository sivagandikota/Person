
package com.sap.xi.sd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Address">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FormOfAddress" type="{http://sap.com/xi/SD/Global2}FormOfAddressCode" minOccurs="0"/>
 *         &lt;element name="AddressName" type="{http://sap.com/xi/SD/Global2}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/>
 *         &lt;element name="AddressAdditionalName" type="{http://sap.com/xi/SD/Global2}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/>
 *         &lt;element name="TaxJurisdiction" type="{http://sap.com/xi/SD/Global2}TaxJurisdictionCode" minOccurs="0"/>
 *         &lt;element name="PhysicalAddress" type="{http://sap.com/xi/SD}PhysicalAddress" minOccurs="0"/>
 *         &lt;element name="Communication" type="{http://sap.com/xi/SD}Communication" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
    "formOfAddress",
    "addressName",
    "addressAdditionalName",
    "taxJurisdiction",
    "physicalAddress",
    "communication"
})
public class Address {

    @XmlElement(name = "FormOfAddress")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String formOfAddress;
    @XmlElement(name = "AddressName")
    protected String addressName;
    @XmlElement(name = "AddressAdditionalName")
    protected String addressAdditionalName;
    @XmlElement(name = "TaxJurisdiction")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String taxJurisdiction;
    @XmlElement(name = "PhysicalAddress")
    protected PhysicalAddress physicalAddress;
    @XmlElement(name = "Communication")
    protected Communication communication;

    /**
     * Gets the value of the formOfAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormOfAddress() {
        return formOfAddress;
    }

    /**
     * Sets the value of the formOfAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormOfAddress(String value) {
        this.formOfAddress = value;
    }

    /**
     * Gets the value of the addressName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressName() {
        return addressName;
    }

    /**
     * Sets the value of the addressName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressName(String value) {
        this.addressName = value;
    }

    /**
     * Gets the value of the addressAdditionalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressAdditionalName() {
        return addressAdditionalName;
    }

    /**
     * Sets the value of the addressAdditionalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressAdditionalName(String value) {
        this.addressAdditionalName = value;
    }

    /**
     * Gets the value of the taxJurisdiction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxJurisdiction() {
        return taxJurisdiction;
    }

    /**
     * Sets the value of the taxJurisdiction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxJurisdiction(String value) {
        this.taxJurisdiction = value;
    }

    /**
     * Gets the value of the physicalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalAddress }
     *     
     */
    public PhysicalAddress getPhysicalAddress() {
        return physicalAddress;
    }

    /**
     * Sets the value of the physicalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalAddress }
     *     
     */
    public void setPhysicalAddress(PhysicalAddress value) {
        this.physicalAddress = value;
    }

    /**
     * Gets the value of the communication property.
     * 
     * @return
     *     possible object is
     *     {@link Communication }
     *     
     */
    public Communication getCommunication() {
        return communication;
    }

    /**
     * Sets the value of the communication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Communication }
     *     
     */
    public void setCommunication(Communication value) {
        this.communication = value;
    }

}
