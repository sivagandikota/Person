
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
 * Sales Order Header Partner API<p></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class SalesOrderHeaderPartner
    extends VdmEntity<SalesOrderHeaderPartner>
{

    /**
     * Selector for all available fields of SalesOrderHeaderPartner.
     * 
     */
    public final static SalesOrderHeaderPartnerSelectable ALL_FIELDS = new SalesOrderHeaderPartnerSelectable() {


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
    public final static SalesOrderHeaderPartnerField<String> SALES_ORDER = new SalesOrderHeaderPartnerField<String>("SalesOrder");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 2
     * 
     * @param partnerFunction
     *     
     * @return
     *     Partner Function
     */
    @SerializedName("PartnerFunction")
    @JsonProperty("PartnerFunction")
    @Nullable
    private String partnerFunction;
    /**
     * Use with available fluent helpers to apply the <b>PartnerFunction</b> field to query operations.
     * 
     */
    public final static SalesOrderHeaderPartnerField<String> PARTNER_FUNCTION = new SalesOrderHeaderPartnerField<String>("PartnerFunction");
    /**
     * Constraints: Not nullable, Maximum length: 10
     * 
     * @param customer
     *     
     * @return
     *     Customer Number
     */
    @SerializedName("Customer")
    @JsonProperty("Customer")
    @Nullable
    private String customer;
    /**
     * Use with available fluent helpers to apply the <b>Customer</b> field to query operations.
     * 
     */
    public final static SalesOrderHeaderPartnerField<String> CUSTOMER = new SalesOrderHeaderPartnerField<String>("Customer");
    /**
     * Constraints: Not nullable, Maximum length: 10
     * 
     * @param supplier
     *     
     * @return
     *     Account Number of Supplier
     */
    @SerializedName("Supplier")
    @JsonProperty("Supplier")
    @Nullable
    private String supplier;
    /**
     * Use with available fluent helpers to apply the <b>Supplier</b> field to query operations.
     * 
     */
    public final static SalesOrderHeaderPartnerField<String> SUPPLIER = new SalesOrderHeaderPartnerField<String>("Supplier");
    /**
     * Constraints: Not nullable, Maximum length: 8
     * 
     * @param personnel
     *     
     * @return
     *     Personnel Number
     */
    @SerializedName("Personnel")
    @JsonProperty("Personnel")
    @Nullable
    private String personnel;
    /**
     * Use with available fluent helpers to apply the <b>Personnel</b> field to query operations.
     * 
     */
    public final static SalesOrderHeaderPartnerField<String> PERSONNEL = new SalesOrderHeaderPartnerField<String>("Personnel");
    /**
     * Constraints: Not nullable, Maximum length: 10
     * 
     * @param contactPerson
     *     
     * @return
     *     Number of contact person
     */
    @SerializedName("ContactPerson")
    @JsonProperty("ContactPerson")
    @Nullable
    private String contactPerson;
    /**
     * Use with available fluent helpers to apply the <b>ContactPerson</b> field to query operations.
     * 
     */
    public final static SalesOrderHeaderPartnerField<String> CONTACT_PERSON = new SalesOrderHeaderPartnerField<String>("ContactPerson");
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
     * Navigation property <b>to_SalesOrder</b> for <b>SalesOrderHeaderPartner</b> to single <b>SalesOrder</b>.
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
    public final static SalesOrderHeaderPartnerLink<SalesOrder> TO_SALES_ORDER = new SalesOrderHeaderPartnerLink<SalesOrder>("to_SalesOrder");

    /**
     * {@inheritDoc}
     * 
     */
    @Override
    public Class<SalesOrderHeaderPartner> getType() {
        return SalesOrderHeaderPartner.class;
    }

    @Override
    protected String getEndpointUrl() {
        return "/sap/opu/odata/sap/API_SALES_ORDER_SRV";
    }

    @Override
    protected String getEntityCollection() {
        return "A_SalesOrderHeaderPartner";
    }

    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("SalesOrder", getSalesOrder());
        result.put("PartnerFunction", getPartnerFunction());
        return result;
    }

    @Override
    protected Map<String, Object> toMap() {
        final Map<String, Object> values = super.toMap();
        values.put("SalesOrder", getSalesOrder());
        values.put("PartnerFunction", getPartnerFunction());
        values.put("Customer", getCustomer());
        values.put("Supplier", getSupplier());
        values.put("Personnel", getPersonnel());
        values.put("ContactPerson", getContactPerson());
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
            if (values.containsKey("PartnerFunction")) {
                final Object value = values.remove("PartnerFunction");
                if ((value == null)||(!value.equals(getPartnerFunction()))) {
                    setPartnerFunction(((String) value));
                }
            }
            if (values.containsKey("Customer")) {
                final Object value = values.remove("Customer");
                if ((value == null)||(!value.equals(getCustomer()))) {
                    setCustomer(((String) value));
                }
            }
            if (values.containsKey("Supplier")) {
                final Object value = values.remove("Supplier");
                if ((value == null)||(!value.equals(getSupplier()))) {
                    setSupplier(((String) value));
                }
            }
            if (values.containsKey("Personnel")) {
                final Object value = values.remove("Personnel");
                if ((value == null)||(!value.equals(getPersonnel()))) {
                    setPersonnel(((String) value));
                }
            }
            if (values.containsKey("ContactPerson")) {
                final Object value = values.remove("ContactPerson");
                if ((value == null)||(!value.equals(getContactPerson()))) {
                    setContactPerson(((String) value));
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
    public static<T >SalesOrderHeaderPartnerField<T> field(final String fieldName, final Class<T> fieldType) {
        return new SalesOrderHeaderPartnerField<T>(fieldName);
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
        odataResourceUrl.append(",PartnerFunction=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(partnerFunction));
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
     * If the navigation property <b>to_SalesOrder</b> of a queried <b>SalesOrderHeaderPartner</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
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
     * If the navigation property <b>to_SalesOrder</b> for an entity <b>SalesOrderHeaderPartner</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <b>Optional</b> result state will be <i>null</i>.
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

    public final static class SalesOrderHeaderPartnerBuilder {

        private SalesOrder toSalesOrder;
        private String salesOrder = null;

        private SalesOrderHeaderPartner.SalesOrderHeaderPartnerBuilder toSalesOrder(SalesOrder value) {
            toSalesOrder = value;
            return this;
        }

        /**
         * Navigation property <b>to_SalesOrder</b> for <b>SalesOrderHeaderPartner</b> to single <b>SalesOrder</b>.
         * 
         */
        public SalesOrderHeaderPartner.SalesOrderHeaderPartnerBuilder salesOrder(final SalesOrder value) {
            return toSalesOrder(value);
        }

        /**
         * (Key Field) Constraints: Not nullable, Maximum length: 10
         * 
         */
        public SalesOrderHeaderPartner.SalesOrderHeaderPartnerBuilder salesOrder(final String value) {
            salesOrder = value;
            return this;
        }

    }

}
