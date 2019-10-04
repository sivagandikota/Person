package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class InvItems {
	@SerializedName("Customer")
	@JsonProperty("Customer")
	private String Customer = null;

	@SerializedName("FiscalPeriodEndDate")
	@JsonProperty("FiscalPeriodEndDate")
	private String FiscalPeriodEndDate = null;

	@SerializedName("PreviousFiscalPeriodStartDa")
	@JsonProperty("PreviousFiscalPeriodStartDa")
	private String PreviousFiscalPeriodStartDa = null;
	
	@SerializedName("BillingDocument")
	@JsonProperty("BillingDocument")
	private String BillingDocument = null;

	@SerializedName("BillingDocumentDate")
	@JsonProperty("BillingDocumentDate")
	private String BillingDocumentDate = null;

	@SerializedName("BillingDocumentIsCancelled")
	@JsonProperty("BillingDocumentIsCancelled")
	private String BillingDocumentIsCancelled = null;

	@SerializedName("SDDocumentCategory")
	@JsonProperty("SDDocumentCategory")
	private String SDDocumentCategory = null;
	
	@SerializedName("ShippingCondition")
	@JsonProperty("ShippingCondition")
	private String ShippingCondition = null;

	@SerializedName("PurchaseOrderByCustomer")
	@JsonProperty("PurchaseOrderByCustomer")
	private String PurchaseOrderByCustomer = null;

	@SerializedName("ReferenceSDDocument")
	@JsonProperty("ReferenceSDDocument")
	private String ReferenceSDDocument = null;

	@SerializedName("SalesDocument")
	@JsonProperty("SalesDocument")
	private String SalesDocument = null;

	@SerializedName("SalesGroup")
	@JsonProperty("SalesGroup")
	private String SalesGroup = null;

	@SerializedName("ShippingPoint")
	@JsonProperty("ShippingPoint")
	private String ShippingPoint = null;

	@SerializedName("SalesDocumentCondition")
	@JsonProperty("SalesDocumentCondition")
	private String SalesDocumentCondition = null;

	@SerializedName("TotalNetAmount")
	@JsonProperty("TotalNetAmount")
	private String TotalNetAmount = null;

	@SerializedName("TransactionCurrency")
	@JsonProperty("TransactionCurrency")
	private String TransactionCurrency = null;

	@SerializedName("ShippingConditionName")
	@JsonProperty("ShippingConditionName")
	private String ShippingConditionName = null;

	@SerializedName("SalesDocumentItemCategory")
	@JsonProperty("SalesDocumentItemCategory")
	private String SalesDocumentItemCategory = null;

	@SerializedName("ActualGoodsMovementDate")
	@JsonProperty("ActualGoodsMovementDate")
	private String ActualGoodsMovementDate = null;


	
	

	public String getFiscalPeriodEndDate() {
		return FiscalPeriodEndDate;
	}

	public void setFiscalPeriodEndDate(String fiscalPeriodEndDate) {
		FiscalPeriodEndDate = fiscalPeriodEndDate;
	}

	public String getPreviousFiscalPeriodStartDa() {
		return PreviousFiscalPeriodStartDa;
	}

	
	
	
	public void setPreviousFiscalPeriodStartDa(String previousFiscalPeriodStartDa) {
		PreviousFiscalPeriodStartDa = previousFiscalPeriodStartDa;
	}

	public String getBillingDocument() {
		return BillingDocument;
	}

	public void setBillingDocument(String billingDocument) {
		BillingDocument = billingDocument;
	}

	public String getBillingDocumentDate() {
		return BillingDocumentDate;
	}

	public void setBillingDocumentDate(String billingDocumentDate) {
		BillingDocumentDate = billingDocumentDate;
	}

	public String getBillingDocumentIsCancelled() {
		return BillingDocumentIsCancelled;
	}

	public void setBillingDocumentIsCancelled(String billingDocumentIsCancelled) {
		BillingDocumentIsCancelled = billingDocumentIsCancelled;
	}

	public String getSDDocumentCategory() {
		return SDDocumentCategory;
	}

	public void setSDDocumentCategory(String sDDocumentCategory) {
		SDDocumentCategory = sDDocumentCategory;
	}

	public String getShippingCondition() {
		return ShippingCondition;
	}

	public void setShippingCondition(String shippingCondition) {
		ShippingCondition = shippingCondition;
	}

	public String getPurchaseOrderByCustomer() {
		return PurchaseOrderByCustomer;
	}

	public void setPurchaseOrderByCustomer(String purchaseOrderByCustomer) {
		PurchaseOrderByCustomer = purchaseOrderByCustomer;
	}

	public String getReferenceSDDocument() {
		return ReferenceSDDocument;
	}

	public void setReferenceSDDocument(String referenceSDDocument) {
		ReferenceSDDocument = referenceSDDocument;
	}

	public String getSalesDocument() {
		return SalesDocument;
	}

	public void setSalesDocument(String salesDocument) {
		SalesDocument = salesDocument;
	}

	public String getSalesGroup() {
		return SalesGroup;
	}

	public void setSalesGroup(String salesGroup) {
		SalesGroup = salesGroup;
	}

	public String getShippingPoint() {
		return ShippingPoint;
	}

	public void setShippingPoint(String shippingPoint) {
		ShippingPoint = shippingPoint;
	}

	public String getSalesDocumentCondition() {
		return SalesDocumentCondition;
	}

	public void setSalesDocumentCondition(String salesDocumentCondition) {
		SalesDocumentCondition = salesDocumentCondition;
	}

	public String getTotalNetAmount() {
		return TotalNetAmount;
	}

	public void setTotalNetAmount(String totalNetAmount) {
		TotalNetAmount = totalNetAmount;
	}

	public String getTransactionCurrency() {
		return TransactionCurrency;
	}

	public void setTransactionCurrency(String transactionCurrency) {
		TransactionCurrency = transactionCurrency;
	}

	public String getShippingConditionName() {
		return ShippingConditionName;
	}

	public void setShippingConditionName(String shippingConditionName) {
		ShippingConditionName = shippingConditionName;
	}

	public String getSalesDocumentItemCategory() {
		return SalesDocumentItemCategory;
	}

	public void setSalesDocumentItemCategory(String salesDocumentItemCategory) {
		SalesDocumentItemCategory = salesDocumentItemCategory;
	}

	public String getActualGoodsMovementDate() {
		return ActualGoodsMovementDate;
	}

	public void setActualGoodsMovementDate(String actualGoodsMovementDate) {
		ActualGoodsMovementDate = actualGoodsMovementDate;
	}

	public String getCustomer() {
		return Customer;
	}

	public void setCustomer(String customer) {
		Customer = customer;
	}

	@Override
	public String toString() {
		return "InvItems [Customer=" + Customer + ", FiscalPeriodEndDate=" + FiscalPeriodEndDate
				+ ", PreviousFiscalPeriodStartDa=" + PreviousFiscalPeriodStartDa + ", BillingDocument="
				+ BillingDocument + ", BillingDocumentDate=" + BillingDocumentDate + ", BillingDocumentIsCancelled="
				+ BillingDocumentIsCancelled + ", SDDocumentCategory=" + SDDocumentCategory + ", ShippingCondition="
				+ ShippingCondition + ", PurchaseOrderByCustomer=" + PurchaseOrderByCustomer + ", ReferenceSDDocument="
				+ ReferenceSDDocument + ", SalesDocument=" + SalesDocument + ", SalesGroup=" + SalesGroup
				+ ", ShippingPoint=" + ShippingPoint + ", SalesDocumentCondition=" + SalesDocumentCondition
				+ ", TotalNetAmount=" + TotalNetAmount + ", TransactionCurrency=" + TransactionCurrency
				+ ", ShippingConditionName=" + ShippingConditionName + ", SalesDocumentItemCategory="
				+ SalesDocumentItemCategory + ", ActualGoodsMovementDate=" + ActualGoodsMovementDate + "]";
	}

	

	

	
	
	
}
