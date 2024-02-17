package in.datalayer.pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfirmRegistration extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		out.println("<br><br>");
		out.println("<a href=index.html> Home | </a> ");
		out.println("<h3> Your are Registered Successfully </h3>");
		out.println("<h3> Thank You </h3>");
		out.close();
	}

}
