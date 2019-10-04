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
public class OrderListGetUserName {
    @SerializedName("__metadata")
    private MetaData metadata = null;

    @SerializedName("PersonFullName")
    private String personFullName = null;

    @SerializedName("UserID")
    private String userID = null;

    public MetaData getMetadata() {
        return metadata;
    }

    public void setMetadata(MetaData metadata) {
        this.metadata = metadata;
    }

    public String getPersonFullName() {
        return personFullName;
    }

    public void setPersonFullName(String personFullName) {
        this.personFullName = personFullName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "OrderListGetUserName{" + "metadata=" + metadata + ", personFullName=" + personFullName + ", userID=" + userID + '}';
    }
    
}
