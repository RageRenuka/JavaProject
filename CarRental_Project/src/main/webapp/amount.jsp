
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.Date"%>
<%@page import="java.text.Format"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>



<!DOCTYPE html >
<html>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/style.css">
<head>
<link
	href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.2.2/css/bootstrap-combined.min.css"
	rel="stylesheet">
<link rel="stylesheet" type="text/css" media="screen"
	href="http://tarruda.github.com/bootstrap-datetimepicker/assets/css/bootstrap-datetimepicker.min.css">
<script type="text/javascript"
	src="http://cdnjs.cloudflare.com/ajax/libs/jquery/1.8.3/jquery.min.js">
</script>
<script type="text/javascript"
	src="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.2.2/js/bootstrap.min.js">
</script>
<script type="text/javascript"
	src="http://tarruda.github.com/bootstrap-datetimepicker/assets/js/bootstrap-datetimepicker.min.js">
</script>
<script type="text/javascript"
	src="http://tarruda.github.com/bootstrap-datetimepicker/assets/js/bootstrap-datetimepicker.pt-BR.js">
</script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>

<script>
$(function(){
    var dtToday = new Date();
    
    var month = dtToday.getMonth() + 1;
    var day = dtToday.getDate();
    var year = dtToday.getFullYear();
    if(month < 10)
        month = '0' + month.toString();
    if(day < 10)
        day = '0' + day.toString();
    
    var minDate= year + '-' + month + '-' + day;
    
    $('#txtDate').attr('min', minDate);
    $('#txtDatee').attr('min', minDate);
    
});
</script>
<%
	String am = null;
	String sql = "select *from add_car_details where car_number=?";
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "renuka");
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1, request.getParameter("carno"));
	ResultSet rs = ps.executeQuery();
	while (rs.next()) {
		am = rs.getString("price_per_day");
	}
%>
<script type="text/javascript">
function GetDays(){
    var dropdt = new Date(document.getElementById("txtDatee").value);
    var pickdt = new Date(document.getElementById("txtDate").value);
   	var days=parseInt(((dropdt - pickdt) / (24 * 3600 * 1000)));
    var amount=days*<%=am%>
	;

		if (days == 0) {
			return
<%=am%>
	;
		} else if (amount < 0) {
			alert("Valid dates");
		} else {
			return amount;
		}
	}
	function cal() {
		if (document.getElementById("txtDatee")) {
			document.getElementById("numdays2").value = GetDays();
		}
	}
</script>

<title>Check amount</title>
<body>
	<div>
		<h1 style="color: blue;">
			<font face="Algerian">CAR RENTAL</font>
		</h1>


		<ul>
			<li><a href="index.jsp">Home</a></li>
			<li><a href="booking.jsp">Booking</a></li>
			<li><a href="Bookdetails.jsp">Book details</a></li>
			<li><a href="contact.jsp">Contact Us</a></li>
			<li><a href="logout.jsp">Logout</a></li>
		</ul>
	</div>

	<form action="Bookings.jsp" method="post">
		<table>
			<tr>
				<th><p>
						<label class="form">Car Number:</label>
				<input type="text" class="textbox" id="car_number"
					name="car_number" value="<%=request.getParameter("carno")%>"
					readonly onchange="cal()">
				</p>
				</th>
				</div><br>

				<th><p>
						<label class="form">Pickup Date:</label>
				<input type="date" class="textbox" id="txtDate"
					name="pickup_date" onchange="cal()">
				</p>
				</div>
				</th>

				<th><p>
						<label class="form">Drop off Date:</label>
				<input type="date" class="textbox" id="txtDate"
					name="dropoff_date" onchange="cal()" />
				</p>
				</div>
				</th>
			</tr>
			<th><label class="form">Total Price:</label></th>
			<td><input type="text" class="textbox" id="numdays2"
				name="numdays" /></td>

			<center></center>
			<tr>
				<td height="10%" width="100%"><input type="submit"
					value="Submit" onclick="cal()";><br>
				<br> <input type="reset" value="reset"></td>
				</center>

			</tr>
		</table>

	</form>
</body>
</html>