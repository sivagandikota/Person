package com;

import com.google.gson.annotations.SerializedName;
import com.sap.apibhub.sdk.api_business_partner.model.APIBUSINESSPARTNERABusinessPartnerAddressType;


public class Zb2BCustInqWrapper {
	@SerializedName("d")
	  private CollectionOfCustInq d = null;
	@SerializedName("status")
	private String status = null;
	@SerializedName("shipping")
	private String shipping = null;
	
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
	
	

	public String getShipping() {
		return shipping;
	}

	public void setShipping(String shipping) {
		this.shipping = shipping;
	}
	
	

	public APIBUSINESSPARTNERABusinessPartnerAddressType getAddress() {
		return address;
	}

	public void setAddress(APIBUSINESSPARTNERABusinessPartnerAddressType address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Zb2BCustInqWrapper [d=" + d + ",\n status=" + status + ", shipping=" + shipping + ",\n address=" + address
				+ "]";
	}

	
	
	

}
