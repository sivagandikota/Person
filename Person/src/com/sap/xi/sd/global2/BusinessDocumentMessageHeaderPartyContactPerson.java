
package com.sap.xi.sd.global2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessDocumentMessageHeaderPartyContactPerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessDocumentMessageHeaderPartyContactPerson">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InternalID" type="{http://sap.com/xi/SD/Global2}ContactPersonInternalID" minOccurs="0"/>
 *         &lt;element name="OrganisationFormattedName" type="{http://sap.com/xi/SD/Global2}LANGUAGEINDEPENDENT_MEDIUM_Name" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="PersonFormattedName" type="{http://sap.com/xi/SD/Global2}LANGUAGEINDEPENDENT_LONG_Name" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="PhoneNumber" type="{http://sap.com/xi/SD/Global2}PhoneNumber" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FaxNumber" type="{http://sap.com/xi/SD/Global2}PhoneNumber" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EmailURI" type="{http://sap.com/xi/SD/Global2}EmailURI" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDocumentMessageHeaderPartyContactPerson", propOrder = {
    "internalID",
    "organisationFormattedName",
    "personFormattedName",
    "phoneNumber",
    "faxNumber",
    "emailURI"
})
public class BusinessDocumentMessageHeaderPartyContactPerson {

    @XmlElement(name = "InternalID")
    protected ContactPersonInternalID internalID;
    @XmlElement(name = "OrganisationFormattedName")
    protected List<String> organisationFormattedName;
    @XmlElement(name = "PersonFormattedName")
    protected List<String> personFormattedName;
    @XmlElement(name = "PhoneNumber")
    protected List<PhoneNumber> phoneNumber;
    @XmlElement(name = "FaxNumber")
    protected List<PhoneNumber> faxNumber;
    @XmlElement(name = "EmailURI")
    protected List<EmailURI> emailURI;

    /**
     * Gets the value of the internalID property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPersonInternalID }
     *     
     */
    public ContactPersonInternalID getInternalID() {
        return internalID;
    }

    /**
     * Sets the value of the internalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPersonInternalID }
     *     
     */
    public void setInternalID(ContactPersonInternalID value) {
        this.internalID = value;
    }

    /**
     * Gets the value of the organisationFormattedName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationFormattedName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisationFormattedName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOrganisationFormattedName() {
        if (organisationFormattedName == null) {
            organisationFormattedName = new ArrayList<String>();
        }
        return this.organisationFormattedName;
    }

    /**
     * Gets the value of the personFormattedName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personFormattedName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonFormattedName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPersonFormattedName() {
        if (personFormattedName == null) {
            personFormattedName = new ArrayList<String>();
        }
        return this.personFormattedName;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneNumber }
     * 
     * 
     */
    public List<PhoneNumber> getPhoneNumber() {
        if (phoneNumber == null) {
            phoneNumber = new ArrayList<PhoneNumber>();
        }
        return this.phoneNumber;
    }

    /**
     * Gets the value of the faxNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faxNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaxNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneNumber }
     * 
     * 
     */
    public List<PhoneNumber> getFaxNumber() {
        if (faxNumber == null) {
            faxNumber = new ArrayList<PhoneNumber>();
        }
        return this.faxNumber;
    }

    /**
     * Gets the value of the emailURI property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailURI property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailURI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailURI }
     * 
     * 
     */
    public List<EmailURI> getEmailURI() {
        if (emailURI == null) {
            emailURI = new ArrayList<EmailURI>();
        }
        return this.emailURI;
    }

}
