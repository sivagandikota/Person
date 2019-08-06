
package com.sap.brewster.namespaces.salesordercreatereadupdatedelete;

import java.math.BigDecimal;
import java.util.Calendar;
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
 * Sales Order Payment Plan Item Details API<p></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class SlsOrdPaymentPlanItemDetails
    extends VdmEntity<SlsOrdPaymentPlanItemDetails>
{

    /**
     * Selector for all available fields of SlsOrdPaymentPlanItemDetails.
     * 
     */
    public final static SlsOrdPaymentPlanItemDetailsSelectable ALL_FIELDS = new SlsOrdPaymentPlanItemDetailsSelectable() {


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
    public final static SlsOrdPaymentPlanItemDetailsField<String> SALES_ORDER = new SlsOrdPaymentPlanItemDetailsField<String>("SalesOrder");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 6
     * 
     * @param paymentPlanItem
     *     
     * @return
     *     Item for billing plan/invoice plan/payment cards
     */
    @SerializedName("PaymentPlanItem")
    @JsonProperty("PaymentPlanItem")
    @Nullable
    private String paymentPlanItem;
    /**
     * Use with available fluent helpers to apply the <b>PaymentPlanItem</b> field to query operations.
     * 
     */
    public final static SlsOrdPaymentPlanItemDetailsField<String> PAYMENT_PLAN_ITEM = new SlsOrdPaymentPlanItemDetailsField<String>("PaymentPlanItem");
    /**
     * Constraints: Not nullable, Maximum length: 10
     * 
     * @param paymentPlan
     *     
     * @return
     *     Billing Plan Number / Invoicing Plan Number
     */
    @SerializedName("PaymentPlan")
    @JsonProperty("PaymentPlan")
    @Nullable
    private String paymentPlan;
    /**
     * Use with available fluent helpers to apply the <b>PaymentPlan</b> field to query operations.
     * 
     */
    public final static SlsOrdPaymentPlanItemDetailsField<String> PAYMENT_PLAN = new SlsOrdPaymentPlanItemDetailsField<String>("PaymentPlan");
    /**
     * Constraints: Not nullable, Maximum length: 4
     * 
     * @param electronicPaymentType
     *     
     * @return
     *     Electronic Payment: Payment Type
     */
    @SerializedName("ElectronicPaymentType")
    @JsonProperty("ElectronicPaymentType")
    @Nullable
    private String electronicPaymentType;
    /**
     * Use with available fluent helpers to apply the <b>ElectronicPaymentType</b> field to query operations.
     * 
     */
    public final static SlsOrdPaymentPlanItemDetailsField<String> ELECTRONIC_PAYMENT_TYPE = new SlsOrdPaymentPlanItemDetailsField<String>("ElectronicPaymentType");
    /**
     * Constraints: Not nullable, Maximum length: 25
     * 
     * @param electronicPayment
     *     
     * @return
     *     Electronic Payment: Account Number
     */
    @SerializedName("ElectronicPayment")
    @JsonProperty("ElectronicPayment")
    @Nullable
    private String electronicPayment;
    /**
     * Use with available fluent helpers to apply the <b>ElectronicPayment</b> field to query operations.
     * 
     */
    public final static SlsOrdPaymentPlanItemDetailsField<String> ELECTRONIC_PAYMENT = new SlsOrdPaymentPlanItemDetailsField<String>("ElectronicPayment");
    /**
     * Constraints: Not nullable, Precision: 0
     * 
     * @param ePaytValidityStartDate
     *     
     * @return
     *     Electronic Payment: Valid from
     */
    @SerializedName("EPaytValidityStartDate")
    @JsonProperty("EPaytValidityStartDate")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataDateTimeAdapter.class)
    private Calendar ePaytValidityStartDate;
    /**
     * Use with available fluent helpers to apply the <b>EPaytValidityStartDate</b> field to query operations.
     * 
     */
    public final static SlsOrdPaymentPlanItemDetailsField<Calendar> E_PAYT_VALIDITY_START_DATE = new SlsOrdPaymentPlanItemDetailsField<Calendar>("EPaytValidityStartDate");
    /**
     * Constraints: Not nullable, Precision: 0
     * 
     * @param ePaytValidityEndDate
     *     
     * @return
     *     Electronic Payment: Valid to
     */
    @SerializedName("EPaytValidityEndDate")
    @JsonProperty("EPaytValidityEndDate")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataDateTimeAdapter.class)
    private Calendar ePaytValidityEndDate;
    /**
     * Use with available fluent helpers to apply the <b>EPaytValidityEndDate</b> field to query operations.
     * 
     */
    public final static SlsOrdPaymentPlanItemDetailsField<Calendar> E_PAYT_VALIDITY_END_DATE = new SlsOrdPaymentPlanItemDetailsField<Calendar>("EPaytValidityEndDate");
    /**
     * Constraints: Not nullable, Maximum length: 40
     * 
     * @param electronicPaymentHolderName
     *     
     * @return
     *     Electronic Payment: Name of Account Holder
     */
    @SerializedName("ElectronicPaymentHolderName")
    @JsonProperty("ElectronicPaymentHolderName")
    @Nullable
    private String electronicPaymentHolderName;
    /**
     * Use with available fluent helpers to apply the <b>ElectronicPaymentHolderName</b> field to query operations.
     * 
     */
    public final static SlsOrdPaymentPlanItemDetailsField<String> ELECTRONIC_PAYMENT_HOLDER_NAME = new SlsOrdPaymentPlanItemDetailsField<String>("ElectronicPaymentHolderName");
    /**
     * Constraints: Not nullable, Precision: 16, Scale: 3
     * 
     * @param authorizedAmountInAuthznCrcy
     *     
     * @return
     *     Electronic Payment: Authorized Amount
     */
    @SerializedName("AuthorizedAmountInAuthznCrcy")
    @JsonProperty("AuthorizedAmountInAuthznCrcy")
    @Nullable
    private BigDecimal authorizedAmountInAuthznCrcy;
    /**
     * Use with available fluent helpers to apply the <b>AuthorizedAmountInAuthznCrcy</b> field to query operations.
     * 
     */
    public final static SlsOrdPaymentPlanItemDetailsField<BigDecimal> AUTHORIZED_AMOUNT_IN_AUTHZN_CRCY = new SlsOrdPaymentPlanItemDetailsField<BigDecimal>("AuthorizedAmountInAuthznCrcy");
    /**
     * Constraints: Not nullable, Maximum length: 5
     * 
     * @param authorizationCurrency
     *     
     * @return
     *     Currency Key
     */
    @SerializedName("AuthorizationCurrency")
    @JsonProperty("AuthorizationCurrency")
    @Nullable
    private String authorizationCurrency;
    /**
     * Use with available fluent helpers to apply the <b>AuthorizationCurrency</b> field to query operations.
     * 
     */
    public final static SlsOrdPaymentPlanItemDetailsField<String> AUTHORIZATION_CURRENCY = new SlsOrdPaymentPlanItemDetailsField<String>("AuthorizationCurrency");
    /**
     * Constraints: Not nullable, Maximum length: 10
     * 
     * @param authorizationByDigitalPaytSrvc
     *     
     * @return
     *     Electronic Payment: Authorization Number
     */
    @SerializedName("AuthorizationByDigitalPaytSrvc")
    @JsonProperty("AuthorizationByDigitalPaytSrvc")
    @Nullable
    private String authorizationByDigitalPaytSrvc;
    /**
     * Use with available fluent helpers to apply the <b>AuthorizationByDigitalPaytSrvc</b> field to query operations.
     * 
     */
    public final static SlsOrdPaymentPlanItemDetailsField<String> AUTHORIZATION_BY_DIGITAL_PAYT_SRVC = new SlsOrdPaymentPlanItemDetailsField<String>("AuthorizationByDigitalPaytSrvc");
    /**
     * Constraints: Not nullable, Maximum length: 15
     * 
     * @param authorizationByAcquirer
     *     
     * @return
     *     Electronic Payment: Authorization Reference Code
     */
    @SerializedName("AuthorizationByAcquirer")
    @JsonProperty("AuthorizationByAcquirer")
    @Nullable
    private String authorizationByAcquirer;
    /**
     * Use with available fluent helpers to apply the <b>AuthorizationByAcquirer</b> field to query operations.
     * 
     */
    public final static SlsOrdPaymentPlanItemDetailsField<String> AUTHORIZATION_BY_ACQUIRER = new SlsOrdPaymentPlanItemDetailsField<String>("AuthorizationByAcquirer");
    /**
     * Constraints: Not nullable, Precision: 0
     * 
     * @param authorizationDate
     *     
     * @return
     *     Electronic Payment: Authorization Date
     */
    @SerializedName("AuthorizationDate")
    @JsonProperty("AuthorizationDate")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataDateTimeAdapter.class)
    private Calendar authorizationDate;
    /**
     * Use with available fluent helpers to apply the <b>AuthorizationDate</b> field to query operations.
     * 
     */
    public final static SlsOrdPaymentPlanItemDetailsField<Calendar> AUTHORIZATION_DATE = new SlsOrdPaymentPlanItemDetailsField<Calendar>("AuthorizationDate");
    /**
     * Constraints: Not nullable, Precision: 0
     * 
     * @param authorizationTime
     *     
     * @return
     *     Electronic Payment: Authorization Time
     */
    @SerializedName("AuthorizationTime")
    @JsonProperty("AuthorizationTime")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataTimeAdapter.class)
    private Calendar authorizationTime;
    /**
     * Use with available fluent helpers to apply the <b>AuthorizationTime</b> field to query operations.
     * 
     */
    public final static SlsOrdPaymentPlanItemDetailsField<Calendar> AUTHORIZATION_TIME = new SlsOrdPaymentPlanItemDetailsField<Calendar>("AuthorizationTime");
    /**
     * Constraints: Not nullable, Maximum length: 25
     * 
     * @param ePaytByDigitalPaymentSrvc
     *     
     * @return
     *     Token for Digital Payment Integration in SD
     */
    @SerializedName("EPaytByDigitalPaymentSrvc")
    @JsonProperty("EPaytByDigitalPaymentSrvc")
    @Nullable
    private String ePaytByDigitalPaymentSrvc;
    /**
     * Use with available fluent helpers to apply the <b>EPaytByDigitalPaymentSrvc</b> field to query operations.
     * 
     */
    public final static SlsOrdPaymentPlanItemDetailsField<String> E_PAYT_BY_DIGITAL_PAYMENT_SRVC = new SlsOrdPaymentPlanItemDetailsField<String>("EPaytByDigitalPaymentSrvc");
    /**
     * Constraints: Not nullable, Maximum length: 1
     * 
     * @param electronicPaymentCallStatus
     *     
     * @return
     *     Electronic Payment: Call Status
     */
    @SerializedName("ElectronicPaymentCallStatus")
    @JsonProperty("ElectronicPaymentCallStatus")
    @Nullable
    private String electronicPaymentCallStatus;
    /**
     * Use with available fluent helpers to apply the <b>ElectronicPaymentCallStatus</b> field to query operations.
     * 
     */
    public final static SlsOrdPaymentPlanItemDetailsField<String> ELECTRONIC_PAYMENT_CALL_STATUS = new SlsOrdPaymentPlanItemDetailsField<String>("ElectronicPaymentCallStatus");
    /**
     * Constraints: Not nullable, Maximum length: 1
     * 
     * @param ePaytAuthorizationResult
     *     
     * @return
     *     Electronic Payment: Response to Authorization Checks
     */
    @SerializedName("EPaytAuthorizationResult")
    @JsonProperty("EPaytAuthorizationResult")
    @Nullable
    private String ePaytAuthorizationResult;
    /**
     * Use with available fluent helpers to apply the <b>EPaytAuthorizationResult</b> field to query operations.
     * 
     */
    public final static SlsOrdPaymentPlanItemDetailsField<String> E_PAYT_AUTHORIZATION_RESULT = new SlsOrdPaymentPlanItemDetailsField<String>("EPaytAuthorizationResult");
    /**
     * Constraints: Not nullable, Precision: 16, Scale: 3
     * 
     * @param ePaytToBeAuthorizedAmount
     *     
     * @return
     *     Electronic Payment: Amount to Be Authorized
     */
    @SerializedName("EPaytToBeAuthorizedAmount")
    @JsonProperty("EPaytToBeAuthorizedAmount")
    @Nullable
    private BigDecimal ePaytToBeAuthorizedAmount;
    /**
     * Use with available fluent helpers to apply the <b>EPaytToBeAuthorizedAmount</b> field to query operations.
     * 
     */
    public final static SlsOrdPaymentPlanItemDetailsField<BigDecimal> E_PAYT_TO_BE_AUTHORIZED_AMOUNT = new SlsOrdPaymentPlanItemDetailsField<BigDecimal>("EPaytToBeAuthorizedAmount");
    /**
     * Constraints: none
     * 
     * @param ePaytAuthorizationIsExpired
     *     
     * @return
     *     Electronic Payment: Authorization Expired
     */
    @SerializedName("EPaytAuthorizationIsExpired")
    @JsonProperty("EPaytAuthorizationIsExpired")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    private Boolean ePaytAuthorizationIsExpired;
    /**
     * Use with available fluent helpers to apply the <b>EPaytAuthorizationIsExpired</b> field to query operations.
     * 
     */
    public final static SlsOrdPaymentPlanItemDetailsField<Boolean> E_PAYT_AUTHORIZATION_IS_EXPIRED = new SlsOrdPaymentPlanItemDetailsField<Boolean>("EPaytAuthorizationIsExpired");
    /**
     * Constraints: none
     * 
     * @param ePaytAmountIsChanged
     *     
     * @return
     *     Electronic Payment: Amount Changed
     */
    @SerializedName("EPaytAmountIsChanged")
    @JsonProperty("EPaytAmountIsChanged")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    private Boolean ePaytAmountIsChanged;
    /**
     * Use with available fluent helpers to apply the <b>EPaytAmountIsChanged</b> field to query operations.
     * 
     */
    public final static SlsOrdPaymentPlanItemDetailsField<Boolean> E_PAYT_AMOUNT_IS_CHANGED = new SlsOrdPaymentPlanItemDetailsField<Boolean>("EPaytAmountIsChanged");
    /**
     * Constraints: none
     * 
     * @param preauthorizationIsRequested
     *     
     * @return
     *     Electronic Payment: Preauthorization
     */
    @SerializedName("PreauthorizationIsRequested")
    @JsonProperty("PreauthorizationIsRequested")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    private Boolean preauthorizationIsRequested;
    /**
     * Use with available fluent helpers to apply the <b>PreauthorizationIsRequested</b> field to query operations.
     * 
     */
    public final static SlsOrdPaymentPlanItemDetailsField<Boolean> PREAUTHORIZATION_IS_REQUESTED = new SlsOrdPaymentPlanItemDetailsField<Boolean>("PreauthorizationIsRequested");
    /**
     * Constraints: Not nullable, Precision: 16, Scale: 3
     * 
     * @param maximumToBeAuthorizedAmount
     *     
     * @return
     *     Value to be billed/calc. on date in billing/invoice plan
     */
    @SerializedName("MaximumToBeAuthorizedAmount")
    @JsonProperty("MaximumToBeAuthorizedAmount")
    @Nullable
    private BigDecimal maximumToBeAuthorizedAmount;
    /**
     * Use with available fluent helpers to apply the <b>MaximumToBeAuthorizedAmount</b> field to query operations.
     * 
     */
    public final static SlsOrdPaymentPlanItemDetailsField<BigDecimal> MAXIMUM_TO_BE_AUTHORIZED_AMOUNT = new SlsOrdPaymentPlanItemDetailsField<BigDecimal>("MaximumToBeAuthorizedAmount");
    /**
     * Constraints: Not nullable, Maximum length: 10
     * 
     * @param paytPlnForAuthorizationItem
     *     
     * @return
     *     Higher-level payment card plan number for billing
     */
    @SerializedName("PaytPlnForAuthorizationItem")
    @JsonProperty("PaytPlnForAuthorizationItem")
    @Nullable
    private String paytPlnForAuthorizationItem;
    /**
     * Use with available fluent helpers to apply the <b>PaytPlnForAuthorizationItem</b> field to query operations.
     * 
     */
    public final static SlsOrdPaymentPlanItemDetailsField<String> PAYT_PLN_FOR_AUTHORIZATION_ITEM = new SlsOrdPaymentPlanItemDetailsField<String>("PaytPlnForAuthorizationItem");
    /**
     * Constraints: Not nullable, Maximum length: 6
     * 
     * @param paytPlnItmForAuthorizationItem
     *     
     * @return
     *     Higher-level item in billing plan
     */
    @SerializedName("PaytPlnItmForAuthorizationItem")
    @JsonProperty("PaytPlnItmForAuthorizationItem")
    @Nullable
    private String paytPlnItmForAuthorizationItem;
    /**
     * Use with available fluent helpers to apply the <b>PaytPlnItmForAuthorizationItem</b> field to query operations.
     * 
     */
    public final static SlsOrdPaymentPlanItemDetailsField<String> PAYT_PLN_ITM_FOR_AUTHORIZATION_ITEM = new SlsOrdPaymentPlanItemDetailsField<String>("PaytPlnItmForAuthorizationItem");
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
     * Navigation property <b>to_SalesOrder</b> for <b>SlsOrdPaymentPlanItemDetails</b> to single <b>SalesOrder</b>.
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
    public final static SlsOrdPaymentPlanItemDetailsLink<SalesOrder> TO_SALES_ORDER = new SlsOrdPaymentPlanItemDetailsLink<SalesOrder>("to_SalesOrder");

    /**
     * {@inheritDoc}
     * 
     */
    @Override
    public Class<SlsOrdPaymentPlanItemDetails> getType() {
        return SlsOrdPaymentPlanItemDetails.class;
    }

    @Override
    protected String getEndpointUrl() {
        return "/sap/opu/odata/sap/API_SALES_ORDER_SRV";
    }

    @Override
    protected String getEntityCollection() {
        return "A_SlsOrdPaymentPlanItemDetails";
    }

    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("SalesOrder", getSalesOrder());
        result.put("PaymentPlanItem", getPaymentPlanItem());
        return result;
    }

    @Override
    protected Map<String, Object> toMap() {
        final Map<String, Object> values = super.toMap();
        values.put("SalesOrder", getSalesOrder());
        values.put("PaymentPlanItem", getPaymentPlanItem());
        values.put("PaymentPlan", getPaymentPlan());
        values.put("ElectronicPaymentType", getElectronicPaymentType());
        values.put("ElectronicPayment", getElectronicPayment());
        values.put("EPaytValidityStartDate", getEPaytValidityStartDate());
        values.put("EPaytValidityEndDate", getEPaytValidityEndDate());
        values.put("ElectronicPaymentHolderName", getElectronicPaymentHolderName());
        values.put("AuthorizedAmountInAuthznCrcy", getAuthorizedAmountInAuthznCrcy());
        values.put("AuthorizationCurrency", getAuthorizationCurrency());
        values.put("AuthorizationByDigitalPaytSrvc", getAuthorizationByDigitalPaytSrvc());
        values.put("AuthorizationByAcquirer", getAuthorizationByAcquirer());
        values.put("AuthorizationDate", getAuthorizationDate());
        values.put("AuthorizationTime", getAuthorizationTime());
        values.put("EPaytByDigitalPaymentSrvc", getEPaytByDigitalPaymentSrvc());
        values.put("ElectronicPaymentCallStatus", getElectronicPaymentCallStatus());
        values.put("EPaytAuthorizationResult", getEPaytAuthorizationResult());
        values.put("EPaytToBeAuthorizedAmount", getEPaytToBeAuthorizedAmount());
        values.put("EPaytAuthorizationIsExpired", getEPaytAuthorizationIsExpired());
        values.put("EPaytAmountIsChanged", getEPaytAmountIsChanged());
        values.put("PreauthorizationIsRequested", getPreauthorizationIsRequested());
        values.put("MaximumToBeAuthorizedAmount", getMaximumToBeAuthorizedAmount());
        values.put("PaytPlnForAuthorizationItem", getPaytPlnForAuthorizationItem());
        values.put("PaytPlnItmForAuthorizationItem", getPaytPlnItmForAuthorizationItem());
        // navigation properties
        if (toSalesOrder!= null) {
            (values).put("to_SalesOrder", toSalesOrder);
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
            if (values.containsKey("PaymentPlanItem")) {
                final Object value = values.remove("PaymentPlanItem");
                if ((value == null)||(!value.equals(getPaymentPlanItem()))) {
                    setPaymentPlanItem(((String) value));
                }
            }
            if (values.containsKey("PaymentPlan")) {
                final Object value = values.remove("PaymentPlan");
                if ((value == null)||(!value.equals(getPaymentPlan()))) {
                    setPaymentPlan(((String) value));
                }
            }
            if (values.containsKey("ElectronicPaymentType")) {
                final Object value = values.remove("ElectronicPaymentType");
                if ((value == null)||(!value.equals(getElectronicPaymentType()))) {
                    setElectronicPaymentType(((String) value));
                }
            }
            if (values.containsKey("ElectronicPayment")) {
                final Object value = values.remove("ElectronicPayment");
                if ((value == null)||(!value.equals(getElectronicPayment()))) {
                    setElectronicPayment(((String) value));
                }
            }
            if (values.containsKey("EPaytValidityStartDate")) {
                final Object value = values.remove("EPaytValidityStartDate");
                if ((value == null)||(!value.equals(getEPaytValidityStartDate()))) {
                    setEPaytValidityStartDate(((Calendar) value));
                }
            }
            if (values.containsKey("EPaytValidityEndDate")) {
                final Object value = values.remove("EPaytValidityEndDate");
                if ((value == null)||(!value.equals(getEPaytValidityEndDate()))) {
                    setEPaytValidityEndDate(((Calendar) value));
                }
            }
            if (values.containsKey("ElectronicPaymentHolderName")) {
                final Object value = values.remove("ElectronicPaymentHolderName");
                if ((value == null)||(!value.equals(getElectronicPaymentHolderName()))) {
                    setElectronicPaymentHolderName(((String) value));
                }
            }
            if (values.containsKey("AuthorizedAmountInAuthznCrcy")) {
                final Object value = values.remove("AuthorizedAmountInAuthznCrcy");
                if ((value == null)||(!value.equals(getAuthorizedAmountInAuthznCrcy()))) {
                    setAuthorizedAmountInAuthznCrcy(((BigDecimal) value));
                }
            }
            if (values.containsKey("AuthorizationCurrency")) {
                final Object value = values.remove("AuthorizationCurrency");
                if ((value == null)||(!value.equals(getAuthorizationCurrency()))) {
                    setAuthorizationCurrency(((String) value));
                }
            }
            if (values.containsKey("AuthorizationByDigitalPaytSrvc")) {
                final Object value = values.remove("AuthorizationByDigitalPaytSrvc");
                if ((value == null)||(!value.equals(getAuthorizationByDigitalPaytSrvc()))) {
                    setAuthorizationByDigitalPaytSrvc(((String) value));
                }
            }
            if (values.containsKey("AuthorizationByAcquirer")) {
                final Object value = values.remove("AuthorizationByAcquirer");
                if ((value == null)||(!value.equals(getAuthorizationByAcquirer()))) {
                    setAuthorizationByAcquirer(((String) value));
                }
            }
            if (values.containsKey("AuthorizationDate")) {
                final Object value = values.remove("AuthorizationDate");
                if ((value == null)||(!value.equals(getAuthorizationDate()))) {
                    setAuthorizationDate(((Calendar) value));
                }
            }
            if (values.containsKey("AuthorizationTime")) {
                final Object value = values.remove("AuthorizationTime");
                if ((value == null)||(!value.equals(getAuthorizationTime()))) {
                    setAuthorizationTime(((Calendar) value));
                }
            }
            if (values.containsKey("EPaytByDigitalPaymentSrvc")) {
                final Object value = values.remove("EPaytByDigitalPaymentSrvc");
                if ((value == null)||(!value.equals(getEPaytByDigitalPaymentSrvc()))) {
                    setEPaytByDigitalPaymentSrvc(((String) value));
                }
            }
            if (values.containsKey("ElectronicPaymentCallStatus")) {
                final Object value = values.remove("ElectronicPaymentCallStatus");
                if ((value == null)||(!value.equals(getElectronicPaymentCallStatus()))) {
                    setElectronicPaymentCallStatus(((String) value));
                }
            }
            if (values.containsKey("EPaytAuthorizationResult")) {
                final Object value = values.remove("EPaytAuthorizationResult");
                if ((value == null)||(!value.equals(getEPaytAuthorizationResult()))) {
                    setEPaytAuthorizationResult(((String) value));
                }
            }
            if (values.containsKey("EPaytToBeAuthorizedAmount")) {
                final Object value = values.remove("EPaytToBeAuthorizedAmount");
                if ((value == null)||(!value.equals(getEPaytToBeAuthorizedAmount()))) {
                    setEPaytToBeAuthorizedAmount(((BigDecimal) value));
                }
            }
            if (values.containsKey("EPaytAuthorizationIsExpired")) {
                final Object value = values.remove("EPaytAuthorizationIsExpired");
                if ((value == null)||(!value.equals(getEPaytAuthorizationIsExpired()))) {
                    setEPaytAuthorizationIsExpired(((Boolean) value));
                }
            }
            if (values.containsKey("EPaytAmountIsChanged")) {
                final Object value = values.remove("EPaytAmountIsChanged");
                if ((value == null)||(!value.equals(getEPaytAmountIsChanged()))) {
                    setEPaytAmountIsChanged(((Boolean) value));
                }
            }
            if (values.containsKey("PreauthorizationIsRequested")) {
                final Object value = values.remove("PreauthorizationIsRequested");
                if ((value == null)||(!value.equals(getPreauthorizationIsRequested()))) {
                    setPreauthorizationIsRequested(((Boolean) value));
                }
            }
            if (values.containsKey("MaximumToBeAuthorizedAmount")) {
                final Object value = values.remove("MaximumToBeAuthorizedAmount");
                if ((value == null)||(!value.equals(getMaximumToBeAuthorizedAmount()))) {
                    setMaximumToBeAuthorizedAmount(((BigDecimal) value));
                }
            }
            if (values.containsKey("PaytPlnForAuthorizationItem")) {
                final Object value = values.remove("PaytPlnForAuthorizationItem");
                if ((value == null)||(!value.equals(getPaytPlnForAuthorizationItem()))) {
                    setPaytPlnForAuthorizationItem(((String) value));
                }
            }
            if (values.containsKey("PaytPlnItmForAuthorizationItem")) {
                final Object value = values.remove("PaytPlnItmForAuthorizationItem");
                if ((value == null)||(!value.equals(getPaytPlnItmForAuthorizationItem()))) {
                    setPaytPlnItmForAuthorizationItem(((String) value));
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
    public static<T >SlsOrdPaymentPlanItemDetailsField<T> field(final String fieldName, final Class<T> fieldType) {
        return new SlsOrdPaymentPlanItemDetailsField<T>(fieldName);
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
        odataResourceUrl.append(",PaymentPlanItem=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(paymentPlanItem));
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
     * If the navigation property <b>to_SalesOrder</b> of a queried <b>SlsOrdPaymentPlanItemDetails</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
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
     * If the navigation property <b>to_SalesOrder</b> for an entity <b>SlsOrdPaymentPlanItemDetails</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <b>Optional</b> result state will be <i>null</i>.
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

    public final static class SlsOrdPaymentPlanItemDetailsBuilder {

        private SalesOrder toSalesOrder;
        private String salesOrder = null;

        private SlsOrdPaymentPlanItemDetails.SlsOrdPaymentPlanItemDetailsBuilder toSalesOrder(SalesOrder value) {
            toSalesOrder = value;
            return this;
        }

        /**
         * Navigation property <b>to_SalesOrder</b> for <b>SlsOrdPaymentPlanItemDetails</b> to single <b>SalesOrder</b>.
         * 
         */
        public SlsOrdPaymentPlanItemDetails.SlsOrdPaymentPlanItemDetailsBuilder salesOrder(final SalesOrder value) {
            return toSalesOrder(value);
        }

        /**
         * (Key Field) Constraints: Not nullable, Maximum length: 10
         * 
         */
        public SlsOrdPaymentPlanItemDetails.SlsOrdPaymentPlanItemDetailsBuilder salesOrder(final String value) {
            salesOrder = value;
            return this;
        }

    }

}
