package in.datalayer.pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.datalayer.model.Product;

public class ProductPage extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out =  response.getWriter();

		out.println("<a href=index.html> Home | </a> ");
		out.println("<a href=ContactPage> ContactUs | </a> ");
		out.println("<h1> Currently Avalilable Products </h1>");
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

		out.println("<h2> Submit Your Product Likes</h2>");
		out.println("<br>");
		out.println("<form action=RegisterLikes method=get>");
		out.println("Product Id: <input type=text name=productId></input> <br>");
		out.println("My Name: <input type=text name=custName></input> <br>");
		out.println("<button type=submit> Submit </button> ");
		out.println("</form>");


        out.close();

	}

}
