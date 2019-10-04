package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class ReturnProductsWrapper {

	
	private String Product = null;
	
    private String ProductName = null;
	
	private String Rate = null;

	public String getProduct() {
		return Product;
	}

	public void setProduct(String product) {
		Product = product;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getRate() {
		return Rate;
	}

	public void setRate(String rate) {
		Rate = rate;
	}

	@Override
	public String toString() {
		return "ReturnProductsWrapper [Product=" + Product + ", ProductName=" + ProductName + ", Rate=" + Rate + "]";
	}
	
}
