/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.util.ArrayList;

/**
 *
 * @author SrinivasBu
 */
public class OrderInqFinalList {

    String O_RESULT = "";
    OrdersInqGetSO[] address = null;
    OrdersInqGetSOItem[] orderList = null;
    OrderInqPO[] track = null;

    public String getO_RESULT() {
        return O_RESULT;
    }

    public void setO_RESULT(String O_RESULT) {
        this.O_RESULT = O_RESULT;
    }

    public OrdersInqGetSO[] getAddress() {
        return address;
    }

    public void setAddress(OrdersInqGetSO[] address) {
        this.address = address;
    }

    public OrdersInqGetSOItem[] getOrderList() {
        return orderList;
    }

    public void setOrderList(OrdersInqGetSOItem[] orderList) {
        this.orderList = orderList;
    }

    public OrderInqPO[] getTrack() {
        return track;
    }

    public void setTrack(OrderInqPO[] track) {
        this.track = track;
    }

    @Override
    public String toString() {
        return "OrderInqFinalList{" + "O_RESULT=" + O_RESULT + ", address=" + address + ", orderList=" + orderList + ", track=" + track + '}';
    }

}
