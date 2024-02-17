package in.datalayer.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddSessionData extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String cityNameVal = request.getParameter("cityName");


		HttpSession httpSession = request.getSession(false);
		List<String> cNames = (List<String>) httpSession.getAttribute("cityNames");

		if(cNames==null){
			cNames = new ArrayList<String>();
			cNames.add(cityNameVal);
		}else{
			cNames.add(cityNameVal);
		}
		httpSession.setAttribute("cityNames", cNames);

		PrintWriter out = response.getWriter();
		out.println("<br><br>");
		out.println("<a href=index.html> Home | </a> ");
		out.println("<h3> Your city data is added to session on server</h3>");
		out.close();

	}

}
