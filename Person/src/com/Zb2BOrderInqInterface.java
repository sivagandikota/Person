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
import javax.naming.AuthenticationException;

/**
 *
 * @author SrinivasBu
 */
@WebService(name = "Z_B2B_ORDER_INQ")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Zb2BOrderInqInterface {

    @WebMethod(operationName = "getOrderInqInfo")
    public com.model.OrderInqFinalList getOrderInqInfo(@WebParam(name = "SalesOrder") String salesOrder) throws AuthenticationException, Exception;
}
