package com;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import javax.annotation.Resource;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Zb2BStockStatus implements Zb2BStockstatusInterface {

    @Resource
    public WebServiceContext wsctx;
    Logger logger = LoggerFactory.getLogger(Zb2BStockStatus.class);

    @Override
    public com.model.Zb2BStockStatusWrapper Zb2BStockStatus(String customer, String material, int quantity, String batch, String sample, String calltype) throws Exception {

        MessageContext mctx = wsctx.getMessageContext();
        Map http_headers = (Map) mctx.get(MessageContext.HTTP_REQUEST_HEADERS);
        System.out.println(Arrays.toString(http_headers.keySet().toArray()));
        System.out.println(Arrays.toString(http_headers.values().toArray()));
        List userList = (List) http_headers.get("Username");
        List passList = (List) http_headers.get("Password");
        ArrayList authList = (ArrayList) http_headers.get("Authorization");
        String csrf = null;
        String username = "";
        String password = "";
        String authoriz = "";

        Gson gson = new Gson();
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
        authoriz = "Basic QkhGX0NPTU06bkJoTHNpd1dYbWZ3cW1YKUZETFJVQTZTd2RDaXRBWFVzd3dad0xxWA==";
        com.model.Zb2BStockStatusWrapper oWStock = new com.model.Zb2BStockStatusWrapper();
        com.model.Zb2BStockStatusWrapper oWMat = new com.model.Zb2BStockStatusWrapper();
        com.model.Zb2BStockStatusWrapper oWMatSales = new com.model.Zb2BStockStatusWrapper();
        com.model.Zb2BStockStatusWrapper oWMatDesc = new com.model.Zb2BStockStatusWrapper();
        com.model.Zb2BStockStatusWrapper oWBrand = new com.model.Zb2BStockStatusWrapper();
        com.model.Zb2BStockStatusWrapper oWBook = new com.model.Zb2BStockStatusWrapper();
        com.model.Zb2BStockStatusWrapper oWAvailStock = new com.model.Zb2BStockStatusWrapper();
        DataOutputStream dataOut = null;
        BufferedReader br = null;
        InputStreamReader in = null;
        String salesOrg = "";
        String distChan = "";
        String data_saleOrg = "";
        String url_mat = "";
        String data_mat = "";
        String O_DESCR = "";
        String O_RESULT = "";
        String O_BODATE = "";
        String O_PRICECODE = "";
        String O_BRAND = "";
        String matGrp = "";
        int lv_mod;
        String url_brand = "";
        String data_brand = "";
        String url_availStock = "";
        String data_availStock = "";
        String url_book = "";
        String data_matSales = "";
        String sampleMat = "";
        String data_book = "";
        String itemCat = "";
        String BASE_URL = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_BUSINESS_PARTNER/A_CustomerSalesArea?$format=json&$select=Customer,SalesOrganization,DistributionChannel&$filter=" + URLEncoder.encode("Customer eq '" + customer + "'", "UTF-8");
        data_saleOrg = (String) this.getData(BASE_URL, authoriz);
        System.out.println("----data_saleOrg----" + data_saleOrg);
        oWStock = gson.fromJson(data_saleOrg, com.model.Zb2BStockStatusWrapper.class);
        System.out.println("-----oWStock----" + oWStock);
        com.model.StockStatus dStock = new com.model.StockStatus();
        com.model.StockStatus[] dAStock = oWStock.getD().getResults();
        System.out.println("-----dAStock--length--" + dAStock);
        if (dAStock.length > 0) {
            for (int i = 0; i < dAStock.length; i++) {
                dStock = dAStock[i];
                salesOrg = dStock.getSalesOrganization();
                distChan = dStock.getDistributionChannel();
                break;
            }
        }
        url_mat = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_PRODUCT_SRV/A_Product?$format=json&$select=Product,ProductGroup,BaseUnit,YY1_Mara_Sample_ind_PRD&$filter=" + URLEncoder.encode("Product eq '" + material + "'", "UTF-8");
        data_mat = (String) this.getData(url_mat, authoriz);
        System.out.println("---data_mat---" + data_mat);
        oWMat = gson.fromJson(data_mat, com.model.Zb2BStockStatusWrapper.class);
        System.out.println("-----oWMat----" + oWMat);
        com.model.StockStatus dMat = new com.model.StockStatus();
        com.model.StockStatus[] dAMat = oWMat.getD().getResults();
        if (dAMat.length > 0) {
            for (int j = 0; j < dAMat.length; j++) {
                dMat = dAMat[j];
                matGrp = dMat.getProductGroup();
                sampleMat = dMat.getSampleMat();
                O_BRAND = this.getBook(material, authoriz);
                O_DESCR = this.getMatDesc(material, authoriz);
                data_matSales = this.getMatSales(material, salesOrg, authoriz);
                oWMatSales = gson.fromJson(data_matSales, com.model.Zb2BStockStatusWrapper.class);
                System.out.println("-----oWMatSales----" + oWMatSales);
                com.model.StockStatus dMatSales = new com.model.StockStatus();
                com.model.StockStatus[] dAMatSales = oWMatSales.getD().getResults();
                if (dAMatSales.length > 0) {
                    for (int k = 0; k < dAMatSales.length; k++) {
                        dMatSales = dAMatSales[k];
                        O_PRICECODE = dMatSales.getProductHierarchy();
                        itemCat = dMatSales.getItemCategoryGroup();
                        float delQtyF = Float.parseFloat(dMatSales.getDeliveryQuantity());
                        int delQty = (int) Math.round(delQtyF);
                        System.out.println("-----sampleMat----" + sampleMat);
                        System.out.println("-----delQty----" + delQty);
                        if (sampleMat.equals("true")) {
                            O_RESULT = "SMP";
                            break;
                        } else {
                            if (delQty > 1 & sample.isEmpty()) {
                                lv_mod = quantity % delQty;
                                if (lv_mod != 0) {
                                    O_RESULT = "NSR";
                                    break;
                                }
                            } else {
                                if (itemCat.equals("BANS") || itemCat.equals("BANC")) {
                                    O_RESULT = "FAC";
                                    break;
                                } else {
//                                    url_availStock = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_PRODUCT_AVAILY_INFO_BASIC/CalculateAvailabilityTimeseries?" + URLEncoder.encode("ATPCheckingRule='A'&Material='" + material + "'&SupplyingPlant='1000'&$format=json", "UTF-8");
                                    url_availStock = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_PRODUCT_AVAILY_INFO_BASIC/CalculateAvailabilityTimeseries?ATPCheckingRule='A'&Material='" + material + "'&SupplyingPlant='1000'&$format=json";
                                    System.out.println("----url_availStock----" + url_availStock);
                                    data_availStock = (String) this.getData(url_availStock, authoriz);
                                    System.out.println("---data_availStock----" + data_availStock);
                                    oWAvailStock = gson.fromJson(data_availStock, com.model.Zb2BStockStatusWrapper.class);
                                    System.out.println("-----oWAvailStock----" + oWAvailStock);
                                    com.model.StockStatus dAvailStock = new com.model.StockStatus();
                                    com.model.StockStatus[] dAAvailStock = oWAvailStock.getD().getResults();
                                    if (dAAvailStock.length > 0) {
                                        for (int h = 0; h < dAAvailStock.length; h++) {
                                            dAvailStock = dAAvailStock[h];
                                            System.out.println("---avail stock---" + dAvailStock.getAvailableQuantityInBaseUnit());
                                            dMat.setAvailableQuantityInBaseUnit(dAvailStock.getAvailableQuantityInBaseUnit());
                                            break;
                                        }
                                    }
                                    System.out.println("--Srinivas---");
                                }
                            }
                        }
                    }
                }
                break;
            }
        }

        System.out.println("---data_matSales---" + data_matSales);
        System.out.println("---o_brand---" + O_BRAND);
        System.out.println("---O_PRICECODE---" + O_PRICECODE);
        System.out.println("---O_RESULT---" + O_RESULT);
        System.out.println("---O_DESCR---" + O_DESCR);
        System.out.println("---salesOrg---" + salesOrg);
        System.out.println("---itemCategory---" + itemCat);
        oWMat.setO_descr(O_DESCR);
        oWMat.setO_brand(O_BRAND);
        oWMat.setO_bodat(O_BODATE);
        oWMat.setO_pricecode(O_PRICECODE);
        oWMat.setO_result(O_RESULT);
        return oWMat;
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

    public String getBook(String material, String authoriz) throws Exception, IOException {

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

        com.model.Zb2BStockStatusWrapper oWBook = new com.model.Zb2BStockStatusWrapper();
        com.model.Zb2BStockStatusWrapper oWMat = new com.model.Zb2BStockStatusWrapper();
        com.model.Zb2BStockStatusWrapper oWBrand = new com.model.Zb2BStockStatusWrapper();
        Gson gson = new Gson();
        try {
            url_mat = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_PRODUCT_SRV/A_Product?$format=json&$select=Product,ProductGroup&$filter=" + URLEncoder.encode("Product eq '" + material + "'", "UTF-8");
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Zb2BStockStatus.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("url_mat" + url_mat);

        try {
            data_mat = (String) this.getData(url_mat, authoriz);
            System.out.println("url_mat" + url_mat);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Zb2BStockStatus.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("----url_mat----" + url_mat);
        oWMat = gson.fromJson(data_mat, com.model.Zb2BStockStatusWrapper.class);
        com.model.StockStatus dMat = new com.model.StockStatus();
        com.model.StockStatus[] dAMat = oWMat.getD().getResults();
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
                    java.util.logging.Logger.getLogger(Zb2BStockStatus.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("url_bookDesc" + url_bookDesc);

                try {
                    data_book = (String) this.getData(url_bookDesc, authoriz);
                    System.out.println("data_book" + data_book);
                } catch (Exception ex) {
                    java.util.logging.Logger.getLogger(Zb2BStockStatus.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("----data_book----" + data_book);
                oWBook = gson.fromJson(data_book, com.model.Zb2BStockStatusWrapper.class);
                com.model.StockStatus dBook = new com.model.StockStatus();
                com.model.StockStatus[] dABook = oWBook.getD().getResults();
                System.out.println("----oWBook----" + oWBook);
                System.out.println("----dABook-- length----" + dABook.length);
                if (dABook.length > 0) {
                    for (int k = 0; k < dABook.length; k++) {
                        dBook = dABook[k];
                        String brand = dBook.getBrandcode();
                        try {
                            url_Brand = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/YY1_ZBRANDS_CDS/YY1_ZBRANDS?$format=json&$select=Brand,SAP_Description&$filter=" + URLEncoder.encode("Brand eq '" + brand + "'", "UTF-8");
                        } catch (Exception ex) {
                            java.util.logging.Logger.getLogger(Zb2BStockStatus.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println("url_Brand" + url_Brand);

                        try {
                            data_brand = (String) this.getData(url_Brand, authoriz);
                            System.out.println("data_brand" + data_brand);
                        } catch (Exception ex) {
                            java.util.logging.Logger.getLogger(Zb2BStockStatus.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println("----data_brand----" + data_brand);
                        oWBrand = gson.fromJson(data_brand, com.model.Zb2BStockStatusWrapper.class);
                        com.model.StockStatus dBrand = new com.model.StockStatus();
                        com.model.StockStatus[] dABrand = oWBrand.getD().getResults();
                        System.out.println("----oWBrand----" + oWBrand);
                        System.out.println("----dABrand-- length----" + dABrand.length);
                        if (dABrand.length > 0) {
                            for (int m = 0; m < dABrand.length; m++) {
                                dBrand = dABrand[m];
                                o_brand = dBrand.getBrand_Desc();
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

        return o_brand;
    }

    public String getMatDesc(String material, String authoriz) throws Exception, IOException {

        String url_mat = "";
        String data_mat = "";
        String o_desc = "";
        com.model.Zb2BStockStatusWrapper oWMat = new com.model.Zb2BStockStatusWrapper();

        Gson gson = new Gson();
        url_mat = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_PRODUCT_SRV/A_ProductDescription?$format=json&$select=Product,ProductDescription&$filter=" + URLEncoder.encode("Product eq '" + material + "' and Language eq 'EN'", "UTF-8");

        System.out.println("url_mat" + url_mat);

        data_mat = (String) this.getData(url_mat, authoriz);

        oWMat = gson.fromJson(data_mat, com.model.Zb2BStockStatusWrapper.class);
        com.model.StockStatus dMat = new com.model.StockStatus();
        com.model.StockStatus[] dAMat = oWMat.getD().getResults();
        System.out.println("----oWMat----" + oWMat);
        System.out.println("----dAMatDesc-- length----" + dAMat.length);
        if (dAMat.length > 0) {
            for (int j = 0; j < dAMat.length; j++) {
                dMat = dAMat[j];
                o_desc = dMat.getProductDescription();
                break;
            }
        }
        System.out.println("-----o_desc---in--method----" + o_desc);

        return o_desc;
    }

    public String getMatSales(String material, String salesOrg, String authoriz) throws Exception, IOException {

        String url_matSales = "";
        String data_matSales = "";
        String o_desc = "";
        com.model.Zb2BStockStatusWrapper oWMat = new com.model.Zb2BStockStatusWrapper();

        Gson gson = new Gson();
        url_matSales = "https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_PRODUCT_SRV/A_ProductSalesDelivery?$format=json&$select=Product,ProductSalesOrg,ProductDistributionChnl,DeliveryQuantity,ItemCategoryGroup,ProductHierarchy&$filter=" + URLEncoder.encode("Product eq '" + material + "' and ProductDistributionChnl eq '10' and ProductSalesOrg eq '" + salesOrg + "'", "UTF-8");
        data_matSales = (String) this.getData(url_matSales, authoriz);
        System.out.println("----data_matSales----" + data_matSales);

        return data_matSales;
    }
}
