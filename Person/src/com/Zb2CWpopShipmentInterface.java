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
import javax.jws.soap.SOAPBinding.Use;
import javax.naming.AuthenticationException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

import com.model.Zb2CWpopShipmentWrapper;
/**
 *
 * @author SrinivasBu
 */

@WebService(name="Z_WPOP_SHIPMENTS_FILE")   
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use=Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Zb2CWpopShipmentInterface {
    @WebMethod(operationName="getResendWpopShipments")
	public com.model.Zb2CWpopShipmentWrapper getResendWpopShipments(@WebParam(name = "SalesOrg") List<String> salesOrg,@WebParam(name = "SoldToParty") List<String> soldToParty,
			@XmlElement(required=true)@WebParam(name = "PlannedGoodsIssueFromDate") String PlannedGoodsIssueFromDate,
			@XmlElement(required=true)@WebParam(name = "PlannedGoodsIssueToDate") String PlannedGoodsIssueToDate) throws AuthenticationException, Exception ;
    
    @WebMethod(operationName="getResendWpopShipmentsAsync")
    public Future<?> getResendWpopShipmentsAsync(@WebParam(name = "SalesOrg") List<String> salesOrg, @WebParam(name = "SoldToParty") List<String> soldToParty, 
    		@XmlElement(required=true)@WebParam(name = "PlannedGoodsIssueFromDate") String PlannedGoodsIssueFromDate,
    		@XmlElement(required=true)@WebParam(name = "PlannedGoodsIssueToDate")String PlannedGoodsIssueToDate, AsyncHandler<Zb2CWpopShipmentWrapper> asyncHandler) throws AuthenticationException, Exception;
    
    @WebMethod(operationName="getResendWpopShipmentsAsync")
    public Response<Zb2CWpopShipmentWrapper> getResendWpopShipmentsAsync(@WebParam(name = "SalesOrg") List<String> salesOrg, @WebParam(name = "SoldToParty") List<String> soldToParty, 
    		@XmlElement(required=true)@WebParam(name = "PlannedGoodsIssueFromDate") String PlannedGoodsIssueFromDate,
    		@XmlElement(required=true)@WebParam(name = "PlannedGoodsIssueToDate")String PlannedGoodsIssueToDate) throws AuthenticationException, Exception;

@WebMethod(operationName="getCancelOrders")
	public com.model.Zb2CWpopShipmentCancelOrdersWrapper getCancelOrders(@WebParam(name = "SoldToParty") List<String> soldToParty,
			@XmlElement(required=true)@WebParam(name = "CancellationFromDate") String cancellationFromDate,
			@XmlElement(required=true)@WebParam(name = "CancellationToDate") String cancellationToDate) throws AuthenticationException, Exception ;



}
