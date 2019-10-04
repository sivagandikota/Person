package person;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import javax.xml.ws.Service;

import org.apache.cxf.frontend.ClientProxyFactoryBean;



import javax.xml.namespace.QName;

public class TestSoap {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		URL wsdlUrl = new URL("http://localhost:8080/Person/ws/HelloManager?wsdl");
		QName serviceName = new QName("http://person/", "HelloServiceService"); 
		
		Service service = Service.create(wsdlUrl, serviceName);
		//We need to pass interface and model beans to client
				HelloManager ps = service.getPort(HelloManager.class);
				model.Person p = new model.Person();
				p.setFirstName("Hello");
				p.setLastName("World");
				ps.setPerson(p);
				System.out.println(Arrays.toString(ps.getPersons()));
		 /*ClientProxyFactoryBean factory = new ClientProxyFactoryBean();
	        
         factory.setAddress("http://localhost:8080/Person/ws/HelloWorld");
         factory.setEndpointName(endpointName);Address("http://localhost:8080/Person/ws/HelloWorld");
         HelloManager client = factory.create(HelloManager.class);
         System.out.println("--->"+client.getPersons());*/
				
	}

}
