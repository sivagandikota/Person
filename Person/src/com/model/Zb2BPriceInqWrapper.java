package com.model;

public class Zb2BPriceInqWrapper {

    String O_result = "";
    String O_roomNet = "";
    String O_caseNet = "";
    String o_descr = "";
    String o_brand = "";
    String o_collection = "";

    public String getO_result() {
        return O_result;
    }

    public void setO_result(String O_result) {
        this.O_result = O_result;
    }

    public String getO_roomNet() {
        return O_roomNet;
    }

    public void setO_roomNet(String O_roomNet) {
        this.O_roomNet = O_roomNet;
    }

    public String getO_caseNet() {
        return O_caseNet;
    }

    public void setO_caseNet(String O_caseNet) {
        this.O_caseNet = O_caseNet;
    }

    public String getO_descr() {
        return o_descr;
    }

    public void setO_descr(String o_descr) {
        this.o_descr = o_descr;
    }

    public String getO_brand() {
        return o_brand;
    }

    public void setO_brand(String o_brand) {
        this.o_brand = o_brand;
    }

    public String getO_collection() {
        return o_collection;
    }

    public void setO_collection(String o_collection) {
        this.o_collection = o_collection;
    }

    @Override
    public String toString() {
        return "Zb2BPriceInqWrapper{" + "O_result=" + O_result + ", O_roomNet=" + O_roomNet + ", O_caseNet=" + O_caseNet + ", o_descr=" + o_descr + ", o_brand=" + o_brand + ", o_collection=" + o_collection + '}';
    }

}
