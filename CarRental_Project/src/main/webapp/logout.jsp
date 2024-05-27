<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logout</title>
<link href= "css/style.css">
</head>
<body>
  <%
		session.invalidate();
  response.setHeader("Cache-Control","no-cache"); 
  response.setHeader("Cache-Control","no-store"); 
  response.setDateHeader("Expires", 0); 
  response.sendRedirect("user index.jsp");
  %>

      <%-- // <h1><font color="Red">You are Sucessfully logged out...</font></h1>

         <a href="user index.jsp">Go-Back To Home Page</a>--%>

    </body>
</html>