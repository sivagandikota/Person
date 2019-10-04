package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class Docs {

	@SerializedName("BillingDocument")
	@JsonProperty("BillingDocument")
	private String BillingDocument = null;
	
	@SerializedName("BillingDocumentItem")
	@JsonProperty("BillingDocumentItem")
	private String BillingDocumentItem = null;
	
	@SerializedName("OriginallyRequestedMaterial")
	@JsonProperty("OriginallyRequestedMaterial")
	private String OriginallyRequestedMaterial = null;
	
	@SerializedName("BillingQuantity")
	@JsonProperty("BillingQuantity")
	private String BillingQuantity = null;
	
	@SerializedName("BillingQuantityUnit")
	@JsonProperty("BillingQuantityUnit")
	private String BillingQuantityUnit = null;
	
	@SerializedName("NetAmount")
	@JsonProperty("NetAmount")
	private String NetAmount = null;
	
	@SerializedName("TransactionCurrency")
	@JsonProperty("TransactionCurrency")
	private String TransactionCurrency = null;
	
	@SerializedName("ProductName")
	@JsonProperty("ProductName")
	private String ProductName = null;

	public String getBillingDocument() {
		return BillingDocument;
	}

	public void setBillingDocument(String billingDocument) {
		BillingDocument = billingDocument;
	}

	public String getBillingDocumentItem() {
		return BillingDocumentItem;
	}

	public void setBillingDocumentItem(String billingDocumentItem) {
		BillingDocumentItem = billingDocumentItem;
	}

	public String getOriginallyRequestedMaterial() {
		return OriginallyRequestedMaterial;
	}

	public void setOriginallyRequestedMaterial(String originallyRequestedMaterial) {
		OriginallyRequestedMaterial = originallyRequestedMaterial;
	}

	public String getBillingQuantity() {
		return BillingQuantity;
	}

	public void setBillingQuantity(String billingQuantity) {
		BillingQuantity = billingQuantity;
	}

	public String getBillingQuantityUnit() {
		return BillingQuantityUnit;
	}

	public void setBillingQuantityUnit(String billingQuantityUnit) {
		BillingQuantityUnit = billingQuantityUnit;
	}

	public String getNetAmount() {
		return NetAmount;
	}

	public void setNetAmount(String netAmount) {
		NetAmount = netAmount;
	}

	public String getTransactionCurrency() {
		return TransactionCurrency;
	}

	public void setTransactionCurrency(String transactionCurrency) {
		TransactionCurrency = transactionCurrency;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	@Override
	public String toString() {
		return "Docs [BillingDocument=" + BillingDocument + ", BillingDocumentItem=" + BillingDocumentItem
				+ ", OriginallyRequestedMaterial=" + OriginallyRequestedMaterial + ", BillingQuantity="
				+ BillingQuantity + ", BillingQuantityUnit=" + BillingQuantityUnit + ", NetAmount=" + NetAmount
				+ ", TransactionCurrency=" + TransactionCurrency + ", ProductName=" + ProductName + "]";
	}
	
	
}
