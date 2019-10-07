package com;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NameClassPair;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.sap.cloud.sdk.cloudplatform.connectivity.Destination;
import com.sap.cloud.sdk.cloudplatform.connectivity.DestinationAccessor;
import com.sap.cloud.sdk.cloudplatform.connectivity.DestinationFacade;
import com.sap.cloud.sdk.s4hana.connectivity.ErpConfigContext;
import com.sap.core.connectivity.api.configuration.ConnectivityConfiguration;
import com.sap.core.connectivity.api.authentication.AuthenticationHeaderProvider;


/**
 * Servlet implementation class DestinationConnection
 */
@WebServlet("/DestinationConnection")
public class DestinationConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static String destination = "SCP_DEV" ;
	public static String host="https://my302314.s4hana.ondemand.com";
	Logger logger = LoggerFactory.getLogger(DestinationConnection.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DestinationConnection() {
        super();
        try{String dest=System.getProperty("destination");
        	logger.info("dest:"+dest);
        	System.out.println("dest:"+dest);
        	DestinationConnection.destination=dest;
        }catch(Exception e) {e.printStackTrace();}
        try{
        	Context ctx = new InitialContext();
        	ConnectivityConfiguration config = (ConnectivityConfiguration) ctx.lookup("java:comp/env/ConnectivityConfiguration");
        	DestinationConnection.host=config.getConfiguration(DestinationConnection.destination).getProperty("URL");
        	logger.info("destination:"+DestinationConnection.destination);
        	logger.info("URL:"+DestinationConnection.host);
        }catch(Exception e) {e.printStackTrace();}
        logger.info("Const - destination:"+DestinationConnection.destination);
        logger.info("Const - host:"+DestinationConnection.host);
        System.out.println("Const - destination:"+DestinationConnection.destination);
        System.out.println("Const - host:"+DestinationConnection.host);
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("Const - destination:"+DestinationConnection.destination);
        logger.info("Const - host:"+DestinationConnection.host);
        System.out.println("Const - destination:"+DestinationConnection.destination);
        System.out.println("Const - host:"+DestinationConnection.host);
		//RequestContext ctx = request.
		
		try {logger.info("Environment Variable destination = " + System.getenv("destination"));}catch(Exception e) {e.printStackTrace();}
		try {logger.info("Environment Variable destination = " + System.getProperty("destination"));}catch(Exception e) {e.printStackTrace();}
		try {logger.info("Environment Variable destination = " + System.getProperties().toString());}catch(Exception e) {e.printStackTrace();}
		try{ErpConfigContext ectx = new ErpConfigContext("SCP_DEV");
		logger.info("ctx:"+ectx.toString() );
//		ectx.getSapClient().
		}catch(Exception w){w.printStackTrace();}
		try {}catch(Exception e) {e.printStackTrace();}
		Context ctx=null;
		try {
			ctx = new InitialContext();
			logger.info("contexgt: "+new Gson().toJson(this.toMap(ctx)).toString());
			ConnectivityConfiguration config = (ConnectivityConfiguration) ctx.lookup("java:comp/env/ConnectivityConfiguration");
			logger.info("config:"+config.getConfiguration("SCP_DEV").getAllProperties());
			logger.info("URL:"+config.getConfiguration("SCP_DEV").getProperty("URL"));
			
		} catch (NamingException e) {
			e.printStackTrace();
		}
		try {
			AuthenticationHeaderProvider auth=(AuthenticationHeaderProvider) ctx.lookup("java:comp/env/AuthenticationHeaderProvider");
			
			//https://www.javatips.net/api/cloud-sfsf-benefits-ext-master/com.sap.hana.cloud.samples.benefits/src/com/sap/hana/cloud/samples/benefits/connectivity/http/HTTPConnector.java
		}catch(Exception e) {e.printStackTrace();}
		
		try { Destination destination = DestinationAccessor.getDestination("SCP_DEV");
	        System.out.println("destination:"+destination.getPropertiesByName().keySet().toString());
	        System.out.println("destination:"+destination.toString());
	        System.out.println("destination:"+destination.getUri());
	        logger.info("destination:"+destination.getPropertiesByName().keySet().toString());
	        logger.info("destination:"+destination.toString());
	        logger.info("destination:"+destination.getUri());}catch(Exception e){e.printStackTrace();}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public  Map toMap(Context ctx) throws NamingException {
	    String namespace = ctx instanceof InitialContext ? ctx.getNameInNamespace() : "";
	    HashMap<String, Object> map = new HashMap<String, Object>();
	    logger.info("> Listing namespace: " + namespace);
	    NamingEnumeration<NameClassPair> list = ctx.list(namespace);
	    while (list.hasMoreElements()) {
	        NameClassPair next = list.next();
	        String name = next.getName();
	        String jndiPath = namespace + name;
	        Object lookup;
	        try {
	            logger.info("> Looking up name: " + jndiPath);
	            Object tmp = ctx.lookup(jndiPath);
	            if (tmp instanceof Context) {
	                lookup = toMap((Context) tmp);
	            } else {
	                lookup = tmp.toString();
	                logger.info("> Looking up name: " + jndiPath+"/"+lookup);
	            }
	        } catch (Throwable t) {
	            lookup = t.getMessage();
	        }
	        map.put(name, lookup);

	    }
	    return map;
	}

}
