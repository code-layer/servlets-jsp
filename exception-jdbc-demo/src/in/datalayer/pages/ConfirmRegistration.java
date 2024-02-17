package in.datalayer.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.datalayer.model.CacheUtil;
import in.datalayer.model.DaoUtil;
import in.datalayer.model.NewsUser;

public class ConfirmRegistration extends HttpServlet {

	NewsUser user = CacheUtil.newsUser;

	//jdbc code
	DaoUtil daoUtil = new DaoUtil();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		try {
			daoUtil.addNewsUser(user);
		} catch (SQLException e) {
			throw new ServletException("Unable to Add DB Row." + e.getMessage());
		}

		out.println("<br><br>");
		out.println("<a href=index.html> Home | </a> ");
		out.println("<h3> Your are Registered Successfully </h3>");
		out.println("<h3> Thank You </h3>");
		out.close();
	}

}
