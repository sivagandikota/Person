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
public class OrdersInqGetSO {

    @SerializedName("__metadata")
    private MetaData metadata = null;

    @SerializedName("SalesOrder")
    private String salesOrder = null;

    @SerializedName("ShipToParty")
    private String shipToParty = null;

    @SerializedName("DeliveryBlockReason")
    private String deliveryBlockReason = null;

    @SerializedName("completeDeliveryIsDefined")
    private String completeDeliveryIsDefined = null;

    @SerializedName("ControllingObject")
    private String controllingObject = null;

    @SerializedName("SoldToParty")
    private String soldToParty = null;

    @SerializedName("SalesOrganization")
    private String salesOrganization = null;

    @SerializedName("DistributionChannel")
    private String distributionChannel = null;

    @SerializedName("TotalCreditCheckStatus")
    private String totalCreditCheckStatus = null;

    @SerializedName("PurchaseOrderByCustomer")
    private String purchaseOrderByCustomer = null;

    @SerializedName("OverallDeliveryStatus")
    private String overallDeliveryStatus = null;

    @SerializedName("PartnerFunction")
    private String partnerFunction = null;

    @SerializedName("Customer")
    private String customer = null;

    @SerializedName("OverallSDProcessStatus")
    private String overallSDProcessStatus = null;

    @SerializedName("BusinessPartner")
    private String businessPartner = null;

    @SerializedName("FullName")
    private String fullName = null;

    @SerializedName("StreetName")
    private String streetName = null;

    @SerializedName("CityName")
    private String cityName = null;

    @SerializedName("Region")
    private String region = null;

    @SerializedName("PostalCode")
    private String postalCode = null;

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

    public String getShipToParty() {
        return shipToParty;
    }

    public void setShipToParty(String shipToParty) {
        this.shipToParty = shipToParty;
    }

    public String getDeliveryBlockReason() {
        return deliveryBlockReason;
    }

    public void setDeliveryBlockReason(String deliveryBlockReason) {
        this.deliveryBlockReason = deliveryBlockReason;
    }

    public String getCompleteDeliveryIsDefined() {
        return completeDeliveryIsDefined;
    }

    public void setCompleteDeliveryIsDefined(String completeDeliveryIsDefined) {
        this.completeDeliveryIsDefined = completeDeliveryIsDefined;
    }

    public String getControllingObject() {
        return controllingObject;
    }

    public void setControllingObject(String controllingObject) {
        this.controllingObject = controllingObject;
    }

    public String getSoldToParty() {
        return soldToParty;
    }

    public void setSoldToParty(String soldToParty) {
        this.soldToParty = soldToParty;
    }

    public String getSalesOrganization() {
        return salesOrganization;
    }

    public void setSalesOrganization(String salesOrganization) {
        this.salesOrganization = salesOrganization;
    }

    public String getDistributionChannel() {
        return distributionChannel;
    }

    public void setDistributionChannel(String distributionChannel) {
        this.distributionChannel = distributionChannel;
    }

    public String getTotalCreditCheckStatus() {
        return totalCreditCheckStatus;
    }

    public void setTotalCreditCheckStatus(String totalCreditCheckStatus) {
        this.totalCreditCheckStatus = totalCreditCheckStatus;
    }

    public String getPurchaseOrderByCustomer() {
        return purchaseOrderByCustomer;
    }

    public void setPurchaseOrderByCustomer(String purchaseOrderByCustomer) {
        this.purchaseOrderByCustomer = purchaseOrderByCustomer;
    }

    public String getOverallDeliveryStatus() {
        return overallDeliveryStatus;
    }

    public void setOverallDeliveryStatus(String overallDeliveryStatus) {
        this.overallDeliveryStatus = overallDeliveryStatus;
    }

    public String getPartnerFunction() {
        return partnerFunction;
    }

    public void setPartnerFunction(String partnerFunction) {
        this.partnerFunction = partnerFunction;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getOverallSDProcessStatus() {
        return overallSDProcessStatus;
    }

    public void setOverallSDProcessStatus(String overallSDProcessStatus) {
        this.overallSDProcessStatus = overallSDProcessStatus;
    }

    public String getBusinessPartner() {
        return businessPartner;
    }

    public void setBusinessPartner(String businessPartner) {
        this.businessPartner = businessPartner;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "OrdersInqGetSO{" + "metadata=" + metadata + ", salesOrder=" + salesOrder + ", shipToParty=" + shipToParty + ", deliveryBlockReason=" + deliveryBlockReason + ", completeDeliveryIsDefined=" + completeDeliveryIsDefined + ", controllingObject=" + controllingObject + ", soldToParty=" + soldToParty + ", salesOrganization=" + salesOrganization + ", distributionChannel=" + distributionChannel + ", totalCreditCheckStatus=" + totalCreditCheckStatus + ", purchaseOrderByCustomer=" + purchaseOrderByCustomer + ", overallDeliveryStatus=" + overallDeliveryStatus + ", partnerFunction=" + partnerFunction + ", customer=" + customer + ", overallSDProcessStatus=" + overallSDProcessStatus + ", businessPartner=" + businessPartner + ", fullName=" + fullName + ", streetName=" + streetName + ", cityName=" + cityName + ", region=" + region + ", postalCode=" + postalCode + '}';
    }

}
