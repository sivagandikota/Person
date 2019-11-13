package com.model;


import com.google.gson.annotations.SerializedName;

public class WrapperListOrders {
	@SerializedName("d")
	  private CollectionOfOrderItems d = null;
	private String status=null;

	public CollectionOfOrderItems getD() {
		return d;
	}

	public void setD(CollectionOfOrderItems d) {
		this.d = d;
	}
	

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "WrapperListOrders [d=" + d + ", status=" + status + "]";
	}

	
	
}
