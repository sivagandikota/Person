
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
 * Sales Order API<p></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class SalesOrder
    extends VdmEntity<SalesOrder>
{

    /**
     * Selector for all available fields of SalesOrder.
     * 
     */
    public final static SalesOrderSelectable ALL_FIELDS = new SalesOrderSelectable() {


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
    public final static SalesOrderField<String> SALES_ORDER = new SalesOrderField<String>("SalesOrder");
    /**
     * Constraints: Not nullable, Maximum length: 4
     * 
     * @param salesOrderType
     *     
     * @return
     *     Sales Document Type
     */
    @SerializedName("SalesOrderType")
    @JsonProperty("SalesOrderType")
    @Nullable
    private String salesOrderType;
    /**
     * Use with available fluent helpers to apply the <b>SalesOrderType</b> field to query operations.
     * 
     */
    public final static SalesOrderField<String> SALES_ORDER_TYPE = new SalesOrderField<String>("SalesOrderType");
    /**
     * Constraints: Not nullable, Maximum length: 4
     * 
     * @param salesOrganization
     *     
     * @return
     *     Sales Organization
     */
    @SerializedName("SalesOrganization")
    @JsonProperty("SalesOrganization")
    @Nullable
    private String salesOrganization;
    /**
     * Use with available fluent helpers to apply the <b>SalesOrganization</b> field to query operations.
     * 
     */
    public final static SalesOrderField<String> SALES_ORGANIZATION = new SalesOrderField<String>("SalesOrganization");
    /**
     * Constraints: Not nullable, Maximum length: 2
     * 
     * @param distributionChannel
     *     
     * @return
     *     Distribution Channel
     */
    @SerializedName("DistributionChannel")
    @JsonProperty("DistributionChannel")
    @Nullable
    private String distributionChannel;
    /**
     * Use with available fluent helpers to apply the <b>DistributionChannel</b> field to query operations.
     * 
     */
    public final static SalesOrderField<String> DISTRIBUTION_CHANNEL = new SalesOrderField<String>("DistributionChannel");
    /**
     * Constraints: Not nullable, Maximum length: 2
     * 
     * @param organizationDivision
     *     
     * @return
     *     Division
     */
    @SerializedName("OrganizationDivision")
    @JsonProperty("OrganizationDivision")
    @Nullable
    private String organizationDivision;
    /**
     * Use with available fluent helpers to apply the <b>OrganizationDivision</b> field to query operations.
     * 
     */
    public final static SalesOrderField<String> ORGANIZATION_DIVISION = new SalesOrderField<String>("OrganizationDivision");
    /**
     * Constraints: Not nullable, Maximum length: 3
     * 
     * @param salesGroup
     *     
     * @return
     *     Sales Group
     */
    @SerializedName("SalesGroup")
    @JsonProperty("SalesGroup")
    @Nullable
    private String salesGroup;
    /**
     * Use with available fluent helpers to apply the <b>SalesGroup</b> field to query operations.
     * 
     */
    public final static SalesOrderField<String> SALES_GROUP = new SalesOrderField<String>("SalesGroup");
    /**
     * Constraints: Not nullable, Maximum length: 4
     * 
     * @param salesOffice
     *     
     * @return
     *     Sales Office
     */
    @SerializedName("SalesOffice")
    @JsonProperty("SalesOffice")
    @Nullable
    private String salesOffice;
    /**
     * Use with available fluent helpers to apply the <b>SalesOffice</b> field to query operations.
     * 
     */
    public final static SalesOrderField<String> SALES_OFFICE = new SalesOrderField<String>("SalesOffice");
    /**
     * Constraints: Not nullable, Maximum length: 6
     * 
     * @param salesDistrict
     *     
     * @return
     *     Sales District
     */
    @SerializedName("SalesDistrict")
    @JsonProperty("SalesDistrict")
    @Nullable
    private String salesDistrict;
    /**
     * Use with available fluent helpers to apply the <b>SalesDistrict</b> field to query operations.
     * 
     */
    public final static SalesOrderField<String> SALES_DISTRICT = new SalesOrderField<String>("SalesDistrict");
    /**
     * Constraints: Not nullable, Maximum length: 10
     * 
     * @param soldToParty
     *     
     * @return
     *     Sold To Party
     */
    @SerializedName("SoldToParty")
    @JsonProperty("SoldToParty")
    @Nullable
    private String soldToParty;
    /**
     * Use with available fluent helpers to apply the <b>SoldToParty</b> field to query operations.
     * 
     */
    public final static SalesOrderField<String> SOLD_TO_PARTY = new SalesOrderField<String>("SoldToParty");
    /**
     * Constraints: Not nullable, Precision: 0
     * 
     * @param creationDate
     *     
     * @return
     *     Date on Which Record Was Created
     */
    @SerializedName("CreationDate")
    @JsonProperty("CreationDate")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataDateTimeAdapter.class)
    private Calendar creationDate;
    /**
     * Use with available fluent helpers to apply the <b>CreationDate</b> field to query operations.
     * 
     */
    public final static SalesOrderField<Calendar> CREATION_DATE = new SalesOrderField<Calendar>("CreationDate");
    /**
     * Constraints: Not nullable, Maximum length: 12
     * 
     * @param createdByUser
     *     
     * @return
     *     Name of Person Who Created Object
     */
    @SerializedName("CreatedByUser")
    @JsonProperty("CreatedByUser")
    @Nullable
    private String createdByUser;
    /**
     * Use with available fluent helpers to apply the <b>CreatedByUser</b> field to query operations.
     * 
     */
    public final static SalesOrderField<String> CREATED_BY_USER = new SalesOrderField<String>("CreatedByUser");
    /**
     * Constraints: Not nullable, Precision: 0
     * 
     * @param lastChangeDate
     *     
     * @return
     *     Date of Last Change
     */
    @SerializedName("LastChangeDate")
    @JsonProperty("LastChangeDate")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataDateTimeAdapter.class)
    private Calendar lastChangeDate;
    /**
     * Use with available fluent helpers to apply the <b>LastChangeDate</b> field to query operations.
     * 
     */
    public final static SalesOrderField<Calendar> LAST_CHANGE_DATE = new SalesOrderField<Calendar>("LastChangeDate");
    /**
     * Constraints: Not nullable, Precision: 7
     * 
     * @param lastChangeDateTime
     *     
     * @return
     *     UTC Time Stamp in Long Form (YYYYMMDDhhmmssmmmuuun)
     */
    @SerializedName("LastChangeDateTime")
    @JsonProperty("LastChangeDateTime")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataDateTimeOffsetAdapter.class)
    private Calendar lastChangeDateTime;
    /**
     * Use with available fluent helpers to apply the <b>LastChangeDateTime</b> field to query operations.
     * 
     */
    public final static SalesOrderField<Calendar> LAST_CHANGE_DATE_TIME = new SalesOrderField<Calendar>("LastChangeDateTime");
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
    public final static SalesOrderField<String> PURCHASE_ORDER_BY_CUSTOMER = new SalesOrderField<String>("PurchaseOrderByCustomer");
    /**
     * Constraints: Not nullable, Maximum length: 4
     * 
     * @param customerPurchaseOrderType
     *     
     * @return
     *     Customer Purchase Order Type
     */
    @SerializedName("CustomerPurchaseOrderType")
    @JsonProperty("CustomerPurchaseOrderType")
    @Nullable
    private String customerPurchaseOrderType;
    /**
     * Use with available fluent helpers to apply the <b>CustomerPurchaseOrderType</b> field to query operations.
     * 
     */
    public final static SalesOrderField<String> CUSTOMER_PURCHASE_ORDER_TYPE = new SalesOrderField<String>("CustomerPurchaseOrderType");
    /**
     * Constraints: Not nullable, Precision: 0
     * 
     * @param customerPurchaseOrderDate
     *     
     * @return
     *     Customer Reference Date
     */
    @SerializedName("CustomerPurchaseOrderDate")
    @JsonProperty("CustomerPurchaseOrderDate")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataDateTimeAdapter.class)
    private Calendar customerPurchaseOrderDate;
    /**
     * Use with available fluent helpers to apply the <b>CustomerPurchaseOrderDate</b> field to query operations.
     * 
     */
    public final static SalesOrderField<Calendar> CUSTOMER_PURCHASE_ORDER_DATE = new SalesOrderField<Calendar>("CustomerPurchaseOrderDate");
    /**
     * Constraints: Not nullable, Precision: 0
     * 
     * @param salesOrderDate
     *     
     * @return
     *     Document Date (Date Received/Sent)
     */
    @SerializedName("SalesOrderDate")
    @JsonProperty("SalesOrderDate")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataDateTimeAdapter.class)
    private Calendar salesOrderDate;
    /**
     * Use with available fluent helpers to apply the <b>SalesOrderDate</b> field to query operations.
     * 
     */
    public final static SalesOrderField<Calendar> SALES_ORDER_DATE = new SalesOrderField<Calendar>("SalesOrderDate");
    /**
     * Constraints: Not nullable, Precision: 16, Scale: 3
     * 
     * @param totalNetAmount
     *     
     * @return
     *     Net Value of the Sales Order in Document Currency
     */
    @SerializedName("TotalNetAmount")
    @JsonProperty("TotalNetAmount")
    @Nullable
    private BigDecimal totalNetAmount;
    /**
     * Use with available fluent helpers to apply the <b>TotalNetAmount</b> field to query operations.
     * 
     */
    public final static SalesOrderField<BigDecimal> TOTAL_NET_AMOUNT = new SalesOrderField<BigDecimal>("TotalNetAmount");
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
    public final static SalesOrderField<String> TRANSACTION_CURRENCY = new SalesOrderField<String>("TransactionCurrency");
    /**
     * Constraints: Not nullable, Maximum length: 3
     * 
     * @param sDDocumentReason
     *     
     * @return
     *     Order Reason (Reason for the Business Transaction)
     */
    @SerializedName("SDDocumentReason")
    @JsonProperty("SDDocumentReason")
    @Nullable
    private String sDDocumentReason;
    /**
     * Use with available fluent helpers to apply the <b>SDDocumentReason</b> field to query operations.
     * 
     */
    public final static SalesOrderField<String> SD_DOCUMENT_REASON = new SalesOrderField<String>("SDDocumentReason");
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
    public final static SalesOrderField<Calendar> PRICING_DATE = new SalesOrderField<Calendar>("PricingDate");
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
    public final static SalesOrderField<Calendar> REQUESTED_DELIVERY_DATE = new SalesOrderField<Calendar>("RequestedDeliveryDate");
    /**
     * Constraints: Not nullable, Maximum length: 2
     * 
     * @param shippingCondition
     *     
     * @return
     *     Shipping Conditions
     */
    @SerializedName("ShippingCondition")
    @JsonProperty("ShippingCondition")
    @Nullable
    private String shippingCondition;
    /**
     * Use with available fluent helpers to apply the <b>ShippingCondition</b> field to query operations.
     * 
     */
    public final static SalesOrderField<String> SHIPPING_CONDITION = new SalesOrderField<String>("ShippingCondition");
    /**
     * Constraints: none
     * 
     * @param completeDeliveryIsDefined
     *     
     * @return
     *     Complete Delivery Defined for Each Sales Order?
     */
    @SerializedName("CompleteDeliveryIsDefined")
    @JsonProperty("CompleteDeliveryIsDefined")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    private Boolean completeDeliveryIsDefined;
    /**
     * Use with available fluent helpers to apply the <b>CompleteDeliveryIsDefined</b> field to query operations.
     * 
     */
    public final static SalesOrderField<Boolean> COMPLETE_DELIVERY_IS_DEFINED = new SalesOrderField<Boolean>("CompleteDeliveryIsDefined");
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
    public final static SalesOrderField<String> SHIPPING_TYPE = new SalesOrderField<String>("ShippingType");
    /**
     * Constraints: Not nullable, Maximum length: 2
     * 
     * @param headerBillingBlockReason
     *     
     * @return
     *     Billing Block in SD Document
     */
    @SerializedName("HeaderBillingBlockReason")
    @JsonProperty("HeaderBillingBlockReason")
    @Nullable
    private String headerBillingBlockReason;
    /**
     * Use with available fluent helpers to apply the <b>HeaderBillingBlockReason</b> field to query operations.
     * 
     */
    public final static SalesOrderField<String> HEADER_BILLING_BLOCK_REASON = new SalesOrderField<String>("HeaderBillingBlockReason");
    /**
     * Constraints: Not nullable, Maximum length: 2
     * 
     * @param deliveryBlockReason
     *     
     * @return
     *     Delivery Block (Document Header)
     */
    @SerializedName("DeliveryBlockReason")
    @JsonProperty("DeliveryBlockReason")
    @Nullable
    private String deliveryBlockReason;
    /**
     * Use with available fluent helpers to apply the <b>DeliveryBlockReason</b> field to query operations.
     * 
     */
    public final static SalesOrderField<String> DELIVERY_BLOCK_REASON = new SalesOrderField<String>("DeliveryBlockReason");
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
    public final static SalesOrderField<String> INCOTERMS_CLASSIFICATION = new SalesOrderField<String>("IncotermsClassification");
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
    public final static SalesOrderField<String> INCOTERMS_TRANSFER_LOCATION = new SalesOrderField<String>("IncotermsTransferLocation");
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
    public final static SalesOrderField<String> INCOTERMS_LOCATION1 = new SalesOrderField<String>("IncotermsLocation1");
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
    public final static SalesOrderField<String> INCOTERMS_LOCATION2 = new SalesOrderField<String>("IncotermsLocation2");
    /**
     * Constraints: Not nullable, Maximum length: 4
     * 
     * @param incotermsVersion
     *     
     * @return
     *     Incoterms Version
     */
    @SerializedName("IncotermsVersion")
    @JsonProperty("IncotermsVersion")
    @Nullable
    private String incotermsVersion;
    /**
     * Use with available fluent helpers to apply the <b>IncotermsVersion</b> field to query operations.
     * 
     */
    public final static SalesOrderField<String> INCOTERMS_VERSION = new SalesOrderField<String>("IncotermsVersion");
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
    public final static SalesOrderField<String> CUSTOMER_PAYMENT_TERMS = new SalesOrderField<String>("CustomerPaymentTerms");
    /**
     * Constraints: Not nullable, Maximum length: 1
     * 
     * @param paymentMethod
     *     
     * @return
     *     Payment Method
     */
    @SerializedName("PaymentMethod")
    @JsonProperty("PaymentMethod")
    @Nullable
    private String paymentMethod;
    /**
     * Use with available fluent helpers to apply the <b>PaymentMethod</b> field to query operations.
     * 
     */
    public final static SalesOrderField<String> PAYMENT_METHOD = new SalesOrderField<String>("PaymentMethod");
    /**
     * Constraints: Not nullable, Maximum length: 18
     * 
     * @param assignmentReference
     *     
     * @return
     *     Assignment number
     */
    @SerializedName("AssignmentReference")
    @JsonProperty("AssignmentReference")
    @Nullable
    private String assignmentReference;
    /**
     * Use with available fluent helpers to apply the <b>AssignmentReference</b> field to query operations.
     * 
     */
    public final static SalesOrderField<String> ASSIGNMENT_REFERENCE = new SalesOrderField<String>("AssignmentReference");
    /**
     * Constraints: Not nullable, Maximum length: 1
     * 
     * @param overallSDProcessStatus
     *     
     * @return
     *     Overall Processing Status of Document
     */
    @SerializedName("OverallSDProcessStatus")
    @JsonProperty("OverallSDProcessStatus")
    @Nullable
    private String overallSDProcessStatus;
    /**
     * Use with available fluent helpers to apply the <b>OverallSDProcessStatus</b> field to query operations.
     * 
     */
    public final static SalesOrderField<String> OVERALL_SD_PROCESS_STATUS = new SalesOrderField<String>("OverallSDProcessStatus");
    /**
     * Constraints: Not nullable, Maximum length: 1
     * 
     * @param totalCreditCheckStatus
     *     
     * @return
     *     Overall Status of Credit Checks
     */
    @SerializedName("TotalCreditCheckStatus")
    @JsonProperty("TotalCreditCheckStatus")
    @Nullable
    private String totalCreditCheckStatus;
    /**
     * Use with available fluent helpers to apply the <b>TotalCreditCheckStatus</b> field to query operations.
     * 
     */
    public final static SalesOrderField<String> TOTAL_CREDIT_CHECK_STATUS = new SalesOrderField<String>("TotalCreditCheckStatus");
    /**
     * Constraints: Not nullable, Maximum length: 1
     * 
     * @param overallTotalDeliveryStatus
     *     
     * @return
     *     Overall Delivery Status for all Items
     */
    @SerializedName("OverallTotalDeliveryStatus")
    @JsonProperty("OverallTotalDeliveryStatus")
    @Nullable
    private String overallTotalDeliveryStatus;
    /**
     * Use with available fluent helpers to apply the <b>OverallTotalDeliveryStatus</b> field to query operations.
     * 
     */
    public final static SalesOrderField<String> OVERALL_TOTAL_DELIVERY_STATUS = new SalesOrderField<String>("OverallTotalDeliveryStatus");
    /**
     * Constraints: Not nullable, Maximum length: 1
     * 
     * @param overallSDDocumentRejectionSts
     *     
     * @return
     *     Overall Rejection Status of All Document Items
     */
    @SerializedName("OverallSDDocumentRejectionSts")
    @JsonProperty("OverallSDDocumentRejectionSts")
    @Nullable
    private String overallSDDocumentRejectionSts;
    /**
     * Use with available fluent helpers to apply the <b>OverallSDDocumentRejectionSts</b> field to query operations.
     * 
     */
    public final static SalesOrderField<String> OVERALL_SD_DOCUMENT_REJECTION_STS = new SalesOrderField<String>("OverallSDDocumentRejectionSts");
    /**
     * Constraints: Not nullable, Maximum length: 20
     * 
     * @param yY1_box_SDH
     *     
     * @return
     *     box
     */
    @SerializedName("YY1_box_SDH")
    @JsonProperty("YY1_box_SDH")
    @Nullable
    private String yY1_box_SDH;
    /**
     * Use with available fluent helpers to apply the <b>YY1_box_SDH</b> field to query operations.
     * 
     */
    public final static SalesOrderField<String> Y_Y1_BOX_SDH = new SalesOrderField<String>("YY1_box_SDH");
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
     * Navigation property <b>to_Item</b> for <b>SalesOrder</b> to multiple <b>SalesOrderItem</b>.
     * 
     */
    @SerializedName("to_Item")
    @JsonProperty("to_Item")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<SalesOrderItem> toItem;
    /**
     * Use with available fluent helpers to apply the <b>to_Item</b> navigation property to query operations.
     * 
     */
    public final static SalesOrderLink<SalesOrderItem> TO_ITEM = new SalesOrderLink<SalesOrderItem>("to_Item");
    /**
     * Navigation property <b>to_Partner</b> for <b>SalesOrder</b> to multiple <b>SalesOrderHeaderPartner</b>.
     * 
     */
    @SerializedName("to_Partner")
    @JsonProperty("to_Partner")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<SalesOrderHeaderPartner> toPartner;
    /**
     * Use with available fluent helpers to apply the <b>to_Partner</b> navigation property to query operations.
     * 
     */
    public final static SalesOrderLink<SalesOrderHeaderPartner> TO_PARTNER = new SalesOrderLink<SalesOrderHeaderPartner>("to_Partner");
    /**
     * Navigation property <b>to_PaymentPlanItemDetails</b> for <b>SalesOrder</b> to multiple <b>SlsOrdPaymentPlanItemDetails</b>.
     * 
     */
    @SerializedName("to_PaymentPlanItemDetails")
    @JsonProperty("to_PaymentPlanItemDetails")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<SlsOrdPaymentPlanItemDetails> toPaymentPlanItemDetails;
    /**
     * Use with available fluent helpers to apply the <b>to_PaymentPlanItemDetails</b> navigation property to query operations.
     * 
     */
    public final static SalesOrderLink<SlsOrdPaymentPlanItemDetails> TO_PAYMENT_PLAN_ITEM_DETAILS = new SalesOrderLink<SlsOrdPaymentPlanItemDetails>("to_PaymentPlanItemDetails");
    /**
     * Navigation property <b>to_PricingElement</b> for <b>SalesOrder</b> to multiple <b>SalesOrderHeaderPrElement</b>.
     * 
     */
    @SerializedName("to_PricingElement")
    @JsonProperty("to_PricingElement")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<SalesOrderHeaderPrElement> toPricingElement;
    /**
     * Use with available fluent helpers to apply the <b>to_PricingElement</b> navigation property to query operations.
     * 
     */
    public final static SalesOrderLink<SalesOrderHeaderPrElement> TO_PRICING_ELEMENT = new SalesOrderLink<SalesOrderHeaderPrElement>("to_PricingElement");
    /**
     * Navigation property <b>to_Text</b> for <b>SalesOrder</b> to multiple <b>SalesOrderText</b>.
     * 
     */
    @SerializedName("to_Text")
    @JsonProperty("to_Text")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<SalesOrderText> toText;
    /**
     * Use with available fluent helpers to apply the <b>to_Text</b> navigation property to query operations.
     * 
     */
    public final static SalesOrderLink<SalesOrderText> TO_TEXT = new SalesOrderLink<SalesOrderText>("to_Text");

    /**
     * {@inheritDoc}
     * 
     */
    @Override
    public Class<SalesOrder> getType() {
        return SalesOrder.class;
    }

    @Override
    protected String getEndpointUrl() {
        return "/sap/opu/odata/sap/API_SALES_ORDER_SRV";
    }

    @Override
    protected String getEntityCollection() {
        return "A_SalesOrder";
    }

    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("SalesOrder", getSalesOrder());
        return result;
    }

    @Override
    protected Map<String, Object> toMap() {
        final Map<String, Object> values = super.toMap();
        values.put("SalesOrder", getSalesOrder());
        values.put("SalesOrderType", getSalesOrderType());
        values.put("SalesOrganization", getSalesOrganization());
        values.put("DistributionChannel", getDistributionChannel());
        values.put("OrganizationDivision", getOrganizationDivision());
        values.put("SalesGroup", getSalesGroup());
        values.put("SalesOffice", getSalesOffice());
        values.put("SalesDistrict", getSalesDistrict());
        values.put("SoldToParty", getSoldToParty());
        values.put("CreationDate", getCreationDate());
        values.put("CreatedByUser", getCreatedByUser());
        values.put("LastChangeDate", getLastChangeDate());
        values.put("LastChangeDateTime", getLastChangeDateTime());
        values.put("PurchaseOrderByCustomer", getPurchaseOrderByCustomer());
        values.put("CustomerPurchaseOrderType", getCustomerPurchaseOrderType());
        values.put("CustomerPurchaseOrderDate", getCustomerPurchaseOrderDate());
        values.put("SalesOrderDate", getSalesOrderDate());
        values.put("TotalNetAmount", getTotalNetAmount());
        values.put("TransactionCurrency", getTransactionCurrency());
        values.put("SDDocumentReason", getSDDocumentReason());
        values.put("PricingDate", getPricingDate());
        values.put("RequestedDeliveryDate", getRequestedDeliveryDate());
        values.put("ShippingCondition", getShippingCondition());
        values.put("CompleteDeliveryIsDefined", getCompleteDeliveryIsDefined());
        values.put("ShippingType", getShippingType());
        values.put("HeaderBillingBlockReason", getHeaderBillingBlockReason());
        values.put("DeliveryBlockReason", getDeliveryBlockReason());
        values.put("IncotermsClassification", getIncotermsClassification());
        values.put("IncotermsTransferLocation", getIncotermsTransferLocation());
        values.put("IncotermsLocation1", getIncotermsLocation1());
        values.put("IncotermsLocation2", getIncotermsLocation2());
        values.put("IncotermsVersion", getIncotermsVersion());
        values.put("CustomerPaymentTerms", getCustomerPaymentTerms());
        values.put("PaymentMethod", getPaymentMethod());
        values.put("AssignmentReference", getAssignmentReference());
        values.put("OverallSDProcessStatus", getOverallSDProcessStatus());
        values.put("TotalCreditCheckStatus", getTotalCreditCheckStatus());
        values.put("OverallTotalDeliveryStatus", getOverallTotalDeliveryStatus());
        values.put("OverallSDDocumentRejectionSts", getOverallSDDocumentRejectionSts());
        values.put("YY1_box_SDH", getYY1_box_SDH());
        // navigation properties
        if (toItem!= null) {
            (values).put("to_Item", toItem);
        }
        if (toPartner!= null) {
            (values).put("to_Partner", toPartner);
        }
        if (toPaymentPlanItemDetails!= null) {
            (values).put("to_PaymentPlanItemDetails", toPaymentPlanItemDetails);
        }
        if (toPricingElement!= null) {
            (values).put("to_PricingElement", toPricingElement);
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
            if (values.containsKey("SalesOrderType")) {
                final Object value = values.remove("SalesOrderType");
                if ((value == null)||(!value.equals(getSalesOrderType()))) {
                    setSalesOrderType(((String) value));
                }
            }
            if (values.containsKey("SalesOrganization")) {
                final Object value = values.remove("SalesOrganization");
                if ((value == null)||(!value.equals(getSalesOrganization()))) {
                    setSalesOrganization(((String) value));
                }
            }
            if (values.containsKey("DistributionChannel")) {
                final Object value = values.remove("DistributionChannel");
                if ((value == null)||(!value.equals(getDistributionChannel()))) {
                    setDistributionChannel(((String) value));
                }
            }
            if (values.containsKey("OrganizationDivision")) {
                final Object value = values.remove("OrganizationDivision");
                if ((value == null)||(!value.equals(getOrganizationDivision()))) {
                    setOrganizationDivision(((String) value));
                }
            }
            if (values.containsKey("SalesGroup")) {
                final Object value = values.remove("SalesGroup");
                if ((value == null)||(!value.equals(getSalesGroup()))) {
                    setSalesGroup(((String) value));
                }
            }
            if (values.containsKey("SalesOffice")) {
                final Object value = values.remove("SalesOffice");
                if ((value == null)||(!value.equals(getSalesOffice()))) {
                    setSalesOffice(((String) value));
                }
            }
            if (values.containsKey("SalesDistrict")) {
                final Object value = values.remove("SalesDistrict");
                if ((value == null)||(!value.equals(getSalesDistrict()))) {
                    setSalesDistrict(((String) value));
                }
            }
            if (values.containsKey("SoldToParty")) {
                final Object value = values.remove("SoldToParty");
                if ((value == null)||(!value.equals(getSoldToParty()))) {
                    setSoldToParty(((String) value));
                }
            }
            if (values.containsKey("CreationDate")) {
                final Object value = values.remove("CreationDate");
                if ((value == null)||(!value.equals(getCreationDate()))) {
                    setCreationDate(((Calendar) value));
                }
            }
            if (values.containsKey("CreatedByUser")) {
                final Object value = values.remove("CreatedByUser");
                if ((value == null)||(!value.equals(getCreatedByUser()))) {
                    setCreatedByUser(((String) value));
                }
            }
            if (values.containsKey("LastChangeDate")) {
                final Object value = values.remove("LastChangeDate");
                if ((value == null)||(!value.equals(getLastChangeDate()))) {
                    setLastChangeDate(((Calendar) value));
                }
            }
            if (values.containsKey("LastChangeDateTime")) {
                final Object value = values.remove("LastChangeDateTime");
                if ((value == null)||(!value.equals(getLastChangeDateTime()))) {
                    setLastChangeDateTime(((Calendar) value));
                }
            }
            if (values.containsKey("PurchaseOrderByCustomer")) {
                final Object value = values.remove("PurchaseOrderByCustomer");
                if ((value == null)||(!value.equals(getPurchaseOrderByCustomer()))) {
                    setPurchaseOrderByCustomer(((String) value));
                }
            }
            if (values.containsKey("CustomerPurchaseOrderType")) {
                final Object value = values.remove("CustomerPurchaseOrderType");
                if ((value == null)||(!value.equals(getCustomerPurchaseOrderType()))) {
                    setCustomerPurchaseOrderType(((String) value));
                }
            }
            if (values.containsKey("CustomerPurchaseOrderDate")) {
                final Object value = values.remove("CustomerPurchaseOrderDate");
                if ((value == null)||(!value.equals(getCustomerPurchaseOrderDate()))) {
                    setCustomerPurchaseOrderDate(((Calendar) value));
                }
            }
            if (values.containsKey("SalesOrderDate")) {
                final Object value = values.remove("SalesOrderDate");
                if ((value == null)||(!value.equals(getSalesOrderDate()))) {
                    setSalesOrderDate(((Calendar) value));
                }
            }
            if (values.containsKey("TotalNetAmount")) {
                final Object value = values.remove("TotalNetAmount");
                if ((value == null)||(!value.equals(getTotalNetAmount()))) {
                    setTotalNetAmount(((BigDecimal) value));
                }
            }
            if (values.containsKey("TransactionCurrency")) {
                final Object value = values.remove("TransactionCurrency");
                if ((value == null)||(!value.equals(getTransactionCurrency()))) {
                    setTransactionCurrency(((String) value));
                }
            }
            if (values.containsKey("SDDocumentReason")) {
                final Object value = values.remove("SDDocumentReason");
                if ((value == null)||(!value.equals(getSDDocumentReason()))) {
                    setSDDocumentReason(((String) value));
                }
            }
            if (values.containsKey("PricingDate")) {
                final Object value = values.remove("PricingDate");
                if ((value == null)||(!value.equals(getPricingDate()))) {
                    setPricingDate(((Calendar) value));
                }
            }
            if (values.containsKey("RequestedDeliveryDate")) {
                final Object value = values.remove("RequestedDeliveryDate");
                if ((value == null)||(!value.equals(getRequestedDeliveryDate()))) {
                    setRequestedDeliveryDate(((Calendar) value));
                }
            }
            if (values.containsKey("ShippingCondition")) {
                final Object value = values.remove("ShippingCondition");
                if ((value == null)||(!value.equals(getShippingCondition()))) {
                    setShippingCondition(((String) value));
                }
            }
            if (values.containsKey("CompleteDeliveryIsDefined")) {
                final Object value = values.remove("CompleteDeliveryIsDefined");
                if ((value == null)||(!value.equals(getCompleteDeliveryIsDefined()))) {
                    setCompleteDeliveryIsDefined(((Boolean) value));
                }
            }
            if (values.containsKey("ShippingType")) {
                final Object value = values.remove("ShippingType");
                if ((value == null)||(!value.equals(getShippingType()))) {
                    setShippingType(((String) value));
                }
            }
            if (values.containsKey("HeaderBillingBlockReason")) {
                final Object value = values.remove("HeaderBillingBlockReason");
                if ((value == null)||(!value.equals(getHeaderBillingBlockReason()))) {
                    setHeaderBillingBlockReason(((String) value));
                }
            }
            if (values.containsKey("DeliveryBlockReason")) {
                final Object value = values.remove("DeliveryBlockReason");
                if ((value == null)||(!value.equals(getDeliveryBlockReason()))) {
                    setDeliveryBlockReason(((String) value));
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
            if (values.containsKey("IncotermsVersion")) {
                final Object value = values.remove("IncotermsVersion");
                if ((value == null)||(!value.equals(getIncotermsVersion()))) {
                    setIncotermsVersion(((String) value));
                }
            }
            if (values.containsKey("CustomerPaymentTerms")) {
                final Object value = values.remove("CustomerPaymentTerms");
                if ((value == null)||(!value.equals(getCustomerPaymentTerms()))) {
                    setCustomerPaymentTerms(((String) value));
                }
            }
            if (values.containsKey("PaymentMethod")) {
                final Object value = values.remove("PaymentMethod");
                if ((value == null)||(!value.equals(getPaymentMethod()))) {
                    setPaymentMethod(((String) value));
                }
            }
            if (values.containsKey("AssignmentReference")) {
                final Object value = values.remove("AssignmentReference");
                if ((value == null)||(!value.equals(getAssignmentReference()))) {
                    setAssignmentReference(((String) value));
                }
            }
            if (values.containsKey("OverallSDProcessStatus")) {
                final Object value = values.remove("OverallSDProcessStatus");
                if ((value == null)||(!value.equals(getOverallSDProcessStatus()))) {
                    setOverallSDProcessStatus(((String) value));
                }
            }
            if (values.containsKey("TotalCreditCheckStatus")) {
                final Object value = values.remove("TotalCreditCheckStatus");
                if ((value == null)||(!value.equals(getTotalCreditCheckStatus()))) {
                    setTotalCreditCheckStatus(((String) value));
                }
            }
            if (values.containsKey("OverallTotalDeliveryStatus")) {
                final Object value = values.remove("OverallTotalDeliveryStatus");
                if ((value == null)||(!value.equals(getOverallTotalDeliveryStatus()))) {
                    setOverallTotalDeliveryStatus(((String) value));
                }
            }
            if (values.containsKey("OverallSDDocumentRejectionSts")) {
                final Object value = values.remove("OverallSDDocumentRejectionSts");
                if ((value == null)||(!value.equals(getOverallSDDocumentRejectionSts()))) {
                    setOverallSDDocumentRejectionSts(((String) value));
                }
            }
            if (values.containsKey("YY1_box_SDH")) {
                final Object value = values.remove("YY1_box_SDH");
                if ((value == null)||(!value.equals(getYY1_box_SDH()))) {
                    setYY1_box_SDH(((String) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
            if ((values).containsKey("to_Item")) {
                final Object value = (values).remove("to_Item");
                if (value instanceof Iterable) {
                    if (toItem == null) {
                        toItem = Lists.newArrayList();
                    } else {
                        toItem = Lists.newArrayList(toItem);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        SalesOrderItem entity;
                        if (toItem.size()>i) {
                            entity = toItem.get(i);
                            i = i += 1;
                        } else {
                            entity = new SalesOrderItem();
                            toItem.add(entity);
                        }
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
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
                        SalesOrderHeaderPartner entity;
                        if (toPartner.size()>i) {
                            entity = toPartner.get(i);
                            i = i += 1;
                        } else {
                            entity = new SalesOrderHeaderPartner();
                            toPartner.add(entity);
                        }
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("to_PaymentPlanItemDetails")) {
                final Object value = (values).remove("to_PaymentPlanItemDetails");
                if (value instanceof Iterable) {
                    if (toPaymentPlanItemDetails == null) {
                        toPaymentPlanItemDetails = Lists.newArrayList();
                    } else {
                        toPaymentPlanItemDetails = Lists.newArrayList(toPaymentPlanItemDetails);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        SlsOrdPaymentPlanItemDetails entity;
                        if (toPaymentPlanItemDetails.size()>i) {
                            entity = toPaymentPlanItemDetails.get(i);
                            i = i += 1;
                        } else {
                            entity = new SlsOrdPaymentPlanItemDetails();
                            toPaymentPlanItemDetails.add(entity);
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
                        SalesOrderHeaderPrElement entity;
                        if (toPricingElement.size()>i) {
                            entity = toPricingElement.get(i);
                            i = i += 1;
                        } else {
                            entity = new SalesOrderHeaderPrElement();
                            toPricingElement.add(entity);
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
                        SalesOrderText entity;
                        if (toText.size()>i) {
                            entity = toText.get(i);
                            i = i += 1;
                        } else {
                            entity = new SalesOrderText();
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
    public static<T >SalesOrderField<T> field(final String fieldName, final Class<T> fieldType) {
        return new SalesOrderField<T>(fieldName);
    }

    /**
     * Fetches the <b>SalesOrderItem</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_Item</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>SalesOrderItem</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<SalesOrderItem> fetchItem()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type SalesOrderItem.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("SalesOrder=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(salesOrder));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_Item");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getEndpointUrl(), odataResourceUrl.toString());
        final ODataQuery query = builder.build();
        final ErpEndpoint erpEndpoint = new ErpEndpoint(erpConfigContext);
        final ODataQueryResult result = query.execute(erpEndpoint);
        final List<SalesOrderItem> entityList = result.asList(SalesOrderItem.class);
        for (SalesOrderItem entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>SalesOrderItem</b> entities (one to many).
     * <p>
     * If the navigation property <b>to_Item</b> of a queried <b>SalesOrder</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>SalesOrderItem</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<SalesOrderItem> getItemOrFetch()
        throws ODataException
    {
        if (toItem == null) {
            toItem = fetchItem();
        }
        return toItem;
    }

    /**
     * Retrieval of associated <b>SalesOrderItem</b> entities (one to many).
     * <p>
     * If the navigation property <b>to_Item</b> for an entity <b>SalesOrder</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <b>Optional</b> result state will be <i>null</i>.
     * 
     * @return
     *     If the information for navigation property <b>to_Item</b> is already loaded, the result will contain the <b>SalesOrderItem</b> entities. If not, a <i>null</i> value state is returned.
     */
    public Optional<List<SalesOrderItem>> getItemOrNull() {
        return Optional.fromNullable(toItem);
    }

    /**
     * Overwrites the list of associated <b>SalesOrderItem</b> entities for the loaded navigation property <b>to_Item</b>.
     * <p>
     * If the navigation property <b>to_Item</b> of a queried <b>SalesOrder</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>SalesOrderItem</b> entities.
     */
    public void setItem(
        @NonNull
        final List<SalesOrderItem> value) {
        if (toItem == null) {
            toItem = Lists.newArrayList();
        }
        toItem.clear();
        toItem.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>SalesOrderItem</b> entities.
     * <p>
     * If the navigation property <b>to_Item</b> of a queried <b>SalesOrder</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>SalesOrderItem</b> entities.
     */
    public void addItem(SalesOrderItem... entity) {
        if (toItem == null) {
            toItem = Lists.newArrayList();
        }
        toItem.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>SalesOrderHeaderPartner</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_Partner</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>SalesOrderHeaderPartner</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<SalesOrderHeaderPartner> fetchPartner()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type SalesOrderHeaderPartner.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("SalesOrder=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(salesOrder));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_Partner");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getEndpointUrl(), odataResourceUrl.toString());
        final ODataQuery query = builder.build();
        final ErpEndpoint erpEndpoint = new ErpEndpoint(erpConfigContext);
        final ODataQueryResult result = query.execute(erpEndpoint);
        final List<SalesOrderHeaderPartner> entityList = result.asList(SalesOrderHeaderPartner.class);
        for (SalesOrderHeaderPartner entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>SalesOrderHeaderPartner</b> entities (one to many).
     * <p>
     * If the navigation property <b>to_Partner</b> of a queried <b>SalesOrder</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>SalesOrderHeaderPartner</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<SalesOrderHeaderPartner> getPartnerOrFetch()
        throws ODataException
    {
        if (toPartner == null) {
            toPartner = fetchPartner();
        }
        return toPartner;
    }

    /**
     * Retrieval of associated <b>SalesOrderHeaderPartner</b> entities (one to many).
     * <p>
     * If the navigation property <b>to_Partner</b> for an entity <b>SalesOrder</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <b>Optional</b> result state will be <i>null</i>.
     * 
     * @return
     *     If the information for navigation property <b>to_Partner</b> is already loaded, the result will contain the <b>SalesOrderHeaderPartner</b> entities. If not, a <i>null</i> value state is returned.
     */
    public Optional<List<SalesOrderHeaderPartner>> getPartnerOrNull() {
        return Optional.fromNullable(toPartner);
    }

    /**
     * Overwrites the list of associated <b>SalesOrderHeaderPartner</b> entities for the loaded navigation property <b>to_Partner</b>.
     * <p>
     * If the navigation property <b>to_Partner</b> of a queried <b>SalesOrder</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>SalesOrderHeaderPartner</b> entities.
     */
    public void setPartner(
        @NonNull
        final List<SalesOrderHeaderPartner> value) {
        if (toPartner == null) {
            toPartner = Lists.newArrayList();
        }
        toPartner.clear();
        toPartner.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>SalesOrderHeaderPartner</b> entities.
     * <p>
     * If the navigation property <b>to_Partner</b> of a queried <b>SalesOrder</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>SalesOrderHeaderPartner</b> entities.
     */
    public void addPartner(SalesOrderHeaderPartner... entity) {
        if (toPartner == null) {
            toPartner = Lists.newArrayList();
        }
        toPartner.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>SlsOrdPaymentPlanItemDetails</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_PaymentPlanItemDetails</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>SlsOrdPaymentPlanItemDetails</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<SlsOrdPaymentPlanItemDetails> fetchPaymentPlanItemDetails()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type SlsOrdPaymentPlanItemDetails.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("SalesOrder=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(salesOrder));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_PaymentPlanItemDetails");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getEndpointUrl(), odataResourceUrl.toString());
        final ODataQuery query = builder.build();
        final ErpEndpoint erpEndpoint = new ErpEndpoint(erpConfigContext);
        final ODataQueryResult result = query.execute(erpEndpoint);
        final List<SlsOrdPaymentPlanItemDetails> entityList = result.asList(SlsOrdPaymentPlanItemDetails.class);
        for (SlsOrdPaymentPlanItemDetails entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>SlsOrdPaymentPlanItemDetails</b> entities (one to many).
     * <p>
     * If the navigation property <b>to_PaymentPlanItemDetails</b> of a queried <b>SalesOrder</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>SlsOrdPaymentPlanItemDetails</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<SlsOrdPaymentPlanItemDetails> getPaymentPlanItemDetailsOrFetch()
        throws ODataException
    {
        if (toPaymentPlanItemDetails == null) {
            toPaymentPlanItemDetails = fetchPaymentPlanItemDetails();
        }
        return toPaymentPlanItemDetails;
    }

    /**
     * Retrieval of associated <b>SlsOrdPaymentPlanItemDetails</b> entities (one to many).
     * <p>
     * If the navigation property <b>to_PaymentPlanItemDetails</b> for an entity <b>SalesOrder</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <b>Optional</b> result state will be <i>null</i>.
     * 
     * @return
     *     If the information for navigation property <b>to_PaymentPlanItemDetails</b> is already loaded, the result will contain the <b>SlsOrdPaymentPlanItemDetails</b> entities. If not, a <i>null</i> value state is returned.
     */
    public Optional<List<SlsOrdPaymentPlanItemDetails>> getPaymentPlanItemDetailsOrNull() {
        return Optional.fromNullable(toPaymentPlanItemDetails);
    }

    /**
     * Overwrites the list of associated <b>SlsOrdPaymentPlanItemDetails</b> entities for the loaded navigation property <b>to_PaymentPlanItemDetails</b>.
     * <p>
     * If the navigation property <b>to_PaymentPlanItemDetails</b> of a queried <b>SalesOrder</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>SlsOrdPaymentPlanItemDetails</b> entities.
     */
    public void setPaymentPlanItemDetails(
        @NonNull
        final List<SlsOrdPaymentPlanItemDetails> value) {
        if (toPaymentPlanItemDetails == null) {
            toPaymentPlanItemDetails = Lists.newArrayList();
        }
        toPaymentPlanItemDetails.clear();
        toPaymentPlanItemDetails.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>SlsOrdPaymentPlanItemDetails</b> entities.
     * <p>
     * If the navigation property <b>to_PaymentPlanItemDetails</b> of a queried <b>SalesOrder</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>SlsOrdPaymentPlanItemDetails</b> entities.
     */
    public void addPaymentPlanItemDetails(SlsOrdPaymentPlanItemDetails... entity) {
        if (toPaymentPlanItemDetails == null) {
            toPaymentPlanItemDetails = Lists.newArrayList();
        }
        toPaymentPlanItemDetails.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>SalesOrderHeaderPrElement</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_PricingElement</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>SalesOrderHeaderPrElement</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<SalesOrderHeaderPrElement> fetchPricingElement()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type SalesOrderHeaderPrElement.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("SalesOrder=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(salesOrder));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_PricingElement");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getEndpointUrl(), odataResourceUrl.toString());
        final ODataQuery query = builder.build();
        final ErpEndpoint erpEndpoint = new ErpEndpoint(erpConfigContext);
        final ODataQueryResult result = query.execute(erpEndpoint);
        final List<SalesOrderHeaderPrElement> entityList = result.asList(SalesOrderHeaderPrElement.class);
        for (SalesOrderHeaderPrElement entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>SalesOrderHeaderPrElement</b> entities (one to many).
     * <p>
     * If the navigation property <b>to_PricingElement</b> of a queried <b>SalesOrder</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>SalesOrderHeaderPrElement</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<SalesOrderHeaderPrElement> getPricingElementOrFetch()
        throws ODataException
    {
        if (toPricingElement == null) {
            toPricingElement = fetchPricingElement();
        }
        return toPricingElement;
    }

    /**
     * Retrieval of associated <b>SalesOrderHeaderPrElement</b> entities (one to many).
     * <p>
     * If the navigation property <b>to_PricingElement</b> for an entity <b>SalesOrder</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <b>Optional</b> result state will be <i>null</i>.
     * 
     * @return
     *     If the information for navigation property <b>to_PricingElement</b> is already loaded, the result will contain the <b>SalesOrderHeaderPrElement</b> entities. If not, a <i>null</i> value state is returned.
     */
    public Optional<List<SalesOrderHeaderPrElement>> getPricingElementOrNull() {
        return Optional.fromNullable(toPricingElement);
    }

    /**
     * Overwrites the list of associated <b>SalesOrderHeaderPrElement</b> entities for the loaded navigation property <b>to_PricingElement</b>.
     * <p>
     * If the navigation property <b>to_PricingElement</b> of a queried <b>SalesOrder</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>SalesOrderHeaderPrElement</b> entities.
     */
    public void setPricingElement(
        @NonNull
        final List<SalesOrderHeaderPrElement> value) {
        if (toPricingElement == null) {
            toPricingElement = Lists.newArrayList();
        }
        toPricingElement.clear();
        toPricingElement.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>SalesOrderHeaderPrElement</b> entities.
     * <p>
     * If the navigation property <b>to_PricingElement</b> of a queried <b>SalesOrder</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>SalesOrderHeaderPrElement</b> entities.
     */
    public void addPricingElement(SalesOrderHeaderPrElement... entity) {
        if (toPricingElement == null) {
            toPricingElement = Lists.newArrayList();
        }
        toPricingElement.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>SalesOrderText</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_Text</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>SalesOrderText</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<SalesOrderText> fetchText()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type SalesOrderText.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("SalesOrder=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(salesOrder));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_Text");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getEndpointUrl(), odataResourceUrl.toString());
        final ODataQuery query = builder.build();
        final ErpEndpoint erpEndpoint = new ErpEndpoint(erpConfigContext);
        final ODataQueryResult result = query.execute(erpEndpoint);
        final List<SalesOrderText> entityList = result.asList(SalesOrderText.class);
        for (SalesOrderText entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>SalesOrderText</b> entities (one to many).
     * <p>
     * If the navigation property <b>to_Text</b> of a queried <b>SalesOrder</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>SalesOrderText</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    public List<SalesOrderText> getTextOrFetch()
        throws ODataException
    {
        if (toText == null) {
            toText = fetchText();
        }
        return toText;
    }

    /**
     * Retrieval of associated <b>SalesOrderText</b> entities (one to many).
     * <p>
     * If the navigation property <b>to_Text</b> for an entity <b>SalesOrder</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <b>Optional</b> result state will be <i>null</i>.
     * 
     * @return
     *     If the information for navigation property <b>to_Text</b> is already loaded, the result will contain the <b>SalesOrderText</b> entities. If not, a <i>null</i> value state is returned.
     */
    public Optional<List<SalesOrderText>> getTextOrNull() {
        return Optional.fromNullable(toText);
    }

    /**
     * Overwrites the list of associated <b>SalesOrderText</b> entities for the loaded navigation property <b>to_Text</b>.
     * <p>
     * If the navigation property <b>to_Text</b> of a queried <b>SalesOrder</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>SalesOrderText</b> entities.
     */
    public void setText(
        @NonNull
        final List<SalesOrderText> value) {
        if (toText == null) {
            toText = Lists.newArrayList();
        }
        toText.clear();
        toText.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>SalesOrderText</b> entities.
     * <p>
     * If the navigation property <b>to_Text</b> of a queried <b>SalesOrder</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>SalesOrderText</b> entities.
     */
    public void addText(SalesOrderText... entity) {
        if (toText == null) {
            toText = Lists.newArrayList();
        }
        toText.addAll(Lists.newArrayList(entity));
    }

    public final static class SalesOrderBuilder {

        private List<SalesOrderItem> toItem = Lists.newArrayList();
        private List<SalesOrderHeaderPartner> toPartner = Lists.newArrayList();
        private List<SlsOrdPaymentPlanItemDetails> toPaymentPlanItemDetails = Lists.newArrayList();
        private List<SalesOrderHeaderPrElement> toPricingElement = Lists.newArrayList();
        private List<SalesOrderText> toText = Lists.newArrayList();

        private SalesOrder.SalesOrderBuilder toItem(List<SalesOrderItem> value) {
            toItem.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_Item</b> for <b>SalesOrder</b> to multiple <b>SalesOrderItem</b>.
         * 
         */
        public SalesOrder.SalesOrderBuilder item(SalesOrderItem... value) {
            return toItem(Lists.newArrayList(value));
        }

        private SalesOrder.SalesOrderBuilder toPartner(List<SalesOrderHeaderPartner> value) {
            toPartner.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_Partner</b> for <b>SalesOrder</b> to multiple <b>SalesOrderHeaderPartner</b>.
         * 
         */
        public SalesOrder.SalesOrderBuilder partner(SalesOrderHeaderPartner... value) {
            return toPartner(Lists.newArrayList(value));
        }

        private SalesOrder.SalesOrderBuilder toPaymentPlanItemDetails(List<SlsOrdPaymentPlanItemDetails> value) {
            toPaymentPlanItemDetails.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_PaymentPlanItemDetails</b> for <b>SalesOrder</b> to multiple <b>SlsOrdPaymentPlanItemDetails</b>.
         * 
         */
        public SalesOrder.SalesOrderBuilder paymentPlanItemDetails(SlsOrdPaymentPlanItemDetails... value) {
            return toPaymentPlanItemDetails(Lists.newArrayList(value));
        }

        private SalesOrder.SalesOrderBuilder toPricingElement(List<SalesOrderHeaderPrElement> value) {
            toPricingElement.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_PricingElement</b> for <b>SalesOrder</b> to multiple <b>SalesOrderHeaderPrElement</b>.
         * 
         */
        public SalesOrder.SalesOrderBuilder pricingElement(SalesOrderHeaderPrElement... value) {
            return toPricingElement(Lists.newArrayList(value));
        }

        private SalesOrder.SalesOrderBuilder toText(List<SalesOrderText> value) {
            toText.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_Text</b> for <b>SalesOrder</b> to multiple <b>SalesOrderText</b>.
         * 
         */
        public SalesOrder.SalesOrderBuilder text(SalesOrderText... value) {
            return toText(Lists.newArrayList(value));
        }

    }

}
