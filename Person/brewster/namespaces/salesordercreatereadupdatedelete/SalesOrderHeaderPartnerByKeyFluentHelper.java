
package com.sap.brewster.namespaces.salesordercreatereadupdatedelete;

import java.util.Map;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;


/**
 * Fluent helper to fetch a single {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPartner SalesOrderHeaderPartner} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class SalesOrderHeaderPartnerByKeyFluentHelper
    extends FluentHelperByKey<SalesOrderHeaderPartnerByKeyFluentHelper, SalesOrderHeaderPartner, SalesOrderHeaderPartnerSelectable>
{

    final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPartner SalesOrderHeaderPartner} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param partnerFunction
     *     Partner Function<p>Constraints: Not nullable, Maximum length: 2</p>
     * @param salesOrder
     *     Sales Order<p>Constraints: Not nullable, Maximum length: 10</p>
     */
    public SalesOrderHeaderPartnerByKeyFluentHelper(String salesOrder, String partnerFunction) {
        key.put("SalesOrder", salesOrder);
        key.put("PartnerFunction", partnerFunction);
    }

    @Override
    protected Class<SalesOrderHeaderPartner> getEntityClass() {
        return SalesOrderHeaderPartner.class;
    }

    @Override
    protected Map<String, Object> getKey() {
        return key;
    }

}
