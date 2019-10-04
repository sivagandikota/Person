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
public class PriceInqMat {

    @SerializedName("__metadata")
    private MetaData metadata = null;

    @SerializedName("Product")
    private String product = null;

    @SerializedName("ProductSalesOrg")
    private String productSalesOrg = null;

    @SerializedName("ProductDistributionChnl")
    private String productDistributionChnl = null;

    @SerializedName("ProductHierarchy")
    private String productHierarchy = null;

    @SerializedName("ProductDescription")
    private String productDescription = null;

    @SerializedName("ProductGroup")
    private String productGroup = null;

    @SerializedName("Longtextdescribingthemateria")
    private String longtextdescribingthemateria = null;

    @SerializedName("Brandcode")
    private String brandcode = null;

    @SerializedName("Brand")
    private String brand = null;

    @SerializedName("SAP_Description")
    private String brandDesc = null;

    @SerializedName("YY1_UMREZ_PRD")
    private String yY1_UMREZ_PRD = null;

    public MetaData getMetadata() {
        return metadata;
    }

    public void setMetadata(MetaData metadata) {
        this.metadata = metadata;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
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

    public String getProductHierarchy() {
        return productHierarchy;
    }

    public void setProductHierarchy(String productHierarchy) {
        this.productHierarchy = productHierarchy;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(String productGroup) {
        this.productGroup = productGroup;
    }

    public String getLongtextdescribingthemateria() {
        return longtextdescribingthemateria;
    }

    public void setLongtextdescribingthemateria(String longtextdescribingthemateria) {
        this.longtextdescribingthemateria = longtextdescribingthemateria;
    }

    public String getBrandcode() {
        return brandcode;
    }

    public void setBrandcode(String brandcode) {
        this.brandcode = brandcode;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrandDesc() {
        return brandDesc;
    }

    public void setBrandDesc(String brandDesc) {
        this.brandDesc = brandDesc;
    }

    public String getyY1_UMREZ_PRD() {
        return yY1_UMREZ_PRD;
    }

    public void setyY1_UMREZ_PRD(String yY1_UMREZ_PRD) {
        this.yY1_UMREZ_PRD = yY1_UMREZ_PRD;
    }

    @Override
    public String toString() {
        return "PriceInqMat{" + "metadata=" + metadata + ", product=" + product + ", productSalesOrg=" + productSalesOrg + ", productDistributionChnl=" + productDistributionChnl + ", productHierarchy=" + productHierarchy + ", productDescription=" + productDescription + ", productGroup=" + productGroup + ", longtextdescribingthemateria=" + longtextdescribingthemateria + ", brandcode=" + brandcode + ", brand=" + brand + ", brandDesc=" + brandDesc + ", yY1_UMREZ_PRD=" + yY1_UMREZ_PRD + '}';
    }
}
