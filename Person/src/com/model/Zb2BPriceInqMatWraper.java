package com.model;

import com.google.gson.annotations.SerializedName;

public class Zb2BPriceInqMatWraper {

    @SerializedName("d")
    private CollectionOfPriceInqMat d = null;

    public CollectionOfPriceInqMat getD() {
        return d;
    }

    public void setD(CollectionOfPriceInqMat d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Zb2BPriceInqMatWraper{" + "d=" + d + '}';
    }
}
