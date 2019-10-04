
package com.sap.xi.sd_sls;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sap.xi.sd_sls package. 
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

    private final static QName _SalesOrderBulkRequest_QNAME = new QName("http://sap.com/xi/SD-SLS", "SalesOrderBulkRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sap.xi.sd_sls
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SalesOrderBulkMessage }
     * 
     */
    public SalesOrderBulkMessage createSalesOrderBulkMessage() {
        return new SalesOrderBulkMessage();
    }

    /**
     * Create an instance of {@link SalesOrder }
     * 
     */
    public SalesOrder createSalesOrder() {
        return new SalesOrder();
    }

    /**
     * Create an instance of {@link SalesOrderItem }
     * 
     */
    public SalesOrderItem createSalesOrderItem() {
        return new SalesOrderItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesOrderBulkMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sap.com/xi/SD-SLS", name = "SalesOrderBulkRequest")
    public JAXBElement<SalesOrderBulkMessage> createSalesOrderBulkRequest(SalesOrderBulkMessage value) {
        return new JAXBElement<SalesOrderBulkMessage>(_SalesOrderBulkRequest_QNAME, SalesOrderBulkMessage.class, null, value);
    }

}
