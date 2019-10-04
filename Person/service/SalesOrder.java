package service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Use;
import javax.ws.rs.PathParam;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.ResponseWrapper;

@WebService(name="SalesOrder")   
//targetNamespace="http://*.ondemand.com/Person/ws",wsdlLocation="http://localhost:8080/Person/ws/SalesOrder?wsdl"
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use=Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso(model.SalesOrder.class)
//@XmlSeeAlso(service.impl.SalesOrder.class)
public interface SalesOrder {
/*	@WebMethod(operationName="create")
	public Long create( model.SalesOrder salesOrder);
	
	@WebMethod(operationName="get")
	@ResponseWrapper(className="javax.ws.rs.core.GenericEntity<model.SalesOrder>")
	public model.SalesOrder get( long id) ;
	
	@WebMethod(operationName="readAllw")
	@ResponseWrapper(className="javax.ws.rs.core.GenericEntity<model.SalesOrder[]>")
	public model.SalesOrder[] readAllw();
	
	@WebMethod(operationName="all")
	//@ResponseWrapper(partName="SalesOrder",className="javax.ws.rs.core.GenericEntity<List<model.SalesOrder>>")
	@WebResult(name="SalesOrders")
	@XmlElementWrapper()
    @XmlElement(name="SalesOrder")
	public List<model.SalesOrder> all();
	
	@WebMethod(operationName="update")
	public void update( model.SalesOrder salesOrder) ;
	
	@WebMethod(operationName="delete")
	public void delete( long id);*/

}
