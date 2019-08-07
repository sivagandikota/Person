package com;

import com.google.gson.annotations.SerializedName;

public class Shipping {
	@SerializedName("ShippingCondition")
	private String shipping;
	@SerializedName("ShippingConditionText")
	private String shippingText;
	public String getShipping() {
		return shipping;
	}
	public void setShipping(String shipping) {
		this.shipping = shipping;
	}
	public String getShippingText() {
		return shippingText;
	}
	public void setShippingText(String shippingText) {
		this.shippingText = shippingText;
	}
	@Override
	public String toString() {
		return "Shipping [shipping=" + shipping + ", shippingText=" + shippingText + "]";
	}
	
	

}
