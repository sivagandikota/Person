package com.ondemand;

import java.io.InputStream;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.apache.myfaces.custom.fileupload.UploadedFile;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import model.Person;
import person.Hello;


@Path("/salesOrder") 
@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
@XmlRootElement(name="SalesOrders")
@XmlSeeAlso(model.SalesOrder.class)
@WebService(endpointInterface="service.SalesOrder" )

public class SalesOrderImpl {
	private static final Logger log = LoggerFactory.getLogger(SalesOrderImpl.class);
	private UploadedFile uploadedFile;

    private javax.servlet.http.Part file;
    private String fileContent;
	private Sheet sheet;
	private Workbook workbook =null;
	private Integer progress;
	private HashMap sales = new HashMap<Integer,model.SalesOrder>();
	private HashMap salesItems = new HashMap<Integer,model.SalesOrderItem>();
	private HashMap businessPartners = new HashMap<Integer,model.BusinessPartner>();
	private HashMap scheduleLine = new HashMap<Integer,model.ScheduleLine>();
	private HashMap sales_salesItems = new HashMap<Integer,Integer>();
	private HashMap sales_businessPartners = new HashMap<Integer,Integer>();
	private HashMap sales_scheduleLine = new HashMap<Integer,Integer>();
	private HashMap salesItems_businessPartners = new HashMap<Integer,Integer>();
	private HashMap salesItems_scheduleLine = new HashMap<Integer,Integer>();
	private Row r;
	
	
	@PersistenceContext(unitName="PERSONS", type=PersistenceContextType.TRANSACTION)
	private static EntityManager entityManager;
	public void init(){
		System.out.println("init--->SalesOrderImpl");
		try{
			if(entityManager==null) {
				entityManager = Persistence.createEntityManagerFactory("PERSONS").createEntityManager();
			}
		}catch(Exception e) {e.printStackTrace();}
	}
	public SalesOrderImpl() {
		super();
		init();
	}
	
	@POST
	//@Path("/create")
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Long create(model.SalesOrder salesOrder) {
		try{System.out.println("create---entityManager.getTransaction().isActive()-->"+entityManager.getTransaction().isActive());
		if(!entityManager.getTransaction().isActive()) {
			entityManager.getTransaction().begin();
        }
		System.out.println("create---entityManager.getTransaction().isActive()-->"+entityManager.getTransaction().isActive());
		entityManager.persist(salesOrder);
        
        //entityManager.flush();
        entityManager.getTransaction().commit();
        }catch(Exception e) {e.printStackTrace();}
		return salesOrder.getId();
    }
 
    @GET
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Path("/{id}")
    
    public model.SalesOrder get( long id) {
        return entityManager.find(model.SalesOrder.class, id);
    }
    @GET
    @Path("/all")
    @XmlElementWrapper(name="SalesOrders")
    @XmlElement(name="SalesOrder")
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public List<model.SalesOrder> all() {
    	List<model.SalesOrder> list=null;
    	try {
    		
    		TypedQuery<model.SalesOrder> query = (TypedQuery<model.SalesOrder>) entityManager.createQuery("SELECT e FROM SalesOrder e");
    		list=  query.getResultList();}catch(Exception e) {e.printStackTrace();}
    	//entityManager.
    	return list;
    }
    
    public model.SalesOrder[] readAllw() {
    	List<model.SalesOrder> list=null;
    	try {System.out.println("entityManager-->"+entityManager);
    	Query query = entityManager.createQuery("SELECT e FROM SalesOrder e");
        list= (List<model.SalesOrder>) query.getResultList();}catch(Exception e) {e.printStackTrace();}
    	return list.toArray(new model.SalesOrder[list.size()]);
    }
 
    @PUT
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public void update(model.SalesOrder salesOrder) {
    	try {System.out.println("service.impl.SalesOrder.update--->"+salesOrder.toString());
    	System.out.println("entityManager.getTransaction().isActive()-->"+entityManager.getTransaction().isActive());
    	if(!entityManager.getTransaction().isActive()) {
			entityManager.getTransaction().begin();
			System.out.println("entityManager.getTransaction().isActive()-->"+entityManager.getTransaction().isActive());
        }
    	model.SalesOrder ord = entityManager.find(model.SalesOrder.class, salesOrder.getId());
    	Set nu = (ord.getSalesOrderItem());
    	Set nu1=(salesOrder.getSalesOrderItem());
    	nu.addAll(nu1);
    	//ord.setSalesOrderItem(nu);
    	System.out.println("---------------------------------------------------------------------------");
    	//entityManager.
    	salesOrder=entityManager.merge(salesOrder);
        //entityManager.flush();
    	entityManager.getTransaction().commit();

        System.out.println("---After Update--->"+salesOrder.toString());
        }catch(Exception e) {e.printStackTrace();}
    }
 
    @DELETE
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public void delete( long id) {
    	model.SalesOrder salesOrder = get(id);
        if(null != salesOrder) {
        	if(!entityManager.getTransaction().isActive()) {
    			entityManager.getTransaction().begin();
    			System.out.println("entityManager.getTransaction().isActive()-->"+entityManager.getTransaction().isActive());
            }
            entityManager.remove(salesOrder);
            entityManager.getTransaction().commit();
        }
    }
    
 
/*    @GET
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Path("findCustomersByCity/{city}")
    public List&lt;Customer&gt; findCustomersByCity(@PathParam("city") String city) {
        Query query = entityManager.createNamedQuery("findCustomersByCity");
        query.setParameter("city", city);
        return query.getResultList();
    }*/
    
    
    
    
    
    
   
}
