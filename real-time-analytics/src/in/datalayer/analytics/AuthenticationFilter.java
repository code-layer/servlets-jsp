package in.datalayer.analytics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class AuthenticationFilter implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		String userNameVal = httpRequest.getParameter("userName");
		String passWordVal = httpRequest.getParameter("passWord");


		if(userNameVal.equalsIgnoreCase("admin") && passWordVal.equals("admin@123") ) {
			chain.doFilter(request, response);
		}else  {
			PrintWriter out =  response.getWriter();
			out.println("<a href=index.html> Home | </a> ");
			out.println("<hr>");
			out.println("<h2>Invalid login details</h2>");
			out.println("<br>");
			out.println("<h3> Try with admin/admin@123");
			out.close();
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
