
package com.sap.brewster.namespaces.salesordercreatereadupdatedelete;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperRead;


/**
 * Fluent helper to fetch multiple {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder SalesOrder} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class SalesOrderFluentHelper
    extends FluentHelperRead<SalesOrderFluentHelper, SalesOrder, SalesOrderSelectable>
{


    @Override
    protected Class<SalesOrder> getEntityClass() {
        return SalesOrder.class;
    }

}
