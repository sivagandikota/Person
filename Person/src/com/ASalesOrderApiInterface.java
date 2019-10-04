package com;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Use;

import com.sap.apibhub.sdk.api_sales_order_srv.model.ASalesOrderType;
import com.sap.apibhub.sdk.api_sales_order_srv.model.ModifiedASalesOrderType;
import com.sap.apibhub.sdk.api_sales_order_srv.model.Wrapper;
import com.sap.apibhub.sdk.client.ApiResponse;




@WebService(name="ASalesOrder")   
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use=Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ASalesOrderApiInterface {
	
	@WebMethod(operationName="getSalesOrders")
	public Wrapper getSalesOrders(@WebParam(name = "top") String top, @WebParam(name="skip") String skip, @WebParam(name="filter") String filter, @WebParam(name="inlinecount") String inlinecount, @WebParam(name="orderby") String  orderby, @WebParam(name="select") String  select, @WebParam(name="expand") String expand);
	
	@WebMethod(operationName="getSalesOrder")
	public ApiResponse<ASalesOrderType> getSalesOrder(@WebParam(name = "id") String id, @WebParam(name="select") String  select, @WebParam(name="expand") String expand);
	
	@WebMethod(operationName="updateSalesOrder")
	public ApiResponse<Void> updateSalesOrder(@WebParam(name = "id") String id, @WebParam(name="aSalesOrderType") ModifiedASalesOrderType aSalesOrderType);
	
	@WebMethod(operationName="deleteSalesOrder")
	public Wrapper deleteSalesOrder(@WebParam(name = "id") String id, @WebParam(name="select") String  select, @WebParam(name="expand") String expand);
    
}