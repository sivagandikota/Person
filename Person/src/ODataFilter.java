import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.olingo.odata2.api.ODataServiceFactory;

//ODataClassloaderFilter

public class ODataFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		request.setAttribute(ODataServiceFactory.FACTORY_CLASSLOADER_LABEL,
				ODataServiceFactory.class.getClassLoader());

		chain.doFilter(request, response);
	}
}