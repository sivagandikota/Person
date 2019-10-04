
package com.sap.xi.sd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PhysicalAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Country" type="{http://sap.com/xi/SD/Global2}CountryCode" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://sap.com/xi/SD/Global2}RegionCode" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://sap.com/xi/SD/Global2}PostalCode" minOccurs="0"/>
 *         &lt;element name="POBoxPostalCode" type="{http://sap.com/xi/SD/Global2}PostalCode" minOccurs="0"/>
 *         &lt;element name="CityName" type="{http://sap.com/xi/SD/Global2}CityName_GFN" minOccurs="0"/>
 *         &lt;element name="District" type="{http://sap.com/xi/SD/Global2}District_GFN" minOccurs="0"/>
 *         &lt;element name="POBox" type="{http://sap.com/xi/SD/Global2}POBoxID" minOccurs="0"/>
 *         &lt;element name="StreetName" type="{http://sap.com/xi/SD/Global2}StreetName" minOccurs="0"/>
 *         &lt;element name="HouseNumber" type="{http://sap.com/xi/SD/Global2}HouseID" minOccurs="0"/>
 *         &lt;element name="TransportZone" type="{http://sap.com/xi/SD/Global2}TransportationZoneID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalAddress", propOrder = {
    "country",
    "region",
    "postalCode",
    "poBoxPostalCode",
    "cityName",
    "district",
    "poBox",
    "streetName",
    "houseNumber",
    "transportZone"
})
public class PhysicalAddress {

    @XmlElement(name = "Country")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String country;
    @XmlElement(name = "Region")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String region;
    @XmlElement(name = "PostalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String postalCode;
    @XmlElement(name = "POBoxPostalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String poBoxPostalCode;
    @XmlElement(name = "CityName")
    protected String cityName;
    @XmlElement(name = "District")
    protected String district;
    @XmlElement(name = "POBox")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String poBox;
    @XmlElement(name = "StreetName")
    protected String streetName;
    @XmlElement(name = "HouseNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String houseNumber;
    @XmlElement(name = "TransportZone")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String transportZone;

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
     * Gets the value of the poBoxPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBoxPostalCode() {
        return poBoxPostalCode;
    }

    /**
     * Sets the value of the poBoxPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBoxPostalCode(String value) {
        this.poBoxPostalCode = value;
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
     * Gets the value of the poBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBox() {
        return poBox;
    }

    /**
     * Sets the value of the poBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBox(String value) {
        this.poBox = value;
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
     * Gets the value of the transportZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportZone() {
        return transportZone;
    }

    /**
     * Sets the value of the transportZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportZone(String value) {
        this.transportZone = value;
    }

}
