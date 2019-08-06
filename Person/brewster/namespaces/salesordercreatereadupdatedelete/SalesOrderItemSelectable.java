
package com.sap.brewster.namespaces.salesordercreatereadupdatedelete;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;


/**
 * Interface to enable OData entity selectors for {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem SalesOrderItem}. This interface is used by {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemField SalesOrderItemField} and {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemLink SalesOrderItemLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#SALES_ORDER SALES_ORDER}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#SALES_ORDER_ITEM SALES_ORDER_ITEM}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#HIGHER_LEVEL_ITEM HIGHER_LEVEL_ITEM}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#SALES_ORDER_ITEM_CATEGORY SALES_ORDER_ITEM_CATEGORY}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#SALES_ORDER_ITEM_TEXT SALES_ORDER_ITEM_TEXT}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#PURCHASE_ORDER_BY_CUSTOMER PURCHASE_ORDER_BY_CUSTOMER}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#MATERIAL MATERIAL}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#MATERIAL_BY_CUSTOMER MATERIAL_BY_CUSTOMER}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#PRICING_DATE PRICING_DATE}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#REQUESTED_QUANTITY REQUESTED_QUANTITY}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#REQUESTED_QUANTITY_UNIT REQUESTED_QUANTITY_UNIT}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#ITEM_GROSS_WEIGHT ITEM_GROSS_WEIGHT}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#ITEM_NET_WEIGHT ITEM_NET_WEIGHT}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#ITEM_WEIGHT_UNIT ITEM_WEIGHT_UNIT}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#ITEM_VOLUME ITEM_VOLUME}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#ITEM_VOLUME_UNIT ITEM_VOLUME_UNIT}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#TRANSACTION_CURRENCY TRANSACTION_CURRENCY}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#NET_AMOUNT NET_AMOUNT}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#MATERIAL_GROUP MATERIAL_GROUP}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#MATERIAL_PRICING_GROUP MATERIAL_PRICING_GROUP}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#BATCH BATCH}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#PRODUCTION_PLANT PRODUCTION_PLANT}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#STORAGE_LOCATION STORAGE_LOCATION}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#DELIVERY_GROUP DELIVERY_GROUP}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#SHIPPING_POINT SHIPPING_POINT}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#SHIPPING_TYPE SHIPPING_TYPE}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#DELIVERY_PRIORITY DELIVERY_PRIORITY}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#INCOTERMS_CLASSIFICATION INCOTERMS_CLASSIFICATION}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#INCOTERMS_TRANSFER_LOCATION INCOTERMS_TRANSFER_LOCATION}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#INCOTERMS_LOCATION1 INCOTERMS_LOCATION1}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#INCOTERMS_LOCATION2 INCOTERMS_LOCATION2}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#CUSTOMER_PAYMENT_TERMS CUSTOMER_PAYMENT_TERMS}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#SALES_DOCUMENT_RJCN_REASON SALES_DOCUMENT_RJCN_REASON}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#ITEM_BILLING_BLOCK_REASON ITEM_BILLING_BLOCK_REASON}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#WBS_ELEMENT WBS_ELEMENT}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#PROFIT_CENTER PROFIT_CENTER}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#SD_PROCESS_STATUS SD_PROCESS_STATUS}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#DELIVERY_STATUS DELIVERY_STATUS}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#ORDER_RELATED_BILLING_STATUS ORDER_RELATED_BILLING_STATUS}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#TO_PARTNER TO_PARTNER}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#TO_PRICING_ELEMENT TO_PRICING_ELEMENT}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#TO_SALES_ORDER TO_SALES_ORDER}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#TO_SCHEDULE_LINE TO_SCHEDULE_LINE}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem#TO_TEXT TO_TEXT}</li>
 * </ul>
 * 
 */
public interface SalesOrderItemSelectable
    extends EntitySelectable<SalesOrderItem>
{


}
