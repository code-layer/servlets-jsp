package in.datalayer.pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class APNews extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out =  response.getWriter();
		out.println("<a href=index.html> Home | </a> ");
		out.println("<h1> News Corp Web App </h1>");
		out.println("<hr>");
		out.println("<h2>AP News From Agencies</h2>");

		RequestDispatcher requestDispatcher =
				request.getRequestDispatcher("/ap-business-news.html");
		requestDispatcher.include(request, response);
		requestDispatcher =
				request.getRequestDispatcher("/ap-sports-news.html");
		requestDispatcher.include(request, response);

		out.close();
	}

}
