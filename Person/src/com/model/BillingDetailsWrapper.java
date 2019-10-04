package com.model;

import com.google.gson.annotations.SerializedName;

public class BillingDetailsWrapper {

	@SerializedName("d")
	  private CollectionOfBillingDocs d = null;

	public CollectionOfBillingDocs getD() {
		return d;
	}

	public void setD(CollectionOfBillingDocs d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "BillingDetailsWrapper [d=" + d + "]";
	}

}
