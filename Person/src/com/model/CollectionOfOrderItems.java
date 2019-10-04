package com.model;

import java.util.ArrayList;
import java.util.List;
import com.model.OrderItems;

import javax.xml.bind.annotation.XmlSeeAlso;

import com.google.gson.annotations.SerializedName;
@XmlSeeAlso(com.model.OrderItems.class)
public class CollectionOfOrderItems {
	@SerializedName("results")
	  private com.model.OrderItems[] results = null;

	public com.model.OrderItems[] getResults() {
		return results;
	}

	public void setResults(com.model.OrderItems[] results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "CollectionOfOrderItems [results=" + results + "]";
	}
	
}
