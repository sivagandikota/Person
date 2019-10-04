/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author SrinivasBu
 */
public class CollectionGetOrdersList {

    @SerializedName("results")
    private OrderList[] results = null;

    public OrderList[] getResults() {
        return results;
    }

    public void setResults(OrderList[] results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "CollectionGetOrdersList{" + "results=" + Arrays.deepToString(results) + '}';
    }

}
