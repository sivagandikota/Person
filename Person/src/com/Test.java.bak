package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import com.google.gson.Gson;

public class Test implements Interface {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "Hello " + name;
	}

	//@Override
	public String createOrder(String SoldToParty, String CustomerReference) {
		// TODO Auto-generated method stub
		String data = "";
		String authoriz = "Basic QkhGX0NPTU06bkJoTHNpd1dYbWZ3cW1YKUZETFJVQTZTd2RDaXRBWFVzd3dad0xxWA==";
		String csrf = "";
		String url = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_SALES_ORDER_SRV/A_SalesOrder";
		StringBuffer result = new StringBuffer();
		try {

		  URL urlObj = new URL(url);
		  HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(url);

			// add request header
			//request.addHeader("User-Agent", "Java");
			request.addHeader("Content-Type","application/json");
			request.addHeader("Accept","application/json");
			//request.addHeader("APIKey","SzC1d22J7FqnBtcSAcGfbLZj6g1DmbXm");
			request.addHeader("Authorization",authoriz);
			request.addHeader("X-CSRF-TOKEN","FETCH");
			HttpResponse respons = client.execute(request);
		  
		  
		  
		  System.out.println("csrf:"+csrf);
		 // System.out.println("List all headers:");
		  csrf = respons.getFirstHeader("X-CSRF-TOKEN").getValue();
		  
		  data = "{\"SalesOrderType\": \"OR\", \"DistributionChannel\": \"10\", \"SalesOrganization\": \"1000\", \"OrganizationDivision\": \"00\",\"PurchaseOrderByCustomer\": \"Shopping Cart1\", \"SDDocumentReason\": \"001\", "; 
		  data = data + "\"SalesDistrict\": \"\", \"SoldToParty\": \"10000102\", \"to_Item\": [ { \"SalesOrderItem\": \"10\", \"RequestedQuantity\": \"1\", \"SalesDocumentRjcnReason\": \"02\", \"Material\": \"WPE2819\" }]}";
		  
		  System.out.println(data);
		  HttpPost pReq = new HttpPost(url);
		   pReq.addHeader("Content-Type","application/json");
		    pReq.addHeader("Accept","application/json");
		    pReq.addHeader("X-CSRF-TOKEN",csrf);
		    pReq.setEntity(new StringEntity(data));
		    respons = client.execute(pReq);
		    BufferedReader rd = new BufferedReader(
	    	        new InputStreamReader(respons.getEntity().getContent()));
		    
	    	String line = "";
	    	while ((line = rd.readLine()) != null) {
	    		result.append(line);
	    	}
	    	System.out.println("result : "+result);
	    	
		}
		catch (Exception Ex) {Ex.printStackTrace();}
		return result.toString();
	
	}

	//@Override
	public String RejItem(String Order, String Item) {
		// TODO Auto-generated method stub
		
		String data = "";
		String authoriz = "Basic QkhGX0NPTU06bkJoTHNpd1dYbWZ3cW1YKUZETFJVQTZTd2RDaXRBWFVzd3dad0xxWA==";
		String csrf = "";
		String url = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_SALES_ORDER_SRV/";
		url = url + "A_SalesOrderItem(SalesOrder='" + Order + "'" +",SalesOrderItem='" + Item + "'" + ")";
		System.out.println("URL:"+url);
		StringBuffer result = new StringBuffer();
		try {

		  URL urlObj = new URL(url);
		  HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(url);

			// add request header
			//request.addHeader("User-Agent", "Java");
			request.addHeader("Content-Type","application/json");
			request.addHeader("Accept","application/json");
			//request.addHeader("APIKey","SzC1d22J7FqnBtcSAcGfbLZj6g1DmbXm");
			request.addHeader("Authorization",authoriz);
			request.addHeader("X-CSRF-TOKEN","FETCH");
			HttpResponse respons = client.execute(request);
		  
		  
		  
		  System.out.println("csrf:"+csrf);
		 // System.out.println("List all headers:");
		  csrf = respons.getFirstHeader("X-CSRF-TOKEN").getValue();
		
		  data = "{\"SalesDocumentRjcnReason\": \"02\" }";
		  
		  System.out.println(data);
		  HttpPatch pReq = new HttpPatch(url);
		   pReq.addHeader("Content-Type","application/json");
		    pReq.addHeader("Accept","application/json");
		    pReq.addHeader("X-CSRF-TOKEN",csrf);
		    pReq.setEntity(new StringEntity(data));
		    respons = client.execute(pReq);
		    BufferedReader rd = new BufferedReader(
	    	        new InputStreamReader(respons.getEntity().getContent()));
		    
	    	String line = "";
	    	while ((line = rd.readLine()) != null) {
	    		result.append(line);
	    	}
	    	System.out.println("result : "+result);
	    	
		}
		catch (Exception Ex) {Ex.printStackTrace();}
		return result.toString();
	}

	//@Override
	public String AddItem(String Order) {
		// TODO Auto-generated method stub
		
		
		String data = "";
		String authoriz = "Basic QkhGX0NPTU06bkJoTHNpd1dYbWZ3cW1YKUZETFJVQTZTd2RDaXRBWFVzd3dad0xxWA==";
		String csrf = "";
		String url = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_SALES_ORDER_SRV/";
				url = url + "A_SalesOrder(" + "'" + Order + "')" + "/to_Item";
		
		StringBuffer result = new StringBuffer();
		try {

		  URL urlObj = new URL(url);
		  HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(url);

			// add request header
			//request.addHeader("User-Agent", "Java");
			request.addHeader("Content-Type","application/json");
			request.addHeader("Accept","application/json");
			//request.addHeader("APIKey","SzC1d22J7FqnBtcSAcGfbLZj6g1DmbXm");
			request.addHeader("Authorization",authoriz);
			request.addHeader("X-CSRF-TOKEN","FETCH");
			HttpResponse respons = client.execute(request);
		  
		  
		  
		  System.out.println("csrf:"+csrf);
		 // System.out.println("List all headers:");
		  csrf = respons.getFirstHeader("X-CSRF-TOKEN").getValue();

		  data = "{\"Material\": \"WPE2819\",\"RequestedQuantity\": \"1\" }";
		  
		  System.out.println(data);
		  HttpPost pReq = new HttpPost(url);
		   pReq.addHeader("Content-Type","application/json");
		    pReq.addHeader("Accept","application/json");
		    pReq.addHeader("X-CSRF-TOKEN",csrf);
		    pReq.setEntity(new StringEntity(data));
		    respons = client.execute(pReq);
		    BufferedReader rd = new BufferedReader(
	    	        new InputStreamReader(respons.getEntity().getContent()));
		    
	    	String line = "";
	    	while ((line = rd.readLine()) != null) {
	    		result.append(line);
	    	}
	    	System.out.println("result : "+result);
	    	
		}
		catch (Exception Ex) {Ex.printStackTrace();}
		return result.toString();
	}

	//@Override
	public String cancelOrder(String rder) {
		// TODO Auto-generated method stub
		
		String data = "";
		String authoriz = "Basic QkhGX0NPTU06bkJoTHNpd1dYbWZ3cW1YKUZETFJVQTZTd2RDaXRBWFVzd3dad0xxWA==";
		String csrf = "";
		String url = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_SALES_ORDER_SRV/";
				url = url + "A_SalesOrder(" + "'" + rder + "')" ;
		
				System.out.println("---URL:"+url);
		StringBuffer result = new StringBuffer();
		try {

		  URL urlObj = new URL(url);
		  HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(url);

			// add request header
			//request.addHeader("User-Agent", "Java");
			request.addHeader("Content-Type","application/json");
			request.addHeader("Accept","application/json");
			//request.addHeader("APIKey","SzC1d22J7FqnBtcSAcGfbLZj6g1DmbXm");
			request.addHeader("Authorization",authoriz);
			request.addHeader("X-CSRF-TOKEN","FETCH");
			HttpResponse respons = client.execute(request);
		  
		  
		  
		  System.out.println("csrf:"+csrf);
		 // System.out.println("List all headers:");
		  csrf = respons.getFirstHeader("X-CSRF-TOKEN").getValue();
		  
		  BufferedReader rd = new BufferedReader(
	    	        new InputStreamReader(respons.getEntity().getContent()));
		    
	    	String line = "";
	    	while ((line = rd.readLine()) != null) {
	    		result.append(line);
	    	}
	    	System.out.println("result : "+result);
	    	
	    	Gson gson = new Gson( );
	    	/*com.sap.apibhub.sdk.api_sales_order_srv.model.Wrapper wrapper = new com.sap.apibhub.sdk.api_sales_order_srv.model.Wrapper();
	    	wrapper = gson.fromJson(result.toString(), wrapper.getClass());
	    	System.out.println("-----"+gson.toJson(wrapper));*/
		}
		catch (Exception Ex) {Ex.printStackTrace();}
		return result.toString();
		  
		
	}

	
	
	
	

}
