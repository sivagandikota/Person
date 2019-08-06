
package com.sap.brewster.namespaces.salesordercreatereadupdatedelete;

import java.util.Map;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;


/**
 * Fluent helper to fetch a single {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPrElement SalesOrderItemPrElement} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class SalesOrderItemPrElementByKeyFluentHelper
    extends FluentHelperByKey<SalesOrderItemPrElementByKeyFluentHelper, SalesOrderItemPrElement, SalesOrderItemPrElementSelectable>
{

    final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPrElement SalesOrderItemPrElement} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param salesOrderItem
     *     Sales Order Item<p>Constraints: Not nullable, Maximum length: 6</p>
     * @param pricingProcedureCounter
     *     Condition Counter<p>Constraints: Not nullable, Maximum length: 3</p>
     * @param salesOrder
     *     Sales Order<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param pricingProcedureStep
     *     Step Number<p>Constraints: Not nullable, Maximum length: 3</p>
     */
    public SalesOrderItemPrElementByKeyFluentHelper(String salesOrder, String salesOrderItem, String pricingProcedureStep, String pricingProcedureCounter) {
        key.put("SalesOrder", salesOrder);
        key.put("SalesOrderItem", salesOrderItem);
        key.put("PricingProcedureStep", pricingProcedureStep);
        key.put("PricingProcedureCounter", pricingProcedureCounter);
    }

    @Override
    protected Class<SalesOrderItemPrElement> getEntityClass() {
        return SalesOrderItemPrElement.class;
    }

    @Override
    protected Map<String, Object> getKey() {
        return key;
    }

}
