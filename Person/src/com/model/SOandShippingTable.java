/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.util.HashMap;

/**
 *
 * @author Sivag
 */
public class SOandShippingTable {
    private String salesOrderId;
    private java.util.HashMap shippingConditonTable = new java.util.HashMap();
    private String status;
    
    public String getSalesOrderId() {
        return salesOrderId;
    }

    public void setSalesOrderId(String salesOrderId) {
        this.salesOrderId = salesOrderId;
    }

    public HashMap getShippingConditonTable() {
        return shippingConditonTable;
    }

    public void setShippingConditonTable(HashMap shippingConditonTable) {
        this.shippingConditonTable = shippingConditonTable;
    }

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "SOandShippingTable [salesOrderId=" + salesOrderId + ", shippingConditonTable=" + shippingConditonTable
				+ ", status=" + status + "]";
	}

    
    
    
}
