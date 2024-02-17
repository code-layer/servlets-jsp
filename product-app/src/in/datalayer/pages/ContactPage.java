package in.datalayer.pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContactPage extends HttpServlet {

	String mobileNoVal;
	String emailIdNoVal;

	public ContactPage() {
        super();
    }

	public void init(ServletConfig config) throws ServletException {
			mobileNoVal = config.getInitParameter("mobileNo");
			emailIdNoVal = config.getInitParameter("emailId");
	}

	public void destroy() {
			System.out.println("ContactPage is destroyed");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out =  response.getWriter();

		out.println("<a href=index.html> Home | </a> ");
		out.println("<a href=ProductPage> Products | </a> ");
		out.println("<h1> My Product Web App </h1>");
		out.println("<hr>");
		out.println("<h2>Contact Page</h2>");
		out.println("<br>");
		out.println("<h3> Mobile No: " + mobileNoVal + " </h3>");
		out.println("<h3> Email Id : " + emailIdNoVal + " </h3>");

		out.close();

	}

}
