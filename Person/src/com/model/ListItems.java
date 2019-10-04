package com.model;

import com.MetaData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class ListItems {
	/*@SerializedName("__metadata")
	private MetaData __metadata = null;
	*/
	@SerializedName("MaterialGroup")
	@JsonProperty("MaterialGroup")
	private String MaterialGroup = null;
	
	@SerializedName("MaterialGroupText")
	@JsonProperty("MaterialGroupText")
	private String MaterialGroupText = null;

	/*public MetaData get__metadata() {
		return __metadata;
	}

	public void set__metadata(MetaData __metadata) {
		this.__metadata = __metadata;
	}
*/
	public String getMaterialGroup() {
		return MaterialGroup;
	}

	public void setMaterialGroup(String materialGroup) {
		MaterialGroup = materialGroup;
	}

	public String getMaterialGroupText() {
		return MaterialGroupText;
	}

	public void setMaterialGroupText(String materialGroupText) {
		MaterialGroupText = materialGroupText;
	}

	@Override
	public String toString() {
		return "ListItems [ MaterialGroup=" + MaterialGroup + ", MaterialGroupText="
				+ MaterialGroupText + "]";
	}
	
}
