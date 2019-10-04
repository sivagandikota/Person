package service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.cxf.ext.logging.LoggingFeature;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class SalesOrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Set<model.SalesOrderItem> salOrdLi= new HashSet();
			model.SalesOrderItem sali = new model.SalesOrderItem();
			model.SalesOrderItem ol_sali = new model.SalesOrderItem();
			model.BusinessPartner bp = new model.BusinessPartner();
			model.Addresse addr = new model.Addresse();
			Long salesId = new Long(-1);
			Long ol_saliId = new Long(-1);
			 model.BusinessPartner bpSalOrdI;
	        
	        
	        
	        
	        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
	        factory.getFeatures().add(new LoggingFeature());
	        factory.setAddress("http://localhost:8080/Person/ws/SalesOrder?wsdl");
	        //factory.setAddress("https://fp2000476517trial.hanatrial.ondemand.com/Person/ws/SalesOrder?wsdl");
	        service.SalesOrder client = factory.create(service.SalesOrder.class);
	        model.SalesOrder sal=new model.SalesOrder();
	        sal.setCreatedByUser("Siva.Gandikota");
	        sal.setCreationDate(new Timestamp(new java.util.Date().getTime()));
	        //sal.setId((long)1); 			//System generated
	        salOrdLi=sal.getSalesOrderItem();

	        sali = new model.SalesOrderItem();
	        sali.setBatch("Insert");
	        bpSalOrdI= new model.BusinessPartner();
	        bpSalOrdI.setContactPerson("SivaG bp Hi");
	        sali.setBusinessPartner(bpSalOrdI);
	        addr = new model.Addresse();
	        addr.setAddress1("address1");
	        sali.setAddresse(addr);
	        salOrdLi.add(sali);
	        salesId=client.create(sal);
	        
	        sal=client.get(salesId);
	        salOrdLi=new HashSet();
	        //ol_saliId = salOrdLi.iterator().next().getId();
	        sali = new model.SalesOrderItem();
	        //sali.setSalesOrder(sal); 		//Not required as eclipse link does the bi-directional mapping
	        sali.setBatch("First Batch");
	        salOrdLi.add(sali);
	        sali = new model.SalesOrderItem();
	        sali.setBatch("Second Batch");
	        bpSalOrdI= new model.BusinessPartner();
	        bpSalOrdI.setContactPerson("SivaG bp Hi");
	        sali.setBusinessPartner(bpSalOrdI);
	        salOrdLi.add(sali);
	        sal.setSalesOrderItem(salOrdLi);
	        bp.setContactPerson("SivaG");
	        sal.setBusinessPartner(bp);
	        model.ScheduleLine sl = new model.ScheduleLine();
	        sl.setScheduleLine("Only one");
	        sal.setScheduleLine(sl);
	        client.update(sal);
	        
	        /*sal=client.get(salesId);
	        sal.getSalesOrderItem().*/
	        
	        
	        //client.delete(salesId);
	        
		}catch(Exception e) {e.printStackTrace();}

	}

}
