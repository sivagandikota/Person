package com;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.sap.apibhub.sdk.api_sales_order_srv.model.APISALESORDERSRVASalesOrderType;

public class CollectionOfCustInq {
	@SerializedName("results")
	  private List<CustInq> results = null;

	public List<CustInq> getResults() {
		return results;
	}

	public void setResults(List<CustInq> results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "CollectionOfCustInq [results=" + results + "]";
	}
	
	
	
	

}
