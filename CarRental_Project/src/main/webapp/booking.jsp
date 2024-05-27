<%@page import="java.lang.management.ClassLoadingMXBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/style.css">
<title>Car Rental | Home</title>
<div>
<h1  style="color:blue;"><font face="Algerian">CAR RENTAL</font></h1>
</div>

<ul>
  <li><a href="index.jsp">Home</a></li>
  <li><a href="booking.jsp">Booking</a></li>
  <li><a href="User Booking Details.jsp">Book details</a></li>
  <li><a href="contact.jsp">Contact Us</a></li>
</ul>
<script type="text/javascript">
    function getTaskId(){
        var id = document.getElementById('getTaskId').value;
        alert(id);
    }
</script>
<body style="background-color:white">
<h3 style="font-size:50px;text-align:center;font-family:Comic Sans MS, cursive, sans-serif;color:blue"><b><i>Book Your Car</i></b></h3>

<br>
<br>
<table border=1 align = "center">
<tr><th>Car number</th><th>Car name</th><th>Car type</th><th>Car Company</th>
<th>Car city</th><th>No Of Seats</th><th>Price Per day</th><th>Select your Choice</th></tr>

<form action="amount.jsp" method = "post">

    <%@page import="java.sql.*" %>
<%
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","renuka");
	PreparedStatement ps = con.prepareStatement("SELECT *  FROM  add_car_details");   
	ResultSet rs=ps.executeQuery();
	while(rs.next())
	{
	String car_number=rs.getString("car_number");
	String car_name=rs.getString("car_name");
	String car_company=rs.getString("car_company");
	int No_of_Seats=rs.getInt("No_of_Seats");
	String e= rs.getString("price_per_day");
	
	%>
	<tr><td><%=rs.getString(1) %></td>
	<td><%=rs.getString(2) %></td>
	<td><%=rs.getString(3) %></td>
	<td><%=rs.getString(4) %></td>
	<td><%=rs.getString(5) %></td>
	<td><%=rs.getString(6) %></td>
	<td><%=e%></td>
	<td>
	   		<input type="radio" style="margin-left: 10px;" name="carno" value="<%=car_number%>">
	   		
	</td>

	</tr>
	
	<%} %>
	</table><br><br>
<input type="submit" style="margin-left: 500px;color:red" value="Book Car" />
</form>
<% 
	con.close();
%>
</body>
</html>