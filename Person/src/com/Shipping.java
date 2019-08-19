package com;

import com.google.gson.annotations.SerializedName;

public class Shipping {
	@SerializedName("ShippingCondition")
	private String shipping;
	@SerializedName("ShippingConditionName")
	private String shippingText;
	@SerializedName("Language")
	private String lang;
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
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	@Override
	public String toString() {
		return "Shipping [shipping=" + shipping + ", shippingText=" + shippingText + ", lang=" + lang + "]";
	}
	
	
	
	

}
