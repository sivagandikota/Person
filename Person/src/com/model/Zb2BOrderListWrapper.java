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
public class Zb2BOrderListWrapper {

    @SerializedName("d")
    private CollectionGetOrdersList d = null;
    String o_result = "";

    public CollectionGetOrdersList getD() {
        return d;
    }

    public void setD(CollectionGetOrdersList d) {
        this.d = d;
    }

    public String getO_result() {
        return o_result;
    }

    public void setO_result(String o_result) {
        this.o_result = o_result;
    }

    @Override
    public String toString() {
        return "Zb2BOrderListWrapper{" + "d=" + d + ", o_result=" + o_result + '}';
    }

}
