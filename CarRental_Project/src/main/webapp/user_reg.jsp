<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/style.css">
<title>Car Rental | User Registration</title>
</head>
<body>
	<h1 style="color: yellow;">
		<font face="Algerian">CAR RENTAL</font>
	</h1>
	<ul>
		<li><a href="index.jsp">Home</a></li>
		<li><a href="about.jsp">About Us</a></li>
		<li class="dropdown"><a href="javascript:void(0)" class="dropbtn">User</a>
			<div class="dropdown-content">
				<a href="user_reg.jsp">Registration</a> <a href="user_login.jsp">Login</a>
			</div>
		<li><a href="admin_login.jsp">Admin Login</a></li>
		<li><a href="contact.jsp">Contact Us</a></li>

	</ul>

	<form action="reg.jsp" method="post">
		<table align="cenetr">
			<h1>Registration Form</h1>
			<%
				int a = 0;
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "renuka");
				PreparedStatement ps1 = con.prepareStatement("select max(uid) from user_regi");
				ResultSet rs = ps1.executeQuery();
				while (rs.next()) {
					a = rs.getInt("max(uid)");
				}
			%>
			<tr>
				<td>User No:</td>
				<td><input type="text" id="value1" name="uid" value="<%=a%>"
					readonly></td>
			</tr>
			<tr>
				<td>Full Name:</td>
				<td><input type="text" id="value1" name="fullname"
					placeholder="Enter Full Name" required /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="email" id="value1" name="email"
					placeholder="Enter Email id" required /></td>
			</tr>
			<tr>
				<td>password:</td>
				<td><input type="password" id="value1" name="password"
					placeholder="Enter Password" required /></td>
			</tr>
			<tr>
				<td>Phone Number:</td>
				<td><input type="text" id="value1" name="phoneno"
					placeholder="Enter Phone Number" required /></td>
			</tr>
			<td>Address:</td>
			<td><textarea cols="40" rows="10" name="address"
					placeholder="Enter Address" required></textarea></td>
			</tr>

			<tr>
				<td></td>
				<td><button type="Submit" value="Submit">Submit</button>&nbsp;&nbsp;&nbsp;&nbsp;
					<button type="Reset" value="Reset">Reset</button></td>
			</tr>
		</table>

	</form>


</body>
</html>
