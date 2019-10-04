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
public class OrderListMatSo {
    @SerializedName("__metadata")
    private MetaData metadata = null;

    @SerializedName("SalesOrder")
    private String salesOrder = null;

    @SerializedName("SalesOrderItem")
    private String salesOrderItem = null;
    
    @SerializedName("Material")
    private String material = null;

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

    public String getSalesOrderItem() {
        return salesOrderItem;
    }

    public void setSalesOrderItem(String salesOrderItem) {
        this.salesOrderItem = salesOrderItem;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "OrderListMatSo{" + "metadata=" + metadata + ", salesOrder=" + salesOrder + ", salesOrderItem=" + salesOrderItem + ", material=" + material + '}';
    }        

}
