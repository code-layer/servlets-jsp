package in.datalayer.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.datalayer.model.ProductLike;

public class DisplayLikesPage extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletContext appContext = request.getServletContext();
		List<ProductLike> prodLikesList =
				(List<ProductLike>) appContext.getAttribute("allLikes");

		PrintWriter out =  response.getWriter();
		out.println("<a href=index.html> Home | </a> ");
		out.println("<h3> Global Product Likes from Application Context Memory</h3>");
		out.println("<hr>");
		out.println("<h4> User Name  |  Prod Name </h4>");
		out.println("<h4>--------------------------</h4>");
		for(ProductLike pl : prodLikesList) {
			out.println("<h4> " + pl.getCustName() + " | " +
							      pl.getProductId() +  "</h4>");
		}
		out.close();
	}

}
