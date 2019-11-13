package com.model;

import com.sap.cloud.sdk.s4hana.datamodel.odata.namespaces.businesspartner.AddressEmailAddress;
import com.sap.cloud.sdk.s4hana.datamodel.odata.namespaces.businesspartner.BusinessPartnerAddress;

public class B2BCloseOrderWrapper {
	private String status = "";
	private BusinessPartnerAddress businessPartnerAddress=null;
	private AddressEmailAddress addressEmailAddress=null;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public BusinessPartnerAddress getBusinessPartnerAddress() {
		return businessPartnerAddress;
	}
	public void setBusinessPartnerAddress(BusinessPartnerAddress businessPartnerAddress) {
		this.businessPartnerAddress = businessPartnerAddress;
	}
	public AddressEmailAddress getAddressEmailAddress() {
		return addressEmailAddress;
	}
	public void setAddressEmailAddress(AddressEmailAddress addressEmailAddress) {
		this.addressEmailAddress = addressEmailAddress;
	}
	@Override
	public String toString() {
		return "B2BCloseOrderWrapper [status=" + status + ", businessPartnerAddress=" + businessPartnerAddress
				+ ", addressEmailAddress=" + addressEmailAddress + "]";
	}
	
	
	

}
