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
public class CollectionGetOrdersListGetShipCondText {
    @SerializedName("results")
    private OrderListGetShipCondText[] results = null;

    public OrderListGetShipCondText[] getResults() {
        return results;
    }

    public void setResults(OrderListGetShipCondText[] results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "CollectionGetOrdersListGetShipCondText{" + "results=" + Arrays.deepToString(results) + '}';
    }
        
}
