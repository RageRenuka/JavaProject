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

<form action="add_new_car.jsp" method="post" ><table align="cenetr">
	<h1>Add new car details</h1>
	    <tr>
			<td>car number:</td>
			<td><input type="text" id="value1" name="car_number" placeholder="Enter car number" required /></td>
		</tr>
		<tr>
			<td>car name:</td>
			<td><input type="text" id="value1" name="car_name" placeholder="Enter car name" required/></td>
		</tr>
		<tr>
			<td>car type:</td>
			<td><input type="text" id="value1" name="car_type" placeholder="Enter car type" required/></td>
		</tr>
		<tr>
			<td>car company:</td>
			<td><input type="text" id="value1" name="car_company" placeholder="Enter car company" required /></td>
		</tr>
		<tr>
			<td>car city:</td>
			<td><input type="text" id="value1" name="car_city" placeholder="Enter car city" required /></td>
		</tr>
		
		<tr>
			<td>number of seats:</td>
			<td><input type="text" id="value1" name="no_of_seats" placeholder="Enter number of seats" required /></td>
		</tr>
		<tr>
			<td>price per day:</td>
			<td><input type="text" id="value1" name="price_per_day" placeholder="Enter price per day" required /></td>
		</tr>
		<tr><td></td><td><button type="reset" value="reset">reset</button>&nbsp;&nbsp;&nbsp;&nbsp;<button type="save" value="save">Save</button></td></tr>		
		</table>

	</form>


</body>
</html>