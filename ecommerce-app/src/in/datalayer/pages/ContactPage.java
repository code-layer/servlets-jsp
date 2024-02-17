package in.datalayer.pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContactPage extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =  response.getWriter();
		out.println("<a href=index.html> Home | </a> ");
		out.println("<a href=ProductPage> Products | </a> ");
		out.println("<h1> My eCommerce Web Site </h1>");
		out.println("<hr>");
		out.println("<h2>Contact Us</h2>");
		out.println("<br>");
		out.println("<h3> Mobile No: 91 - 98459 12345 </h3>");
		out.println("<h3> Email Id : help@example.com</h3>");
		out.close();
	}
}