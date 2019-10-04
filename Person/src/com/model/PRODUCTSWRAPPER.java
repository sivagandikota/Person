package com.model;

import com.google.gson.annotations.SerializedName;


public class PRODUCTSWRAPPER {
	@SerializedName("d")
	  private CollectionOfPRODUCTS d = null;

	public CollectionOfPRODUCTS getD() {
		return d;
	}

	public void setD(CollectionOfPRODUCTS d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "PRODUCTSWRAPPER [d=" + d + "]";
	}
	
}
