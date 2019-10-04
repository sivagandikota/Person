package com.model;

import com.google.gson.annotations.SerializedName;

public class INQWRAPPER {
	@SerializedName("d")
	  private CollectionOfINQ d = null;

	public CollectionOfINQ getD() {
		return d;
	}

	public void setD(CollectionOfINQ d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "INQWRAPPER [d=" + d + "]";
	}
	

}
