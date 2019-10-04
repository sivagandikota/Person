package com.model;

import java.util.Arrays;

import com.google.gson.annotations.SerializedName;

public class CollectionOfINQ {
	
	@SerializedName("results")
	  private com.model.INQ[] results = null;

	public com.model.INQ[] getResults() {
		return results;
	}

	public void setResults(com.model.INQ[] results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "CollectionOfINQ [results=" + Arrays.toString(results) + "]";
	}
	

}
