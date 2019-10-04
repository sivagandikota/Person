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
public class OrderList {

    @SerializedName("__metadata")
    private MetaData metadata = null;

    @SerializedName("SalesOrder")
    private String salesOrder = null;

    @SerializedName("SalesOrderType")
    private String salesOrderType = null;

    @SerializedName("SalesOrganization")
    private String salesOrganization = null;

    @SerializedName("SalesOrderDate")
    private String salesOrderDate = null;

    @SerializedName("PurchaseOrderByCustomer")
    private String purchaseOrderByCustomer = null;

    @SerializedName("NameOfOrderer")
    private String nameOfOrderer = null;

    @SerializedName("CreationDate")
    private String creationDate = null;

    @SerializedName("EntryTime")
    private String EntryTime = null;

    @SerializedName("CreatedByUser")
    private String createdByUser = null;

    @SerializedName("FullNameOfPerson")
    private String fullName = null;

    @SerializedName("SoldToParty")
    private String soldToParty = null;

    @SerializedName("ShipToParty")
    private String shipToParty = null;

    @SerializedName("Territory")
    private String territory = null;

    @SerializedName("ShippingCondition")
    private String shippingCondition = null;
    

    @SerializedName("DescriptionOfTheShippingConditions")
    private String descriptionOfTheShippingConditions = null;

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

    public String getSalesOrderType() {
        return salesOrderType;
    }

    public void setSalesOrderType(String salesOrderType) {
        this.salesOrderType = salesOrderType;
    }

    public String getSalesOrganization() {
        return salesOrganization;
    }

    public void setSalesOrganization(String salesOrganization) {
        this.salesOrganization = salesOrganization;
    }

    public String getSalesOrderDate() {
        return salesOrderDate;
    }

    public void setSalesOrderDate(String salesOrderDate) {
        this.salesOrderDate = salesOrderDate;
    }

    public String getPurchaseOrderByCustomer() {
        return purchaseOrderByCustomer;
    }

    public void setPurchaseOrderByCustomer(String purchaseOrderByCustomer) {
        this.purchaseOrderByCustomer = purchaseOrderByCustomer;
    }

    public String getNameOfOrderer() {
        return nameOfOrderer;
    }

    public void setNameOfOrderer(String nameOfOrderer) {
        this.nameOfOrderer = nameOfOrderer;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getEntryTime() {
        return EntryTime;
    }

    public void setEntryTime(String EntryTime) {
        this.EntryTime = EntryTime;
    }

    public String getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(String createdByUser) {
        this.createdByUser = createdByUser;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSoldToParty() {
        return soldToParty;
    }

    public void setSoldToParty(String soldToParty) {
        this.soldToParty = soldToParty;
    }

    public String getShipToParty() {
        return shipToParty;
    }

    public void setShipToParty(String shipToParty) {
        this.shipToParty = shipToParty;
    }

    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }

    public String getShippingCondition() {
        return shippingCondition;
    }

    public void setShippingCondition(String shippingCondition) {
        this.shippingCondition = shippingCondition;
    }

    public String getDescriptionOfTheShippingConditions() {
        return descriptionOfTheShippingConditions;
    }

    public void setDescriptionOfTheShippingConditions(String descriptionOfTheShippingConditions) {
        this.descriptionOfTheShippingConditions = descriptionOfTheShippingConditions;
    }

    @Override
    public String toString() {
        return "OrderList{" + "metadata=" + metadata + ", salesOrder=" + salesOrder + ", salesOrderType=" + salesOrderType + ", salesOrganization=" + salesOrganization + ", salesOrderDate=" + salesOrderDate + ", purchaseOrderByCustomer=" + purchaseOrderByCustomer + ", nameOfOrderer=" + nameOfOrderer + ", creationDate=" + creationDate + ", EntryTime=" + EntryTime + ", createdByUser=" + createdByUser + ", fullName=" + fullName + ", soldToParty=" + soldToParty + ", shipToParty=" + shipToParty + ", territory=" + territory + ", shippingCondition=" + shippingCondition + ", descriptionOfTheShippingConditions=" + descriptionOfTheShippingConditions + '}';
    }

}
