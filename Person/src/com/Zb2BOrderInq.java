/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.google.gson.Gson;
import com.model.OrdersInqGetSOItem;
import com.model.Zb2BOrderInqWrapper;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
public class Zb2BOrderInq implements Zb2BOrderInqInterface {

    @Resource
    public WebServiceContext wsctx;
    Logger logger = LoggerFactory.getLogger(Zb2BOrderInq.class);

    @Override
    public com.model.OrderInqFinalList getOrderInqInfo(String salesOrder) throws AuthenticationException, Exception {
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
        com.model.OrderInqFinalList oFinal = new com.model.OrderInqFinalList();
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
//        if (authList != null) {
//            //get password
//            authoriz = authList.get(0).toString();
//        }
//        if (authList == null) {
//            throw new AuthenticationException("No Authorization Header ");
//        }
        //System.out.println("User : " + username);
        //System.out.println("Pass : " + password);
        //System.out.println("Auth : " + authoriz);
        //System.out.println("Basic " + Base64.getEncoder().encodeToString((username + ":" +password).getBytes()));     
        authoriz = "Basic QkhGX0NPTU06bkJoTHNpd1dYbWZ3cW1YKUZETFJVQTZTd2RDaXRBWFVzd3dad0xxWA==";
        String o_result = "000";
        DataOutputStream dataOut = null;
        BufferedReader br = null;
        InputStreamReader in = null;
        com.model.Zb2BOrderInqWrapper z = new com.model.Zb2BOrderInqWrapper();
        com.model.Zb2BOrderInqGetSOWrapper oWSO = new com.model.Zb2BOrderInqGetSOWrapper();
        com.model.Zb2BOrderInqGetSoItemWrapper oWSoItem = new com.model.Zb2BOrderInqGetSoItemWrapper();
        com.model.Zb2BOrderInqGetSOWrapper oWShipAddress = new com.model.Zb2BOrderInqGetSOWrapper();
        com.model.Zb2BOrderInqGetSoItemWrapper oWRejText = new com.model.Zb2BOrderInqGetSoItemWrapper();
        com.model.Zb2BOrderInqGetPOWrapper oWDelNum = new com.model.Zb2BOrderInqGetPOWrapper();
        com.model.Zb2BOrderInqGetPOWrapper oWTrack = new com.model.Zb2BOrderInqGetPOWrapper();
        com.model.Zb2BOrderInqGetPOWrapper oWPoStatus = new com.model.Zb2BOrderInqGetPOWrapper();
        com.model.OrdersInqGetSO dSo = new com.model.OrdersInqGetSO();
        String creditStatus = "";
        String reasonForRej = "";
        String confQuantity = "";
        String soItemCategory = "";
        String salesOrg = "";
        String delStatus = "";
        String soItem = "";
        String plant = "";
        String material = "";
        String ordstat = "";
        String ordstat_text = "";
        String data_poStat = "";
        boolean bCredStatus;
        String data_dNum = "";
        String url_rejText = "";
        String data_rejText = "";
        String url_delStat = "";
        String data_delStat = "";
        String overallDelStatus = "";
        String delStatusItem = "";
        String url_dNum = "";
        Gson gson = new Gson();
        if (!salesOrder.isEmpty()) {
            String BASE_URL = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/YY1_SALESORDER_CDS/YY1_SalesOrder?$format=json&$select=SalesOrder,SalesOrganization,SoldToParty,DeliveryBlockReason,CompleteDeliveryIsDefined,ControllingObject,DistributionChannel,TotalCreditCheckStatus,PurchaseOrderByCustomer,OverallDeliveryStatus,OverallSDProcessStatus&$filter=" + URLEncoder.encode("SalesOrder eq '" + salesOrder + "' and SalesOrderType eq 'OR'", "UTF-8");
            System.out.println("---BASE_URL------" + BASE_URL);
            String result = (String) this.getData(BASE_URL, authoriz);
            System.out.println("result : " + result);
            oWSO = gson.fromJson(result, com.model.Zb2BOrderInqGetSOWrapper.class);
            System.out.println("---oWSO----" + oWSO);
            com.model.OrdersInqGetSO[] dASO = oWSO.getD().getResults();
            System.out.println("---dASO-length----" + dASO.length);
            if (dASO.length > 0) {
                for (int i = 0; i < dASO.length; i++) {
                    dSo = dASO[i];
                    overallDelStatus = dSo.getOverallDeliveryStatus();
                    String customer = dSo.getSoldToParty();
                    creditStatus = dSo.getTotalCreditCheckStatus();
//                    String resultSo = (String) this.get_order_header_SalesOrder(customerNumber, authoriz, salesOrder);
                    String url_soItem = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/YY1_SALESORDERITEM_CDS/YY1_SalesOrderItem?$format=json&$select=SalesOrder,SalesOrderItem,SalesOrderItemCategory,TotalDeliveryStatus,Material,BaseUnit,OriginallyRequestedMaterial,Plant,StorageLocation,Batch,TargetDelivQtyInOrderQtyUni,ConfdDeliveryQtyInBaseUnit,ConfdDelivQtyInOrderQtyUnit,TargetToBaseQuantityNmrtr,TargetToBaseQuantityDnmntr,OrderQuantityUnit,NetAmount,ShippingPoint,SalesDocumentRjcnReason,ItemIsDeliveryRelevant,ItemIsBillingRelevant,MaterialByCustomer,AdditionalMaterialGroup2,Subtotal3Amount&$filter=" + URLEncoder.encode("SalesOrder eq '" + salesOrder + "'", "UTF-8");
                    oWShipAddress = (com.model.Zb2BOrderInqGetSOWrapper) this.getShipAddress(salesOrder, authoriz);
//                    System.out.println("---result_shipAddress----" + result_shipAddress);
//                    oWShipAddress = gson.fromJson(result_shipAddress, com.model.Zb2BOrderInqGetSOWrapper.class);
                    System.out.println("--oWshipAdress--" + oWShipAddress);

                    String result_SoItem = (String) this.getData(url_soItem, authoriz);
                    System.out.println("----url_soItem----" + url_soItem);
                    System.out.println("-----result_SoItem---" + result_SoItem);
                    oWSoItem = gson.fromJson(result_SoItem, com.model.Zb2BOrderInqGetSoItemWrapper.class);
                    System.out.println("----oWSoItem----" + oWSoItem);
                    com.model.OrdersInqGetSOItem dSoItem = new com.model.OrdersInqGetSOItem();
                    com.model.OrdersInqGetSOItem[] dASoItem = oWSoItem.getD().getResults();
                    if (dASoItem.length > 0) {
                        for (int j = 0; j < dASoItem.length; j++) {
                            dSoItem = dASoItem[j];
                            reasonForRej = dSoItem.getSalesDocumentRjcnReason();
                            confQuantity = dSoItem.getConfdDelivQtyInOrderQtyUnit();
                            soItemCategory = dSoItem.getSalesOrderItemCategory();
                            soItem = dSoItem.getSalesOrderItem();
                            material = dSoItem.getMaterial();
                            delStatusItem = dSoItem.getTotalDeliveryStatus();
                            System.out.println("-----reasonForRej---" + reasonForRej);
                            System.out.println("-----creditStatus---" + creditStatus);
                            System.out.println("-----soItemCategory---" + soItemCategory);
                            System.out.println("-----soItem---" + soItem);
                            String cStat = "BC";
                            bCredStatus = cStat.contains(creditStatus);
                            System.out.println("-----bCredStatus---" + bCredStatus);

                            if (!reasonForRej.isEmpty()) {
                                ordstat = "99";
                                dSoItem.setOrdstat(ordstat);
                                url_rejText = "CxfNonSpringSimpleServlet.host + /sap/opu/odata/sap/YY1_SALESDOCUMENTRJCNREA_CDS/YY1_SALESDOCUMENTRJCNREA?$format=json&$select=SalesDocumentRjcnReason,SalesDocumentRjcnReasonName&$filter=" + URLEncoder.encode("SalesDocumentRjcnReason eq '" + reasonForRej + "'", "UTF-8");
                                data_rejText = (String) this.getData(url_rejText, authoriz);
                                System.out.println("---data_rejText---" + data_rejText);
                                oWRejText = gson.fromJson(data_rejText, com.model.Zb2BOrderInqGetSoItemWrapper.class);
                                com.model.OrdersInqGetSOItem dRejText = new com.model.OrdersInqGetSOItem();
                                com.model.OrdersInqGetSOItem[] dARejText = oWRejText.getD().getResults();
                                System.out.println("---oWRejText---" + oWRejText);
                                if (dARejText.length > 0) {
                                    for (int k = 0; k < dARejText.length; k++) {
                                        dRejText = dARejText[k];
                                        ordstat_text = dRejText.getSalesDocumentRjcnReasonName();
                                        dSoItem.setOrdstat_text(ordstat_text);
                                        break;
                                    }
                                }
                                continue;
                            } else if (bCredStatus == true) {
                                ordstat = "02";
                                dSoItem.setOrdstat(ordstat);
                                ordstat_text = "Order under review";
                                dSoItem.setOrdstat_text(ordstat_text);
                                continue;
                            } else if (confQuantity.isEmpty()) {
                                ordstat = "05";
                                ordstat_text = "B/O";
                                dSoItem.setOrdstat(ordstat);
                                dSoItem.setOrdstat_text(ordstat_text);
                                url_dNum = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/YY1_DELIVERYDOC_CDS/YY1_DeliveryDoc?$format=json&$select=DeliveryDocument,ActualGoodsMovementDate,OverallGoodsMovementStatus,ReferenceSDDocument,ReferenceSDDocumentItem&$filter=" + URLEncoder.encode("ReferenceSDDocumentItem  eq '" + soItem + "' and ReferenceSDDocument eq '" + salesOrder + "'", "UTF-8");
                                data_dNum = (String) this.getData(url_dNum, authoriz);
                                System.out.println("----data_dNum----" + data_dNum);
                                oWDelNum = gson.fromJson(data_dNum, com.model.Zb2BOrderInqGetPOWrapper.class);
                                System.out.println("-----oWDelNum---" + oWDelNum);
                                com.model.OrderInqPO dDelNum = new com.model.OrderInqPO();
                                com.model.OrderInqPO[] dADelNum = oWDelNum.getD().getResults();
                                if (dADelNum.length > 0) {
                                    for (int m = 0; m < dADelNum.length; m++) {
                                        dDelNum = dADelNum[m];
                                        dSoItem.setActualGoodsMovementDate(dDelNum.getActualGoodsMovementDate());
                                        break;
                                    }
                                }
                                continue;
                            }
                            switch (soItemCategory) {
                                case "TAS":
                                case "ZTAS":
                                    data_poStat = (String) this.getPoStatus(salesOrder, soItem, authoriz);
                                    System.out.println("----data_poStat----" + data_poStat);
                                    oWPoStatus = gson.fromJson(data_poStat, com.model.Zb2BOrderInqGetPOWrapper.class);
                                    com.model.OrderInqPO dPoStat = new com.model.OrderInqPO();
                                    com.model.OrderInqPO[] dAPoStat = oWPoStatus.getD().getResults();
                                    System.out.println("-----oWPoStatus---" + oWPoStatus);
                                    if (dAPoStat.length > 0) {
                                        for (int p = 0; p < dAPoStat.length; p++) {
                                            dPoStat = dAPoStat[p];
                                            dSoItem.setActualGoodsMovementDate(dPoStat.getActualGoodsMovementDate());
                                            dSoItem.setOrdstat(dPoStat.getOrdstat());
                                            dSoItem.setOrdstat_text(dPoStat.getOrdstat_text());
                                            dSoItem.setScheduleLineDeliveryDate(dSoItem.getScheduleLineDeliveryDate());
                                            break;
                                        }
                                    }
                                    break;
                                case "TAB":
                                case "ZTAB":
                                    if (overallDelStatus.equals("C")) {
                                        if (delStatusItem.equals("C")) {
                                            ordstat = "00";
                                            ordstat_text = "Shipped";
                                            dSoItem.setOrdstat(ordstat);
                                            dSoItem.setOrdstat_text(ordstat_text);
                                            data_delStat = (String) this.getDelStatu(salesOrder, soItem, delStatusItem, authoriz);
                                            System.out.println("----data_delStat----" + data_delStat);
                                            oWTrack = gson.fromJson(data_poStat, com.model.Zb2BOrderInqGetPOWrapper.class);
                                            com.model.OrderInqPO dDelStat = new com.model.OrderInqPO();
                                            com.model.OrderInqPO[] dADelStat = oWTrack.getD().getResults();
                                            System.out.println("-----oWTrack---" + oWTrack);
                                            if (dADelStat.length > 0) {
                                                for (int p = 0; p < dADelStat.length; p++) {
                                                    dDelStat = dADelStat[p];
                                                    dSoItem.setOrdstat(dDelStat.getOrdstat());
                                                    dSoItem.setOrdstat_text(dDelStat.getOrdstat_text());
                                                    dDelStat.setActualGoodsMovementDate("");
                                                    dDelStat.setBatch("");
                                                    dDelStat.setConfQuantityInSU("");
                                                    dDelStat.setDeliveryDocument("");
                                                    dDelStat.setMaterial("");
                                                    dDelStat.setOrdstat("");
                                                    dDelStat.setOrdstat_text("");
                                                    dDelStat.setPurchaseOrder("");
                                                    dDelStat.setReleaseIsNotCompleted("");
                                                    dDelStat.setReqDeliveryDate("");
                                                    dDelStat.setSalesOrder("");
                                                    dDelStat.setSalesOrderItem("");
                                                    dDelStat.setSalesUnit("");
                                                    dDelStat.setScheduleLineDeliveryDate("");
                                                    dDelStat.setScheduleLineOrderQuantity("");
                                                    dDelStat.setShippingPoint("");
                                                    oFinal.setTrack(oWTrack.getD().getResults());
                                                    break;

                                                }
                                            }

                                        } else {
                                            ordstat = "24";
                                            ordstat_text = "Not Shipped";
                                            dSoItem.setOrdstat(ordstat);
                                            dSoItem.setOrdstat_text(ordstat_text);
                                            data_poStat = (String) this.getPoStatusTwo(salesOrder, soItem, authoriz);
                                            System.out.println("----data_poStat----" + data_poStat);
                                            oWPoStatus = gson.fromJson(data_poStat, com.model.Zb2BOrderInqGetPOWrapper.class);
                                            com.model.OrderInqPO dPoStatTwo = new com.model.OrderInqPO();
                                            com.model.OrderInqPO[] dAPoStatTwo = oWDelNum.getD().getResults();
                                            System.out.println("-----oWPoStatus---" + oWPoStatus);
                                            if (dAPoStatTwo.length > 0) {
                                                for (int p = 0; p < dAPoStatTwo.length; p++) {
                                                    dPoStatTwo = dAPoStatTwo[p];
                                                    dSoItem.setActualGoodsMovementDate(dPoStatTwo.getActualGoodsMovementDate());
                                                    dSoItem.setOrdstat(dPoStatTwo.getOrdstat());
                                                    dSoItem.setOrdstat_text(dPoStatTwo.getOrdstat_text());
                                                    dSoItem.setScheduleLineDeliveryDate(dPoStatTwo.getScheduleLineDeliveryDate());
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    break;
                                default:
//                                    data_poStat = (String) this.getPoStatus(salesOrder, soItem, authoriz);
//                                    System.out.println("----data_poStat----" + data_poStat);
                                    data_delStat = (String) this.getDelStatu(salesOrder, soItem, delStatusItem, authoriz);
                                    System.out.println("----data_delStat----" + data_delStat);
                                    oWTrack = gson.fromJson(data_delStat, com.model.Zb2BOrderInqGetPOWrapper.class);
                                    com.model.OrderInqPO dDelStat = new com.model.OrderInqPO();
                                    com.model.OrderInqPO[] dADelStat = oWTrack.getD().getResults();
                                    System.out.println("-----oWTrack---" + oWTrack);
                                    if (dADelStat.length > 0) {
                                        for (int p = 0; p < dADelStat.length; p++) {
                                            dDelStat = dADelStat[p];
                                            dSoItem.setOrdstat(dDelStat.getOrdstat());
                                            dSoItem.setOrdstat_text(dDelStat.getOrdstat_text());
                                            dDelStat.setActualGoodsMovementDate("");
                                            dDelStat.setBatch("");
                                            dDelStat.setConfQuantityInSU("");
                                            dDelStat.setDeliveryDocument("");
                                            dDelStat.setMaterial("");
                                            dDelStat.setOrdstat("");
                                            dDelStat.setOrdstat_text("");
                                            dDelStat.setPurchaseOrder("");
                                            dDelStat.setReleaseIsNotCompleted("");
                                            dDelStat.setReqDeliveryDate("");
                                            dDelStat.setSalesOrder("");
                                            dDelStat.setSalesOrderItem("");
                                            dDelStat.setSalesUnit("");
                                            dDelStat.setScheduleLineDeliveryDate("");
                                            dDelStat.setScheduleLineOrderQuantity("");
                                            dDelStat.setShippingPoint("");
                                            oFinal.setTrack(oWTrack.getD().getResults());
                                            break;
                                        }
                                    }
                                    break;
                            }
                        }
                    }
                }
            } else {
                o_result = "001";
            }
        }
        if (o_result.equals("001")) {
            oFinal.setO_RESULT(o_result);
        } else {
            System.out.println("-----O_result----" + o_result);
            oFinal.setO_RESULT(o_result);
            oFinal.setOrderList(oWSoItem.getD().getResults());
            oFinal.setAddress(oWShipAddress.getD().getResults());
            System.out.println("-----oFInal----" + oFinal);
        }

        return oFinal;
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

    public Object getShipAddress(String salesOrder, String authoriz) throws ClientProtocolException, IOException {
        String result = "";
        com.model.Zb2BOrderInqGetSOWrapper oWShipParty = new com.model.Zb2BOrderInqGetSOWrapper();
        com.model.Zb2BOrderInqGetSOWrapper oWBPartner = new com.model.Zb2BOrderInqGetSOWrapper();
        com.model.Zb2BOrderInqGetSOWrapper oWAddress = new com.model.Zb2BOrderInqGetSOWrapper();
        Gson gson = new Gson();
        String url_bPartner = "";
        String data_bPartner = "";
        String url_Address = "";
        String data_Address = "";
        String url_shipToParty = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/API_SALES_ORDER_SRV/A_SalesOrderHeaderPartner?$format=json&$select=SalesOrder,PartnerFunction,Customer&$filter=" + URLEncoder.encode("SalesOrder eq '" + salesOrder + "' and PartnerFunction eq 'SH'", "UTF-8");
        System.out.println("----url_shipToParty-----" + url_shipToParty);
        String data_shipToParty = (String) getData(url_shipToParty, authoriz);
        System.out.println("----data_shipToParty-----" + data_shipToParty);
        oWShipParty = gson.fromJson(data_shipToParty, com.model.Zb2BOrderInqGetSOWrapper.class);
        System.out.println("----oWShipParty----" + oWShipParty);
        com.model.OrdersInqGetSO dSp = new com.model.OrdersInqGetSO();
        com.model.OrdersInqGetSO[] dASp = oWShipParty.getD().getResults();
        System.out.println("-----dASp---length---" + dASp);
        if (dASp.length > 0) {
            for (int i = 0; i < dASp.length; i++) {
                dSp = dASp[i];
                String customer = dSp.getCustomer();
                System.out.println("---customer--" + customer);
                url_bPartner = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_BusinessPartner?$format=json&$select=BusinessPartner,Customer&$filter=" + URLEncoder.encode("Customer eq '" + customer + "'", "UTF-8");
                data_bPartner = (String) this.getData(url_bPartner, authoriz);
                System.out.println("---data_bPartner----" + data_bPartner);
                oWBPartner = gson.fromJson(data_bPartner, com.model.Zb2BOrderInqGetSOWrapper.class);
                System.out.println("----oWBPartner----" + oWBPartner);
                com.model.OrdersInqGetSO dBp = new com.model.OrdersInqGetSO();
                com.model.OrdersInqGetSO[] dABp = oWBPartner.getD().getResults();
                System.out.println("-----dABp---length---" + dABp);
                if (dABp.length > 0) {
                    for (int j = 0; j < dABp.length; j++) {
                        dBp = dABp[j];
                        String businessPartner = dBp.getBusinessPartner();
                        System.out.println("----businessPartner---" + businessPartner);
                        url_Address = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_BusinessPartnerAddress?$format=json&$select=BusinessPartner,FullName,CityName,Region,StreetName,PostalCode&$filter=" + URLEncoder.encode("BusinessPartner  eq '" + businessPartner + "'", "UTF-8");
                        data_Address = (String) this.getData(url_Address, authoriz);
                        System.out.println("---data_Address----" + data_Address);
                        oWAddress = gson.fromJson(data_Address, com.model.Zb2BOrderInqGetSOWrapper.class);
                        com.model.OrdersInqGetSO dAdr = new com.model.OrdersInqGetSO();
                        com.model.OrdersInqGetSO[] dAadr = oWAddress.getD().getResults();
                        System.out.println("-----dAadr---length---" + dAadr);
                        if (dAadr.length > 0) {
                            for (int k = 0; k < dAadr.length; k++) {
                                dAdr = dAadr[k];
                                dAdr.setShipToParty(customer);
                                dAadr[k] = dAdr;
                                oWAddress.getD().setResults(dAadr);
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            }
        }
        return oWAddress;
    }

    public Object getPoStatus(String salesOrder, String salesOrderItem, String authoriz) throws ClientProtocolException, IOException {
        String result = "";
        String url_dNum = "";
        String url_PoRelaseStat = "";
        String url_gDate = "";
        String data_PoRelaseStat = "";
        String data_dNum = "";
        String data_gDate = "";
        String ordStat = "";
        String ordStat_Text = "";
        String url_recQty = "";
        String data_recQty = "";
        Gson gson = new Gson();
        com.model.Zb2BOrderInqGetPOWrapper oWDelNum = new com.model.Zb2BOrderInqGetPOWrapper();
        com.model.Zb2BOrderInqGetPOWrapper oWGdate = new com.model.Zb2BOrderInqGetPOWrapper();
        com.model.Zb2BOrderInqGetPOWrapper oWPoNum = new com.model.Zb2BOrderInqGetPOWrapper();
        com.model.Zb2BOrderInqGetPOWrapper oWPoRelStat = new com.model.Zb2BOrderInqGetPOWrapper();
        com.model.Zb2BOrderInqGetPOWrapper oWReQty = new com.model.Zb2BOrderInqGetPOWrapper();
        String deliveryNum = "";
        String poNum = "";
        String url_poNum = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/API_PURCHASEORDER_PROCESS_SRV/A_PurOrdAccountAssignment?$format=json&$select=PurchaseOrder,PurchaseOrderItem,SalesOrder,SalesOrderItem&$filter=" + URLEncoder.encode("SalesOrder  eq '" + salesOrder + "' and SalesOrderItem eq '" + salesOrderItem + "'", "UTF-8");
        String data_PoNum = (String) this.getData(url_poNum, authoriz);
        System.out.println("-----data_PoNum---" + data_PoNum);
        oWPoNum = gson.fromJson(data_PoNum, com.model.Zb2BOrderInqGetPOWrapper.class);
        com.model.OrderInqPO dPoNum = new com.model.OrderInqPO();
        com.model.OrderInqPO[] dAPoNum = oWPoNum.getD().getResults();
        if (dAPoNum.length > 0) {
            for (int i = 0; i < dAPoNum.length; i++) {
                dPoNum = dAPoNum[i];
                poNum = dPoNum.getPurchaseOrder();
                System.out.println("---poNum---" + poNum);
                url_PoRelaseStat = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/API_PURCHASEORDER_PROCESS_SRV/A_PurchaseOrder?$format=json&$select=PurchaseOrder,ReleaseIsNotCompleted&$filter=" + URLEncoder.encode("PurchaseOrder  eq '" + poNum + "'", "UTF-8");
                data_PoRelaseStat = (String) this.getData(url_PoRelaseStat, authoriz);
                oWPoRelStat = gson.fromJson(data_PoRelaseStat, com.model.Zb2BOrderInqGetPOWrapper.class);
                System.out.println("-----data_PoRelaseStat---" + data_PoRelaseStat);
                com.model.OrderInqPO dPoRelStat = new com.model.OrderInqPO();
                com.model.OrderInqPO[] dAPoRelStat = oWPoRelStat.getD().getResults();
                if (dAPoRelStat.length > 0) {
                    for (int j = 0; j < dAPoRelStat.length; j++) {
                        dPoRelStat = dAPoRelStat[j];
                        String relStat = dPoRelStat.getReleaseIsNotCompleted();
                        System.out.println("-----relStat---" + relStat);
                        if (relStat.equals("false")) {
                            url_recQty = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/API_PURCHASEORDER_PROCESS_SRV/A_PurchaseOrderScheduleLine?$format=json&$select=PurchasingDocument,ScheduleLineDeliveryDate,ScheduleLineOrderQuantity&$filter=" + URLEncoder.encode("PurchasingDocument  eq '" + poNum + "'", "UTF-8");
                            data_recQty = (String) this.getData(url_recQty, authoriz);
                            oWReQty = gson.fromJson(data_recQty, com.model.Zb2BOrderInqGetPOWrapper.class);
                            System.out.println("-----oWReQty---" + oWReQty);
                            com.model.OrderInqPO dReQty = new com.model.OrderInqPO();
                            com.model.OrderInqPO[] dAReQty = oWReQty.getD().getResults();
                            if (dAReQty.length > 0) {
                                for (int k = 0; k < dAReQty.length; k++) {
                                    dReQty = dAReQty[k];
                                    String recQty = dReQty.getScheduleLineOrderQuantity();
                                    System.out.println("----recQty----" + recQty);
                                    if (!recQty.equals("0")) {
                                        ordStat = "13";
                                        ordStat_Text = "Shipped by vendor";
                                        url_dNum = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/YY1_DELIVERYDOC_CDS/YY1_DeliveryDoc?$format=json&$select=DeliveryDocument,ActualGoodsMovementDate,OverallGoodsMovementStatus,ReferenceSDDocument,ReferenceSDDocumentItem&$filter=" + URLEncoder.encode("ReferenceSDDocumentItem  eq '" + salesOrderItem + "' and ReferenceSDDocument eq '" + salesOrder + "'", "UTF-8");
                                        data_dNum = (String) this.getData(url_dNum, authoriz);
                                        System.out.println("----data_dNum----" + data_dNum);
                                        oWDelNum = gson.fromJson(data_dNum, com.model.Zb2BOrderInqGetPOWrapper.class);
                                        System.out.println("-----oWDelNum---" + oWDelNum);
                                        com.model.OrderInqPO dDelNum = new com.model.OrderInqPO();
                                        com.model.OrderInqPO[] dADelNum = oWDelNum.getD().getResults();
                                        if (dADelNum.length > 0) {
                                            for (int m = 0; m < dADelNum.length; m++) {
                                                dDelNum = dADelNum[m];
                                                dPoNum.setActualGoodsMovementDate(dDelNum.getActualGoodsMovementDate());
                                                break;
                                            }
                                        }
                                    } else {
                                        ordStat = "12";
                                        ordStat_Text = "Factory Direct";
                                        url_dNum = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/YY1_DELIVERYDOC_CDS/YY1_DeliveryDoc?$format=json&$select=DeliveryDocument,ActualGoodsMovementDate,OverallGoodsMovementStatus,ReferenceSDDocument,ReferenceSDDocumentItem&$filter=" + URLEncoder.encode("ReferenceSDDocumentItem  eq '" + salesOrderItem + "' and ReferenceSDDocument eq '" + salesOrder + "'", "UTF-8");
                                        data_dNum = (String) this.getData(url_dNum, authoriz);
                                        System.out.println("----data_dNum----" + data_dNum);
                                        oWDelNum = gson.fromJson(data_dNum, com.model.Zb2BOrderInqGetPOWrapper.class);
                                        System.out.println("-----oWDelNum---" + oWDelNum);
                                        com.model.OrderInqPO dDelNum = new com.model.OrderInqPO();
                                        com.model.OrderInqPO[] dADelNum = oWDelNum.getD().getResults();
                                        if (dADelNum.length > 0) {
                                            for (int m = 0; m < dADelNum.length; m++) {
                                                dDelNum = dADelNum[m];
                                                dPoNum.setActualGoodsMovementDate(dDelNum.getActualGoodsMovementDate());
                                                break;
                                            }
                                        } else {
                                            dPoNum.setActualGoodsMovementDate("");
                                            dPoNum.setScheduleLineDeliveryDate("");
                                        }
                                        dPoNum.setActualGoodsMovementDate("");
                                        dPoNum.setScheduleLineDeliveryDate("");

                                        break;
                                    }
                                    break;
                                }
                            }

                        } else {
                            ordStat = "11";
                            ordStat_Text = "Factory Direct";
                            dPoNum.setActualGoodsMovementDate("");
                            dPoNum.setScheduleLineDeliveryDate("");
                            break;
                        }
                        break;
                    }
                }
                break;
            }
        } else {
            ordStat = "10";
            ordStat_Text = "Factory Direct";
        }
        dPoNum.setOrdstat(ordStat);
        dPoNum.setOrdstat_text(ordStat_Text);
        System.out.println("---dPoNum-----" + dPoNum);
        return dPoNum.toString();
    }

    public Object getPoStatusTwo(String salesOrder, String salesOrderItem, String authoriz) throws ClientProtocolException, IOException {
        String result = "";
        String url_dNum = "";
        String url_PoRelaseStat = "";
        String url_gDate = "";
        String data_PoRelaseStat = "";
        String data_dNum = "";
        String data_gDate = "";
        String ordStat = "";
        String ordStat_Text = "";
        String url_recQty = "";
        String data_recQty = "";
        Gson gson = new Gson();
        com.model.Zb2BOrderInqGetPOWrapper oWDelNum = new com.model.Zb2BOrderInqGetPOWrapper();
        com.model.Zb2BOrderInqGetPOWrapper oWGdate = new com.model.Zb2BOrderInqGetPOWrapper();
        com.model.Zb2BOrderInqGetPOWrapper oWPoNum = new com.model.Zb2BOrderInqGetPOWrapper();
        com.model.Zb2BOrderInqGetPOWrapper oWPoRelStat = new com.model.Zb2BOrderInqGetPOWrapper();
        com.model.Zb2BOrderInqGetPOWrapper oWReQty = new com.model.Zb2BOrderInqGetPOWrapper();
        String deliveryNum = "";
        String poNum = "";
        String url_poNum = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/API_PURCHASEORDER_PROCESS_SRV/A_PurOrdAccountAssignment?$format=json&$select=PurchaseOrder,PurchaseOrderItem,SalesOrder,SalesOrderItem&$filter=" + URLEncoder.encode("SalesOrder  eq '" + salesOrder + "' and SalesOrderItem eq '" + salesOrderItem + "'", "UTF-8");
        String data_PoNum = (String) this.getData(url_poNum, authoriz);
        System.out.println("-----data_PoNum---" + data_PoNum);
        oWPoNum = gson.fromJson(data_PoNum, com.model.Zb2BOrderInqGetPOWrapper.class);
        com.model.OrderInqPO dPoNum = new com.model.OrderInqPO();
        com.model.OrderInqPO[] dAPoNum = oWPoNum.getD().getResults();
        if (dAPoNum.length > 0) {
            for (int i = 0; i < dAPoNum.length; i++) {
                dPoNum = dAPoNum[i];
                poNum = dPoNum.getPurchaseOrder();
                System.out.println("---poNum---" + poNum);
                url_PoRelaseStat = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/API_PURCHASEORDER_PROCESS_SRV/A_PurchaseOrder?$format=json&$select=PurchaseOrder,ReleaseIsNotCompleted&$filter=" + URLEncoder.encode("PurchaseOrder  eq '" + poNum + "'", "UTF-8");
                data_PoRelaseStat = (String) this.getData(url_PoRelaseStat, authoriz);
                oWPoRelStat = gson.fromJson(data_PoRelaseStat, com.model.Zb2BOrderInqGetPOWrapper.class);
                System.out.println("-----data_PoRelaseStat---" + data_PoRelaseStat);
                com.model.OrderInqPO dPoRelStat = new com.model.OrderInqPO();
                com.model.OrderInqPO[] dAPoRelStat = oWPoRelStat.getD().getResults();
                if (dAPoRelStat.length > 0) {
                    for (int j = 0; j < dAPoRelStat.length; j++) {
                        dPoRelStat = dAPoRelStat[j];
                        String relStat = dPoRelStat.getReleaseIsNotCompleted();
                        System.out.println("-----relStat---" + relStat);
                        if (relStat.equals("false")) {
                            url_recQty = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/API_PURCHASEORDER_PROCESS_SRV/A_PurchaseOrderScheduleLine?$format=json&$select=PurchasingDocument,ScheduleLineDeliveryDate,ScheduleLineOrderQuantity&$filter=" + URLEncoder.encode("PurchasingDocument  eq '" + poNum + "'", "UTF-8");
                            data_recQty = (String) this.getData(url_recQty, authoriz);
                            oWReQty = gson.fromJson(data_recQty, com.model.Zb2BOrderInqGetPOWrapper.class);
                            System.out.println("-----oWReQty---" + oWReQty);
                            com.model.OrderInqPO dReQty = new com.model.OrderInqPO();
                            com.model.OrderInqPO[] dAReQty = oWReQty.getD().getResults();
                            if (dAReQty.length > 0) {
                                for (int k = 0; k < dAReQty.length; k++) {
                                    dReQty = dAReQty[k];
                                    String recQty = dReQty.getScheduleLineOrderQuantity();
                                    System.out.println("----recQty----" + recQty);
                                    if (!recQty.equals("0")) {
                                        ordStat = "13";
                                        ordStat_Text = "Ready to ship";
                                        url_dNum = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/YY1_DELIVERYDOC_CDS/YY1_DeliveryDoc?$format=json&$select=DeliveryDocument,ActualGoodsMovementDate,OverallGoodsMovementStatus,ReferenceSDDocument,ReferenceSDDocumentItem&$filter=" + URLEncoder.encode("ReferenceSDDocumentItem  eq '" + salesOrderItem + "' and ReferenceSDDocument eq '" + salesOrder + "'", "UTF-8");
                                        data_dNum = (String) this.getData(url_dNum, authoriz);
                                        System.out.println("----data_dNum----" + data_dNum);
                                        oWDelNum = gson.fromJson(data_dNum, com.model.Zb2BOrderInqGetPOWrapper.class);
                                        System.out.println("-----oWDelNum---" + oWDelNum);
                                        com.model.OrderInqPO dDelNum = new com.model.OrderInqPO();
                                        com.model.OrderInqPO[] dADelNum = oWDelNum.getD().getResults();
                                        if (dADelNum.length > 0) {
                                            for (int m = 0; m < dADelNum.length; m++) {
                                                dDelNum = dADelNum[m];
                                                dPoNum.setActualGoodsMovementDate(dDelNum.getActualGoodsMovementDate());
                                                break;
                                            }
                                        }
                                    } else {
                                        ordStat = "12";
                                        ordStat_Text = "B/O";
                                        url_dNum = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/YY1_DELIVERYDOC_CDS/YY1_DeliveryDoc?$format=json&$select=DeliveryDocument,ActualGoodsMovementDate,OverallGoodsMovementStatus,ReferenceSDDocument,ReferenceSDDocumentItem&$filter=" + URLEncoder.encode("ReferenceSDDocumentItem  eq '" + salesOrderItem + "' and ReferenceSDDocument eq '" + salesOrder + "'", "UTF-8");
                                        data_dNum = (String) this.getData(url_dNum, authoriz);
                                        System.out.println("----data_dNum----" + data_dNum);
                                        oWDelNum = gson.fromJson(data_dNum, com.model.Zb2BOrderInqGetPOWrapper.class);
                                        System.out.println("-----oWDelNum---" + oWDelNum);
                                        com.model.OrderInqPO dDelNum = new com.model.OrderInqPO();
                                        com.model.OrderInqPO[] dADelNum = oWDelNum.getD().getResults();
                                        if (dADelNum.length > 0) {
                                            for (int m = 0; m < dADelNum.length; m++) {
                                                dDelNum = dADelNum[m];
                                                dPoNum.setActualGoodsMovementDate(dDelNum.getActualGoodsMovementDate());
                                                break;
                                            }
                                        } else {
                                            dPoNum.setActualGoodsMovementDate("");
                                            dPoNum.setScheduleLineDeliveryDate("");
                                        }
                                        dPoNum.setActualGoodsMovementDate("");
                                        dPoNum.setScheduleLineDeliveryDate("");

                                        break;
                                    }
                                    break;
                                }
                            }

                        } else {
                            ordStat = "11";
                            ordStat_Text = "B/O - no ETS";
                            dPoNum.setActualGoodsMovementDate("");
                            dPoNum.setScheduleLineDeliveryDate("");
                            break;
                        }
                        break;
                    }
                }
                break;
            }
        } else {
            ordStat = "10";
            ordStat_Text = "B/O - no ETS";
        }
        dPoNum.setOrdstat(ordStat);
        dPoNum.setOrdstat_text(ordStat_Text);
        System.out.println("---dPoNum-----" + dPoNum);
        return dPoNum.toString();
    }

    public Object getDelStatu(String salesOrder, String salesOrderItem, String delStatusItem, String authoriz) throws ClientProtocolException, IOException {
        String result = "";
        com.model.Zb2BOrderInqGetPOWrapper oWDelNum = new com.model.Zb2BOrderInqGetPOWrapper();
        com.model.Zb2BOrderInqGetPOWrapper oWTrackNum = new com.model.Zb2BOrderInqGetPOWrapper();
        Gson gson = new Gson();
        String url_delNum = "";
        String data_delNum = "";
        String url_TrackNum = "";
        String data_TrackNum = "";
        String ordStat_Text = "";
        String ordStat = "";
        url_delNum = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/YY1_DELIVERYDOC_CDS/YY1_DeliveryDoc?$format=json&$select=DeliveryDocument,ActualGoodsMovementDate,OverallGoodsMovementStatus,ReferenceSDDocument,ReferenceSDDocumentItem&$filter=" + URLEncoder.encode("ReferenceSDDocumentItem  eq '" + salesOrderItem + "' and ReferenceSDDocument eq '" + salesOrder + "'", "UTF-8");
        System.out.println("----url_delNum-----" + url_delNum);
        data_delNum = (String) getData(url_delNum, authoriz);
        System.out.println("----data_delNum-----" + data_delNum);
        oWDelNum = gson.fromJson(data_delNum, com.model.Zb2BOrderInqGetPOWrapper.class);
        System.out.println("----oWDelNum----" + oWDelNum);
        com.model.OrderInqPO dDelNum = new com.model.OrderInqPO();
        com.model.OrderInqPO[] dADelNum = oWDelNum.getD().getResults();
        System.out.println("-----dADelNum---length---" + dADelNum);
        if (dADelNum.length > 0) {
            for (int i = 0; i < dADelNum.length; i++) {
                dDelNum = dADelNum[i];
                String delNum = dDelNum.getDeliveryDocument();
                url_TrackNum = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/YY1_SHIPING_UNIT_CUSTOM_CDS/YY1_Shiping_unit_custom?$format=json&$filter=" + URLEncoder.encode("DeliveryNumber  eq '" + delNum + "'", "UTF-8");
                data_TrackNum = (String) this.getData(url_TrackNum, authoriz);
                oWTrackNum = gson.fromJson(data_TrackNum, com.model.Zb2BOrderInqGetPOWrapper.class);
                System.out.println("---oWTrackNum----" + oWTrackNum);

                break;
            }
        }
        return data_TrackNum;
    }

}
