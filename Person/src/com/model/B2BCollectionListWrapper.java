package com.model;

import com.google.gson.annotations.SerializedName;

public class B2BCollectionListWrapper {
	@SerializedName("d")
	  private CollectionOfListItems d = null;

	public CollectionOfListItems getD() {
		return d;
	}

	public void setD(CollectionOfListItems d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "B2BCollectionListWrapper [d=" + d + "]";
	}
	
}
