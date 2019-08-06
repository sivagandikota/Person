
package com.sap.brewster.namespaces.salesordercreatereadupdatedelete;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperRead;


/**
 * Fluent helper to fetch multiple {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemText SalesOrderItemText} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class SalesOrderItemTextFluentHelper
    extends FluentHelperRead<SalesOrderItemTextFluentHelper, SalesOrderItemText, SalesOrderItemTextSelectable>
{


    @Override
    protected Class<SalesOrderItemText> getEntityClass() {
        return SalesOrderItemText.class;
    }

}
