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
public class CollectionOfGetOrderItems {

    @SerializedName("results")
    private OrderItems[] results = null;

    public OrderItems[] getResults() {
        return results;
    }

    public void setResults(OrderItems[] results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "CollectionOfGetOrderItems{" + "results=" + Arrays.deepToString(results) + '}';
    }

}
