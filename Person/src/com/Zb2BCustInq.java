package com;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebParam;
import javax.naming.AuthenticationException;
import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.sap.apibhub.sdk.api_business_partner.api.ABusinessPartnerAddressApi;
import com.sap.apibhub.sdk.api_business_partner.model.APIBUSINESSPARTNERABusinessPartnerAddressType;
import com.sap.apibhub.sdk.api_business_partner.model.Wrapper9;
import com.sap.apibhub.sdk.client.ApiClient;
import com.sap.apibhub.sdk.client.ApiException;
import com.sap.apibhub.sdk.client.ApiResponse;
import com.sap.apibhub.sdk.client.Configuration;
import com.sap.apibhub.sdk.client.auth.ApiKeyAuth;
import com.sap.apibhub.sdk.client.auth.Authentication;
import com.sap.apibhub.sdk.client.auth.HttpBasicAuth;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class Zb2BCustInq implements Zb2BCustInqInterface{
	@Resource
	public WebServiceContext wsctx;
	Logger logger = LoggerFactory.getLogger(Zb2BCustInq.class);

	@Override
	public Zb2BCustInqWrapper getCustomerValidation(String customer) throws Exception {
		MessageContext mctx = wsctx.getMessageContext();
		//HttpServletRequest sRequest = (HttpServletRequest)wsctx.getMessageContext().get(MessageContext.SERVLET_REQUEST);
		//logger.error("----Server Name : " + sRequest.getServerName());
		//get detail from request headers
	        Map http_headers = (Map) mctx.get(MessageContext.HTTP_REQUEST_HEADERS);
	        System.out.println(Arrays.toString(http_headers.keySet().toArray()));
	        System.out.println(Arrays.toString(http_headers.values().toArray()));
	        //System.out.println(http_headers.get("Authorization").getClass().getName());
	        //System.out.println(http_headers.get("Authorization").toString());
	        List userList = (List) http_headers.get("Username");
	        List passList = (List) http_headers.get("Password");
	        ArrayList authList = (ArrayList) http_headers.get("Authorization");
	        
	        String username = "";
	        String password = "";
	        String authoriz = "";
	        
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
	        //System.out.println("User : " + username);
	        //System.out.println("Pass : " + password);
	        //System.out.println("Auth : " + authoriz);
	        //System.out.println("Basic " + Base64.getEncoder().encodeToString((username + ":" +password).getBytes()));
	        //https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_BusinessPartnerAddress?$format=json&expand=to_BusinessPartnerAddress&$filter=BusinessPartner eq 'SIVA G'
	        
	        Zb2BCustInqWrapper z = new Zb2BCustInqWrapper();
		//String BASE_URL = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_CustomerSalesArea(Customer='"+customer+"',SalesOrganization='"+salesOrganization+"',DistributionChannel='"+distributionChannel+"',Division='"+division+"')?$format=json&$select=Customer,SalesOrganization,DistributionChannel,ShippingCondition,CustomerPaymentTerms,DeliveryIsBlockedForCustomer,OrderIsBlockedForCustomer";
	        String BASE_URL = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_CustomerSalesArea?$format=json&$select=Customer,SalesOrganization,DistributionChannel,Division,ShippingCondition,CustomerPaymentTerms,DeliveryIsBlockedForCustomer,OrderIsBlockedForCustomer,DeletionIndicator&$filter=Customer eq '"+customer+"'";
		Response response;
		String responseBody = "";
		Request request = new Request.Builder()
			      .url(BASE_URL )
			      .addHeader("Content-Type", "application/json")
			      .addHeader("X-CSRF-TOKEN", "FETCH")
			      .addHeader("Authorization", authoriz)
			      .get()
			      .build();	//"Basic QkhGX0NPTU06bkJoTHNpd1dYbWZ3cW1YKUZETFJVQTZTd2RDaXRBWFVzd3dad0xxWA=="
			System.out.println("--Request : " +request.urlString());
			 OkHttpClient client = new OkHttpClient();
			 
			    Call call = client.newCall(request);
			    
			    try{response = call.execute();
			 
			    if(response.code() == (200)) {
			    	System.out.println("---200--ok");
			    	Gson gson = new Gson();
			    	//response.header("")
			    	responseBody = response.body().string();
			    	System.out.println("---ResponseBody : "+responseBody);
			    	z = gson.fromJson(responseBody, Zb2BCustInqWrapper.class);
			    	z.setStatus("000");
			    	System.out.println("-- Shipping Condition : " + z.getD().getResults().get(0).getShippingCondition());
			    	System.out.println("-- z : " + z.toString());
			    	if(z.getD().getResults().get(0).getDeliveryIsBlockedForCustomer().length()>0 ) {    //|| z.getD().getOrderIsBlockedForCustomer().length()>0
			    		if(Integer.parseInt(z.getD().getResults().get(0).getDeliveryIsBlockedForCustomer()) == 54)
			    		z.setStatus("002");
			    	}
			    	/*if(  z.getD().getShippingCondition().length() == 0) {
			    		//if(Integer.parseInt(z.getD().getShippingCondition()) == 0)
			    		z.setStatus("001");
			    	}
			    	else*/
			    		if(  z.getD().getResults().get(0).getShippingCondition().length()>0) {if(z.getD().getResults().get(0).getShippingCondition().matches("00")){z.setStatus("001");}else {
				    	//else {
				    		// https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/YY1_SHIPPING_CONDITIONS_CDS/YY1_SHIPPING_CONDITIONS?$format=json
				    		BASE_URL="https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/YY1_SHIPPING_CONDITIONS_CDS/YY1_SHIPPING_CONDITIONS?$format=json&$filter=VSBED eq '"+z.getD().getResults().get(0).getShippingCondition()+"'";
				    		request = new Request.Builder()
				  			      .url(BASE_URL )
				  			      .addHeader("Content-Type", "application/json")
				  			      .addHeader("X-CSRF-TOKEN", "FETCH")
				  			      .addHeader("Authorization", authoriz)
				  			      .get()
				  			      .build();
				    		client = new OkHttpClient();
				    		call = client.newCall(request);
				    		response = call.execute();
				    		responseBody = response.body().string();
				    		System.out.println("---YY1_SHIPPING_CONDITIONS : " + responseBody);
				    		gson = new Gson();
				    		com.Yy1ShippingConditionsWrapper y = new com.Yy1ShippingConditionsWrapper();
				    		y=gson.fromJson(responseBody, Yy1ShippingConditionsWrapper.class);
				    		//z.setStatus("000");
				    		System.out.println("--Shipping : " + y.getD().getResults().get(0).getVTEXT());
				    		Shipping shipping = z.getShipping();
				    		shipping.setShipping(z.getD().getResults().get(0).getShippingCondition());
				    		shipping.setShippingText(y.getD().getResults().get(0).getVTEXT());
				    	//}
			    	}}
			    	
			    }else {z.setStatus("001");System.out.println("---ResponseBody : "+response.body().string());}
			    System.out.println("Message : " + response.message());
			    //
			    
			    }catch(Exception e) {e.printStackTrace(); throw e;}
			    logger.debug("---Address----------------------------------------------------------------------------------------------------------------------");
			    //https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_BusinessPartnerAddress?$format=json&expand=to_BusinessPartnerAddress&$filter=BusinessPartner eq 'SIVA G'
			    
			    BASE_URL = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_BusinessPartnerAddress?$format=json&expand=to_BusinessPartnerAddress&$filter=BusinessPartner eq '"+customer+"'";
			    ApiClient api = new ApiClient();
			    api.setBasePath(BASE_URL);
			    com.sap.apibhub.sdk.api_business_partner.model.Wrapper9 w= new com.sap.apibhub.sdk.api_business_partner.model.Wrapper9();
				responseBody = "";
				request = new Request.Builder()
					      .url(BASE_URL )
					      .addHeader("Content-Type", "application/json")
					      .addHeader("X-CSRF-TOKEN", "FETCH")
					      .addHeader("Authorization", authoriz)
					      .get()
					      .build();	//"Basic QkhGX0NPTU06bkJoTHNpd1dYbWZ3cW1YKUZETFJVQTZTd2RDaXRBWFVzd3dad0xxWA=="
					System.out.println("--Request : " +request.urlString());
					  client = new OkHttpClient();					 
					     call = client.newCall(request);					    
					    try{response = call.execute();
					 
					    if(response.code() == (200)) {
					    	System.out.println("---200--ok");
					    	Gson gson = new Gson();
					    	//response.header("")
					    	responseBody = response.body().string();
					    	System.out.println("---ResponseBody : "+responseBody);
					    	w = gson.fromJson(responseBody, com.sap.apibhub.sdk.api_business_partner.model.Wrapper9.class);
					    	logger.debug("---Address : " + w.toString());
					    	z.setAddress((APIBUSINESSPARTNERABusinessPartnerAddressType)w.getD().getResults().get(0));
					    }
					    }catch(Exception e) {e.printStackTrace();}
					    
				logger.debug("----Wrapper Customer Inq : " + z.toString());
		return z;
	}
	
	public static void main(String[] args) {
		String BASE_URL = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_BusinessPartnerAddress?$format=json&expand=to_BusinessPartnerAddress&$filter=BusinessPartner eq 'SIVA G'";
		Request request = new Request.Builder()
			      .url(BASE_URL )
			      .addHeader("Content-Type", "application/json")
			      .addHeader("X-CSRF-TOKEN", "FETCH")
			      .addHeader("Authorization", "Basic QkhGX0NPTU06bkJoTHNpd1dYbWZ3cW1YKUZETFJVQTZTd2RDaXRBWFVzd3dad0xxWA==")
			      .get()
			      .build();	//"Basic QkhGX0NPTU06bkJoTHNpd1dYbWZ3cW1YKUZETFJVQTZTd2RDaXRBWFVzd3dad0xxWA=="
			System.out.println("--Request : " +request.urlString());
			ApiClient defaultClient = Configuration.getDefaultApiClient();
			defaultClient.setBasePath("https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_BUSINESS_PARTNER");
			Map<String, Authentication> authentications = defaultClient.getAuthentications();
			//authentications.put(key, value)
			//HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuthentication");
			HttpBasicAuth basicAuthentication = new HttpBasicAuth();
			basicAuthentication.setUsername("BHF_COMM");
			basicAuthentication.setPassword("nBhLsiwWXmfwqmX)FDLRUA6SwdCitAXUswwZwLqX");
			authentications.put("basicAuthentication", basicAuthentication);
			defaultClient.addDefaultHeader("APIKey","SzC1d22J7FqnBtcSAcGfbLZj6g1DmbXm"); 		
			authentications.put("APIBHUB_SANDBOX_APIKEY", new ApiKeyAuth("header", "APIKey"));
			ABusinessPartnerAddressApi apiInstance = new ABusinessPartnerAddressApi();
			apiInstance.setApiClient(defaultClient);
			try {
				Wrapper9 w9 = apiInstance.aBusinessPartnerAddressGet(null, null, null, null, null, null, null); //top, skip, filter, inlinecount, orderby, select, expand
				System.out.println("----w9 : " + w9.toString());
			} catch (ApiException e1) {
				e1.printStackTrace();
			}    
			
			
	    ApiClient api = new ApiClient();
	    api.setBasePath(BASE_URL);
	    api.setUsername("BHF_COMM");
	    api.setPassword("nBhLsiwWXmfwqmX)FDLRUA6SwdCitAXUswwZwLqX");
	    
	    try {
			ApiResponse body = api.execute(api.getHttpClient().newCall(request));
			System.out.println("ApiResponse ---- "+body.getClass());
			System.out.println("ApiResponse ---- "+body.getData());
			System.out.println("ApiResponse ---- "+body.getData().toString());
			System.out.println("ApiResponse ---- "+body.toString());
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}