package com.model;

import java.util.Arrays;

import com.google.gson.annotations.SerializedName;

public class CollectionOfInvoice {
	@SerializedName("results")
	  private com.model.InvItems[] results = null;

	public com.model.InvItems[] getResults() {
		return results;
	}

	public void setResults(com.model.InvItems[] results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "CollectionOfInvoice [results=" + Arrays.toString(results) + "]";
	}
	
}
