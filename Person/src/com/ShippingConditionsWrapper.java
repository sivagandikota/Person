package com;

import javax.xml.bind.annotation.XmlRootElement;

import com.google.gson.annotations.SerializedName;
import javax.xml.bind.annotation.XmlSeeAlso;
@XmlRootElement
@XmlSeeAlso(CollectionOfShippingConditions.class)
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
