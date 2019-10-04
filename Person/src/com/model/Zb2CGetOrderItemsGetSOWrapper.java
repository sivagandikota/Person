/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author SrinivasBu
 */
public class Zb2CGetOrderItemsGetSOWrapper {
    @SerializedName("d")
    private CollectionOfGetOrderItemsGetSO  d= null;

    public CollectionOfGetOrderItemsGetSO getD() {
        return d;
    }

    public void setD(CollectionOfGetOrderItemsGetSO d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Zb2CGetOrderItemsGetSOWrapper{" + "d=" + d + '}';
    }
}
