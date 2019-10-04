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
public class CancelOrders {

    @SerializedName("__metadata")
    private MetaData metadata = null;

    @SerializedName("SalesOrganization")
    private String salesOrganization = null;

    @SerializedName("SoldToParty")
    private String soldToParty = null;

    @SerializedName("SalesOrder")
    private String salesOrder = null;

    @SerializedName("Status")
    private String status = null;

    @SerializedName("PurchaseOrderByCustomer")
    private String purchaseOrderByCustomer = null;

    @SerializedName("LastChangeDateTime")
    private String lastChangeDateTime = null;

    public MetaData getMetadata() {
        return metadata;
    }

    public void setMetadata(MetaData metadata) {
        this.metadata = metadata;
    }

    public String getSalesOrganization() {
        return salesOrganization;
    }

    public void setSalesOrganization(String salesOrganization) {
        this.salesOrganization = salesOrganization;
    }

    public String getSoldToParty() {
        return soldToParty;
    }

    public void setSoldToParty(String soldToParty) {
        this.soldToParty = soldToParty;
    }

    public String getSalesOrder() {
        return salesOrder;
    }

    public void setSalesOrder(String salesOrder) {
        this.salesOrder = salesOrder;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPurchaseOrderByCustomer() {
        return purchaseOrderByCustomer;
    }

    public void setPurchaseOrderByCustomer(String purchaseOrderByCustomer) {
        this.purchaseOrderByCustomer = purchaseOrderByCustomer;
    }

    public String getLastChangeDateTime() {
        return lastChangeDateTime;
    }

    public void setLastChangeDateTime(String lastChangeDateTime) {
        this.lastChangeDateTime = lastChangeDateTime;
    }

    @Override
    public String toString() {
        return "CancelOrders{" + "metadata=" + metadata + ", salesOrganization=" + salesOrganization + ", soldToParty=" + soldToParty + ", salesOrder=" + salesOrder + ", status=" + status + ", purchaseOrderByCustomer=" + purchaseOrderByCustomer + ", lastChangeDateTime=" + lastChangeDateTime + '}';
    }

   
}
