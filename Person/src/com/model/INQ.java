package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class INQ {

	@SerializedName("ProductGroupName")
	@JsonProperty("ProductGroupName")
	private String ProductGroupName = null;
	
	@SerializedName("SAP_Description")
	@JsonProperty("SAP_Description")
	private String SAP_Description = null;

	public String getProductGroupName() {
		return ProductGroupName;
	}

	public void setProductGroupName(String productGroupName) {
		ProductGroupName = productGroupName;
	}

	public String getSAP_Description() {
		return SAP_Description;
	}

	public void setSAP_Description(String sAP_Description) {
		SAP_Description = sAP_Description;
	}

	@Override
	public String toString() {
		return "INQ [ProductGroupName=" + ProductGroupName + ", SAP_Description=" + SAP_Description + "]";
	}
	
}
