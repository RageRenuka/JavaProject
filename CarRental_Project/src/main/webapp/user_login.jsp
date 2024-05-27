<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/style.css">
<title>Car Rental | User Login</title>
</head>
<body>
<h1  style="color:yellow;"><font face="Algerian">CAR RENTAL</font></h1>
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
<form action="login.jsp" method="" ><table align="cenetr">
	<h1>User Login Form</h1>
		<tr>
		
			<td>User Email:</td>
			<td><input type="email" id="value1" name="email" placeholder="Enter Email" required/></td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><input type="password" id="value1" name="password" placeholder="Enter Password" required/></td>
		</tr>
		
		<tr><td></td><td><button type="reset" value="reset">reset</button>&nbsp;&nbsp;&nbsp;&nbsp;<button type="submit" value="Submit">Submit</button></td></tr>		
		</table>

	</form>

<div class="footer">
  <p>Copyright © 2024 - Car Rental&emsp; Developed by : Suresh online Java Team</p>
</div>

</body>
</html>