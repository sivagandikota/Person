package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class Cond {
	@SerializedName("ConditionRecord")
	@JsonProperty("ConditionRecord")
	private String ConditionRecord = null;

	@SerializedName("ConditionRateValue")
	@JsonProperty("ConditionRateValue")
	private String ConditionRateValue = null;
	
	public String getConditionRateValue() {
		return ConditionRateValue;
	}

	public void setConditionRateValue(String conditionRateValue) {
		ConditionRateValue = conditionRateValue;
	}

	public String getConditionRecord() {
		return ConditionRecord;
	}

	public void setConditionRecord(String conditionRecord) {
		ConditionRecord = conditionRecord;
	}

	@Override
	public String toString() {
		return "Cond [ConditionRecord=" + ConditionRecord + ", ConditionRateValue=" + ConditionRateValue + "]";
	}


	
}
