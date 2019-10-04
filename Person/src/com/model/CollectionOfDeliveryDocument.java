/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;


import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author SrinivasBu
 */
public class CollectionOfDeliveryDocument {
    @SerializedName("results")
	  private DeliveryDocument[] results = null;

    public DeliveryDocument[] getResults() {
        return results;
    }

    public void setResults(DeliveryDocument[] results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "CollectionOfDeliveryDocument{" + "results=" + Arrays.deepToString(results) + '}';
    }
    
    
}
