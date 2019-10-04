package com.model;

import com.google.gson.annotations.SerializedName;

public class custwrapper {
	@SerializedName("d")
	  private CollectionOfInvoice d = null;

	public CollectionOfInvoice getD() {
		return d;
	}

	public void setD(CollectionOfInvoice d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "custwrapper [d=" + d + "]";
	}

	
}
