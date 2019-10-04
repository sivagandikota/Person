package person;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import model.Person;

import org.apache.poi.ss.usermodel.Sheet;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.Persistence;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.WebServiceRef;



@Path("/helloService") //rs service
@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
@XmlRootElement(name="Persons")
@XmlSeeAlso(Person.class)
@WebService(endpointInterface="person.HelloManager")
@Service
public class HelloService implements HelloManager{
	
		    private HelloService service;
	private List<Person> persons= new ArrayList<Person>();
	private static final Logger log = LoggerFactory.getLogger(person.HelloService.class);


	private static final String PERSISTENCE_UNIT_NAME = "PERSONS";   
	@PersistenceContext(name=PERSISTENCE_UNIT_NAME)
	// private EntityManager em;
	
	    private static EntityManager em; //= Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
	
	    private static EntityTransaction transactionObj;// = em.getTransaction();
	
	 

    //javax.servlet.http.Part (Servlet 3.0 API)
	private String fileContent;
	private Sheet sheet;
    
	/*@GET
    @Path("/all")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	    
	public Response getPersons(@QueryParam("format") String format) {
		try{//Query query = em.createNamedQuery("Person.findPersons");
			Query query = em.createQuery("SELECT p FROM Person p");
         persons=  query.getResultList();
		}catch(Exception e) {e.printStackTrace();}
		
		final GenericEntity<List<Person>> entity = new GenericEntity<List<Person>>(persons) { };		
		// Set the status, entity and media type of the response.
		return Response.ok(entity).build();
	}*/
	
	
	
	/*@GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Response getPerson(@PathParam("id") long id1) {
		Person person = null;
		try{//Query query = em.createNamedQuery("Person.findPersons");
			Query query = em.createQuery("SELECT p FROM Person p  WHERE p.id = :id");
         person=  (Person)query.setParameter("id", id1).getSingleResult();
         log.debug(person.toString());
		}catch(Exception e) {e.printStackTrace();}
		
		final GenericEntity<Person> entity = new GenericEntity<Person>(person) { };		
		// Set the status, entity and media type of the response.
		return Response.ok(entity).build();
	}*/
	
	@GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Person getPerson(@PathParam("id") long id1) {
		return em.find(Person.class, id1);
	}
	
	
	/*@POST
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Response setPerson(@QueryParam("format") String format,@PathParam("id") String id1,@QueryParam("firstName") String firstName,@QueryParam("lastName") String lastName,Person perso) {
		Person person = null;
		try{//Query query = em.createNamedQuery("Person.findPersons");
			person = em.find(Person.class, id1);
			em.getTransaction().begin();
			if(null!=firstName)
			person.setFirstName(firstName);
			if(null!=lastName)
			person.setLastName(lastName);
			em.getTransaction().commit();
         
		}catch(Exception e) {e.printStackTrace();}
		
		// Set the status, entity and media type of the response.
		return Response.ok().build();
	}*/
	
	@GET
    @Path("/all")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@XmlElementWrapper(name="MyList")
    @XmlElement
	public Person[] getPersons() {
		try{//Query query = em.createNamedQuery("Person.findPersons");
			Query query = em.createQuery("SELECT p FROM Person p");
         persons=  query.getResultList();
		}catch(Exception e) {e.printStackTrace();}
		return persons.toArray(new Person[persons.size()]);
	}
    
	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
	
	@PUT
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public void updatePerson(Person person) {
		em.merge(person);
	}
	
	@DELETE
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public void deletePerson(long id) {
		model.Person person= getPerson(id);
        if(null != person) {
            em.remove(person);
        }
	}
	
	@POST
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public void setPerson(Person perso) {
		Person person = null;
		try{//Query query = em.createNamedQuery("Person.findPersons");
			person = em.merge(perso);
			/*em.getTransaction().begin();
			em.persist(perso);
			em.getTransaction().commit();*/
         
		}catch(Exception e) {e.printStackTrace();}
		
	}
	
		
	public HelloService() {
		super();
		// TODO Auto-generated constructor stub
		try{em = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();}catch(Exception e) {e.printStackTrace();}
		try{System.out.println("------em-->"+em);transactionObj = em.getTransaction();}catch(Exception e) {e.printStackTrace();}
	}
	
	
}
