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
public class CollectionGetOrdersListGetSalesOrg {

    @SerializedName("results")
    private OrderListGetSalesOrg[] results = null;

    public OrderListGetSalesOrg[] getResults() {
        return results;
    }

    public void setResults(OrderListGetSalesOrg[] results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "CollectionGetOrdersListGetSalesOrg{" + "results=" + Arrays.deepToString(results) + '}';
    }
    
}
