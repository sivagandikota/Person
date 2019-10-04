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
public class DeliveryDocumentGetTrackingNum {
    @SerializedName("__metadata")
    private MetaData metadata = null;

    @SerializedName("DeliveryNumber")
    private String deliveryNumber = null;
    
    @SerializedName("DeliveryItemNumber")
    private String deliveryItemNumber = null;
    
    @SerializedName("TrackingNumber")
    private String trackingNumber = null;

    public MetaData getMetadata() {
        return metadata;
    }

    public void setMetadata(MetaData metadata) {
        this.metadata = metadata;
    }

    public String getDeliveryNumber() {
        return deliveryNumber;
    }

    public void setDeliveryNumber(String deliveryNumber) {
        this.deliveryNumber = deliveryNumber;
    }

    public String getDeliveryItemNumber() {
        return deliveryItemNumber;
    }

    public void setDeliveryItemNumber(String deliveryItemNumber) {
        this.deliveryItemNumber = deliveryItemNumber;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String toString() {
        return "DeliveryDocumentGetTrackingNum{" + "metadata=" + metadata + ", deliveryNumber=" + deliveryNumber + ", deliveryItemNumber=" + deliveryItemNumber + ", trackingNumber=" + trackingNumber + '}';
    }

    
}
