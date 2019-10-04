package com;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Use;
import javax.naming.AuthenticationException;

@WebService(name="Z_B2B_CUST_INQ")   
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use=Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Zb2BCustInqInterface{
	
	@WebMethod(operationName="getCustomerValidation")
	public Zb2BCustInqWrapper getCustomerValidation(@WebParam(name = "customerId") String customer) throws AuthenticationException, Exception ;
	
}