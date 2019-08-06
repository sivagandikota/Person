
package com.sap.brewster.namespaces.salesordercreatereadupdatedelete;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;


/**
 * Interface to enable OData entity selectors for {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement SalesOrderHeaderPrElement}. This interface is used by {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElementField SalesOrderHeaderPrElementField} and {@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElementLink SalesOrderHeaderPrElementLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#SALES_ORDER SALES_ORDER}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#PRICING_PROCEDURE_STEP PRICING_PROCEDURE_STEP}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#PRICING_PROCEDURE_COUNTER PRICING_PROCEDURE_COUNTER}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#CONDITION_TYPE CONDITION_TYPE}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#PRICING_DATE_TIME PRICING_DATE_TIME}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#CONDITION_CALCULATION_TYPE CONDITION_CALCULATION_TYPE}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#CONDITION_BASE_VALUE CONDITION_BASE_VALUE}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#CONDITION_RATE_VALUE CONDITION_RATE_VALUE}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#CONDITION_CURRENCY CONDITION_CURRENCY}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#CONDITION_QUANTITY CONDITION_QUANTITY}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#CONDITION_QUANTITY_UNIT CONDITION_QUANTITY_UNIT}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#CONDITION_CATEGORY CONDITION_CATEGORY}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#CONDITION_IS_FOR_STATISTICS CONDITION_IS_FOR_STATISTICS}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#PRICING_SCALE_TYPE PRICING_SCALE_TYPE}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#CONDITION_ORIGIN CONDITION_ORIGIN}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#IS_GROUP_CONDITION IS_GROUP_CONDITION}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#CONDITION_RECORD CONDITION_RECORD}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#CONDITION_SEQUENTIAL_NUMBER CONDITION_SEQUENTIAL_NUMBER}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#TAX_CODE TAX_CODE}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#WITHHOLDING_TAX_CODE WITHHOLDING_TAX_CODE}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#CNDN_ROUNDING_OFF_DIFF_AMOUNT CNDN_ROUNDING_OFF_DIFF_AMOUNT}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#CONDITION_AMOUNT CONDITION_AMOUNT}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#TRANSACTION_CURRENCY TRANSACTION_CURRENCY}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#CONDITION_CONTROL CONDITION_CONTROL}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#CONDITION_INACTIVE_REASON CONDITION_INACTIVE_REASON}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#CONDITION_CLASS CONDITION_CLASS}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#PRCG_PROCEDURE_COUNTER_FOR_HEADER PRCG_PROCEDURE_COUNTER_FOR_HEADER}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#FACTOR_FOR_CONDITION_BASIS_VALUE FACTOR_FOR_CONDITION_BASIS_VALUE}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#STRUCTURE_CONDITION STRUCTURE_CONDITION}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#PERIOD_FACTOR_FOR_CNDN_BASIS_VALUE PERIOD_FACTOR_FOR_CNDN_BASIS_VALUE}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#PRICING_SCALE_BASIS PRICING_SCALE_BASIS}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#CONDITION_SCALE_BASIS_VALUE CONDITION_SCALE_BASIS_VALUE}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#CONDITION_SCALE_BASIS_UNIT CONDITION_SCALE_BASIS_UNIT}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#CONDITION_SCALE_BASIS_CURRENCY CONDITION_SCALE_BASIS_CURRENCY}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#CNDN_IS_RELEVANT_FOR_INTCO_BILLING CNDN_IS_RELEVANT_FOR_INTCO_BILLING}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#CONDITION_IS_MANUALLY_CHANGED CONDITION_IS_MANUALLY_CHANGED}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#CONDITION_IS_FOR_CONFIGURATION CONDITION_IS_FOR_CONFIGURATION}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#VARIANT_CONDITION VARIANT_CONDITION}</li>
 * <li>{@link com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement#TO_SALES_ORDER TO_SALES_ORDER}</li>
 * </ul>
 * 
 */
public interface SalesOrderHeaderPrElementSelectable
    extends EntitySelectable<SalesOrderHeaderPrElement>
{


}
