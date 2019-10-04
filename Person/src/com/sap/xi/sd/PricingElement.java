
package com.sap.xi.sd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.sd.global2.ConditionRateValueGFN;
import com.sap.xi.sd.global2.INTEGERQuantity;


/**
 * <p>Java class for PricingElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConditionType" type="{http://sap.com/xi/SD/Global2}ConditionType_GFN" minOccurs="0"/>
 *         &lt;element name="ConditionRateValue" type="{http://sap.com/xi/SD/Global2}ConditionRateValue_GFN" minOccurs="0"/>
 *         &lt;element name="ConditionQuantity" type="{http://sap.com/xi/SD/Global2}INTEGER_Quantity" minOccurs="0"/>
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
@XmlType(name = "PricingElement", propOrder = {
    "conditionType",
    "conditionRateValue",
    "conditionQuantity"
})
public class PricingElement {

    @XmlElement(name = "ConditionType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String conditionType;
    @XmlElement(name = "ConditionRateValue")
    protected ConditionRateValueGFN conditionRateValue;
    @XmlElement(name = "ConditionQuantity")
    protected INTEGERQuantity conditionQuantity;
    @XmlAttribute(name = "actionCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

    /**
     * Gets the value of the conditionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionType() {
        return conditionType;
    }

    /**
     * Sets the value of the conditionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionType(String value) {
        this.conditionType = value;
    }

    /**
     * Gets the value of the conditionRateValue property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionRateValueGFN }
     *     
     */
    public ConditionRateValueGFN getConditionRateValue() {
        return conditionRateValue;
    }

    /**
     * Sets the value of the conditionRateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionRateValueGFN }
     *     
     */
    public void setConditionRateValue(ConditionRateValueGFN value) {
        this.conditionRateValue = value;
    }

    /**
     * Gets the value of the conditionQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link INTEGERQuantity }
     *     
     */
    public INTEGERQuantity getConditionQuantity() {
        return conditionQuantity;
    }

    /**
     * Sets the value of the conditionQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link INTEGERQuantity }
     *     
     */
    public void setConditionQuantity(INTEGERQuantity value) {
        this.conditionQuantity = value;
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
