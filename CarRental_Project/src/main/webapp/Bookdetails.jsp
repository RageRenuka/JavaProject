<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/style.css">
<title>Car Rental | Home</title>
</head>
<body >
<ul>
<h1 style="color:Blue;"><font face="Times New Roman">CAR RENTAL</font></h1>
  <li><a href="index.jsp">Home</a></li>
  <li><a href="booking.jsp">Booking</a></li>
  <li><a href="Bookdetails.jsp">Book details</a></li>
  <li><a href="contact.jsp">Contact Us</a></li>
  
</ul>

<%@page import="java.sql.*" %>
<h1 align="center">User Booking Details</h1>

<form class="view" action=" " method="post">
<table border=1><tr>
	<th> Car Number</th>
	<th>Car Name</th>
	<th>Car City</th>
	<th>Number of Seats</th>
	<th>Amount Per Day</th>
	<th>Pickup Date</th>
	<th>Delivery Date</th>
	<th>Total Amount</th></tr>
<% 
String sql ="select * from add_car_details inner join user_dates on add_car_details.car_number=user_dates.carno";
//String sql=" select m.*,n.* from add_car_details m,user_dates n, where m.car_number = n.carno";
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "renuka");
PreparedStatement pstmt=con.prepareStatement(sql);
ResultSet rs=pstmt.executeQuery(); 
while(rs.next())
{ 
	String n1=rs.getString("car_number");
	String n2=rs.getString("car_name");
	String n3=rs.getString("car_city");
	int n4=rs.getInt("no_of_seats");	
	String n5=rs.getString("Price_per_day");
	String pickup_date=rs.getString("from");
	String dropoff_date=rs.getString("to");
	String numdays=rs.getString("money");
	session.setAttribute("pickup_date", pickup_date);
	session.setAttribute("dropoff_date", dropoff_date);
	%>
	<tr>
	<td><%=n1%></td>
	<td><%=n2%></td>
	<td><%=n3%></td>
	<td><%=n4%></td>
	<td><%=n5 %></td>
	<td><%=pickup_date %></td>
	<td><%=dropoff_date%></td>
	<td><%=numdays %></td></tr>
<% }
con.close();
%>
</table></form>
</body>
</html>