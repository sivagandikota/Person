/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.MetaData;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author SrinivasBu
 */
public class DeliveryDocumentGetSO {
    @SerializedName("__metadata")
    private MetaData metadata = null;

    @SerializedName("DeliveryDocument")
    private String deliveryDocument = null;
    @SerializedName("ReferenceSDDocument")
    private String referenceSDDocument = null;

    public MetaData getMetadata() {
        return metadata;
    }

    public void setMetadata(MetaData metadata) {
        this.metadata = metadata;
    }

    public String getDeliveryDocument() {
        return deliveryDocument;
    }

    public void setDeliveryDocument(String deliveryDocument) {
        this.deliveryDocument = deliveryDocument;
    }

    public String getReferenceSDDocument() {
        return referenceSDDocument;
    }

    public void setReferenceSDDocument(String referenceSDDocument) {
        this.referenceSDDocument = referenceSDDocument;
    }

    @Override
    public String toString() {
        return "DeliveryDocumentGetSO{" + "metadata=" + metadata + ", deliveryDocument=" + deliveryDocument + ", referenceSDDocument=" + referenceSDDocument + '}';
    }
    
}
