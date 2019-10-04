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
public class CollectionGetOrdersInqGetSOItem {
   @SerializedName("results")
    private OrdersInqGetSOItem[] results = null; 

    public OrdersInqGetSOItem[] getResults() {
        return results;
    }

    public void setResults(OrdersInqGetSOItem[] results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "CollectionGetOrdersInqGetSOItem{" + "results=" + Arrays.deepToString(results) + '}';
    }
   
}
