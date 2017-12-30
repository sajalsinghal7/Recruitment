<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
response.setHeader("Cache-Control","no-cache"); //Forces caches to obtain a new copy of the page from the origin server
response.setHeader("Cache-Control","no-store"); //Directs caches not to store the page under any circumstance
response.setDateHeader("Expires", 0); //Causes the proxy cache to see the page as "stale"
response.setHeader("Pragma","no-cache"); //HTTP 1.0 backward compatibility
String vendorEmail = (String) session.getAttribute("vendorEmail");
if (null == vendorEmail) {
   request.setAttribute("Error", "Session has ended.  Please login.");
   RequestDispatcher requestDispatcher = request.getRequestDispatcher("vendorLogin.jsp");
   requestDispatcher.forward(request, response);
}
%>
Page-->vendorLogout.jsp

<div align="center">
<form action="/vendor/login" method="post">
	<input type="text" name="email">
	<input type="password" name="password">
	<input type="submit" value="Login">
</form>
</div>

</body>
</html>