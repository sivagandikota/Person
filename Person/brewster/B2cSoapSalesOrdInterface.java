/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brewster;

import com.model.orderrequest.PaymentCard;
import com.model.orderrequest.SalesOrderItem;
import com.model.orderrequest.Text;
import java.util.List;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

/**
 *@XmlElement(required=true)
 * @author Sivag
 */
@WebService(name = "Z_WPOP_CREATE_ORDER", targetNamespace = "http://com")
public interface B2cSoapSalesOrdInterface {
    public com.model.orderrequest.SalesOrderMessage salesOrderBulkRequestIn(
            @WebParam(name = "shipping")String shipping,
            @WebParam(name = "freightAmount")com.model.orderrequest.Amount freightAmount,
            @WebParam(name = "taxAmount")com.model.orderrequest.Amount taxAmount,
            @WebParam(name = "discountAmount")com.model.orderrequest.Amount discountAmount,
            @WebParam(name = "totalAmount")com.model.orderrequest.Amount totalAmount,
            @WebParam(name = "poNumber")String poNumber,
            @WebParam(name = "address")com.model.orderrequest.Address address,
            @WebParam(name = "phone")String phone,
            @WebParam(name = "email")String email,
            @WebParam(name = "site")String site,
            @WebParam(name = "dealer")String dealer,
            @WebParam(name = "coupon")String coupon,
            @WebParam(name = "shipToStore")String shipToStore,
            @WebParam(name = "block")String block,
            @WebParam(name = "payeeAddress")com.model.orderrequest.Address payeeAddress,
            @WebParam(name = "comments")List<Text> comments,
            @WebParam(name = "orderItems")List<SalesOrderItem> orderItems,
            @WebParam(name = "card")PaymentCard card) throws Exception;
}
