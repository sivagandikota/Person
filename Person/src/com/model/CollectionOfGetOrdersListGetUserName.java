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
public class CollectionOfGetOrdersListGetUserName {

    @SerializedName("results")
    private OrderListGetUserName[] results = null;

    public OrderListGetUserName[] getResults() {
        return results;
    }

    public void setResults(OrderListGetUserName[] results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "CollectionOfGetOrdersListGetUserName{" + "results=" + Arrays.deepToString(results) + '}';
    }

   
}
