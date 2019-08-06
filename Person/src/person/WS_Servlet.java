package person;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.BusFactory;
import org.apache.cxf.transport.servlet.CXFNonSpringServlet;

/**
 * Servlet implementation class WS_Servlet
 */
//@WebServlet("/")
public class WS_Servlet extends CXFNonSpringServlet{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WS_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    @Override
    public void loadBus(ServletConfig servletConfig) {
      super.loadBus(servletConfig);
      Bus bus = getBus();
      BusFactory.setDefaultBus(bus);
      Endpoint.publish("/HelloService", new person.HelloService());
    }

}
