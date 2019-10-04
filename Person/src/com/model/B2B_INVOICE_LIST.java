package com.model;

import java.util.ArrayList;

public class B2B_INVOICE_LIST {
	
private String Result = null;
	
	private ArrayList<INVOICELIST> InvoiceList = null;

	public String getResult() {
		return Result;
	}

	public void setResult(String result) {
		Result = result;
	}

	public ArrayList<INVOICELIST> getInvoiceList() {
		return InvoiceList;
	}

	public void setInvoiceList(ArrayList<INVOICELIST> invoiceList) {
		InvoiceList = invoiceList;
	}


}
