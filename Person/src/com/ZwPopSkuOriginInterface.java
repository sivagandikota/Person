package com;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Use;

@WebService(name="Z_WPOP_SKU_ORIGIN")   
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use=Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ZwPopSkuOriginInterface{
	
	@WebMethod(operationName="getCountryOfOrigin")
	public ZwPopSkuOriginWrapper getCountryOfOrigin(@WebParam(name = "productId") String product) throws Exception;
	
}