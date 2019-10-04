
package com.sap.xi.edi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Party complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Party"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GlobalLocationNumber" type="{http://sap.com/xi/EDI}PartyStandardID" minOccurs="0"/&gt;
 *         &lt;element name="BuyerPartyID" type="{http://sap.com/xi/EDI}PartyPartyID" minOccurs="0"/&gt;
 *         &lt;element name="SupplierPartyID" type="{http://sap.com/xi/EDI}PartyPartyID" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://sap.com/xi/EDI}Address" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PartyType" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;maxLength value="10"/&gt;
 *             &lt;minLength value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party", propOrder = {
    "globalLocationNumber",
    "buyerPartyID",
    "supplierPartyID",
    "address"
})
public class Party {

    @XmlElement(name = "GlobalLocationNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String globalLocationNumber;
    @XmlElement(name = "BuyerPartyID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String buyerPartyID;
    @XmlElement(name = "SupplierPartyID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String supplierPartyID;
    @XmlElement(name = "Address")
    protected Address address;
    @XmlAttribute(name = "PartyType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String partyType;

    /**
     * Gets the value of the globalLocationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalLocationNumber() {
        return globalLocationNumber;
    }

    /**
     * Sets the value of the globalLocationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalLocationNumber(String value) {
        this.globalLocationNumber = value;
    }

    /**
     * Gets the value of the buyerPartyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerPartyID() {
        return buyerPartyID;
    }

    /**
     * Sets the value of the buyerPartyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerPartyID(String value) {
        this.buyerPartyID = value;
    }

    /**
     * Gets the value of the supplierPartyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierPartyID() {
        return supplierPartyID;
    }

    /**
     * Sets the value of the supplierPartyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierPartyID(String value) {
        this.supplierPartyID = value;
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
     * Gets the value of the partyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyType() {
        return partyType;
    }

    /**
     * Sets the value of the partyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyType(String value) {
        this.partyType = value;
    }

}
