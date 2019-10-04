/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author SrinivasBu
 */
public class CollectionOfDeliveryDocumentGetPO {

    @SerializedName("results")
    private DeliveryDocumentGetPO results = null;

    public DeliveryDocumentGetPO getResults() {
        return results;
    }

    public void setResults(DeliveryDocumentGetPO results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "CollectionOfDeliveryDocumentGetPO{" + "results=" + results + '}';
    }
    
    
}
