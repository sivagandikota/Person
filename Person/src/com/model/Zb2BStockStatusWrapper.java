/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.google.gson.annotations.SerializedName;

public class Zb2BStockStatusWrapper {

    @SerializedName("d")
    private CollectionOfStock d = null;

    String o_result = "";
    String o_descr = "";
    String o_bodat = "";
    String o_brand = "";
    String o_pricecode = "";

    public CollectionOfStock getD() {
        return d;
    }

    public void setD(CollectionOfStock d) {
        this.d = d;
    }

    public String getO_result() {
        return o_result;
    }

    public void setO_result(String o_result) {
        this.o_result = o_result;
    }

    public String getO_descr() {
        return o_descr;
    }

    public void setO_descr(String o_descr) {
        this.o_descr = o_descr;
    }

    public String getO_bodat() {
        return o_bodat;
    }

    public void setO_bodat(String o_bodat) {
        this.o_bodat = o_bodat;
    }

    public String getO_brand() {
        return o_brand;
    }

    public void setO_brand(String o_brand) {
        this.o_brand = o_brand;
    }

    public String getO_pricecode() {
        return o_pricecode;
    }

    public void setO_pricecode(String o_pricecode) {
        this.o_pricecode = o_pricecode;
    }

    @Override
    public String toString() {
        return "Zb2BStockStatusWrapper{" + "d=" + d + ", o_result=" + o_result + ", o_descr=" + o_descr + ", o_bodat=" + o_bodat + ", o_brand=" + o_brand + ", o_pricecode=" + o_pricecode + '}';
    }
}
