package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class PRODUCTS {

	@SerializedName("Product")
	@JsonProperty("Product")
	private String Product = null;
	
	@SerializedName("ProductGroup")
	@JsonProperty("ProductGroup")
	private String ProductGroup = null;
	
	@SerializedName("BaseUnit")
	@JsonProperty("BaseUnit")
	private String BaseUnit = null;
	
	@SerializedName("SalesMeasureUnit")
	@JsonProperty("SalesMeasureUnit")
	private String SalesMeasureUnit = null;
	
	@SerializedName("ProductName")
	@JsonProperty("ProductName")
	private String ProductName = null;
	
	@SerializedName("YY1_Producthierarchy_SAL")
	@JsonProperty("YY1_Producthierarchy_SAL")
	private String YY1_Producthierarchy_SAL = null;
	
	@SerializedName("YY1_PARENT_SAL")
	@JsonProperty("YY1_PARENT_SAL")
	private String YY1_PARENT_SAL=null;

	@SerializedName("ItemCategoryGroup")
	@JsonProperty("ItemCategoryGroup")
	private String ItemCategoryGroup=null;

	public String getProduct() {
		return Product;
	}

	public void setProduct(String product) {
		Product = product;
	}

	public String getProductGroup() {
		return ProductGroup;
	}

	public void setProductGroup(String productGroup) {
		ProductGroup = productGroup;
	}

	public String getBaseUnit() {
		return BaseUnit;
	}

	public void setBaseUnit(String baseUnit) {
		BaseUnit = baseUnit;
	}

	public String getSalesMeasureUnit() {
		return SalesMeasureUnit;
	}

	public void setSalesMeasureUnit(String salesMeasureUnit) {
		SalesMeasureUnit = salesMeasureUnit;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getYY1_Producthierarchy_SAL() {
		return YY1_Producthierarchy_SAL;
	}

	public void setYY1_Producthierarchy_SAL(String yY1_Producthierarchy_SAL) {
		YY1_Producthierarchy_SAL = yY1_Producthierarchy_SAL;
	}
	
	

	public String getYY1_PARENT_SAL() {
		return YY1_PARENT_SAL;
	}

	public void setYY1_PARENT_SAL(String yY1_PARENT_SAL) {
		YY1_PARENT_SAL = yY1_PARENT_SAL;
	}
	
	

	public String getItemCategoryGroup() {
		return ItemCategoryGroup;
	}

	public void setItemCategoryGroup(String itemCategoryGroup) {
		ItemCategoryGroup = itemCategoryGroup;
	}

	@Override
	public String toString() {
		return "PRODUCTS [Product=" + Product + ", ProductGroup=" + ProductGroup + ", BaseUnit=" + BaseUnit
				+ ", SalesMeasureUnit=" + SalesMeasureUnit + ", ProductName=" + ProductName
				+ ", YY1_Producthierarchy_SAL=" + YY1_Producthierarchy_SAL + ", YY1_PARENT_SAL=" + YY1_PARENT_SAL
				+ ", ItemCategoryGroup=" + ItemCategoryGroup + "]";
	}

	
	
	
	
}

