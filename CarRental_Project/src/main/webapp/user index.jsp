<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/style.css">
<title>Car Rental | Home</title>
</head>
<body>
<div>
<h1  style="color:Blue;"><font face="Algerian">CAR RENTAL</font></h1>
</div>

<ul>
  <li><a href="user index.jsp">Home</a></li>
  <li><a href="booking.jsp">Booking</a></li>
  <li><a href="User Booking Details.jsp">Book details</a></li>
  <li><a href="contact.jsp">Contact Us</a></li>
  <li><a href="index.jsp">Logout</a></li>
</ul>
<b style="color:red; margin-left: 1100px;font-size: 20px;">Welcome</b>
<%=session.getAttribute("username")%>

</body>
</html>