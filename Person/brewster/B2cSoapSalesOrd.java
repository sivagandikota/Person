/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brewster;


import java.util.ArrayList;
import java.util.Map;
import javax.annotation.Resource;
import javax.jws.WebService;
import javax.naming.AuthenticationException;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.WebServiceRef;
import javax.xml.ws.handler.MessageContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.gson.Gson;
import com.model.orderrequest.BusinessDocumentMessageHeader;
import com.model.orderrequest.BusinessDocumentMessageHeaderParty;
import com.model.orderrequest.OrderRequestIn;
import com.model.orderrequest.Party;
import com.model.orderrequest.PaymentCard;
import com.model.orderrequest.SalesOrder;
import com.model.orderrequest.SalesOrderItem;
import com.model.orderrequest.Text;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 *
 * @author Sivag
 */
public class B2cSoapSalesOrd implements B2cSoapSalesOrdInterface {

//    @WebServiceRef(wsdlLocation = "classpath:ORDERREQUEST_IN.wsdl")
//    com.model.orderrequest.Service service;

    @Resource
    public WebServiceContext wsctx;
    Logger logger = LoggerFactory.getLogger(B2cSoapSalesOrd.class);
    public String token = "";

    public com.model.orderrequest.SalesOrderMessage salesOrderBulkRequestIn(
            String shipping, com.model.orderrequest.Amount amount, com.model.orderrequest.Amount taxAmount,
            com.model.orderrequest.Amount discountAmount, com.model.orderrequest.Amount totalAmount,
            String poNumber, com.model.orderrequest.Address address, String phone, String email, String site,
            String soldTo, String coupon, String shipToStore, String block, com.model.orderrequest.Address payeeAddress,
            List<Text> comments, List<SalesOrderItem> orderItems, PaymentCard card) throws Exception {

        MessageContext mctx = wsctx.getMessageContext();
        Map http_headers = (Map) mctx.get(MessageContext.HTTP_REQUEST_HEADERS);
        ArrayList authList = (ArrayList) http_headers.get("Authorization");
        com.model.orderrequest.SalesOrderMessage salesOrderRequest = new com.model.orderrequest.SalesOrderMessage();
        String authoriz = "";
        if (authList != null) {
            //get password
            authoriz = authList.get(0).toString();
        }
        if (authList == null) {
            throw new AuthenticationException("No Authorization Header ");
        }
//BP-100999999-Sales order-493
//BP-100131313-Sales order-494
//BP-100777777-Sales order-496
        String[] poArray = poNumber.split("-");
        String custRepComm = "";
        if (null != poArray) {
            poNumber = poArray[0];
            custRepComm = poArray[1];
        }
//        boolean allSamples=true;
//        Iterator iter=orderItems.iterator();
//        while(iter.hasNext()){
//            SalesOrderItem item = (SalesOrderItem) iter.next();
//            if(item){
//            }
//        }

        if (address.getCountry().equals("CA") && address.getRegion().equals("PQ")) {
            address.setRegion("QC");
            address.setCorrespondenceLanguage("F");
        }
        if (address.getCountry().equals("CA") && address.getPostalCode().length() != 6) {
            address.setPostalCode("      ");
        }
        if (payeeAddress.getCountry().equals("CA") && payeeAddress.getRegion().equals("PQ")) {
            payeeAddress.setRegion("QC");
            payeeAddress.setCorrespondenceLanguage("F");
        }
        if (payeeAddress.getCountry().equals("CA") && payeeAddress.getPostalCode().length() != 6) {
            payeeAddress.setPostalCode("      ");
        }
        String customer = "";
//     Wallpops = 1 --> 999999
//     Lucky Day = 3 -->  131313
//     Brewster = 9 -->777777
//     Promotional = 6--> 999999

        switch (site) {
            case "1":
                customer = "100999999";
                break;
            case "3":
                customer = "100131313";
                break;
            case "9":
                customer = "100777777";
                break;
            case "6":
                customer = "100999999";
                break;

        }

        String url = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_BusinessPartnerAddress?$format=json&$filter=BusinessPartner+eq+'" + customer + "'";
        String data = (String) new com.Zb2BCustInq().getData(url, authoriz);
        com.sap.apibhub.sdk.api_business_partner.model.Wrapper9 aWrap = new com.sap.apibhub.sdk.api_business_partner.model.Wrapper9();
        Gson gson = new Gson();
        aWrap = gson.fromJson(data, aWrap.getClass());

        //if customer rep exists
        com.Zb2BCustInqWrapper custSalesRep=null;
        if(custRepComm.length()>0){
        url = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_CustomerSalesArea?$format=json&$select=Customer,SalesOrganization,DistributionChannel,Division,SalesOffice,SalesGroup&$expand=to_SalesAreaTax&$filter=Customer+eq+'" + custRepComm + "'";
        data = (String) new com.Zb2BCustInq().getData(url, authoriz);
        custSalesRep = gson.fromJson(data, com.Zb2BCustInqWrapper.class);
        }

        url = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_CustomerSalesArea?$format=json&$select=Customer,SalesOrganization,DistributionChannel,Division,ShippingCondition,CustomerPaymentTerms,DeliveryIsBlockedForCustomer,OrderIsBlockedForCustomer,Currency&$expand=to_SalesAreaTax&$filter=Customer+eq+'" + customer + "'";
        data = (String) new com.Zb2BCustInq().getData(url, authoriz);
        com.Zb2BCustInqWrapper custSales = gson.fromJson(data, com.Zb2BCustInqWrapper.class);
        //getSalesOrder 493
        XMLGregorianCalendar date2
                = DatatypeFactory.newInstance().newXMLGregorianCalendar();
        BusinessDocumentMessageHeader messageHeader = new BusinessDocumentMessageHeader();
        BusinessDocumentMessageHeaderParty senderParty = new BusinessDocumentMessageHeaderParty();
        BusinessDocumentMessageHeaderParty receipientParty = new BusinessDocumentMessageHeaderParty();
        senderParty.setInternalID(customer);
        receipientParty.setInternalID(customer);
        messageHeader.setCreationDateTime(date2);
        messageHeader.setSenderBusinessSystemID("BHF");
        messageHeader.setSenderParty(senderParty);
        messageHeader.getRecipientParty().add(receipientParty);

        salesOrderRequest.setMessageHeader(messageHeader);

        SalesOrder salesOrder = new SalesOrder();
//        salesOrder.
        salesOrder.setSalesDocumentType("TA");
        salesOrder.setRequestedDeliveryDate(date2);
        salesOrder.setPurchaseOrderID(poNumber);
        salesOrder.setDistributionChannel(custSales.getD().getResults().get(0).getDistributionChannel());
        salesOrder.setOrganizationDivision(custSales.getD().getResults().get(0).getDivision());
        //if customer rep exists
        if(null !=custSalesRep){
            salesOrder.setSalesGroup(custSalesRep.getD().getResults().get(0).getSalesGroup());
            salesOrder.setSalesOffice(custSalesRep.getD().getResults().get(0).getSalesOffice());
        }else{
//            salesOrder.sets
        }
        salesOrder.setSalesGroup(custSales.getD().getResults().get(0).getSalesOrganization());
        salesOrder.setTransactionCurrency(custSales.getD().getResults().get(0).getCurrency());
        Party soldToParty = new Party();
        Party shipToParty = new Party();
        soldToParty.setPartyType("SoldTo");
        soldToParty.setBuyerPartyID(soldTo);
        shipToParty.setPartyType("ShipTo");
        shipToParty.setAddress(address);
        salesOrder.getParty().add(soldToParty);
        salesOrder.getParty().add(shipToParty);
//        salesOrder.g

        SalesOrderItem item = new SalesOrderItem();
        salesOrder.getOrderItem().addAll(orderItems);
        salesOrder.getText().addAll(comments);
        salesOrder.setPaymentCard(card);
        salesOrderRequest.setOrder(salesOrder);

//        OrderRequestIn port = service.getBinding();
//        port.orderRequestIn(salesOrderRequest);

        return salesOrderRequest;
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
        token = csrf;
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

    public Object postData(String url, String postData, String objType, String authoriz) throws ClientProtocolException, IOException {
        System.out.println("235 - " + url + "   -authoriz:" + authoriz);
        HttpPost request = new HttpPost(url);
        StringEntity requestEntity = new StringEntity((String) postData, "application/json");

        // add request header
        request.addHeader("User-Agent", "Java");
        request.addHeader("Content-Type", "application/json");
        request.addHeader("Accept", "application/json");
        //request.addHeader("APIKey", "SzC1d22J7FqnBtcSAcGfbLZj6g1DmbXm");
        request.addHeader("Authorization", authoriz);
        request.addHeader("X-CSRF-TOKEN", token);
        request.setEntity(requestEntity);
        HttpClient client = HttpClientBuilder.create().build();
        HttpResponse respons = client.execute(request);
        //respons.getEntity().writeTo(System.out);
        String csrf = respons.getFirstHeader("X-CSRF-TOKEN").getValue();
        token = csrf;
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
