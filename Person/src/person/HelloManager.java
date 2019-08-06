package person;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import model.Person;


//
@WebService( )
@SOAPBinding(style=Style.DOCUMENT, use=Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)

@XmlRootElement(name="Persons")
public interface HelloManager {
    
    
	@WebMethod(operationName="getPersons")
	@ResponseWrapper(//targetNamespace="http://localhost:8080/Person/ws/HelloService/getPersonList",
    className="javax.ws.rs.core.GenericEntity<Person[]>")
    public Person[] getPersons();
	
	@WebMethod(operationName="getPerson" )
	@ResponseWrapper(//targetNamespace="http://localhost:8080/Person/ws/HelloService/getPersonList",
    className="javax.ws.rs.core.GenericEntity<Person>")
    public Person getPerson(@WebParam(name="id") long id);
    
	@WebMethod(operationName="setPerson")
	public void setPerson(@WebParam(name="person") Person person);
	
	@WebMethod(operationName="updatePerson")
	public void updatePerson(@WebParam(name="person") Person person);
	
	
	@WebMethod(operationName="deletePerson")
	public void deletePerson(@WebParam(name="id") long id);
    //public HelloManager();
	
	
/*	@GET
    @Path("/all")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Response getPersons(@QueryParam("format") String format) ;
*/

}
