/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.MetaData;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author SrinivasBu
 */
public class OrdersInq {
    @SerializedName("__metadata")
    private MetaData metadata = null;

    @SerializedName("SalesOrganization")
    private String salesOrganization = null;

}
