/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.List;
import java.util.concurrent.Future;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.naming.AuthenticationException;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

import com.model.Zb2BOrderListWrapper;
import com.model.Zb2CWpopShipmentWrapper;

/**
 *
 * @author SrinivasBu
 */
@WebService(name = "Z_B2B_ORDER_LIST")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Zb2BOrderListInterface {

    @WebMethod(operationName = "getOrderList")
    public com.model.Zb2BOrderListWrapper getOrderList(@WebParam(name = "CustomerNumber") String customerNumber, @WebParam(name = "SalesOrder") String salesOrder, @WebParam(name = "CustomerPurchaseOrder") String customerPurchaseOrder, @WebParam(name = "MaterialNumber") String materialNumber, @WebParam(name = "DateFromForSelectionByMaterial") String dateFromSelectionByMaterial) throws AuthenticationException, Exception;
    
    public Response<Zb2BOrderListWrapper> getOrderListAsync(@WebParam(name = "CustomerNumber") String customerNumber, @WebParam(name = "SalesOrder") String salesOrder, @WebParam(name = "CustomerPurchaseOrder") String customerPurchaseOrder, @WebParam(name = "MaterialNumber") String materialNumber, @WebParam(name = "DateFromForSelectionByMaterial") String dateFromSelectionByMaterial) throws AuthenticationException, Exception;
    
    
    public Future<?> getOrderListAsync(@WebParam(name = "CustomerNumber") String customerNumber, @WebParam(name = "SalesOrder") String salesOrder, @WebParam(name = "CustomerPurchaseOrder") String customerPurchaseOrder, @WebParam(name = "MaterialNumber") String materialNumber, @WebParam(name = "DateFromForSelectionByMaterial") String dateFromSelectionByMaterial, final AsyncHandler<Zb2BOrderListWrapper> asyncHandler) ;
}
