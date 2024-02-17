package in.datalayer.pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterPage extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String custNameVal = request.getParameter("custName");
		String mobileNoVal = request.getParameter("mobileNo");
		String emailIdVal = request.getParameter("emailId");
		String planVal = request.getParameter("plan");

		PrintWriter out = response.getWriter();

		out.println("<br><br>");
		out.println("<a href=index.html> Home | </a> ");
		out.println("<h3> Your Registration Data </h3>");
		out.println("<h4> Name: " + custNameVal + " </h3>");
		out.println("<h4> Mobile No: " + mobileNoVal + "</h3>");
		out.println("<h4> Email Id: "  + emailIdVal + "</h3>");
		out.println("<h4> Plan: "  + planVal + "</h3>");


		out.println("<br>");
		out.println("<h3> Verify and confirm above Details. </h3>");
		out.println("<form action=ConfirmRegistration method=get>");
		out.println("<button type=submit> Confirm Registration </button> ");
		out.println("</form>");

		out.close();

	}

}