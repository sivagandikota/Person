package com.model;

import java.util.Arrays;

import com.google.gson.annotations.SerializedName;

public class CollectionOfRec {
	@SerializedName("results")
	  private com.model.Cond[] results = null;

	public com.model.Cond[] getResults() {
		return results;
	}

	public void setResults(com.model.Cond[] results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "CollectionOfRec [results=" + Arrays.toString(results) + "]";
	}
	
}
