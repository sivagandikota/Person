package com.model;

import javax.xml.bind.annotation.XmlSeeAlso;

import com.MetaData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
@XmlSeeAlso(com.model.CollectionOfOrderItems.class)
public class OrderItems {
	@SerializedName("__metadata")
	private MetaData __metadata = null;
	
	@SerializedName("SalesOrder")
	@JsonProperty("SalesOrder")
	private String SalesOrder = null;
	
	@SerializedName("SalesOrderItem")
	@JsonProperty("SalesOrderItem")
	private String itemNumber = null;
	
	@SerializedName("Material")
	@JsonProperty("Material")
	private String material = null;
	
	@SerializedName("RequestedQuantity")
	@JsonProperty("RequestedQuantity")
	private String quantity = null;
	
	@SerializedName("RequestedQuantityUnit")
	@JsonProperty("RequestedQuantityUnit")
	private String unit = null;
	
	@SerializedName("TransactionCurrency")
	@JsonProperty("TransactionCurrency")
	private String currency = null;
	
	@SerializedName("NetAmount")
	@JsonProperty("NetAmount")
	private String amount = null;
	
	@SerializedName("SalesOrganization")
	@JsonProperty("SalesOrganization")
	private String salesOrganization=null;



	public MetaData get__metadata() {
		return __metadata;
	}

	public void set__metadata(MetaData __metadata) {
		this.__metadata = __metadata;
	}

	
	public String getSalesOrder() {
		return SalesOrder;
	}

	public void setSalesOrder(String SalesOrder) {
		this.SalesOrder = SalesOrder;
	}

	public String getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	

	public String getSalesOrganization() {
		return salesOrganization;
	}

	public void setSalesOrganization(String salesOrganization) {
		this.salesOrganization = salesOrganization;
	}

	@Override
	public String toString() {
		return "OrderItems [SalesOrder=" + SalesOrder + ", itemNumber=" + itemNumber + ", material=" + material
				+ ", quantity=" + quantity + ", unit=" + unit + ", currency=" + currency + ", amount=" + amount
				+ ", salesOrganization=" + salesOrganization + "]";
	}

	
	
}
