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
public class CollectionOfValidCustWraper {
       @SerializedName("results")
    private ValidCust[] results = null;

    public ValidCust[] getResults() {
        return results;
    }

    public void setResults(ValidCust[] results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "CollectionOfValidCustWraper{" + "results=" + Arrays.deepToString(results) + '}';
    }
       
       
}
