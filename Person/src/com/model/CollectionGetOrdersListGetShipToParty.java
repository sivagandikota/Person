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
public class CollectionGetOrdersListGetShipToParty {
    @SerializedName("results")
    private OrderListGetShipToParty[] results = null;

    public OrderListGetShipToParty[] getResults() {
        return results;
    }

    public void setResults(OrderListGetShipToParty[] results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "CollectionGetOrdersListGetShipToParty{" + "results=" + Arrays.deepToString(results) + '}';
    }
    
}
