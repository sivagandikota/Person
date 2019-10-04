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
public class CollectionOfDeliveryDocumentGetTrackingNum {
    @SerializedName("results")
    private DeliveryDocumentGetTrackingNum[] results = null;

    public DeliveryDocumentGetTrackingNum[] getResults() {
        return results;
    }

    public void setResults(DeliveryDocumentGetTrackingNum[] results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "CollectionOfDeliveryDocumentGetTrackingNum{" + "results=" + Arrays.deepToString(results) + '}';
    }
    
}
