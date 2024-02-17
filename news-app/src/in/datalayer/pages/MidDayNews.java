package in.datalayer.pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MidDayNews extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<a href=index.html> Home | </a> ");
		out.println("<h1> News Corp Web App </h1>");
		out.println("<hr>");
		out.println("<h3> Mid Day News. </h3>");
		out.println(" <br> Every downpour seems to be pouring cold water over civic body's " );
		out.println(" <br> grand declarations of being ready for the rains. " );
		out.println(" <br> After Monday's shower, which submerged the city, " );
		out.println(" <br> Thursday's few hours of torrential rains also drowned several roads and railway tracks" );
		out.close();

	}

}
