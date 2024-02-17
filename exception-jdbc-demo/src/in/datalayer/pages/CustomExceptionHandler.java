package in.datalayer.pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomExceptionHandler extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		handleError(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		handleError(request, response);
	}

	private void handleError(HttpServletRequest request,
			HttpServletResponse response) throws IOException {

		//given by server container
		Throwable throwable = (Throwable) request
				.getAttribute("javax.servlet.error.exception");
		Integer statusCode = (Integer) request
				.getAttribute("javax.servlet.error.status_code");
		String servletName = (String) request
				.getAttribute("javax.servlet.error.servlet_name");

		if (servletName == null) {
			servletName = "Unknown";
		}

		String requestUri = (String) request
				.getAttribute("javax.servlet.error.request_uri");
		if (requestUri == null) {
			requestUri = "Unknown";
		}

		// Set response content type
	      response.setContentType("text/html");

	      PrintWriter out = response.getWriter();

	      out.println("<br><br>");
	      out.println("<a href=index.html> Home | </a>");

	      if(statusCode != 500){
	    	  out.println("<h3>Error Details</h3>");
	    	  out.println("<p>Status Code : <b>"+statusCode + "</b>");
	    	  out.println("<p>Requested URI: <b>"+requestUri + "</b>");
	      } else {
	    	  out.println("<h3>Exception Details</h3>");
	    	  out.println("<ul><li>Servlet Name: <b>"+servletName+"</b></li>");
	    	  out.println("<li>Exception Name: <b>"+throwable.getClass().getName()+"</b></li>");
	    	  out.println("<li>Requested URI: <b>"+requestUri+"</b></li>");
	    	  out.println("<li>Exception Message: <b>"+throwable.getMessage()+"</b></li>");
	    	  out.println("</ul>");
	      }

	      out.close();
	}

}
