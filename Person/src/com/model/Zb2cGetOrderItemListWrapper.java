/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.sap.apibhub.sdk.api_sales_order_srv.model.APISALESORDERSRVASalesOrderItemType;
import java.util.List;

/**
 *
 * @author SrinivasBu
 */
public class Zb2cGetOrderItemListWrapper {
    String restlt = "";
     List<APISALESORDERSRVASalesOrderItemType> itemList = null;

    public String getRestlt() {
        return restlt;
    }

    public void setRestlt(String restlt) {
        this.restlt = restlt;
    }

    public List<APISALESORDERSRVASalesOrderItemType> getItemList() {
        return itemList;
    }

    public void setItemList(List<APISALESORDERSRVASalesOrderItemType> itemList) {
        this.itemList = itemList;
    }

    @Override
    public String toString() {
        return "Zb2cGetOrderIteLlist{" + "restlt=" + restlt + ", itemList=" + itemList + '}';
    }
    
}
