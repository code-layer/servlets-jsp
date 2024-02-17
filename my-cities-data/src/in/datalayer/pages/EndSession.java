package in.datalayer.pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EndSession extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession httpSession = request.getSession(false);
		httpSession.invalidate();

		PrintWriter out = response.getWriter();

		out.println("<br><br>");
		out.println("<a href=index.html> Home | </a> ");
		out.println("<h3> Your Server Session Is Removed. </h3>");
		out.close();
	}

}
