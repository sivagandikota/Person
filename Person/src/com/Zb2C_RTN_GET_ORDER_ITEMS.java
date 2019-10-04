/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.google.gson.Gson;
import com.model.Zb2cGetOrderItemListWrapper;
import com.sap.apibhub.sdk.api_sales_order_srv.model.APISALESORDERSRVASalesOrderItemType;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import javax.annotation.Resource;
import javax.naming.AuthenticationException;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author SrinivasBu
 */
public class Zb2C_RTN_GET_ORDER_ITEMS implements Zb2C_RTN_GET_ORDER_ITEMS_Interface {

    @Resource
    public WebServiceContext wsctx;
    Logger logger = LoggerFactory.getLogger(Zb2C_RTN_GET_ORDER_ITEMS.class);

    @Override
    public Zb2cGetOrderItemListWrapper getOrderItems(String Customerpurchaseorder, String Customer, String Email) throws AuthenticationException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        String status = "";
        Gson gson = new Gson();
        List<APISALESORDERSRVASalesOrderItemType> list = null;
        com.model.Zb2CGetOrderItemsWrapper z = new com.model.Zb2CGetOrderItemsWrapper();
        com.model.Zb2CGetOrderItemsGetSOWrapper w = new com.model.Zb2CGetOrderItemsGetSOWrapper();
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
//        if (authList == null) {
//            throw new AuthenticationException("No Authorization Header ");
//        }
        authoriz = "Basic QkhGX0NPTU06bkJoTHNpd1dYbWZ3cW1YKUZETFJVQTZTd2RDaXRBWFVzd3dad0xxWA==";
        String data = "";
        String url = "";
        try {
            url = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_CustomerSalesArea?$format=json&$select=Customer,SalesOrganization&$filter=" + URLEncoder.encode("Customer eq '" + Customer + "'", "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            java.util.logging.Logger.getLogger(Zb2C_RTN_GET_ORDER_ITEMS.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("73" + url);
        try {
            data = (String) this.getData(url, authoriz);
            System.out.println("77" + url);
//            System.out.println("77" + data);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Zb2C_RTN_GET_ORDER_ITEMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("81--" + data);
        z = gson.fromJson(data.toString(), com.model.Zb2CGetOrderItemsWrapper.class);
        System.out.println("----z-----" + z);

        com.model.OrderItems dd = new com.model.OrderItems();
        com.model.OrderItems[] ddA = z.getD().getResults();
        System.out.println("Array Length----" + ddA.length);
        if (ddA.length > 0) {
            status = "000";
        } else {
            status = "999";
        }
        for (int i = 0; i < ddA.length; i++) {
            dd = ddA[i];
            String saleOrg = dd.getSalesOrganization();
            String url_SO = "";
            String soData = "";
            try {
                url_SO = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_SALES_ORDER_SRV/A_SalesOrder?$format=json&$select=SalesOrder&$filter=" + URLEncoder.encode("SalesOrganization eq '" + saleOrg + "' and SoldToParty eq '" + Customer + "' and DistributionChannel eq '10' and PurchaseOrderByCustomer eq '" + Customerpurchaseorder + "'", "UTF-8");
            } catch (UnsupportedEncodingException ex) {
                java.util.logging.Logger.getLogger(Zb2C_RTN_GET_ORDER_ITEMS.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("----SO_URL------" + url_SO);
            try {
                soData = (String) this.getData(url_SO, authoriz);

            } catch (Exception ex) {
                java.util.logging.Logger.getLogger(Zb2C_RTN_GET_ORDER_ITEMS.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("----SO_Data--" + soData);

            w = gson.fromJson(soData.toString(), com.model.Zb2CGetOrderItemsGetSOWrapper.class);
            System.out.println("----w-----" + w);

            break;
        }
        com.model.OrderItemsGetSO ddSO = new com.model.OrderItemsGetSO();
        com.model.OrderItemsGetSO[] ddASO = w.getD().getResults();
        System.out.println("Array Length----" + ddASO.length);
        if (ddASO.length > 0) {
            status = "000";
        } else {
            status = "999";
        }

        for (int k = 0; k < ddASO.length; k++) {
            ddSO = ddASO[k];
            String saleOrder = ddSO.getSalesOrder();
            String url_SO_Items = "";
            String so_Items_Data = "";
            try {
                url_SO_Items = (String) this.getData("https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_SALES_ORDER_SRV/A_SalesOrder('" + saleOrder + "')/to_Item?$select=SalesOrder,SalesOrderItem,Material,SalesOrderItemText,RequestedQuantity,RequestedQuantityUnit,ItemGrossWeight,ItemWeightUnit,Batch", authoriz);
            } catch (Exception ex) {
                java.util.logging.Logger.getLogger(Zb2C_RTN_GET_ORDER_ITEMS.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("---------" + url_SO_Items);
            com.sap.apibhub.sdk.api_sales_order_srv.model.Wrapper1 wi = new com.sap.apibhub.sdk.api_sales_order_srv.model.Wrapper1();
            wi = gson.fromJson(url_SO_Items, wi.getClass());
            System.out.println("-135--------" + wi.toString());
            list = wi.getD().getResults();
//            try {
//                so_Items_Data = (String) getData("https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_SALES_ORDER_SRV/A_SalesOrder('" + saleOrder + "')/to_Item?$select=SalesOrder,SalesOrderItem,Material,SalesOrderItemText,RequestedQuantity,RequestedQuantityUnit,ItemGrossWeight,ItemWeightUnit,Batch", authoriz);
//            } catch (UnsupportedEncodingException ex) {
//                java.util.logging.Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
//        return z;
        Zb2cGetOrderItemListWrapper outp = new Zb2cGetOrderItemListWrapper();
        outp.setItemList(list);
        outp.setRestlt(status);
        return outp;
    }

    public Object getData(String url, String authoriz) throws Exception, IOException {
        System.out.println("235 - " + url + "   -authoriz:" + authoriz);
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
