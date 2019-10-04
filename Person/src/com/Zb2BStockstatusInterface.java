package com;

import com.model.Zb2BStockStatusWrapper;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.naming.AuthenticationException;

@WebService(name = "Z_B2B_STOCK_STATUS")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)

public interface Zb2BStockstatusInterface {

    @WebMethod(operationName = "stockStatus")
    public com.model.Zb2BStockStatusWrapper Zb2BStockStatus(@WebParam(name = "customer") String customer,@WebParam(name = "material") String material,@WebParam(name = "quantity") int quantity,@WebParam(name = "batch") String batch,@WebParam(name = "sample") String sample, @WebParam(name = "calltype") String calltype) throws Exception;

}
