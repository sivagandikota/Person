
package com.sap.xi.sd;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sap.xi.sd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sap.xi.sd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PricingElement }
     * 
     */
    public PricingElement createPricingElement() {
        return new PricingElement();
    }

    /**
     * Create an instance of {@link Incoterms }
     * 
     */
    public Incoterms createIncoterms() {
        return new Incoterms();
    }

    /**
     * Create an instance of {@link PhysicalAddress }
     * 
     */
    public PhysicalAddress createPhysicalAddress() {
        return new PhysicalAddress();
    }

    /**
     * Create an instance of {@link PaymentPlanItem }
     * 
     */
    public PaymentPlanItem createPaymentPlanItem() {
        return new PaymentPlanItem();
    }

    /**
     * Create an instance of {@link ItemIncoterms }
     * 
     */
    public ItemIncoterms createItemIncoterms() {
        return new ItemIncoterms();
    }

    /**
     * Create an instance of {@link PaymentPlanItemAuthorization }
     * 
     */
    public PaymentPlanItemAuthorization createPaymentPlanItemAuthorization() {
        return new PaymentPlanItemAuthorization();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Communication }
     * 
     */
    public Communication createCommunication() {
        return new Communication();
    }

    /**
     * Create an instance of {@link Partner }
     * 
     */
    public Partner createPartner() {
        return new Partner();
    }

}
