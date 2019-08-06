
package com.sap.brewster.services;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.ResponseWrapper;

import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderByKeyFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderCreateFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderDeleteFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPartner;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPartnerByKeyFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPartnerDeleteFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPartnerFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPartnerUpdateFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElementByKeyFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElementDeleteFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElementFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElementUpdateFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemByKeyFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemCreateFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemDeleteFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPartner;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPartnerByKeyFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPartnerDeleteFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPartnerFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPartnerUpdateFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPrElement;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPrElementByKeyFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPrElementDeleteFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPrElementFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPrElementUpdateFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemText;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemTextByKeyFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemTextDeleteFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemTextFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemTextUpdateFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemUpdateFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderScheduleLineByKeyFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderScheduleLineFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderText;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderTextByKeyFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderTextDeleteFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderTextFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderTextUpdateFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderUpdateFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SlsOrdPaymentPlanItemDetails;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SlsOrdPaymentPlanItemDetailsByKeyFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SlsOrdPaymentPlanItemDetailsDeleteFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SlsOrdPaymentPlanItemDetailsFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SlsOrdPaymentPlanItemDetailsUpdateFluentHelper;


/**
 * <p>You can use this service to integrate external applications with sales order processing in SAP S/4HANA Cloud. In every API call, you can make use of the following operations:
 *  - You can retrieve sales orders. Apply any of the filters provided or retrieve all existing data.
 *  - You can create sales orders. Note that you must use "deep insert" requests (a header plus the following entities: header partner, header pricing element, header text, item, payment details, item partner, item pricing element, and item text). You cannot create entities without including any related entities.
 *  - For existing sales orders, you can create new items. Note that you must use "deep insert" requests (with the following entities: item partner, item pricing element, and item text). You cannot create entities without including any related entities.
 *  - For existing sales orders, you can update the header, header partner, header pricing element, header text, payment details, item, item partner, item pricing element, and item text.
 *  - For existing sales orders, you can delete the header, header partner, header pricing element, header text, payment details, item, item partner, item pricing element, item text..</p><p><a href='https://help.sap.com/viewer/635f557c455d42eaae20f169d9c43d9b/latest/en-US/00d244581efca007e10000000a441470.html'>Business Documentation</a></p><p>Reference: <a href='https://api.sap.com/shell/discover/contentpackage/SAPS4HANACloud/api/API_SALES_ORDER_SRV?section=OVERVIEW'>SAP API Business Hub</a></p><h3>Details:</h3><table summary='Details'><tr><td align='right'>OData Service:</td><td>API_SALES_ORDER_SRV</td></tr><tr><td align='right'>API Version:</td><td>1 </td></tr><tr><td align='right'>Communication Scenario:</td><td>Sales Order Integration (SAP_COM_0109)</td></tr><tr><td align='right'>Scope Items:</td><td><a href='https://rapid.sap.com/bp/#/scopeitems/BD9'>Sell from Stock (BD9)</a>, <a href='https://rapid.sap.com/bp/#/scopeitems/1QI'>Integration with Third-Party Sales Force Automation System (1QI)</a></td></tr><tr><td align='right'>Authentication Methods:</td><td>Basic, x509</td></tr><tr><td align='right'>Business Object:</td><td>SalesOrder</td></tr></table>
 * 
 */
@WebService(name="SalesWs")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use=Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SalesOrderCreateReadUpdateDeleteService {


    /**
     * Fetch multiple {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder SalesOrder} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder SalesOrder} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderFluentHelper#execute execute} method on the fluent helper object. 
     */
	public SalesOrderFluentHelper getAllSalesOrder();

    /**
     * Fetch a single {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder SalesOrder} entity using key fields.
     * 
     * @param salesOrder
     *     Sales Order<p>Constraints: Not nullable, Maximum length: 10</p>
     * @return
     *     A fluent helper to fetch a single {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder SalesOrder} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
	public SalesOrderByKeyFluentHelper getSalesOrderByKey(String salesOrder);

    /**
     * Create a new {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder SalesOrder} entity and save it to the S/4HANA system.
     * 
     * @param salesOrder
     *     {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder SalesOrder} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder SalesOrder} entity. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderCreateFluentHelper createSalesOrder(final SalesOrder salesOrder);

    /**
     * Update an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder SalesOrder} entity and save it to the S/4HANA system.
     * 
     * @param salesOrder
     *     {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder SalesOrder} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder SalesOrder} entity. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderUpdateFluentHelper updateSalesOrder(final SalesOrder salesOrder);

    /**
     * Deletes an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder SalesOrder} entity in the S/4HANA system.
     * 
     * @param salesOrder
     *     {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder SalesOrder} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder SalesOrder} entity. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderDeleteFluentHelper deleteSalesOrder(final SalesOrder salesOrder);

    /**
     * Fetch multiple {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPartner SalesOrderHeaderPartner} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPartner SalesOrderHeaderPartner} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPartnerFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderHeaderPartnerFluentHelper getAllSalesOrderHeaderPartner();

    /**
     * Fetch a single {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPartner SalesOrderHeaderPartner} entity using key fields.
     * 
     * @param partnerFunction
     *     Partner Function<p>Constraints: Not nullable, Maximum length: 2</p>
     * @param salesOrder
     *     Sales Order<p>Constraints: Not nullable, Maximum length: 10</p>
     * @return
     *     A fluent helper to fetch a single {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPartner SalesOrderHeaderPartner} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPartnerByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderHeaderPartnerByKeyFluentHelper getSalesOrderHeaderPartnerByKey(String salesOrder, String partnerFunction);

    /**
     * Update an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPartner SalesOrderHeaderPartner} entity and save it to the S/4HANA system.
     * 
     * @param salesOrderHeaderPartner
     *     {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPartner SalesOrderHeaderPartner} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPartner SalesOrderHeaderPartner} entity. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPartnerUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderHeaderPartnerUpdateFluentHelper updateSalesOrderHeaderPartner(final SalesOrderHeaderPartner salesOrderHeaderPartner);

    /**
     * Deletes an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPartner SalesOrderHeaderPartner} entity in the S/4HANA system.
     * 
     * @param salesOrderHeaderPartner
     *     {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPartner SalesOrderHeaderPartner} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPartner SalesOrderHeaderPartner} entity. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPartnerDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderHeaderPartnerDeleteFluentHelper deleteSalesOrderHeaderPartner(final SalesOrderHeaderPartner salesOrderHeaderPartner);

    /**
     * Fetch multiple {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement SalesOrderHeaderPrElement} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement SalesOrderHeaderPrElement} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElementFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderHeaderPrElementFluentHelper getAllSalesOrderHeaderPrElement();

    /**
     * Fetch a single {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement SalesOrderHeaderPrElement} entity using key fields.
     * 
     * @param pricingProcedureCounter
     *     Condition Counter<p>Constraints: Not nullable, Maximum length: 3</p>
     * @param salesOrder
     *     Sales Order<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param pricingProcedureStep
     *     Step Number<p>Constraints: Not nullable, Maximum length: 3</p>
     * @return
     *     A fluent helper to fetch a single {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement SalesOrderHeaderPrElement} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElementByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderHeaderPrElementByKeyFluentHelper getSalesOrderHeaderPrElementByKey(String salesOrder, String pricingProcedureStep, String pricingProcedureCounter);

    /**
     * Update an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement SalesOrderHeaderPrElement} entity and save it to the S/4HANA system.
     * 
     * @param salesOrderHeaderPrElement
     *     {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement SalesOrderHeaderPrElement} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement SalesOrderHeaderPrElement} entity. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElementUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderHeaderPrElementUpdateFluentHelper updateSalesOrderHeaderPrElement(final SalesOrderHeaderPrElement salesOrderHeaderPrElement);

    /**
     * Deletes an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement SalesOrderHeaderPrElement} entity in the S/4HANA system.
     * 
     * @param salesOrderHeaderPrElement
     *     {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement SalesOrderHeaderPrElement} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement SalesOrderHeaderPrElement} entity. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElementDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderHeaderPrElementDeleteFluentHelper deleteSalesOrderHeaderPrElement(final SalesOrderHeaderPrElement salesOrderHeaderPrElement);

    /**
     * Fetch multiple {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem SalesOrderItem} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem SalesOrderItem} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderItemFluentHelper getAllSalesOrderItem();

    /**
     * Fetch a single {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem SalesOrderItem} entity using key fields.
     * 
     * @param salesOrderItem
     *     Sales Order Item<p>Constraints: Not nullable, Maximum length: 6</p>
     * @param salesOrder
     *     Sales Order<p>Constraints: Not nullable, Maximum length: 10</p>
     * @return
     *     A fluent helper to fetch a single {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem SalesOrderItem} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderItemByKeyFluentHelper getSalesOrderItemByKey(String salesOrder, String salesOrderItem);

    /**
     * Create a new {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem SalesOrderItem} entity and save it to the S/4HANA system.
     * 
     * @param salesOrderItem
     *     {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem SalesOrderItem} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem SalesOrderItem} entity. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderItemCreateFluentHelper createSalesOrderItem(final SalesOrderItem salesOrderItem);

    /**
     * Update an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem SalesOrderItem} entity and save it to the S/4HANA system.
     * 
     * @param salesOrderItem
     *     {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem SalesOrderItem} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem SalesOrderItem} entity. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderItemUpdateFluentHelper updateSalesOrderItem(final SalesOrderItem salesOrderItem);

    /**
     * Deletes an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem SalesOrderItem} entity in the S/4HANA system.
     * 
     * @param salesOrderItem
     *     {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem SalesOrderItem} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem SalesOrderItem} entity. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderItemDeleteFluentHelper deleteSalesOrderItem(final SalesOrderItem salesOrderItem);

    /**
     * Fetch multiple {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPartner SalesOrderItemPartner} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPartner SalesOrderItemPartner} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPartnerFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderItemPartnerFluentHelper getAllSalesOrderItemPartner();

    /**
     * Fetch a single {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPartner SalesOrderItemPartner} entity using key fields.
     * 
     * @param partnerFunction
     *     Partner Function<p>Constraints: Not nullable, Maximum length: 2</p>
     * @param salesOrderItem
     *     Sales Order Item<p>Constraints: Not nullable, Maximum length: 6</p>
     * @param salesOrder
     *     Sales Order<p>Constraints: Not nullable, Maximum length: 10</p>
     * @return
     *     A fluent helper to fetch a single {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPartner SalesOrderItemPartner} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPartnerByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderItemPartnerByKeyFluentHelper getSalesOrderItemPartnerByKey(String salesOrder, String salesOrderItem, String partnerFunction);

    /**
     * Update an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPartner SalesOrderItemPartner} entity and save it to the S/4HANA system.
     * 
     * @param salesOrderItemPartner
     *     {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPartner SalesOrderItemPartner} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPartner SalesOrderItemPartner} entity. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPartnerUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderItemPartnerUpdateFluentHelper updateSalesOrderItemPartner(final SalesOrderItemPartner salesOrderItemPartner);

    /**
     * Deletes an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPartner SalesOrderItemPartner} entity in the S/4HANA system.
     * 
     * @param salesOrderItemPartner
     *     {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPartner SalesOrderItemPartner} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPartner SalesOrderItemPartner} entity. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPartnerDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderItemPartnerDeleteFluentHelper deleteSalesOrderItemPartner(final SalesOrderItemPartner salesOrderItemPartner);

    /**
     * Fetch multiple {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPrElement SalesOrderItemPrElement} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPrElement SalesOrderItemPrElement} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPrElementFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderItemPrElementFluentHelper getAllSalesOrderItemPrElement();

    /**
     * Fetch a single {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPrElement SalesOrderItemPrElement} entity using key fields.
     * 
     * @param salesOrderItem
     *     Sales Order Item<p>Constraints: Not nullable, Maximum length: 6</p>
     * @param pricingProcedureCounter
     *     Condition Counter<p>Constraints: Not nullable, Maximum length: 3</p>
     * @param salesOrder
     *     Sales Order<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param pricingProcedureStep
     *     Step Number<p>Constraints: Not nullable, Maximum length: 3</p>
     * @return
     *     A fluent helper to fetch a single {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPrElement SalesOrderItemPrElement} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPrElementByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderItemPrElementByKeyFluentHelper getSalesOrderItemPrElementByKey(String salesOrder, String salesOrderItem, String pricingProcedureStep, String pricingProcedureCounter);

    /**
     * Update an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPrElement SalesOrderItemPrElement} entity and save it to the S/4HANA system.
     * 
     * @param salesOrderItemPrElement
     *     {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPrElement SalesOrderItemPrElement} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPrElement SalesOrderItemPrElement} entity. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPrElementUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderItemPrElementUpdateFluentHelper updateSalesOrderItemPrElement(final SalesOrderItemPrElement salesOrderItemPrElement);

    /**
     * Deletes an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPrElement SalesOrderItemPrElement} entity in the S/4HANA system.
     * 
     * @param salesOrderItemPrElement
     *     {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPrElement SalesOrderItemPrElement} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPrElement SalesOrderItemPrElement} entity. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPrElementDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderItemPrElementDeleteFluentHelper deleteSalesOrderItemPrElement(final SalesOrderItemPrElement salesOrderItemPrElement);

    /**
     * Fetch multiple {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemText SalesOrderItemText} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemText SalesOrderItemText} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemTextFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderItemTextFluentHelper getAllSalesOrderItemText();

    /**
     * Fetch a single {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemText SalesOrderItemText} entity using key fields.
     * 
     * @param salesOrderItem
     *     Sales Order Item<p>Constraints: Not nullable, Maximum length: 6</p>
     * @param language
     *     Language Key<p>Constraints: Not nullable, Maximum length: 2</p>
     * @param longTextID
     *     Text ID<p>Constraints: Not nullable, Maximum length: 4</p>
     * @param salesOrder
     *     Sales Order<p>Constraints: Not nullable, Maximum length: 10</p>
     * @return
     *     A fluent helper to fetch a single {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemText SalesOrderItemText} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemTextByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderItemTextByKeyFluentHelper getSalesOrderItemTextByKey(String salesOrder, String salesOrderItem, String language, String longTextID);

    /**
     * Update an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemText SalesOrderItemText} entity and save it to the S/4HANA system.
     * 
     * @param salesOrderItemText
     *     {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemText SalesOrderItemText} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemText SalesOrderItemText} entity. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemTextUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderItemTextUpdateFluentHelper updateSalesOrderItemText(final SalesOrderItemText salesOrderItemText);

    /**
     * Deletes an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemText SalesOrderItemText} entity in the S/4HANA system.
     * 
     * @param salesOrderItemText
     *     {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemText SalesOrderItemText} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemText SalesOrderItemText} entity. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemTextDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderItemTextDeleteFluentHelper deleteSalesOrderItemText(final SalesOrderItemText salesOrderItemText);

    /**
     * Fetch multiple {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderScheduleLine SalesOrderScheduleLine} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderScheduleLine SalesOrderScheduleLine} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderScheduleLineFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderScheduleLineFluentHelper getAllSalesOrderScheduleLine();

    /**
     * Fetch a single {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderScheduleLine SalesOrderScheduleLine} entity using key fields.
     * 
     * @param salesOrderItem
     *     Sales Document Item<p>Constraints: Not nullable, Maximum length: 6</p>
     * @param scheduleLine
     *     Schedule Line Number<p>Constraints: Not nullable, Maximum length: 4</p>
     * @param salesOrder
     *     Sales Document<p>Constraints: Not nullable, Maximum length: 10</p>
     * @return
     *     A fluent helper to fetch a single {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderScheduleLine SalesOrderScheduleLine} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderScheduleLineByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderScheduleLineByKeyFluentHelper getSalesOrderScheduleLineByKey(String salesOrder, String salesOrderItem, String scheduleLine);

    /**
     * Fetch multiple {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderText SalesOrderText} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderText SalesOrderText} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderTextFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderTextFluentHelper getAllSalesOrderText();

    /**
     * Fetch a single {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderText SalesOrderText} entity using key fields.
     * 
     * @param language
     *     Language Key<p>Constraints: Not nullable, Maximum length: 2</p>
     * @param longTextID
     *     Text ID<p>Constraints: Not nullable, Maximum length: 4</p>
     * @param salesOrder
     *     Sales Order<p>Constraints: Not nullable, Maximum length: 10</p>
     * @return
     *     A fluent helper to fetch a single {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderText SalesOrderText} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderTextByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderTextByKeyFluentHelper getSalesOrderTextByKey(String salesOrder, String language, String longTextID);

    /**
     * Update an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderText SalesOrderText} entity and save it to the S/4HANA system.
     * 
     * @param salesOrderText
     *     {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderText SalesOrderText} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderText SalesOrderText} entity. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderTextUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderTextUpdateFluentHelper updateSalesOrderText(final SalesOrderText salesOrderText);

    /**
     * Deletes an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderText SalesOrderText} entity in the S/4HANA system.
     * 
     * @param salesOrderText
     *     {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderText SalesOrderText} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderText SalesOrderText} entity. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderTextDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SalesOrderTextDeleteFluentHelper deleteSalesOrderText(final SalesOrderText salesOrderText);

    /**
     * Fetch multiple {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SlsOrdPaymentPlanItemDetails SlsOrdPaymentPlanItemDetails} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SlsOrdPaymentPlanItemDetails SlsOrdPaymentPlanItemDetails} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SlsOrdPaymentPlanItemDetailsFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SlsOrdPaymentPlanItemDetailsFluentHelper getAllSlsOrdPaymentPlanItemDetails();

    /**
     * Fetch a single {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SlsOrdPaymentPlanItemDetails SlsOrdPaymentPlanItemDetails} entity using key fields.
     * 
     * @param paymentPlanItem
     *     Item for billing plan/invoice plan/payment cards<p>Constraints: Not nullable, Maximum length: 6</p>
     * @param salesOrder
     *     Sales Order<p>Constraints: Not nullable, Maximum length: 10</p>
     * @return
     *     A fluent helper to fetch a single {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SlsOrdPaymentPlanItemDetails SlsOrdPaymentPlanItemDetails} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SlsOrdPaymentPlanItemDetailsByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SlsOrdPaymentPlanItemDetailsByKeyFluentHelper getSlsOrdPaymentPlanItemDetailsByKey(String salesOrder, String paymentPlanItem);

    /**
     * Update an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SlsOrdPaymentPlanItemDetails SlsOrdPaymentPlanItemDetails} entity and save it to the S/4HANA system.
     * 
     * @param slsOrdPaymentPlanItemDetails
     *     {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SlsOrdPaymentPlanItemDetails SlsOrdPaymentPlanItemDetails} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SlsOrdPaymentPlanItemDetails SlsOrdPaymentPlanItemDetails} entity. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SlsOrdPaymentPlanItemDetailsUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SlsOrdPaymentPlanItemDetailsUpdateFluentHelper updateSlsOrdPaymentPlanItemDetails(final SlsOrdPaymentPlanItemDetails slsOrdPaymentPlanItemDetails);

    /**
     * Deletes an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SlsOrdPaymentPlanItemDetails SlsOrdPaymentPlanItemDetails} entity in the S/4HANA system.
     * 
     * @param slsOrdPaymentPlanItemDetails
     *     {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SlsOrdPaymentPlanItemDetails SlsOrdPaymentPlanItemDetails} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SlsOrdPaymentPlanItemDetails SlsOrdPaymentPlanItemDetails} entity. To perform execution, call the {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SlsOrdPaymentPlanItemDetailsDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    public SlsOrdPaymentPlanItemDetailsDeleteFluentHelper deleteSlsOrdPaymentPlanItemDetails(final SlsOrdPaymentPlanItemDetails slsOrdPaymentPlanItemDetails);

}
