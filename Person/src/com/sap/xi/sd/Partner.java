
package com.sap.xi.sd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Partner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Partner">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartnerFunction" type="{http://sap.com/xi/SD/Global2}PartnerFunction_GFN" minOccurs="0"/>
 *         &lt;element name="BusinessPartnerID" type="{http://sap.com/xi/SD/Global2}BusinessPartnerID" minOccurs="0"/>
 *         &lt;element name="Customer" type="{http://sap.com/xi/SD/Global2}SoldToParty_GFN" minOccurs="0"/>
 *         &lt;element name="Supplier" type="{http://sap.com/xi/SD/Global2}SoldToParty_GFN" minOccurs="0"/>
 *         &lt;element name="Personnel" type="{http://sap.com/xi/SD/Global2}SoldToParty_GFN" minOccurs="0"/>
 *         &lt;element name="ContactPerson" type="{http://sap.com/xi/SD/Global2}SoldToParty_GFN" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://sap.com/xi/SD}Address" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="actionCode" use="required" type="{http://sap.com/xi/SD/Global2}ActionCode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Partner", propOrder = {
    "partnerFunction",
    "businessPartnerID",
    "customer",
    "supplier",
    "personnel",
    "contactPerson",
    "address"
})
public class Partner {

    @XmlElement(name = "PartnerFunction")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String partnerFunction;
    @XmlElement(name = "BusinessPartnerID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String businessPartnerID;
    @XmlElement(name = "Customer")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String customer;
    @XmlElement(name = "Supplier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String supplier;
    @XmlElement(name = "Personnel")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String personnel;
    @XmlElement(name = "ContactPerson")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String contactPerson;
    @XmlElement(name = "Address")
    protected Address address;
    @XmlAttribute(name = "actionCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

    /**
     * Gets the value of the partnerFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerFunction() {
        return partnerFunction;
    }

    /**
     * Sets the value of the partnerFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerFunction(String value) {
        this.partnerFunction = value;
    }

    /**
     * Gets the value of the businessPartnerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPartnerID() {
        return businessPartnerID;
    }

    /**
     * Sets the value of the businessPartnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPartnerID(String value) {
        this.businessPartnerID = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer(String value) {
        this.customer = value;
    }

    /**
     * Gets the value of the supplier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplier() {
        return supplier;
    }

    /**
     * Sets the value of the supplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplier(String value) {
        this.supplier = value;
    }

    /**
     * Gets the value of the personnel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonnel() {
        return personnel;
    }

    /**
     * Sets the value of the personnel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonnel(String value) {
        this.personnel = value;
    }

    /**
     * Gets the value of the contactPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPerson() {
        return contactPerson;
    }

    /**
     * Sets the value of the contactPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPerson(String value) {
        this.contactPerson = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
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
