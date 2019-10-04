/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author Shivas
 */
public class Zb2BPriceInqValidCustWraper {
    @SerializedName("d")
    private CollectionOfValidCustWraper  d= null;

    public CollectionOfValidCustWraper getD() {
        return d;
    }

    public void setD(CollectionOfValidCustWraper d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Zb2BPriceInqValidCustWraper{" + "d=" + d + '}';
    }
    
}
