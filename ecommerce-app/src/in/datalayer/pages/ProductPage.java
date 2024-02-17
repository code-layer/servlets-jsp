package in.datalayer.pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductPage extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =  response.getWriter();

		out.println("<a href=index.html> Home | </a> ");
		out.println("<a href=ContactPage> ContactUs | </a> ");
		out.println("<h1> My eCommerce Web Site </h1>");
		out.println("<hr>");
		out.println("<h2>Products Page</h2>");
		out.println("<br>");
		out.println("<h4> ID  |  Prod Name | Price</h4>");

		out.println("<h4> P101  |  Dell Desktop E373 | Rs 45,678.00</h4>");
		out.println("<h4> P102  |  Logitech Mouse | Rs 245.00</h4>");
        out.println("<h4> P103  |  HP Ink Jet Printer | Rs 5600.00</h4>");
        out.close();
	}
}