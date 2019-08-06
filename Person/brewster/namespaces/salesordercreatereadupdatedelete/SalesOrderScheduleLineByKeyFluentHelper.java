
package com.sap.brewster.namespaces.salesordercreatereadupdatedelete;

import java.util.Map;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;


/**
 * Fluent helper to fetch a single {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderScheduleLine SalesOrderScheduleLine} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class SalesOrderScheduleLineByKeyFluentHelper
    extends FluentHelperByKey<SalesOrderScheduleLineByKeyFluentHelper, SalesOrderScheduleLine, SalesOrderScheduleLineSelectable>
{

    final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderScheduleLine SalesOrderScheduleLine} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param salesOrderItem
     *     Sales Document Item<p>Constraints: Not nullable, Maximum length: 6</p>
     * @param scheduleLine
     *     Schedule Line Number<p>Constraints: Not nullable, Maximum length: 4</p>
     * @param salesOrder
     *     Sales Document<p>Constraints: Not nullable, Maximum length: 10</p>
     */
    public SalesOrderScheduleLineByKeyFluentHelper(String salesOrder, String salesOrderItem, String scheduleLine) {
        key.put("SalesOrder", salesOrder);
        key.put("SalesOrderItem", salesOrderItem);
        key.put("ScheduleLine", scheduleLine);
    }

    @Override
    protected Class<SalesOrderScheduleLine> getEntityClass() {
        return SalesOrderScheduleLine.class;
    }

    @Override
    protected Map<String, Object> getKey() {
        return key;
    }

}
