package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.naming.AuthenticationException;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import org.slf4j.Logger;

import com.google.gson.Gson;
import com.sap.apibhub.sdk.api_material_stock_srv.model.APIMATERIALSTOCKSRVAMaterialStockType;
import com.sap.apibhub.sdk.api_material_stock_srv.model.APIMATERIALSTOCKSRVAMatlStkInAcctModType;
import com.sap.apibhub.sdk.api_reservation_document_srv.api.AReservationDocumentHeaderApi;
import com.sap.apibhub.sdk.api_reservation_document_srv.model.APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderType;
import com.sap.apibhub.sdk.api_reservation_document_srv.model.AReservationDocumentHeaderType;
import com.sap.apibhub.sdk.api_reservation_document_srv.model.Wrapper;
import com.sap.apibhub.sdk.api_sales_order_srv.model.APISALESORDERSRVASalesOrderItemType;
import com.sap.apibhub.sdk.api_sales_order_srv.model.APISALESORDERSRVASalesOrderType;
import com.sap.apibhub.sdk.api_sales_order_srv.model.APISALESORDERSRVASalesOrderTypeCreate;
import com.sap.apibhub.sdk.api_sales_order_srv.model.CollectionOfASalesOrderItemType;
import com.sap.apibhub.sdk.api_sales_order_srv.model.CollectionOfASalesOrderType;
import com.sap.apibhub.sdk.client.ApiClient;
import com.sap.apibhub.sdk.client.Configuration;
import com.sap.cloud.sdk.cloudplatform.logging.CloudLoggerFactory;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

public class Zb2BAddOrderItem implements Zb2BAddOrderItemInterface {
	static Logger logger = CloudLoggerFactory.getLogger(Zb2BAddOrderItem.class);
	@Resource
	WebServiceContext wsctx;
	String csrf;

	@Override
	public Object addOrderItem(String customerNo, String reservationId,String salesOrderId, String orderMaterial, String qty, String batch,
			String sample) throws Exception {
		MessageContext mctx = wsctx.getMessageContext();
		Map http_headers = (Map) mctx.get(MessageContext.HTTP_REQUEST_HEADERS);
        System.out.println(Arrays.toString(http_headers.keySet().toArray()));
        System.out.println(Arrays.toString(http_headers.values().toArray()));
        List userList = (List) http_headers.get("Username");
        List passList = (List) http_headers.get("Password");
        ArrayList authList = (ArrayList) http_headers.get("Authorization");
        String username = "";
        String password = "";
        String authoriz = "";
         csrf = "FETCH";
         com.sap.apibhub.sdk.api_sales_order_srv.model.Wrapper wrapperSo = null;
		//Zb2bCustInq inq = service.;
        //Zb2bCustInq inq = (Zb2bCustInq)service.getZb2BCustInqPort();
		//inq.wsctx = wsctx;

        if(userList!=null){
        	//get username
        	username = userList.get(0).toString();
        }
        	
        if(passList!=null){
        	//get password
        	password = passList.get(0).toString();
        }
        if(authList!=null){
        	//get password
        	authoriz = authList.get(0).toString();
        }
        if (authList==null) {
        	throw new AuthenticationException("No Authorization Header ");
        }
		
        
//Check if Order is blocked for customer. If blocked, exit with error.
        Zb2BCustInqWrapper z = new Zb2BCustInqWrapper();
		String BASE_URL = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_CustomerSalesArea?$format=json&$select=Customer,SalesOrganization,DistributionChannel,Division,ShippingCondition,CustomerPaymentTerms,DeliveryIsBlockedForCustomer,OrderIsBlockedForCustomer,DeletionIndicator&$filter=Customer eq '"+customerNo+"'";
		z=(Zb2BCustInqWrapper) this.retreiveData(BASE_URL, authoriz, csrf, z);	
			logger.debug("--CustomerInq : " + z.toString());
			String status = "000";
			logger.debug("  --deletionIndicator : " + z.getD().getResults().get(0).getDeletionIndicator() + "    --orderIsBlockedForCustomer : " + z.getD().getResults().get(0).getOrderIsBlockedForCustomer());
			
			if(z.getD().getResults().get(0).getDeletionIndicator()=="true" || z.getD().getResults().get(0).getOrderIsBlockedForCustomer().length()>0) {
				status = "001";
			}
		
		
		
		
		OrderAndReservation ordNres = new OrderAndReservation();
//Retrieve Reservation Data if any
			logger.debug("reservationId : " + reservationId);
			if(null !=reservationId) {
			BASE_URL = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_RESERVATION_DOCUMENT_SRV/A_ReservationDocumentHeader?$format=json&$expand=to_ReservationDocumentItem&$filter=Reservation eq '"+reservationId+"'";
			com.sap.apibhub.sdk.api_reservation_document_srv.model.Wrapper res = new com.sap.apibhub.sdk.api_reservation_document_srv.model.Wrapper();
			res=(Wrapper) this.retreiveData(BASE_URL, authoriz, csrf, res);
			ordNres.setReservation(res);
			
			}
		
		
		
		
//retrieve salesOrder data if any
			logger.debug("salesOrderId : " + salesOrderId);
			if(null != salesOrderId) {
				BASE_URL = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_SALES_ORDER_SRV/A_SalesOrder?$format=json&$expand=to_Item,to_PricingElement,to_Partner,to_PaymentPlanItemDetails,to_Text&$filter=SalesOrder eq '"+salesOrderId+"'";
				wrapperSo = new com.sap.apibhub.sdk.api_sales_order_srv.model.Wrapper();
				wrapperSo = (com.sap.apibhub.sdk.api_sales_order_srv.model.Wrapper) this.retreiveData(BASE_URL, authoriz, csrf, wrapperSo);
				ordNres.setSalesOrder(wrapperSo);
			}
		
		
		
		
		
		
//Check if given batch has required quantity else throw error
//https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_MATERIAL_STOCK_SRV/A_MaterialStock('WPE2963')//to_MatlStkInAcctMod?$filter=StorageLocation eq '100A' 
			logger.debug("orderMaterial : " + orderMaterial);
			logger.debug("Qty : " + qty);
			logger.debug("batch : " + batch);
			String batche = null;
			boolean sufficient = false;
			String plant = null;
			com.sap.apibhub.sdk.api_material_stock_srv.model.Wrapper1 wrapper = new com.sap.apibhub.sdk.api_material_stock_srv.model.Wrapper1();
			if(orderMaterial.length()>0 && qty.length()>0 && batch.length() ==0) {
			
				BASE_URL = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_MATERIAL_STOCK_SRV/A_MaterialStock('" + orderMaterial + "')/to_MatlStkInAcctMod?$filter=StorageLocation eq '100A'&$format=json";
				wrapper = (com.sap.apibhub.sdk.api_material_stock_srv.model.Wrapper1) this.retreiveData(BASE_URL, authoriz, csrf, wrapper);
				Iterator<APIMATERIALSTOCKSRVAMatlStkInAcctModType> iter = wrapper.getD().getResults().iterator();
				APIMATERIALSTOCKSRVAMatlStkInAcctModType stock;
				sufficient = false;
				batche = null;
				while(iter.hasNext()) {
					stock = iter.next();
					//Iterator<APIMATERIALSTOCKSRVAMatlStkInAcctModType> iter1 = stock.getToMatlStkInAcctMod().getResults().iterator();
					//APIMATERIALSTOCKSRVAMatlStkInAcctModType stkIn;
					//while(iter1.hasNext()) {
						//stkIn = iter1.next();
						Double stkQty = Double.valueOf(stock.getMatlWrhsStkQtyInMatlBaseUnit());
						logger.debug("Qty 148 : " + qty);
						if(stkQty >= Double.valueOf(qty)) {
							sufficient = true;
							batche = stock.getBatch();
							plant = stock.getPlant();
						}
					//}
				
				}
			}
			else if(orderMaterial.length()>0 && qty.length()>0 && batch.length()>0) {
				BASE_URL = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_MATERIAL_STOCK_SRV/A_MaterialStock('" + orderMaterial + "')/to_MatlStkInAcctMod?$filter=StorageLocation eq '100A' and Batch eq '"+batch+"'&$format=json";
				wrapper = (com.sap.apibhub.sdk.api_material_stock_srv.model.Wrapper1) this.retreiveData(BASE_URL, authoriz, csrf, wrapper);
				Iterator<APIMATERIALSTOCKSRVAMatlStkInAcctModType> iter = wrapper.getD().getResults().iterator();
				APIMATERIALSTOCKSRVAMatlStkInAcctModType stock;
				sufficient = false;
				batche = null;
				while(iter.hasNext()) {
					stock = iter.next();
					/*Iterator<APIMATERIALSTOCKSRVAMatlStkInAcctModType> iter1 = stock.getToMatlStkInAcctMod().getResults().iterator();
					APIMATERIALSTOCKSRVAMatlStkInAcctModType stkIn;
					while(iter1.hasNext()) {
						stkIn = iter1.next();*/
						Double stkQty = Double.valueOf(stock.getMatlWrhsStkQtyInMatlBaseUnit());
						if(stkQty >= Integer.getInteger(qty)) {
							sufficient = true;
							batche = stock.getBatch();
							plant = stock.getPlant();
						}
					//}
				}
			}
			
			if(!sufficient) {
				throw new Exception("Insuffient quantity");
			}
		
		
		
		
		
		
//If Sales Order exists then update
			logger.debug("salesOrderId : " + salesOrderId);
			if( salesOrderId.length()>0) {
				APISALESORDERSRVASalesOrderItemType resultsItem = new APISALESORDERSRVASalesOrderItemType();
				resultsItem.setMaterial(orderMaterial);
				resultsItem.setRequestedQuantity(qty);
				resultsItem.setSalesOrder(salesOrderId);
				wrapperSo.getD().getResults().iterator().next().getToItem().addResultsItem(resultsItem);
				BASE_URL = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_SALES_ORDER_SRV/A_SalesOrder?$format=json";
				wrapperSo = (com.sap.apibhub.sdk.api_sales_order_srv.model.Wrapper) this.postData(BASE_URL, authoriz, csrf, wrapperSo,"patch");
				ordNres.setSalesOrder(wrapperSo);
			}
		
		
		
		
		
//If Sales order does not exist Create Sales order with order item
			logger.debug("salesOrderId : " + salesOrderId);
			if(salesOrderId.length()==0) {
				logger.debug("salesOrderId.length()==0  ");
				com.sap.apibhub.sdk.api_sales_order_srv.model.Wrapper soWrap = new com.sap.apibhub.sdk.api_sales_order_srv.model.Wrapper();
				CollectionOfASalesOrderType soColl = new CollectionOfASalesOrderType();
				CollectionOfASalesOrderItemType soItemColl =new CollectionOfASalesOrderItemType();  
 				APISALESORDERSRVASalesOrderType resultOrder = new APISALESORDERSRVASalesOrderType();
				APISALESORDERSRVASalesOrderItemType resultsItem = new APISALESORDERSRVASalesOrderItemType();
				resultOrder.setSalesOrganization("1000");
				resultOrder.setDistributionChannel("10");
				resultOrder.setOrganizationDivision("00");
				resultOrder.setSoldToParty(customerNo);
				resultsItem.setMaterial(orderMaterial);
				resultsItem.setRequestedQuantity(qty);
				resultsItem.setProductionPlant(plant);
				resultsItem.setBatch(batche);
				soItemColl.addResultsItem(resultsItem);
				resultOrder.setToItem(soItemColl);
				soColl.addResultsItem(resultOrder);
				soWrap.d(soColl);
				logger.debug("salesOrderId.length()==0  1 :" + soWrap.toString());
				BASE_URL = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_SALES_ORDER_SRV/A_SalesOrder?$format=json";
				soWrap = (com.sap.apibhub.sdk.api_sales_order_srv.model.Wrapper) this.postData(BASE_URL, authoriz, csrf, soWrap,"post");
				logger.debug("salesOrderId.length()==0  2 :" + soWrap.toString());
				ordNres.setSalesOrder(wrapperSo);
			}
			
		
		
		
		
		
		
//Delete reservation if exists
			logger.debug("reservationId : " + reservationId);
			if( reservationId.length()>0) {
				BASE_URL = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_RESERVATION_DOCUMENT_SRV/A_ReservationDocumentHeader('" + reservationId + "')?$format=json";
				com.sap.apibhub.sdk.api_reservation_document_srv.model.Wrapper delRes = new com.sap.apibhub.sdk.api_reservation_document_srv.model.Wrapper();
				this.deleteData(BASE_URL, authoriz, csrf, delRes);
			}
		

			
//Reserve material as Sales reservation
		/*
		 * https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_RESERVATION_DOCUMENT_SRV/A_ReservationDocumentHeader
		 *	{ "GoodsMovementType": "201", "CostCenter": "2002009", "ReservationDate" : "\/Date(1564574436972)\/", 
		 *		"to_ReservationDocumentItem": [ 
		 *				{ "Product": "FD44420", "Plant": "1000", "ResvnItmRequiredQtyInEntryUnit": "5" } ] }
		 */
		
			com.sap.apibhub.sdk.api_reservation_document_srv.model.Wrapper crRes = new com.sap.apibhub.sdk.api_reservation_document_srv.model.Wrapper();
			com.sap.apibhub.sdk.api_reservation_document_srv.model.CollectionOfAReservationDocumentHeaderType crHeadColl = new com.sap.apibhub.sdk.api_reservation_document_srv.model.CollectionOfAReservationDocumentHeaderType();
			com.sap.apibhub.sdk.api_reservation_document_srv.model.CollectionOfAReservationDocumentItemType crItemColl = new com.sap.apibhub.sdk.api_reservation_document_srv.model.CollectionOfAReservationDocumentItemType(); 
			com.sap.apibhub.sdk.api_reservation_document_srv.model.APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderType crHead = new com.sap.apibhub.sdk.api_reservation_document_srv.model.APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderType();
			com.sap.apibhub.sdk.api_reservation_document_srv.model.APIRESERVATIONDOCUMENTSRVAReservationDocumentItemType crItem = new com.sap.apibhub.sdk.api_reservation_document_srv.model.APIRESERVATIONDOCUMENTSRVAReservationDocumentItemType();
			logger.debug("260 APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderType : "+crHead.toString());
			logger.debug("Methods APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderType : "+Arrays.toString(APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderType.class.getDeclaredMethods()));
			crHead.setCustomer(customerNo);
			crHead.setGoodsMovementType("201");
			crHead.setSalesOrder(ordNres.getSalesOrder().getD().getResults().get(0).getSalesOrder());			
			crHead.setReservationDate(String.format("/Date(%d)/", new Date().getTime()));
			crHead.setCostCenter("2002009");
			crHead.setToReservationDocumentItem(crItemColl);
			Iterator<APISALESORDERSRVASalesOrderItemType> iter = ordNres.getSalesOrder().getD().getResults().get(0).getToItem().getResults().iterator();
			while(iter.hasNext()) {
				APISALESORDERSRVASalesOrderItemType item = (APISALESORDERSRVASalesOrderItemType) iter.next();
				crItem = new com.sap.apibhub.sdk.api_reservation_document_srv.model.APIRESERVATIONDOCUMENTSRVAReservationDocumentItemType();
				crItem.setProduct(item.getMaterial());
				crItem.setPlant(item.getProductionPlant());
				crItem.setResvnItmRequiredQtyInEntryUnit(item.getRequestedQuantity());
				crHead.getToReservationDocumentItem().addResultsItem(crItem);
			}
			crHeadColl.addResultsItem(crHead);
			crRes.d(crHeadColl);
			logger.debug(crRes.toString());
			BASE_URL = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_RESERVATION_DOCUMENT_SRV/A_ReservationDocumentHeader?$format=json";
			crRes = (com.sap.apibhub.sdk.api_reservation_document_srv.model.Wrapper) this.postData(BASE_URL, authoriz, csrf, crRes, "post");
			logger.debug(crRes.toString());
			ordNres.setReservation(crRes);
		
		
		return ordNres;
	}
	
	private Object retreiveData(String url,String authoriz,String csrf,Object wrapper) {
		String BASE_URL = url;
		String responseBody = "";
		
		Request request = new Request.Builder()
			      .url(BASE_URL )
			      .addHeader("Accept", "application/json")
			      .addHeader("Content-Type", "application/json")
			      .addHeader("X-CSRF-TOKEN", "FETCH")
			      .addHeader("Authorization", authoriz)
			      .get()
			      .build();	
			System.out.println("--Request : " +request.urlString());
			OkHttpClient client = new OkHttpClient();
			Call call = client.newCall(request);
			    try{Response response = call.execute();
				    if(response.code() == (200)) {
				    	System.out.println("---200--ok");
				    	Gson gson = new Gson();
				    	responseBody = response.body().string();
				    	this.csrf = response.header("X-CSRF-TOKEN");
				    	logger.debug("---ResponseBody X-CSRF-TOKEN : "+ csrf);
				    	System.out.println("---ResponseBody : "+responseBody);
				    	wrapper = gson.fromJson(responseBody, wrapper.getClass());
				    	
				    }
			    }catch(Exception e) {e.printStackTrace();}
			
			    logger.debug(wrapper.toString());
			    return wrapper;
	}
	
	private Object postData(String url,String authoriz,String csrf,Object wrapper,String method) {
		String BASE_URL = url;
		Gson gson = new Gson();
		String responseBody = "";
		Request request =null;
		MediaType JSON = MediaType.parse("application/json; charset=utf-8");
		RequestBody body = RequestBody.create(JSON, gson.toJson(wrapper));
		if(method.contains("post")) {
		request = new Request.Builder()
			      .url(BASE_URL )
			      .addHeader("Accept", "application/json")
			      .addHeader("Content-Type", "application/json")
			      .addHeader("X-CSRF-TOKEN", csrf)
			      .addHeader("Authorization", authoriz)
			      .post(body)
			      .build();	//"Basic QkhGX0NPTU06bkJoTHNpd1dYbWZ3cW1YKUZETFJVQTZTd2RDaXRBWFVzd3dad0xxWA=="
		}
		else if(method.contains("patch")) {
			request = new Request.Builder()
				      .url(BASE_URL )
				      .addHeader("Accept", "application/json")
				      .addHeader("Content-Type", "application/json")
				      .addHeader("X-CSRF-TOKEN", csrf)
				      .addHeader("Authorization", authoriz)
				      .patch(body)
				      .build();	//"Basic QkhGX0NPTU06bkJoTHNpd1dYbWZ3cW1YKUZETFJVQTZTd2RDaXRBWFVzd3dad0xxWA=="
			}
		
			System.out.println("--Request : " +request.urlString());
			logger.debug(" postData : " + request.toString());
			OkHttpClient client = new OkHttpClient();
			Call call = client.newCall(request);
			    try{Response response = call.execute();
			    responseBody = response.body().string();
			    this.csrf = response.header("X-CSRF-TOKEN");
		    	logger.debug("---ResponseBody X-CSRF-TOKEN : "+ csrf);
		    	System.out.println("---ResponseBody : "+responseBody);
		    	    if(response.code() == (200)) {
				    	System.out.println("---200--ok");
				    	wrapper = gson.fromJson(responseBody, wrapper.getClass());
				    }
			    }catch(Exception e) {e.printStackTrace();}
			
			    logger.debug(wrapper.toString());
			    return wrapper;
	}
	
	private Object deleteData(String url,String authoriz,String csrf,Object wrapper) {
		String BASE_URL = url;
		String responseBody = "";
		Integer responseCode=null;
		Request request = new Request.Builder()
			      .url(BASE_URL )
			      .addHeader("Accept", "application/json")
			      .addHeader("Content-Type", "application/json")
			      .addHeader("X-CSRF-TOKEN", csrf)
			      .addHeader("Authorization", authoriz)
			      .delete()
			      .build();	
			System.out.println("--Request : " +request.urlString());
			OkHttpClient client = new OkHttpClient();
			Call call = client.newCall(request);
			    try{Response response = call.execute();
			    	responseCode = response.code();
				    if(responseCode == (200)) {
				    	System.out.println("---200--ok");
				    	Gson gson = new Gson();
				    	responseBody = response.body().string();
				    	this.csrf = response.header("X-CSRF-TOKEN");
				    	logger.debug("---ResponseBody X-CSRF-TOKEN : "+ csrf);
				    	System.out.println("---ResponseBody : "+responseBody);
				    	wrapper = gson.fromJson(responseBody, wrapper.getClass());
				    	
				    }
			    }catch(Exception e) {e.printStackTrace();}
			
			    logger.debug(wrapper.toString());
			    return responseCode;
	}
	

}
