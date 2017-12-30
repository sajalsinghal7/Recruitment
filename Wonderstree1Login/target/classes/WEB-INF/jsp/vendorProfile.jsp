<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
String vendorEmail = (String) session.getAttribute("vendorEmail");
response.setHeader("Cache-Control","no-cache"); //Forces caches to obtain a new copy of the page from the origin server
response.setHeader("Cache-Control","no-store"); //Directs caches not to store the page under any circumstance
response.setDateHeader("Expires", 0); //Causes the proxy cache to see the page as "stale"
response.setHeader("Pragma","no-cache"); //HTTP 1.0 backward compatibility
if (null == vendorEmail) {
   request.setAttribute("Error", "Session has ended.  Please login.");
   RequestDispatcher requestDispatcher = request.getRequestDispatcher("vendorLogin.jsp");
   requestDispatcher.forward(request, response);
} 
%>


page-->vendorProfile.jsp

<br>
<a href="/vendor/logout">Logout by clicking /vendor/logout</a>
<br>
<% // String vendorEmail= (String)session.getAttribute("vendorEmail"); %>
Session object ${vendorEmail}
</body>
</html>