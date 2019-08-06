package com;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Use;

@WebService(name="Z_B2B_OPEN_NEW_ORDER")   
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use=Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Zb2BOpenNewOrderInterface{
	@WebMethod(operationName="openNewSalesOrder")
	public String openNewSalesOrder(@WebParam(name = "customerId") String customer)  throws Exception;
}
