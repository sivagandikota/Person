
package com.sap.xi.sd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.sd.global2.Amount;


/**
 * <p>Java class for PaymentPlanItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentPlanItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EPaytByDigitalPaymentSrvc" type="{http://sap.com/xi/SD/Global2}EPaytByDigitalPaymentSrvc_GFN" minOccurs="0"/>
 *         &lt;element name="MaximumToBeAuthorizedAmount" type="{http://sap.com/xi/SD/Global2}Amount" minOccurs="0"/>
 *         &lt;element name="PaymentPlanItemAuthorization" type="{http://sap.com/xi/SD}PaymentPlanItemAuthorization" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="authorizationListCompleteTransmissionIndicator" type="{http://sap.com/xi/SD/Global2}Indicator" />
 *       &lt;attribute name="actionCode" use="required" type="{http://sap.com/xi/SD/Global2}ActionCode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentPlanItem", propOrder = {
    "ePaytByDigitalPaymentSrvc",
    "maximumToBeAuthorizedAmount",
    "paymentPlanItemAuthorization"
})
public class PaymentPlanItem {

    @XmlElement(name = "EPaytByDigitalPaymentSrvc")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ePaytByDigitalPaymentSrvc;
    @XmlElement(name = "MaximumToBeAuthorizedAmount")
    protected Amount maximumToBeAuthorizedAmount;
    @XmlElement(name = "PaymentPlanItemAuthorization")
    protected List<PaymentPlanItemAuthorization> paymentPlanItemAuthorization;
    @XmlAttribute(name = "authorizationListCompleteTransmissionIndicator")
    protected Boolean authorizationListCompleteTransmissionIndicator;
    @XmlAttribute(name = "actionCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

    /**
     * Gets the value of the ePaytByDigitalPaymentSrvc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEPaytByDigitalPaymentSrvc() {
        return ePaytByDigitalPaymentSrvc;
    }

    /**
     * Sets the value of the ePaytByDigitalPaymentSrvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEPaytByDigitalPaymentSrvc(String value) {
        this.ePaytByDigitalPaymentSrvc = value;
    }

    /**
     * Gets the value of the maximumToBeAuthorizedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getMaximumToBeAuthorizedAmount() {
        return maximumToBeAuthorizedAmount;
    }

    /**
     * Sets the value of the maximumToBeAuthorizedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setMaximumToBeAuthorizedAmount(Amount value) {
        this.maximumToBeAuthorizedAmount = value;
    }

    /**
     * Gets the value of the paymentPlanItemAuthorization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentPlanItemAuthorization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentPlanItemAuthorization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentPlanItemAuthorization }
     * 
     * 
     */
    public List<PaymentPlanItemAuthorization> getPaymentPlanItemAuthorization() {
        if (paymentPlanItemAuthorization == null) {
            paymentPlanItemAuthorization = new ArrayList<PaymentPlanItemAuthorization>();
        }
        return this.paymentPlanItemAuthorization;
    }

    /**
     * Gets the value of the authorizationListCompleteTransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthorizationListCompleteTransmissionIndicator() {
        return authorizationListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the authorizationListCompleteTransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthorizationListCompleteTransmissionIndicator(Boolean value) {
        this.authorizationListCompleteTransmissionIndicator = value;
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
