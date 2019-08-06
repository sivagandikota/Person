
package com.sap.brewster.namespaces.salesordercreatereadupdatedelete;

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
 * Sales Order Item Text API<p></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class SalesOrderItemText
    extends VdmEntity<SalesOrderItemText>
{

    /**
     * Selector for all available fields of SalesOrderItemText.
     * 
     */
    public final static SalesOrderItemTextSelectable ALL_FIELDS = new SalesOrderItemTextSelectable() {


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
    public final static SalesOrderItemTextField<String> SALES_ORDER = new SalesOrderItemTextField<String>("SalesOrder");
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
    public final static SalesOrderItemTextField<String> SALES_ORDER_ITEM = new SalesOrderItemTextField<String>("SalesOrderItem");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 2
     * 
     * @param language
     *     
     * @return
     *     Language Key
     */
    @SerializedName("Language")
    @JsonProperty("Language")
    @Nullable
    private String language;
    /**
     * Use with available fluent helpers to apply the <b>Language</b> field to query operations.
     * 
     */
    public final static SalesOrderItemTextField<String> LANGUAGE = new SalesOrderItemTextField<String>("Language");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4
     * 
     * @param longTextID
     *     
     * @return
     *     Text ID
     */
    @SerializedName("LongTextID")
    @JsonProperty("LongTextID")
    @Nullable
    private String longTextID;
    /**
     * Use with available fluent helpers to apply the <b>LongTextID</b> field to query operations.
     * 
     */
    public final static SalesOrderItemTextField<String> LONG_TEXT_ID = new SalesOrderItemTextField<String>("LongTextID");
    /**
     * Constraints: none
     * 
     * @param longText
     *     
     * @return
     *     String
     */
    @SerializedName("LongText")
    @JsonProperty("LongText")
    @Nullable
    private String longText;
    /**
     * Use with available fluent helpers to apply the <b>LongText</b> field to query operations.
     * 
     */
    public final static SalesOrderItemTextField<String> LONG_TEXT = new SalesOrderItemTextField<String>("LongText");
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
     * Navigation property <b>to_SalesOrder</b> for <b>SalesOrderItemText</b> to single <b>SalesOrder</b>.
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
    public final static SalesOrderItemTextLink<SalesOrder> TO_SALES_ORDER = new SalesOrderItemTextLink<SalesOrder>("to_SalesOrder");
    /**
     * Navigation property <b>to_SalesOrderItem</b> for <b>SalesOrderItemText</b> to single <b>SalesOrderItem</b>.
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
    public final static SalesOrderItemTextLink<SalesOrderItem> TO_SALES_ORDER_ITEM = new SalesOrderItemTextLink<SalesOrderItem>("to_SalesOrderItem");

    /**
     * {@inheritDoc}
     * 
     */
    @Override
    public Class<SalesOrderItemText> getType() {
        return SalesOrderItemText.class;
    }

    @Override
    protected String getEndpointUrl() {
        return "/sap/opu/odata/sap/API_SALES_ORDER_SRV";
    }

    @Override
    protected String getEntityCollection() {
        return "A_SalesOrderItemText";
    }

    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("SalesOrder", getSalesOrder());
        result.put("SalesOrderItem", getSalesOrderItem());
        result.put("Language", getLanguage());
        result.put("LongTextID", getLongTextID());
        return result;
    }

    @Override
    protected Map<String, Object> toMap() {
        final Map<String, Object> values = super.toMap();
        values.put("SalesOrder", getSalesOrder());
        values.put("SalesOrderItem", getSalesOrderItem());
        values.put("Language", getLanguage());
        values.put("LongTextID", getLongTextID());
        values.put("LongText", getLongText());
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
            if (values.containsKey("Language")) {
                final Object value = values.remove("Language");
                if ((value == null)||(!value.equals(getLanguage()))) {
                    setLanguage(((String) value));
                }
            }
            if (values.containsKey("LongTextID")) {
                final Object value = values.remove("LongTextID");
                if ((value == null)||(!value.equals(getLongTextID()))) {
                    setLongTextID(((String) value));
                }
            }
            if (values.containsKey("LongText")) {
                final Object value = values.remove("LongText");
                if ((value == null)||(!value.equals(getLongText()))) {
                    setLongText(((String) value));
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
    public static<T >SalesOrderItemTextField<T> field(final String fieldName, final Class<T> fieldType) {
        return new SalesOrderItemTextField<T>(fieldName);
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
        odataResourceUrl.append(",Language=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(language));
        odataResourceUrl.append(",LongTextID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(longTextID));
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
     * If the navigation property <b>to_SalesOrder</b> of a queried <b>SalesOrderItemText</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
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
     * If the navigation property <b>to_SalesOrder</b> for an entity <b>SalesOrderItemText</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <b>Optional</b> result state will be <i>null</i>.
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
        odataResourceUrl.append(",Language=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(language));
        odataResourceUrl.append(",LongTextID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(longTextID));
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
     * If the navigation property <b>to_SalesOrderItem</b> of a queried <b>SalesOrderItemText</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
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
     * If the navigation property <b>to_SalesOrderItem</b> for an entity <b>SalesOrderItemText</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <b>Optional</b> result state will be <i>null</i>.
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

    public final static class SalesOrderItemTextBuilder {

        private SalesOrder toSalesOrder;
        private String salesOrder = null;
        private SalesOrderItem toSalesOrderItem;
        private String salesOrderItem = null;

        private SalesOrderItemText.SalesOrderItemTextBuilder toSalesOrder(SalesOrder value) {
            toSalesOrder = value;
            return this;
        }

        /**
         * Navigation property <b>to_SalesOrder</b> for <b>SalesOrderItemText</b> to single <b>SalesOrder</b>.
         * 
         */
        public SalesOrderItemText.SalesOrderItemTextBuilder salesOrder(final SalesOrder value) {
            return toSalesOrder(value);
        }

        /**
         * (Key Field) Constraints: Not nullable, Maximum length: 10
         * 
         */
        public SalesOrderItemText.SalesOrderItemTextBuilder salesOrder(final String value) {
            salesOrder = value;
            return this;
        }

        private SalesOrderItemText.SalesOrderItemTextBuilder toSalesOrderItem(SalesOrderItem value) {
            toSalesOrderItem = value;
            return this;
        }

        /**
         * Navigation property <b>to_SalesOrderItem</b> for <b>SalesOrderItemText</b> to single <b>SalesOrderItem</b>.
         * 
         */
        public SalesOrderItemText.SalesOrderItemTextBuilder salesOrderItem(final SalesOrderItem value) {
            return toSalesOrderItem(value);
        }

        /**
         * (Key Field) Constraints: Not nullable, Maximum length: 6
         * 
         */
        public SalesOrderItemText.SalesOrderItemTextBuilder salesOrderItem(final String value) {
            salesOrderItem = value;
            return this;
        }

    }

}
