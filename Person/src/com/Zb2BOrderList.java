/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.google.gson.Gson;
import com.model.Zb2BOrderListWrapper;
import com.model.Zb2CWpopShipmentWrapper;

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
import java.util.concurrent.Future;

import javax.annotation.Resource;
import javax.naming.AuthenticationException;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import org.apache.cxf.Bus;
import org.apache.cxf.BusFactory;
import org.apache.cxf.jaxws.ServerAsyncResponse;
import org.apache.cxf.transport.http.asyncclient.AsyncHTTPConduit;
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
public class Zb2BOrderList implements Zb2BOrderListInterface {

    @Resource
    public WebServiceContext wsctx;
    Logger logger = LoggerFactory.getLogger(Zb2BOrderList.class);

    @Override
	public Response<Zb2BOrderListWrapper> getOrderListAsync(String customerNumber, String salesOrder, String customerPurchaseOrder, String materialNumber, String dateFromSelectionByMaterial) throws AuthenticationException, Exception {
    	MessageContext mctx = wsctx.getMessageContext();
        Bus bus = BusFactory.getDefaultBus();
                	// insist on the async connector to use PATCH.
                	bus.setProperty(AsyncHTTPConduit.USE_ASYNC, Boolean.TRUE);
                	bus.setProperty(org.apache.cxf.transport.http.asyncclient.AsyncHTTPConduitFactory.SO_KEEPALIVE,Boolean.TRUE);
    	 final ServerAsyncResponse<Zb2BOrderListWrapper> asyncResponse = new ServerAsyncResponse<Zb2BOrderListWrapper>() ;
        new Thread() {
            public void run() {
                try {
                	Bus bus = BusFactory.getDefaultBus();
                	// insist on the async connector to use PATCH.
                	bus.setProperty(AsyncHTTPConduit.USE_ASYNC, Boolean.TRUE);
                	bus.setProperty(org.apache.cxf.transport.http.asyncclient.AsyncHTTPConduitFactory.SO_KEEPALIVE,Boolean.TRUE);
                    Thread.sleep(10000);
                    //Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                Zb2CWpopShipmentWrapper payload = new TestMessage();
//                payload.setMessage("message: " + message);
                try {
					asyncResponse.set(getOrderList(customerNumber, salesOrder, customerPurchaseOrder, materialNumber, dateFromSelectionByMaterial,mctx));
				} catch (AuthenticationException e) {
					// TODO Auto-generated catch block 
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                System.out.println("Responding on another thread\n");
               // asyncHandler.handleResponse(asyncResponse);
            }
        }.start();
 
        return asyncResponse;
	}
    
    @Override
    public Future<?> getOrderListAsync(final String customerNumber,final  String salesOrder,final String customerPurchaseOrder,final String materialNumber,final String dateFromSelectionByMaterial, final AsyncHandler<Zb2BOrderListWrapper> asyncHandler) {
        System.out.println("Executing getResendWpopShipmentsAsync asynchronously\n");
        MessageContext mctx = wsctx.getMessageContext();
        final ServerAsyncResponse<Zb2BOrderListWrapper> asyncResponse = new ServerAsyncResponse<Zb2BOrderListWrapper>() ;
        new Thread() {
            public void run() {
                try {
                	Bus bus = BusFactory.getDefaultBus();
                	// insist on the async connector to use PATCH.
                	bus.setProperty(AsyncHTTPConduit.USE_ASYNC, Boolean.TRUE);
                	bus.setProperty(org.apache.cxf.transport.http.asyncclient.AsyncHTTPConduitFactory.SO_KEEPALIVE,Boolean.TRUE);
                    Thread.sleep(10000);
                    //Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                Zb2CWpopShipmentWrapper payload = new TestMessage();
//                payload.setMessage("message: " + message);
                try {
					asyncResponse.set(getOrderList(customerNumber, salesOrder, customerPurchaseOrder, materialNumber, dateFromSelectionByMaterial,mctx));
				} catch (AuthenticationException e) {
					// TODO Auto-generated catch block 
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                System.out.println("Responding on another thread\n");
                asyncHandler.handleResponse(asyncResponse);
            }
        }.start();
 
        return asyncResponse;
    }
    
    
    @Override
    public Zb2BOrderListWrapper getOrderList(String customerNumber, String salesOrder, String customerPurchaseOrder, String materialNumber, String dateFromSelectionByMaterial) throws AuthenticationException, Exception {
    	MessageContext mctx = wsctx.getMessageContext();
    	return this.getOrderList(customerNumber, salesOrder, customerPurchaseOrder, materialNumber, dateFromSelectionByMaterial,mctx);
    }
    
    
    
    
    public Zb2BOrderListWrapper getOrderList(String customerNumber, String salesOrder, String customerPurchaseOrder, String materialNumber, String dateFromSelectionByMaterial,MessageContext mctx) throws AuthenticationException, Exception {
        //MessageContext mctx = wsctx.getMessageContext();
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
        String custNo = customerNumber;
        String matNo = materialNumber;
        String purNo = customerPurchaseOrder;
        String soNum = salesOrder;
        String datebyMat = dateFromSelectionByMaterial;

        //authoriz = "Basic QkhGX0NPTU06bkJoTHNpd1dYbWZ3cW1YKUZETFJVQTZTd2RDaXRBWFVzd3dad0xxWA==";
        com.model.Zb2BOrderListWrapper z = new com.model.Zb2BOrderListWrapper();
        com.model.Zb2BOrderListWrapper ifSO = new com.model.Zb2BOrderListWrapper();
//        com.model.Zb2BOrderListWrapper ifPO = new com.model.Zb2BOrderListWrapper();
        com.model.Zb2BOrderListGetSalesOrgWrapper y = new com.model.Zb2BOrderListGetSalesOrgWrapper();
        com.model.Zb2BOrderListGetShipCondTextWrapper oWShipCond = new com.model.Zb2BOrderListGetShipCondTextWrapper();
        String o_result = "000";
        String sales_Org = "";
        DataOutputStream dataOut = null;
        BufferedReader br = null;
        InputStreamReader in = null;
        Gson gson = new Gson();
        String BASE_URL = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_CustomerSalesArea?$format=json&$select=Customer,SalesOrganization&$filter=" + URLEncoder.encode("Customer eq '" + custNo + "'", "UTF-8");
        System.out.println("---BASE_URL------" + BASE_URL);
        String result = (String) this.getData(BASE_URL, authoriz);
        System.out.println("result : " + result);
        y = gson.fromJson(result, com.model.Zb2BOrderListGetSalesOrgWrapper.class);
        System.out.println("---y----" + y);

        com.model.OrderListGetSalesOrg dd = new com.model.OrderListGetSalesOrg();
        com.model.OrderListGetSalesOrg[] ddA = y.getD().getResults();

        System.out.println("--ddA-----" + ddA.length);
        if (ddA.length > 0) {
            o_result = "000";
            for (int i = 0; i < ddA.length; i++) {
                dd = ddA[i];
                sales_Org = ddA[i].getSalesOrganization();
                break;
            }
        } else {
            o_result = "001";
            ifSO.setO_result(o_result);
            return ifSO;
        }
        if (o_result.equals("000")) {
            com.model.OrderListGetShipCondText dShipCond = new com.model.OrderListGetShipCondText();
            com.model.OrderListGetUserName dUserName = new com.model.OrderListGetUserName();
            com.model.Zb2BOrderListGetUserNameWrapper oWUserName = new com.model.Zb2BOrderListGetUserNameWrapper();
            com.model.Zb2BOrderListGetShipToPartyWrapper oWShipToParty = new com.model.Zb2BOrderListGetShipToPartyWrapper();
            com.model.OrderListGetShipToParty dShipToParty = new com.model.OrderListGetShipToParty();
            System.out.println("--salesOrder---" + salesOrder.length());
            System.out.println("--customerPurchaseOrder---" + customerPurchaseOrder.length());
            System.out.println("--materialNumber---" + materialNumber);

            if (!salesOrder.isEmpty()) {
                String resultSo = (String) this.get_order_header_SalesOrder(customerNumber, authoriz, salesOrder);
                System.out.println("---resultSo----" + resultSo);
                ifSO = gson.fromJson(resultSo, com.model.Zb2BOrderListWrapper.class);
                System.out.println("---ifSO----" + ifSO);
                com.model.OrderList dSO = new com.model.OrderList();
                com.model.OrderList[] ddASo = ifSO.getD().getResults();
                System.out.println("----ddASo----length--" + ddASo.length);
                if (ddASo.length > 0) {
                    o_result = "000";
                    for (int j = 0; j < ddASo.length; j++) {
                        dSO = ddASo[j];
                        String salesOrderNew = dSO.getSalesOrder();
                        String shipCond = dSO.getShippingCondition();
                        String createdBy = dSO.getCreatedByUser();
                        String custFromVbeln = dSO.getSoldToParty();
                        System.out.println("---!custFromVbeln.equals(customerNumber)----" + !custFromVbeln.equals(customerNumber));
                        if (!custFromVbeln.equals(customerNumber)) {
                            o_result = "003";
                        }
                        String resultShipCondText = (String) this.get_order_header_ShipCondText(authoriz, shipCond);
                        String resultShipToParty = (String) this.get_order_header_ShipToParty(authoriz, salesOrderNew);
                        String resultUserName = (String) this.get_order_header_user_name(createdBy, authoriz);
                        System.out.println("----resultShip---" + resultShipToParty);
                        System.out.println("----resultUserName---" + resultUserName);
                        System.out.println("----resultShipCondText---" + resultShipCondText);
                        oWShipCond = gson.fromJson(resultShipCondText, com.model.Zb2BOrderListGetShipCondTextWrapper.class);
                        oWUserName = gson.fromJson(resultUserName, com.model.Zb2BOrderListGetUserNameWrapper.class);
                        oWShipToParty = gson.fromJson(resultShipToParty, com.model.Zb2BOrderListGetShipToPartyWrapper.class);
                        System.out.println("---oWShipCond----" + oWShipCond);
                        com.model.OrderListGetShipCondText[] dAShipCond = oWShipCond.getD().getResults();
                        com.model.OrderListGetUserName[] dAUserName = oWUserName.getD().getResults();
                        com.model.OrderListGetShipToParty[] dAShipToParty = oWShipToParty.getD().getResults();
                        int i = 0;
                        if (dAUserName.length > 0) {
                            while (i < dAUserName.length) {
                                dUserName = dAUserName[i];
                                dSO.setFullName(dUserName.getPersonFullName());
                                break;
                            }
                        } else {
                            dSO.setFullName("");
                        }

                        int k = 0;
                        if (dAShipCond.length > 0) {
                            while (k < dAShipCond.length) {
                                dShipCond = dAShipCond[k];
                                dSO.setDescriptionOfTheShippingConditions(dShipCond.getShippingConditionName());
                                break;
                            }
                        } else {
                            dSO.setDescriptionOfTheShippingConditions("");
                        }
                        int m = 0;
                        if (dAShipToParty.length > 0) {
                            while (m < dAShipToParty.length) {
                                dShipToParty = dAShipToParty[m];
                                dSO.setShipToParty(dShipToParty.getCustomer());
                                break;
                            }
                        } else {
                            dSO.setShipToParty("");
                        }

                    }
                } else {
                    o_result = "002";
                }

            } else if (!customerPurchaseOrder.isEmpty()) {
                System.out.println("----customerPurchaseOrder loop---");
                String resultPo = (String) this.get_order_header_po(customerNumber, authoriz, customerPurchaseOrder);
                System.out.println("----resultPo---" + resultPo);
                ifSO = gson.fromJson(resultPo, com.model.Zb2BOrderListWrapper.class);
                System.out.println("---ifPO----" + ifSO);
                com.model.OrderList dPO = new com.model.OrderList();
                com.model.OrderList[] ddAPo = ifSO.getD().getResults();
                System.out.println("----ddAPo----length--" + ddAPo.length);
                if (ddAPo.length > 0) {
                    o_result = "000";
                    for (int j = 0; j < ddAPo.length; j++) {
                        dPO = ddAPo[j];
                        String salesOrderNew = dPO.getSalesOrder();
                        String shipCond = dPO.getShippingCondition();
                        String createdBy = dPO.getCreatedByUser();
                        String resultUserName = (String) this.get_order_header_user_name(createdBy, authoriz);
                        String resultShipCondText = (String) this.get_order_header_ShipCondText(authoriz, shipCond);
                        String resultShipToParty = (String) this.get_order_header_ShipToParty(authoriz, salesOrderNew);

                        System.out.println("----resultShip---" + resultShipToParty);
                        System.out.println("----resultShipCondText---" + resultShipCondText);
                        System.out.println("----resultUserName---" + resultUserName);
                        oWShipCond = gson.fromJson(resultShipCondText, com.model.Zb2BOrderListGetShipCondTextWrapper.class);
                        oWUserName = gson.fromJson(resultUserName, com.model.Zb2BOrderListGetUserNameWrapper.class);
                        oWShipToParty = gson.fromJson(resultShipToParty, com.model.Zb2BOrderListGetShipToPartyWrapper.class);
                        System.out.println("---oWShipCond----" + oWShipCond);
                        com.model.OrderListGetShipCondText[] dAShipCond = oWShipCond.getD().getResults();
                        com.model.OrderListGetUserName[] dAUserName = oWUserName.getD().getResults();
                        com.model.OrderListGetShipToParty[] dAShipToParty = oWShipToParty.getD().getResults();
                        int i = 0;
                        if (dAUserName.length > 0) {
                            while (i < dAUserName.length) {
                                dUserName = dAUserName[i];
                                dPO.setFullName(dUserName.getPersonFullName());
                                break;
                            }
                        } else {
                            dPO.setFullName("");
                        }

                        int k = 0;
                        if (dAShipCond.length > 0) {
                            while (k < dAShipCond.length) {
                                dShipCond = dAShipCond[k];
                                dPO.setDescriptionOfTheShippingConditions(dShipCond.getShippingConditionName());
                                break;
                            }
                        } else {
                            dPO.setDescriptionOfTheShippingConditions("");
                        }
                        int m = 0;
                        if (dAShipToParty.length > 0) {
                            while (m < dAShipToParty.length) {
                                dShipToParty = dAShipToParty[m];
                                dPO.setShipToParty(dShipToParty.getCustomer());
                                break;
                            }
                        } else {
                            dPO.setShipToParty("");
                        }

                    }
                } else {
                    o_result = "004";
                }

            } else if (!materialNumber.isEmpty()) {
                String result_mat = (String) this.get_order_header_mat(customerNumber, authoriz, materialNumber, dateFromSelectionByMaterial);
                System.out.println("---result_mat----" + result_mat);
                ifSO = gson.fromJson(result_mat, com.model.Zb2BOrderListWrapper.class);
                System.out.println("---ifMat----" + ifSO);
                com.model.OrderList dMat = new com.model.OrderList();
                com.model.OrderList[] ddAMat = ifSO.getD().getResults();
                System.out.println("----ddAMat----length--" + ddAMat.length);

                if (ddAMat.length > 0) {
                    o_result = "000";
                    for (int j = 0; j < ddAMat.length; j++) {
                        dMat = ddAMat[j];
                        String saleOrder = dMat.getSalesOrder();
                        String shipCond = dMat.getShippingCondition();
                        String createdBy = dMat.getCreatedByUser();
                        String resultUserName = (String) this.get_order_header_user_name(createdBy, authoriz);
                        String resultShipCondText = (String) this.get_order_header_ShipCondText(authoriz, shipCond);
                        String resultShipToParty = (String) this.get_order_header_ShipToParty(authoriz, saleOrder);
                        oWShipCond = gson.fromJson(resultShipCondText, com.model.Zb2BOrderListGetShipCondTextWrapper.class);
                        oWUserName = gson.fromJson(resultUserName, com.model.Zb2BOrderListGetUserNameWrapper.class);
                        oWShipToParty = gson.fromJson(resultShipToParty, com.model.Zb2BOrderListGetShipToPartyWrapper.class);
                        System.out.println("---oWShipCond----" + oWShipCond);
                        com.model.OrderListGetShipCondText[] dAShipCond = oWShipCond.getD().getResults();
                        com.model.OrderListGetUserName[] dAUserName = oWUserName.getD().getResults();
                        com.model.OrderListGetShipToParty[] dAShipToParty = oWShipToParty.getD().getResults();
                        int i = 0;
                        if (dAUserName.length > 0) {
                            while (i < dAUserName.length) {
                                dUserName = dAUserName[i];
                                dMat.setFullName(dUserName.getPersonFullName());
                                break;
                            }
                        } else {
                            dMat.setFullName("");
                        }

                        int k = 0;
                        if (dAShipCond.length > 0) {
                            while (k < dAShipCond.length) {
                                dShipCond = dAShipCond[k];
                                dMat.setDescriptionOfTheShippingConditions(dShipCond.getShippingConditionName());
                                break;
                            }
                        } else {
                            dMat.setDescriptionOfTheShippingConditions("");
                        }
                        int m = 0;
                        if (dAShipToParty.length > 0) {
                            while (m < dAShipToParty.length) {
                                dShipToParty = dAShipToParty[m];
                                dMat.setShipToParty(dShipToParty.getCustomer());
                                break;
                            }
                        } else {
                            dMat.setShipToParty("");
                        }
                    }
                } else {
                    o_result = "005";
                }
            } else {
                String url_onlyCust = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/API_SALES_ORDER_SRV/A_SalesOrder?$format=json&$select=SalesOrder,SalesOrderType,CreationDate,CreatedByUser,SalesOrderDate,SoldToParty,PurchaseOrderByCustomer,ShippingCondition&$filter=" + URLEncoder.encode("SoldToParty eq '" + customerNumber + "'", "UTF-8")+"&$top=60";
                System.out.println("----url_onlyCust---" + url_onlyCust);
                String result_onlyCust = (String) this.getData(url_onlyCust, authoriz);
                System.out.println("----result_onlyCust----" + result_onlyCust);
                ifSO = gson.fromJson(result_onlyCust, com.model.Zb2BOrderListWrapper.class);
                System.out.println("---ifCustSo----" + ifSO);
//                if(null==ifSO) {
//                	System.out.println("NULL----ifSO:"+ifSO);
//                	o_result="006";
//                	ifSO= new Zb2BOrderListWrapper();
//                	ifSO.setO_result(o_result);
//                	return ifSO;
//                }else {System.out.println("NULL----ifSO:"+ifSO);}
                com.model.OrderList dCust = new com.model.OrderList();
                System.out.println("--------------ifSO.getD():"+ifSO.getD());
                System.out.println("--------------ifSO.getD().getResults():"+ifSO.getD().getResults());
                com.model.OrderList[] ddACust = ifSO.getD().getResults();
                System.out.println("----ddACust----length--" + ddACust.length);
                if (ddACust.length > 0) {
                    o_result = "000";
                    for (int j = 0; j < ddACust.length; j++) {
                        dCust = ddACust[j];
                        String saleOrder = dCust.getSalesOrder();
                        String shipCond = dCust.getShippingCondition();
                        String createdBy = dCust.getCreatedByUser();
                        String resultUserName = (String) this.get_order_header_user_name(createdBy, authoriz);
                        String resultShipCondText = (String) this.get_order_header_ShipCondText(authoriz, shipCond);
                        String resultShipToParty = (String) this.get_order_header_ShipToParty(authoriz, saleOrder);
                        oWShipCond = gson.fromJson(resultShipCondText, com.model.Zb2BOrderListGetShipCondTextWrapper.class);
                        oWUserName = gson.fromJson(resultUserName, com.model.Zb2BOrderListGetUserNameWrapper.class);
                        oWShipToParty = gson.fromJson(resultShipToParty, com.model.Zb2BOrderListGetShipToPartyWrapper.class);
                        System.out.println("---oWShipCond----" + oWShipCond);
                        com.model.OrderListGetShipCondText[] dAShipCond = oWShipCond.getD().getResults();
                        com.model.OrderListGetUserName[] dAUserName = oWUserName.getD().getResults();
                        com.model.OrderListGetShipToParty[] dAShipToParty = oWShipToParty.getD().getResults();
                        int i = 0;
                        if (dAUserName.length > 0) {
                            while (i < dAUserName.length) {
                                dUserName = dAUserName[i];
                                dCust.setFullName(dUserName.getPersonFullName());
                                break;
                            }
                        } else {
                            dCust.setFullName("");
                        }

                        int k = 0;
                        if (dAShipCond.length > 0) {
                            while (k < dAShipCond.length) {
                                dShipCond = dAShipCond[k];
                                dCust.setDescriptionOfTheShippingConditions(dShipCond.getShippingConditionName());
                                break;
                            }
                        } else {
                            dCust.setDescriptionOfTheShippingConditions("");
                        }
                        int m = 0;
                        if (dAShipToParty.length > 0) {
                            while (m < dAShipToParty.length) {
                                dShipToParty = dAShipToParty[m];
                                dCust.setShipToParty(dShipToParty.getCustomer());
                                break;
                            }
                        } else {
                            dCust.setShipToParty("");
                        }
                    }
                } else {
                    o_result = "006";
                }
            }

        }
//        System.out.println("---Sales_Org---" + sales_Org);
        System.out.println("---o_result---" + o_result);
        ifSO.setO_result(o_result);        
        return ifSO;
    }

    public Object getData(String url, String authoriz) throws ClientProtocolException, IOException {
        System.out.println("235 - " + url + "   -authoriz:" + authoriz);
        HttpGet request = new HttpGet(url);

        // add request header
        //request.addHeader("User-Agent", "Java");
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
        System.out.println(respons.getStatusLine().getStatusCode());
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

    public Object get_order_header_SalesOrder(String customer, String authoriz, String salesOrder) throws ClientProtocolException, IOException {
//        System.out.println("235 - " + url + "   -authoriz:" + authoriz);
        String url = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/API_SALES_ORDER_SRV/A_SalesOrder?$format=json&$select=SalesOrder,SalesOrderType,CreationDate,CreatedByUser,SalesOrderDate,SoldToParty,PurchaseOrderByCustomer,ShippingCondition&$filter=" + URLEncoder.encode("SoldToParty eq '" + customer + "' and SalesOrder eq '" + salesOrder + "'", "UTF-8");
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

        StringBuffer result = new StringBuffer();
        String csrf = respons.getFirstHeader("X-CSRF-TOKEN").getValue();
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

    public Object get_order_header_ShipToParty(String authoriz, String salesOrder) throws ClientProtocolException, IOException {
//        System.out.println("235 - " + url + "   -authoriz:" + authoriz);
        String url = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/API_SALES_ORDER_SRV/A_SalesOrderHeaderPartner?$format=json&$select=SalesOrder,PartnerFunction,Customer&$filter=" + URLEncoder.encode("SalesOrder eq '" + salesOrder + "' and PartnerFunction eq 'SH'", "UTF-8");
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

        StringBuffer result = new StringBuffer();
        String csrf = respons.getFirstHeader("X-CSRF-TOKEN").getValue();
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

    public Object get_order_header_ShipCondText(String authoriz, String shipCond) throws ClientProtocolException, IOException {
//        System.out.println("235 - " + url + "   -authoriz:" + authoriz);
        String url = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/YY1_SHIPPINGCONDITIONTEXT_CDS/YY1_ShippingConditionText?$format=json&$select=ShippingCondition,ShippingConditionName,Language&$filter=" + URLEncoder.encode("ShippingCondition eq '" + shipCond + "' and Language eq 'EN'", "UTF-8");
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

        StringBuffer result = new StringBuffer();
        String csrf = respons.getFirstHeader("X-CSRF-TOKEN").getValue();
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

    public Object get_order_header_po(String customer, String authoriz, String purchaseOrder) throws ClientProtocolException, IOException {
//        System.out.println("235 - " + url + "   -authoriz:" + authoriz);
        String url = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/API_SALES_ORDER_SRV/A_SalesOrder?$format=json&$select=SalesOrder,SalesOrderType,CreationDate,CreatedByUser,SalesOrderDate,SoldToParty,PurchaseOrderByCustomer,ShippingCondition&$filter=" + URLEncoder.encode("SoldToParty eq '" + customer + "' and PurchaseOrderByCustomer eq '" + purchaseOrder + "'", "UTF-8");
        HttpGet request = new HttpGet(url);
        System.out.println("po method-----url---" + url);
        // add request header
        request.addHeader("User-Agent", "Java");
        request.addHeader("Content-Type", "application/json");
        request.addHeader("Accept", "application/json");
        //request.addHeader("APIKey", "SzC1d22J7FqnBtcSAcGfbLZj6g1DmbXm");
        request.addHeader("Authorization", authoriz);
        request.addHeader("X-CSRF-TOKEN", "FETCH");
        HttpClient client = HttpClientBuilder.create().build();
        HttpResponse respons = client.execute(request);

        StringBuffer result = new StringBuffer();
        String csrf = respons.getFirstHeader("X-CSRF-TOKEN").getValue();
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

    public Object get_order_header_mat(String customer, String authoriz, String material, String documentDate) throws ClientProtocolException, IOException {
//        System.out.println("235 - " + url + "   -authoriz:" + authoriz);
        String saleOrderDate = documentDate + "T00:00:00";
        String url = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/API_SALES_ORDER_SRV/A_SalesOrder?$format=json&$select=SalesOrder,SalesOrderType,CreationDate,CreatedByUser,SalesOrderDate,SoldToParty,PurchaseOrderByCustomer,ShippingCondition&$filter=" + URLEncoder.encode("SoldToParty eq '" + customer + "' and SalesOrderDate ge datetime'" + saleOrderDate + "'", "UTF-8");
        System.out.println("----mat_url---" + url);
        com.model.Zb2BOrderListWrapper oWMat = new com.model.Zb2BOrderListWrapper();
        com.model.Zb2BOrderListWrapper oWFinal = new com.model.Zb2BOrderListWrapper();
        Gson gson = new Gson();
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

        StringBuffer result = new StringBuffer();
        String csrf = respons.getFirstHeader("X-CSRF-TOKEN").getValue();
        if (200 == respons.getStatusLine().getStatusCode()) {
            InputStreamReader in = new InputStreamReader(respons.getEntity().getContent());
            BufferedReader rd = new BufferedReader(in);
            String line = "";
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
            System.out.println("257 result--Mat----Sales-- : " + result);
            oWMat = gson.fromJson(result.toString(), com.model.Zb2BOrderListWrapper.class);
            System.out.println("--oWMat------ : " + oWMat);
        }
        com.model.OrderList dMatSale = new com.model.OrderList();
        com.model.OrderList[] dAMatSale = oWMat.getD().getResults();
        com.model.Zb2BOrderListMatSoWrapper oWMatSoItem = new com.model.Zb2BOrderListMatSoWrapper();
        ArrayList<com.model.OrderList> finalList = new ArrayList<com.model.OrderList>();
        System.out.println("---dAMatSale=-----" + dAMatSale.length);
        if (dAMatSale.length > 0) {
            for (int i = 0; i < dAMatSale.length; i++) {
                dMatSale = dAMatSale[i];
                String salesOrder = dMatSale.getSalesOrder();
                String url_SoItemMat = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/API_SALES_ORDER_SRV/A_SalesOrderItem?$format=json&$select=SalesOrder,SalesOrderItem,Material&$filter=" + URLEncoder.encode("Material eq '" + material + "' and SalesOrder eq '" + salesOrder + "'", "UTF-8");
                System.out.println("----url_SoItemMat---" + url_SoItemMat);
                String result_SoItemMat = (String) getData(url_SoItemMat, authoriz);
                System.out.println("---result_SoItemMat----" + result_SoItemMat);
                oWMatSoItem = gson.fromJson(result_SoItemMat, com.model.Zb2BOrderListMatSoWrapper.class);
                System.out.println("----oWMatSoItem-----" + oWMatSoItem);
                com.model.OrderListMatSo dMatSoItem = new com.model.OrderListMatSo();
                com.model.OrderListMatSo[] dAMatSoItem = oWMatSoItem.getD().getResults();
                if (dAMatSoItem.length > 0) {
                    finalList.add(dMatSale);
                }
            }
        }
        com.model.CollectionGetOrdersList colList = new com.model.CollectionGetOrdersList();
        colList.setResults(finalList.toArray(new com.model.OrderList[finalList.size()]));
        oWFinal.setD(colList);
        System.out.println("-----oWFinal----" + oWFinal);
        String finalResult = gson.toJson(oWFinal);
        System.out.println("----finalResult----" + finalResult);
        return finalResult.toString();
    }

    public Object get_order_header_user_name(String createdBy, String authoriz) throws ClientProtocolException, IOException {
//        System.out.println("235 - " + url + "   -authoriz:" + authoriz);
        String url = CxfNonSpringSimpleServlet.host + "/sap/opu/odata/sap/YY1_BUSINESSUSER_CDS/YY1_BUSINESSUSER?$format=json&$select=PersonFullName,UserID&$filter=" + URLEncoder.encode("UserID eq '" + createdBy + "'", "UTF-8");
        System.out.println("----user_name---" + url);
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

        StringBuffer result = new StringBuffer();
        String csrf = respons.getFirstHeader("X-CSRF-TOKEN").getValue();
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
