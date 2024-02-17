package in.datalayer.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.datalayer.model.ProductLike;

public class RegisterLikes extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ProductLike productLike = new ProductLike(
				request.getParameter("productId"),
				request.getParameter("custName"));

		ServletContext appContext = request.getServletContext();
		List<ProductLike> prodLikesList =
				(List<ProductLike>) appContext.getAttribute("allLikes");
		if(  prodLikesList ==null ){
			prodLikesList = new ArrayList<>();
			prodLikesList.add(productLike);
		} else {
			prodLikesList.add(productLike);
		}

		appContext.setAttribute("allLikes", prodLikesList);

		PrintWriter out =  response.getWriter();

		out.println("<br><br><a href=index.html> Home | </a> ");
		out.println("<h3> Product Like added to Application Context Memory</h3>");
		out.println("<hr>");
		out.close();

	}

}
