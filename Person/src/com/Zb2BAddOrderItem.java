package com;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
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

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;

import com.google.gson.Gson;
import com.sap.apibhub.sdk.api_material_stock_srv.model.APIMATERIALSTOCKSRVAMaterialStockType;
import com.sap.apibhub.sdk.api_material_stock_srv.model.APIMATERIALSTOCKSRVAMatlStkInAcctModType;
import com.sap.apibhub.sdk.api_reservation_document_srv.api.AReservationDocumentHeaderApi;
import com.sap.apibhub.sdk.api_reservation_document_srv.model.APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderType;
import com.sap.apibhub.sdk.api_reservation_document_srv.model.AReservationDocumentHeaderType;
import com.sap.apibhub.sdk.api_reservation_document_srv.model.Wrapper;
import com.sap.apibhub.sdk.api_sales_order_srv.api.ASalesOrderApi;
import com.sap.apibhub.sdk.api_sales_order_srv.model.APISALESORDERSRVASalesOrderItemType;
import com.sap.apibhub.sdk.api_sales_order_srv.model.APISALESORDERSRVASalesOrderItemTypeCreate;
import com.sap.apibhub.sdk.api_sales_order_srv.model.APISALESORDERSRVASalesOrderType;
import com.sap.apibhub.sdk.api_sales_order_srv.model.APISALESORDERSRVASalesOrderTypeCreate;
import com.sap.apibhub.sdk.api_sales_order_srv.model.APISALESORDERSRVASalesOrderTypecreateToItem;
import com.sap.apibhub.sdk.api_sales_order_srv.model.CollectionOfASalesOrderItemType;
import com.sap.apibhub.sdk.api_sales_order_srv.model.CollectionOfASalesOrderType;
import com.sap.apibhub.sdk.client.ApiClient;
import com.sap.apibhub.sdk.client.Configuration;
//import com.sap.cloud.sdk.cloudplatform.logging.CloudLoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Zb2BAddOrderItem implements Zb2BAddOrderItemInterface {
	final Logger logger = LoggerFactory.getLogger(Zb2BAddOrderItem.class);
	@Resource
	WebServiceContext wsctx;
	String csrf;
	Gson gson = new Gson();

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
			/*logger.debug("reservationId : " + reservationId);
			if(null !=reservationId) {
			BASE_URL = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_RESERVATION_DOCUMENT_SRV/A_ReservationDocumentHeader?$format=json&$expand=to_ReservationDocumentItem&$filter=Reservation eq '"+reservationId+"'";
			com.sap.apibhub.sdk.api_reservation_document_srv.model.Wrapper res = new com.sap.apibhub.sdk.api_reservation_document_srv.model.Wrapper();
			res=(Wrapper) this.retreiveData(BASE_URL, authoriz, csrf, res);
			ordNres.setReservation(res);
			
			}*/
		
		
		
		
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
				APISALESORDERSRVASalesOrderType orderType = null; 
				wrapperSo.getD().getResults().iterator().next().getToItem().addResultsItem(resultsItem);
				orderType =wrapperSo.getD().getResults().iterator().next(); 
				BASE_URL = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_SALES_ORDER_SRV/A_SalesOrder?$format=json";
				wrapperSo = (com.sap.apibhub.sdk.api_sales_order_srv.model.Wrapper) this.salesOrderPatch(BASE_URL, authoriz, csrf, orderType);
				ordNres.setSalesOrder(wrapperSo);
			}
		
		
		
		
		
//If Sales order does not exist Create Sales order with order item
			logger.debug("salesOrderId : " + salesOrderId);
			if(salesOrderId.length()==0) {
				logger.debug("salesOrderId.length()==0  ");
				com.sap.apibhub.sdk.api_sales_order_srv.model.Wrapper soWrap = new com.sap.apibhub.sdk.api_sales_order_srv.model.Wrapper();
				CollectionOfASalesOrderType soColl = new CollectionOfASalesOrderType();
				CollectionOfASalesOrderItemType soItemColl =new CollectionOfASalesOrderItemType();  
				APISALESORDERSRVASalesOrderTypeCreate resultOrder = new APISALESORDERSRVASalesOrderTypeCreate();
				APISALESORDERSRVASalesOrderTypecreateToItem resultsToItem = new APISALESORDERSRVASalesOrderTypecreateToItem();
				APISALESORDERSRVASalesOrderItemTypeCreate resItem = new APISALESORDERSRVASalesOrderItemTypeCreate();
				resultOrder.setSalesOrderType("OR");
				resultOrder.setSalesOrganization("1000");
				resultOrder.setDistributionChannel("10");
				resultOrder.setOrganizationDivision("00");
				resultOrder.setSoldToParty(customerNo);
				
				resItem.setMaterial(orderMaterial);
				resItem.setRequestedQuantity(qty);
				resItem.setProductionPlant(plant);
				resItem.setBatch(batche);
				//soItemColl.addResultsItem(resultsItem);
				resultsToItem.addResultsItem(resItem);
				resultOrder.setToItem(resultsToItem);
				//soColl.addResultsItem(resultOrder);
				soWrap.d(soColl);
				BASE_URL = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_SALES_ORDER_SRV/A_SalesOrder?$format=json&$top=1";
				wrapperSo = (com.sap.apibhub.sdk.api_sales_order_srv.model.Wrapper) this.retreiveData(BASE_URL, authoriz, "FETCH", wrapperSo);
				logger.debug("salesOrderId.length()==0  1 :" + gson.toJson(soWrap));
				BASE_URL = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_SALES_ORDER_SRV/A_SalesOrder";
				
				logger.debug("csrf : "+csrf);
				//soWrap = (com.sap.apibhub.sdk.api_sales_order_srv.model.Wrapper) this.postData(BASE_URL, authoriz, csrf, resultOrder,"post");
// before using api.sap.com sample code for post sales order
				
				wrapperSo = (com.sap.apibhub.sdk.api_sales_order_srv.model.Wrapper) this.salesOrderPost(BASE_URL, authoriz, csrf, resultOrder);
				
				logger.debug("salesOrderId.length()==0  2 :" + gson.toJson(wrapperSo));

//after api.sap.com for post sales order
				
				ordNres.setSalesOrder(wrapperSo);
			}
			
		
		
		
		
		
		
//Delete reservation if exists
			/*logger.debug("reservationId : " + reservationId);
			if( reservationId.length()>0) {
				BASE_URL = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_RESERVATION_DOCUMENT_SRV/A_ReservationDocumentHeader('" + reservationId + "')?$format=json";
				com.sap.apibhub.sdk.api_reservation_document_srv.model.Wrapper delRes = new com.sap.apibhub.sdk.api_reservation_document_srv.model.Wrapper();
				this.deleteData(BASE_URL, authoriz, csrf, delRes);
			}*/
		

			
//Reserve material as Sales reservation
		/*
		 * https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_RESERVATION_DOCUMENT_SRV/A_ReservationDocumentHeader
		 *	{ "GoodsMovementType": "201", "CostCenter": "2002009", "ReservationDate" : "\/Date(1564574436972)\/", 
		 *		"to_ReservationDocumentItem": [ 
		 *				{ "Product": "FD44420", "Plant": "1000", "ResvnItmRequiredQtyInEntryUnit": "5" } ] }
		 */
		
/*			com.sap.apibhub.sdk.api_reservation_document_srv.model.Wrapper crRes = new com.sap.apibhub.sdk.api_reservation_document_srv.model.Wrapper();
			com.sap.apibhub.sdk.api_reservation_document_srv.model.CollectionOfAReservationDocumentHeaderType crHeadColl = new com.sap.apibhub.sdk.api_reservation_document_srv.model.CollectionOfAReservationDocumentHeaderType();
			com.sap.apibhub.sdk.api_reservation_document_srv.model.CollectionOfAReservationDocumentItemType crItemColl = new com.sap.apibhub.sdk.api_reservation_document_srv.model.CollectionOfAReservationDocumentItemType(); 
			com.sap.apibhub.sdk.api_reservation_document_srv.model.APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderType crHead = new com.sap.apibhub.sdk.api_reservation_document_srv.model.APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderType();
			com.sap.apibhub.sdk.api_reservation_document_srv.model.APIRESERVATIONDOCUMENTSRVAReservationDocumentItemType crItem = new com.sap.apibhub.sdk.api_reservation_document_srv.model.APIRESERVATIONDOCUMENTSRVAReservationDocumentItemType();
			logger.debug("260 APIRESERVATIONDOCUMENTSRVAReservationDocumentHeaderType : "+crHead.toString());
			logger.debug("310 ordNres : " + gson.toJson(ordNres));			
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
*/		
		
		return ordNres;
	}
	
	private Object retreiveData(String url,String authoriz,String csrf,Object wrapper) throws Exception {
		String BASE_URL = url;
		String responseBody = "";
		InputStreamReader in = null;
		DataOutputStream dataOut = null;
		try {
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(url);

		// add request header
		request.addHeader("User-Agent", "Java");
		request.addHeader("Content-Type","application/json");
		request.addHeader("Accept","application/json");
		request.addHeader("APIKey","SzC1d22J7FqnBtcSAcGfbLZj6g1DmbXm");
		request.addHeader("Authorization",authoriz);
		request.addHeader("X-CSRF-TOKEN","FETCH");
		HttpResponse respons = client.execute(request);
	  
	  
	  System.out.println("csrf:"+csrf);
	  System.out.println("List all headers:");
	  csrf = respons.getFirstHeader("X-CSRF-TOKEN").getValue();
	  StringBuffer result = new StringBuffer();
	    if(200==respons.getStatusLine().getStatusCode()) {
	    	BufferedReader rd = new BufferedReader(
	    	        new InputStreamReader(respons.getEntity().getContent()));
	    	
	    	String line = "";
	    	while ((line = rd.readLine()) != null) {
	    		result.append(line);
	    	}
	    	System.out.println("result : "+result);
	    	wrapper = gson.fromJson(result.toString(), wrapper.getClass());
	    }
		} catch (Exception e) {
			  //do something with exception
			  e.printStackTrace();
			} finally {
			  try {
			    if(dataOut != null) {
			      dataOut.close();
			    }
			    if(in != null) {
			      in.close();
			    }

			  } catch (IOException e) {
			    //do something with exception
			    e.printStackTrace();
			  }
			}
				    
			    
			
			    logger.debug(wrapper.toString());
			    return wrapper;
	}
	
	/*private Object postData(String url,String authoriz,String csrf,Object wrapper,String method) {
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
	}*/
	
	/*private Object deleteData(String url,String authoriz,String csrf,Object wrapper) {
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
	}*/
	
	public static void main(String[] args) {
		Zb2BAddOrderItem zB2b = new Zb2BAddOrderItem();
		ASalesOrderApi api = new ASalesOrderApi();
	}
	
	public Object salesOrderPost(String url,String authoriz,String csrf,Object wrapper) {
		DataOutputStream dataOut = null;
		BufferedReader br =null;
		InputStreamReader in = null;
		Gson gson = new Gson();
		com.sap.apibhub.sdk.api_sales_order_srv.model.Wrapper wrap = new com.sap.apibhub.sdk.api_sales_order_srv.model.Wrapper();
		String data = "";
		try {

		  URL urlObj = new URL(url);
		  HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(url);

			// add request header
			request.addHeader("User-Agent", "Java");
			request.addHeader("Content-Type","application/json");
			request.addHeader("Accept","application/json");
			request.addHeader("APIKey","SzC1d22J7FqnBtcSAcGfbLZj6g1DmbXm");
			request.addHeader("Authorization",authoriz);
			request.addHeader("X-CSRF-TOKEN","FETCH");
			HttpResponse respons = client.execute(request);
		  
		  
		  System.out.println("csrf:"+csrf);
		  System.out.println("List all headers:");
		  csrf = respons.getFirstHeader("X-CSRF-TOKEN").getValue();
		    Header[] map = respons.getAllHeaders();

		    /*for (int i=0;i<map.length;i++) {
		    	Header h = map[i];
			System.out.println(h.getName() + ": " + h.getValue());
		    }*/
		    System.out.println(csrf);
		    data = gson.toJson(wrapper );
		    HttpPost pReq = new HttpPost(url);
		    pReq.addHeader("User-Agent", "Java");
		    pReq.addHeader("Content-Type","application/json");
		    pReq.addHeader("Accept","application/json");
		    pReq.addHeader("APIKey","SzC1d22J7FqnBtcSAcGfbLZj6g1DmbXm");
		    pReq.addHeader("Authorization",authoriz);
		    pReq.addHeader("X-CSRF-TOKEN",csrf);
		    pReq.setEntity(new StringEntity(data));
		    respons = client.execute(pReq);
		    System.out.println("response : "+respons.getStatusLine().getStatusCode());
		    respons.getEntity().writeTo(System.out);
		    csrf = respons.getFirstHeader("X-CSRF-TOKEN").getValue();
		    StringBuffer result = new StringBuffer();
		    if(200==respons.getStatusLine().getStatusCode()) {
		    	in = new InputStreamReader(respons.getEntity().getContent());
		    	BufferedReader rd = new BufferedReader(in);		    	
		    	String line = "";
		    	while ((line = rd.readLine()) != null) {
		    		result.append(line);
		    	}
		    	System.out.println("result : "+result);
		    	wrap = gson.fromJson(result.toString(), wrap.getClass());
		    }
		    	wrap.setStatus(""+respons.getStatusLine().getStatusCode());
		    	wrap.setResponse(result.toString());
		    
		  //setting request method
		  		} catch (Exception e) {
		  //do something with exception
		  e.printStackTrace();
		} finally {
		  try {
		    if(dataOut != null) {
		      dataOut.close();
		    }
		    if(in != null) {
		      in.close();
		    }

		  } catch (IOException e) {
		    //do something with exception
		    e.printStackTrace();
		  }
		}
		return wrap;
	}

	public com.sap.apibhub.sdk.api_sales_order_srv.model.Wrapper salesOrderPatch(String url,String authoriz,String csrf,Object requestWrapper) {
		DataOutputStream dataOut = null;
		BufferedReader br =null;
		InputStreamReader in = null;
		Gson gson = new Gson();
		com.sap.apibhub.sdk.api_sales_order_srv.model.Wrapper wrap = new com.sap.apibhub.sdk.api_sales_order_srv.model.Wrapper();
		String data = "";
		try {

		  URL urlObj = new URL(url);
		  HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(url);

			// add request header
			request.addHeader("User-Agent", "Java");
			request.addHeader("Content-Type","application/json");
			request.addHeader("Accept","application/json");
			request.addHeader("APIKey","SzC1d22J7FqnBtcSAcGfbLZj6g1DmbXm");
			request.addHeader("Authorization",authoriz);
			request.addHeader("X-CSRF-TOKEN","FETCH");
			HttpResponse respons = client.execute(request);
		  
		  
		  System.out.println("csrf:"+csrf);
		  System.out.println("List all headers:");
		  csrf = respons.getFirstHeader("X-CSRF-TOKEN").getValue();
		    Header[] map = respons.getAllHeaders();

		    /*for (int i=0;i<map.length;i++) {
		    	Header h = map[i];
			System.out.println(h.getName() + ": " + h.getValue());
		    }*/
		    System.out.println(csrf);
		    data = gson.toJson(requestWrapper );
		    HttpPost pReq = new HttpPost(url);
		    pReq.addHeader("User-Agent", "Java");
		    pReq.addHeader("Content-Type","application/json");
		    pReq.addHeader("Accept","application/json");
		    pReq.addHeader("APIKey","SzC1d22J7FqnBtcSAcGfbLZj6g1DmbXm");
		    pReq.addHeader("Authorization",authoriz);
		    pReq.addHeader("X-CSRF-TOKEN",csrf);
		    pReq.setEntity(new StringEntity(data));
		    respons = client.execute(pReq);
		    System.out.println("response : "+respons.getStatusLine().getStatusCode());
		    respons.getEntity().writeTo(System.out);
		    csrf = respons.getFirstHeader("X-CSRF-TOKEN").getValue();
		    StringBuffer result = new StringBuffer();
		    if(200==respons.getStatusLine().getStatusCode()) {
		    	in = new InputStreamReader(respons.getEntity().getContent());
		    	BufferedReader rd = new BufferedReader(in);		    	
		    	String line = "";
		    	while ((line = rd.readLine()) != null) {
		    		result.append(line);
		    	}
		    	System.out.println("result : "+result);
		    	wrap = gson.fromJson(result.toString(), wrap.getClass());
		    }
		    	wrap.setStatus(""+respons.getStatusLine().getStatusCode());
		    	wrap.setResponse(result.toString());
		    
		  //setting request method
		  		} catch (Exception e) {
		  //do something with exception
		  e.printStackTrace();
		} finally {
		  try {
		    if(dataOut != null) {
		      dataOut.close();
		    }
		    if(in != null) {
		      in.close();
		    }

		  } catch (IOException e) {
		    //do something with exception
		    e.printStackTrace();
		  }
		}
		return wrap;
	}

}
