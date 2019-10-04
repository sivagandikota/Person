package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class INVOICELIST {
	private String InvoiceNumber = null;

	private String InvoiceType = null; 
	private String InvoiceDate = null;
	private String PurchaseOrderByCustomer = null;
	private String SalesDocument = null;
	private String Delivery = null;
	private String SDDocumentCategory = null;
	

	private String Territory = null;
	private String ActualGoodsMovementDate = null;
	private String ShippingCondition = null;
	private String ShippingConditionName = null;
	private String ShippingPoint = null;
	private String Vtext = null;
	private String TaxAmount = null;
	private String GSTAmount = null;
	private String FrieghtAmount = null;
	private String HandlingAmount = null;
	private String TotalAmount = null;
	private String Currency = null;
	public String getInvoiceNumber() {
		return InvoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		InvoiceNumber = invoiceNumber;
	}
	public String getInvoiceType() {
		return InvoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		InvoiceType = invoiceType;
	}
	public String getInvoiceDate() {
		return InvoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		InvoiceDate = invoiceDate;
	}
	public String getPurchaseOrderByCustomer() {
		return PurchaseOrderByCustomer;
	}
	public void setPurchaseOrderByCustomer(String purchaseOrderByCustomer) {
		PurchaseOrderByCustomer = purchaseOrderByCustomer;
	}
	public String getSalesDocument() {
		return SalesDocument;
	}
	public void setSalesDocument(String salesDocument) {
		SalesDocument = salesDocument;
	}
	public String getDelivery() {
		return Delivery;
	}
	public void setDelivery(String delivery) {
		Delivery = delivery;
	}
	public String getSDDocumentCategory() {
		return SDDocumentCategory;
	}
	public void setSDDocumentCategory(String sDDocumentCategory) {
		SDDocumentCategory = sDDocumentCategory;
	}
	public String getTerritory() {
		return Territory;
	}
	public void setTerritory(String territory) {
		Territory = territory;
	}
	public String getActualGoodsMovementDate() {
		return ActualGoodsMovementDate;
	}
	public void setActualGoodsMovementDate(String actualGoodsMovementDate) {
		ActualGoodsMovementDate = actualGoodsMovementDate;
	}
	public String getShippingCondition() {
		return ShippingCondition;
	}
	public void setShippingCondition(String shippingCondition) {
		ShippingCondition = shippingCondition;
	}
	public String getShippingConditionName() {
		return ShippingConditionName;
	}
	public void setShippingConditionName(String shippingConditionName) {
		ShippingConditionName = shippingConditionName;
	}
	public String getShippingPoint() {
		return ShippingPoint;
	}
	public void setShippingPoint(String shippingPoint) {
		ShippingPoint = shippingPoint;
	}
	public String getVtext() {
		return Vtext;
	}
	public void setVtext(String vtext) {
		Vtext = vtext;
	}
	public String getTaxAmount() {
		return TaxAmount;
	}
	public void setTaxAmount(String taxAmount) {
		TaxAmount = taxAmount;
	}
	public String getGSTAmount() {
		return GSTAmount;
	}
	public void setGSTAmount(String gSTAmount) {
		GSTAmount = gSTAmount;
	}
	public String getFrieghtAmount() {
		return FrieghtAmount;
	}
	public void setFrieghtAmount(String frieghtAmount) {
		FrieghtAmount = frieghtAmount;
	}
	public String getHandlingAmount() {
		return HandlingAmount;
	}
	public void setHandlingAmount(String handlingAmount) {
		HandlingAmount = handlingAmount;
	}
	public String getTotalAmount() {
		return TotalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		TotalAmount = totalAmount;
	}
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	@Override
	public String toString() {
		return "INVOICELIST [InvoiceNumber=" + InvoiceNumber + ", InvoiceType=" + InvoiceType + ", InvoiceDate="
				+ InvoiceDate + ", PurchaseOrderByCustomer=" + PurchaseOrderByCustomer + ", SalesDocument="
				+ SalesDocument + ", Delivery=" + Delivery + ", SDDocumentCategory=" + SDDocumentCategory
				+ ", Territory=" + Territory + ", ActualGoodsMovementDate=" + ActualGoodsMovementDate
				+ ", ShippingCondition=" + ShippingCondition + ", ShippingConditionName=" + ShippingConditionName
				+ ", ShippingPoint=" + ShippingPoint + ", Vtext=" + Vtext + ", TaxAmount=" + TaxAmount + ", GSTAmount="
				+ GSTAmount + ", FrieghtAmount=" + FrieghtAmount + ", HandlingAmount=" + HandlingAmount
				+ ", TotalAmount=" + TotalAmount + ", Currency=" + Currency + "]";
	}
	
	
	

}
