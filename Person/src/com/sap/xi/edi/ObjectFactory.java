
package com.sap.xi.edi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sap.xi.edi package. 
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

    private final static QName _OrderRequest_QNAME = new QName("http://sap.com/xi/EDI", "OrderRequest");
    private final static QName _SalesOrderYY1EDIUUID_QNAME = new QName("http://SAPCustomFields.com/YY1_", "YY1_EDIUUID");
    private final static QName _SalesOrderYY1POTypes_QNAME = new QName("http://SAPCustomFields.com/YY1_", "YY1_POTypes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sap.xi.edi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SalesOrderMessage }
     * 
     */
    public SalesOrderMessage createSalesOrderMessage() {
        return new SalesOrderMessage();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Amount }
     * 
     */
    public Amount createAmount() {
        return new Amount();
    }

    /**
     * Create an instance of {@link AttachmentSD }
     * 
     */
    public AttachmentSD createAttachmentSD() {
        return new AttachmentSD();
    }

    /**
     * Create an instance of {@link BusinessDocumentMessageHeader }
     * 
     */
    public BusinessDocumentMessageHeader createBusinessDocumentMessageHeader() {
        return new BusinessDocumentMessageHeader();
    }

    /**
     * Create an instance of {@link BusinessDocumentMessageHeaderParty }
     * 
     */
    public BusinessDocumentMessageHeaderParty createBusinessDocumentMessageHeaderParty() {
        return new BusinessDocumentMessageHeaderParty();
    }

    /**
     * Create an instance of {@link BusinessDocumentMessageHeaderPartyContactPerson }
     * 
     */
    public BusinessDocumentMessageHeaderPartyContactPerson createBusinessDocumentMessageHeaderPartyContactPerson() {
        return new BusinessDocumentMessageHeaderPartyContactPerson();
    }

    /**
     * Create an instance of {@link BusinessDocumentMessageID }
     * 
     */
    public BusinessDocumentMessageID createBusinessDocumentMessageID() {
        return new BusinessDocumentMessageID();
    }

    /**
     * Create an instance of {@link BusinessScope }
     * 
     */
    public BusinessScope createBusinessScope() {
        return new BusinessScope();
    }

    /**
     * Create an instance of {@link BusinessScopeID }
     * 
     */
    public BusinessScopeID createBusinessScopeID() {
        return new BusinessScopeID();
    }

    /**
     * Create an instance of {@link BusinessScopeInstanceID }
     * 
     */
    public BusinessScopeInstanceID createBusinessScopeInstanceID() {
        return new BusinessScopeInstanceID();
    }

    /**
     * Create an instance of {@link BusinessScopeTypeCode }
     * 
     */
    public BusinessScopeTypeCode createBusinessScopeTypeCode() {
        return new BusinessScopeTypeCode();
    }

    /**
     * Create an instance of {@link CashDiscountTerms }
     * 
     */
    public CashDiscountTerms createCashDiscountTerms() {
        return new CashDiscountTerms();
    }

    /**
     * Create an instance of {@link ContactPersonInternalID }
     * 
     */
    public ContactPersonInternalID createContactPersonInternalID() {
        return new ContactPersonInternalID();
    }

    /**
     * Create an instance of {@link EmailURI }
     * 
     */
    public EmailURI createEmailURI() {
        return new EmailURI();
    }

    /**
     * Create an instance of {@link ExchangeFaultData }
     * 
     */
    public ExchangeFaultData createExchangeFaultData() {
        return new ExchangeFaultData();
    }

    /**
     * Create an instance of {@link ExchangeLogData }
     * 
     */
    public ExchangeLogData createExchangeLogData() {
        return new ExchangeLogData();
    }

    /**
     * Create an instance of {@link Incoterms }
     * 
     */
    public Incoterms createIncoterms() {
        return new Incoterms();
    }

    /**
     * Create an instance of {@link ItemIncoterms }
     * 
     */
    public ItemIncoterms createItemIncoterms() {
        return new ItemIncoterms();
    }

    /**
     * Create an instance of {@link MEDIUMName }
     * 
     */
    public MEDIUMName createMEDIUMName() {
        return new MEDIUMName();
    }

    /**
     * Create an instance of {@link OrderItemScheduleLine }
     * 
     */
    public OrderItemScheduleLine createOrderItemScheduleLine() {
        return new OrderItemScheduleLine();
    }

    /**
     * Create an instance of {@link Party }
     * 
     */
    public Party createParty() {
        return new Party();
    }

    /**
     * Create an instance of {@link PaymentCard }
     * 
     */
    public PaymentCard createPaymentCard() {
        return new PaymentCard();
    }

    /**
     * Create an instance of {@link PhoneNumber }
     * 
     */
    public PhoneNumber createPhoneNumber() {
        return new PhoneNumber();
    }

    /**
     * Create an instance of {@link Price }
     * 
     */
    public Price createPrice() {
        return new Price();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link Quantity }
     * 
     */
    public Quantity createQuantity() {
        return new Quantity();
    }

    /**
     * Create an instance of {@link ReferenceDocument }
     * 
     */
    public ReferenceDocument createReferenceDocument() {
        return new ReferenceDocument();
    }

    /**
     * Create an instance of {@link ReturnInformation }
     * 
     */
    public ReturnInformation createReturnInformation() {
        return new ReturnInformation();
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
     * Create an instance of {@link Text }
     * 
     */
    public Text createText() {
        return new Text();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesOrderMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SalesOrderMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://sap.com/xi/EDI", name = "OrderRequest")
    public JAXBElement<SalesOrderMessage> createOrderRequest(SalesOrderMessage value) {
        return new JAXBElement<SalesOrderMessage>(_OrderRequest_QNAME, SalesOrderMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://SAPCustomFields.com/YY1_", name = "YY1_EDIUUID", scope = SalesOrder.class)
    public JAXBElement<String> createSalesOrderYY1EDIUUID(String value) {
        return new JAXBElement<String>(_SalesOrderYY1EDIUUID_QNAME, String.class, SalesOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://SAPCustomFields.com/YY1_", name = "YY1_POTypes", scope = SalesOrder.class)
    public JAXBElement<String> createSalesOrderYY1POTypes(String value) {
        return new JAXBElement<String>(_SalesOrderYY1POTypes_QNAME, String.class, SalesOrder.class, value);
    }

}
