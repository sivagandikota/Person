/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.model.CollectionOfDeliveryDocument;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author SrinivasBu
 */
public class Zb2CWpopShipmentWrapper {

    @SerializedName("d")
    private CollectionOfDeliveryDocument  d= null;

    public CollectionOfDeliveryDocument getD() {
        return d;
    }

    public void setD(CollectionOfDeliveryDocument d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Zb2CWpopShipmentWrapper{" + "d=" + d + '}';
    }

}
