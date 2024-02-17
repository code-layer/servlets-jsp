<html>
<head>
<title>JSP Scriptlets Demo.</title>
</head>


<body>

<h2>JSP scriptlets Demo.</h2>

<hr>
<h1>How to write java code in JSP pages.</h1>

<hr>
<h3>Write java code inside JSP Page.</h3>
<h3>Scriptlet : contains variables and methods.</h3>
<%
int x = 100;
out.println("<h4> X value is : " + x + "</h4>");
%>


<hr>
<h3>Use conditional Statements</h3>
<%
   int marks = 75;
   if( marks >= 40) {
	   out.println("<h4> Passed in Test.");
   }else {
	   out.println("<h4> Failed in Test.");
   }
%>

<hr>
<h3>Use Loops</h3>
<%
   int i;
   String cityName="London";
   
   for(i=0; i<5; i++ ){
	   out.println("<h4>" + i + " City Name : " + cityName + "</h4>");
   }
%>

<hr>
<h2>Expression. Read java value in html page. Outside of jsp scriptlets.</h2>
<%
	String comName = "ABC Technologies India Pvt Ltd";
%>
<h3>Company name using Expression <%=comName%></h3>

</body>
</html>