package rajendar;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Use;

@WebService(name="TEST")   
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use=Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface TestInterface {
	@WebMethod(operationName="sayHello")
	public String sayHello(@WebParam(name = "name") String name);

}
