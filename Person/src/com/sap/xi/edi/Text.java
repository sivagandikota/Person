
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
 * <p>Java class for Text complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Text"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BuyerTextElementID" type="{http://sap.com/xi/EDI}TextElement" minOccurs="0"/&gt;
 *         &lt;element name="SupplierTextElementID" type="{http://sap.com/xi/EDI}TextElement" minOccurs="0"/&gt;
 *         &lt;element name="TextElementLanguage" type="{http://sap.com/xi/EDI}LanguageCode" minOccurs="0"/&gt;
 *         &lt;element name="TextElementText" type="{http://sap.com/xi/EDI}TextElementText" minOccurs="0"/&gt;
 *         &lt;element name="TextElementTextFormat" type="{http://sap.com/xi/EDI}TextElementTextFormat" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Type" type="{http://sap.com/xi/EDI}TextType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Text", propOrder = {
    "buyerTextElementID",
    "supplierTextElementID",
    "textElementLanguage",
    "textElementText",
    "textElementTextFormat"
})
public class Text {

    @XmlElement(name = "BuyerTextElementID")
    protected String buyerTextElementID;
    @XmlElement(name = "SupplierTextElementID")
    protected String supplierTextElementID;
    @XmlElement(name = "TextElementLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String textElementLanguage;
    @XmlElement(name = "TextElementText")
    protected String textElementText;
    @XmlElement(name = "TextElementTextFormat")
    protected String textElementTextFormat;
    @XmlAttribute(name = "Type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;

    /**
     * Gets the value of the buyerTextElementID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerTextElementID() {
        return buyerTextElementID;
    }

    /**
     * Sets the value of the buyerTextElementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerTextElementID(String value) {
        this.buyerTextElementID = value;
    }

    /**
     * Gets the value of the supplierTextElementID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierTextElementID() {
        return supplierTextElementID;
    }

    /**
     * Sets the value of the supplierTextElementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierTextElementID(String value) {
        this.supplierTextElementID = value;
    }

    /**
     * Gets the value of the textElementLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextElementLanguage() {
        return textElementLanguage;
    }

    /**
     * Sets the value of the textElementLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextElementLanguage(String value) {
        this.textElementLanguage = value;
    }

    /**
     * Gets the value of the textElementText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextElementText() {
        return textElementText;
    }

    /**
     * Sets the value of the textElementText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextElementText(String value) {
        this.textElementText = value;
    }

    /**
     * Gets the value of the textElementTextFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextElementTextFormat() {
        return textElementTextFormat;
    }

    /**
     * Sets the value of the textElementTextFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextElementTextFormat(String value) {
        this.textElementTextFormat = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
