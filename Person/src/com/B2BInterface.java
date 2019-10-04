package com;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.model.ListItems;
import com.model.OrderItems;

@WebService(name="B2B")   

public interface B2BInterface { 
//	@WebMethod(operationName="Validation")
//	public String sayHello (@WebParam(name = "name")String name);
    
	@WebMethod(operationName="CreateOrder")
	public com.model.SOandShippingTable createOrder (@WebParam(name = "SoldToParty")String SoldToParty) throws Exception;
    
	@WebMethod(operationName="RejectItem")
	public String RejItem (@WebParam(name = "Order")String Order,
			               @WebParam(name = "Item")String Item);
	
	@WebMethod(operationName="AddItem")
	public String AddItem (@WebParam(name = "SoldToParty")String SoldToParty,
			               @WebParam(name = "Order")String Order,
			               @WebParam(name = "Material")String Material,
			               @WebParam(name = "Quantity")String Quantity);
	
	@WebMethod(operationName="CancelOrder")
	public String cancelOrder (@WebParam(name = "SoldToParty")String SoldToParty,
			                   @WebParam(name = "rder")String rder);
	
	@WebMethod(operationName="GET_SHIP")
	public java.util.HashMap getShip (@WebParam(name = "SoldToParty")String SoldToParty) throws Exception;
    
	@WebMethod(operationName="GET_ORDER_LIST")
	public OrderItems[] getList (@WebParam(name = "SoldToParty")String SoldToParty,
			                          @WebParam(name = "Order")String Order) ;
	
	@WebMethod(operationName="CLOSE_ORDER")
	public String CloseOrder (@WebParam(name = "SoldToParty")String SoldToParty,
			                          @WebParam(name = "Order")String Order,
			                          @WebParam(name = "CustomerReference")String CustRef,
			                          @WebParam(name = "ShippingConditions")String ShippingCondition) ;
	
	@WebMethod(operationName="CHECK_PAYER") 
	public String CheckPayer (@WebParam(name = "SoldToParty")String SoldToParty) throws Exception;
	
	@WebMethod(operationName="Z_B2B_COLLECTION_LIST") 
	public ListItems[] Z_B2B_COLLECTION_LIST (@WebParam(name = "BUKRS")String BUKRS);
	
	
	@WebMethod(operationName="Z_B2B_COLLECTION_INQ") 
	public com.model.PList Z_B2B_COLLECTION_INQ (@WebParam(name = "BUKRS")String BUKRS,
			                            @WebParam(name = "BOOK")String BOOK);
	
	@WebMethod(operationName="Z_B2B_INV_LIST") 
	public com.model.B2B_INVOICE_LIST Z_B2B_INV_LIST (@WebParam(name = "CUST")String CUST);
    
	@WebMethod(operationName="Z_B2B_INV_DET") 
	public com.model.Docs[] Z_B2B_INV_DET (@WebParam(name = "INVHEAD")com.model.B2B_INVOICE_LIST INVHEAD);
 }
