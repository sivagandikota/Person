package com;

import com.google.gson.Gson;
import com.model.Zb2BPriceInqWrapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import javax.annotation.Resource;
import javax.naming.AuthenticationException;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Zb2BPriceInq implements Zb2BPriceInqInterface {

    @Resource
    public WebServiceContext wsctx;
    Logger logger = LoggerFactory.getLogger(Zb2BCustInq.class);

    @Override
    public Zb2BPriceInqWrapper getCustomerValidation(String customer, String material) throws AuthenticationException, Exception {
        MessageContext mctx = wsctx.getMessageContext();
        Map http_headers = (Map) mctx.get(MessageContext.HTTP_REQUEST_HEADERS);
        System.out.println(Arrays.toString(http_headers.keySet().toArray()));
        System.out.println(Arrays.toString(http_headers.values().toArray()));
        List userList = (List) http_headers.get("Username");
        List passList = (List) http_headers.get("Password");
        ArrayList authList = (ArrayList) http_headers.get("Authorization");
        String[] aBrand = new String[2];

        String csrf = null;
        String username = "";
        String password = "";
        String authoriz = "";
        String O_result = "";
        String o_descr = "";
        String o_brand = "";
        String o_collection = "";
        String O_roomNet = "";
        String O_caseNet = "";
        Gson gson = new Gson();
        com.model.Zb2BPriceInqValidCustWraper c = new com.model.Zb2BPriceInqValidCustWraper();
        com.model.Zb2BPriceInqWrapper z = new com.model.Zb2BPriceInqWrapper();
        com.model.Zb2BPriceInqMatWraper oWMat = new com.model.Zb2BPriceInqMatWraper();
        com.model.Zb2BPriceInqMatWraper oWMatDesc = new com.model.Zb2BPriceInqMatWraper();
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

        //authoriz = "Basic QkhGX0NPTU06bkJoTHNpd1dYbWZ3cW1YKUZETFJVQTZTd2RDaXRBWFVzd3dad0xxWA==";
        String data = "";
        String url = "";
        String salesorg = "";
        String distChan = "";
        String url_matDesc = "";
        String data_matDesc = "";
        String[] data_roomCase = new String[2];
        String[] data_book = new String[2];
        try {
//            url = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_CustomerSalesArea?$filter= + URLEncoder.encode(\"SalesOrganization eq '\" + saleOrg + \"' and SoldToParty eq '\" + Customer + \"' and DistributionChannel eq '10' and PurchaseOrderByCustomer eq '\" + Customerpurchaseorder + \"'\", \"UTF-8\");
            url = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_CustomerSalesArea?$format=json&$select=Customer,SalesOrganization,DistributionChannel&$filter=" + URLEncoder.encode("Customer eq '" + customer + "'", "UTF-8");
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Zb2BPriceInq.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("77" + url);

        try {
            data = (String) this.getData(url, authoriz);
            System.out.println("89" + url);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Zb2BPriceInq.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("92" + data);

        c = gson.fromJson(data.toString(), com.model.Zb2BPriceInqValidCustWraper.class);
        System.out.println("----c-----" + c);

        com.model.ValidCust dd = new com.model.ValidCust();
        com.model.ValidCust[] ddA = c.getD().getResults();
        if (ddA.length > 0) {
            O_result = "";
            for (int i = 0; i < ddA.length; i++) {
                dd = ddA[i];
                salesorg = dd.getSalesOrganization();
                distChan = dd.getDistributionChannel();
                System.out.println("---salesorg---" + salesorg);
                System.out.println("---distChannel-local--" + distChan);
                break;
            }
            System.out.println("---distChannel-global--" + distChan);

            String url_mat = "";
            String data_mat = "";
            try {
                url_mat = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_PRODUCT_SRV/A_ProductSalesDelivery?$format=json&$select=Product,ProductHierarchy,ProductSalesOrg,ProductDistributionChnl&$filter=" + URLEncoder.encode("Product eq '" + material + "' and ProductSalesOrg eq '" + salesorg + "' and ProductDistributionChnl eq '" + distChan + "'", "UTF-8");
            } catch (Exception ex) {
                java.util.logging.Logger.getLogger(Zb2BPriceInq.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("url_mat" + url_mat);

            try {
                data_mat = (String) this.getData(url_mat, authoriz);
                System.out.println("url_mat" + url_mat);
            } catch (Exception ex) {
                java.util.logging.Logger.getLogger(Zb2BPriceInq.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("----data_mat----" + data_mat);
            oWMat = gson.fromJson(data_mat, com.model.Zb2BPriceInqMatWraper.class);
            com.model.PriceInqMat dMat = new com.model.PriceInqMat();
            com.model.PriceInqMat[] dAMat = oWMat.getD().getResults();
            System.out.println("----oWMat----" + oWMat);
            System.out.println("----dAMat-- length----" + dAMat.length);
            if (dAMat.length > 0) {
                O_result = "";
                o_descr = (String) this.getDataMatDetails(material, authoriz);
                data_roomCase = this.getSalesSimu(material, authoriz);
                data_book = this.getBook(material, authoriz);
                o_collection = data_book[0];
                o_brand = data_book[1];
                System.out.println("-----o_descr----" + o_descr);
                System.out.println("-----data_roomCase----" + data_roomCase.toString());
                System.out.println("-----o_collection--length--" + o_collection);

            } else {
                O_result = "MAT";
            }
        } else {
            O_result = "CUS";
        }

        System.out.println("---o_result---" + O_result);
        System.out.println("---o_descr---" + o_descr);
        System.out.println("---O_result---" + O_result);
        System.out.println("---o_collection---" + o_collection);
        z.setO_result(O_result);
        z.setO_caseNet(data_roomCase[1]);
        z.setO_brand(o_brand);
        z.setO_descr(o_descr);
        z.setO_roomNet(data_roomCase[0]);
        z.setO_collection(o_collection);

        return z;
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

    public Object getDataMatDetails(String material, String authoriz) throws Exception, IOException {

        String url_matDesc = "";
        String o_descr = "";
        String data_matDesc = "";
        String matGrp = "";
        com.model.Zb2BPriceInqMatWraper oWMatDesc = new com.model.Zb2BPriceInqMatWraper();
        Gson gson = new Gson();
        try {
            url_matDesc = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_PRODUCT_SRV/A_ProductDescription?$format=json&$select=Product,Language,ProductDescription&$filter=" + URLEncoder.encode("Product eq '" + material + "' and Language eq 'EN'", "UTF-8");
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Zb2BPriceInq.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("url_matDesc" + url_matDesc);

        try {
            data_matDesc = (String) this.getData(url_matDesc, authoriz);
            System.out.println("url_matDesc" + url_matDesc);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Zb2BPriceInq.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("----data_matDesc----" + data_matDesc);
        oWMatDesc = gson.fromJson(data_matDesc, com.model.Zb2BPriceInqMatWraper.class);
        com.model.PriceInqMat dMatDesc = new com.model.PriceInqMat();
        com.model.PriceInqMat[] dAMatDesc = oWMatDesc.getD().getResults();
        System.out.println("----oWMatDesc----" + oWMatDesc);
        System.out.println("----dAMatDesc-- length----" + dAMatDesc.length);
        if (dAMatDesc.length > 0) {
            for (int j = 0; j < dAMatDesc.length; j++) {
                dMatDesc = dAMatDesc[j];
                o_descr = dMatDesc.getProductDescription();
                System.out.println("----mat desc====" + o_descr);
                break;
            }

        }
        System.out.println("-----o_descr---in--method" + o_descr);
        return o_descr;
    }

    public String[] getBook(String material, String authoriz) throws Exception, IOException {

        String url_mat = "";
        String o_collection = "";
        String o_brand = "";
        String data_mat = "";
        String matGrp = "";
        String url_bookDesc = "";
        String data_book = "";
        String url_Brand = "";
        String data_brand = "";
        String salsimu_url = "";
        String salsimu_data = "";
        String[] aBookFinal = new String[2];

        com.model.Zb2BPriceInqMatWraper oWBook = new com.model.Zb2BPriceInqMatWraper();
        com.model.Zb2BPriceInqMatWraper oWMat = new com.model.Zb2BPriceInqMatWraper();
        com.model.Zb2BPriceInqMatWraper oWBrand = new com.model.Zb2BPriceInqMatWraper();
        Gson gson = new Gson();
        try {
            url_mat = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_PRODUCT_SRV/A_Product?$format=json&$select=Product,ProductGroup&$filter=" + URLEncoder.encode("Product eq '" + material + "'", "UTF-8");
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Zb2BPriceInq.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("url_mat" + url_mat);

        try {
            data_mat = (String) this.getData(url_mat, authoriz);
            System.out.println("url_mat" + url_mat);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Zb2BPriceInq.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("----url_mat----" + url_mat);
        oWMat = gson.fromJson(data_mat, com.model.Zb2BPriceInqMatWraper.class);
        com.model.PriceInqMat dMat = new com.model.PriceInqMat();
        com.model.PriceInqMat[] dAMat = oWMat.getD().getResults();
        System.out.println("----oWMat----" + oWMat);
        System.out.println("----dAMatDesc-- length----" + dAMat.length);
        if (dAMat.length > 0) {
            for (int j = 0; j < dAMat.length; j++) {
                dMat = dAMat[j];
                matGrp = dMat.getProductGroup();
                System.out.println("----matGrp====" + matGrp);

                try {
                    url_bookDesc = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/YY1_ZBOOKS_CDS/YY1_ZBOOKS?$format=json&$select=Longtextdescribingthemateria,Brandcode,MaterialGroup&$filter=" + URLEncoder.encode("MaterialGroup eq '" + matGrp + "'", "UTF-8");
                } catch (Exception ex) {
                    java.util.logging.Logger.getLogger(Zb2BPriceInq.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("url_bookDesc" + url_bookDesc);

                try {
                    data_book = (String) this.getData(url_bookDesc, authoriz);
                    System.out.println("data_book" + data_book);
                } catch (Exception ex) {
                    java.util.logging.Logger.getLogger(Zb2BPriceInq.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("----data_book----" + data_book);
                oWBook = gson.fromJson(data_book, com.model.Zb2BPriceInqMatWraper.class);
                com.model.PriceInqMat dBook = new com.model.PriceInqMat();
                com.model.PriceInqMat[] dABook = oWBook.getD().getResults();
                System.out.println("----oWBook----" + oWBook);
                System.out.println("----dABook-- length----" + dABook.length);
                if (dABook.length > 0) {
                    for (int k = 0; k < dABook.length; k++) {
                        dBook = dABook[k];
                        o_collection = dBook.getLongtextdescribingthemateria();
                        String brand = dBook.getBrandcode();
                        try {
                            url_Brand = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/YY1_ZBRANDS_CDS/YY1_ZBRANDS?$format=json&$select=Brand,SAP_Description&$filter=" + URLEncoder.encode("Brand eq '" + brand + "'", "UTF-8");
                        } catch (Exception ex) {
                            java.util.logging.Logger.getLogger(Zb2BPriceInq.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println("url_Brand" + url_Brand);

                        try {
                            data_brand = (String) this.getData(url_Brand, authoriz);
                            System.out.println("data_brand" + data_brand);
                        } catch (Exception ex) {
                            java.util.logging.Logger.getLogger(Zb2BPriceInq.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println("----data_brand----" + data_brand);
                        oWBrand = gson.fromJson(data_brand, com.model.Zb2BPriceInqMatWraper.class);
                        com.model.PriceInqMat dBrand = new com.model.PriceInqMat();
                        com.model.PriceInqMat[] dABrand = oWBrand.getD().getResults();
                        System.out.println("----oWBrand----" + oWBrand);
                        System.out.println("----dABrand-- length----" + dABrand.length);
                        if (dABrand.length > 0) {
                            for (int m = 0; m < dABrand.length; m++) {
                                dBrand = dABrand[m];
                                o_brand = dBrand.getBrandDesc();
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            }

        }
        System.out.println("-----o_collection---in--method----" + o_collection);
        System.out.println("-----o_brand---in--method----" + o_brand);
//        String aFinal[] = new String[2];
//        aFinal[0] = o_collection;
//        aFinal[1] = o_brand;
//        System.out.println("---aFinal----" + aFinal);
        aBookFinal[0] = o_collection;
        aBookFinal[1] = o_brand;
        return aBookFinal;
    }

    public String[] getSalesSimu(String material, String authoriz) throws Exception, IOException {

        String url_Prod = "";
        String o_descr = "";
        String data_prod = "";
        String matGrp = "";
        String UMREZ_PRD = "";
        String[] aFinal = new String[2];
        Double roomlot = new Double(0);
        String caseNet = "";

        StringBuffer result_sim = new StringBuffer();
        com.model.Zb2BPriceInqWrapper outfinal = new com.model.Zb2BPriceInqWrapper();
        com.model.Zb2BPriceInqMatWraper oWProd = new com.model.Zb2BPriceInqMatWraper();
        com.model.Zb2BPriceInqMatWraper oWSim = new com.model.Zb2BPriceInqMatWraper();
        Gson gson = new Gson();
        String data_YY1_UMREZ_PRD = "";
        String url_YY1_UMREZ_PRD = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_PRODUCT_SRV/A_Product?$format=json&$select=Product,YY1_UMREZ_PRD&$filter=" + URLEncoder.encode("Product eq '" + material + "'", "UTF-8");
        data_YY1_UMREZ_PRD = (String) this.getData(url_YY1_UMREZ_PRD, authoriz);
        System.out.println("----data_YY1_UMREZ_PRD----" + data_YY1_UMREZ_PRD);
        oWProd = gson.fromJson(data_YY1_UMREZ_PRD, com.model.Zb2BPriceInqMatWraper.class);
        com.model.PriceInqMat dProd = new com.model.PriceInqMat();
        com.model.PriceInqMat[] dAProd = oWProd.getD().getResults();
        if (dAProd.length > 0) {
            for (int i = 0; i < dAProd.length; i++) {
                dProd = dAProd[i];
                UMREZ_PRD = dProd.getyY1_UMREZ_PRD();
                System.out.println("----UMREZ_PRD---" + UMREZ_PRD);
                break;
            }
        }

        String url = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_PRODUCT_SRV/A_Product?$format=json&$select=Product&$filter=" + URLEncoder.encode("Product eq '" + material + "'", "UTF-8");

        HttpGet request = new HttpGet(url);

        request.addHeader("User-Agent", "Java");
        request.addHeader("Content-Type", "application/json");
        request.addHeader("Accept", "application/json");
        request.addHeader("Authorization", authoriz);
        request.addHeader("X-CSRF-TOKEN", "FETCH");
        HttpClient client = HttpClientBuilder.create().build();
        HttpResponse respons = client.execute(request);
        String csrf = respons.getFirstHeader("X-CSRF-TOKEN").getValue();
        System.out.println("---csrf----" + csrf);
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
        String data = "";
        data = "{\"SalesOrderType\": \"OR\", \"DistributionChannel\": \"10\", \"SalesOrganization\": \"1000\", \"OrganizationDivision\": \"00\",\"PurchaseOrderByCustomer\": \"SalesOrder Simulation\", \"SoldToParty\": \"0010000108\", ";
        data = data + "\"to_Pricing\":{},\"to_Item\": [ { \"SalesOrderItem\": \"10\", \"RequestedQuantity\": \"1\",\"Material\": \"" + material + "\" },"
                + "{ \"SalesOrderItem\": \"20\", \"RequestedQuantity\": \"" + UMREZ_PRD + "\",\"Material\": \"" + material + "\" }]}";
        System.out.println("----simu_payload---" + data);
        try {
            url_Prod = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_SALES_ORDER_SIMULATION_SRV/A_SalesOrderSimulation";
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Zb2BPriceInq.class.getName()).log(Level.SEVERE, null, ex);
        }
        HttpPost pReq = new HttpPost(url_Prod);
        pReq.addHeader("Content-Type", "application/json");
        pReq.addHeader("Accept", "application/json");
        pReq.addHeader("X-CSRF-TOKEN", csrf);
        pReq.setEntity(new StringEntity(data));
        respons = client.execute(pReq);
        BufferedReader rd = new BufferedReader(new InputStreamReader(respons.getEntity().getContent()));

        if (201 == respons.getStatusLine().getStatusCode()) {
            InputStreamReader in = new InputStreamReader(respons.getEntity().getContent());
            BufferedReader rdSim = new BufferedReader(in);
            String line = "";
            while ((line = rdSim.readLine()) != null) {
                result_sim.append(line);
            }
            System.out.println("--result_sim----" + result_sim);

            com.model.Zsimulation sumu = new com.model.Zsimulation();
            sumu = gson.fromJson(result_sim.toString(), sumu.getClass());
            System.out.println("--sumu----" + sumu);
            com.model.SimulationToItemDetail[] res = sumu.getD().getTo_Item().getResults();
            com.model.SimulationToItemDetail res1 = res[0];
            com.model.SimulationToItemDetail res2 = res[1];
            outfinal.setO_caseNet(res1.getNetAmount());
            caseNet = res1.getNetAmount();
            roomlot = new Double(res2.getSubtotal3Amount()) / new Double(UMREZ_PRD);
            System.out.println("roomlot" + roomlot);
            outfinal.setO_roomNet(roomlot + "");
            System.out.println("roomlot" + roomlot);
            System.out.println("Caselot" + outfinal.getO_caseNet());
        }
        aFinal[1] = roomlot.toString();
        aFinal[0] = caseNet;
        return aFinal;
    }

}
