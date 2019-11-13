package com;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebParam;
import javax.naming.AuthenticationException;
import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.JAXBContext;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.LinkedHashMap;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ShippingConditionsWrapper;
import com.CollectionOfShippingConditions;
import com.ShippingConditions;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

@Service
@SuppressWarnings(value = { "java.io.IOException" })
public class Zb2BCustInq implements Zb2BCustInqInterface {

    @Resource
    public WebServiceContext wsctx;
    Logger logger = LoggerFactory.getLogger(Zb2BCustInq.class);

    
    
    
    @Override
    public Zb2BCustInqWrapper getCustomerValidation(String customer) throws AuthenticationException, Exception {
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
        String csrf = null;
        String username = "";
        String password = "";
        String authoriz = "";

        if (userList != null) {
            //get username
            username = userList.get(0).toString();
        }

        if (passList != null) {
            //get password
            password = passList.get(0).toString();
        }
        if (authList != null) {
            //get password
            authoriz = authList.get(0).toString();
        }
        if (authList == null) {
            throw new AuthenticationException("No Authorization Header ");
        }
        //System.out.println("User : " + username);
        //System.out.println("Pass : " + password);
        //System.out.println("Auth : " + authoriz);
        //System.out.println("Basic " + Base64.getEncoder().encodeToString((username + ":" +password).getBytes()));
        //https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_BusinessPartnerAddress?$format=json&expand=to_BusinessPartnerAddress&$filter=BusinessPartner eq 'SIVA G'

        Zb2BCustInqWrapper z = new Zb2BCustInqWrapper();
        DataOutputStream dataOut = null;
        BufferedReader br = null;
        InputStreamReader in = null;
        Gson gson = new Gson();
        //String BASE_URL = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_CustomerSalesArea(Customer='"+customer+"',SalesOrganization='"+salesOrganization+"',DistributionChannel='"+distributionChannel+"',Division='"+division+"')?$format=json&$select=Customer,SalesOrganization,DistributionChannel,ShippingCondition,CustomerPaymentTerms,DeliveryIsBlockedForCustomer,OrderIsBlockedForCustomer";
        String BASE_URL = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_CustomerSalesArea?$format=json&$select=Customer,SalesOrganization,DistributionChannel,Division,ShippingCondition,CustomerPaymentTerms,DeliveryIsBlockedForCustomer,OrderIsBlockedForCustomer,DeletionIndicator&$filter=" + URLEncoder.encode("Customer eq '" + customer + "'", "UTF-8");
        //String BASE_URL = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_CustomerSalesArea?$format=json&$select=Customer,SalesOrganization,DistributionChannel,Division,ShippingCondition,CustomerPaymentTerms,DeliveryIsBlockedForCustomer,OrderIsBlockedForCustomer,DeletionIndicator&$filter=Customer eq '" + customer + "'";
        System.out.println(BASE_URL);
        //Response response;
        String responseBody = "";
        try {
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
            //respons.getEntity().writeTo(System.out);
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
            if(z.getD().getResults().size()==0) {z.setStatus("001");return z;}
            System.out.println("-- Shipping Condition : " + z.getD().getResults().get(0).getShippingCondition());
            System.out.println("-- z : " + z.toString());
            String url = "";
            if (z.getD().getResults().get(0).getShippingCondition().length() == 0) {

				url = (String) getData(
						CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/YY1_SHIPXREF_CDS/YY1_SHIPXREF?$format=json&$select=VSBED,VTEXT&$filter="
								+ URLEncoder.encode(
										"XREFCODE eq 'US_SHPCOND' and XREFRESULT eq 'X' and (XSITD eq 'UPS' or XSITD eq 'USPS' or XSITD eq 'WILLCALL')",
										"UTF-8"),
						authoriz);
				System.out.println("440----Url" + url);
			}
            if (z.getD().getResults().get(0).getOrderIsBlockedForCustomer().length() > 0) {    //|| z.getD().getOrderIsBlockedForCustomer().length()>0
                if (z.getD().getResults().get(0).getOrderIsBlockedForCustomer() == "true") {
                    z.setStatus("002");
                }
            }
            
            
            if (z.getD().getResults().get(0).getShippingCondition().length() > 0) {
                if (z.getD().getResults().get(0).getShippingCondition().matches("00")) {
                    //z.setStatus("001");
                    //retreive XREFRESULT and set the value in z.getD().getResults().get(0).getShippingCondition()
                    url=(String)getData(CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/YY1_XREF_CDS/YY1_XREF?$format=json&$select=XREFRESULT&$filter=" + URLEncoder.encode("XREFCODE eq 'DEF_SHIP' and XREFKEY eq 'UPS_FEDEX'","UTF-8"),authoriz);
                    com.ShippingConditionsWrapper sh = gson.fromJson(url, com.ShippingConditionsWrapper.class);
					z.getD().getResults().get(0)
							.setShippingCondition(sh.getD().getResults().get(0).getShippingCondition());
                } 
                
                
                switch (z.getD().getResults().get(0).getSalesOrganization()) {
                    case "1000":
                        switch(z.getD().getResults().get(0).getCustomerPaymentTerms()){
                            case "COD": url=(String)getData(CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/YY1_SHIPPING_CONDITIONS_CDS/YY1_SHIPPING_CONDITIONS?$format=json&$select=VSBED,VTEXT&$filter=" + URLEncoder.encode("VSBED eq '01'","UTF-8"),authoriz);
                                    break;
                            case "CASH": url=(String)getData(CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/YY1_SHIPPING_CONDITIONS_CDS/YY1_SHIPPING_CONDITIONS?$format=json&$select=VSBED,VTEXT&$filter=" + URLEncoder.encode("VSBED eq '01'","UTF-8"),authoriz);
                            default:
                                switch (z.getD().getResults().get(0).getShippingCondition()) {
                                    case "WC": url=(String)getData(CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/YY1_SHIPXREF_CDS/YY1_SHIPXREF?$format=json&$select=VSBED,VTEXT&$filter=" + URLEncoder.encode("XREFCODE eq 'US_SHPCOND' and XREFRESULT eq 'X' and (XSITD eq 'UPS' or XSITD eq 'USPS' or XSITD eq 'WILLCALL')","UTF-8"),authoriz);
                                    break;
                                    case "01": url=(String)getData(CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/YY1_SHIPXREF_CDS/YY1_SHIPXREF?$format=json&$select=VSBED,VTEXT&$filter=" + URLEncoder.encode("XREFCODE eq 'US_SHPCOND' and XREFRESULT eq 'X' and (XSITD eq 'UPS' or XSITD eq 'USPS' or XSITD eq 'WILLCALL')","UTF-8"),authoriz);
                                    break;
                                    case "41": url=(String)getData(CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/YY1_SHIPXREF_CDS/YY1_SHIPXREF?$format=json&$select=VSBED,VTEXT&$filter=" + URLEncoder.encode("XREFCODE eq 'US_SHPCOND' and XREFRESULT eq 'X' and (XSITD eq 'FEDEX' or XSITD eq 'USPS' or XSITD eq 'WILLCALL')","UTF-8"),authoriz);
                                    break;
                                }
                        }
                        //if 75 delete all and add 75
                        break;
                        case "2000": url=(String)getData(CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/YY1_SHIPXREF_CDS/YY1_SHIPXREF?$format=json&$select=VSBED,VTEXT&$filter=" + URLEncoder.encode("XREFCODE eq 'CA_SHPCOND' and XREFRESULT eq 'X')","UTF-8"),authoriz);
                }
                System.out.println("177 - URL - data:"+url);
                com.ShippingConditionsWrapper sh =gson.fromJson(url, com.ShippingConditionsWrapper.class);
                java.util.HashMap table = new java.util.HashMap();
                java.util.LinkedHashMap lTable = new java.util.LinkedHashMap();
                com.ShippingConditions con = null;
                java.util.Iterator iter = sh.getD().getResults().iterator();
                boolean f75 = false;
                while(iter.hasNext()){
                    con = (ShippingConditions)iter.next();
                    table.put(con.getVSBED(), con.getVTEXT());
                    if(con.getVSBED().equals("75"))
                        f75=true;
                }
                /*if(z.getD().getResults().get(0).getSalesOrganization().equals("1000") && f75){
                    lTable.put("75",table.get("75"));
                    while(iter.hasNext()){
                        con = (ShippingConditions)iter.next();
                        if(!con.getVSBED().equals("75"))
                        lTable.put(con.getVSBED(), con.getVTEXT());
                    }
                }*/
                lTable=new LinkedHashMap(table);
                z.setShippingTable(lTable);
            //} else {
                //z.setStatus("001");
                System.out.println("---ResponseBody : " + respons.toString());
            
            System.out.println("Message : " + respons.getStatusLine().getReasonPhrase());
            //
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        logger.debug("---Address----------------------------------------------------------------------------------------------------------------------");
        //https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_BusinessPartnerAddress?$format=json&expand=to_BusinessPartnerAddress&$filter=BusinessPartner eq 'SIVA G'

        BASE_URL = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_BusinessPartnerAddress?$format=json&expand=to_BusinessPartnerAddress&$filter=" + URLEncoder.encode("BusinessPartner eq '" + customer + "'", "UTF-8");
        System.out.println("220 :" + BASE_URL);
        com.sap.apibhub.sdk.api_business_partner.model.Wrapper9 w = new com.sap.apibhub.sdk.api_business_partner.model.Wrapper9();
        responseBody = "";
        HttpGet request = new HttpGet(BASE_URL);
        HttpClient client = HttpClientBuilder.create().build();
        // add request header
        try {
            request.addHeader("User-Agent", "Java");
            request.addHeader("Content-Type", "application/json");
            request.addHeader("Accept", "application/json");
            request.addHeader("APIKey", "SzC1d22J7FqnBtcSAcGfbLZj6g1DmbXm");
            request.addHeader("Authorization", authoriz);
            request.addHeader("X-CSRF-TOKEN", "FETCH");
            HttpResponse respons = client.execute(request);
            //respons.getEntity().writeTo(System.out);
            csrf = respons.getFirstHeader("X-CSRF-TOKEN").getValue();
            StringBuffer result = new StringBuffer();
            if (200 == respons.getStatusLine().getStatusCode()) {
                in = new InputStreamReader(respons.getEntity().getContent());
                BufferedReader rd = new BufferedReader(in);
                String line = "";
                while ((line = rd.readLine()) != null) {
                    result.append(line);
                }
                System.out.println("243-result : " + result);
                w = gson.fromJson(result.toString(), com.sap.apibhub.sdk.api_business_partner.model.Wrapper9.class);
                z.setAddress((APIBUSINESSPARTNERABusinessPartnerAddressType) w.getD().getResults().get(0));
            }
        } catch (Exception e) {
            System.out.println("--247--");
            e.printStackTrace();
        }
        System.out.println("----Wrapper Customer Inq : " + z.toString());
        logger.debug("----Wrapper Customer Inq : " + z.toString());
        return z;
    }
    

    
    public Object getData(String url,String authoriz) throws ClientProtocolException, IOException{
        System.out.println("235 - "+url+"   -authoriz:"+authoriz);
        HttpGet request = new HttpGet(url);

                    // add request header
                    request.addHeader("User-Agent", "Java");
                    request.addHeader("Content-Type", "application/json");
                    request.addHeader("Accept", "application/json");
                    //request.addHeader("APIKey", "SzC1d22J7FqnBtcSAcGfbLZj6g1DmbXm");
                    request.addHeader("Authorization", authoriz);
                    request.addHeader("X-CSRF-TOKEN", "FETCH");
                    HttpClient client = HttpClientBuilder.create().build();
                    HttpResponse respons = client.execute(request);
                    //respons.getEntity().writeTo(System.out);
                    String csrf = respons.getFirstHeader("X-CSRF-TOKEN").getValue();
                    StringBuffer result = new StringBuffer();
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

}
