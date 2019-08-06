package com;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.sap.apibhub.sdk.api_sales_order_srv.model.APISALESORDERSRVASalesOrderType;

public class CollectionOfYy1ShippingConditions {
	@SerializedName("results")
	  private List<Yy1ShippingConditions> results = null;
	

	public List<Yy1ShippingConditions> getResults() {
		return results;
	}

	public void setResults(List<Yy1ShippingConditions> results) {
		this.results = results;
	}
	
	

}
