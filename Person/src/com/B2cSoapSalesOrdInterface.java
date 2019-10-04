/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.sap.xi.edi.Address;
import com.sap.xi.edi.Amount;
import com.sap.xi.edi.SalesOrderItem;
import com.sap.xi.edi.PaymentCard;
import com.sap.xi.edi.SalesOrderMessage;
import java.util.List;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlElement;
import com.sap.xi.edi.Text;

/**
 *@XmlElement(required=true)
 * @author Sivag
 */
@WebService(name = "Z_WPOP_CREATE_ORDER")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use=SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface B2cSoapSalesOrdInterface {
    public void salesOrderCreate(
            @XmlElement(required=true)@WebParam(name = "shipping")String shipping,
            @XmlElement(required=true)@WebParam(name = "freightAmount")Amount freightAmount,
            @XmlElement(required=true)@WebParam(name = "taxAmount")Amount taxAmount,
            @XmlElement(required=true)@WebParam(name = "discountAmount")Amount discountAmount,
            @XmlElement(required=true)@WebParam(name = "totalAmount")Amount totalAmount,
            @XmlElement(required=true)@WebParam(name = "poNumber")String poNumber,
            @XmlElement(required=true)@WebParam(name = "address")Address address,
            @XmlElement(required=true)@WebParam(name = "phone")String phone,
            @XmlElement(required=true)@WebParam(name = "email")String email,
            @XmlElement(required=true)@WebParam(name = "site")String site,
            @WebParam(name = "dealer")String dealer,
            @WebParam(name = "coupon")String coupon,
            @WebParam(name = "shipToStore")String shipToStore,
            @WebParam(name = "block")String block,
            @WebParam(name = "payeeAddress")Address payeeAddress,
            @WebParam(name = "comments")Text[] comments,
            @XmlElement(required=true)@WebParam(name = "orderItems")SalesOrderItem[] orderItems,
            @WebParam(name = "card")PaymentCard card) throws Exception;
}
