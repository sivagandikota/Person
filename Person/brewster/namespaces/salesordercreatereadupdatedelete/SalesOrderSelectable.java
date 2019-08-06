
package com.sap.brewster.namespaces.salesordercreatereadupdatedelete;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;


/**
 * Interface to enable OData entity selectors for {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder SalesOrder}. This interface is used by {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderField SalesOrderField} and {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderLink SalesOrderLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#SALES_ORDER SALES_ORDER}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#SALES_ORDER_TYPE SALES_ORDER_TYPE}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#SALES_ORGANIZATION SALES_ORGANIZATION}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#DISTRIBUTION_CHANNEL DISTRIBUTION_CHANNEL}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#ORGANIZATION_DIVISION ORGANIZATION_DIVISION}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#SALES_GROUP SALES_GROUP}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#SALES_OFFICE SALES_OFFICE}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#SALES_DISTRICT SALES_DISTRICT}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#SOLD_TO_PARTY SOLD_TO_PARTY}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#CREATION_DATE CREATION_DATE}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#CREATED_BY_USER CREATED_BY_USER}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#LAST_CHANGE_DATE LAST_CHANGE_DATE}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#LAST_CHANGE_DATE_TIME LAST_CHANGE_DATE_TIME}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#PURCHASE_ORDER_BY_CUSTOMER PURCHASE_ORDER_BY_CUSTOMER}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#CUSTOMER_PURCHASE_ORDER_TYPE CUSTOMER_PURCHASE_ORDER_TYPE}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#CUSTOMER_PURCHASE_ORDER_DATE CUSTOMER_PURCHASE_ORDER_DATE}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#SALES_ORDER_DATE SALES_ORDER_DATE}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#TOTAL_NET_AMOUNT TOTAL_NET_AMOUNT}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#TRANSACTION_CURRENCY TRANSACTION_CURRENCY}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#SD_DOCUMENT_REASON SD_DOCUMENT_REASON}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#PRICING_DATE PRICING_DATE}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#REQUESTED_DELIVERY_DATE REQUESTED_DELIVERY_DATE}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#SHIPPING_CONDITION SHIPPING_CONDITION}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#COMPLETE_DELIVERY_IS_DEFINED COMPLETE_DELIVERY_IS_DEFINED}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#SHIPPING_TYPE SHIPPING_TYPE}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#HEADER_BILLING_BLOCK_REASON HEADER_BILLING_BLOCK_REASON}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#DELIVERY_BLOCK_REASON DELIVERY_BLOCK_REASON}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#INCOTERMS_CLASSIFICATION INCOTERMS_CLASSIFICATION}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#INCOTERMS_TRANSFER_LOCATION INCOTERMS_TRANSFER_LOCATION}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#INCOTERMS_LOCATION1 INCOTERMS_LOCATION1}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#INCOTERMS_LOCATION2 INCOTERMS_LOCATION2}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#INCOTERMS_VERSION INCOTERMS_VERSION}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#CUSTOMER_PAYMENT_TERMS CUSTOMER_PAYMENT_TERMS}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#PAYMENT_METHOD PAYMENT_METHOD}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#ASSIGNMENT_REFERENCE ASSIGNMENT_REFERENCE}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#OVERALL_SD_PROCESS_STATUS OVERALL_SD_PROCESS_STATUS}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#TOTAL_CREDIT_CHECK_STATUS TOTAL_CREDIT_CHECK_STATUS}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#OVERALL_TOTAL_DELIVERY_STATUS OVERALL_TOTAL_DELIVERY_STATUS}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#OVERALL_SD_DOCUMENT_REJECTION_STS OVERALL_SD_DOCUMENT_REJECTION_STS}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#Y_Y1_BOX_SDH Y_Y1_BOX_SDH}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#TO_ITEM TO_ITEM}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#TO_PARTNER TO_PARTNER}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#TO_PAYMENT_PLAN_ITEM_DETAILS TO_PAYMENT_PLAN_ITEM_DETAILS}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#TO_PRICING_ELEMENT TO_PRICING_ELEMENT}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder#TO_TEXT TO_TEXT}</li>
 * </ul>
 * 
 */
public interface SalesOrderSelectable
    extends EntitySelectable<SalesOrder>
{


}
