/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.ArrayList;
import java.util.Map;
import javax.annotation.Resource;
import javax.naming.AuthenticationException;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.WebServiceRef;
import javax.xml.ws.handler.MessageContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.gson.Gson;
import com.sap.xi.edi.Address;
import com.sap.xi.edi.Amount;
import com.sap.xi.edi.BusinessDocumentMessageHeader;
import com.sap.xi.edi.BusinessDocumentMessageHeaderParty;
import com.sap.xi.edi.BusinessDocumentMessageID;
import com.sap.xi.edi.Party;
import com.sap.xi.edi.Text;
import com.sap.xi.edi.SalesOrderItem;
import com.sap.xi.edi.PaymentCard;
import com.sap.xi.edi.SalesOrder;
import com.sap.xi.edi.SalesOrderMessage;
import com.sap.xi.edi.supplier.ClientPasswordCallback;
import com.sap.xi.edi.supplier.OrderRequestIn;
import com.sap.xi.edi.supplier.Service;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Base64;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceFeature;
import org.apache.cxf.Bus;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.ws.addressing.WSAddressingFeature;
import org.apache.cxf.ws.policy.IgnorablePolicyInterceptorProvider;
import org.apache.cxf.ws.policy.PolicyInterceptorProviderRegistry;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.wss4j.dom.WSConstants;
import org.apache.wss4j.dom.handler.WSHandlerConstants;
import org.apache.cxf.feature.LoggingFeature;

/**
 *
 * @author Sivag
 */
public class B2cSoapSalesOrd implements B2cSoapSalesOrdInterface {

    @WebServiceRef(wsdlLocation = "classpath:ORDERREQUEST_IN.wsdl")
    Service service;

    @Resource
    public WebServiceContext wsctx;
    Logger logger = LoggerFactory.getLogger(B2cSoapSalesOrd.class);
    public String token = "";
    private static final QName SERVICE_NAME = new QName("http://sap.com/xi/EDI/Supplier", "service");

    public void salesOrderCreate(
            String shipping, Amount amount, Amount taxAmount,
            Amount discountAmount, Amount totalAmount,
            String poNumber, Address address, String phone, String email, String site,
            String soldTo, String coupon, String shipToStore, String block, Address payeeAddress,
            com.sap.xi.edi.Text[] comments, SalesOrderItem[] orderItems, PaymentCard card) throws Exception {

        MessageContext mctx = wsctx.getMessageContext();
        Map http_headers = (Map) mctx.get(MessageContext.HTTP_REQUEST_HEADERS);
        ArrayList authList = (ArrayList) http_headers.get("Authorization");
        SalesOrderMessage salesOrderRequest = new SalesOrderMessage();
        SalesOrderMessage salesOrderRequest1 = new SalesOrderMessage();
        String authoriz = "";
        if (authList != null) {
            //get password
            authoriz = authList.get(0).toString();
        }
        if (authList == null) {
            throw new AuthenticationException("No Authorization Header ");
        }
        System.out.println("MessageContext().toString : " + wsctx.getMessageContext().toString());
        System.out.println("http_headers :" + http_headers.keySet().toString());
        ArrayList hosts = (ArrayList) http_headers.get("host");
        String host = hosts.get(0).toString();
        logger.error("Host:" + host);
        System.out.println("Host:" + host);
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
        System.out.println("-----96--------");
        try {
            if (address.getCountry().equals("CA") && address.getRegion().equals("PQ")) {
                address.setRegion("QC");
                address.setCorrespondenceLanguage("F");
            }
        } catch (Exception e) {
            //  e.printStackTrace();
        }
        try {
            if (address.getCountry().equals("CA") && address.getPostalCode().length() != 6) {
                address.setPostalCode("      ");
            }
        } catch (Exception e) {
//            e.printStackTrace();
        }
        try {
            if (payeeAddress.getCountry().equals("CA") && payeeAddress.getRegion().equals("PQ")) {
                payeeAddress.setRegion("QC");
                payeeAddress.setCorrespondenceLanguage("F");
            }
        } catch (Exception e) {
//            e.printStackTrace();
        }
        try {
            if (payeeAddress.getCountry().equals("CA") && payeeAddress.getPostalCode().length() != 6) {
                payeeAddress.setPostalCode("      ");
            }
        } catch (Exception w) {
//            w.printStackTrace();
        }
        String customer = "";
//     Wallpops = 1 --> 999999
//     Lucky Day = 3 -->  131313
//     Brewster = 9 -->777777
//     Promotional = 6--> 999999
        System.out.println("-----116--------");
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

        String url = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_BusinessPartnerAddress?$format=json&$filter=BusinessPartner+eq+'" + customer + "'";
        String data = (String) new com.Zb2BCustInq().getData(url, authoriz);
        com.sap.apibhub.sdk.api_business_partner.model.Wrapper9 aWrap = new com.sap.apibhub.sdk.api_business_partner.model.Wrapper9();
        Gson gson = new Gson();
        aWrap = gson.fromJson(data, aWrap.getClass());
        System.out.println("-----138--------");
        //if customer rep exists
        com.Zb2BCustInqWrapper custSalesRep = null;
        if (custRepComm.length() > 0) {
            url = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_CustomerSalesArea?$format=json&$select=Customer,SalesOrganization,DistributionChannel,Division,SalesOffice,SalesGroup&$expand=to_SalesAreaTax&$filter=" + URLEncoder.encode("Customer eq '" + custRepComm + "'", "UTF-8");
            data = (String) new com.Zb2BCustInq().getData(url, authoriz);
            custSalesRep = gson.fromJson(data, com.Zb2BCustInqWrapper.class);
        }

        url = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_CustomerSalesArea?$format=json&$select=Customer,SalesOrganization,DistributionChannel,Division,ShippingCondition,CustomerPaymentTerms,DeliveryIsBlockedForCustomer,OrderIsBlockedForCustomer,Currency&$expand=to_SalesAreaTax&$filter=" + URLEncoder.encode("Customer eq '" + customer + "'", "UTF-8");
        data = (String) new com.Zb2BCustInq().getData(url, authoriz);
        com.Zb2BCustInqWrapper custSales = gson.fromJson(data, com.Zb2BCustInqWrapper.class);
        //getSalesOrder 493
        GregorianCalendar now = new GregorianCalendar();
        XMLGregorianCalendar date2
                = DatatypeFactory.newInstance().newXMLGregorianCalendar(now);
        System.out.println("---------161---" + date2.toXMLFormat());
        com.sap.xi.edi.BusinessDocumentMessageHeader messageHeader = new BusinessDocumentMessageHeader();
        com.sap.xi.edi.BusinessDocumentMessageID msgId = new BusinessDocumentMessageID();
        com.sap.xi.edi.BusinessDocumentMessageHeaderParty senderParty = new BusinessDocumentMessageHeaderParty();
        com.sap.xi.edi.BusinessDocumentMessageHeaderParty receipientParty = new BusinessDocumentMessageHeaderParty();
        senderParty.setInternalID(customer);
        msgId.setSchemeAgencyID("EDI");
        msgId.setSchemeAgencySchemeAgencyID("EDI");
        msgId.setSchemeID("EDI");
        msgId.setValue("EDI");
        messageHeader.setID(msgId);
        receipientParty.setInternalID(customer);
        messageHeader.setCreationDateTime(date2);
        messageHeader.setSenderBusinessSystemID("BHF");
        messageHeader.setSenderParty(senderParty);
        messageHeader.getRecipientParty().add(receipientParty);

        salesOrderRequest.setMessageHeader(messageHeader);

        com.sap.xi.edi.SalesOrder salesOrder = new SalesOrder();

        salesOrder.setSalesDocumentType("TA");
        salesOrder.setRequestedDeliveryDate(date2);
        salesOrder.setPurchaseOrderID(poNumber);
        salesOrder.setDistributionChannel(custSales.getD().getResults().get(0).getDistributionChannel());
        salesOrder.setOrganizationDivision(custSales.getD().getResults().get(0).getDivision());
        System.out.println("---170--");
        //if customer rep exists
        if (null != custSalesRep && custSalesRep.getD().getResults().size() > 0) {
            System.out.println("---172---");
            salesOrder.setSalesGroup(custSalesRep.getD().getResults().get(0).getSalesGroup());
            salesOrder.setSalesOffice(custSalesRep.getD().getResults().get(0).getSalesOffice());
        } else {
//            salesOrder.sets
        }
        System.out.println("---178---");
        salesOrder.setSalesOrganization(custSales.getD().getResults().get(0).getSalesOrganization());
        salesOrder.setTransactionCurrency(custSales.getD().getResults().get(0).getCurrency());
        System.out.println("---180---");
        Party soldToParty = new Party();
        Party shipToParty = new Party();
        soldToParty.setPartyType("SoldTo");
        soldToParty.setBuyerPartyID(customer);
        soldToParty.setAddress(address);
        shipToParty.setPartyType("ShipTo");
        shipToParty.setBuyerPartyID(customer);
        shipToParty.setAddress(address);
        //Party[] partys = {soldToParty,shipToParty};
//        salesOrder.setParty(partys);
        salesOrder.getParty().add(soldToParty);
        salesOrder.getParty().add(shipToParty);
        Text txt = new Text();
        txt.setType("SalesNotes");
        txt.setSupplierTextElementID("Hello");
        txt.setTextElementLanguage("EN");
        txt.setTextElementText("Hello World");
        salesOrder.getText().add(txt);
        System.out.println("---190---");

        SalesOrderItem item = new SalesOrderItem();
        //salesOrder.setOrderItem(orderItems);
        salesOrder.getOrderItem().addAll(Arrays.asList(orderItems));
        //salesOrder.setText(comments);
        salesOrder.getText().addAll(Arrays.asList(comments));
        //salesOrder.setPaymentCard(card);
        salesOrderRequest.setOrder(salesOrder);
        System.out.println("---199---");
        salesOrderRequest1 = salesOrderRequest;
        com.sap.xi.edi.supplier.OrderRequestIn port = null;
        try {
//            QName SERVICE_NAME = new QName("http://sap.com/xi/EDI/Supplier", "service");
//            URL wsdlURL = Service.WSDL_LOCATION;
//            service = new com.sap.xi.edi.supplier.Service(Service.class.getResource("../../../../../ORDERREQUEST_IN.wsdl"), SERVICE_NAME);
//            ArrayList<WebServiceFeature> features = new ArrayList<WebServiceFeature>();
//            LoggingFeature loggingFeature = new LoggingFeature();
//  loggingFeature.setPrettyLogging(true);
//            WebServiceFeature[] wf={loggingFeature,new WSAddressingFeature()};
//            
//                port = service.getBindingSoap12(wf);
//            
            //Port port = service.getPort(ENDPOINTPortType.class);
//
//// 
// org.apache.cxf.endpoint.Client client = org.apache.cxf.frontend.ClientProxy.getClient(port);
// org.apache.cxf.endpoint.Endpoint cxfEndpoint = client.getEndpoint();
//// 
//// 
// Bus bus = client.getBus();
// PolicyInterceptorProviderRegistry reg = bus.getExtension(PolicyInterceptorProviderRegistry.class);
// Set  set = new java.util.HashSet<>();
// set.add(new QName("http://schemas.xmlsoap.org/ws/2005/07/securitypolicy", "IncludeTimestamp") );
// set.add(new QName("http://schemas.xmlsoap.org/ws/2005/07/securitypolicy", "TransportBinding"));
// reg.register(new IgnorablePolicyInterceptorProvider(set));
// bus.getFeatures().add(loggingFeature);
// bus.getFeatures().add(new WSAddressingFeature());
//        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean(); 
//        System.out.println("---------------"+Service.class.getResource("../../../../../ORDERREQUEST_IN.wsdl").getFile());
//        factory.setWsdlLocation(Service.class.getResource("../../../../../ORDERREQUEST_IN.wsdl").getFile());
//        factory.setAddress("https://my302314-api.s4hana.ondemand.com/sap/bc/srt/scs_ext/sap/orderrequest_in?sap-client=100");
            //com.sap.xi.edi.supplier.OrderRequestIn client = factory.create(OrderRequestIn.class);
            //Map<String, Object> req_ctx = ((BindingProvider)port).getRequestContext();
            //Map<String, Object> req_ctx = ((BindingProvider)client).getRequestContext();
            // req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, http_headers);
            // client.orderRequestIn(salesOrderRequest);
//         String xml = this.jaxbObjectToXML(salesOrderRequest);        
//        xml="<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:edi=\"http://sap.com/xi/EDI\" xmlns:ns3=\"http://sap.com/xi/EDI\">\n" +
//"   <soap:Header/>\n" +
//"   <soap:Body>"+xml+"</soap:Body>\n" +
//"</soap:Envelope>";
//        this.postXml("https://my302314-api.s4hana.ondemand.com/sap/bc/srt/scs_ext/sap/orderrequest_in?sap-client=100", xml, authoriz);
            JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
            LoggingInInterceptor loggingInInterceptor = new LoggingInInterceptor();
            loggingInInterceptor.setPrettyLogging(true);
            LoggingOutInterceptor loggingOutInterceptor = new LoggingOutInterceptor();
            loggingOutInterceptor.setPrettyLogging(true);
            LoggingOutInterceptor loggingOutfaultInterceptor = new LoggingOutInterceptor();
            loggingOutInterceptor.setPrettyLogging(true);
            LoggingOutInterceptor loggingInfaultInterceptor = new LoggingOutInterceptor();
            loggingOutInterceptor.setPrettyLogging(true);
            factory.getInInterceptors().add(loggingInInterceptor);
            factory.getOutInterceptors().add(loggingOutInterceptor);
            factory.getOutFaultInterceptors().add(loggingOutfaultInterceptor);
            factory.getInFaultInterceptors().add(loggingInfaultInterceptor);
            factory.setServiceClass(OrderRequestIn.class);
            //factory.setWsdlLocation(Service.class.getResource("../../../../../ORDERREQUEST_IN.wsdl").getFile());
            factory.setAddress(CxfNonSpringSimpleServlet.host + "/sap/bc/srt/scs_ext/sap/orderrequest_in");
            factory.setBindingId("http://www.w3.org/2003/05/soap/bindings/HTTP/");
            factory.getFeatures().add(new WSAddressingFeature());

            OrderRequestIn portl = (OrderRequestIn) factory.create();

            org.apache.cxf.endpoint.Client clientl = ClientProxy.getClient(portl);
            HTTPConduit http = (HTTPConduit) clientl.getConduit();

            String base64Credentials = authoriz.substring("Basic".length()).trim();
            byte[] credDecoded = Base64.getDecoder().decode(base64Credentials);
            String credentials = new String(credDecoded, "UTF-8");
            // credentials = username:password
            final String[] values = credentials.split(":", 2);
            logger.info("----username--pass:" + values[0] + "--" + values[1]);

//            http.getAuthorization().setUserName("BHF_COMM");
//            http.getAuthorization().setPassword("nBhLsiwWXmfwqmX)FDLRUA6SwdCitAXUswwZwLqX");
            http.getAuthorization().setUserName(values[0]);
            http.getAuthorization().setPassword(values[1]);

            org.apache.cxf.endpoint.Endpoint cxfEndpointl = clientl.getEndpoint();
            org.apache.cxf.service.Service serv = cxfEndpointl.getService();
//    Executor exec =serv.getExecutor();
//    exec.
//    Map<String,Object> outProps = new HashMap<String,Object>();
//System.out.println("--ClientPasswordCallback.class.getName()--"+ClientPasswordCallback.class.getName());
//    outProps.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
//    outProps.put(WSHandlerConstants.USER, "BHF_COMM");
//    outProps.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
//    outProps.put(WSHandlerConstants.PW_CALLBACK_CLASS, 
//    com.sap.xi.edi.supplier.ClientPasswordCallback.class.getName());
//
//    WSS4JOutInterceptor wssOut = new WSS4JOutInterceptor(outProps);
            //cxfEndpointl.getOutInterceptors().add(wssOut);
//    List<Header> headers = new ArrayList<Header>();
//Header dummyHeader = new Header(new QName("http://www.w3.org/2005/08/addressing", "MessageID", "wsa"), "some_id", new JAXBDataBinding(String.class));
//headers.add(dummyHeader);
//dummyHeader = new Header(new QName("http://www.w3.org/2005/08/addressing", "Action", "wsa"), "http://sap.com/xi/EDI/Supplier/OrderRequest_In/OrderRequest_InRequest", new JAXBDataBinding(String.class));
//headers.add(dummyHeader);
//server side:
//context.getMessageContext().put(Header.HEADER_LIST, headers);
//client side:
//((BindingProvider)portl).getRequestContext().put(Header.HEADER_LIST, headers);
            portl.orderRequestIn(salesOrderRequest1);

            //port.orderRequestIn(salesOrderRequest);
        } catch (Exception w) {
            w.printStackTrace();
        }
        System.out.println("---206---");
        //System.out.println("---200---"+salesOrderRequest1.toString());
        //return salesOrderRequest1;
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

    private static String jaxbObjectToXML(SalesOrderMessage employee) {
        String xmlContent = "";
        try {
            //Create JAXB Context
            JAXBContext jaxbContext = JAXBContext.newInstance(SalesOrderMessage.class);

            //Create Marshaller
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            //Required formatting??
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            //Print XML String to Console
            StringWriter sw = new StringWriter();

            //Write XML to StringWriter
            jaxbMarshaller.marshal(employee, sw);

            //Verify XML Content
            xmlContent = sw.toString();
            System.out.println(xmlContent);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return xmlContent;
    }

    public Object postXml(String url, String postData, String authoriz) throws ClientProtocolException, IOException {
        System.out.println("235 - " + url + "   -authoriz:" + authoriz + "\n" + postData);
        HttpPost request = new HttpPost(url);
        StringEntity requestEntity = new StringEntity((String) postData, "UTF-8");

        // add request header
        request.addHeader("Content-Type", "text/xml");
        request.addHeader("Accept", "text/xml");
        //request.addHeader("APIKey", "SzC1d22J7FqnBtcSAcGfbLZj6g1DmbXm");
        request.addHeader("Authorization", authoriz);
        request.addHeader("X-CSRF-TOKEN", token);
        request.setEntity(requestEntity);
        HttpClient client = HttpClientBuilder.create().build();
        HttpResponse respons = client.execute(request);
        //respons.getEntity().writeTo(System.out);
        //String csrf = respons.getFirstHeader("X-CSRF-TOKEN").getValue();
        //token = csrf;
        System.out.println("-----statusCode---xml--" + respons.getStatusLine().getStatusCode());
        System.out.println("-----statusCode---xml--" + respons.getStatusLine().getReasonPhrase());
        StringBuffer result = new StringBuffer();
        if (200 == respons.getStatusLine().getStatusCode()) {
            System.out.println("---347---200");
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
