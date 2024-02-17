package in.datalayer.pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.datalayer.model.Product;

public class ProductPage extends HttpServlet {

	// idempotent
	// better use for read queries
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(" GET method called");
		generateResponse(response);
	}

	// use for posting data
	// not idempotent
	// not limit on form data in request body
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(" POST method called");
		generateResponse(response);
	}


	void generateResponse(HttpServletResponse response) throws IOException  {
		PrintWriter out =  response.getWriter();

		out.println("<a href=index.html> Home | </a> ");
		out.println("<a href=ContactPage> ContactUs | </a> ");
		out.println("<h1> My Product Web App </h1>");
		out.println("<hr>");
		out.println("<h2>Products Page</h2>");
		out.println("<br>");
		out.println("<h4> ID  |  Prod Name | Price</h4>");
		out.println("<h4>--------------------------</h4>");
		for(Product p : ProductUtil.productData) {
			out.println("<h4> " + p.getId() + " | " +
							      p.getProdName() + " | " +
							      p.getPrice()  + "</h4>");
		}
        out.close();

	}


}
