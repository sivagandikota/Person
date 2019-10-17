package com;

import java.util.ArrayList;

import javax.naming.AuthenticationException;
import javax.xml.ws.Response;

import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.ws.addressing.WSAddressingFeature;

import com.model.Zb2CWpopShipmentWrapper;
import com.sap.xi.edi.supplier.OrderRequestIn;

public class Z_WPOP_SHIPMENTS_FILE_test {

	public static void main(String[] args) {
		 JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
	        LoggingInInterceptor loggingInInterceptor = new LoggingInInterceptor();
	        loggingInInterceptor.setPrettyLogging(true);
	        LoggingOutInterceptor loggingOutInterceptor = new LoggingOutInterceptor();
	        loggingOutInterceptor.setPrettyLogging(true);
	        LoggingOutInterceptor loggingOutfaultInterceptor = new LoggingOutInterceptor();
	        loggingOutInterceptor.setPrettyLogging(true);
	        LoggingOutInterceptor loggingInfaultInterceptor = new LoggingOutInterceptor();
	        loggingOutInterceptor.setPrettyLogging(true);
	        factory.getInInterceptors().add(loggingInInterceptor);
	        factory.getOutInterceptors().add(loggingOutInterceptor);
	        factory.getOutFaultInterceptors().add(loggingOutfaultInterceptor);
	        factory.getInFaultInterceptors().add(loggingInfaultInterceptor);
	        factory.setServiceClass(OrderRequestIn.class);
	        //factory.setWsdlLocation(Service.class.getResource("../../../../../ORDERREQUEST_IN.wsdl").getFile());
	        factory.setAddress("http://localhost:8080/Person/ws/Z_WPOP_SHIPMENTS_FILE?wsdl");
	        factory.setBindingId("http://www.w3.org/2003/05/soap/bindings/HTTP/");
	        factory.getFeatures().add(new WSAddressingFeature());

	        Zb2CWpopShipmentInterface portl = (Zb2CWpopShipmentInterface) factory.create();

	        org.apache.cxf.endpoint.Client clientl = ClientProxy.getClient(portl);
	        HTTPConduit http = (HTTPConduit) clientl.getConduit();

	        
			 http.getAuthorization().setUserName("BHF_COMM"); 
			 http.getAuthorization().setPassword("nBhLsiwWXmfwqmX)FDLRUA6SwdCitAXUswwZwLqX"); 
			 
	        org.apache.cxf.endpoint.Endpoint cxfEndpointl = clientl.getEndpoint();
	        org.apache.cxf.service.Service serv = cxfEndpointl.getService();
	        // polling method
	        System.out.println("Invoking changeStudentAsync using polling...");
	        Response<Zb2CWpopShipmentWrapper> changeStudentResp=null;
			try {
				changeStudentResp = portl.getResendWpopShipmentsAsync(new ArrayList<String>(),
						new ArrayList<String>(), "2019-07-13", "2019-08-15");
		        while (true) {
		            if (changeStudentResp.isDone()) {
		            	Zb2CWpopShipmentWrapper reply = changeStudentResp.get();
		                System.out.println("Server responded through polling with: "
		                        + reply.toString());
		                break;
		            } else {
		                Thread.sleep(1000);
		                System.out.println("Polling %%%%%%%%%%%%%%%");
		            }

		        }
			} catch (AuthenticationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}





	}

}
