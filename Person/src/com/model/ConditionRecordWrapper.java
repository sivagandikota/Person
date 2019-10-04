package com.model;

import com.google.gson.annotations.SerializedName;

public class ConditionRecordWrapper {
	@SerializedName("d")
	  private CollectionOfRec d = null;

	public CollectionOfRec getD() {
		return d;
	}

	public void setD(CollectionOfRec d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "ConditionRecordWrapper [d=" + d + "]";
	}
}
