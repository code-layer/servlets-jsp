package in.datalayer.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ReadSessionData extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession httpSession = request.getSession(false);

		PrintWriter out = response.getWriter();
		out.println("<br><br>");
		out.println("<a href=index.html> Home | </a> ");
		out.println("<h3>City names in User Session.</h3>");

		if(httpSession != null ) {
			List<String> cNames = (List<String>) httpSession.getAttribute("cityNames");
			for(String cName: cNames) {
				out.println("<h4> City Name: " + cName + "</h4>");
			}
		} else {
			out.println("<h3>No session data found.</h3>");

		}
		out.close();
	}

}
