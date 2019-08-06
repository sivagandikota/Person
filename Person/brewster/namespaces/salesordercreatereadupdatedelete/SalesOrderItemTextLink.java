
package com.sap.brewster.namespaces.salesordercreatereadupdatedelete;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntityLink;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmObject;


/**
 * Template class to represent entity navigation links of {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemText SalesOrderItemText} to other entities. Instances of this object are used in query modifier methods of the entity
 * fluent helpers. Contains methods to compare a field's value with a provided value.
 * 
 * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData
 * field names, so use the constructor with caution.
 * 
 * @param <ObjectT>
 * Entity type of subclasses from {@link com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmObject VdmObject}.
 * 
 */
public class SalesOrderItemTextLink<ObjectT extends VdmObject<?> >
    extends EntityLink<SalesOrderItemTextLink<ObjectT> , SalesOrderItemText, ObjectT>
    implements SalesOrderItemTextSelectable
{


    /**
     * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData field names, so use with caution.
     * 
     * @param fieldName
     *     OData navigation field name. Must match the field returned by the underlying OData service.
     */
    public SalesOrderItemTextLink(final String fieldName) {
        super(fieldName);
    }

    private SalesOrderItemTextLink(final EntityLink<SalesOrderItemTextLink<ObjectT> , SalesOrderItemText, ObjectT> toClone) {
        super(toClone);
    }

    @Override
    protected SalesOrderItemTextLink<ObjectT> translateLinkType(final EntityLink<SalesOrderItemTextLink<ObjectT> , SalesOrderItemText, ObjectT> link) {
        return new SalesOrderItemTextLink<ObjectT>(link);
    }

}
