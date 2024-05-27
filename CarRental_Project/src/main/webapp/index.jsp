<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.btn-group button {
    background-color: #4CAF50; /* Green background */
    border: 1px solid green; /* Green border */
    color: white; /* White text */
    padding: 10px 24px; /* Some padding */
    cursor: pointer; /* Pointer/hand icon */
    width: 10%; /* Set a width if needed */
    display: block; /* Make the buttons appear below each other */
}

.btn-group button:not(:last-child) {
    border-bottom: none; /* Prevent double borders */
}

/* Add a background color on hover */
.btn-group button:hover {
    background-color: #3e8e41;
}
div a:HOVER {
	color:red;
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/style.css">
<title>Car Rental | Home</title>
</head>
<body>
<div>
<h1  style="color:yellow;"><font face="Algerian">CAR RENTAL</font></h1>
</div>
<ul>
  <li><a href="index.jsp">Home</a></li>
  <li><a href="about.jsp">About Us</a></li>
  <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn">User</a>
    <div class="dropdown-content">
      <a href="user_reg.jsp">Registration</a>
      <a href="user_login.jsp">Login</a>
    </div>
  <li><a href="admin_login.jsp">Admin Login</a></li>
  <li><a href="contact.jsp">Contact Us</a></li>
  
</ul>
<div class="footer">
  <p>Copyright © 2024 - Car Rental&emsp; Developed by : Suresh Java online Team</p>
</div>

</body>
</html>