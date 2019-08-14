package com;

public class OrderAndReservation {
	private com.sap.apibhub.sdk.api_reservation_document_srv.model.Wrapper reservation = null;
	private com.sap.apibhub.sdk.api_sales_order_srv.model.Wrapper salesOrder = null;

	
	public com.sap.apibhub.sdk.api_reservation_document_srv.model.Wrapper getReservation() {
		return reservation;
	}

	public void setReservation(com.sap.apibhub.sdk.api_reservation_document_srv.model.Wrapper reservation) {
		this.reservation = reservation;
	}

	public com.sap.apibhub.sdk.api_sales_order_srv.model.Wrapper getSalesOrder() {
		return salesOrder;
	}

	public void setSalesOrder(com.sap.apibhub.sdk.api_sales_order_srv.model.Wrapper salesOrder) {
		this.salesOrder = salesOrder;
	}

	@Override
	public String toString() {
		return "OrderAndReservation [reservation=" + reservation + ", salesOrder=" + salesOrder + "]";
	}
	
	
	

}
