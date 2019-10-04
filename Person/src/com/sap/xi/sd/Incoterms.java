
package com.sap.xi.sd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Incoterms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Incoterms">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IncotermsVersion" type="{http://sap.com/xi/SD/Global2}IncotermsVersion" minOccurs="0"/>
 *         &lt;element name="IncotermsClassification" type="{http://sap.com/xi/SD/Global2}IncotermsClassificationCode" minOccurs="0"/>
 *         &lt;element name="IncotermsLocation1" type="{http://sap.com/xi/SD/Global2}IncotermsTransferLocationNameLong" minOccurs="0"/>
 *         &lt;element name="IncotermsLocation2" type="{http://sap.com/xi/SD/Global2}IncotermsDestinationLocationName" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Incoterms", propOrder = {
    "incotermsVersion",
    "incotermsClassification",
    "incotermsLocation1",
    "incotermsLocation2"
})
public class Incoterms {

    @XmlElement(name = "IncotermsVersion")
    protected String incotermsVersion;
    @XmlElement(name = "IncotermsClassification")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String incotermsClassification;
    @XmlElement(name = "IncotermsLocation1")
    protected String incotermsLocation1;
    @XmlElement(name = "IncotermsLocation2")
    protected String incotermsLocation2;

    /**
     * Gets the value of the incotermsVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncotermsVersion() {
        return incotermsVersion;
    }

    /**
     * Sets the value of the incotermsVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncotermsVersion(String value) {
        this.incotermsVersion = value;
    }

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
