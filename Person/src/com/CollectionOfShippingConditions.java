package com;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.ShippingConditions;
import com.fasterxml.jackson.annotation.JsonAnyGetter;

import com.google.gson.annotations.SerializedName;


@XmlSeeAlso(com.ShippingConditions.class)
public class CollectionOfShippingConditions implements Serializable{
	@SerializedName("results")
	  private List<com.ShippingConditions> results = null;
	
        @JsonAnyGetter
	public List<com.ShippingConditions> getResults() {
		return results;
	}

	public void setResults(List<com.ShippingConditions> results) {
		this.results = results;
	}
	
	

}
