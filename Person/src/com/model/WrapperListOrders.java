package com.model;


import com.google.gson.annotations.SerializedName;

public class WrapperListOrders {
	@SerializedName("d")
	  private CollectionOfOrderItems d = null;

	public CollectionOfOrderItems getD() {
		return d;
	}

	public void setD(CollectionOfOrderItems d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "WrapperListOrders [d=" + d + "]";
	}
	
}
