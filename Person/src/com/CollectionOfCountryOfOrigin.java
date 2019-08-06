package com;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class CollectionOfCountryOfOrigin {
	
	@SerializedName("CountryOfOrigin")
	private String countryOfOrigin = null;
	
	@SerializedName("__metadata")
	private MetaData metadata = null;
	
	
	
	public MetaData getMetadata() {
		return metadata;
	}

	public void setMetadata(MetaData metadata) {
		this.metadata = metadata;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	@Override
	public String toString() {
		return "CollectionOfCountryOfOrigin [countryOfOrigin=" + countryOfOrigin + "]";
	}

	
	
	
	
	
}
