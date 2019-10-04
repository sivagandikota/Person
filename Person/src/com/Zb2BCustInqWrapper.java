package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.sap.apibhub.sdk.api_business_partner.model.APIBUSINESSPARTNERABusinessPartnerAddressType;


public class Zb2BCustInqWrapper {
	@SerializedName("d")
	  private CollectionOfCustInq d = null;
	//@SerializedName("status")
	private String status = null;
	//@SerializedName("shipping")
	private ShippingConditions shipping = new ShippingConditions();
	
	//@SerializedName("shippingTable")
	private HashMap shippingTable = new HashMap();
	
	@SerializedName("address")
	private APIBUSINESSPARTNERABusinessPartnerAddressType address = null;
	
	
	public Zb2BCustInqWrapper d(CollectionOfCustInq d) {
		this.d=d;
		return this;
	}

	public CollectionOfCustInq getD() {
		return d;
	}
    
	public void setD(CollectionOfCustInq d) {
		this.d = d;
	}
	
	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

	public ShippingConditions getShipping() {
		return shipping;
	}

	public void setShipping(ShippingConditions shipping) {
		this.shipping = shipping;
	}
	
	

	public APIBUSINESSPARTNERABusinessPartnerAddressType getAddress() {
		return address;
	}

	public void setAddress(APIBUSINESSPARTNERABusinessPartnerAddressType address) {
		this.address = address;
	}
	
	

	public HashMap getShippingTable() {
		return shippingTable;
	}

	public void setShippingTable(HashMap shippingList) {
		this.shippingTable = shippingList;
	}

	@Override
	public String toString() {
		return "Zb2BCustInqWrapper [d=" + d + ", status=" + status + ", shipping=" + shipping + ", shippingList="
				+ shippingTable + ", address=" + address + "]";
	}

	
	

	
	
	

}
