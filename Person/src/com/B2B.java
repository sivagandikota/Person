package com;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
//import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;

import javax.mail.FetchProfile.Item;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
/*import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;

import com.google.gson.Gson;*/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.model.B2BAddItemWrapper;
import com.model.B2BCheckPayerWrapper;
import com.model.B2BCloseOrderWrapper;
import com.model.B2B_INVOICE_LIST;
import com.model.Docs;
import com.model.INVOICELIST;
import com.model.ListItems;
import com.model.OrderItems;
import com.model.PList;
import com.model.ReturnProductsWrapper;
import com.model.WrapperListOrders;
import com.model.Z_B2B_COLLECTION_LISTWrapper;
import com.sap.cloud.sdk.odatav2.connectivity.ODataException;
import com.sap.cloud.sdk.s4hana.connectivity.ErpConfigContext;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.Order;
import com.sap.cloud.sdk.s4hana.datamodel.odata.namespaces.businesspartner.AddressEmailAddress;
import com.sap.cloud.sdk.s4hana.datamodel.odata.namespaces.businesspartner.BusinessPartner;
import com.sap.cloud.sdk.s4hana.datamodel.odata.namespaces.businesspartner.BusinessPartnerAddress;
import com.sap.cloud.sdk.s4hana.datamodel.odata.namespaces.salesorder.SalesOrder;
import com.sap.cloud.sdk.s4hana.datamodel.odata.namespaces.salesorder.SalesOrderItem;
import com.sap.cloud.sdk.s4hana.datamodel.odata.services.DefaultBusinessPartnerService;
import com.sap.cloud.sdk.s4hana.datamodel.odata.services.DefaultSalesOrderService;

public class B2B implements B2BInterface {

	// @Override
	// public String sayHello(String name) {
	// // TODO Auto-generated method stub
	// return "Hello " + name;
	// }
	Logger logger = LoggerFactory.getLogger(B2B.class);

	@Override
	public com.model.SOandShippingTable createOrder(String SoldToParty) throws Exception {
		// TODO Auto-generated method stub
		java.util.HashMap shippingDetail = null;
		String data = "";
		String authoriz = "Basic QkhGX0NPTU06bkJoTHNpd1dYbWZ3cW1YKUZETFJVQTZTd2RDaXRBWFVzd3dad0xxWA==";
		String csrf = "";
		// String url =
		// "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_SALES_ORDER_SRV/A_SalesOrder";
		String url = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/API_SALES_ORDER_SRV/A_SalesOrder";
		String custref = "Shopping Cart/" + SoldToParty;
		HttpResponse respons = null;
		String status = "";
		StringBuffer result = new StringBuffer();
		String BASE_URL = CxfNonSpringSimpleServlet.host
				+ "/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_CustomerSalesArea?$format=json&$select=Customer,SalesOrganization,DistributionChannel,Division,ShippingCondition,CustomerPaymentTerms,DeliveryIsBlockedForCustomer,OrderIsBlockedForCustomer,DeletionIndicator&$filter="
				+ URLEncoder.encode("Customer eq '" + SoldToParty + "'", "UTF-8");
		String dataa = (String) this.getData(BASE_URL, authoriz);
		Gson gson = new Gson();
		com.model.SOandShippingTable table = new com.model.SOandShippingTable();
		// Zb2BCustInqWrapper z = gson.fromJson(result.toString(),
		// Zb2BCustInqWrapper.class);
		Zb2BCustInqWrapper z = gson.fromJson(dataa, Zb2BCustInqWrapper.class);
		System.out.println("88:" + z.toString());
		if (z.getD().getResults().get(0).getOrderIsBlockedForCustomer().contains("true")) {
			table.setStatus("999");
			return table;
		}
		try {
			shippingDetail = this.getShip(SoldToParty);
			// table.setStatus("999");
			// return table;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (shippingDetail == null) {
			// throw new Exception("No Shipping details found for the customer " +
			// SoldToParty);
		}

		try {

			URL urlObj = new URL(url);
			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(url);

			// add request header
			// request.addHeader("User-Agent", "Java");
			request.addHeader("Content-Type", "application/json");
			request.addHeader("Accept", "application/json");
			// request.addHeader("APIKey","SzC1d22J7FqnBtcSAcGfbLZj6g1DmbXm");
			request.addHeader("Authorization", authoriz);
			request.addHeader("X-CSRF-TOKEN", "FETCH");
			respons = client.execute(request);

			System.out.println("csrf:" + csrf);
			// System.out.println("List all headers:");
			csrf = respons.getFirstHeader("X-CSRF-TOKEN").getValue();
			System.out.println("csrf:" + csrf);

			data = "{\"SalesOrderType\": \"OR\", \"DistributionChannel\": \"10\", \"SalesOrganization\": \"1000\", \"OrganizationDivision\": \"00\",\"PurchaseOrderByCustomer\": \""
					+ custref + "\", \"SDDocumentReason\": \"523\", ";
			data = data + "\"SalesDistrict\": \"\", \"SoldToParty\": \"" + SoldToParty
					+ "\",\"DeliveryBlockReason\": \"54\",\"YY1_POTypes_SDH\": \"B2B\", \"to_Item\": [ { \"SalesOrderItem\": \"10\", \"RequestedQuantity\": \"1\", \"SalesDocumentRjcnReason\": \"02\", \"Material\": \"INVALIDSKU\" }]}";

			System.out.println(data);
			HttpPost pReq = new HttpPost(url);
			pReq.addHeader("Content-Type", "application/json");
			pReq.addHeader("Accept", "application/json");
			pReq.addHeader("X-CSRF-TOKEN", csrf);
			pReq.setEntity(new StringEntity(data));
			respons = client.execute(pReq);
			BufferedReader rd = new BufferedReader(new InputStreamReader(respons.getEntity().getContent()));
			System.out.println("79--StatusCode:" + respons.getStatusLine().getStatusCode() + "  Status Message:"
					+ respons.getStatusLine().getReasonPhrase());
			String line = "";
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}

			System.out.println("result : " + result);

		} catch (Exception Ex) {
			Ex.printStackTrace();
		}
		if (201 != respons.getStatusLine().getStatusCode()) {
			// throw new Exception(result.toString());
			status = "888";
		}
		if (201 == respons.getStatusLine().getStatusCode()) {
			status = "000";
		}

		// try {
		// shippingDetail = this.getShip(SoldToParty);
		//
		// } catch (Exception e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		System.out.println("117--:");
		gson = new Gson();
		com.sap.apibhub.sdk.api_sales_order_srv.model.ASalesOrderType wrapper = new com.sap.apibhub.sdk.api_sales_order_srv.model.ASalesOrderType();
		try {
			wrapper = gson.fromJson(result.toString(),
					com.sap.apibhub.sdk.api_sales_order_srv.model.ASalesOrderType.class);
		} catch (Exception e) {
			e.printStackTrace();
		}

		table.setSalesOrderId(wrapper.getD().getSalesOrder());
		table.setShippingConditonTable(shippingDetail);
		table.setStatus(status);
		System.out.println("121--table:" + table.toString());
		return table;

	}

	// @Override
	public String RejItem(String Order, String Item) {
		// TODO Auto-generated method stub

		String data = "";
		String authoriz = "Basic QkhGX0NPTU06bkJoTHNpd1dYbWZ3cW1YKUZETFJVQTZTd2RDaXRBWFVzd3dad0xxWA==";
		String csrf = "";
		String url = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/API_SALES_ORDER_SRV/";
		url = url + "A_SalesOrderItem(SalesOrder='" + Order + "'" + ",SalesOrderItem='" + Item + "'" + ")";
		System.out.println("URL:" + url);
		StringBuffer result = new StringBuffer();
		HttpResponse respons = null;
		try {

			URL urlObj = new URL(url);
			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(url);

			// add request header
			// request.addHeader("User-Agent", "Java");
			request.addHeader("Content-Type", "application/json");
			request.addHeader("Accept", "application/json");
			// request.addHeader("APIKey","SzC1d22J7FqnBtcSAcGfbLZj6g1DmbXm");
			request.addHeader("Authorization", authoriz);
			request.addHeader("X-CSRF-TOKEN", "FETCH");
			respons = client.execute(request);

			System.out.println("csrf:" + csrf);
			// System.out.println("List all headers:");
			csrf = respons.getFirstHeader("X-CSRF-TOKEN").getValue();

			data = "{\"SalesDocumentRjcnReason\": \"02\" }";

			System.out.println(data);
			HttpPatch pReq = new HttpPatch(url);
			pReq.addHeader("Content-Type", "application/json");
			pReq.addHeader("Accept", "application/json");
			pReq.addHeader("X-CSRF-TOKEN", csrf);
			pReq.setEntity(new StringEntity(data));
			respons = client.execute(pReq);
			BufferedReader rd = new BufferedReader(new InputStreamReader(respons.getEntity().getContent()));

			String line = "";
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}
			System.out.println("result : " + result);

		} catch (Exception Ex) {
			Ex.printStackTrace();
		}
		System.out.println("182---Status" + respons.getStatusLine().getStatusCode());
		if (204 == respons.getStatusLine().getStatusCode()) {
			// throw new Exception(result.toString());
			return "000";
		} else {
			return "999";
		}

	}

	// @Override
	public B2BCloseOrderWrapper CloseOrder(String SoldToParty, String Order, String CustRef, String ShippingCondition)
			throws Exception {
		B2BCloseOrderWrapper wrapper = new B2BCloseOrderWrapper();
		String status = "";
		String data = "";
		String authoriz = "Basic QkhGX0NPTU06bkJoTHNpd1dYbWZ3cW1YKUZETFJVQTZTd2RDaXRBWFVzd3dad0xxWA==";
		String csrf = "";
		String url = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/API_SALES_ORDER_SRV/A_SalesOrder('" + Order
				+ "')";

		HttpResponse respons = null;
		StringBuffer result = new StringBuffer();
		try {

			List<BusinessPartner> businessPartners = new DefaultBusinessPartnerService().getAllBusinessPartner()
					.select(BusinessPartner.BUSINESS_PARTNER, BusinessPartner.LAST_NAME, BusinessPartner.FIRST_NAME,
							BusinessPartner.IS_MALE, BusinessPartner.IS_FEMALE, BusinessPartner.CREATION_DATE,
							BusinessPartner.TO_BUSINESS_PARTNER_ADDRESS,
							BusinessPartner.TO_BUSINESS_PARTNER_ADDRESS.select(BusinessPartnerAddress.ADDRESS_ID,
									BusinessPartnerAddress.ALL_FIELDS, BusinessPartnerAddress.TO_EMAIL_ADDRESS))
					.filter(BusinessPartner.CUSTOMER.eq(SoldToParty)).execute();
			System.out.println("BusinessPartner---------" + businessPartners.get(0).getBusinessPartner());
			System.out.println("BusinessPartner---------"
					+ businessPartners.get(0).fetchBusinessPartnerAddress().get(0).toString());
			System.out.println("BusinessPartner---------"
					+ businessPartners.get(0).fetchBusinessPartnerAddress().get(0).getAddressID());
			System.out.println("BusinessPartner---------"
					+ businessPartners.get(0).fetchBusinessPartnerAddress().get(0).getAddressID());
			System.out.println("BusinessPartner---------" + businessPartners.get(0).fetchBusinessPartnerAddress().get(0)
					.fetchEmailAddress().get(0).toString());
			BusinessPartnerAddress address = businessPartners.get(0).fetchBusinessPartnerAddress().get(0);
			System.out.println(address.toString());
			AddressEmailAddress email = businessPartners.get(0).fetchBusinessPartnerAddress().get(0).fetchEmailAddress()
					.get(0);
			System.out.println("---email---" + email.toString());
			wrapper.setAddressEmailAddress(email);
			wrapper.setBusinessPartnerAddress(address);

			//
		} catch (final ODataException e) {
			e.printStackTrace();
		}

		try {

			URL urlObj = new URL(url);
			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(url);
			request.addHeader("Content-Type", "application/json");
			request.addHeader("Accept", "application/json");
			request.addHeader("Authorization", authoriz);
			request.addHeader("X-CSRF-TOKEN", "FETCH");
			respons = client.execute(request);

			csrf = respons.getFirstHeader("X-CSRF-TOKEN").getValue();
			System.out.println("csrf:" + csrf);
			String etag = respons.getLastHeader("etag").getValue();
			System.out.println("223__" + etag);
			data = "{ \"PurchaseOrderByCustomer\": \"" + CustRef + "\", \"ShippingCondition\": \"" + ShippingCondition
					+ "\",\"SDDocumentReason\": \"\"}";

			System.out.println(data);
			HttpPatch pReq = new HttpPatch(url);
			pReq.addHeader("Content-Type", "application/json");
			pReq.addHeader("Accept", "application/json");
			pReq.addHeader("X-CSRF-TOKEN", csrf);
			pReq.addHeader("If-Match", etag);
			pReq.setEntity(new StringEntity(data));
			respons = client.execute(pReq);
			BufferedReader rd = new BufferedReader(new InputStreamReader(respons.getEntity().getContent()));

			String line = "";
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}
			System.out.println("result : " + result);

		} catch (Exception Ex) {
			Ex.printStackTrace();
		}
		if (204 == respons.getStatusLine().getStatusCode()) {
			// throw new Exception(result.toString());
			status = "Order Closed " + Order;
		} else {
			status = result.toString();
		}

		wrapper.setStatus(status);
		return wrapper;
	}

	// @Override
	public B2BAddItemWrapper AddItem(String SoldToParty, String Order, String Material, String Quantity,String Batch,String SampleType) {
		// TODO Auto-generated method stub
		B2BAddItemWrapper resultWrapper = new B2BAddItemWrapper();
		String results="000";
		String data = "";
		String authoriz = "Basic QkhGX0NPTU06bkJoTHNpd1dYbWZ3cW1YKUZETFJVQTZTd2RDaXRBWFVzd3dad0xxWA==";
		String csrf = "";
		String url = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/API_SALES_ORDER_SRV/";
		url = url + "A_SalesOrder(" + "'" + Order + "')" + "/to_Item";

		StringBuffer result = new StringBuffer();
		HttpResponse respons = null;
		try {

			URL urlObj = new URL(url);
			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(url);

			// add request header
			// request.addHeader("User-Agent", "Java");
			request.addHeader("Content-Type", "application/json");
			request.addHeader("Accept", "application/json");
			// request.addHeader("APIKey","SzC1d22J7FqnBtcSAcGfbLZj6g1DmbXm");
			request.addHeader("Authorization", authoriz);
			request.addHeader("X-CSRF-TOKEN", "FETCH");
			respons = client.execute(request);

			System.out.println("csrf:" + csrf);
			// System.out.println("List all headers:");
			csrf = respons.getFirstHeader("X-CSRF-TOKEN").getValue();
			if(SampleType.length()==0) {
			data = "{\"Material\": \"" + Material + "\",\"RequestedQuantity\": \"" + Quantity + "\" }";
			}else {
				data = "{\"Material\": \"SAMPLES" + SampleType + "\",\"RequestedQuantity\": \"" + Quantity + "\" }";
			}

			System.out.println(data);
			HttpPost pReq = new HttpPost(url);
			pReq.addHeader("Content-Type", "application/json");
			pReq.addHeader("Accept", "application/json");
			pReq.addHeader("X-CSRF-TOKEN", csrf);
			pReq.setEntity(new StringEntity(data));
			respons = client.execute(pReq);
			BufferedReader rd = new BufferedReader(new InputStreamReader(respons.getEntity().getContent()));

			String line = "";
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}
			System.out.println("result : " + result.toString());

		

		Gson gson = new Gson();
		com.sap.apibhub.sdk.api_sales_order_srv.model.ASalesOrderItemType wrapper = gson.fromJson(result.toString(),
				com.sap.apibhub.sdk.api_sales_order_srv.model.ASalesOrderItemType.class);
		System.out.println("--243 wrapper : " + wrapper.toString());
		System.out.println(wrapper.getD().getSalesOrderItem());
		if (201 == respons.getStatusLine().getStatusCode()) {
			// throw new Exception(result.toString());
			resultWrapper.setItemNumber(wrapper.getD().getSalesOrderItem());
			resultWrapper.setBatch(wrapper.getD().getBatch());
			resultWrapper.setResult(results);
			return resultWrapper;
		} else {
			results="999";
			resultWrapper.setResult(results);
			return resultWrapper;
		}
		} catch (Exception Ex) {
			Ex.printStackTrace();
			results="999";
			resultWrapper.setResult(results);
			return resultWrapper;
			
		}
	}

	// @Override
	public String cancelOrder(String SoldToParty, String rder) {
		// TODO Auto-generated method stub
		String status="";
		String lStatus="";
		OrderItems[] items = this.getList(SoldToParty, rder).getD().getResults();
		if(items.length==0) {return "999";}
		for (int i = 0; i < items.length; i++) {
			OrderItems soItem = items[i];
			status=this.RejItem(rder, soItem.getItemNumber());
			if(status.contentEquals("000") && !lStatus.contentEquals("999")) {
				lStatus="000";
			}else {
				status="999";
				lStatus="999";
			}
		}

		// String data = "";
		// String authoriz = "Basic
		// QkhGX0NPTU06bkJoTHNpd1dYbWZ3cW1YKUZETFJVQTZTd2RDaXRBWFVzd3dad0xxWA==";
		// String csrf = "";
		// String url =
		// "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_SALES_ORDER_SRV/";
		// url = url + "A_SalesOrder(" + "'" + rder + "')" +
		// "/to_Item?$format=json&$select=SalesOrder,SalesOrderItem,Material,RequestedQuantity,RequestedQuantityUnit,TransactionCurrency,NetAmount";
		//
		//
		// System.out.println("---URL:"+url);
		// StringBuffer result = new StringBuffer();
		//
		// try {
		//
		// URL urlObj = new URL(url);
		// HttpClient client = HttpClientBuilder.create().build();
		// HttpGet request = new HttpGet(url);
		//
		// // add request header
		// //request.addHeader("User-Agent", "Java");
		// request.addHeader("Content-Type","application/json");
		// request.addHeader("Accept","application/json");
		// //request.addHeader("APIKey","SzC1d22J7FqnBtcSAcGfbLZj6g1DmbXm");
		// request.addHeader("Authorization",authoriz);
		// request.addHeader("X-CSRF-TOKEN","FETCH");
		// HttpResponse respons = client.execute(request);
		//
		//
		//
		// System.out.println("csrf:"+csrf);
		// // System.out.println("List all headers:");
		// csrf = respons.getFirstHeader("X-CSRF-TOKEN").getValue();
		//
		// BufferedReader rd = new BufferedReader(
		// new InputStreamReader(respons.getEntity().getContent()));
		//
		// String line = "";
		// while ((line = rd.readLine()) != null) {
		// result.append(line);
		// }
		// System.out.println("result : "+result);
		//
		// }
		// catch (Exception Ex) {Ex.printStackTrace();}
		return lStatus;
		//

	}

	// @Override
	public java.util.HashMap getShip(String SoldToParty) throws Exception {
		// TODO Auto-generated method stub

		String authoriz = "Basic QkhGX0NPTU06bkJoTHNpd1dYbWZ3cW1YKUZETFJVQTZTd2RDaXRBWFVzd3dad0xxWA==";
		String csrf = "";
		java.util.HashMap table = null;
		Zb2BCustInqWrapper z = new Zb2BCustInqWrapper();
		DataOutputStream dataOut = null;
		BufferedReader br = null;
		InputStreamReader in = null;
		Gson gson = new Gson();
		try {
			// String BASE_URL =
			// "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_CustomerSalesArea(Customer='"+customer+"',SalesOrganization='"+salesOrganization+"',DistributionChannel='"+distributionChannel+"',Division='"+division+"')?$format=json&$select=Customer,SalesOrganization,DistributionChannel,ShippingCondition,CustomerPaymentTerms,DeliveryIsBlockedForCustomer,OrderIsBlockedForCustomer";
			String BASE_URL = CxfNonSpringSimpleServlet.host
					+ "/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_CustomerSalesArea?$format=json&$select=Customer,SalesOrganization,DistributionChannel,Division,ShippingCondition,CustomerPaymentTerms,DeliveryIsBlockedForCustomer,OrderIsBlockedForCustomer,DeletionIndicator&$filter="
					+ URLEncoder.encode("Customer eq '" + SoldToParty + "'", "UTF-8");
			// String BASE_URL =
			// "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_CustomerSalesArea?$format=json&$select=Customer,SalesOrganization,DistributionChannel,Division,ShippingCondition,CustomerPaymentTerms,DeliveryIsBlockedForCustomer,OrderIsBlockedForCustomer,DeletionIndicator&$filter=Customer
			// eq '" + customer + "'";
			System.out.println(BASE_URL);
			// Response response;
			String responseBody = "";

			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(BASE_URL);
			// add request header
			request.addHeader("User-Agent", "Java");
			request.addHeader("Content-Type", "application/json");
			request.addHeader("Accept", "application/json");
			request.addHeader("APIKey", "SzC1d22J7FqnBtcSAcGfbLZj6g1DmbXm");
			request.addHeader("Authorization", authoriz);
			request.addHeader("X-CSRF-TOKEN", "FETCH");
			HttpResponse respons = client.execute(request);

			System.out.println("response : " + respons.getStatusLine().getStatusCode());
			System.out.println("response : " + respons.getStatusLine().getReasonPhrase());
			// respons.getEntity().writeTo(System.out);
			csrf = respons.getFirstHeader("X-CSRF-TOKEN").getValue();
			StringBuffer result = new StringBuffer();
			if (200 == respons.getStatusLine().getStatusCode()) {
				in = new InputStreamReader(respons.getEntity().getContent());
				BufferedReader rd = new BufferedReader(in);
				String line = "";
				while ((line = rd.readLine()) != null) {
					result.append(line);
				}
				System.out.println("result : " + result);
				z = gson.fromJson(result.toString(), Zb2BCustInqWrapper.class);
			}
			z.setStatus("000");
			System.out.println("-- Shipping Condition : " + z.getD().getResults().get(0).getShippingCondition());
			System.out.println("-- z : " + z.toString());
			if (z.getD().getResults().get(0).getDeliveryIsBlockedForCustomer().length() > 0) { // ||
																								// z.getD().getOrderIsBlockedForCustomer().length()>0
				if (Integer.parseInt(z.getD().getResults().get(0).getDeliveryIsBlockedForCustomer()) == 54) {
					z.setStatus("002");
				}
			}

			String url = "";
			System.out.println("436----length" + z.getD().getResults().get(0).getShippingCondition().length());
			if (z.getD().getResults().get(0).getShippingCondition().length() == 0) {

				url = (String) getData(CxfNonSpringSimpleServlet.host
						+ "/sap/opu/odata/sap/YY1_SHIPXREF_CDS/YY1_SHIPXREF?$format=json&$select=VSBED,VTEXT&$filter="
						+ URLEncoder.encode(
								"XREFCODE eq 'US_SHPCOND' and XREFRESULT eq 'X' and (XSITD eq 'UPS' or XSITD eq 'USPS' or XSITD eq 'WILLCALL')",
								"UTF-8"),
						authoriz);
				System.out.println("440----Url" + url);
			}

			if (z.getD().getResults().get(0).getShippingCondition().length() > 0) {
				if (z.getD().getResults().get(0).getShippingCondition().matches("00")) {
					z.setStatus("001");
					// retreive XREFRESULT and set the value in
					// z.getD().getResults().get(0).getShippingCondition()
					url = (String) getData(CxfNonSpringSimpleServlet.host
							+ "/sap/opu/odata/sap/YY1_XREF_CDS/YY1_XREF?$format=json&$select=XREFRESULT&$filter="
							+ URLEncoder.encode("XREFCODE eq 'DEF_SHIP' and XREFKEY eq 'UPS_FEDEX'", "UTF-8"),
							authoriz);
					com.ShippingConditionsWrapper sh = gson.fromJson(url, com.ShippingConditionsWrapper.class);
					z.getD().getResults().get(0)
							.setShippingCondition(sh.getD().getResults().get(0).getShippingCondition());
				}

				switch (z.getD().getResults().get(0).getSalesOrganization()) {
				case "1000":
					switch (z.getD().getResults().get(0).getCustomerPaymentTerms()) {
					case "COD":
						url = (String) getData(CxfNonSpringSimpleServlet.host
								+ "/sap/opu/odata/sap/YY1_SHIPPING_CONDITIONS_CDS/YY1_SHIPPING_CONDITIONS?$format=json&$select=VSBED,VTEXT&$filter="
								+ URLEncoder.encode("VSBED eq '01'", "UTF-8"), authoriz);
						System.out.println("457 cod - URL - data:" + url);
						break;
					case "CASH":
						url = (String) getData(CxfNonSpringSimpleServlet.host
								+ "/sap/opu/odata/sap/YY1_SHIPPING_CONDITIONS_CDS/YY1_SHIPPING_CONDITIONS?$format=json&$select=VSBED,VTEXT&$filter="
								+ URLEncoder.encode("VSBED eq '01'", "UTF-8"), authoriz);
						System.out.println("460 cash - URL - data:" + url);
						break;
					default:
						switch (z.getD().getResults().get(0).getShippingCondition()) {
						case "WC":
							url = (String) getData(CxfNonSpringSimpleServlet.host
									+ "/sap/opu/odata/sap/YY1_SHIPXREF_CDS/YY1_SHIPXREF?$format=json&$select=VSBED,VTEXT&$filter="
									+ URLEncoder.encode(
											"XREFCODE eq 'US_SHPCOND' and XREFRESULT eq 'X' and (XSITD eq 'UPS' or XSITD eq 'USPS' or XSITD eq 'WILLCALL')",
											"UTF-8"),
									authoriz);

							System.out.println("466 WC - URL - data:" + url);
							break;

						case "01":
							url = (String) getData(CxfNonSpringSimpleServlet.host
									+ "/sap/opu/odata/sap/YY1_SHIPXREF_CDS/YY1_SHIPXREF?$format=json&$select=VSBED,VTEXT&$filter="
									+ URLEncoder.encode(
											"XREFCODE eq 'US_SHPCOND' and XREFRESULT eq 'X' and (XSITD eq 'UPS' or XSITD eq 'USPS' or XSITD eq 'WILLCALL')",
											"UTF-8"),
									authoriz);
							System.out.println("470 01 - URL - data:" + url);
							break;
						case "41":
							url = (String) getData(CxfNonSpringSimpleServlet.host
									+ "/sap/opu/odata/sap/YY1_SHIPXREF_CDS/YY1_SHIPXREF?$format=json&$select=VSBED,VTEXT&$filter="
									+ URLEncoder.encode(
											"XREFCODE eq 'US_SHPCOND' and XREFRESULT eq 'X' and (XSITD eq 'FEDEX' or XSITD eq 'USPS' or XSITD eq 'WILLCALL')",
											"UTF-8"),
									authoriz);
							System.out.println("473 41 - URL - data:" + url);
							break;
						}
					}
					// if 75 delete all and add 75
					break;
				case "2000":
					url = (String) getData(CxfNonSpringSimpleServlet.host
							+ "/sap/opu/odata/sap/YY1_SHIPXREF_CDS/YY1_SHIPXREF?$format=json&$select=VSBED,VTEXT&$filter="
							+ URLEncoder.encode("XREFCODE eq 'CA_SHPCOND' and XREFRESULT eq 'X')", "UTF-8"), authoriz);
				}
			}
			System.out.println("177 - URL - data:" + url);
			com.ShippingConditionsWrapper sh = gson.fromJson(url, com.ShippingConditionsWrapper.class);
			table = new java.util.HashMap();
			com.ShippingConditions con = null;
			java.util.Iterator iter = sh.getD().getResults().iterator();
			while (iter.hasNext()) {
				con = (ShippingConditions) iter.next();
				table.put(con.getVSBED(), con.getVTEXT());
			}

			// if(z.getD().getResults().get(0).getSalesOrganization() == "1000") {
			//
			// }
			z.setShippingTable(table);
			// } else {
			z.setStatus("001");
			System.out.println("---ResponseBody : " + respons.toString());

			System.out.println("Message : " + respons.getStatusLine().getReasonPhrase());
			//

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		return table;
	}

	public Object getData(String url, String authoriz) throws ClientProtocolException, IOException {
		System.out.println("235 - " + url + "   -authoriz:" + authoriz);
		HttpGet request = new HttpGet(url);

		// add request header
		request.addHeader("User-Agent", "Java");
		request.addHeader("Content-Type", "application/json");
		request.addHeader("Accept", "application/json");
		// request.addHeader("APIKey", "SzC1d22J7FqnBtcSAcGfbLZj6g1DmbXm");
		request.addHeader("Authorization", authoriz);
		request.addHeader("X-CSRF-TOKEN", "FETCH");
		HttpClient client = HttpClientBuilder.create().build();
		HttpResponse respons = client.execute(request);
		// respons.getEntity().writeTo(System.out);
		String csrf = respons.getFirstHeader("X-CSRF-TOKEN").getValue();
		StringBuffer result = new StringBuffer();
		System.out.println("respons.getStatusLine().getStatusCode():" + respons.getStatusLine().getStatusCode());
		if (200 == respons.getStatusLine().getStatusCode()) {
			InputStreamReader in = new InputStreamReader(respons.getEntity().getContent());
			BufferedReader rd = new BufferedReader(in);
			String line = "";
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}
			System.out.println("257 result : " + result);
		}
		return result.toString();
	}

	@Override
	public WrapperListOrders getList(String SoldToParty, String Order) {
		com.model.WrapperListOrders wrapper = new com.model.WrapperListOrders();
		com.model.OrderItems[] orderDetails = null;
		String data = "";
		String status="000";
		String authoriz = "Basic QkhGX0NPTU06bkJoTHNpd1dYbWZ3cW1YKUZETFJVQTZTd2RDaXRBWFVzd3dad0xxWA==";
		String csrf = "";
		String url = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/API_SALES_ORDER_SRV/";
		wrapper.setStatus("000");
		try {
			url = url + "A_SalesOrder(" + "'" + Order + "')"
					+ "/to_Item?$format=json&$select=SalesOrder,SalesOrderItem,Material,RequestedQuantity,RequestedQuantityUnit,TransactionCurrency,NetAmount,Batch&$filter="
					+ URLEncoder.encode("SalesDocumentRjcnReason eq '' and Material ne 'INVALIDSKU'", "UTF-8");
			System.out.println("Order:"+Order+"--length:"+Order.length());
			if ( Order.length()==0) {
				status="999";
				wrapper.setStatus(status);
				return wrapper;
				
			}
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("---URL:" + url);
		StringBuffer result = new StringBuffer();
		try {

			URL urlObj = new URL(url);
			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(url);

			// add request header
			// request.addHeader("User-Agent", "Java");
			request.addHeader("Content-Type", "application/json");
			request.addHeader("Accept", "application/json");
			// request.addHeader("APIKey","SzC1d22J7FqnBtcSAcGfbLZj6g1DmbXm");
			request.addHeader("Authorization", authoriz);
			request.addHeader("X-CSRF-TOKEN", "FETCH");
			HttpResponse respons = client.execute(request);

			// System.out.println("List all headers:");
			csrf = respons.getFirstHeader("X-CSRF-TOKEN").getValue();
			System.out.println("csrf:" + csrf);
			BufferedReader rd = new BufferedReader(new InputStreamReader(respons.getEntity().getContent()));

			String line = "";
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}
			System.out.println("result : " + result);

		} catch (Exception Ex) {
			Ex.printStackTrace();
		}
		Gson gson = new Gson();

		// wrapper = gson.fromJson(result.toString(),
		// com.model.WrapperListOrders.class);
		// ShippingConditionsWrapper wrapper = new ShippingConditionsWrapper();
		String result1 = result.toString();
		System.out.println("result1=" + result1);
		ObjectMapper mapper = new ObjectMapper();
		try {
			// wrapper = gson.fromJson(result1, com.model.WrapperListOrders.class);
			wrapper = mapper.readValue(result1, com.model.WrapperListOrders.class);
		} catch (Exception w) {
			w.printStackTrace();
		}
		orderDetails = wrapper.getD().getResults();
		System.out.println("469--" + Arrays.toString(orderDetails) + "--------" + orderDetails.length);
		com.model.OrderItems item=null;
		for(int i=0;i<orderDetails.length;i++) {
			item= orderDetails[i];
			if(item.getMaterial().startsWith("SAMPLES")) {
				item.setSampleType(item.getMaterial().substring(7));
			}else {
				item.setSampleType(" ");
			}
			try {
				url = (String) this.getData(CxfNonSpringSimpleServlet.host
						+ "/sap/opu/odata/sap/YY1_PRODUCTS_B2B_WS_CDS/YY1_PRODUCTS_B2B_WS?$format=json&$select=YY1_PARENT_SAL&$filter="
						+ URLEncoder.encode("Product eq '"+item.getMaterial()+"'","UTF-8"),
						authoriz);//
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			com.model.PRODUCTSWRAPPER prod = new com.model.PRODUCTSWRAPPER();
			prod = gson.fromJson(url, prod.getClass());
			String YY1_PARENT_SAL="";
			if(prod.getD().getResults().length==0) {
				YY1_PARENT_SAL=item.getMaterial();
			}else {
				YY1_PARENT_SAL=prod.getD().getResults()[0].getYY1_PARENT_SAL();
			}
			try {
				url = (String) this.getData(CxfNonSpringSimpleServlet.host
						+ "/sap/opu/odata/sap/YY1_PRODUCTS_B2B_WS_CDS/YY1_PRODUCTS_B2B_WS?$format=json&$select=ItemCategoryGroup&$filter="
						+ URLEncoder.encode("Product eq '"+YY1_PARENT_SAL+"'  and (ProductSalesOrg eq '1000' or ProductSalesOrg eq '2000') and ProductDistributionChnl eq '0'","UTF-8"),
						authoriz);//
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			 prod = new com.model.PRODUCTSWRAPPER();
			prod = gson.fromJson(url, prod.getClass());
			System.out.println("777----"+prod.getD().getResults().length);
			
			String ItemCategoryGroup = "";
			if(prod.getD().getResults().length>0)
				prod.getD().getResults()[0].getItemCategoryGroup();
			if((ItemCategoryGroup.equals("BANS") || ItemCategoryGroup.equals("BANC")) && item.getSampleType()==null) {
				item.setWarehouse("Factory");
			}else {
				item.setWarehouse("Boston/Largo");
			}
			
		}
		
		wrapper.setStatus(status);
		System.out.println("------790------"+wrapper.toString());
		return wrapper;

	}

	// @Override
	public B2BCheckPayerWrapper CheckPayer(String SoldToParty) throws Exception {
		B2BCheckPayerWrapper wrapper = new B2BCheckPayerWrapper();
		String status = "";
		String data = "";
		String authoriz = "Basic QkhGX0NPTU06bkJoTHNpd1dYbWZ3cW1YKUZETFJVQTZTd2RDaXRBWFVzd3dad0xxWA==";
		String csrf = "";
		String url = (String) this.getData(CxfNonSpringSimpleServlet.host
				+ "/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_CustomerSalesArea?$format=json&$select=Customer,SalesOrganization&$filter="
				+ URLEncoder.encode("Customer eq '" + SoldToParty + "'", "UTF-8"), authoriz);
		System.out.println("610--data" + url);
		Gson gson = new Gson();
		Zb2BCustInqWrapper z = gson.fromJson(url, Zb2BCustInqWrapper.class);

		System.out.println("614--" + z.toString());
		System.out.println("z.getD().getResults():" + z.getD().getResults());
		if (z.getD().getResults().toString().length() <= 3) {
			wrapper.setStatus("001");
		} else {
			wrapper.setStatus("000");
			url = (String) this
					.getData(CxfNonSpringSimpleServlet.host
							+ "/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_CustSalesPartnerFunc?$format=json&$filter="
							+ URLEncoder.encode("Customer eq '" + SoldToParty + "'  and SalesOrganization eq '"
									+ z.getD().getResults().get(0).getSalesOrganization()
									+ "' and PartnerFunction eq 'RG' and BPCustomerNumber eq '" + SoldToParty + "'",
									"UTF-8"),
							authoriz);
			System.out.println("616--data" + url);
			String ret = "";
			if (url.contains("PY")) {
				ret = "X";
				wrapper.setPayer(ret);
			} else {
				wrapper.setPayer("");
			}
		}
		return wrapper;
	}

	// @Override
	public Z_B2B_COLLECTION_LISTWrapper Z_B2B_COLLECTION_LIST(String BUKRS) {
		// TODO Auto-generated method stub

		String data = "";
		String authoriz = "Basic QkhGX0NPTU06bkJoTHNpd1dYbWZ3cW1YKUZETFJVQTZTd2RDaXRBWFVzd3dad0xxWA==";
		String csrf = "";
		String url = "";
		try {
			url = (String) this.getData(CxfNonSpringSimpleServlet.host
					+ "/sap/opu/odata/sap/YY1_B2B_COLLECTIONS_CDS/YY1_B2B_COLLECTIONS?$format=json&$select=MaterialGroup,MaterialGroupText&$filter="
					+ URLEncoder.encode("CompanyCode eq '" + BUKRS + "'", "UTF-8"), authoriz);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("---URL:" + url);
		Gson gson = new Gson();
		com.model.B2BCollectionListWrapper wrap = new com.model.B2BCollectionListWrapper();
		wrap = gson.fromJson(url, wrap.getClass());
		System.out.println("641----" + wrap.toString());
		Z_B2B_COLLECTION_LISTWrapper wrapper = new Z_B2B_COLLECTION_LISTWrapper();
		if(wrap.getD().getResults().length>0) {wrapper.setStatus("000");
		wrapper.setItems(wrap.getD().getResults());
		}else {wrapper.setStatus("999");}
		return wrapper;

	}

	// @Override
	public com.model.PList Z_B2B_COLLECTION_INQ(String BUKRS, String BOOK) {
		// TODO Auto-generated method stub
		com.model.PList plist = new com.model.PList();
		ArrayList<ReturnProductsWrapper> Products123 = new ArrayList<ReturnProductsWrapper>();
		String data = "";
		String bookName = "";
		String brand = "";
		String result = "000";
		String authoriz = "Basic QkhGX0NPTU06bkJoTHNpd1dYbWZ3cW1YKUZETFJVQTZTd2RDaXRBWFVzd3dad0xxWA==";
		String csrf = "";
		String url = "";
		String conditiontable = "";
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
		try {
			url = (String) this.getData(CxfNonSpringSimpleServlet.host
					+ "/sap/opu/odata/sap/YY1_B2B_COLLECTIONS_INQ_CDS/YY1_B2B_COLLECTIONS_INQ?$format=json&$select=ProductGroupName,SAP_Description&$filter="
					+ URLEncoder.encode("CompanyCode eq '" + BUKRS + "' and MaterialGroup eq'" + BOOK + "'", "UTF-8"),
					authoriz);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Gson gson = new Gson();
		com.model.INQWRAPPER wrap = new com.model.INQWRAPPER();
		wrap = gson.fromJson(url, wrap.getClass());
		if (wrap.getD().getResults().length == 0) {
			result = "999";
		} else {
			bookName = wrap.getD().getResults()[0].getProductGroupName();
			brand = wrap.getD().getResults()[0].getSAP_Description();
		}
		System.out.println("665----" + wrap.toString());

		try {
			url = (String) this.getData(CxfNonSpringSimpleServlet.host
					+ "/sap/opu/odata/sap/YY1_PRODUCTS_B2B_WS_CDS/YY1_PRODUCTS_B2B_WS?$format=json&$filter="
					+ URLEncoder.encode(
							"startswith(Product,'010V00') eq false and Plant eq '1000' and YY1_PARENT_SAL ne '' and ProductSalesOrg eq '"
									+ BUKRS + "' and ProductGroup eq '" + BOOK + "' ",
							"UTF-8"),
					authoriz);//
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		com.model.PRODUCTSWRAPPER prod = new com.model.PRODUCTSWRAPPER();
		prod = gson.fromJson(url, prod.getClass());
		System.out.println("748----" + prod.toString());
		com.model.PRODUCTS[] products = prod.getD().getResults();
		com.model.PRODUCTS product = new com.model.PRODUCTS();
		if (prod.getD().getResults().length == 0) {
			result = "999";
		}
		for (int i = 0; i < products.length; i++) {
			product = products[i];
			String uom = "";
			if (product.getSalesMeasureUnit().length() > 0) {
				uom = product.getSalesMeasureUnit();
			} else {
				uom = product.getBaseUnit();
			}
			try {

				url = (String) this.getData(CxfNonSpringSimpleServlet.host
						+ "/sap/opu/odata/sap/API_SLSPRICINGCONDITIONRECORD_SRV/A_SlsPrcgCndnRecdValidity?$format=json&$select=ConditionRecord&$filter="
						+ URLEncoder.encode("ConditionType eq 'ZPR1' and MaterialGroup eq '" + product.getProductGroup()
								+ "' and PriceListType eq 'S1' and SalesOrganization eq '" + BUKRS
								+ "' and DistributionChannel eq '01' and ConditionValidityEndDate ge datetime'"
								+ ft.format(new Date()) + "' and ConditionValidityStartDate le datetime'"
								+ ft.format(new Date()) + "' and YY1_Product_Group_PCI eq '"
								+ product.getYY1_Producthierarchy_SAL() + "'", "UTF-8"),
						authoriz);//
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("778-----data" + url);

			com.model.ConditionRecordWrapper condition = new com.model.ConditionRecordWrapper();
			condition = gson.fromJson(url, condition.getClass());
			System.out.println("condition.getD():" + condition.getD().toString());
			com.model.Cond cond[] = condition.getD().getResults();
			System.out.println("785-----data" + cond.length);
			if (cond.length > 0) {
				conditiontable = "953";
			} else {
				try {
					url = (String) this.getData(CxfNonSpringSimpleServlet.host
							+ "/sap/opu/odata/sap/API_SLSPRICINGCONDITIONRECORD_SRV/A_SlsPrcgCndnRecdValidity?$format=json&$select=ConditionRecord&$filter="
							+ URLEncoder.encode("ConditionType eq 'ZPR1' and YY1_MATWA_PCI eq '" + product.getProduct()
									+ "' and PriceListType eq 'S1' and SalesOrganization eq '" + BUKRS
									+ "' and DistributionChannel eq '01' and ConditionValidityEndDate ge datetime'"
									+ ft.format(new Date()) + "' and ConditionValidityStartDate lt datetime'"
									+ ft.format(new Date()) + "'",

									"UTF-8"),
							authoriz);//
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				condition = new com.model.ConditionRecordWrapper();
				condition = gson.fromJson(url, condition.getClass());
				cond = condition.getD().getResults();
				System.out.println("809-----data" + cond.length);
				if (cond.length > 0) {
					conditiontable = "937";
				}
			}
			try {
				url = (String) this.getData(CxfNonSpringSimpleServlet.host
						+ "/sap/opu/odata/sap/API_SLSPRICINGCONDITIONRECORD_SRV/A_SlsPrcgConditionRecord?$format=json&$select=ConditionRateValue&$filter="
						+ URLEncoder.encode("ConditionTable eq '" + conditiontable + "' and ConditionRecord eq '"
								+ cond[0].getConditionRecord()
								+ "' and ConditionIsDeleted eq false and ConditionQuantityUnit eq '" + uom + "'",

								"UTF-8"),
						authoriz);//
			} catch (Exception e) {
				result = "999";
				// TODO Auto-generated catch block
				e.printStackTrace();

			}

			condition = new com.model.ConditionRecordWrapper();
			condition = gson.fromJson(url, condition.getClass());
			cond = condition.getD().getResults();

			com.model.ReturnProductsWrapper P = new com.model.ReturnProductsWrapper();
			P.setProduct(product.getProduct());
			P.setProductName(product.getProductName());
			if (cond.length > 0) {
				P.setRate(cond[0].getConditionRateValue());
			} else {
				P.setRate("0");
			}
			Products123.add(P);
		}
		com.model.PList Plist = new com.model.PList();
		Plist.setResult(result);
		Plist.setProducts(Products123);
		Plist.setBookName(bookName);
		Plist.setBrand(brand);
		return Plist;
	}

	// @Override
	public B2B_INVOICE_LIST Z_B2B_INV_LIST(String CUST) {
		// TODO Auto-generated method stub

		String result = "000";
		String authoriz = "Basic QkhGX0NPTU06bkJoTHNpd1dYbWZ3cW1YKUZETFJVQTZTd2RDaXRBWFVzd3dad0xxWA==";
		String csrf = "";
		String url = "";
		com.model.B2B_INVOICE_LIST InvList = new com.model.B2B_INVOICE_LIST();
		ArrayList<INVOICELIST> Invoice = new ArrayList<INVOICELIST>();
		try {
			url = (String) this.getData(CxfNonSpringSimpleServlet.host
					+ "/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_Customer?$format=json&$select=Customer&$filter="
					+ URLEncoder.encode("Customer eq '" + CUST + "'" + "and DeletionIndicator eq false", "UTF-8"),
					authoriz);//
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("881 URL----Data" + url);
		Gson gson = new Gson();
		com.model.custwrapper cust = new com.model.custwrapper();
		cust = gson.fromJson(url, cust.getClass());
		com.model.InvItems[] Inv = cust.getD().getResults();
		if (Inv.length == 0) {
			result = "CUS";
		}

		try {
			url = (String) this.getData(CxfNonSpringSimpleServlet.host
					+ "/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_CustSalesPartnerFunc?$format=json&$filter="
					+ URLEncoder.encode("Customer eq '" + CUST + "'" + "and PartnerFunction eq 'RE'"
							+ "and BPCustomerNumber eq '" + CUST + "'", "UTF-8"),
					authoriz);//
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		cust = new com.model.custwrapper();
		cust = gson.fromJson(url, cust.getClass());
		Inv = cust.getD().getResults();
		if (Inv.length == 0) {

		}
		try {
			url = (String) this.getData(CxfNonSpringSimpleServlet.host
					+ "/sap/opu/odata/sap/YY1_FISCALYEAR_CDS/YY1_FISCALYEAR?$format=json&$select=FiscalPeriodEndDate,PreviousFiscalPeriodStartDa",
					authoriz);//
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		cust = new com.model.custwrapper();
		cust = gson.fromJson(url, cust.getClass());
		Inv = cust.getD().getResults();

		try {
			url = (String) this
					.getData(CxfNonSpringSimpleServlet.host
							+ "/sap/opu/odata/sap/YY1_B2B_INVOICE_LIST_CDS/YY1_B2B_INVOICE_LIST?$format=json&$filter="
							+ URLEncoder.encode("SoldToParty eq '" + CUST + "'" + "and BillingDocumentDate gt '//Date("
									+ Inv[0].getPreviousFiscalPeriodStartDa() + ")//'"
									+ "and BillingDocumentDate le '//Date(" + Inv[0].getFiscalPeriodEndDate() + ")//'",
									"UTF-8"),
							authoriz);//
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("931-----data" + url);
		cust = new com.model.custwrapper();
		cust = gson.fromJson(url, cust.getClass());
		Inv = cust.getD().getResults();

		com.model.InvItems InvItems = new com.model.InvItems();
		com.model.INVOICELIST ILIST = new com.model.INVOICELIST();
		for (int i = 0; i < Inv.length; i++) {
			InvItems = Inv[i];
			System.out.println("940-----data" + InvItems.getBillingDocument());
			ILIST.setInvoiceNumber(InvItems.getBillingDocument());
			ILIST.setActualGoodsMovementDate(InvItems.getActualGoodsMovementDate());
			ILIST.setCurrency(InvItems.getTransactionCurrency());
			ILIST.setDelivery(InvItems.getReferenceSDDocument());
			ILIST.setFrieghtAmount("0.00");
			ILIST.setGSTAmount("0.00");
			ILIST.setHandlingAmount("0.00");
			ILIST.setInvoiceDate(InvItems.getBillingDocumentDate());
			ILIST.setPurchaseOrderByCustomer(InvItems.getPurchaseOrderByCustomer());
			ILIST.setSalesDocument(InvItems.getSalesDocument());
			ILIST.setShippingCondition(InvItems.getShippingCondition());
			ILIST.setShippingConditionName(InvItems.getShippingConditionName());
			ILIST.setShippingPoint(InvItems.getShippingPoint());
			ILIST.setTaxAmount("0.00");
			ILIST.setTotalAmount(InvItems.getTotalNetAmount());
			if (InvItems.getBillingDocumentIsCancelled() != "X") {
				if (InvItems.getSDDocumentCategory() != "N" && InvItems.getSDDocumentCategory() != "S") {
					if (InvItems.getSDDocumentCategory() == "M" || InvItems.getSDDocumentCategory() == "O") {
						ILIST.setInvoiceType("INV");
					} else if (InvItems.getSDDocumentCategory() == "P") {
						ILIST.setInvoiceType("CR");

					} else {
						ILIST.setInvoiceType(null);
					}

				}
			}

			if (InvItems.getSalesDocumentItemCategory() == "TAS" || InvItems.getSDDocumentCategory() == "ZTAS") {
				ILIST.setVtext("Factory Direct");
			} else {
				ILIST.setVtext("Warehouse");
			}
			if (ILIST.getInvoiceType() != null) {
				Invoice.add(ILIST);
			}
		}

		InvList.setResult(result);
		InvList.setInvoiceList(Invoice);
		return InvList;

	}

	@Override
	public Docs[] Z_B2B_INV_DET(B2B_INVOICE_LIST INVHEAD) {
		// TODO Auto-generated method stub

		String result = "000";
		String authoriz = "Basic QkhGX0NPTU06bkJoTHNpd1dYbWZ3cW1YKUZETFJVQTZTd2RDaXRBWFVzd3dad0xxWA==";
		String csrf = "";
		String url = "";
		try {
			url = (String) this.getData(CxfNonSpringSimpleServlet.host
					+ "/sap/opu/odata/sap/YY1_INVOICE_DETAILS_CDS/YY1_INVOICE_DETAILS?$format=json&$filter="
					+ URLEncoder.encode(
							"BillingDocument eq '" + INVHEAD.getInvoiceList().get(0).getInvoiceNumber() + "'", "UTF-8"),
					authoriz);//
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Gson gson = new Gson();
		com.model.BillingDetailsWrapper wrapper = new com.model.BillingDetailsWrapper();
		wrapper = gson.fromJson(url, wrapper.getClass());
		com.model.Docs[] Docs = wrapper.getD().getResults();

		return Docs;
	}

}
