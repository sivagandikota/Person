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
public class CollectionOfGetOrderItemsGetSO {
    @SerializedName("results")
    private OrderItemsGetSO[] results = null;

    public OrderItemsGetSO[] getResults() {
        return results;
    }

    public void setResults(OrderItemsGetSO[] results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "CollectionOfGetOrderItemsGetSO{" + "results=" + Arrays.deepToString(results) + '}';
    }
    
}
