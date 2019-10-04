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
public class CollectionOfCancelOrdersGetSalesItem {
    @SerializedName("results")
	  private CancelOrdersGetSalesItem[] results = null;

    public CancelOrdersGetSalesItem[] getResults() {
        return results;
    }

    public void setResults(CancelOrdersGetSalesItem[] results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "CollectionOfCancelOrdersGetSalesItem{" + "results=" + Arrays.deepToString(results) + '}';
    }

}
