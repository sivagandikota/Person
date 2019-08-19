package com;

import java.util.ArrayList;
import java.util.List;
import com.ShippingConditions;

import com.google.gson.annotations.SerializedName;


public class CollectionOfShippingConditions {
	@SerializedName("results")
	  private List<ShippingConditions> results = new ArrayList<ShippingConditions>();
	

	public List<ShippingConditions> getResults() {
		return results;
	}

	public void setResults(List<ShippingConditions> results) {
		this.results = results;
	}
	
	

}
