package com;

import com.google.gson.annotations.SerializedName;
import com.sap.apibhub.sdk.api_sales_order_srv.model.CollectionOfASalesOrderType;

public class ZwPopSkuOriginWrapper {
	@SerializedName("d")
	  private CollectionOfCountryOfOrigin d = null;
	@SerializedName("status")
	private String status = null;
	
	public ZwPopSkuOriginWrapper d(CollectionOfCountryOfOrigin d) {
		this.d=d;
		return this;
	}

	public CollectionOfCountryOfOrigin getD() {
		return d;
	}
    
	public void setD(CollectionOfCountryOfOrigin d) {
		this.d = d;
	}
	
	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ZwPopSkuOriginWrapper [d=" + d + "]";
	}
	

}
