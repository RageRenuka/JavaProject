<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/style.css">
<style>
.view{
     align: center;
	 margin-left: 50px;
	 margin-top:5px;
	 height: 350px;
	 width: 600px;
	 font-weight:bold;
	 color:yellow;
		}
</style>
<title>Car Rental | Home</title>
</head>
<body>
<div>
<h1  style="color:yellow;"><font face="Algerian">CAR RENTAL</font></h1>
</div>

<ul>
 <li><a href="index.jsp">Home</a></li>
  <li><a href="booking.jsp">Booking</a></li>
  <li><a href="Bookdetails.jsp">Bookdetails</a></li>
  <li><a href="contact.jsp">Contact Us</a></li>
</ul>

<div class="view" >
<br><br>

<%@page import="java.sql.*" %>
<div class="col-md-1"></div>
<div class="col-md-9"><h1 ">All car Details</h1>
<center>
<form action="Bookings.jsp" method="post">
<table border=1 style="background-color:red">
<tr><th>Car number</th><th>Car name</th><th>Car type</th><th>Car Company</th><th>Car city</th><th>No Of Seats</th>
<th>Price Per day</th></tr>

<%
	
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","renuka");
	PreparedStatement ps = con.prepareStatement("SELECT *  FROM  `add_car_details`");   
	ResultSet rs=ps.executeQuery();
	while(rs.next()){		
		
		
	String carname=rs.getString("Car_Name");
	String carnumber=rs.getString("Car_No");
	String carmodel=rs.getString("Car_Model");
	int noofseats=rs.getInt("No_of_Seats");
	String e= rs.getString("far_per_day");
	session.setAttribute("fare", e);%>
	
	<tr><td><%=rs.getString(1) %></td>
	<td><%=rs.getString(2) %></td>
	<td><%=rs.getString(3) %></td>
	<td><%=rs.getString(4) %></td>
	<td><%=rs.getString(5) %></td>
	<td><%=rs.getString(6) %></td>
	<td><%=rs.getString(7) %></td>
	<td><input type="radio">
	  </td> 
	</tr>
	<%} %>
	</table><br><br>
	<input style="color:red" type="submit" value="book_car" />
	</form>
	</center>
</div>
</div>




<div class="footer">
  <p>Copyright © 2024 - Car Rental&emsp; Developed by :Suresh Java online Team</p>
</div>

</body>
</html>