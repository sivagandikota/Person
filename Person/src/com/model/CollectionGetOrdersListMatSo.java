/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.google.gson.annotations.SerializedName;
import java.util.Arrays;

/**
 *
 * @author SrinivasBu
 */
public class CollectionGetOrdersListMatSo {
    @SerializedName("results")
    private OrderListMatSo[] results = null;

    public OrderListMatSo[] getResults() {
        return results;
    }

    public void setResults(OrderListMatSo[] results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "CollectionGetOrdersListMatSo{" + "results=" + Arrays.deepToString(results) + '}';
    }
    
}
