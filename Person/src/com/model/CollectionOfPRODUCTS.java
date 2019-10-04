package com.model;

import java.util.Arrays;

import com.google.gson.annotations.SerializedName;

public class CollectionOfPRODUCTS {

	@SerializedName("results")
	  private com.model.PRODUCTS[] results = null;

	public com.model.PRODUCTS[] getResults() {
		return results;
	}

	public void setResults(com.model.PRODUCTS[] results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "CollectionOfPRODUCTS [results=" + Arrays.toString(results) + "]";
	}
	
}
