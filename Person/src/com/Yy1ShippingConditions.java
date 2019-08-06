package com;

import com.google.gson.annotations.SerializedName;

public class Yy1ShippingConditions {
	@SerializedName("__metadata")
	private MetaData metadata = null;
	@SerializedName("SAP_UUID")
	private String SAP_UUID = null;
	@SerializedName("XSITD")
	private String XSITD = null;
	@SerializedName("VSBED")
	private String VSBED = null;
	@SerializedName("XSISRVC")
	private String XSISRVC = null;
	@SerializedName("VTEXT")
	private String VTEXT = null;
	@SerializedName("SRVCTEXT")
	private String SRVCTEXT = null;
	
	public MetaData getMetadata() {
		return metadata;
	}
	public void setMetadata(MetaData metadata) {
		this.metadata = metadata;
	}
	public String getSAP_UUID() {
		return SAP_UUID;
	}
	public void setSAP_UUID(String sAP_UUID) {
		SAP_UUID = sAP_UUID;
	}
	public String getXSITD() {
		return XSITD;
	}
	public void setXSITD(String xSITD) {
		XSITD = xSITD;
	}
	public String getVSBED() {
		return VSBED;
	}
	public void setVSBED(String vSBED) {
		VSBED = vSBED;
	}
	public String getXSISRVC() {
		return XSISRVC;
	}
	public void setXSISRVC(String xSISRVC) {
		XSISRVC = xSISRVC;
	}
	public String getVTEXT() {
		return VTEXT;
	}
	public void setVTEXT(String vTEXT) {
		VTEXT = vTEXT;
	}
	public String getSRVCTEXT() {
		return SRVCTEXT;
	}
	public void setSRVCTEXT(String sRVCTEXT) {
		SRVCTEXT = sRVCTEXT;
	}
	
	

}
