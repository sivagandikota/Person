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
 * @author Shivas
 */
public class StockStatus {

    @SerializedName("__metadata")
    private MetaData metadata = null;

    @SerializedName("Customer")
    private String customer = null;

    @SerializedName("SalesOrganization")
    private String salesOrganization = null;

    @SerializedName("DistributionChannel")
    private String distributionChannel = null;

    @SerializedName("ProductGroup")
    private String productGroup = null;

    @SerializedName("BaseUnit")
    private String baseUnit = null;

    @SerializedName("ProductHierarchy")
    private String productHierarchy = null;

    @SerializedName("Product")
    private String product = null;

    @SerializedName("Brand")
    private String brand = null;

    @SerializedName("Brandcode")
    private String brandcode = null;

    @SerializedName("SAP_Description")
    private String brand_Desc = null;

    @SerializedName("MaterialGroup")
    private String materialGroup = null;

    @SerializedName("ProductDescription")
    private String productDescription = null;

    @SerializedName("DeliveryQuantity")
    private String deliveryQuantity = null;

    @SerializedName("ProductSalesOrg")
    private String productSalesOrg = null;

    @SerializedName("ProductDistributionChnl")
    private String productDistributionChnl = null;

    @SerializedName("ItemCategoryGroup")
    private String itemCategoryGroup = null;

    @SerializedName("YY1_Mara_Sample_ind_PRD")
    private String sampleMat = null;

    @SerializedName("AvailableQuantityInBaseUnit")
    private String availableQuantityInBaseUnit = null;

    public MetaData getMetadata() {
        return metadata;
    }

    public void setMetadata(MetaData metadata) {
        this.metadata = metadata;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
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

    public String getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(String productGroup) {
        this.productGroup = productGroup;
    }

    public String getBaseUnit() {
        return baseUnit;
    }

    public void setBaseUnit(String baseUnit) {
        this.baseUnit = baseUnit;
    }

    public String getProductHierarchy() {
        return productHierarchy;
    }

    public void setProductHierarchy(String productHierarchy) {
        this.productHierarchy = productHierarchy;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrandcode() {
        return brandcode;
    }

    public void setBrandcode(String brandcode) {
        this.brandcode = brandcode;
    }

    public String getBrand_Desc() {
        return brand_Desc;
    }

    public void setBrand_Desc(String brand_Desc) {
        this.brand_Desc = brand_Desc;
    }

    public String getMaterialGroup() {
        return materialGroup;
    }

    public void setMaterialGroup(String materialGroup) {
        this.materialGroup = materialGroup;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getDeliveryQuantity() {
        return deliveryQuantity;
    }

    public void setDeliveryQuantity(String deliveryQuantity) {
        this.deliveryQuantity = deliveryQuantity;
    }

    public String getProductSalesOrg() {
        return productSalesOrg;
    }

    public void setProductSalesOrg(String productSalesOrg) {
        this.productSalesOrg = productSalesOrg;
    }

    public String getProductDistributionChnl() {
        return productDistributionChnl;
    }

    public void setProductDistributionChnl(String productDistributionChnl) {
        this.productDistributionChnl = productDistributionChnl;
    }

    public String getItemCategoryGroup() {
        return itemCategoryGroup;
    }

    public void setItemCategoryGroup(String itemCategoryGroup) {
        this.itemCategoryGroup = itemCategoryGroup;
    }

    public String getSampleMat() {
        return sampleMat;
    }

    public void setSampleMat(String sampleMat) {
        this.sampleMat = sampleMat;
    }

    public String getAvailableQuantityInBaseUnit() {
        return availableQuantityInBaseUnit;
    }

    public void setAvailableQuantityInBaseUnit(String availableQuantityInBaseUnit) {
        this.availableQuantityInBaseUnit = availableQuantityInBaseUnit;
    }

    @Override
    public String toString() {
        return "StockStatus{" + "metadata=" + metadata + ", customer=" + customer + ", salesOrganization=" + salesOrganization + ", distributionChannel=" + distributionChannel + ", productGroup=" + productGroup + ", baseUnit=" + baseUnit + ", productHierarchy=" + productHierarchy + ", product=" + product + ", brand=" + brand + ", brandcode=" + brandcode + ", brand_Desc=" + brand_Desc + ", materialGroup=" + materialGroup + ", productDescription=" + productDescription + ", deliveryQuantity=" + deliveryQuantity + ", productSalesOrg=" + productSalesOrg + ", productDistributionChnl=" + productDistributionChnl + ", itemCategoryGroup=" + itemCategoryGroup + ", sampleMat=" + sampleMat + ", availableQuantityInBaseUnit=" + availableQuantityInBaseUnit + '}';
    }
}
