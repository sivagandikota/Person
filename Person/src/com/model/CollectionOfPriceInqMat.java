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
public class CollectionOfPriceInqMat {
    @SerializedName("results")
    private PriceInqMat[] results = null;

    public PriceInqMat[] getResults() {
        return results;
    }

    public void setResults(PriceInqMat[] results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "CollectionOfPriceInqMat{" + "results=" + Arrays.deepToString(results) + '}';
    }
    
    
}

