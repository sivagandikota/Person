/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author Shivas
 */
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Use;
import javax.naming.AuthenticationException;

@WebService(name="Z_B2B_PRICE_INQUIRY")   
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use=Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Zb2BPriceInqInterface {
    
    @WebMethod(operationName="PriceInqiry")
	public com.model.Zb2BPriceInqWrapper getCustomerValidation(@WebParam(name = "customer") String customer,@WebParam(name = "material")String material) throws AuthenticationException, Exception ;
	
    
}
