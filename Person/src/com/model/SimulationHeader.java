/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.google.gson.annotations.SerializedName;

public class SimulationHeader {

    @SerializedName("to_Item")
    private SimulationToItem to_Item = null;

    public SimulationToItem getTo_Item() {
        return to_Item;
    }

    public void setTo_Item(SimulationToItem to_Item) {
        this.to_Item = to_Item;
    }

    @Override
    public String toString() {
        return "SimulationHeader{" + "to_Item=" + to_Item + '}';
    }

}
