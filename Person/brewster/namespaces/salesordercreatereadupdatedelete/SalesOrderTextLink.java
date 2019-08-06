
package com.sap.brewster.namespaces.salesordercreatereadupdatedelete;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntityLink;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmObject;


/**
 * Template class to represent entity navigation links of {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderText SalesOrderText} to other entities. Instances of this object are used in query modifier methods of the entity
 * fluent helpers. Contains methods to compare a field's value with a provided value.
 * 
 * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData
 * field names, so use the constructor with caution.
 * 
 * @param <ObjectT>
 * Entity type of subclasses from {@link com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmObject VdmObject}.
 * 
 */
public class SalesOrderTextLink<ObjectT extends VdmObject<?> >
    extends EntityLink<SalesOrderTextLink<ObjectT> , SalesOrderText, ObjectT>
    implements SalesOrderTextSelectable
{


    /**
     * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData field names, so use with caution.
     * 
     * @param fieldName
     *     OData navigation field name. Must match the field returned by the underlying OData service.
     */
    public SalesOrderTextLink(final String fieldName) {
        super(fieldName);
    }

    private SalesOrderTextLink(final EntityLink<SalesOrderTextLink<ObjectT> , SalesOrderText, ObjectT> toClone) {
        super(toClone);
    }

    @Override
    protected SalesOrderTextLink<ObjectT> translateLinkType(final EntityLink<SalesOrderTextLink<ObjectT> , SalesOrderText, ObjectT> link) {
        return new SalesOrderTextLink<ObjectT>(link);
    }

}
