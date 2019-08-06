package com;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import org.springframework.stereotype.Service;

import com.sap.apibhub.sdk.api_sales_order_srv.api.ASalesOrderApi;
import com.sap.apibhub.sdk.api_sales_order_srv.model.ASalesOrderType;
import com.sap.apibhub.sdk.api_sales_order_srv.model.ModifiedASalesOrderType;
import com.sap.apibhub.sdk.api_sales_order_srv.model.Wrapper;
import com.sap.apibhub.sdk.client.ApiClient;
import com.sap.apibhub.sdk.client.ApiException;
import com.sap.apibhub.sdk.client.ApiResponse;
import com.sap.apibhub.sdk.client.Configuration;
import com.sap.apibhub.sdk.client.auth.ApiKeyAuth;
import com.sap.apibhub.sdk.client.auth.Authentication;
import com.sap.apibhub.sdk.client.auth.HttpBasicAuth;

import com.sap.cloud.sdk.cloudplatform.connectivity.Destination;
import com.sap.cloud.sdk.odatav2.connectivity.ODataException;
import com.sap.cloud.sdk.odatav2.connectivity.ODataQueryBuilder;
import com.sap.cloud.sdk.s4hana.connectivity.ErpConfigContext;
import com.sap.cloud.sdk.s4hana.datamodel.odata.namespaces.salesorder.SalesOrder;
import com.sap.cloud.sdk.cloudplatform.connectivity.*;

import com.sap.core.connectivity.api.configuration.ConnectivityConfiguration;
import com.sap.core.connectivity.api.configuration.DestinationConfiguration;



@Service
@Path("/ASalesOrderApiService") 
public class ASalesOrderApiExample implements com.ASalesOrderApiInterface {
	public ASalesOrderApi apiInstance = null;
	ErpConfigContext configContext;
	ApiClient defaultClient = null;
	//this=new ASalesOrderApiExample();
	
	
	public ASalesOrderApiExample() {
    	
    	
    	try {
    	defaultClient = Configuration.getDefaultApiClient();
    	}catch(Exception e) {e.printStackTrace();}
    	
		Map<String, Authentication> authentications = defaultClient.getAuthentications();   
		
		
		
		HttpURLConnection urlConnection = null;
        String destinationName = "java:comp/env/SCP_DEV_CLONING";
        
        
        try {
            // Look up the connectivity configuration API
            Context ctx = new InitialContext();
            ConnectivityConfiguration configuration =
                    (ConnectivityConfiguration) ctx.lookup("java:comp/env/SCP_DEV_CLONING");
            System.out.println(configuration.getConfiguration("SCP_DEV_CLONING"));

            // Get destination configuration for "destinationName"
            DestinationConfiguration destConfiguration = configuration.getConfiguration(destinationName);

            if (destConfiguration == null) {
                System.out.println(
                        String.format("Destination %s is not found. Hint:"
                                + " Make sure to have the destination configured.", destinationName));
                
            }
            System.out.println("URL:"+destConfiguration.getProperty("URL"));
        	}catch(Exception e) {e.printStackTrace();}
		//Currently Base Path points to sandbox system, change it to call your API Endpoint
		defaultClient.setBasePath("https://my302314-api.s4hana.ondemand.com/sap/opu/odata/sap/API_SALES_ORDER_SRV");
		//defaultClient.setBasePath("https://my301713.s4hana.ondemand.com/sap/opu/odata/sap/API_SALES_ORDER_SRV");
		
		//You can obtain your API key on the Settings page of SAP API Business Hub. In the Settings page, choose the Show API Key toggle button to display and copy your API key. You have to be logged in to view your API Key.
		defaultClient.addDefaultHeader("APIKey","Tvs0GYWlQIfcYgn0Lj5fzpCJrBBhwpkf");
		defaultClient.addDefaultHeader("X-CSRF-TOKEN","FETCH");
		
		authentications.put("APIBHUB_SANDBOX_APIKEY", new ApiKeyAuth("header", "APIKey"));
		            
        
		//Change Base Path, uncomment below code and configure Basic Authorization to call your API Endpoint: basicAuthentication
		authentications.put("basicAuthentication", new HttpBasicAuth());
		
		HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuthentication");
		basicAuthentication.setUsername("BHF_COMM");
		basicAuthentication.setPassword("nBhLsiwWXmfwqmX)FDLRUA6SwdCitAXUswwZwLqX");
		
		//basicAuthentication.setUsername("MEUSER");
		//basicAuthentication.setPassword("B#BVQlsdsubfUUshFqwHJrcPzWYs2LdZHbsWBbrp");
		
		
	}
	
	/* (non-Javadoc)
	 * @see com.ASalesOrderApi#getSalesOrders()
	 */
	@GET
	@Path("/all")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@XmlElement
	@Override
	public Wrapper getSalesOrders(String top, String skip, String filter, String inlinecount, String orderby, String select, String expand) {
/*		List<SalesOrder> salesOrders=new ArrayList();
		try {configContext = new ErpConfigContext("SCP_DEV_CLONING");}catch(Exception e) {e.printStackTrace();}
		try {
			
        	//configContext.	sap/opu/odata/sap/API_SALES_ORDER_SRV
			 salesOrders = ODataQueryBuilder
			        .withEntity("/",
			                "A_SalesOrder")
			        .select("SalesOrder",
			                "SalesOrderType",
			                "SalesOrganization",
			                "DistributionChannel",
			                "SoldToParty",
			                "TotalNetAmount")
			        .build()
			        .execute(configContext)
			        .asList(SalesOrder.class);
			
			System.out.println(salesOrders.toString());
			
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ODataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return salesOrders;*/
		
		Wrapper result = new Wrapper() ;
    	
    	//a.getSalesOrders();
		ASalesOrderApiExample a = new ASalesOrderApiExample();
		apiInstance = new ASalesOrderApi();
        apiInstance.setApiClient(defaultClient);
        //top = "10"; // Integer | Show only the first n items, see [OData Paging - Top](http://docs.oasis-open.org/odata/odata/v4.01/odata-v4.01-part1-protocol.html#sec_SystemQueryOptiontop)
        //skip = 0; // Integer | Skip the first n items, see [OData Paging - Skip](http://docs.oasis-open.org/odata/odata/v4.01/odata-v4.01-part1-protocol.html#sec_SystemQueryOptionskip)
        //String filter = ""; // String | Filter items by property values, see [OData Filtering](http://docs.oasis-open.org/odata/odata/v4.01/odata-v4.01-part1-protocol.html#sec_SystemQueryOptionfilter)
        //String inlinecount = ""; // String | Include count of items, see [OData Count](http://www.odata.org/documentation/odata-version-2-0/uri-conventions/#InlinecountSystemQueryOption)
        //List<String> orderby = Arrays.asList(""); // List<String> | Order items by property values, see [OData Sorting](http://docs.oasis-open.org/odata/odata/v4.01/odata-v4.01-part1-protocol.html#sec_SystemQueryOptionorderby)
         //"SalesOrder,SalesOrderType,SalesOrganization,DistributionChannel,SoldToParty,TotalNetAmount"
        //List<String> select = Arrays.asList("SalesOrder,SalesOrderType,SalesOrganization,DistributionChannel,SoldToParty,TotalNetAmount,to_Item,to_Partner,to_PaymentPlanItemDetails,to_PricingElement,to_Text"); // List<String> | Select properties to be returned, see [OData Select](http://docs.oasis-open.org/odata/odata/v4.01/odata-v4.01-part1-protocol.html#sec_SystemQueryOptionselect)
        //List<String> expand = Arrays.asList("to_Item,to_Partner,to_PaymentPlanItemDetails,to_PricingElement,to_Text"); // List<String> | Expand related entities, see [OData Expand](http://docs.oasis-open.org/odata/odata/v4.01/odata-v4.01-part1-protocol.html#sec_SystemQueryOptionexpand)
        Integer iTop=null;
        Integer iSkip=null;
        if(top.length()>0) {
        		try{iTop = Integer.valueOf(top);}catch(Exception e) {e.printStackTrace();}
        	}
        if(skip.length()>0) {
    		try{iSkip = Integer.valueOf(skip);}catch(Exception e) {e.printStackTrace();}
    	}
    
        try {
            result = apiInstance.aSalesOrderGet(iTop, iSkip, filter, inlinecount, Arrays.asList(orderby), Arrays.asList(select), Arrays.asList(expand));
            //result = apiInstance.aSalesOrderGet(tryParseInteger(top).get(), tryParseInteger(skip).get(), filter, inlinecount, Arrays.asList(orderby), Arrays.asList(select), Arrays.asList(expand));
            //System.out.println(response.getHeaders().toString());
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ASalesOrderApi#aSalesOrderGet");
            System.err.println("API Response : \n"+e.getResponseBody()); 
        }
        return result;
	}
	
	private Optional<Integer> tryParseInteger(String string) {
	    try {
	        return Optional.of(Integer.valueOf(string));
	    } catch (NumberFormatException e) {
	        return null;
	    }
	}
	
	@Override
	public ApiResponse<ASalesOrderType> getSalesOrder(String id, String select, String expand) {
		ASalesOrderType result = null ;
		ApiResponse<ASalesOrderType> resultw = null;
    	//ASalesOrderApiExample a = new ASalesOrderApiExample();
    	if (apiInstance == null)
		apiInstance = new ASalesOrderApi();
        apiInstance.setApiClient(defaultClient);
        String filter, inlinecount,orderby;
        try {
        	inlinecount="";
        	orderby="";
        	filter = "SalesOrder eq '" + id + "'";
             resultw = apiInstance.aSalesOrderSalesOrderGetWithHttpInfo(id, Arrays.asList(select), Arrays.asList(expand));
            //result = apiInstance.aSalesOrderGet(tryParseInteger(top).get(), tryParseInteger(skip).get(), filter, inlinecount, Arrays.asList(orderby), Arrays.asList(select), Arrays.asList(expand));
            result = resultw.getData();
            System.out.println("Headers : "+resultw.getHeaders().toString());
            System.out.println("x-csrf-token : " + resultw.getHeaders().get("x-csrf-token"));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ASalesOrderApi#aSalesOrderGet");
            System.err.println("API Response : \n"+e.getResponseBody()); 
        }
		return resultw;
	}	
	
    @Override
	public ApiResponse<Void> updateSalesOrder(String id, ModifiedASalesOrderType aSalesOrderType) {
    	ApiResponse<ASalesOrderType> resultw = null;
    	ASalesOrderType result = null ;
    	System.out.println("--Start--------------------------UpdateSalesOrder-----------------------");
    	//ASalesOrderApiExample a = new ASalesOrderApiExample();
		try {
    	resultw = apiInstance.aSalesOrderSalesOrderGetWithHttpInfo("1", Arrays.asList(""), Arrays.asList(""));
		}catch(Exception e) {e.printStackTrace();}
    	String xcrf = resultw.getHeaders().get("x-csrf-token").toString();
        System.out.println("xcsrf : " + xcrf);
        xcrf = xcrf.substring(1,xcrf.length()-1);
        //defaultClient.addDefaultHeader("x-csrf-token", xcrf);
        if (apiInstance ==null) {
        apiInstance = new ASalesOrderApi();
        apiInstance.setApiClient(defaultClient);
        }
        
        String filter, inlinecount,orderby;
        ApiResponse response = null;
        try {
        	inlinecount="";
        	orderby="";
        	filter = "SalesOrder eq '" + id + "'";
            
			//ModifiedASalesOrderType aSalesOrderType;
			 response = apiInstance.aSalesOrderSalesOrderPatchWithHttpInfo(id, aSalesOrderType);
            System.out.println(response.getHeaders().toString());
            System.out.println(response.getData().toString());
        } catch (ApiException e) {
            System.err.println("Exception when calling ASalesOrderApi#aSalesOrderSalesOrderPatchWithHttpInfo");
            System.err.println("API Response : \n"+e.getResponseBody()); 
        }
        System.out.println("--End-----------------------------UpdateSalesOrder----------------------------");
        return response;
		
	}

	@Override
	public Wrapper deleteSalesOrder(String id, String select, String expand) {
		
		Wrapper result = new Wrapper() ;
    	
    	ASalesOrderApiExample a = new ASalesOrderApiExample();
		apiInstance = new ASalesOrderApi();
        apiInstance.setApiClient(defaultClient);
        String filter, inlinecount,orderby;
        try {
        	inlinecount="";
        	orderby="";
        	filter = "SalesOrder eq '" + id + "'";
            result = apiInstance.aSalesOrderGet(null, null, filter, inlinecount, Arrays.asList(orderby), Arrays.asList(select), Arrays.asList(expand));
            //result = apiInstance.aSalesOrderGet(tryParseInteger(top).get(), tryParseInteger(skip).get(), filter, inlinecount, Arrays.asList(orderby), Arrays.asList(select), Arrays.asList(expand));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ASalesOrderApi#aSalesOrderGet");
            System.err.println("API Response : \n"+e.getResponseBody()); 
        }
		return result;
	}
	
	public void getToken() {
		//defaultClient
	}

	public static void main(String[] args) {
    	ASalesOrderApiExample a = new ASalesOrderApiExample();
    	//a.getSalesOrders();
    	
    	ApiClient defaultClient = new ApiClient();
    	try {
    	defaultClient = Configuration.getDefaultApiClient();
    	}catch(Exception e) {e.printStackTrace();}
    	
		Map<String, Authentication> authentications = defaultClient.getAuthentications();   
		
		
		
		HttpURLConnection urlConnection = null;
        String destinationName = "SCP_DEV_CLONING";
        
        
        try {
            // Look up the connectivity configuration API
            Context ctx = new InitialContext();
            ConnectivityConfiguration configuration =
                    (ConnectivityConfiguration) ctx.lookup("java:comp/env/SCP_DEV_CLONING");
            
            // Get destination configuration for "destinationName"
            DestinationConfiguration destConfiguration = configuration.getConfiguration(destinationName);
            
            if (destConfiguration == null) {
                System.out.println(
                        String.format("Destination %s is not found. Hint:"
                                + " Make sure to have the destination configured.", destinationName));
                return;
            }
            System.out.println("URL:"+destConfiguration.getProperty("URL"));
        	}catch(Exception e) {e.printStackTrace();}
		//Currently Base Path points to sandbox system, change it to call your API Endpoint
		defaultClient.setBasePath("https://my302314.s4hana.ondemand.com/sap/opu/odata/sap/API_SALES_ORDER_SRV");
		//defaultClient.setBasePath("https://my301713.s4hana.ondemand.com/sap/opu/odata/sap/API_SALES_ORDER_SRV");
		
		//You can obtain your API key on the Settings page of SAP API Business Hub. In the Settings page, choose the Show API Key toggle button to display and copy your API key. You have to be logged in to view your API Key.
		defaultClient.addDefaultHeader("APIKey","Tvs0GYWlQIfcYgn0Lj5fzpCJrBBhwpkf"); 		
		authentications.put("APIBHUB_SANDBOX_APIKEY", new ApiKeyAuth("header", "APIKey"));
		            
        
		//Change Base Path, uncomment below code and configure Basic Authorization to call your API Endpoint: basicAuthentication
		authentications.put("basicAuthentication", new HttpBasicAuth());
		
		HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuthentication");
		basicAuthentication.setUsername("BHF_COMM");
		basicAuthentication.setPassword("nBhLsiwWXmfwqmX)FDLRUA6SwdCitAXUswwZwLqX");
		
		//basicAuthentication.setUsername("MEUSER");
		//basicAuthentication.setPassword("B#BVQlsdsubfUUshFqwHJrcPzWYs2LdZHbsWBbrp");
				
        a.apiInstance = new ASalesOrderApi();
        a.apiInstance.setApiClient(defaultClient);
        Integer top = 10; // Integer | Show only the first n items, see [OData Paging - Top](http://docs.oasis-open.org/odata/odata/v4.01/odata-v4.01-part1-protocol.html#sec_SystemQueryOptiontop)
        Integer skip = 0; // Integer | Skip the first n items, see [OData Paging - Skip](http://docs.oasis-open.org/odata/odata/v4.01/odata-v4.01-part1-protocol.html#sec_SystemQueryOptionskip)
        String filter = ""; // String | Filter items by property values, see [OData Filtering](http://docs.oasis-open.org/odata/odata/v4.01/odata-v4.01-part1-protocol.html#sec_SystemQueryOptionfilter)
        String inlinecount = ""; // String | Include count of items, see [OData Count](http://www.odata.org/documentation/odata-version-2-0/uri-conventions/#InlinecountSystemQueryOption)
        List<String> orderby = Arrays.asList(""); // List<String> | Order items by property values, see [OData Sorting](http://docs.oasis-open.org/odata/odata/v4.01/odata-v4.01-part1-protocol.html#sec_SystemQueryOptionorderby)
        String[] salesFields = new String[] {"SalesOrder",
                "SalesOrderType",
                "SalesOrganization",
                "DistributionChannel",
                "SoldToParty",
                "TotalNetAmount"};
        List<String> select = Arrays.asList(salesFields); // List<String> | Select properties to be returned, see [OData Select](http://docs.oasis-open.org/odata/odata/v4.01/odata-v4.01-part1-protocol.html#sec_SystemQueryOptionselect)
        List<String> expand = Arrays.asList("to_Item,to_Partner,to_PaymentPlanItemDetails,to_PricingElement,to_Text"); // List<String> | Expand related entities, see [OData Expand](http://docs.oasis-open.org/odata/odata/v4.01/odata-v4.01-part1-protocol.html#sec_SystemQueryOptionexpand)
        try {
            Wrapper result = a.apiInstance.aSalesOrderGet(top, skip, filter, inlinecount, orderby, select, expand);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ASalesOrderApi#aSalesOrderGet");
            System.err.println("API Response : \n"+e.getResponseBody()); 
        }
        
        
        
        //===============================================================================================
        
        try {
        	//configContext.
			final List<SalesOrder> salesOrders = ODataQueryBuilder
			        .withEntity("/sap/opu/odata/sap/API_SALES_ORDER_SRV",
			                "A_SalesOrder")
			        .select("SalesOrder",
			                "SalesOrderType",
			                "SalesOrganization",
			                "DistributionChannel",
			                "SoldToParty",
			                "TotalNetAmount")
			        .build()
			        .execute(a.configContext)
			        .asList(SalesOrder.class);
			System.out.println(salesOrders.toString());
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ODataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
