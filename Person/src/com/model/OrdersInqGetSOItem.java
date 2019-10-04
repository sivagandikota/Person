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
public class OrdersInqGetSOItem {

    @SerializedName("__metadata")
    private MetaData metadata = null;

    @SerializedName("SalesOrder")
    private String salesOrder = null;

    @SerializedName("SalesOrderItem")
    private String salesOrderItem = null;

    @SerializedName("SalesOrderItemCategory")
    private String salesOrderItemCategory = null;

    @SerializedName("TotalDeliveryStatus")
    private String totalDeliveryStatus = null;
    @SerializedName("Material")
    private String material = null;

    @SerializedName("OriginallyRequestedMaterial")
    private String originallyRequestedMaterial = null;

    @SerializedName("MaterialByCustomer")
    private String materialByCustomer = null;

    @SerializedName("Batch")
    private String batch = null;

    @SerializedName("AdditionalMaterialGroup2")
    private String additionalMaterialGroup2 = null;

    @SerializedName("Plant")
    private String plant = null;

    @SerializedName("StorageLocation")
    private String storageLocation = null;

    @SerializedName("OrderQuantityUnit")
    private String orderQuantityUnit = null;

    @SerializedName("TargetToBaseQuantityDnmntr")
    private String targetToBaseQuantityDnmntr = null;

    @SerializedName("TargetToBaseQuantityNmrtr")
    private String targetToBaseQuantityNmrtr = null;

    @SerializedName("ConfdDelivQtyInOrderQtyUnit")
    private String confdDelivQtyInOrderQtyUnit = null;

    @SerializedName("TargetDelivQtyInOrderQtyUni")
    private String targetDelivQtyInOrderQtyUni = null;

    @SerializedName("ConfdDeliveryQtyInBaseUnit")
    private String confdDeliveryQtyInBaseUnit = null;

    @SerializedName("BaseUnit")
    private String baseUnit = null;

    @SerializedName("SalesDocumentRjcnReason")
    private String salesDocumentRjcnReason = null;

    @SerializedName("SalesDocumentRjcnReasonName")
    private String salesDocumentRjcnReasonName = null;

    @SerializedName("NetAmount")
    private String netAmount = null;

    @SerializedName("Subtotal3Amount")
    private String subtotal3Amount = null;

    @SerializedName("ShippingPoint")
    private String shippingPoint = null;

    @SerializedName("ItemIsDeliveryRelevant")
    private String itemIsDeliveryRelevant = null;

    @SerializedName("ItemIsBillingRelevant")
    private String itemIsBillingRelevant = null;

    @SerializedName("PurchaseOrder")
    private String purchaseOrder = null;

    @SerializedName("ActualGoodsMovementDate")
    private String actualGoodsMovementDate = null;

    @SerializedName("Ordstat_text")
    private String ordstat_text = null;

    @SerializedName("Ordstat")
    private String ordstat = null;

    @SerializedName("ScheduleLineDeliveryDate")
    private String scheduleLineDeliveryDate = null;

    @SerializedName("TrackingNumber")
    private String trackingNumber = null;

    @SerializedName("DeliveryNumber")
    private String deliveryNumber = null;

    public MetaData getMetadata() {
        return metadata;
    }

    public void setMetadata(MetaData metadata) {
        this.metadata = metadata;
    }

    public String getSalesOrder() {
        return salesOrder;
    }

    public void setSalesOrder(String salesOrder) {
        this.salesOrder = salesOrder;
    }

    public String getSalesOrderItem() {
        return salesOrderItem;
    }

    public void setSalesOrderItem(String salesOrderItem) {
        this.salesOrderItem = salesOrderItem;
    }

    public String getSalesOrderItemCategory() {
        return salesOrderItemCategory;
    }

    public void setSalesOrderItemCategory(String salesOrderItemCategory) {
        this.salesOrderItemCategory = salesOrderItemCategory;
    }

    public String getTotalDeliveryStatus() {
        return totalDeliveryStatus;
    }

    public void setTotalDeliveryStatus(String totalDeliveryStatus) {
        this.totalDeliveryStatus = totalDeliveryStatus;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getOriginallyRequestedMaterial() {
        return originallyRequestedMaterial;
    }

    public void setOriginallyRequestedMaterial(String originallyRequestedMaterial) {
        this.originallyRequestedMaterial = originallyRequestedMaterial;
    }

    public String getMaterialByCustomer() {
        return materialByCustomer;
    }

    public void setMaterialByCustomer(String materialByCustomer) {
        this.materialByCustomer = materialByCustomer;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getAdditionalMaterialGroup2() {
        return additionalMaterialGroup2;
    }

    public void setAdditionalMaterialGroup2(String additionalMaterialGroup2) {
        this.additionalMaterialGroup2 = additionalMaterialGroup2;
    }

    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
    }

    public String getOrderQuantityUnit() {
        return orderQuantityUnit;
    }

    public void setOrderQuantityUnit(String orderQuantityUnit) {
        this.orderQuantityUnit = orderQuantityUnit;
    }

    public String getTargetToBaseQuantityDnmntr() {
        return targetToBaseQuantityDnmntr;
    }

    public void setTargetToBaseQuantityDnmntr(String targetToBaseQuantityDnmntr) {
        this.targetToBaseQuantityDnmntr = targetToBaseQuantityDnmntr;
    }

    public String getTargetToBaseQuantityNmrtr() {
        return targetToBaseQuantityNmrtr;
    }

    public void setTargetToBaseQuantityNmrtr(String targetToBaseQuantityNmrtr) {
        this.targetToBaseQuantityNmrtr = targetToBaseQuantityNmrtr;
    }

    public String getConfdDelivQtyInOrderQtyUnit() {
        return confdDelivQtyInOrderQtyUnit;
    }

    public void setConfdDelivQtyInOrderQtyUnit(String confdDelivQtyInOrderQtyUnit) {
        this.confdDelivQtyInOrderQtyUnit = confdDelivQtyInOrderQtyUnit;
    }

    public String getTargetDelivQtyInOrderQtyUni() {
        return targetDelivQtyInOrderQtyUni;
    }

    public void setTargetDelivQtyInOrderQtyUni(String targetDelivQtyInOrderQtyUni) {
        this.targetDelivQtyInOrderQtyUni = targetDelivQtyInOrderQtyUni;
    }

    public String getConfdDeliveryQtyInBaseUnit() {
        return confdDeliveryQtyInBaseUnit;
    }

    public void setConfdDeliveryQtyInBaseUnit(String confdDeliveryQtyInBaseUnit) {
        this.confdDeliveryQtyInBaseUnit = confdDeliveryQtyInBaseUnit;
    }

    public String getBaseUnit() {
        return baseUnit;
    }

    public void setBaseUnit(String baseUnit) {
        this.baseUnit = baseUnit;
    }

    public String getSalesDocumentRjcnReason() {
        return salesDocumentRjcnReason;
    }

    public void setSalesDocumentRjcnReason(String salesDocumentRjcnReason) {
        this.salesDocumentRjcnReason = salesDocumentRjcnReason;
    }

    public String getSalesDocumentRjcnReasonName() {
        return salesDocumentRjcnReasonName;
    }

    public void setSalesDocumentRjcnReasonName(String salesDocumentRjcnReasonName) {
        this.salesDocumentRjcnReasonName = salesDocumentRjcnReasonName;
    }

    public String getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(String netAmount) {
        this.netAmount = netAmount;
    }

    public String getSubtotal3Amount() {
        return subtotal3Amount;
    }

    public void setSubtotal3Amount(String subtotal3Amount) {
        this.subtotal3Amount = subtotal3Amount;
    }

    public String getShippingPoint() {
        return shippingPoint;
    }

    public void setShippingPoint(String shippingPoint) {
        this.shippingPoint = shippingPoint;
    }

    public String getItemIsDeliveryRelevant() {
        return itemIsDeliveryRelevant;
    }

    public void setItemIsDeliveryRelevant(String itemIsDeliveryRelevant) {
        this.itemIsDeliveryRelevant = itemIsDeliveryRelevant;
    }

    public String getItemIsBillingRelevant() {
        return itemIsBillingRelevant;
    }

    public void setItemIsBillingRelevant(String itemIsBillingRelevant) {
        this.itemIsBillingRelevant = itemIsBillingRelevant;
    }

    public String getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(String purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public String getActualGoodsMovementDate() {
        return actualGoodsMovementDate;
    }

    public void setActualGoodsMovementDate(String actualGoodsMovementDate) {
        this.actualGoodsMovementDate = actualGoodsMovementDate;
    }

    public String getOrdstat_text() {
        return ordstat_text;
    }

    public void setOrdstat_text(String ordstat_text) {
        this.ordstat_text = ordstat_text;
    }

    public String getOrdstat() {
        return ordstat;
    }

    public void setOrdstat(String ordstat) {
        this.ordstat = ordstat;
    }

    public String getScheduleLineDeliveryDate() {
        return scheduleLineDeliveryDate;
    }

    public void setScheduleLineDeliveryDate(String scheduleLineDeliveryDate) {
        this.scheduleLineDeliveryDate = scheduleLineDeliveryDate;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getDeliveryNumber() {
        return deliveryNumber;
    }

    public void setDeliveryNumber(String deliveryNumber) {
        this.deliveryNumber = deliveryNumber;
    }

    @Override
    public String toString() {
        return "OrdersInqGetSOItem{" + "metadata=" + metadata + ", salesOrder=" + salesOrder + ", salesOrderItem=" + salesOrderItem + ", salesOrderItemCategory=" + salesOrderItemCategory + ", totalDeliveryStatus=" + totalDeliveryStatus + ", material=" + material + ", originallyRequestedMaterial=" + originallyRequestedMaterial + ", materialByCustomer=" + materialByCustomer + ", batch=" + batch + ", additionalMaterialGroup2=" + additionalMaterialGroup2 + ", plant=" + plant + ", storageLocation=" + storageLocation + ", orderQuantityUnit=" + orderQuantityUnit + ", targetToBaseQuantityDnmntr=" + targetToBaseQuantityDnmntr + ", targetToBaseQuantityNmrtr=" + targetToBaseQuantityNmrtr + ", confdDelivQtyInOrderQtyUnit=" + confdDelivQtyInOrderQtyUnit + ", targetDelivQtyInOrderQtyUni=" + targetDelivQtyInOrderQtyUni + ", confdDeliveryQtyInBaseUnit=" + confdDeliveryQtyInBaseUnit + ", baseUnit=" + baseUnit + ", salesDocumentRjcnReason=" + salesDocumentRjcnReason + ", salesDocumentRjcnReasonName=" + salesDocumentRjcnReasonName + ", netAmount=" + netAmount + ", subtotal3Amount=" + subtotal3Amount + ", shippingPoint=" + shippingPoint + ", itemIsDeliveryRelevant=" + itemIsDeliveryRelevant + ", itemIsBillingRelevant=" + itemIsBillingRelevant + ", purchaseOrder=" + purchaseOrder + ", actualGoodsMovementDate=" + actualGoodsMovementDate + ", ordstat_text=" + ordstat_text + ", ordstat=" + ordstat + ", scheduleLineDeliveryDate=" + scheduleLineDeliveryDate + ", trackingNumber=" + trackingNumber + ", deliveryNumber=" + deliveryNumber + '}';
    }
}
