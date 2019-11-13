package com.model;

public class B2BAddItemWrapper {
	private String result="";
	private String Batch="";
	private String itemNumber="";
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getBatch() {
		return Batch;
	}
	public void setBatch(String batch) {
		Batch = batch;
	}
	public String getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}
	@Override
	public String toString() {
		return "B2BAddItemWrapper [result=" + result + ", Batch=" + Batch + ", itemNumber=" + itemNumber + "]";
	}
	
	

}
