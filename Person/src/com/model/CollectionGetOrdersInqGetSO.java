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
public class CollectionGetOrdersInqGetSO {
    @SerializedName("results")
    private OrdersInqGetSO[] results = null;

    public OrdersInqGetSO[] getResults() {
        return results;
    }

    public void setResults(OrdersInqGetSO[] results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "CollectionGetOrdersInqGetSO{" + "results=" + Arrays.deepToString(results) + '}';
    }    
}
