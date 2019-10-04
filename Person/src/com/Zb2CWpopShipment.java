/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.google.gson.Gson;
import com.model.Zb2CWpopShipmentWrapper;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import javax.annotation.Resource;
import javax.naming.AuthenticationException;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 *
 * @author SrinivasBu
 */
@Service
@SuppressWarnings(value = {"java.io.IOException"})
public class Zb2CWpopShipment implements Zb2CWpopShipmentInterface {

    @Resource
    public WebServiceContext wsctx;
    Logger logger = LoggerFactory.getLogger(Zb2CWpopShipment.class);

    @Override
    public Zb2CWpopShipmentWrapper getResendWpopShipments(List<String> salesOrg, List<String> soldToParty, String PlannedGoodsIssueFromDate, String PlannedGoodsIssueToDate) throws AuthenticationException, Exception {
//     return new    Zb2CWpopShipmentWrapper();
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
//        authoriz = "Basic QkhGX0NPTU06bkJoTHNpd1dYbWZ3cW1YKUZETFJVQTZTd2RDaXRBWFVzd3dad0xxWA==";
        com.model.Zb2CWpopShipmentWrapper z = new com.model.Zb2CWpopShipmentWrapper();
        com.model.Zb2CWpopShipmentGetTrackingNumWrapper x = new com.model.Zb2CWpopShipmentGetTrackingNumWrapper();
        DataOutputStream dataOut = null;
        BufferedReader br = null;
        InputStreamReader in = null;
        Gson gson = new Gson();
        System.out.println("---PlannedGoodsIssueFromDate----" + PlannedGoodsIssueFromDate);
        String planGdIssueFromDate = PlannedGoodsIssueFromDate + "T00:00:00";
        System.out.println("---planGdIssueFromDate----" + planGdIssueFromDate);

        System.out.println("---PlannedGoodsIssueToDate----" + PlannedGoodsIssueToDate);
        String planGdIssueToDate = PlannedGoodsIssueToDate + "T23:59:59";
        System.out.println("---planGdIssueToDate----" + planGdIssueToDate);

//        String BASE_URL = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/YY1_DELIVERYDOCUMENT_CDS/YY1_DELIVERYDOCUMENT?$format=json&$select=PlannedGoodsIssueDate,OverallGoodsMovementStatus,SoldToParty,DeliveryDocument,SDDocumentCategory,SalesOrganization&$filter=" + URLEncoder.encode("SalesOrganization eq '" + salesOrg + "' and SoldToParty eq '" + soldToParty + "' and SDDocumentCategory eq 'J' and OverallGoodsMovementStatus eq 'C' and PlannedGoodsIssueDate eq datetime'" + PlannedGoodsIssueDate + "'", "UTF-8");
        String BASE_URL = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_OUTBOUND_DELIVERY_SRV;v=0002/A_OutbDeliveryHeader?$format=json&$select=PlannedGoodsIssueDate,OverallGoodsMovementStatus,SoldToParty,DeliveryDocument,SDDocumentCategory,SalesOrganization&$filter=" + URLEncoder.encode("(SalesOrganization eq '" + String.join("' or SalesOrganization eq '", salesOrg) + "') and (SoldToParty eq '" + String.join("' or SoldToParty eq '", soldToParty) + "') and SDDocumentCategory eq 'J' and OverallGoodsMovementStatus eq 'C' and PlannedGoodsIssueDate ge datetime'" + planGdIssueFromDate + "' and PlannedGoodsIssueDate le datetime'" + planGdIssueToDate + "'", "UTF-8");

        System.out.println("--Line 101-----" + BASE_URL);

        String result = (String) this.getData(BASE_URL, authoriz);
        System.out.println("result : " + result);
        z = gson.fromJson(result.toString(), com.model.Zb2CWpopShipmentWrapper.class);
        String url = "";
        String urlForPO = "";
        com.model.Zb2CWpopShipmentGetSOWrapper w = new com.model.Zb2CWpopShipmentGetSOWrapper();
        com.model.Zb2CWpopShipmentGetPOWrapper p = new com.model.Zb2CWpopShipmentGetPOWrapper();
        System.out.println("124--" + z.toString());
        com.model.DeliveryDocument dd = new com.model.DeliveryDocument();
        com.model.DeliveryDocument[] ddA = z.getD().getResults();
        for (int i = 0; i < z.getD().getResults().length; i++) {
            dd = ddA[i];
            dd.setStatus("20");
            String delDoc = dd.getDeliveryDocument();
//            String delItem_URL = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_OUTBOUND_DELIVERY_SRV;v=0002/A_OutbDeliveryHeader('" + delDoc + "')/to_DeliveryDocumentItem?$format=json&$select=DeliveryDocument,ReferenceSDDocument";
            url = (String) getData("https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_OUTBOUND_DELIVERY_SRV;v=0002/A_OutbDeliveryHeader('" + delDoc + "')/to_DeliveryDocumentItem?$format=json&$select=DeliveryDocument,ReferenceSDDocument", authoriz);
            System.out.println("URL----" + url);
            w = gson.fromJson(url, com.model.Zb2CWpopShipmentGetSOWrapper.class);
            System.out.println("---w----" + w);

            com.model.DeliveryDocumentGetSO ddSO = new com.model.DeliveryDocumentGetSO();
            com.model.DeliveryDocumentGetSO[] ddSOA = w.getD().getResults();
            System.out.println("ddSOA length--------" + ddSOA.length);
            for (int j = 0; j < ddSOA.length; j++) {
                ddSO = ddSOA[j];
                String soNum = ddSO.getReferenceSDDocument();
                urlForPO = (String) getData("https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_SALES_ORDER_SRV/A_SalesOrder('" + soNum + "')?$format=json&$select=SalesOrder,PurchaseOrderByCustomer", authoriz);
                System.out.println("POnum--------" + urlForPO);
                p = gson.fromJson(urlForPO, com.model.Zb2CWpopShipmentGetPOWrapper.class);
                System.out.println("---poDetails----" + p);
                dd.setPoNumber(p.getD().getPurchaseOrderByCustomer());

                break;
            }
            String url_trackNum = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/YY1_SHIPING_UNIT_CUSTOM_CDS/YY1_Shiping_unit_custom?$format=json&$filter=" + URLEncoder.encode("DeliveryNumber  eq '" + delDoc + "'", "UTF-8");
            String data_trackNum = "";
            data_trackNum = (String) getData(url_trackNum, authoriz);
            System.out.println("---url_trackNum--" + url_trackNum);
            System.out.println("---data_trackNum---" + data_trackNum);
            x = gson.fromJson(data_trackNum, com.model.Zb2CWpopShipmentGetTrackingNumWrapper.class);
            System.out.println("---x----" + x);

            com.model.DeliveryDocumentGetTrackingNum ddTrNum = new com.model.DeliveryDocumentGetTrackingNum();
            com.model.DeliveryDocumentGetTrackingNum[] ddATrNum = x.getD().getResults();
            System.out.println("ddATrNum length---" + ddATrNum.length);
            if (ddATrNum.length > 0) {
                for (int s = 0; s < ddATrNum.length; s++) {
                    ddTrNum = ddATrNum[s];
                    String trNum = ddTrNum.getTrackingNumber();
                    dd.setTrackingNumber(trNum);
                    System.out.println("trNum-----" + trNum);
                    break;
                }
            } else {
                dd.setTrackingNumber("");
            }

        }
        return z;
    }

    public Object getData(String url, String authoriz) throws ClientProtocolException, IOException {
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

    @Override
    public com.model.Zb2CWpopShipmentCancelOrdersWrapper getCancelOrders(List<String> soldToParty, String cancellationFromDate, String cancellationToDate) throws AuthenticationException, Exception {
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
//        authoriz = "Basic QkhGX0NPTU06bkJoTHNpd1dYbWZ3cW1YKUZETFJVQTZTd2RDaXRBWFVzd3dad0xxWA==";
        com.model.Zb2CWpopShipmentCancelOrdersWrapper z = new com.model.Zb2CWpopShipmentCancelOrdersWrapper();
        com.model.Zb2CWpopShipmentCancelOrdersWrapper x = new com.model.Zb2CWpopShipmentCancelOrdersWrapper();
        //        x.getD().getResults()
        ArrayList<com.model.CancelOrders> cancelList = new ArrayList<com.model.CancelOrders>();
        DataOutputStream dataOut = null;
        BufferedReader br = null;
        InputStreamReader in = null;
        Gson gson = new Gson();
        System.out.println("---SoldToParty---" + soldToParty);
        System.out.println("----CancelFromDate----" + cancellationFromDate);
        String cancelFromDate = cancellationFromDate + "T00:00:00.0000000Z";
        System.out.println("----CancelFromDate After Formatting----" + cancelFromDate);
        System.out.println("----CancelToDate----" + cancellationToDate);
        String cancelToDate = cancellationToDate + "T23:59:59.0000000Z";
        System.out.println("----CancelToDate After Formatting----" + cancelToDate);
        String BASE_URL = "";
        String data = "";

        System.out.println("--Base_URL---" + BASE_URL);
        try {
            BASE_URL = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_SALES_ORDER_SRV/A_SalesOrder?$format=json&$select=SalesOrder,LastChangeDateTime,SoldToParty,DeliveryBlockReason,PurchaseOrderByCustomer&$filter=" + URLEncoder.encode("(SoldToParty eq '" + String.join("' or SoldToParty eq '", soldToParty) + "') and LastChangeDateTime ge datetimeoffset'" + cancelFromDate + "' and LastChangeDateTime le datetimeoffset'" + cancelToDate + "' and DeliveryBlockReason ne '' and SDDocumentReason ne '523'", "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            java.util.logging.Logger.getLogger(Zb2CWpopShipment.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("73" + BASE_URL);
        try {
            data = (String) this.getData(BASE_URL, authoriz);
            System.out.println("77" + BASE_URL);
//            System.out.println("77" + data);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Zb2CWpopShipment.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("81--" + data);
        z = gson.fromJson(data.toString(), com.model.Zb2CWpopShipmentCancelOrdersWrapper.class);
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println("---Date FormaT---" + dtf.format(now));
        com.model.CancelOrders dd = new com.model.CancelOrders();
        com.model.CancelOrders[] ddA = z.getD().getResults();

        System.out.println("ddA Length----" + ddA.length);
        com.model.Zb2CWpopShipmentCancelOrdersGetSalesItemWrapper y = new com.model.Zb2CWpopShipmentCancelOrdersGetSalesItemWrapper();

        if (ddA.length > 0) {
            for (int i = 0; i < z.getD().getResults().length; i++) {
                dd = ddA[i];
                dd.setStatus("40");
                String saleOrder = dd.getSalesOrder();
                System.out.println("Sales Order-----" + saleOrder);
                String url_SoItem = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_SALES_ORDER_SRV/A_SalesOrderItem?$format=json&$select=SalesDocumentRjcnReason,SalesOrder,SalesOrderItem&$filter=" + URLEncoder.encode("SalesOrder  eq '" + saleOrder + "' and SalesDocumentRjcnReason eq ''", "UTF-8");
                String data_SoItem = "";
                data_SoItem = (String) getData(url_SoItem, authoriz);
                System.out.println("---SoItem Data---" + data_SoItem);
                y = gson.fromJson(data_SoItem.toString(), com.model.Zb2CWpopShipmentCancelOrdersGetSalesItemWrapper.class);
                System.out.println("---y----" + y);

                com.model.CancelOrdersGetSalesItem ddSoItem = new com.model.CancelOrdersGetSalesItem();
                com.model.CancelOrdersGetSalesItem[] ddASoItem = y.getD().getResults();
                System.out.println("----ddASoItem- Length----" + ddASoItem.length);
                if (ddASoItem.length == 0) {
                    System.out.println("PurchaseOrder----" + dd.getPurchaseOrderByCustomer());
                        cancelList.add(dd);
                }
            }
        }
        com.model.CollectionOfCancelOrders colList = new com.model.CollectionOfCancelOrders();
        colList.setResults(cancelList.toArray(new com.model.CancelOrders[cancelList.size()]));
        x.setD(colList);
        System.out.println("Final List Length----"+ cancelList.size());
        
        System.out.println("----getCancelOrders----" + x);
        return x;
    }

}
