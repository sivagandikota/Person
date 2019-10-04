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
public class Zb2BOrderInqWrapper {

    @SerializedName("d")
    private CollectionGetOrdersInq d = null;

    public CollectionGetOrdersInq getD() {
        return d;
    }

    public void setD(CollectionGetOrdersInq d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Zb2BOrderInqWrapper{" + "d=" + d + '}';
    }
}
