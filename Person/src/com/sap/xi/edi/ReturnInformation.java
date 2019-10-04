
package com.sap.xi.edi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ReplacementMaterialIsRequested" type="{http://sap.com/xi/EDI}ReplacementMaterialIsRequested_GFN" /&gt;
 *       &lt;attribute name="ReturnPurchaseOrderReason" type="{http://sap.com/xi/EDI}ReturnPurchaseOrderReason_GFN" /&gt;
 *       &lt;attribute name="ReturnPurchaseOrderReasonText" type="{http://sap.com/xi/EDI}ReturnPurchaseOrderReasonText_GFN" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnInformation")
public class ReturnInformation {

    @XmlAttribute(name = "ReplacementMaterialIsRequested")
    protected Boolean replacementMaterialIsRequested;
    @XmlAttribute(name = "ReturnPurchaseOrderReason")
    protected String returnPurchaseOrderReason;
    @XmlAttribute(name = "ReturnPurchaseOrderReasonText")
    protected String returnPurchaseOrderReasonText;

    /**
     * Gets the value of the replacementMaterialIsRequested property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReplacementMaterialIsRequested() {
        return replacementMaterialIsRequested;
    }

    /**
     * Sets the value of the replacementMaterialIsRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplacementMaterialIsRequested(Boolean value) {
        this.replacementMaterialIsRequested = value;
    }

    /**
     * Gets the value of the returnPurchaseOrderReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnPurchaseOrderReason() {
        return returnPurchaseOrderReason;
    }

    /**
     * Sets the value of the returnPurchaseOrderReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnPurchaseOrderReason(String value) {
        this.returnPurchaseOrderReason = value;
    }

    /**
     * Gets the value of the returnPurchaseOrderReasonText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnPurchaseOrderReasonText() {
        return returnPurchaseOrderReasonText;
    }

    /**
     * Sets the value of the returnPurchaseOrderReasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnPurchaseOrderReasonText(String value) {
        this.returnPurchaseOrderReasonText = value;
    }

}
