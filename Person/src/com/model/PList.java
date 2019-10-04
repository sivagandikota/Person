package com.model;

import java.util.ArrayList;

public class PList {

	private String Result = null;
	
	private ArrayList<ReturnProductsWrapper> Products = null;

	public String getResult() {
		return Result;
	}

	public void setResult(String result) {
		Result = result;
	}

	public ArrayList<ReturnProductsWrapper> getProducts() {
		return Products;
	}

	public void setProducts(ArrayList<ReturnProductsWrapper> products) {
		Products = products;
	}

	@Override
	public String toString() {
		return "PList [Result=" + Result + ", Products=" + Products + "]";
	}

	
	
}
