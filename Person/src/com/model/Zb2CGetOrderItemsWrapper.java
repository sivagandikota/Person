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
public class Zb2CGetOrderItemsWrapper {
    @SerializedName("d")
    private CollectionOfGetOrderItems  d= null;

    public CollectionOfGetOrderItems getD() {
        return d;
    }

    public void setD(CollectionOfGetOrderItems d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Zb2CGetOrderItemsWrapper{" + "d=" + d + '}';
    }
    
}
