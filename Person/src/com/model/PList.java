package com.model;

import java.util.ArrayList;

public class PList {

	private String Result = null;
	private String brand=null;
	private String bookName=null;
	
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "PList [Result=" + Result + ", brand=" + brand + ", bookName=" + bookName + ", Products=" + Products
				+ "]";
	}

	

	
	
}
