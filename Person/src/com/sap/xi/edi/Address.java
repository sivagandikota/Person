
package com.sap.xi.edi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Address"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FormOfAddress" type="{http://sap.com/xi/EDI}FormOfAddressCode" minOccurs="0"/&gt;
 *         &lt;element name="FormOfAddressName" type="{http://sap.com/xi/EDI}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="AddressName" type="{http://sap.com/xi/EDI}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="AddressAdditionalName" type="{http://sap.com/xi/EDI}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="StreetName" type="{http://sap.com/xi/EDI}StreetName" minOccurs="0"/&gt;
 *         &lt;element name="HouseNumber" type="{http://sap.com/xi/EDI}HouseID" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://sap.com/xi/EDI}PostalCode" minOccurs="0"/&gt;
 *         &lt;element name="CityName" type="{http://sap.com/xi/EDI}CityName" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://sap.com/xi/EDI}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="District" type="{http://sap.com/xi/EDI}CityName" minOccurs="0"/&gt;
 *         &lt;element name="Region" type="{http://sap.com/xi/EDI}RegionCode" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://sap.com/xi/EDI}FormattedPhoneNumber" minOccurs="0"/&gt;
 *         &lt;element name="FaxNumber" type="{http://sap.com/xi/EDI}FormattedPhoneNumber" minOccurs="0"/&gt;
 *         &lt;element name="CorrespondenceLanguage" type="{http://sap.com/xi/EDI}LanguageCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
    "formOfAddress",
    "formOfAddressName",
    "addressName",
    "addressAdditionalName",
    "streetName",
    "houseNumber",
    "postalCode",
    "cityName",
    "country",
    "district",
    "region",
    "phoneNumber",
    "faxNumber",
    "correspondenceLanguage"
})
public class Address {

    @XmlElement(name = "FormOfAddress")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String formOfAddress;
    @XmlElement(name = "FormOfAddressName")
    protected String formOfAddressName;
    @XmlElement(name = "AddressName")
    protected String addressName;
    @XmlElement(name = "AddressAdditionalName")
    protected String addressAdditionalName;
    @XmlElement(name = "StreetName")
    protected String streetName;
    @XmlElement(name = "HouseNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String houseNumber;
    @XmlElement(name = "PostalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String postalCode;
    @XmlElement(name = "CityName")
    protected String cityName;
    @XmlElement(name = "Country")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String country;
    @XmlElement(name = "District")
    protected String district;
    @XmlElement(name = "Region")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String region;
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;
    @XmlElement(name = "FaxNumber")
    protected String faxNumber;
    @XmlElement(name = "CorrespondenceLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String correspondenceLanguage;

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
     * Gets the value of the formOfAddressName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormOfAddressName() {
        return formOfAddressName;
    }

    /**
     * Sets the value of the formOfAddressName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormOfAddressName(String value) {
        this.formOfAddressName = value;
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
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the houseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * Sets the value of the houseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNumber(String value) {
        this.houseNumber = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the faxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNumber(String value) {
        this.faxNumber = value;
    }

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

}
