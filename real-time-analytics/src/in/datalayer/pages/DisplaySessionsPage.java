package in.datalayer.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.datalayer.model.Session;

public class DisplaySessionsPage extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletContext appContext = request.getServletContext();
		List<Session> sessionList =
				(List<Session>) appContext.getAttribute("allSessions");

		PrintWriter out =  response.getWriter();
		out.println("<a href=index.html> Home | </a> ");
		out.println("<h3> All Current Session Details</h3>");
		out.println("<hr>");
		out.println("<h4> Session Id  |  Created Time </h4>");
		out.println("<h4>--------------------------</h4>");
		for(Session ses : sessionList) {
			out.println("<h4> " + ses.getId() + " | " +
							      new Date(ses.getCreationTime()) +  "</h4>");
		}
		out.close();

	}

}
