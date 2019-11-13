package com.model;

public class B2BCheckPayerWrapper {
private String status=null;
private String payer=null;
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getPayer() {
	return payer;
}
public void setPayer(String payer) {
	this.payer = payer;
}
@Override
public String toString() {
	return "B2BCheckPayerWrapper [status=" + status + ", payer=" + payer + "]";
}

}
