package in.datalayer.pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PermitPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setStatus(200);

		// add custom headers
		response.setHeader("x-client-name", "ABC Corp News Consultants");
		response.setHeader("x-request-count", "100");

		// add cookies to watch news
		Cookie newsChannel = new Cookie("newsChannel", "DayNews");
		newsChannel.setMaxAge(60 * 60 * 24);
		response.addCookie(newsChannel);

		PrintWriter out = response.getWriter();
		out.println("<a href=index.html> Home | </a> ");
		out.println("<h1> News Corp Web App </h1>");
		out.println("<hr>");
		out.println("<h3> You are allowed to watch news for Next 1 Hour. </h3>");
		out.close();

	}

}
