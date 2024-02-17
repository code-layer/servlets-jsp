<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="java.util.Date" %>
<%@page errorPage="display-error.jsp" %>
<html>
<head>
<title>JSP Directives Demo.</title>
</head>
<body>
<h2>JSP has 3 types of Directives.</h2>
<h3>1. page directive</h3>
<h3>2. include directive</h3>
<h3>3. taglib directive</h3>

<hr>
<h2>Page directive</h2>
<h3>Used for importing classes. Session and exception management.</h3>
<h3>Current date and time is <%=new Date() %></h3>

<%
   int i = 100;
   i = i/10;
%>

<hr>
<h2>include directive</h2>
<%@include file="footer.jsp" %>
</body>
</html>