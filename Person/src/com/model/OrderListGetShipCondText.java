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
public class OrderListGetShipCondText {

    @SerializedName("__metadata")
    private MetaData metadata = null;

    @SerializedName("ShippingCondition")
    private String shippingCondition = null;

    @SerializedName("Language")
    private String language = null;

    @SerializedName("ShippingConditionName")
    private String shippingConditionName = null;

    public MetaData getMetadata() {
        return metadata;
    }

    public void setMetadata(MetaData metadata) {
        this.metadata = metadata;
    }

    public String getShippingCondition() {
        return shippingCondition;
    }

    public void setShippingCondition(String shippingCondition) {
        this.shippingCondition = shippingCondition;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getShippingConditionName() {
        return shippingConditionName;
    }

    public void setShippingConditionName(String shippingConditionName) {
        this.shippingConditionName = shippingConditionName;
    }

    @Override
    public String toString() {
        return "OrderListGetShipCondText{" + "metadata=" + metadata + ", shippingCondition=" + shippingCondition + ", language=" + language + ", shippingConditionName=" + shippingConditionName + '}';
    }
}
