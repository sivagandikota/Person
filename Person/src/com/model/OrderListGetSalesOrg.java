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
public class OrderListGetSalesOrg {

    @SerializedName("__metadata")
    private MetaData metadata = null;

    @SerializedName("Customer")
    private String customer = null;

    @SerializedName("SalesOrganization")
    private String salesOrganization = null;

    public MetaData getMetadata() {
        return metadata;
    }

    public void setMetadata(MetaData metadata) {
        this.metadata = metadata;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getSalesOrganization() {
        return salesOrganization;
    }

    public void setSalesOrganization(String salesOrganization) {
        this.salesOrganization = salesOrganization;
    }

    @Override
    public String toString() {
        return "OrderListGetSalesOrg{" + "metadata=" + metadata + ", customer=" + customer + ", salesOrganization=" + salesOrganization + '}';
    }
}
