
package com.sap.brewster.namespaces.salesordercreatereadupdatedelete;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.sap.cloud.sdk.s4hana.connectivity.ErpConfigContext;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Sales Order Schedule Line API<p></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class SalesOrderScheduleLine
    extends VdmEntity<SalesOrderScheduleLine>
{

    /**
     * Selector for all available fields of SalesOrderScheduleLine.
     * 
     */
    public final static SalesOrderScheduleLineSelectable ALL_FIELDS = new SalesOrderScheduleLineSelectable() {


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
     *     Sales Document
     */
    @SerializedName("SalesOrder")
    @JsonProperty("SalesOrder")
    @Nullable
    private String salesOrder;
    /**
     * Use with available fluent helpers to apply the <b>SalesOrder</b> field to query operations.
     * 
     */
    public final static SalesOrderScheduleLineField<String> SALES_ORDER = new SalesOrderScheduleLineField<String>("SalesOrder");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 6
     * 
     * @param salesOrderItem
     *     
     * @return
     *     Sales Document Item
     */
    @SerializedName("SalesOrderItem")
    @JsonProperty("SalesOrderItem")
    @Nullable
    private String salesOrderItem;
    /**
     * Use with available fluent helpers to apply the <b>SalesOrderItem</b> field to query operations.
     * 
     */
    public final static SalesOrderScheduleLineField<String> SALES_ORDER_ITEM = new SalesOrderScheduleLineField<String>("SalesOrderItem");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4
     * 
     * @param scheduleLine
     *     
     * @return
     *     Schedule Line Number
     */
    @SerializedName("ScheduleLine")
    @JsonProperty("ScheduleLine")
    @Nullable
    private String scheduleLine;
    /**
     * Use with available fluent helpers to apply the <b>ScheduleLine</b> field to query operations.
     * 
     */
    public final static SalesOrderScheduleLineField<String> SCHEDULE_LINE = new SalesOrderScheduleLineField<String>("ScheduleLine");
    /**
     * Constraints: Not nullable, Precision: 0
     * 
     * @param requestedDeliveryDate
     *     
     * @return
     *     Requested Delivery Date
     */
    @SerializedName("RequestedDeliveryDate")
    @JsonProperty("RequestedDeliveryDate")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataDateTimeAdapter.class)
    private Calendar requestedDeliveryDate;
    /**
     * Use with available fluent helpers to apply the <b>RequestedDeliveryDate</b> field to query operations.
     * 
     */
    public final static SalesOrderScheduleLineField<Calendar> REQUESTED_DELIVERY_DATE = new SalesOrderScheduleLineField<Calendar>("RequestedDeliveryDate");
    /**
     * Constraints: Not nullable, Precision: 0
     * 
     * @param confirmedDeliveryDate
     *     
     * @return
     *     Confirmed Delivery Date
     */
    @SerializedName("ConfirmedDeliveryDate")
    @JsonProperty("ConfirmedDeliveryDate")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataDateTimeAdapter.class)
    private Calendar confirmedDeliveryDate;
    /**
     * Use with available fluent helpers to apply the <b>ConfirmedDeliveryDate</b> field to query operations.
     * 
     */
    public final static SalesOrderScheduleLineField<Calendar> CONFIRMED_DELIVERY_DATE = new SalesOrderScheduleLineField<Calendar>("ConfirmedDeliveryDate");
    /**
     * Constraints: Not nullable, Maximum length: 3
     * 
     * @param orderQuantityUnit
     *     
     * @return
     *     Sales Unit
     */
    @SerializedName("OrderQuantityUnit")
    @JsonProperty("OrderQuantityUnit")
    @Nullable
    private String orderQuantityUnit;
    /**
     * Use with available fluent helpers to apply the <b>OrderQuantityUnit</b> field to query operations.
     * 
     */
    public final static SalesOrderScheduleLineField<String> ORDER_QUANTITY_UNIT = new SalesOrderScheduleLineField<String>("OrderQuantityUnit");
    /**
     * Constraints: Not nullable, Precision: 13, Scale: 3
     * 
     * @param scheduleLineOrderQuantity
     *     
     * @return
     *     Order Quantity in Sales Units
     */
    @SerializedName("ScheduleLineOrderQuantity")
    @JsonProperty("ScheduleLineOrderQuantity")
    @Nullable
    private BigDecimal scheduleLineOrderQuantity;
    /**
     * Use with available fluent helpers to apply the <b>ScheduleLineOrderQuantity</b> field to query operations.
     * 
     */
    public final static SalesOrderScheduleLineField<BigDecimal> SCHEDULE_LINE_ORDER_QUANTITY = new SalesOrderScheduleLineField<BigDecimal>("ScheduleLineOrderQuantity");
    /**
     * Constraints: Not nullable, Precision: 13, Scale: 3
     * 
     * @param confdOrderQtyByMatlAvailCheck
     *     
     * @return
     *     Confirmed Quantity
     */
    @SerializedName("ConfdOrderQtyByMatlAvailCheck")
    @JsonProperty("ConfdOrderQtyByMatlAvailCheck")
    @Nullable
    private BigDecimal confdOrderQtyByMatlAvailCheck;
    /**
     * Use with available fluent helpers to apply the <b>ConfdOrderQtyByMatlAvailCheck</b> field to query operations.
     * 
     */
    public final static SalesOrderScheduleLineField<BigDecimal> CONFD_ORDER_QTY_BY_MATL_AVAIL_CHECK = new SalesOrderScheduleLineField<BigDecimal>("ConfdOrderQtyByMatlAvailCheck");
    /**
     * Constraints: Not nullable, Precision: 13, Scale: 3
     * 
     * @param deliveredQtyInOrderQtyUnit
     *     
     * @return
     *     Delivered Quantity
     */
    @SerializedName("DeliveredQtyInOrderQtyUnit")
    @JsonProperty("DeliveredQtyInOrderQtyUnit")
    @Nullable
    private BigDecimal deliveredQtyInOrderQtyUnit;
    /**
     * Use with available fluent helpers to apply the <b>DeliveredQtyInOrderQtyUnit</b> field to query operations.
     * 
     */
    public final static SalesOrderScheduleLineField<BigDecimal> DELIVERED_QTY_IN_ORDER_QTY_UNIT = new SalesOrderScheduleLineField<BigDecimal>("DeliveredQtyInOrderQtyUnit");
    /**
     * Constraints: Not nullable, Precision: 13, Scale: 3
     * 
     * @param openConfdDelivQtyInOrdQtyUnit
     *     
     * @return
     *     Open Confirmed Delivery Quantity
     */
    @SerializedName("OpenConfdDelivQtyInOrdQtyUnit")
    @JsonProperty("OpenConfdDelivQtyInOrdQtyUnit")
    @Nullable
    private BigDecimal openConfdDelivQtyInOrdQtyUnit;
    /**
     * Use with available fluent helpers to apply the <b>OpenConfdDelivQtyInOrdQtyUnit</b> field to query operations.
     * 
     */
    public final static SalesOrderScheduleLineField<BigDecimal> OPEN_CONFD_DELIV_QTY_IN_ORD_QTY_UNIT = new SalesOrderScheduleLineField<BigDecimal>("OpenConfdDelivQtyInOrdQtyUnit");
    /**
     * Constraints: Not nullable, Precision: 13, Scale: 3
     * 
     * @param correctedQtyInOrderQtyUnit
     *     
     * @return
     *     Corrected quantity in sales unit
     */
    @SerializedName("CorrectedQtyInOrderQtyUnit")
    @JsonProperty("CorrectedQtyInOrderQtyUnit")
    @Nullable
    private BigDecimal correctedQtyInOrderQtyUnit;
    /**
     * Use with available fluent helpers to apply the <b>CorrectedQtyInOrderQtyUnit</b> field to query operations.
     * 
     */
    public final static SalesOrderScheduleLineField<BigDecimal> CORRECTED_QTY_IN_ORDER_QTY_UNIT = new SalesOrderScheduleLineField<BigDecimal>("CorrectedQtyInOrderQtyUnit");
    /**
     * Constraints: Not nullable, Maximum length: 2
     * 
     * @param delivBlockReasonForSchedLine
     *     
     * @return
     *     Schedule Line Blocked for Delivery
     */
    @SerializedName("DelivBlockReasonForSchedLine")
    @JsonProperty("DelivBlockReasonForSchedLine")
    @Nullable
    private String delivBlockReasonForSchedLine;
    /**
     * Use with available fluent helpers to apply the <b>DelivBlockReasonForSchedLine</b> field to query operations.
     * 
     */
    public final static SalesOrderScheduleLineField<String> DELIV_BLOCK_REASON_FOR_SCHED_LINE = new SalesOrderScheduleLineField<String>("DelivBlockReasonForSchedLine");
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
     * {@inheritDoc}
     * 
     */
    @Override
    public Class<SalesOrderScheduleLine> getType() {
        return SalesOrderScheduleLine.class;
    }

    @Override
    protected String getEndpointUrl() {
        return "/sap/opu/odata/sap/API_SALES_ORDER_SRV";
    }

    @Override
    protected String getEntityCollection() {
        return "A_SalesOrderScheduleLine";
    }

    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("SalesOrder", getSalesOrder());
        result.put("SalesOrderItem", getSalesOrderItem());
        result.put("ScheduleLine", getScheduleLine());
        return result;
    }

    @Override
    protected Map<String, Object> toMap() {
        final Map<String, Object> values = super.toMap();
        values.put("SalesOrder", getSalesOrder());
        values.put("SalesOrderItem", getSalesOrderItem());
        values.put("ScheduleLine", getScheduleLine());
        values.put("RequestedDeliveryDate", getRequestedDeliveryDate());
        values.put("ConfirmedDeliveryDate", getConfirmedDeliveryDate());
        values.put("OrderQuantityUnit", getOrderQuantityUnit());
        values.put("ScheduleLineOrderQuantity", getScheduleLineOrderQuantity());
        values.put("ConfdOrderQtyByMatlAvailCheck", getConfdOrderQtyByMatlAvailCheck());
        values.put("DeliveredQtyInOrderQtyUnit", getDeliveredQtyInOrderQtyUnit());
        values.put("OpenConfdDelivQtyInOrdQtyUnit", getOpenConfdDelivQtyInOrdQtyUnit());
        values.put("CorrectedQtyInOrderQtyUnit", getCorrectedQtyInOrderQtyUnit());
        values.put("DelivBlockReasonForSchedLine", getDelivBlockReasonForSchedLine());
        // navigation properties
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
            if (values.containsKey("ScheduleLine")) {
                final Object value = values.remove("ScheduleLine");
                if ((value == null)||(!value.equals(getScheduleLine()))) {
                    setScheduleLine(((String) value));
                }
            }
            if (values.containsKey("RequestedDeliveryDate")) {
                final Object value = values.remove("RequestedDeliveryDate");
                if ((value == null)||(!value.equals(getRequestedDeliveryDate()))) {
                    setRequestedDeliveryDate(((Calendar) value));
                }
            }
            if (values.containsKey("ConfirmedDeliveryDate")) {
                final Object value = values.remove("ConfirmedDeliveryDate");
                if ((value == null)||(!value.equals(getConfirmedDeliveryDate()))) {
                    setConfirmedDeliveryDate(((Calendar) value));
                }
            }
            if (values.containsKey("OrderQuantityUnit")) {
                final Object value = values.remove("OrderQuantityUnit");
                if ((value == null)||(!value.equals(getOrderQuantityUnit()))) {
                    setOrderQuantityUnit(((String) value));
                }
            }
            if (values.containsKey("ScheduleLineOrderQuantity")) {
                final Object value = values.remove("ScheduleLineOrderQuantity");
                if ((value == null)||(!value.equals(getScheduleLineOrderQuantity()))) {
                    setScheduleLineOrderQuantity(((BigDecimal) value));
                }
            }
            if (values.containsKey("ConfdOrderQtyByMatlAvailCheck")) {
                final Object value = values.remove("ConfdOrderQtyByMatlAvailCheck");
                if ((value == null)||(!value.equals(getConfdOrderQtyByMatlAvailCheck()))) {
                    setConfdOrderQtyByMatlAvailCheck(((BigDecimal) value));
                }
            }
            if (values.containsKey("DeliveredQtyInOrderQtyUnit")) {
                final Object value = values.remove("DeliveredQtyInOrderQtyUnit");
                if ((value == null)||(!value.equals(getDeliveredQtyInOrderQtyUnit()))) {
                    setDeliveredQtyInOrderQtyUnit(((BigDecimal) value));
                }
            }
            if (values.containsKey("OpenConfdDelivQtyInOrdQtyUnit")) {
                final Object value = values.remove("OpenConfdDelivQtyInOrdQtyUnit");
                if ((value == null)||(!value.equals(getOpenConfdDelivQtyInOrdQtyUnit()))) {
                    setOpenConfdDelivQtyInOrdQtyUnit(((BigDecimal) value));
                }
            }
            if (values.containsKey("CorrectedQtyInOrderQtyUnit")) {
                final Object value = values.remove("CorrectedQtyInOrderQtyUnit");
                if ((value == null)||(!value.equals(getCorrectedQtyInOrderQtyUnit()))) {
                    setCorrectedQtyInOrderQtyUnit(((BigDecimal) value));
                }
            }
            if (values.containsKey("DelivBlockReasonForSchedLine")) {
                final Object value = values.remove("DelivBlockReasonForSchedLine");
                if ((value == null)||(!value.equals(getDelivBlockReasonForSchedLine()))) {
                    setDelivBlockReasonForSchedLine(((String) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
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
    public static<T >SalesOrderScheduleLineField<T> field(final String fieldName, final Class<T> fieldType) {
        return new SalesOrderScheduleLineField<T>(fieldName);
    }

}
