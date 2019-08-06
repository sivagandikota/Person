package com;

import com.google.gson.annotations.SerializedName;

public class MetaData {
	@SerializedName("id")
	private String id = null;
	
	@SerializedName("uri")
	private String uri = null;
	
	@SerializedName("type")
	private String type = null;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
