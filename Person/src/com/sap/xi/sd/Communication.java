
package com.sap.xi.sd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.sd.global2.AddressFacsimileNumber;
import com.sap.xi.sd.global2.AddressMobilePhoneNumber;
import com.sap.xi.sd.global2.AddressPhoneNumber;


/**
 * <p>Java class for Communication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Communication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CorrespondenceLanguage" type="{http://sap.com/xi/SD/Global2}LanguageISOCode_GFN" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://sap.com/xi/SD/Global2}AddressPhoneNumber" minOccurs="0"/>
 *         &lt;element name="MobilePhone" type="{http://sap.com/xi/SD/Global2}AddressMobilePhoneNumber" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://sap.com/xi/SD/Global2}AddressFacsimileNumber" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://sap.com/xi/SD/Global2}AddressEmailURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Communication", propOrder = {
    "correspondenceLanguage",
    "phone",
    "mobilePhone",
    "fax",
    "emailAddress"
})
public class Communication {

    @XmlElement(name = "CorrespondenceLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String correspondenceLanguage;
    @XmlElement(name = "Phone")
    protected AddressPhoneNumber phone;
    @XmlElement(name = "MobilePhone")
    protected AddressMobilePhoneNumber mobilePhone;
    @XmlElement(name = "Fax")
    protected AddressFacsimileNumber fax;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;

    /**
     * Gets the value of the correspondenceLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondenceLanguage() {
        return correspondenceLanguage;
    }

    /**
     * Sets the value of the correspondenceLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondenceLanguage(String value) {
        this.correspondenceLanguage = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link AddressPhoneNumber }
     *     
     */
    public AddressPhoneNumber getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressPhoneNumber }
     *     
     */
    public void setPhone(AddressPhoneNumber value) {
        this.phone = value;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link AddressMobilePhoneNumber }
     *     
     */
    public AddressMobilePhoneNumber getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressMobilePhoneNumber }
     *     
     */
    public void setMobilePhone(AddressMobilePhoneNumber value) {
        this.mobilePhone = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link AddressFacsimileNumber }
     *     
     */
    public AddressFacsimileNumber getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressFacsimileNumber }
     *     
     */
    public void setFax(AddressFacsimileNumber value) {
        this.fax = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

}
