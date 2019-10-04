/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.google.gson.annotations.SerializedName;
import java.util.Arrays;

public class SimulationToItem {

    @SerializedName("results")
    private SimulationToItemDetail[] results = null;

    public SimulationToItemDetail[] getResults() {
        return results;
    }

    public void setResults(SimulationToItemDetail[] results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "SimulationToItem{" + "results=" + Arrays.toString(results) + '}';
    }

}
