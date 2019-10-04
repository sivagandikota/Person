/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.MetaData;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author SrinivasBu
 */
public class OrderListGetShipToParty {

    @SerializedName("__metadata")
    private MetaData metadata = null;

    @SerializedName("SalesOrder")
    private String salesOrder = null;

    @SerializedName("PartnerFunction")
    private String partnerFunction = null;

    @SerializedName("Customer")
    private String customer = null;

    public MetaData getMetadata() {
        return metadata;
    }

    public void setMetadata(MetaData metadata) {
        this.metadata = metadata;
    }

    public String getSalesOrder() {
        return salesOrder;
    }

    public void setSalesOrder(String salesOrder) {
        this.salesOrder = salesOrder;
    }

    public String getPartnerFunction() {
        return partnerFunction;
    }

    public void setPartnerFunction(String partnerFunction) {
        this.partnerFunction = partnerFunction;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "OrderListGetShipToParty{" + "metadata=" + metadata + ", salesOrder=" + salesOrder + ", partnerFunction=" + partnerFunction + ", customer=" + customer + '}';
    }
}
