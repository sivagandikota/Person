package com;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.naming.AuthenticationException;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

@Service
public class ZwPopSkuOrigin implements ZwPopSkuOriginInterface{
	@Resource
	WebServiceContext wsctx;

	@Override
	public ZwPopSkuOriginWrapper getCountryOfOrigin(String product) throws Exception {
		
		MessageContext mctx = wsctx.getMessageContext();
		
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
	        
		ZwPopSkuOriginWrapper z = new ZwPopSkuOriginWrapper();
		String BASE_URL = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_PRODUCT_SRV/A_ProductPlant(Product='" + product + "',Plant='1000')?$select=CountryOfOrigin&$format=json";
		Response response;
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
			    	z = gson.fromJson(response.body().string(), ZwPopSkuOriginWrapper.class);
			    	z.setStatus("000");
			    }else {z.setStatus("001");System.out.println("---ResponseBody : "+response.body().string());}
			    System.out.println("Message : " + response.message());
			    //
			    
			    }catch(Exception e) {e.printStackTrace(); throw e;}
			    System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		return z;
	}
	
}