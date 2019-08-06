package com;

import com.google.gson.annotations.SerializedName;

public class CountryOfOrigin {
	@SerializedName("country")
	  private String country = null;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "CountryOfOrigin [country=" + country + "]";
	}
	

}
