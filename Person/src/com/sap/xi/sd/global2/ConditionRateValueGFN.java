
package com.sap.xi.sd.global2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ConditionRateValue_GFN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConditionRateValue_GFN">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://sap.com/xi/SD/Global2>ConditionRateValue_GFN.Content">
 *       &lt;attribute name="valueUnit" type="{http://sap.com/xi/SD/Global2}ConditionRateValueUnit_GFN" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionRateValue_GFN", propOrder = {
    "value"
})
public class ConditionRateValueGFN {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "valueUnit")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String valueUnit;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the valueUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueUnit() {
        return valueUnit;
    }

    /**
     * Sets the value of the valueUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueUnit(String value) {
        this.valueUnit = value;
    }

}
