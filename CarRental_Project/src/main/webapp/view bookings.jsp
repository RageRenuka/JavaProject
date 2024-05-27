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
    <li><a href="Bookdetails.jsp">view bookings</a></li>
    
    <li><a href="index.jsp">logout</a></li>
</ul>
<div class="footer">
  <p>Copyright © 2024 - Car Rental&emsp; Developed by : Suresh Java online Team</p>
</div>

</body>
</html>