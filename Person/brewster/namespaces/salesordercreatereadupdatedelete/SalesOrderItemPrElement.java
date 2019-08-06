
package com.sap.brewster.namespaces.salesordercreatereadupdatedelete;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.sap.cloud.sdk.odatav2.connectivity.ODataException;
import com.sap.cloud.sdk.odatav2.connectivity.ODataExceptionType;
import com.sap.cloud.sdk.odatav2.connectivity.ODataQuery;
import com.sap.cloud.sdk.odatav2.connectivity.ODataQueryBuilder;
import com.sap.cloud.sdk.odatav2.connectivity.ODataQueryResult;
import com.sap.cloud.sdk.s4hana.connectivity.ErpConfigContext;
import com.sap.cloud.sdk.s4hana.connectivity.ErpEndpoint;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.ODataTypeValueSerializer;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.apache.olingo.odata2.api.edm.EdmSimpleTypeKind;


/**
 * Sales Order Item Pricing Element API<p></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class SalesOrderItemPrElement
    extends VdmEntity<SalesOrderItemPrElement>
{

    /**
     * Selector for all available fields of SalesOrderItemPrElement.
     * 
     */
    public final static SalesOrderItemPrElementSelectable ALL_FIELDS = new SalesOrderItemPrElementSelectable() {


        @Override
        public String getFieldName() {
            return "*";
        }

        @Override
        public List<String> getSelections() {
            return Collections.singletonList("*");
        }

    }
    ;
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10
     * 
     * @param salesOrder
     *     
     * @return
     *     Sales Order
     */
    @SerializedName("SalesOrder")
    @JsonProperty("SalesOrder")
    @Nullable
    private String salesOrder;
    /**
     * Use with available fluent helpers to apply the <b>SalesOrder</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<String> SALES_ORDER = new SalesOrderItemPrElementField<String>("SalesOrder");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 6
     * 
     * @param salesOrderItem
     *     
     * @return
     *     Sales Order Item
     */
    @SerializedName("SalesOrderItem")
    @JsonProperty("SalesOrderItem")
    @Nullable
    private String salesOrderItem;
    /**
     * Use with available fluent helpers to apply the <b>SalesOrderItem</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<String> SALES_ORDER_ITEM = new SalesOrderItemPrElementField<String>("SalesOrderItem");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 3
     * 
     * @param pricingProcedureStep
     *     
     * @return
     *     Step Number
     */
    @SerializedName("PricingProcedureStep")
    @JsonProperty("PricingProcedureStep")
    @Nullable
    private String pricingProcedureStep;
    /**
     * Use with available fluent helpers to apply the <b>PricingProcedureStep</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<String> PRICING_PROCEDURE_STEP = new SalesOrderItemPrElementField<String>("PricingProcedureStep");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 3
     * 
     * @param pricingProcedureCounter
     *     
     * @return
     *     Condition Counter
     */
    @SerializedName("PricingProcedureCounter")
    @JsonProperty("PricingProcedureCounter")
    @Nullable
    private String pricingProcedureCounter;
    /**
     * Use with available fluent helpers to apply the <b>PricingProcedureCounter</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<String> PRICING_PROCEDURE_COUNTER = new SalesOrderItemPrElementField<String>("PricingProcedureCounter");
    /**
     * Constraints: Not nullable, Maximum length: 4
     * 
     * @param conditionType
     *     
     * @return
     *     Condition Type
     */
    @SerializedName("ConditionType")
    @JsonProperty("ConditionType")
    @Nullable
    private String conditionType;
    /**
     * Use with available fluent helpers to apply the <b>ConditionType</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<String> CONDITION_TYPE = new SalesOrderItemPrElementField<String>("ConditionType");
    /**
     * Constraints: Not nullable, Maximum length: 14
     * 
     * @param pricingDateTime
     *     
     * @return
     *     Timestamp for Pricing
     */
    @SerializedName("PricingDateTime")
    @JsonProperty("PricingDateTime")
    @Nullable
    private String pricingDateTime;
    /**
     * Use with available fluent helpers to apply the <b>PricingDateTime</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<String> PRICING_DATE_TIME = new SalesOrderItemPrElementField<String>("PricingDateTime");
    /**
     * Constraints: Not nullable, Maximum length: 3
     * 
     * @param conditionCalculationType
     *     
     * @return
     *     Calculation Type for Condition
     */
    @SerializedName("ConditionCalculationType")
    @JsonProperty("ConditionCalculationType")
    @Nullable
    private String conditionCalculationType;
    /**
     * Use with available fluent helpers to apply the <b>ConditionCalculationType</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<String> CONDITION_CALCULATION_TYPE = new SalesOrderItemPrElementField<String>("ConditionCalculationType");
    /**
     * Constraints: Not nullable, Precision: 24, Scale: 9
     * 
     * @param conditionBaseValue
     *     
     * @return
     *     Condition Basis Value
     */
    @SerializedName("ConditionBaseValue")
    @JsonProperty("ConditionBaseValue")
    @Nullable
    private BigDecimal conditionBaseValue;
    /**
     * Use with available fluent helpers to apply the <b>ConditionBaseValue</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<BigDecimal> CONDITION_BASE_VALUE = new SalesOrderItemPrElementField<BigDecimal>("ConditionBaseValue");
    /**
     * Constraints: Not nullable, Precision: 24, Scale: 9
     * 
     * @param conditionRateValue
     *     
     * @return
     *     Rate (Amount or Percentage)
     */
    @SerializedName("ConditionRateValue")
    @JsonProperty("ConditionRateValue")
    @Nullable
    private BigDecimal conditionRateValue;
    /**
     * Use with available fluent helpers to apply the <b>ConditionRateValue</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<BigDecimal> CONDITION_RATE_VALUE = new SalesOrderItemPrElementField<BigDecimal>("ConditionRateValue");
    /**
     * Constraints: Not nullable, Maximum length: 5
     * 
     * @param conditionCurrency
     *     
     * @return
     *     Currency Key
     */
    @SerializedName("ConditionCurrency")
    @JsonProperty("ConditionCurrency")
    @Nullable
    private String conditionCurrency;
    /**
     * Use with available fluent helpers to apply the <b>ConditionCurrency</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<String> CONDITION_CURRENCY = new SalesOrderItemPrElementField<String>("ConditionCurrency");
    /**
     * Constraints: Not nullable, Precision: 5, Scale: 0
     * 
     * @param conditionQuantity
     *     
     * @return
     *     Condition Pricing Unit
     */
    @SerializedName("ConditionQuantity")
    @JsonProperty("ConditionQuantity")
    @Nullable
    private BigDecimal conditionQuantity;
    /**
     * Use with available fluent helpers to apply the <b>ConditionQuantity</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<BigDecimal> CONDITION_QUANTITY = new SalesOrderItemPrElementField<BigDecimal>("ConditionQuantity");
    /**
     * Constraints: Not nullable, Maximum length: 3
     * 
     * @param conditionQuantityUnit
     *     
     * @return
     *     Condition Unit in the Document
     */
    @SerializedName("ConditionQuantityUnit")
    @JsonProperty("ConditionQuantityUnit")
    @Nullable
    private String conditionQuantityUnit;
    /**
     * Use with available fluent helpers to apply the <b>ConditionQuantityUnit</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<String> CONDITION_QUANTITY_UNIT = new SalesOrderItemPrElementField<String>("ConditionQuantityUnit");
    /**
     * Constraints: Not nullable, Maximum length: 1
     * 
     * @param conditionCategory
     *     
     * @return
     *     Condition Category (Examples: Tax, Freight, Price, Cost)
     */
    @SerializedName("ConditionCategory")
    @JsonProperty("ConditionCategory")
    @Nullable
    private String conditionCategory;
    /**
     * Use with available fluent helpers to apply the <b>ConditionCategory</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<String> CONDITION_CATEGORY = new SalesOrderItemPrElementField<String>("ConditionCategory");
    /**
     * Constraints: none
     * 
     * @param conditionIsForStatistics
     *     
     * @return
     *     Condition is used for statistics
     */
    @SerializedName("ConditionIsForStatistics")
    @JsonProperty("ConditionIsForStatistics")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    private Boolean conditionIsForStatistics;
    /**
     * Use with available fluent helpers to apply the <b>ConditionIsForStatistics</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<Boolean> CONDITION_IS_FOR_STATISTICS = new SalesOrderItemPrElementField<Boolean>("ConditionIsForStatistics");
    /**
     * Constraints: Not nullable, Maximum length: 1
     * 
     * @param pricingScaleType
     *     
     * @return
     *     Scale Type
     */
    @SerializedName("PricingScaleType")
    @JsonProperty("PricingScaleType")
    @Nullable
    private String pricingScaleType;
    /**
     * Use with available fluent helpers to apply the <b>PricingScaleType</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<String> PRICING_SCALE_TYPE = new SalesOrderItemPrElementField<String>("PricingScaleType");
    /**
     * Constraints: none
     * 
     * @param isRelevantForAccrual
     *     
     * @return
     *     Condition is Relevant for Accrual  (e.g. Freight)
     */
    @SerializedName("IsRelevantForAccrual")
    @JsonProperty("IsRelevantForAccrual")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    private Boolean isRelevantForAccrual;
    /**
     * Use with available fluent helpers to apply the <b>IsRelevantForAccrual</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<Boolean> IS_RELEVANT_FOR_ACCRUAL = new SalesOrderItemPrElementField<Boolean>("IsRelevantForAccrual");
    /**
     * Constraints: Not nullable, Maximum length: 1
     * 
     * @param cndnIsRelevantForInvoiceList
     *     
     * @return
     *     Condition for Invoice List
     */
    @SerializedName("CndnIsRelevantForInvoiceList")
    @JsonProperty("CndnIsRelevantForInvoiceList")
    @Nullable
    private String cndnIsRelevantForInvoiceList;
    /**
     * Use with available fluent helpers to apply the <b>CndnIsRelevantForInvoiceList</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<String> CNDN_IS_RELEVANT_FOR_INVOICE_LIST = new SalesOrderItemPrElementField<String>("CndnIsRelevantForInvoiceList");
    /**
     * Constraints: Not nullable, Maximum length: 1
     * 
     * @param conditionOrigin
     *     
     * @return
     *     Origin of the Condition
     */
    @SerializedName("ConditionOrigin")
    @JsonProperty("ConditionOrigin")
    @Nullable
    private String conditionOrigin;
    /**
     * Use with available fluent helpers to apply the <b>ConditionOrigin</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<String> CONDITION_ORIGIN = new SalesOrderItemPrElementField<String>("ConditionOrigin");
    /**
     * Constraints: Not nullable, Maximum length: 1
     * 
     * @param isGroupCondition
     *     
     * @return
     *     Group Condition
     */
    @SerializedName("IsGroupCondition")
    @JsonProperty("IsGroupCondition")
    @Nullable
    private String isGroupCondition;
    /**
     * Use with available fluent helpers to apply the <b>IsGroupCondition</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<String> IS_GROUP_CONDITION = new SalesOrderItemPrElementField<String>("IsGroupCondition");
    /**
     * Constraints: Not nullable, Maximum length: 10
     * 
     * @param conditionRecord
     *     
     * @return
     *     Condition record number
     */
    @SerializedName("ConditionRecord")
    @JsonProperty("ConditionRecord")
    @Nullable
    private String conditionRecord;
    /**
     * Use with available fluent helpers to apply the <b>ConditionRecord</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<String> CONDITION_RECORD = new SalesOrderItemPrElementField<String>("ConditionRecord");
    /**
     * Constraints: Not nullable, Maximum length: 3
     * 
     * @param conditionSequentialNumber
     *     
     * @return
     *     Sequential Number of the Condition
     */
    @SerializedName("ConditionSequentialNumber")
    @JsonProperty("ConditionSequentialNumber")
    @Nullable
    private String conditionSequentialNumber;
    /**
     * Use with available fluent helpers to apply the <b>ConditionSequentialNumber</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<String> CONDITION_SEQUENTIAL_NUMBER = new SalesOrderItemPrElementField<String>("ConditionSequentialNumber");
    /**
     * Constraints: Not nullable, Maximum length: 2
     * 
     * @param taxCode
     *     
     * @return
     *     Tax on Sales/Purchases Code
     */
    @SerializedName("TaxCode")
    @JsonProperty("TaxCode")
    @Nullable
    private String taxCode;
    /**
     * Use with available fluent helpers to apply the <b>TaxCode</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<String> TAX_CODE = new SalesOrderItemPrElementField<String>("TaxCode");
    /**
     * Constraints: Not nullable, Maximum length: 2
     * 
     * @param withholdingTaxCode
     *     
     * @return
     *     Withholding tax code
     */
    @SerializedName("WithholdingTaxCode")
    @JsonProperty("WithholdingTaxCode")
    @Nullable
    private String withholdingTaxCode;
    /**
     * Use with available fluent helpers to apply the <b>WithholdingTaxCode</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<String> WITHHOLDING_TAX_CODE = new SalesOrderItemPrElementField<String>("WithholdingTaxCode");
    /**
     * Constraints: Not nullable, Precision: 6, Scale: 3
     * 
     * @param cndnRoundingOffDiffAmount
     *     
     * @return
     *     Rounding-Off Difference of the Condition
     */
    @SerializedName("CndnRoundingOffDiffAmount")
    @JsonProperty("CndnRoundingOffDiffAmount")
    @Nullable
    private BigDecimal cndnRoundingOffDiffAmount;
    /**
     * Use with available fluent helpers to apply the <b>CndnRoundingOffDiffAmount</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<BigDecimal> CNDN_ROUNDING_OFF_DIFF_AMOUNT = new SalesOrderItemPrElementField<BigDecimal>("CndnRoundingOffDiffAmount");
    /**
     * Constraints: Not nullable, Precision: 16, Scale: 3
     * 
     * @param conditionAmount
     *     
     * @return
     *     Condition Value
     */
    @SerializedName("ConditionAmount")
    @JsonProperty("ConditionAmount")
    @Nullable
    private BigDecimal conditionAmount;
    /**
     * Use with available fluent helpers to apply the <b>ConditionAmount</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<BigDecimal> CONDITION_AMOUNT = new SalesOrderItemPrElementField<BigDecimal>("ConditionAmount");
    /**
     * Constraints: Not nullable, Maximum length: 5
     * 
     * @param transactionCurrency
     *     
     * @return
     *     SD document currency
     */
    @SerializedName("TransactionCurrency")
    @JsonProperty("TransactionCurrency")
    @Nullable
    private String transactionCurrency;
    /**
     * Use with available fluent helpers to apply the <b>TransactionCurrency</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<String> TRANSACTION_CURRENCY = new SalesOrderItemPrElementField<String>("TransactionCurrency");
    /**
     * Constraints: Not nullable, Maximum length: 1
     * 
     * @param conditionControl
     *     
     * @return
     *     Condition Control
     */
    @SerializedName("ConditionControl")
    @JsonProperty("ConditionControl")
    @Nullable
    private String conditionControl;
    /**
     * Use with available fluent helpers to apply the <b>ConditionControl</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<String> CONDITION_CONTROL = new SalesOrderItemPrElementField<String>("ConditionControl");
    /**
     * Constraints: Not nullable, Maximum length: 1
     * 
     * @param conditionInactiveReason
     *     
     * @return
     *     Condition is Inactive
     */
    @SerializedName("ConditionInactiveReason")
    @JsonProperty("ConditionInactiveReason")
    @Nullable
    private String conditionInactiveReason;
    /**
     * Use with available fluent helpers to apply the <b>ConditionInactiveReason</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<String> CONDITION_INACTIVE_REASON = new SalesOrderItemPrElementField<String>("ConditionInactiveReason");
    /**
     * Constraints: Not nullable, Maximum length: 1
     * 
     * @param conditionClass
     *     
     * @return
     *     Condition Class
     */
    @SerializedName("ConditionClass")
    @JsonProperty("ConditionClass")
    @Nullable
    private String conditionClass;
    /**
     * Use with available fluent helpers to apply the <b>ConditionClass</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<String> CONDITION_CLASS = new SalesOrderItemPrElementField<String>("ConditionClass");
    /**
     * Constraints: Not nullable, Maximum length: 3
     * 
     * @param prcgProcedureCounterForHeader
     *     
     * @return
     *     Condition Counter (Header)
     */
    @SerializedName("PrcgProcedureCounterForHeader")
    @JsonProperty("PrcgProcedureCounterForHeader")
    @Nullable
    private String prcgProcedureCounterForHeader;
    /**
     * Use with available fluent helpers to apply the <b>PrcgProcedureCounterForHeader</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<String> PRCG_PROCEDURE_COUNTER_FOR_HEADER = new SalesOrderItemPrElementField<String>("PrcgProcedureCounterForHeader");
    /**
     * Constraints: none
     * 
     * @param factorForConditionBasisValue
     *     
     * @return
     *     Factor for Condition Base Value
     */
    @SerializedName("FactorForConditionBasisValue")
    @JsonProperty("FactorForConditionBasisValue")
    @Nullable
    private Double factorForConditionBasisValue;
    /**
     * Use with available fluent helpers to apply the <b>FactorForConditionBasisValue</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<Double> FACTOR_FOR_CONDITION_BASIS_VALUE = new SalesOrderItemPrElementField<Double>("FactorForConditionBasisValue");
    /**
     * Constraints: Not nullable, Maximum length: 1
     * 
     * @param structureCondition
     *     
     * @return
     *     Structure Condition
     */
    @SerializedName("StructureCondition")
    @JsonProperty("StructureCondition")
    @Nullable
    private String structureCondition;
    /**
     * Use with available fluent helpers to apply the <b>StructureCondition</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<String> STRUCTURE_CONDITION = new SalesOrderItemPrElementField<String>("StructureCondition");
    /**
     * Constraints: none
     * 
     * @param periodFactorForCndnBasisValue
     *     
     * @return
     *     Factor for Condition Basis (Period)
     */
    @SerializedName("PeriodFactorForCndnBasisValue")
    @JsonProperty("PeriodFactorForCndnBasisValue")
    @Nullable
    private Double periodFactorForCndnBasisValue;
    /**
     * Use with available fluent helpers to apply the <b>PeriodFactorForCndnBasisValue</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<Double> PERIOD_FACTOR_FOR_CNDN_BASIS_VALUE = new SalesOrderItemPrElementField<Double>("PeriodFactorForCndnBasisValue");
    /**
     * Constraints: Not nullable, Maximum length: 3
     * 
     * @param pricingScaleBasis
     *     
     * @return
     *     Scale Basis Indicator
     */
    @SerializedName("PricingScaleBasis")
    @JsonProperty("PricingScaleBasis")
    @Nullable
    private String pricingScaleBasis;
    /**
     * Use with available fluent helpers to apply the <b>PricingScaleBasis</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<String> PRICING_SCALE_BASIS = new SalesOrderItemPrElementField<String>("PricingScaleBasis");
    /**
     * Constraints: Not nullable, Precision: 24, Scale: 9
     * 
     * @param conditionScaleBasisValue
     *     
     * @return
     *     Scale Basis Value
     */
    @SerializedName("ConditionScaleBasisValue")
    @JsonProperty("ConditionScaleBasisValue")
    @Nullable
    private BigDecimal conditionScaleBasisValue;
    /**
     * Use with available fluent helpers to apply the <b>ConditionScaleBasisValue</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<BigDecimal> CONDITION_SCALE_BASIS_VALUE = new SalesOrderItemPrElementField<BigDecimal>("ConditionScaleBasisValue");
    /**
     * Constraints: Not nullable, Maximum length: 3
     * 
     * @param conditionScaleBasisUnit
     *     
     * @return
     *     Condition Scale Unit of Measure
     */
    @SerializedName("ConditionScaleBasisUnit")
    @JsonProperty("ConditionScaleBasisUnit")
    @Nullable
    private String conditionScaleBasisUnit;
    /**
     * Use with available fluent helpers to apply the <b>ConditionScaleBasisUnit</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<String> CONDITION_SCALE_BASIS_UNIT = new SalesOrderItemPrElementField<String>("ConditionScaleBasisUnit");
    /**
     * Constraints: Not nullable, Maximum length: 5
     * 
     * @param conditionScaleBasisCurrency
     *     
     * @return
     *     Scale Currency
     */
    @SerializedName("ConditionScaleBasisCurrency")
    @JsonProperty("ConditionScaleBasisCurrency")
    @Nullable
    private String conditionScaleBasisCurrency;
    /**
     * Use with available fluent helpers to apply the <b>ConditionScaleBasisCurrency</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<String> CONDITION_SCALE_BASIS_CURRENCY = new SalesOrderItemPrElementField<String>("ConditionScaleBasisCurrency");
    /**
     * Constraints: none
     * 
     * @param cndnIsRelevantForIntcoBilling
     *     
     * @return
     *     Condition for Intercompany Billing
     */
    @SerializedName("CndnIsRelevantForIntcoBilling")
    @JsonProperty("CndnIsRelevantForIntcoBilling")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    private Boolean cndnIsRelevantForIntcoBilling;
    /**
     * Use with available fluent helpers to apply the <b>CndnIsRelevantForIntcoBilling</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<Boolean> CNDN_IS_RELEVANT_FOR_INTCO_BILLING = new SalesOrderItemPrElementField<Boolean>("CndnIsRelevantForIntcoBilling");
    /**
     * Constraints: none
     * 
     * @param conditionIsManuallyChanged
     *     
     * @return
     *     Condition Changed Manually
     */
    @SerializedName("ConditionIsManuallyChanged")
    @JsonProperty("ConditionIsManuallyChanged")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    private Boolean conditionIsManuallyChanged;
    /**
     * Use with available fluent helpers to apply the <b>ConditionIsManuallyChanged</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<Boolean> CONDITION_IS_MANUALLY_CHANGED = new SalesOrderItemPrElementField<Boolean>("ConditionIsManuallyChanged");
    /**
     * Constraints: none
     * 
     * @param conditionIsForConfiguration
     *     
     * @return
     *     Condition for Configuration
     */
    @SerializedName("ConditionIsForConfiguration")
    @JsonProperty("ConditionIsForConfiguration")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    private Boolean conditionIsForConfiguration;
    /**
     * Use with available fluent helpers to apply the <b>ConditionIsForConfiguration</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<Boolean> CONDITION_IS_FOR_CONFIGURATION = new SalesOrderItemPrElementField<Boolean>("ConditionIsForConfiguration");
    /**
     * Constraints: Not nullable, Maximum length: 26
     * 
     * @param variantCondition
     *     
     * @return
     *     Variant condition
     */
    @SerializedName("VariantCondition")
    @JsonProperty("VariantCondition")
    @Nullable
    private String variantCondition;
    /**
     * Use with available fluent helpers to apply the <b>VariantCondition</b> field to query operations.
     * 
     */
    public final static SalesOrderItemPrElementField<String> VARIANT_CONDITION = new SalesOrderItemPrElementField<String>("VariantCondition");
    /**
     * Convienence field for reusing the same ERP system context with multiple queries (e.g. fetching associated entities).
     * 
     * @param erpConfigContext
     *     
     * @return
     *     The stored ERP system context for executing queries, or null if no such context has been set.
     */
    @JsonIgnore
    @Nullable
    private transient ErpConfigContext erpConfigContext;
    /**
     * Navigation property <b>to_SalesOrder</b> for <b>SalesOrderItemPrElement</b> to single <b>SalesOrder</b>.
     * 
     */
    @SerializedName("to_SalesOrder")
    @JsonProperty("to_SalesOrder")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @Nullable
    private SalesOrder toSalesOrder;
    /**
     * Use with available fluent helpers to apply the <b>to_SalesOrder</b> navigation property to query operations.
     * 
     */
    public final static SalesOrderItemPrElementLink<SalesOrder> TO_SALES_ORDER = new SalesOrderItemPrElementLink<SalesOrder>("to_SalesOrder");
    /**
     * Navigation property <b>to_SalesOrderItem</b> for <b>SalesOrderItemPrElement</b> to single <b>SalesOrderItem</b>.
     * 
     */
    @SerializedName("to_SalesOrderItem")
    @JsonProperty("to_SalesOrderItem")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @Nullable
    private SalesOrderItem toSalesOrderItem;
    /**
     * Use with available fluent helpers to apply the <b>to_SalesOrderItem</b> navigation property to query operations.
     * 
     */
    public final static SalesOrderItemPrElementLink<SalesOrderItem> TO_SALES_ORDER_ITEM = new SalesOrderItemPrElementLink<SalesOrderItem>("to_SalesOrderItem");

    /**
     * {@inheritDoc}
     * 
     */
    @Override
    public Class<SalesOrderItemPrElement> getType() {
        return SalesOrderItemPrElement.class;
    }

    @Override
    protected String getEndpointUrl() {
        return "/sap/opu/odata/sap/API_SALES_ORDER_SRV";
    }

    @Override
    protected String getEntityCollection() {
        return "A_SalesOrderItemPrElement";
    }

    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("SalesOrder", getSalesOrder());
        result.put("SalesOrderItem", getSalesOrderItem());
        result.put("PricingProcedureStep", getPricingProcedureStep());
        result.put("PricingProcedureCounter", getPricingProcedureCounter());
        return result;
    }

    @Override
    protected Map<String, Object> toMap() {
        final Map<String, Object> values = super.toMap();
        values.put("SalesOrder", getSalesOrder());
        values.put("SalesOrderItem", getSalesOrderItem());
        values.put("PricingProcedureStep", getPricingProcedureStep());
        values.put("PricingProcedureCounter", getPricingProcedureCounter());
        values.put("ConditionType", getConditionType());
        values.put("PricingDateTime", getPricingDateTime());
        values.put("ConditionCalculationType", getConditionCalculationType());
        values.put("ConditionBaseValue", getConditionBaseValue());
        values.put("ConditionRateValue", getConditionRateValue());
        values.put("ConditionCurrency", getConditionCurrency());
        values.put("ConditionQuantity", getConditionQuantity());
        values.put("ConditionQuantityUnit", getConditionQuantityUnit());
        values.put("ConditionCategory", getConditionCategory());
        values.put("ConditionIsForStatistics", getConditionIsForStatistics());
        values.put("PricingScaleType", getPricingScaleType());
        values.put("IsRelevantForAccrual", getIsRelevantForAccrual());
        values.put("CndnIsRelevantForInvoiceList", getCndnIsRelevantForInvoiceList());
        values.put("ConditionOrigin", getConditionOrigin());
        values.put("IsGroupCondition", getIsGroupCondition());
        values.put("ConditionRecord", getConditionRecord());
        values.put("ConditionSequentialNumber", getConditionSequentialNumber());
        values.put("TaxCode", getTaxCode());
        values.put("WithholdingTaxCode", getWithholdingTaxCode());
        values.put("CndnRoundingOffDiffAmount", getCndnRoundingOffDiffAmount());
        values.put("ConditionAmount", getConditionAmount());
        values.put("TransactionCurrency", getTransactionCurrency());
        values.put("ConditionControl", getConditionControl());
        values.put("ConditionInactiveReason", getConditionInactiveReason());
        values.put("ConditionClass", getConditionClass());
        values.put("PrcgProcedureCounterForHeader", getPrcgProcedureCounterForHeader());
        values.put("FactorForConditionBasisValue", getFactorForConditionBasisValue());
        values.put("StructureCondition", getStructureCondition());
        values.put("PeriodFactorForCndnBasisValue", getPeriodFactorForCndnBasisValue());
        values.put("PricingScaleBasis", getPricingScaleBasis());
        values.put("ConditionScaleBasisValue", getConditionScaleBasisValue());
        values.put("ConditionScaleBasisUnit", getConditionScaleBasisUnit());
        values.put("ConditionScaleBasisCurrency", getConditionScaleBasisCurrency());
        values.put("CndnIsRelevantForIntcoBilling", getCndnIsRelevantForIntcoBilling());
        values.put("ConditionIsManuallyChanged", getConditionIsManuallyChanged());
        values.put("ConditionIsForConfiguration", getConditionIsForConfiguration());
        values.put("VariantCondition", getVariantCondition());
        // navigation properties
        if (toSalesOrder!= null) {
            (values).put("to_SalesOrder", toSalesOrder);
        }
        if (toSalesOrderItem!= null) {
            (values).put("to_SalesOrderItem", toSalesOrderItem);
        }
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("SalesOrder")) {
                final Object value = values.remove("SalesOrder");
                if ((value == null)||(!value.equals(getSalesOrder()))) {
                    setSalesOrder(((String) value));
                }
            }
            if (values.containsKey("SalesOrderItem")) {
                final Object value = values.remove("SalesOrderItem");
                if ((value == null)||(!value.equals(getSalesOrderItem()))) {
                    setSalesOrderItem(((String) value));
                }
            }
            if (values.containsKey("PricingProcedureStep")) {
                final Object value = values.remove("PricingProcedureStep");
                if ((value == null)||(!value.equals(getPricingProcedureStep()))) {
                    setPricingProcedureStep(((String) value));
                }
            }
            if (values.containsKey("PricingProcedureCounter")) {
                final Object value = values.remove("PricingProcedureCounter");
                if ((value == null)||(!value.equals(getPricingProcedureCounter()))) {
                    setPricingProcedureCounter(((String) value));
                }
            }
            if (values.containsKey("ConditionType")) {
                final Object value = values.remove("ConditionType");
                if ((value == null)||(!value.equals(getConditionType()))) {
                    setConditionType(((String) value));
                }
            }
            if (values.containsKey("PricingDateTime")) {
                final Object value = values.remove("PricingDateTime");
                if ((value == null)||(!value.equals(getPricingDateTime()))) {
                    setPricingDateTime(((String) value));
                }
            }
            if (values.containsKey("ConditionCalculationType")) {
                final Object value = values.remove("ConditionCalculationType");
                if ((value == null)||(!value.equals(getConditionCalculationType()))) {
                    setConditionCalculationType(((String) value));
                }
            }
            if (values.containsKey("ConditionBaseValue")) {
                final Object value = values.remove("ConditionBaseValue");
                if ((value == null)||(!value.equals(getConditionBaseValue()))) {
                    setConditionBaseValue(((BigDecimal) value));
                }
            }
            if (values.containsKey("ConditionRateValue")) {
                final Object value = values.remove("ConditionRateValue");
                if ((value == null)||(!value.equals(getConditionRateValue()))) {
                    setConditionRateValue(((BigDecimal) value));
                }
            }
            if (values.containsKey("ConditionCurrency")) {
                final Object value = values.remove("ConditionCurrency");
                if ((value == null)||(!value.equals(getConditionCurrency()))) {
                    setConditionCurrency(((String) value));
                }
            }
            if (values.containsKey("ConditionQuantity")) {
                final Object value = values.remove("ConditionQuantity");
                if ((value == null)||(!value.equals(getConditionQuantity()))) {
                    setConditionQuantity(((BigDecimal) value));
                }
            }
            if (values.containsKey("ConditionQuantityUnit")) {
                final Object value = values.remove("ConditionQuantityUnit");
                if ((value == null)||(!value.equals(getConditionQuantityUnit()))) {
                    setConditionQuantityUnit(((String) value));
                }
            }
            if (values.containsKey("ConditionCategory")) {
                final Object value = values.remove("ConditionCategory");
                if ((value == null)||(!value.equals(getConditionCategory()))) {
                    setConditionCategory(((String) value));
                }
            }
            if (values.containsKey("ConditionIsForStatistics")) {
                final Object value = values.remove("ConditionIsForStatistics");
                if ((value == null)||(!value.equals(getConditionIsForStatistics()))) {
                    setConditionIsForStatistics(((Boolean) value));
                }
            }
            if (values.containsKey("PricingScaleType")) {
                final Object value = values.remove("PricingScaleType");
                if ((value == null)||(!value.equals(getPricingScaleType()))) {
                    setPricingScaleType(((String) value));
                }
            }
            if (values.containsKey("IsRelevantForAccrual")) {
                final Object value = values.remove("IsRelevantForAccrual");
                if ((value == null)||(!value.equals(getIsRelevantForAccrual()))) {
                    setIsRelevantForAccrual(((Boolean) value));
                }
            }
            if (values.containsKey("CndnIsRelevantForInvoiceList")) {
                final Object value = values.remove("CndnIsRelevantForInvoiceList");
                if ((value == null)||(!value.equals(getCndnIsRelevantForInvoiceList()))) {
                    setCndnIsRelevantForInvoiceList(((String) value));
                }
            }
            if (values.containsKey("ConditionOrigin")) {
                final Object value = values.remove("ConditionOrigin");
                if ((value == null)||(!value.equals(getConditionOrigin()))) {
                    setConditionOrigin(((String) value));
                }
            }
            if (values.containsKey("IsGroupCondition")) {
                final Object value = values.remove("IsGroupCondition");
                if ((value == null)||(!value.equals(getIsGroupCondition()))) {
                    setIsGroupCondition(((String) value));
                }
            }
            if (values.containsKey("ConditionRecord")) {
                final Object value = values.remove("ConditionRecord");
                if ((value == null)||(!value.equals(getConditionRecord()))) {
                    setConditionRecord(((String) value));
                }
            }
            if (values.containsKey("ConditionSequentialNumber")) {
                final Object value = values.remove("ConditionSequentialNumber");
                if ((value == null)||(!value.equals(getConditionSequentialNumber()))) {
                    setConditionSequentialNumber(((String) value));
                }
            }
            if (values.containsKey("TaxCode")) {
                final Object value = values.remove("TaxCode");
                if ((value == null)||(!value.equals(getTaxCode()))) {
                    setTaxCode(((String) value));
                }
            }
            if (values.containsKey("WithholdingTaxCode")) {
                final Object value = values.remove("WithholdingTaxCode");
                if ((value == null)||(!value.equals(getWithholdingTaxCode()))) {
                    setWithholdingTaxCode(((String) value));
                }
            }
            if (values.containsKey("CndnRoundingOffDiffAmount")) {
                final Object value = values.remove("CndnRoundingOffDiffAmount");
                if ((value == null)||(!value.equals(getCndnRoundingOffDiffAmount()))) {
                    setCndnRoundingOffDiffAmount(((BigDecimal) value));
                }
            }
            if (values.containsKey("ConditionAmount")) {
                final Object value = values.remove("ConditionAmount");
                if ((value == null)||(!value.equals(getConditionAmount()))) {
                    setConditionAmount(((BigDecimal) value));
                }
            }
            if (values.containsKey("TransactionCurrency")) {
                final Object value = values.remove("TransactionCurrency");
                if ((value == null)||(!value.equals(getTransactionCurrency()))) {
                    setTransactionCurrency(((String) value));
                }
            }
            if (values.containsKey("ConditionControl")) {
                final Object value = values.remove("ConditionControl");
                if ((value == null)||(!value.equals(getConditionControl()))) {
                    setConditionControl(((String) value));
                }
            }
            if (values.containsKey("ConditionInactiveReason")) {
                final Object value = values.remove("ConditionInactiveReason");
                if ((value == null)||(!value.equals(getConditionInactiveReason()))) {
                    setConditionInactiveReason(((String) value));
                }
            }
            if (values.containsKey("ConditionClass")) {
                final Object value = values.remove("ConditionClass");
                if ((value == null)||(!value.equals(getConditionClass()))) {
                    setConditionClass(((String) value));
                }
            }
            if (values.containsKey("PrcgProcedureCounterForHeader")) {
                final Object value = values.remove("PrcgProcedureCounterForHeader");
                if ((value == null)||(!value.equals(getPrcgProcedureCounterForHeader()))) {
                    setPrcgProcedureCounterForHeader(((String) value));
                }
            }
            if (values.containsKey("FactorForConditionBasisValue")) {
                final Object value = values.remove("FactorForConditionBasisValue");
                if ((value == null)||(!value.equals(getFactorForConditionBasisValue()))) {
                    setFactorForConditionBasisValue(((Double) value));
                }
            }
            if (values.containsKey("StructureCondition")) {
                final Object value = values.remove("StructureCondition");
                if ((value == null)||(!value.equals(getStructureCondition()))) {
                    setStructureCondition(((String) value));
                }
            }
            if (values.containsKey("PeriodFactorForCndnBasisValue")) {
                final Object value = values.remove("PeriodFactorForCndnBasisValue");
                if ((value == null)||(!value.equals(getPeriodFactorForCndnBasisValue()))) {
                    setPeriodFactorForCndnBasisValue(((Double) value));
                }
            }
            if (values.containsKey("PricingScaleBasis")) {
                final Object value = values.remove("PricingScaleBasis");
                if ((value == null)||(!value.equals(getPricingScaleBasis()))) {
                    setPricingScaleBasis(((String) value));
                }
            }
            if (values.containsKey("ConditionScaleBasisValue")) {
                final Object value = values.remove("ConditionScaleBasisValue");
                if ((value == null)||(!value.equals(getConditionScaleBasisValue()))) {
                    setConditionScaleBasisValue(((BigDecimal) value));
                }
            }
            if (values.containsKey("ConditionScaleBasisUnit")) {
                final Object value = values.remove("ConditionScaleBasisUnit");
                if ((value == null)||(!value.equals(getConditionScaleBasisUnit()))) {
                    setConditionScaleBasisUnit(((String) value));
                }
            }
            if (values.containsKey("ConditionScaleBasisCurrency")) {
                final Object value = values.remove("ConditionScaleBasisCurrency");
                if ((value == null)||(!value.equals(getConditionScaleBasisCurrency()))) {
                    setConditionScaleBasisCurrency(((String) value));
                }
            }
            if (values.containsKey("CndnIsRelevantForIntcoBilling")) {
                final Object value = values.remove("CndnIsRelevantForIntcoBilling");
                if ((value == null)||(!value.equals(getCndnIsRelevantForIntcoBilling()))) {
                    setCndnIsRelevantForIntcoBilling(((Boolean) value));
                }
            }
            if (values.containsKey("ConditionIsManuallyChanged")) {
                final Object value = values.remove("ConditionIsManuallyChanged");
                if ((value == null)||(!value.equals(getConditionIsManuallyChanged()))) {
                    setConditionIsManuallyChanged(((Boolean) value));
                }
            }
            if (values.containsKey("ConditionIsForConfiguration")) {
                final Object value = values.remove("ConditionIsForConfiguration");
                if ((value == null)||(!value.equals(getConditionIsForConfiguration()))) {
                    setConditionIsForConfiguration(((Boolean) value));
                }
            }
            if (values.containsKey("VariantCondition")) {
                final Object value = values.remove("VariantCondition");
                if ((value == null)||(!value.equals(getVariantCondition()))) {
                    setVariantCondition(((String) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
            if ((values).containsKey("to_SalesOrder")) {
                final Object value = (values).remove("to_SalesOrder");
                if (value instanceof Map) {
                    if (toSalesOrder == null) {
                        toSalesOrder = new SalesOrder();
                    }
                    @SuppressWarnings("unchecked")
                    final Map<String, Object> inputMap = ((Map<String, Object> ) value);
                    toSalesOrder.fromMap(inputMap);
                }
            }
            if ((values).containsKey("to_SalesOrderItem")) {
                final Object value = (values).remove("to_SalesOrderItem");
                if (value instanceof Map) {
                    if (toSalesOrderItem == null) {
                        toSalesOrderItem = new SalesOrderItem();
                    }
                    @SuppressWarnings("unchecked")
                    final Map<String, Object> inputMap = ((Map<String, Object> ) value);
                    toSalesOrderItem.fromMap(inputMap);
                }
            }
        }
        super.fromMap(values);
    }

    /**
     * Use with available fluent helpers to apply an extension field to query operations.
     * 
     * @param fieldName
     *     The name of the extension field as returned by the OData service.
     * @param fieldType
     *     The Java type to use for the extension field when performing value comparisons.
     * @return
     *     A representation of an extension field from this entity.
     */
    public static<T >SalesOrderItemPrElementField<T> field(final String fieldName, final Class<T> fieldType) {
        return new SalesOrderItemPrElementField<T>(fieldName);
    }

    /**
     * Fetches the <b>SalesOrder</b> entity (one to one) associated with this entity. This corresponds to the OData navigation property <b>to_SalesOrder</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     The single associated <b>SalesOrder</b> entity, or null if an entity is not associated. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public SalesOrder fetchSalesOrder()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type SalesOrder.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("SalesOrder=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(salesOrder));
        odataResourceUrl.append(",SalesOrderItem=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(salesOrderItem));
        odataResourceUrl.append(",PricingProcedureStep=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(pricingProcedureStep));
        odataResourceUrl.append(",PricingProcedureCounter=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(pricingProcedureCounter));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_SalesOrder");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getEndpointUrl(), odataResourceUrl.toString());
        final ODataQuery query = builder.build();
        final ErpEndpoint erpEndpoint = new ErpEndpoint(erpConfigContext);
        final ODataQueryResult result = query.execute(erpEndpoint);
        final SalesOrder entity = result.as(SalesOrder.class);
        entity.setErpConfigContext(erpConfigContext);
        return entity;
    }

    /**
     * Retrieval of associated <b>SalesOrder</b> entity (one to one).
     * <p>
     * If the navigation property <b>to_SalesOrder</b> of a queried <b>SalesOrderItemPrElement</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>SalesOrder</b> entity.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public SalesOrder getSalesOrderOrFetch()
        throws ODataException
    {
        if (toSalesOrder == null) {
            toSalesOrder = fetchSalesOrder();
        }
        return toSalesOrder;
    }

    /**
     * Retrieval of associated <b>SalesOrder</b> entity (one to one).
     * <p>
     * If the navigation property <b>to_SalesOrder</b> for an entity <b>SalesOrderItemPrElement</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <b>Optional</b> result state will be <i>null</i>.
     * 
     * @return
     *     If the information for navigation property <b>to_SalesOrder</b> is already loaded, the result will contain the <b>SalesOrder</b> entity. If not, a <i>null</i> value state is returned.
     */
    public Optional<SalesOrder> getSalesOrderOrNull() {
        return Optional.fromNullable(toSalesOrder);
    }

    /**
     * Overwrites the associated <b>SalesOrder</b> entity for the loaded navigation property <b>to_SalesOrder</b>.
     * 
     * @param value
     *     New <b>SalesOrder</b> entity.
     */
    public void setSalesOrder(final SalesOrder value) {
        toSalesOrder = value;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10
     * 
     * @param value
     *     salesOrder
     */
    public void setSalesOrder(final String value) {
        salesOrder = value;
    }

    /**
     * Fetches the <b>SalesOrderItem</b> entity (one to one) associated with this entity. This corresponds to the OData navigation property <b>to_SalesOrderItem</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     The single associated <b>SalesOrderItem</b> entity, or null if an entity is not associated. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public SalesOrderItem fetchSalesOrderItem()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type SalesOrderItem.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("SalesOrder=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(salesOrder));
        odataResourceUrl.append(",SalesOrderItem=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(salesOrderItem));
        odataResourceUrl.append(",PricingProcedureStep=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(pricingProcedureStep));
        odataResourceUrl.append(",PricingProcedureCounter=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(pricingProcedureCounter));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_SalesOrderItem");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getEndpointUrl(), odataResourceUrl.toString());
        final ODataQuery query = builder.build();
        final ErpEndpoint erpEndpoint = new ErpEndpoint(erpConfigContext);
        final ODataQueryResult result = query.execute(erpEndpoint);
        final SalesOrderItem entity = result.as(SalesOrderItem.class);
        entity.setErpConfigContext(erpConfigContext);
        return entity;
    }

    /**
     * Retrieval of associated <b>SalesOrderItem</b> entity (one to one).
     * <p>
     * If the navigation property <b>to_SalesOrderItem</b> of a queried <b>SalesOrderItemPrElement</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>SalesOrderItem</b> entity.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public SalesOrderItem getSalesOrderItemOrFetch()
        throws ODataException
    {
        if (toSalesOrderItem == null) {
            toSalesOrderItem = fetchSalesOrderItem();
        }
        return toSalesOrderItem;
    }

    /**
     * Retrieval of associated <b>SalesOrderItem</b> entity (one to one).
     * <p>
     * If the navigation property <b>to_SalesOrderItem</b> for an entity <b>SalesOrderItemPrElement</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <b>Optional</b> result state will be <i>null</i>.
     * 
     * @return
     *     If the information for navigation property <b>to_SalesOrderItem</b> is already loaded, the result will contain the <b>SalesOrderItem</b> entity. If not, a <i>null</i> value state is returned.
     */
    public Optional<SalesOrderItem> getSalesOrderItemOrNull() {
        return Optional.fromNullable(toSalesOrderItem);
    }

    /**
     * Overwrites the associated <b>SalesOrderItem</b> entity for the loaded navigation property <b>to_SalesOrderItem</b>.
     * 
     * @param value
     *     New <b>SalesOrderItem</b> entity.
     */
    public void setSalesOrderItem(final SalesOrderItem value) {
        toSalesOrderItem = value;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 6
     * 
     * @param value
     *     salesOrderItem
     */
    public void setSalesOrderItem(final String value) {
        salesOrderItem = value;
    }

    public final static class SalesOrderItemPrElementBuilder {

        private SalesOrder toSalesOrder;
        private String salesOrder = null;
        private SalesOrderItem toSalesOrderItem;
        private String salesOrderItem = null;

        private SalesOrderItemPrElement.SalesOrderItemPrElementBuilder toSalesOrder(SalesOrder value) {
            toSalesOrder = value;
            return this;
        }

        /**
         * Navigation property <b>to_SalesOrder</b> for <b>SalesOrderItemPrElement</b> to single <b>SalesOrder</b>.
         * 
         */
        public SalesOrderItemPrElement.SalesOrderItemPrElementBuilder salesOrder(final SalesOrder value) {
            return toSalesOrder(value);
        }

        /**
         * (Key Field) Constraints: Not nullable, Maximum length: 10
         * 
         */
        public SalesOrderItemPrElement.SalesOrderItemPrElementBuilder salesOrder(final String value) {
            salesOrder = value;
            return this;
        }

        private SalesOrderItemPrElement.SalesOrderItemPrElementBuilder toSalesOrderItem(SalesOrderItem value) {
            toSalesOrderItem = value;
            return this;
        }

        /**
         * Navigation property <b>to_SalesOrderItem</b> for <b>SalesOrderItemPrElement</b> to single <b>SalesOrderItem</b>.
         * 
         */
        public SalesOrderItemPrElement.SalesOrderItemPrElementBuilder salesOrderItem(final SalesOrderItem value) {
            return toSalesOrderItem(value);
        }

        /**
         * (Key Field) Constraints: Not nullable, Maximum length: 6
         * 
         */
        public SalesOrderItemPrElement.SalesOrderItemPrElementBuilder salesOrderItem(final String value) {
            salesOrderItem = value;
            return this;
        }

    }

}
