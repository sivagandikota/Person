package com;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="B2B")   

public interface Interface { 
	@WebMethod(operationName="Validation")
	public String sayHello (@WebParam(name = "name")String name);
    
	@WebMethod(operationName="VA01")
	public String createOrder (@WebParam(name = "SoldToParty")String SoldToParty,
			                   @WebParam(name = "CustomerReference")String CustomerReference);
    
	@WebMethod(operationName="VA02")
	public String RejItem (@WebParam(name = "Order")String Order,
			               @WebParam(name = "Item")String Item);
	
	@WebMethod(operationName="VA02_addItem")
	public String AddItem (@WebParam(name = "Order")String Order);
	
	@WebMethod(operationName="VA02_cancelOrder")
	public String cancelOrder (@WebParam(name = "rder")String rder);
}
