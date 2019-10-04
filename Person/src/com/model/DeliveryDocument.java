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
public class DeliveryDocument {

    @SerializedName("__metadata")
    private MetaData metadata = null;

    @SerializedName("SDDocumentCategory")
    private String sDDocumentCategory = null;

    @SerializedName("SalesOrganization")
    private String salesOrganization = null;

    @SerializedName("SoldToParty")
    private String soldToParty = null;

    @SerializedName("OverallGoodsMovementStatus")
    private String overallGoodsMovementStatus = null;

    @SerializedName("DeliveryDocument")
    private String deliveryDocument = null;

    @SerializedName("PlannedGoodsIssueDate")
    private String plannedGoodsIssueDate = null;
    
    @SerializedName("Status")
    private String status = null;
    
    @SerializedName("TrackingNumber")
    private String trackingNumber = null;

    @SerializedName("PurchaseOrderByCustomer")
    private String poNumber = null;

    public String getStatus() {
        return status;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    
    
    public String getPlannedGoodsIssueDate() {
        return plannedGoodsIssueDate;
    }

    public void setPlannedGoodsIssueDate(String plannedGoodsIssueDate) {
        this.plannedGoodsIssueDate = plannedGoodsIssueDate;
    }

    public MetaData getMetadata() {
        return metadata;
    }

    public void setMetadata(MetaData metadata) {
        this.metadata = metadata;
    }

    public String getsDDocumentCategory() {
        return sDDocumentCategory;
    }

    public void setsDDocumentCategory(String sDDocumentCategory) {
        this.sDDocumentCategory = sDDocumentCategory;
    }

    public String getSalesOrganization() {
        return salesOrganization;
    }

    public void setSalesOrganization(String salesOrganization) {
        this.salesOrganization = salesOrganization;
    }

    public String getSoldToParty() {
        return soldToParty;
    }

    public void setSoldToParty(String soldToParty) {
        this.soldToParty = soldToParty;
    }

    public String getOverallGoodsMovementStatus() {
        return overallGoodsMovementStatus;
    }

    public void setOverallGoodsMovementStatus(String overallGoodsMovementStatus) {
        this.overallGoodsMovementStatus = overallGoodsMovementStatus;
    }

    public String getDeliveryDocument() {
        return deliveryDocument;
    }

    public void setDeliveryDocument(String deliveryDocument) {
        this.deliveryDocument = deliveryDocument;
    }

    @Override
    public String toString() {
        return "DeliveryDocument{" + "metadata=" + metadata + ", sDDocumentCategory=" + sDDocumentCategory + ", salesOrganization=" + salesOrganization + ", soldToParty=" + soldToParty + ", overallGoodsMovementStatus=" + overallGoodsMovementStatus + ", deliveryDocument=" + deliveryDocument + ", plannedGoodsIssueDate=" + plannedGoodsIssueDate + ", status=" + status + ", trackingNumber=" + trackingNumber + ", poNumber=" + poNumber + '}';
    }   
}
