package com;

import javax.servlet.ServletConfig;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.BusFactory;
import org.apache.cxf.transport.servlet.CXFNonSpringServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sap.cloud.sdk.cloudplatform.connectivity.Destination;
import com.sap.cloud.sdk.cloudplatform.connectivity.DestinationAccessor;
import com.sap.cloud.sdk.cloudplatform.connectivity.DestinationAccessor;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.Order;
import com.sap.cloud.sdk.odatav2.connectivity.ODataException;

//import com.sap.cloud.sdk.s4hana.connectivity.DefaultErpHttpDestination;
//import com.sap.cloud.sdk.s4hana.connectivity.ErpHttpDestination;
import com.sap.cloud.sdk.s4hana.datamodel.odata.namespaces.businesspartner.BusinessPartner;
import com.sap.cloud.sdk.s4hana.datamodel.odata.services.DefaultBusinessPartnerService;

public class CxfNonSpringSimpleServlet extends CXFNonSpringServlet {
	 private static final long serialVersionUID = 1L;
	 Logger logger = LoggerFactory.getLogger(CxfNonSpringSimpleServlet.class);
	  @Override
	  public void loadBus(ServletConfig servletConfig) {
	    super.loadBus(servletConfig);
	    Bus bus = getBus();
	    BusFactory.setDefaultBus(bus);
	    Endpoint.publish("/Z_B2B_CUST_INQ", new com.Zb2BCustInq());
	    //Endpoint.publish("/Z_B2B_ADD_ORDER_ITEM", new com.Zb2BAddOrderItem());
	    //Endpoint.publish("/Z_B2B_OPEN_NEW_ORDER", new com.Zb2BOpenNewOrder());
	    Endpoint.publish("/Z_WPOP_SKU_ORIGIN", new ZwPopSkuOrigin());
	    Endpoint.publish("/Z_RTN_GET_ORDER_ITEMS", new com.Zb2C_RTN_GET_ORDER_ITEMS());
        Endpoint.publish("/Z_WPOP_CREATE_ORDER", new com.B2cSoapSalesOrd());
        Endpoint.publish("/B2B", new com.B2B());
        Endpoint.publish("/Z_WPOP_SHIPMENTS_FILE", new com.Zb2CWpopShipment());
        Endpoint.publish("/Z_B2B_ORDER_LIST", new com.Zb2BOrderList());
        Endpoint.publish("/Z_B2B_ORDER_INQ", new com.Zb2BOrderInq());
        Endpoint.publish("/Z_B2B_PRICE_INQUIRY", new com.Zb2BPriceInq());
        Endpoint.publish("/Z_B2B_STOCK_STATUS", new Zb2BStockStatus());
       
       
	  }
	  
}
