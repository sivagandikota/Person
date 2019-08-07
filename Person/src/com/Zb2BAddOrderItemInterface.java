package com;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Use;

@WebService(name="Z_B2B_ADD_ORDER_ITEM")   
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use=Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Zb2BAddOrderItemInterface {
	
	@WebMethod(operationName="addOrderItem")
	public Object addOrderItem(@WebParam(name = "customerNo") String customerNo,@WebParam(name = "reservation") String reservation,@WebParam(name = "orderMaterial") String orderMaterial,@WebParam(name = "qty") String qty, @WebParam(name = "batch") String batch,@WebParam(name = "sample") String sample);

}
