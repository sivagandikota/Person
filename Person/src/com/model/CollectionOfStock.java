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
 * @author Shivas
 */
public class CollectionOfStock {
    @SerializedName("results")
    private StockStatus[] results = null;

    public StockStatus[] getResults() {
        return results;
    }

    public void setResults(StockStatus[] results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "CollectionOfStock{" + "results=" + Arrays.deepToString(results) + '}';
    }
    

}
