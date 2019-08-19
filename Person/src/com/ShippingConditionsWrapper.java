package com;

import com.google.gson.annotations.SerializedName;

public class ShippingConditionsWrapper {
	@SerializedName("d")
	  private CollectionOfShippingConditions d = null;
	

	public CollectionOfShippingConditions getD() {
		return d;
	}

	public void setD(CollectionOfShippingConditions d) {
		this.d = d;
	}
	
	

}
