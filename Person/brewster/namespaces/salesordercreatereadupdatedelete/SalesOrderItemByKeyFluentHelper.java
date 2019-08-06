
package com.sap.brewster.namespaces.salesordercreatereadupdatedelete;

import java.util.Map;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;


/**
 * Fluent helper to fetch a single {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem SalesOrderItem} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class SalesOrderItemByKeyFluentHelper
    extends FluentHelperByKey<SalesOrderItemByKeyFluentHelper, SalesOrderItem, SalesOrderItemSelectable>
{

    final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem SalesOrderItem} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param salesOrderItem
     *     Sales Order Item<p>Constraints: Not nullable, Maximum length: 6</p>
     * @param salesOrder
     *     Sales Order<p>Constraints: Not nullable, Maximum length: 10</p>
     */
    public SalesOrderItemByKeyFluentHelper(String salesOrder, String salesOrderItem) {
        key.put("SalesOrder", salesOrder);
        key.put("SalesOrderItem", salesOrderItem);
    }

    @Override
    protected Class<SalesOrderItem> getEntityClass() {
        return SalesOrderItem.class;
    }

    @Override
    protected Map<String, Object> getKey() {
        return key;
    }

}
