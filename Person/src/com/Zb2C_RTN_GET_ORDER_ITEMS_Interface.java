/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Use;
import javax.naming.AuthenticationException;

/**
 *
 * @author SrinivasBu
 */
@WebService(name="Z_RTN_GET_ORDER_ITEMS") 
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use=Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Zb2C_RTN_GET_ORDER_ITEMS_Interface {
    @WebMethod(operationName="GetOrderItems")
	public com.model.Zb2cGetOrderItemListWrapper getOrderItems (@WebParam(name = "Customerpurchaseorder")String Customerpurchaseorder, @WebParam(name = "Customer")String Customer, @WebParam(name = "Email")String Email)throws AuthenticationException;
}
