package com.model;

import com.google.gson.annotations.SerializedName;

public class Zsimulation {

    @SerializedName("d")
    private SimulationHeader d = null;

    public SimulationHeader getD() {
        return d;
    }

    public void setD(SimulationHeader d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Zsimulation{" + "d=" + d + '}';
    }

}
