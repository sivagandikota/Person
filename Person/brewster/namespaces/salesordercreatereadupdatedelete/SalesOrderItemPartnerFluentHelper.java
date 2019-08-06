
package com.sap.brewster.namespaces.salesordercreatereadupdatedelete;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperRead;


/**
 * Fluent helper to fetch multiple {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPartner SalesOrderItemPartner} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class SalesOrderItemPartnerFluentHelper
    extends FluentHelperRead<SalesOrderItemPartnerFluentHelper, SalesOrderItemPartner, SalesOrderItemPartnerSelectable>
{


    @Override
    protected Class<SalesOrderItemPartner> getEntityClass() {
        return SalesOrderItemPartner.class;
    }

}
