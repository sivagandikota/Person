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
public class CollectionOfCancelOrders {
    @SerializedName("results")
	  private CancelOrders[] results = null;

    public CancelOrders[] getResults() {
        return results;
    }

    public void setResults(CancelOrders[] results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "CollectionOfCancelOrders{" + "results=" + Arrays.deepToString(results) + '}';
    }
    

}
