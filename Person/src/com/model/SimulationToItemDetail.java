/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.MetaData;
import com.google.gson.annotations.SerializedName;

public class SimulationToItemDetail {

    @SerializedName("NetAmount")
    private String netAmount = null;

    @SerializedName("Subtotal3Amount")
    private String subtotal3Amount = null;

    public String getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(String netAmount) {
        this.netAmount = netAmount;
    }

    public String getSubtotal3Amount() {
        return subtotal3Amount;
    }

    public void setSubtotal3Amount(String subtotal3Amount) {
        this.subtotal3Amount = subtotal3Amount;
    }

    @Override
    public String toString() {
        return "SimulationToItemDetail{" + "netAmount=" + netAmount + ", subtotal3Amount=" + subtotal3Amount + '}';
    }

}
