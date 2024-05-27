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
    <li><a href="view bookings.jsp">view bookings</a></li>
    <li><a href="index.jsp">logout</a></li>
</ul>

<form action="add_new_driver.jsp" method="post" ><table align="cenetr">
	<h1>Add new car details</h1>
		<tr>
			<td>Driver id:</td>
			<td><input type="text" id="value1" name="driver_id" placeholder="Enter driver id" required/></td>
		</tr>
		<tr>
			<td>Driver name:</td>
			<td><input type="text" id="value1" name="driver_name" placeholder="Enter driver name" required/></td>
		</tr>
		<tr>
			<td>phone number:</td>
			<td><input type="text" id="value1" name="driver_phno" placeholder="Enter driver phone number" required /></td>
		</tr>
		<tr>
		<td>Address:</td>
			<td><textarea cols="40" rows="10" name="driver_address" placeholder="Enter Address" required></textarea></td>
		</tr>
		<tr><td></td><td><button type="reset" value="reset">reset</button>&nbsp;&nbsp;&nbsp;&nbsp;<button type="save" value="save">Save</button></td></tr>		
		</table>

	</form>




</body>
</html>