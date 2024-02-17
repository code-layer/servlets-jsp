package in.datalayer.pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginPage extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// successful user
		// start session
		request.getSession(true);

		PrintWriter out = response.getWriter();

		out.println("<br><br>");
		out.println("<a href=LogoutPage> Logout | </a> ");
		out.println("<h3> You have logged in </h3>");
		out.println("<h3> Business Home Page </h3>");
		out.close();
	}

}
