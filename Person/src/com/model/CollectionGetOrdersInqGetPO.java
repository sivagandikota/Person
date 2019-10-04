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
public class CollectionGetOrdersInqGetPO {

    @SerializedName("results")
    private OrderInqPO[] results = null;

    public OrderInqPO[] getResults() {
        return results;
    }

    public void setResults(OrderInqPO[] results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "CollectionGetOrdersInqGetPO{" + "results=" + Arrays.deepToString(results) + '}';
    }
    
    
}
