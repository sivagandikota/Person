
package com.sap.brewster.namespaces.salesordercreatereadupdatedelete;

import java.util.Map;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;


/**
 * Fluent helper to fetch a single {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemText SalesOrderItemText} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class SalesOrderItemTextByKeyFluentHelper
    extends FluentHelperByKey<SalesOrderItemTextByKeyFluentHelper, SalesOrderItemText, SalesOrderItemTextSelectable>
{

    final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemText SalesOrderItemText} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param salesOrderItem
     *     Sales Order Item<p>Constraints: Not nullable, Maximum length: 6</p>
     * @param language
     *     Language Key<p>Constraints: Not nullable, Maximum length: 2</p>
     * @param longTextID
     *     Text ID<p>Constraints: Not nullable, Maximum length: 4</p>
     * @param salesOrder
     *     Sales Order<p>Constraints: Not nullable, Maximum length: 10</p>
     */
    public SalesOrderItemTextByKeyFluentHelper(String salesOrder, String salesOrderItem, String language, String longTextID) {
        key.put("SalesOrder", salesOrder);
        key.put("SalesOrderItem", salesOrderItem);
        key.put("Language", language);
        key.put("LongTextID", longTextID);
    }

    @Override
    protected Class<SalesOrderItemText> getEntityClass() {
        return SalesOrderItemText.class;
    }

    @Override
    protected Map<String, Object> getKey() {
        return key;
    }

}
