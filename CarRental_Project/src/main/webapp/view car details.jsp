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
	 color:#1b5db1;
		}
</style>
<title>Car Rental | Home</title>
</head>
<body>
<div>
<h1  style="color:yellow;"><font face="Algerian">CAR RENTAL</font></h1>
</div>

<ul>
  <li><a href="admin index.jsp">Home</a></li>
  <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn">car information</a>
    <div class="dropdown-content">
      <a href="add new car.jsp">new car entry</a>
      <a href="view car details.jsp">view all cars</a>
    </div>
    <li class="dropdown">
  <a href="javascript:void(0)" class="dropbtn">Driver information</a>
    <div class="dropdown-content">
      <a href="add new driver.jsp">Add Driver</a>
      <a href="view all drivers.jsp">view All Drivers</a>
    </div>
    <li><a href="view bookings.jsp">view bookings</a></li>
    
    <li><a href="index.jsp">logout</a></li>
</ul>

<div class="view" style="background-color:;height: 200px; align: left;" >
<br><br>

<%@page import="java.sql.*" %>
<div class="col-md-1"></div>
<div class="col-md-9"><h1 ">All car Details</h1>
<center>
<form class="view" action="Car delete.jsp" method="post">
<table border=1>
<tr><th>Car number</th><th>Car name</th><th>Car type</th><th>Car Company</th><th>Car city</th><th>No Of Seats</th><th>Price Per day</th>
</tr>

<%
	
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","renuka");
	PreparedStatement ps = con.prepareStatement("SELECT *  FROM  `add_car_details`");   
	ResultSet rs=ps.executeQuery();
	while(rs.next()){		
		%>
	<tr><td><%=rs.getString(1) %></td>
	<td><%=rs.getString(2) %></td>
	<td><%=rs.getString(3) %></td>
	<td><%=rs.getString(4) %></td>
	<td><%=rs.getString(5) %></td>
	<td><%=rs.getString(6) %></td>
	<td><%=rs.getString(7) %></td>
	</tr>
	<%} %>
	</table>
	<br><br>
	<input type = "hidden" name="Delete" value="Delete">
	   		<input type="Submit" style="margin-left:0px;width: 300px;color:red;" name="delete" value="Delete">
	
	</form>
	</center>
</div>
</div>



<div class="footer">
  <p>Copyright © 2024 - Car Rental&emsp; Developed by :Suresh Java online Team</p>
</div>

</body>
</html>