package com.model;

import java.util.Arrays;

import com.google.gson.annotations.SerializedName;

public class CollectionOfListItems {
	@SerializedName("results")
	  private com.model.ListItems[] results = null;

	public com.model.ListItems[] getResults() {
		return results;
	}

	public void setResults(com.model.ListItems[] results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "CollectionOfListItems [results=" + Arrays.toString(results) + "]";
	}
	
}
