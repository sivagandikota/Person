
package com.sap.brewster.namespaces.salesordercreatereadupdatedelete;

import java.util.Map;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;


/**
 * Fluent helper to fetch a single {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SlsOrdPaymentPlanItemDetails SlsOrdPaymentPlanItemDetails} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class SlsOrdPaymentPlanItemDetailsByKeyFluentHelper
    extends FluentHelperByKey<SlsOrdPaymentPlanItemDetailsByKeyFluentHelper, SlsOrdPaymentPlanItemDetails, SlsOrdPaymentPlanItemDetailsSelectable>
{

    final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SlsOrdPaymentPlanItemDetails SlsOrdPaymentPlanItemDetails} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param paymentPlanItem
     *     Item for billing plan/invoice plan/payment cards<p>Constraints: Not nullable, Maximum length: 6</p>
     * @param salesOrder
     *     Sales Order<p>Constraints: Not nullable, Maximum length: 10</p>
     */
    public SlsOrdPaymentPlanItemDetailsByKeyFluentHelper(String salesOrder, String paymentPlanItem) {
        key.put("SalesOrder", salesOrder);
        key.put("PaymentPlanItem", paymentPlanItem);
    }

    @Override
    protected Class<SlsOrdPaymentPlanItemDetails> getEntityClass() {
        return SlsOrdPaymentPlanItemDetails.class;
    }

    @Override
    protected Map<String, Object> getKey() {
        return key;
    }

}
