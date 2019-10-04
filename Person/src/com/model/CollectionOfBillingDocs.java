package com.model;

import java.util.Arrays;

import com.google.gson.annotations.SerializedName;

public class CollectionOfBillingDocs {
	@SerializedName("results")
	  private com.model.Docs[] results = null;

	public com.model.Docs[] getResults() {
		return results;
	}

	public void setResults(com.model.Docs[] results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "CollectionOfBillingDocs [results=" + Arrays.toString(results) + "]";
	}
	
}
