<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>JSP Demo</title>
</head>
<body>

<h2>JSP Actions Demo.</h2>

<hr>
<h2>Get response from another JSP page.</h2>
<jsp:include page="news.jsp"></jsp:include>

<hr>
<h2>Java Beans in JSP Pages. Supports encapsulation and abstraction.</h2>
<h2>Create and set values for Bean.</h2>
<jsp:useBean id="news" class="in.datalayer.actions.NewsAggregate"/>
<jsp:setProperty property="channelName" name="news" value="Zee News"/>
<jsp:setProperty property="newsItem" name="news" value="It industry is supported by H1 Law."/>


<hr>
<h2>Access bean</h2>
<h3>Agency:<jsp:getProperty property="channelName" name="news"/>  </h3>
<h3>News: <jsp:getProperty property="newsItem" name="news"/></h3>

</body>
</html>