
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
import com.google.common.collect.Lists;
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
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
import org.apache.olingo.odata2.api.edm.EdmSimpleTypeKind;


/**
 * Sales Order Item API<p></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class SalesOrderItem
    extends VdmEntity<SalesOrderItem>
{

    /**
     * Selector for all available fields of SalesOrderItem.
     * 
     */
    public final static SalesOrderItemSelectable ALL_FIELDS = new SalesOrderItemSelectable() {


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
    public final static SalesOrderItemField<String> SALES_ORDER = new SalesOrderItemField<String>("SalesOrder");
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
    public final static SalesOrderItemField<String> SALES_ORDER_ITEM = new SalesOrderItemField<String>("SalesOrderItem");
    /**
     * Constraints: Not nullable, Maximum length: 6
     * 
     * @param higherLevelItem
     *     
     * @return
     *     Higher-Level item in bill of material structures
     */
    @SerializedName("HigherLevelItem")
    @JsonProperty("HigherLevelItem")
    @Nullable
    private String higherLevelItem;
    /**
     * Use with available fluent helpers to apply the <b>HigherLevelItem</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<String> HIGHER_LEVEL_ITEM = new SalesOrderItemField<String>("HigherLevelItem");
    /**
     * Constraints: Not nullable, Maximum length: 4
     * 
     * @param salesOrderItemCategory
     *     
     * @return
     *     Sales Document Item Category
     */
    @SerializedName("SalesOrderItemCategory")
    @JsonProperty("SalesOrderItemCategory")
    @Nullable
    private String salesOrderItemCategory;
    /**
     * Use with available fluent helpers to apply the <b>SalesOrderItemCategory</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<String> SALES_ORDER_ITEM_CATEGORY = new SalesOrderItemField<String>("SalesOrderItemCategory");
    /**
     * Constraints: Not nullable, Maximum length: 40
     * 
     * @param salesOrderItemText
     *     
     * @return
     *     Short Text for Sales Order Item
     */
    @SerializedName("SalesOrderItemText")
    @JsonProperty("SalesOrderItemText")
    @Nullable
    private String salesOrderItemText;
    /**
     * Use with available fluent helpers to apply the <b>SalesOrderItemText</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<String> SALES_ORDER_ITEM_TEXT = new SalesOrderItemField<String>("SalesOrderItemText");
    /**
     * Constraints: Not nullable, Maximum length: 35
     * 
     * @param purchaseOrderByCustomer
     *     
     * @return
     *     Customer Reference
     */
    @SerializedName("PurchaseOrderByCustomer")
    @JsonProperty("PurchaseOrderByCustomer")
    @Nullable
    private String purchaseOrderByCustomer;
    /**
     * Use with available fluent helpers to apply the <b>PurchaseOrderByCustomer</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<String> PURCHASE_ORDER_BY_CUSTOMER = new SalesOrderItemField<String>("PurchaseOrderByCustomer");
    /**
     * Constraints: Not nullable, Maximum length: 40
     * 
     * @param material
     *     
     * @return
     *     Material Number
     */
    @SerializedName("Material")
    @JsonProperty("Material")
    @Nullable
    private String material;
    /**
     * Use with available fluent helpers to apply the <b>Material</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<String> MATERIAL = new SalesOrderItemField<String>("Material");
    /**
     * Constraints: Not nullable, Maximum length: 35
     * 
     * @param materialByCustomer
     *     
     * @return
     *     Material Number Used by Customer
     */
    @SerializedName("MaterialByCustomer")
    @JsonProperty("MaterialByCustomer")
    @Nullable
    private String materialByCustomer;
    /**
     * Use with available fluent helpers to apply the <b>MaterialByCustomer</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<String> MATERIAL_BY_CUSTOMER = new SalesOrderItemField<String>("MaterialByCustomer");
    /**
     * Constraints: Not nullable, Precision: 0
     * 
     * @param pricingDate
     *     
     * @return
     *     Date for Pricing and Exchange Rate
     */
    @SerializedName("PricingDate")
    @JsonProperty("PricingDate")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataDateTimeAdapter.class)
    private Calendar pricingDate;
    /**
     * Use with available fluent helpers to apply the <b>PricingDate</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<Calendar> PRICING_DATE = new SalesOrderItemField<Calendar>("PricingDate");
    /**
     * Constraints: Not nullable, Precision: 15, Scale: 3
     * 
     * @param requestedQuantity
     *     
     * @return
     *     Requested Quantity
     */
    @SerializedName("RequestedQuantity")
    @JsonProperty("RequestedQuantity")
    @Nullable
    private BigDecimal requestedQuantity;
    /**
     * Use with available fluent helpers to apply the <b>RequestedQuantity</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<BigDecimal> REQUESTED_QUANTITY = new SalesOrderItemField<BigDecimal>("RequestedQuantity");
    /**
     * Constraints: Not nullable, Maximum length: 3
     * 
     * @param requestedQuantityUnit
     *     
     * @return
     *     Requested Quantity Unit
     */
    @SerializedName("RequestedQuantityUnit")
    @JsonProperty("RequestedQuantityUnit")
    @Nullable
    private String requestedQuantityUnit;
    /**
     * Use with available fluent helpers to apply the <b>RequestedQuantityUnit</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<String> REQUESTED_QUANTITY_UNIT = new SalesOrderItemField<String>("RequestedQuantityUnit");
    /**
     * Constraints: Not nullable, Precision: 15, Scale: 3
     * 
     * @param itemGrossWeight
     *     
     * @return
     *     Gross Weight of the Item
     */
    @SerializedName("ItemGrossWeight")
    @JsonProperty("ItemGrossWeight")
    @Nullable
    private BigDecimal itemGrossWeight;
    /**
     * Use with available fluent helpers to apply the <b>ItemGrossWeight</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<BigDecimal> ITEM_GROSS_WEIGHT = new SalesOrderItemField<BigDecimal>("ItemGrossWeight");
    /**
     * Constraints: Not nullable, Precision: 15, Scale: 3
     * 
     * @param itemNetWeight
     *     
     * @return
     *     Net Weight of the Item
     */
    @SerializedName("ItemNetWeight")
    @JsonProperty("ItemNetWeight")
    @Nullable
    private BigDecimal itemNetWeight;
    /**
     * Use with available fluent helpers to apply the <b>ItemNetWeight</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<BigDecimal> ITEM_NET_WEIGHT = new SalesOrderItemField<BigDecimal>("ItemNetWeight");
    /**
     * Constraints: Not nullable, Maximum length: 3
     * 
     * @param itemWeightUnit
     *     
     * @return
     *     Unit of Weight
     */
    @SerializedName("ItemWeightUnit")
    @JsonProperty("ItemWeightUnit")
    @Nullable
    private String itemWeightUnit;
    /**
     * Use with available fluent helpers to apply the <b>ItemWeightUnit</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<String> ITEM_WEIGHT_UNIT = new SalesOrderItemField<String>("ItemWeightUnit");
    /**
     * Constraints: Not nullable, Precision: 15, Scale: 3
     * 
     * @param itemVolume
     *     
     * @return
     *     Volume of the item
     */
    @SerializedName("ItemVolume")
    @JsonProperty("ItemVolume")
    @Nullable
    private BigDecimal itemVolume;
    /**
     * Use with available fluent helpers to apply the <b>ItemVolume</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<BigDecimal> ITEM_VOLUME = new SalesOrderItemField<BigDecimal>("ItemVolume");
    /**
     * Constraints: Not nullable, Maximum length: 3
     * 
     * @param itemVolumeUnit
     *     
     * @return
     *     Volume Unit
     */
    @SerializedName("ItemVolumeUnit")
    @JsonProperty("ItemVolumeUnit")
    @Nullable
    private String itemVolumeUnit;
    /**
     * Use with available fluent helpers to apply the <b>ItemVolumeUnit</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<String> ITEM_VOLUME_UNIT = new SalesOrderItemField<String>("ItemVolumeUnit");
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
    public final static SalesOrderItemField<String> TRANSACTION_CURRENCY = new SalesOrderItemField<String>("TransactionCurrency");
    /**
     * Constraints: Not nullable, Precision: 16, Scale: 3
     * 
     * @param netAmount
     *     
     * @return
     *     Net Value of the Order Item in Document Currency
     */
    @SerializedName("NetAmount")
    @JsonProperty("NetAmount")
    @Nullable
    private BigDecimal netAmount;
    /**
     * Use with available fluent helpers to apply the <b>NetAmount</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<BigDecimal> NET_AMOUNT = new SalesOrderItemField<BigDecimal>("NetAmount");
    /**
     * Constraints: Not nullable, Maximum length: 9
     * 
     * @param materialGroup
     *     
     * @return
     *     Material Group
     */
    @SerializedName("MaterialGroup")
    @JsonProperty("MaterialGroup")
    @Nullable
    private String materialGroup;
    /**
     * Use with available fluent helpers to apply the <b>MaterialGroup</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<String> MATERIAL_GROUP = new SalesOrderItemField<String>("MaterialGroup");
    /**
     * Constraints: Not nullable, Maximum length: 2
     * 
     * @param materialPricingGroup
     *     
     * @return
     *     Material Price Group
     */
    @SerializedName("MaterialPricingGroup")
    @JsonProperty("MaterialPricingGroup")
    @Nullable
    private String materialPricingGroup;
    /**
     * Use with available fluent helpers to apply the <b>MaterialPricingGroup</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<String> MATERIAL_PRICING_GROUP = new SalesOrderItemField<String>("MaterialPricingGroup");
    /**
     * Constraints: Not nullable, Maximum length: 10
     * 
     * @param batch
     *     
     * @return
     *     Batch Number
     */
    @SerializedName("Batch")
    @JsonProperty("Batch")
    @Nullable
    private String batch;
    /**
     * Use with available fluent helpers to apply the <b>Batch</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<String> BATCH = new SalesOrderItemField<String>("Batch");
    /**
     * Constraints: Not nullable, Maximum length: 4
     * 
     * @param productionPlant
     *     
     * @return
     *     Plant (Own or External)
     */
    @SerializedName("ProductionPlant")
    @JsonProperty("ProductionPlant")
    @Nullable
    private String productionPlant;
    /**
     * Use with available fluent helpers to apply the <b>ProductionPlant</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<String> PRODUCTION_PLANT = new SalesOrderItemField<String>("ProductionPlant");
    /**
     * Constraints: Not nullable, Maximum length: 4
     * 
     * @param storageLocation
     *     
     * @return
     *     Storage Location
     */
    @SerializedName("StorageLocation")
    @JsonProperty("StorageLocation")
    @Nullable
    private String storageLocation;
    /**
     * Use with available fluent helpers to apply the <b>StorageLocation</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<String> STORAGE_LOCATION = new SalesOrderItemField<String>("StorageLocation");
    /**
     * Constraints: Not nullable, Maximum length: 3
     * 
     * @param deliveryGroup
     *     
     * @return
     *     Delivery Group (Items are delivered together)
     */
    @SerializedName("DeliveryGroup")
    @JsonProperty("DeliveryGroup")
    @Nullable
    private String deliveryGroup;
    /**
     * Use with available fluent helpers to apply the <b>DeliveryGroup</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<String> DELIVERY_GROUP = new SalesOrderItemField<String>("DeliveryGroup");
    /**
     * Constraints: Not nullable, Maximum length: 4
     * 
     * @param shippingPoint
     *     
     * @return
     *     Shipping Point/Receiving Point
     */
    @SerializedName("ShippingPoint")
    @JsonProperty("ShippingPoint")
    @Nullable
    private String shippingPoint;
    /**
     * Use with available fluent helpers to apply the <b>ShippingPoint</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<String> SHIPPING_POINT = new SalesOrderItemField<String>("ShippingPoint");
    /**
     * Constraints: Not nullable, Maximum length: 2
     * 
     * @param shippingType
     *     
     * @return
     *     Shipping Type
     */
    @SerializedName("ShippingType")
    @JsonProperty("ShippingType")
    @Nullable
    private String shippingType;
    /**
     * Use with available fluent helpers to apply the <b>ShippingType</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<String> SHIPPING_TYPE = new SalesOrderItemField<String>("ShippingType");
    /**
     * Constraints: Not nullable, Maximum length: 2
     * 
     * @param deliveryPriority
     *     
     * @return
     *     Delivery Priority
     */
    @SerializedName("DeliveryPriority")
    @JsonProperty("DeliveryPriority")
    @Nullable
    private String deliveryPriority;
    /**
     * Use with available fluent helpers to apply the <b>DeliveryPriority</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<String> DELIVERY_PRIORITY = new SalesOrderItemField<String>("DeliveryPriority");
    /**
     * Constraints: Not nullable, Maximum length: 3
     * 
     * @param incotermsClassification
     *     
     * @return
     *     Incoterms (Part 1)
     */
    @SerializedName("IncotermsClassification")
    @JsonProperty("IncotermsClassification")
    @Nullable
    private String incotermsClassification;
    /**
     * Use with available fluent helpers to apply the <b>IncotermsClassification</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<String> INCOTERMS_CLASSIFICATION = new SalesOrderItemField<String>("IncotermsClassification");
    /**
     * Constraints: Not nullable, Maximum length: 28
     * 
     * @param incotermsTransferLocation
     *     
     * @return
     *     Incoterms Part 2
     */
    @SerializedName("IncotermsTransferLocation")
    @JsonProperty("IncotermsTransferLocation")
    @Nullable
    private String incotermsTransferLocation;
    /**
     * Use with available fluent helpers to apply the <b>IncotermsTransferLocation</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<String> INCOTERMS_TRANSFER_LOCATION = new SalesOrderItemField<String>("IncotermsTransferLocation");
    /**
     * Constraints: Not nullable, Maximum length: 70
     * 
     * @param incotermsLocation1
     *     
     * @return
     *     Incoterms Location 1
     */
    @SerializedName("IncotermsLocation1")
    @JsonProperty("IncotermsLocation1")
    @Nullable
    private String incotermsLocation1;
    /**
     * Use with available fluent helpers to apply the <b>IncotermsLocation1</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<String> INCOTERMS_LOCATION1 = new SalesOrderItemField<String>("IncotermsLocation1");
    /**
     * Constraints: Not nullable, Maximum length: 70
     * 
     * @param incotermsLocation2
     *     
     * @return
     *     Incoterms Location 2
     */
    @SerializedName("IncotermsLocation2")
    @JsonProperty("IncotermsLocation2")
    @Nullable
    private String incotermsLocation2;
    /**
     * Use with available fluent helpers to apply the <b>IncotermsLocation2</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<String> INCOTERMS_LOCATION2 = new SalesOrderItemField<String>("IncotermsLocation2");
    /**
     * Constraints: Not nullable, Maximum length: 4
     * 
     * @param customerPaymentTerms
     *     
     * @return
     *     Terms of Payment Key
     */
    @SerializedName("CustomerPaymentTerms")
    @JsonProperty("CustomerPaymentTerms")
    @Nullable
    private String customerPaymentTerms;
    /**
     * Use with available fluent helpers to apply the <b>CustomerPaymentTerms</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<String> CUSTOMER_PAYMENT_TERMS = new SalesOrderItemField<String>("CustomerPaymentTerms");
    /**
     * Constraints: Not nullable, Maximum length: 2
     * 
     * @param salesDocumentRjcnReason
     *     
     * @return
     *     Reason for Rejection of Sales Documents
     */
    @SerializedName("SalesDocumentRjcnReason")
    @JsonProperty("SalesDocumentRjcnReason")
    @Nullable
    private String salesDocumentRjcnReason;
    /**
     * Use with available fluent helpers to apply the <b>SalesDocumentRjcnReason</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<String> SALES_DOCUMENT_RJCN_REASON = new SalesOrderItemField<String>("SalesDocumentRjcnReason");
    /**
     * Constraints: Not nullable, Maximum length: 2
     * 
     * @param itemBillingBlockReason
     *     
     * @return
     *     Billing Block for Item
     */
    @SerializedName("ItemBillingBlockReason")
    @JsonProperty("ItemBillingBlockReason")
    @Nullable
    private String itemBillingBlockReason;
    /**
     * Use with available fluent helpers to apply the <b>ItemBillingBlockReason</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<String> ITEM_BILLING_BLOCK_REASON = new SalesOrderItemField<String>("ItemBillingBlockReason");
    /**
     * Constraints: Not nullable, Maximum length: 24
     * 
     * @param wBSElement
     *     
     * @return
     *     Work Breakdown Structure Element (WBS Element)
     */
    @SerializedName("WBSElement")
    @JsonProperty("WBSElement")
    @Nullable
    private String wBSElement;
    /**
     * Use with available fluent helpers to apply the <b>WBSElement</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<String> WBS_ELEMENT = new SalesOrderItemField<String>("WBSElement");
    /**
     * Constraints: Not nullable, Maximum length: 10
     * 
     * @param profitCenter
     *     
     * @return
     *     Profit Center
     */
    @SerializedName("ProfitCenter")
    @JsonProperty("ProfitCenter")
    @Nullable
    private String profitCenter;
    /**
     * Use with available fluent helpers to apply the <b>ProfitCenter</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<String> PROFIT_CENTER = new SalesOrderItemField<String>("ProfitCenter");
    /**
     * Constraints: Not nullable, Maximum length: 1
     * 
     * @param sDProcessStatus
     *     
     * @return
     *     Overall Processing Status of the SD Document Item
     */
    @SerializedName("SDProcessStatus")
    @JsonProperty("SDProcessStatus")
    @Nullable
    private String sDProcessStatus;
    /**
     * Use with available fluent helpers to apply the <b>SDProcessStatus</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<String> SD_PROCESS_STATUS = new SalesOrderItemField<String>("SDProcessStatus");
    /**
     * Constraints: Not nullable, Maximum length: 1
     * 
     * @param deliveryStatus
     *     
     * @return
     *     Delivery Status
     */
    @SerializedName("DeliveryStatus")
    @JsonProperty("DeliveryStatus")
    @Nullable
    private String deliveryStatus;
    /**
     * Use with available fluent helpers to apply the <b>DeliveryStatus</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<String> DELIVERY_STATUS = new SalesOrderItemField<String>("DeliveryStatus");
    /**
     * Constraints: Not nullable, Maximum length: 1
     * 
     * @param orderRelatedBillingStatus
     *     
     * @return
     *     Billing Status for Order-Related Billing Documents
     */
    @SerializedName("OrderRelatedBillingStatus")
    @JsonProperty("OrderRelatedBillingStatus")
    @Nullable
    private String orderRelatedBillingStatus;
    /**
     * Use with available fluent helpers to apply the <b>OrderRelatedBillingStatus</b> field to query operations.
     * 
     */
    public final static SalesOrderItemField<String> ORDER_RELATED_BILLING_STATUS = new SalesOrderItemField<String>("OrderRelatedBillingStatus");
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
     * Navigation property <b>to_Partner</b> for <b>SalesOrderItem</b> to multiple <b>SalesOrderItemPartner</b>.
     * 
     */
    @SerializedName("to_Partner")
    @JsonProperty("to_Partner")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<SalesOrderItemPartner> toPartner;
    /**
     * Use with available fluent helpers to apply the <b>to_Partner</b> navigation property to query operations.
     * 
     */
    public final static SalesOrderItemLink<SalesOrderItemPartner> TO_PARTNER = new SalesOrderItemLink<SalesOrderItemPartner>("to_Partner");
    /**
     * Navigation property <b>to_PricingElement</b> for <b>SalesOrderItem</b> to multiple <b>SalesOrderItemPrElement</b>.
     * 
     */
    @SerializedName("to_PricingElement")
    @JsonProperty("to_PricingElement")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<SalesOrderItemPrElement> toPricingElement;
    /**
     * Use with available fluent helpers to apply the <b>to_PricingElement</b> navigation property to query operations.
     * 
     */
    public final static SalesOrderItemLink<SalesOrderItemPrElement> TO_PRICING_ELEMENT = new SalesOrderItemLink<SalesOrderItemPrElement>("to_PricingElement");
    /**
     * Navigation property <b>to_SalesOrder</b> for <b>SalesOrderItem</b> to single <b>SalesOrder</b>.
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
    public final static SalesOrderItemLink<SalesOrder> TO_SALES_ORDER = new SalesOrderItemLink<SalesOrder>("to_SalesOrder");
    /**
     * Navigation property <b>to_ScheduleLine</b> for <b>SalesOrderItem</b> to multiple <b>SalesOrderScheduleLine</b>.
     * 
     */
    @SerializedName("to_ScheduleLine")
    @JsonProperty("to_ScheduleLine")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<SalesOrderScheduleLine> toScheduleLine;
    /**
     * Use with available fluent helpers to apply the <b>to_ScheduleLine</b> navigation property to query operations.
     * 
     */
    public final static SalesOrderItemLink<SalesOrderScheduleLine> TO_SCHEDULE_LINE = new SalesOrderItemLink<SalesOrderScheduleLine>("to_ScheduleLine");
    /**
     * Navigation property <b>to_Text</b> for <b>SalesOrderItem</b> to multiple <b>SalesOrderItemText</b>.
     * 
     */
    @SerializedName("to_Text")
    @JsonProperty("to_Text")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<SalesOrderItemText> toText;
    /**
     * Use with available fluent helpers to apply the <b>to_Text</b> navigation property to query operations.
     * 
     */
    public final static SalesOrderItemLink<SalesOrderItemText> TO_TEXT = new SalesOrderItemLink<SalesOrderItemText>("to_Text");

    /**
     * {@inheritDoc}
     * 
     */
    @Override
    public Class<SalesOrderItem> getType() {
        return SalesOrderItem.class;
    }

    @Override
    protected String getEndpointUrl() {
        return "/sap/opu/odata/sap/API_SALES_ORDER_SRV";
    }

    @Override
    protected String getEntityCollection() {
        return "A_SalesOrderItem";
    }

    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("SalesOrder", getSalesOrder());
        result.put("SalesOrderItem", getSalesOrderItem());
        return result;
    }

    @Override
    protected Map<String, Object> toMap() {
        final Map<String, Object> values = super.toMap();
        values.put("SalesOrder", getSalesOrder());
        values.put("SalesOrderItem", getSalesOrderItem());
        values.put("HigherLevelItem", getHigherLevelItem());
        values.put("SalesOrderItemCategory", getSalesOrderItemCategory());
        values.put("SalesOrderItemText", getSalesOrderItemText());
        values.put("PurchaseOrderByCustomer", getPurchaseOrderByCustomer());
        values.put("Material", getMaterial());
        values.put("MaterialByCustomer", getMaterialByCustomer());
        values.put("PricingDate", getPricingDate());
        values.put("RequestedQuantity", getRequestedQuantity());
        values.put("RequestedQuantityUnit", getRequestedQuantityUnit());
        values.put("ItemGrossWeight", getItemGrossWeight());
        values.put("ItemNetWeight", getItemNetWeight());
        values.put("ItemWeightUnit", getItemWeightUnit());
        values.put("ItemVolume", getItemVolume());
        values.put("ItemVolumeUnit", getItemVolumeUnit());
        values.put("TransactionCurrency", getTransactionCurrency());
        values.put("NetAmount", getNetAmount());
        values.put("MaterialGroup", getMaterialGroup());
        values.put("MaterialPricingGroup", getMaterialPricingGroup());
        values.put("Batch", getBatch());
        values.put("ProductionPlant", getProductionPlant());
        values.put("StorageLocation", getStorageLocation());
        values.put("DeliveryGroup", getDeliveryGroup());
        values.put("ShippingPoint", getShippingPoint());
        values.put("ShippingType", getShippingType());
        values.put("DeliveryPriority", getDeliveryPriority());
        values.put("IncotermsClassification", getIncotermsClassification());
        values.put("IncotermsTransferLocation", getIncotermsTransferLocation());
        values.put("IncotermsLocation1", getIncotermsLocation1());
        values.put("IncotermsLocation2", getIncotermsLocation2());
        values.put("CustomerPaymentTerms", getCustomerPaymentTerms());
        values.put("SalesDocumentRjcnReason", getSalesDocumentRjcnReason());
        values.put("ItemBillingBlockReason", getItemBillingBlockReason());
        values.put("WBSElement", getWBSElement());
        values.put("ProfitCenter", getProfitCenter());
        values.put("SDProcessStatus", getSDProcessStatus());
        values.put("DeliveryStatus", getDeliveryStatus());
        values.put("OrderRelatedBillingStatus", getOrderRelatedBillingStatus());
        // navigation properties
        if (toPartner!= null) {
            (values).put("to_Partner", toPartner);
        }
        if (toPricingElement!= null) {
            (values).put("to_PricingElement", toPricingElement);
        }
        if (toSalesOrder!= null) {
            (values).put("to_SalesOrder", toSalesOrder);
        }
        if (toScheduleLine!= null) {
            (values).put("to_ScheduleLine", toScheduleLine);
        }
        if (toText!= null) {
            (values).put("to_Text", toText);
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
            if (values.containsKey("HigherLevelItem")) {
                final Object value = values.remove("HigherLevelItem");
                if ((value == null)||(!value.equals(getHigherLevelItem()))) {
                    setHigherLevelItem(((String) value));
                }
            }
            if (values.containsKey("SalesOrderItemCategory")) {
                final Object value = values.remove("SalesOrderItemCategory");
                if ((value == null)||(!value.equals(getSalesOrderItemCategory()))) {
                    setSalesOrderItemCategory(((String) value));
                }
            }
            if (values.containsKey("SalesOrderItemText")) {
                final Object value = values.remove("SalesOrderItemText");
                if ((value == null)||(!value.equals(getSalesOrderItemText()))) {
                    setSalesOrderItemText(((String) value));
                }
            }
            if (values.containsKey("PurchaseOrderByCustomer")) {
                final Object value = values.remove("PurchaseOrderByCustomer");
                if ((value == null)||(!value.equals(getPurchaseOrderByCustomer()))) {
                    setPurchaseOrderByCustomer(((String) value));
                }
            }
            if (values.containsKey("Material")) {
                final Object value = values.remove("Material");
                if ((value == null)||(!value.equals(getMaterial()))) {
                    setMaterial(((String) value));
                }
            }
            if (values.containsKey("MaterialByCustomer")) {
                final Object value = values.remove("MaterialByCustomer");
                if ((value == null)||(!value.equals(getMaterialByCustomer()))) {
                    setMaterialByCustomer(((String) value));
                }
            }
            if (values.containsKey("PricingDate")) {
                final Object value = values.remove("PricingDate");
                if ((value == null)||(!value.equals(getPricingDate()))) {
                    setPricingDate(((Calendar) value));
                }
            }
            if (values.containsKey("RequestedQuantity")) {
                final Object value = values.remove("RequestedQuantity");
                if ((value == null)||(!value.equals(getRequestedQuantity()))) {
                    setRequestedQuantity(((BigDecimal) value));
                }
            }
            if (values.containsKey("RequestedQuantityUnit")) {
                final Object value = values.remove("RequestedQuantityUnit");
                if ((value == null)||(!value.equals(getRequestedQuantityUnit()))) {
                    setRequestedQuantityUnit(((String) value));
                }
            }
            if (values.containsKey("ItemGrossWeight")) {
                final Object value = values.remove("ItemGrossWeight");
                if ((value == null)||(!value.equals(getItemGrossWeight()))) {
                    setItemGrossWeight(((BigDecimal) value));
                }
            }
            if (values.containsKey("ItemNetWeight")) {
                final Object value = values.remove("ItemNetWeight");
                if ((value == null)||(!value.equals(getItemNetWeight()))) {
                    setItemNetWeight(((BigDecimal) value));
                }
            }
            if (values.containsKey("ItemWeightUnit")) {
                final Object value = values.remove("ItemWeightUnit");
                if ((value == null)||(!value.equals(getItemWeightUnit()))) {
                    setItemWeightUnit(((String) value));
                }
            }
            if (values.containsKey("ItemVolume")) {
                final Object value = values.remove("ItemVolume");
                if ((value == null)||(!value.equals(getItemVolume()))) {
                    setItemVolume(((BigDecimal) value));
                }
            }
            if (values.containsKey("ItemVolumeUnit")) {
                final Object value = values.remove("ItemVolumeUnit");
                if ((value == null)||(!value.equals(getItemVolumeUnit()))) {
                    setItemVolumeUnit(((String) value));
                }
            }
            if (values.containsKey("TransactionCurrency")) {
                final Object value = values.remove("TransactionCurrency");
                if ((value == null)||(!value.equals(getTransactionCurrency()))) {
                    setTransactionCurrency(((String) value));
                }
            }
            if (values.containsKey("NetAmount")) {
                final Object value = values.remove("NetAmount");
                if ((value == null)||(!value.equals(getNetAmount()))) {
                    setNetAmount(((BigDecimal) value));
                }
            }
            if (values.containsKey("MaterialGroup")) {
                final Object value = values.remove("MaterialGroup");
                if ((value == null)||(!value.equals(getMaterialGroup()))) {
                    setMaterialGroup(((String) value));
                }
            }
            if (values.containsKey("MaterialPricingGroup")) {
                final Object value = values.remove("MaterialPricingGroup");
                if ((value == null)||(!value.equals(getMaterialPricingGroup()))) {
                    setMaterialPricingGroup(((String) value));
                }
            }
            if (values.containsKey("Batch")) {
                final Object value = values.remove("Batch");
                if ((value == null)||(!value.equals(getBatch()))) {
                    setBatch(((String) value));
                }
            }
            if (values.containsKey("ProductionPlant")) {
                final Object value = values.remove("ProductionPlant");
                if ((value == null)||(!value.equals(getProductionPlant()))) {
                    setProductionPlant(((String) value));
                }
            }
            if (values.containsKey("StorageLocation")) {
                final Object value = values.remove("StorageLocation");
                if ((value == null)||(!value.equals(getStorageLocation()))) {
                    setStorageLocation(((String) value));
                }
            }
            if (values.containsKey("DeliveryGroup")) {
                final Object value = values.remove("DeliveryGroup");
                if ((value == null)||(!value.equals(getDeliveryGroup()))) {
                    setDeliveryGroup(((String) value));
                }
            }
            if (values.containsKey("ShippingPoint")) {
                final Object value = values.remove("ShippingPoint");
                if ((value == null)||(!value.equals(getShippingPoint()))) {
                    setShippingPoint(((String) value));
                }
            }
            if (values.containsKey("ShippingType")) {
                final Object value = values.remove("ShippingType");
                if ((value == null)||(!value.equals(getShippingType()))) {
                    setShippingType(((String) value));
                }
            }
            if (values.containsKey("DeliveryPriority")) {
                final Object value = values.remove("DeliveryPriority");
                if ((value == null)||(!value.equals(getDeliveryPriority()))) {
                    setDeliveryPriority(((String) value));
                }
            }
            if (values.containsKey("IncotermsClassification")) {
                final Object value = values.remove("IncotermsClassification");
                if ((value == null)||(!value.equals(getIncotermsClassification()))) {
                    setIncotermsClassification(((String) value));
                }
            }
            if (values.containsKey("IncotermsTransferLocation")) {
                final Object value = values.remove("IncotermsTransferLocation");
                if ((value == null)||(!value.equals(getIncotermsTransferLocation()))) {
                    setIncotermsTransferLocation(((String) value));
                }
            }
            if (values.containsKey("IncotermsLocation1")) {
                final Object value = values.remove("IncotermsLocation1");
                if ((value == null)||(!value.equals(getIncotermsLocation1()))) {
                    setIncotermsLocation1(((String) value));
                }
            }
            if (values.containsKey("IncotermsLocation2")) {
                final Object value = values.remove("IncotermsLocation2");
                if ((value == null)||(!value.equals(getIncotermsLocation2()))) {
                    setIncotermsLocation2(((String) value));
                }
            }
            if (values.containsKey("CustomerPaymentTerms")) {
                final Object value = values.remove("CustomerPaymentTerms");
                if ((value == null)||(!value.equals(getCustomerPaymentTerms()))) {
                    setCustomerPaymentTerms(((String) value));
                }
            }
            if (values.containsKey("SalesDocumentRjcnReason")) {
                final Object value = values.remove("SalesDocumentRjcnReason");
                if ((value == null)||(!value.equals(getSalesDocumentRjcnReason()))) {
                    setSalesDocumentRjcnReason(((String) value));
                }
            }
            if (values.containsKey("ItemBillingBlockReason")) {
                final Object value = values.remove("ItemBillingBlockReason");
                if ((value == null)||(!value.equals(getItemBillingBlockReason()))) {
                    setItemBillingBlockReason(((String) value));
                }
            }
            if (values.containsKey("WBSElement")) {
                final Object value = values.remove("WBSElement");
                if ((value == null)||(!value.equals(getWBSElement()))) {
                    setWBSElement(((String) value));
                }
            }
            if (values.containsKey("ProfitCenter")) {
                final Object value = values.remove("ProfitCenter");
                if ((value == null)||(!value.equals(getProfitCenter()))) {
                    setProfitCenter(((String) value));
                }
            }
            if (values.containsKey("SDProcessStatus")) {
                final Object value = values.remove("SDProcessStatus");
                if ((value == null)||(!value.equals(getSDProcessStatus()))) {
                    setSDProcessStatus(((String) value));
                }
            }
            if (values.containsKey("DeliveryStatus")) {
                final Object value = values.remove("DeliveryStatus");
                if ((value == null)||(!value.equals(getDeliveryStatus()))) {
                    setDeliveryStatus(((String) value));
                }
            }
            if (values.containsKey("OrderRelatedBillingStatus")) {
                final Object value = values.remove("OrderRelatedBillingStatus");
                if ((value == null)||(!value.equals(getOrderRelatedBillingStatus()))) {
                    setOrderRelatedBillingStatus(((String) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
            if ((values).containsKey("to_Partner")) {
                final Object value = (values).remove("to_Partner");
                if (value instanceof Iterable) {
                    if (toPartner == null) {
                        toPartner = Lists.newArrayList();
                    } else {
                        toPartner = Lists.newArrayList(toPartner);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        SalesOrderItemPartner entity;
                        if (toPartner.size()>i) {
                            entity = toPartner.get(i);
                            i = i += 1;
                        } else {
                            entity = new SalesOrderItemPartner();
                            toPartner.add(entity);
                        }
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("to_PricingElement")) {
                final Object value = (values).remove("to_PricingElement");
                if (value instanceof Iterable) {
                    if (toPricingElement == null) {
                        toPricingElement = Lists.newArrayList();
                    } else {
                        toPricingElement = Lists.newArrayList(toPricingElement);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        SalesOrderItemPrElement entity;
                        if (toPricingElement.size()>i) {
                            entity = toPricingElement.get(i);
                            i = i += 1;
                        } else {
                            entity = new SalesOrderItemPrElement();
                            toPricingElement.add(entity);
                        }
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
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
            if ((values).containsKey("to_ScheduleLine")) {
                final Object value = (values).remove("to_ScheduleLine");
                if (value instanceof Iterable) {
                    if (toScheduleLine == null) {
                        toScheduleLine = Lists.newArrayList();
                    } else {
                        toScheduleLine = Lists.newArrayList(toScheduleLine);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        SalesOrderScheduleLine entity;
                        if (toScheduleLine.size()>i) {
                            entity = toScheduleLine.get(i);
                            i = i += 1;
                        } else {
                            entity = new SalesOrderScheduleLine();
                            toScheduleLine.add(entity);
                        }
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("to_Text")) {
                final Object value = (values).remove("to_Text");
                if (value instanceof Iterable) {
                    if (toText == null) {
                        toText = Lists.newArrayList();
                    } else {
                        toText = Lists.newArrayList(toText);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        SalesOrderItemText entity;
                        if (toText.size()>i) {
                            entity = toText.get(i);
                            i = i += 1;
                        } else {
                            entity = new SalesOrderItemText();
                            toText.add(entity);
                        }
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
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
    public static<T >SalesOrderItemField<T> field(final String fieldName, final Class<T> fieldType) {
        return new SalesOrderItemField<T>(fieldName);
    }

    /**
     * Fetches the <b>SalesOrderItemPartner</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_Partner</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>SalesOrderItemPartner</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<SalesOrderItemPartner> fetchPartner()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type SalesOrderItemPartner.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("SalesOrder=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(salesOrder));
        odataResourceUrl.append(",SalesOrderItem=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(salesOrderItem));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_Partner");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getEndpointUrl(), odataResourceUrl.toString());
        final ODataQuery query = builder.build();
        final ErpEndpoint erpEndpoint = new ErpEndpoint(erpConfigContext);
        final ODataQueryResult result = query.execute(erpEndpoint);
        final List<SalesOrderItemPartner> entityList = result.asList(SalesOrderItemPartner.class);
        for (SalesOrderItemPartner entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>SalesOrderItemPartner</b> entities (one to many).
     * <p>
     * If the navigation property <b>to_Partner</b> of a queried <b>SalesOrderItem</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>SalesOrderItemPartner</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<SalesOrderItemPartner> getPartnerOrFetch()
        throws ODataException
    {
        if (toPartner == null) {
            toPartner = fetchPartner();
        }
        return toPartner;
    }

    /**
     * Retrieval of associated <b>SalesOrderItemPartner</b> entities (one to many).
     * <p>
     * If the navigation property <b>to_Partner</b> for an entity <b>SalesOrderItem</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <b>Optional</b> result state will be <i>null</i>.
     * 
     * @return
     *     If the information for navigation property <b>to_Partner</b> is already loaded, the result will contain the <b>SalesOrderItemPartner</b> entities. If not, a <i>null</i> value state is returned.
     */
    public Optional<List<SalesOrderItemPartner>> getPartnerOrNull() {
        return Optional.fromNullable(toPartner);
    }

    /**
     * Overwrites the list of associated <b>SalesOrderItemPartner</b> entities for the loaded navigation property <b>to_Partner</b>.
     * <p>
     * If the navigation property <b>to_Partner</b> of a queried <b>SalesOrderItem</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>SalesOrderItemPartner</b> entities.
     */
    public void setPartner(
        @NonNull
        final List<SalesOrderItemPartner> value) {
        if (toPartner == null) {
            toPartner = Lists.newArrayList();
        }
        toPartner.clear();
        toPartner.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>SalesOrderItemPartner</b> entities.
     * <p>
     * If the navigation property <b>to_Partner</b> of a queried <b>SalesOrderItem</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>SalesOrderItemPartner</b> entities.
     */
    public void addPartner(SalesOrderItemPartner... entity) {
        if (toPartner == null) {
            toPartner = Lists.newArrayList();
        }
        toPartner.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>SalesOrderItemPrElement</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_PricingElement</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>SalesOrderItemPrElement</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<SalesOrderItemPrElement> fetchPricingElement()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type SalesOrderItemPrElement.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("SalesOrder=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(salesOrder));
        odataResourceUrl.append(",SalesOrderItem=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(salesOrderItem));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_PricingElement");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getEndpointUrl(), odataResourceUrl.toString());
        final ODataQuery query = builder.build();
        final ErpEndpoint erpEndpoint = new ErpEndpoint(erpConfigContext);
        final ODataQueryResult result = query.execute(erpEndpoint);
        final List<SalesOrderItemPrElement> entityList = result.asList(SalesOrderItemPrElement.class);
        for (SalesOrderItemPrElement entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>SalesOrderItemPrElement</b> entities (one to many).
     * <p>
     * If the navigation property <b>to_PricingElement</b> of a queried <b>SalesOrderItem</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>SalesOrderItemPrElement</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<SalesOrderItemPrElement> getPricingElementOrFetch()
        throws ODataException
    {
        if (toPricingElement == null) {
            toPricingElement = fetchPricingElement();
        }
        return toPricingElement;
    }

    /**
     * Retrieval of associated <b>SalesOrderItemPrElement</b> entities (one to many).
     * <p>
     * If the navigation property <b>to_PricingElement</b> for an entity <b>SalesOrderItem</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <b>Optional</b> result state will be <i>null</i>.
     * 
     * @return
     *     If the information for navigation property <b>to_PricingElement</b> is already loaded, the result will contain the <b>SalesOrderItemPrElement</b> entities. If not, a <i>null</i> value state is returned.
     */
    public Optional<List<SalesOrderItemPrElement>> getPricingElementOrNull() {
        return Optional.fromNullable(toPricingElement);
    }

    /**
     * Overwrites the list of associated <b>SalesOrderItemPrElement</b> entities for the loaded navigation property <b>to_PricingElement</b>.
     * <p>
     * If the navigation property <b>to_PricingElement</b> of a queried <b>SalesOrderItem</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>SalesOrderItemPrElement</b> entities.
     */
    public void setPricingElement(
        @NonNull
        final List<SalesOrderItemPrElement> value) {
        if (toPricingElement == null) {
            toPricingElement = Lists.newArrayList();
        }
        toPricingElement.clear();
        toPricingElement.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>SalesOrderItemPrElement</b> entities.
     * <p>
     * If the navigation property <b>to_PricingElement</b> of a queried <b>SalesOrderItem</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>SalesOrderItemPrElement</b> entities.
     */
    public void addPricingElement(SalesOrderItemPrElement... entity) {
        if (toPricingElement == null) {
            toPricingElement = Lists.newArrayList();
        }
        toPricingElement.addAll(Lists.newArrayList(entity));
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
     * If the navigation property <b>to_SalesOrder</b> of a queried <b>SalesOrderItem</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
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
     * If the navigation property <b>to_SalesOrder</b> for an entity <b>SalesOrderItem</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <b>Optional</b> result state will be <i>null</i>.
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
     * Fetches the <b>SalesOrderScheduleLine</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_ScheduleLine</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>SalesOrderScheduleLine</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<SalesOrderScheduleLine> fetchScheduleLine()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type SalesOrderScheduleLine.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("SalesOrder=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(salesOrder));
        odataResourceUrl.append(",SalesOrderItem=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(salesOrderItem));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_ScheduleLine");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getEndpointUrl(), odataResourceUrl.toString());
        final ODataQuery query = builder.build();
        final ErpEndpoint erpEndpoint = new ErpEndpoint(erpConfigContext);
        final ODataQueryResult result = query.execute(erpEndpoint);
        final List<SalesOrderScheduleLine> entityList = result.asList(SalesOrderScheduleLine.class);
        for (SalesOrderScheduleLine entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>SalesOrderScheduleLine</b> entities (one to many).
     * <p>
     * If the navigation property <b>to_ScheduleLine</b> of a queried <b>SalesOrderItem</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>SalesOrderScheduleLine</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<SalesOrderScheduleLine> getScheduleLineOrFetch()
        throws ODataException
    {
        if (toScheduleLine == null) {
            toScheduleLine = fetchScheduleLine();
        }
        return toScheduleLine;
    }

    /**
     * Retrieval of associated <b>SalesOrderScheduleLine</b> entities (one to many).
     * <p>
     * If the navigation property <b>to_ScheduleLine</b> for an entity <b>SalesOrderItem</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <b>Optional</b> result state will be <i>null</i>.
     * 
     * @return
     *     If the information for navigation property <b>to_ScheduleLine</b> is already loaded, the result will contain the <b>SalesOrderScheduleLine</b> entities. If not, a <i>null</i> value state is returned.
     */
    public Optional<List<SalesOrderScheduleLine>> getScheduleLineOrNull() {
        return Optional.fromNullable(toScheduleLine);
    }

    /**
     * Overwrites the list of associated <b>SalesOrderScheduleLine</b> entities for the loaded navigation property <b>to_ScheduleLine</b>.
     * <p>
     * If the navigation property <b>to_ScheduleLine</b> of a queried <b>SalesOrderItem</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>SalesOrderScheduleLine</b> entities.
     */
    public void setScheduleLine(
        @NonNull
        final List<SalesOrderScheduleLine> value) {
        if (toScheduleLine == null) {
            toScheduleLine = Lists.newArrayList();
        }
        toScheduleLine.clear();
        toScheduleLine.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>SalesOrderScheduleLine</b> entities.
     * <p>
     * If the navigation property <b>to_ScheduleLine</b> of a queried <b>SalesOrderItem</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>SalesOrderScheduleLine</b> entities.
     */
    public void addScheduleLine(SalesOrderScheduleLine... entity) {
        if (toScheduleLine == null) {
            toScheduleLine = Lists.newArrayList();
        }
        toScheduleLine.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>SalesOrderItemText</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_Text</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>SalesOrderItemText</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<SalesOrderItemText> fetchText()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type SalesOrderItemText.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("SalesOrder=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(salesOrder));
        odataResourceUrl.append(",SalesOrderItem=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(salesOrderItem));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_Text");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getEndpointUrl(), odataResourceUrl.toString());
        final ODataQuery query = builder.build();
        final ErpEndpoint erpEndpoint = new ErpEndpoint(erpConfigContext);
        final ODataQueryResult result = query.execute(erpEndpoint);
        final List<SalesOrderItemText> entityList = result.asList(SalesOrderItemText.class);
        for (SalesOrderItemText entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>SalesOrderItemText</b> entities (one to many).
     * <p>
     * If the navigation property <b>to_Text</b> of a queried <b>SalesOrderItem</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>SalesOrderItemText</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<SalesOrderItemText> getTextOrFetch()
        throws ODataException
    {
        if (toText == null) {
            toText = fetchText();
        }
        return toText;
    }

    /**
     * Retrieval of associated <b>SalesOrderItemText</b> entities (one to many).
     * <p>
     * If the navigation property <b>to_Text</b> for an entity <b>SalesOrderItem</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <b>Optional</b> result state will be <i>null</i>.
     * 
     * @return
     *     If the information for navigation property <b>to_Text</b> is already loaded, the result will contain the <b>SalesOrderItemText</b> entities. If not, a <i>null</i> value state is returned.
     */
    public Optional<List<SalesOrderItemText>> getTextOrNull() {
        return Optional.fromNullable(toText);
    }

    /**
     * Overwrites the list of associated <b>SalesOrderItemText</b> entities for the loaded navigation property <b>to_Text</b>.
     * <p>
     * If the navigation property <b>to_Text</b> of a queried <b>SalesOrderItem</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>SalesOrderItemText</b> entities.
     */
    public void setText(
        @NonNull
        final List<SalesOrderItemText> value) {
        if (toText == null) {
            toText = Lists.newArrayList();
        }
        toText.clear();
        toText.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>SalesOrderItemText</b> entities.
     * <p>
     * If the navigation property <b>to_Text</b> of a queried <b>SalesOrderItem</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>SalesOrderItemText</b> entities.
     */
    public void addText(SalesOrderItemText... entity) {
        if (toText == null) {
            toText = Lists.newArrayList();
        }
        toText.addAll(Lists.newArrayList(entity));
    }

    public final static class SalesOrderItemBuilder {

        private List<SalesOrderItemPartner> toPartner = Lists.newArrayList();
        private List<SalesOrderItemPrElement> toPricingElement = Lists.newArrayList();
        private SalesOrder toSalesOrder;
        private String salesOrder = null;
        private List<SalesOrderScheduleLine> toScheduleLine = Lists.newArrayList();
        private List<SalesOrderItemText> toText = Lists.newArrayList();

        private SalesOrderItem.SalesOrderItemBuilder toPartner(List<SalesOrderItemPartner> value) {
            toPartner.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_Partner</b> for <b>SalesOrderItem</b> to multiple <b>SalesOrderItemPartner</b>.
         * 
         */
        public SalesOrderItem.SalesOrderItemBuilder partner(SalesOrderItemPartner... value) {
            return toPartner(Lists.newArrayList(value));
        }

        private SalesOrderItem.SalesOrderItemBuilder toPricingElement(List<SalesOrderItemPrElement> value) {
            toPricingElement.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_PricingElement</b> for <b>SalesOrderItem</b> to multiple <b>SalesOrderItemPrElement</b>.
         * 
         */
        public SalesOrderItem.SalesOrderItemBuilder pricingElement(SalesOrderItemPrElement... value) {
            return toPricingElement(Lists.newArrayList(value));
        }

        private SalesOrderItem.SalesOrderItemBuilder toSalesOrder(SalesOrder value) {
            toSalesOrder = value;
            return this;
        }

        /**
         * Navigation property <b>to_SalesOrder</b> for <b>SalesOrderItem</b> to single <b>SalesOrder</b>.
         * 
         */
        public SalesOrderItem.SalesOrderItemBuilder salesOrder(final SalesOrder value) {
            return toSalesOrder(value);
        }

        /**
         * (Key Field) Constraints: Not nullable, Maximum length: 10
         * 
         */
        public SalesOrderItem.SalesOrderItemBuilder salesOrder(final String value) {
            salesOrder = value;
            return this;
        }

        private SalesOrderItem.SalesOrderItemBuilder toScheduleLine(List<SalesOrderScheduleLine> value) {
            toScheduleLine.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_ScheduleLine</b> for <b>SalesOrderItem</b> to multiple <b>SalesOrderScheduleLine</b>.
         * 
         */
        public SalesOrderItem.SalesOrderItemBuilder scheduleLine(SalesOrderScheduleLine... value) {
            return toScheduleLine(Lists.newArrayList(value));
        }

        private SalesOrderItem.SalesOrderItemBuilder toText(List<SalesOrderItemText> value) {
            toText.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_Text</b> for <b>SalesOrderItem</b> to multiple <b>SalesOrderItemText</b>.
         * 
         */
        public SalesOrderItem.SalesOrderItemBuilder text(SalesOrderItemText... value) {
            return toText(Lists.newArrayList(value));
        }

    }

}
