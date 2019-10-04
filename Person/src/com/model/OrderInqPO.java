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
public class OrderInqPO {

    @SerializedName("__metadata")
    private MetaData metadata = null;

    @SerializedName("SalesOrder")
    private String salesOrder = null;

    @SerializedName("PurchaseOrder")
    private String purchaseOrder = null;

    @SerializedName("ReleaseIsNotCompleted")
    private String releaseIsNotCompleted = null;

    @SerializedName("SalesOrderItem")
    private String salesOrderItem = null;

    @SerializedName("ScheduleLineDeliveryDate")
    private String scheduleLineDeliveryDate = null;

    @SerializedName("Ordstat")
    private String ordstat = null;

    @SerializedName("Material")
    private String material = null;

    @SerializedName("Ordstat_text")
    private String ordstat_text = null;

    @SerializedName("Batch")
    private String batch = null;

    @SerializedName("ReqDeliveryDate")
    private String reqDeliveryDate = null;

    @SerializedName("ConfQuantityInSU")
    private String confQuantityInSU = null;

    @SerializedName("SalesUnit")
    private String salesUnit = null;

    @SerializedName("ActualGoodsMovementDate")
    private String actualGoodsMovementDate = null;

    @SerializedName("ShippingPoint")
    private String shippingPoint = null;

    @SerializedName("ScheduleLineOrderQuantity")
    private String scheduleLineOrderQuantity = null;

    @SerializedName("DeliveryDocument")
    private String deliveryDocument = null;

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

    public String getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(String purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public String getReleaseIsNotCompleted() {
        return releaseIsNotCompleted;
    }

    public void setReleaseIsNotCompleted(String releaseIsNotCompleted) {
        this.releaseIsNotCompleted = releaseIsNotCompleted;
    }

    public String getSalesOrderItem() {
        return salesOrderItem;
    }

    public void setSalesOrderItem(String salesOrderItem) {
        this.salesOrderItem = salesOrderItem;
    }

    public String getScheduleLineDeliveryDate() {
        return scheduleLineDeliveryDate;
    }

    public void setScheduleLineDeliveryDate(String scheduleLineDeliveryDate) {
        this.scheduleLineDeliveryDate = scheduleLineDeliveryDate;
    }

    public String getOrdstat() {
        return ordstat;
    }

    public void setOrdstat(String ordstat) {
        this.ordstat = ordstat;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getOrdstat_text() {
        return ordstat_text;
    }

    public void setOrdstat_text(String ordstat_text) {
        this.ordstat_text = ordstat_text;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getReqDeliveryDate() {
        return reqDeliveryDate;
    }

    public void setReqDeliveryDate(String reqDeliveryDate) {
        this.reqDeliveryDate = reqDeliveryDate;
    }

    public String getConfQuantityInSU() {
        return confQuantityInSU;
    }

    public void setConfQuantityInSU(String confQuantityInSU) {
        this.confQuantityInSU = confQuantityInSU;
    }

    public String getSalesUnit() {
        return salesUnit;
    }

    public void setSalesUnit(String salesUnit) {
        this.salesUnit = salesUnit;
    }

    public String getActualGoodsMovementDate() {
        return actualGoodsMovementDate;
    }

    public void setActualGoodsMovementDate(String actualGoodsMovementDate) {
        this.actualGoodsMovementDate = actualGoodsMovementDate;
    }

    public String getShippingPoint() {
        return shippingPoint;
    }

    public void setShippingPoint(String shippingPoint) {
        this.shippingPoint = shippingPoint;
    }

    public String getScheduleLineOrderQuantity() {
        return scheduleLineOrderQuantity;
    }

    public void setScheduleLineOrderQuantity(String scheduleLineOrderQuantity) {
        this.scheduleLineOrderQuantity = scheduleLineOrderQuantity;
    }

    public String getDeliveryDocument() {
        return deliveryDocument;
    }

    public void setDeliveryDocument(String deliveryDocument) {
        this.deliveryDocument = deliveryDocument;
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
        return "OrderInqPO{" + "metadata=" + metadata + ", salesOrder=" + salesOrder + ", purchaseOrder=" + purchaseOrder + ", releaseIsNotCompleted=" + releaseIsNotCompleted + ", salesOrderItem=" + salesOrderItem + ", scheduleLineDeliveryDate=" + scheduleLineDeliveryDate + ", ordstat=" + ordstat + ", material=" + material + ", ordstat_text=" + ordstat_text + ", batch=" + batch + ", reqDeliveryDate=" + reqDeliveryDate + ", confQuantityInSU=" + confQuantityInSU + ", salesUnit=" + salesUnit + ", actualGoodsMovementDate=" + actualGoodsMovementDate + ", shippingPoint=" + shippingPoint + ", scheduleLineOrderQuantity=" + scheduleLineOrderQuantity + ", deliveryDocument=" + deliveryDocument + ", trackingNumber=" + trackingNumber + ", deliveryNumber=" + deliveryNumber + '}';
    }

}
