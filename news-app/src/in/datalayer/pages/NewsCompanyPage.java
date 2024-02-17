package in.datalayer.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewsCompanyPage extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =  response.getWriter();
		out.println("<a href=index.html> Home | </a> ");
		out.println("<h1> News Corp Web App </h1>");
		out.println("<hr>");
		out.println("<h2>Client or Customer Request Details</h2>");
		out.println("<h3> Request URL :  " + request.getRequestURL() + "</h3>");
		out.println("<h3> Request URI :  " + request.getRequestURI() + "</h3>");
		out.println("<h3>Request Method: " + request.getMethod() + "</h3>");
		out.println("<h3>Context Path: " + request.getContextPath() + "</h3>");
		out.println("<h3>Servlet Path " + request.getServletPath() + "</h3>");
		out.println("<hr>");

		out.println("<table border=1>");
		out.println("<tr><th>Header Name</th> <th>Header Value</th></tr>");

		Enumeration headerNames = request.getHeaderNames();
		while(headerNames.hasMoreElements()){
			Object obj = headerNames.nextElement();
			out.println("<tr><td>" + obj.toString() + " </td>");
			out.println("<td>" + request.getHeader(obj.toString()) + "</td></tr>");
		}
		out.println("</table>");


		out.close();
	}

}