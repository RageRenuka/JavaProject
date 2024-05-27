<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.Date"%>
<%@page import="java.text.Format"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hotel Room Booking System</title>
<!-- custom-theme -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Mug house Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<!-- //custom-theme -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css"
	media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- js -->
<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
<script src="js/main.js"></script>
<!-- //js -->
<!-- font-awesome-icons -->
<link href="css/font-awesome.css" rel="stylesheet">
<!-- tabs -->
<link href="css/easy-responsive-tabs.css" rel='stylesheet'
	type='text/css' />
<!-- //tabs -->
<!-- //font-awesome-icons -->
<link
	href="//fonts.googleapis.com/css?family=Prompt:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&amp;subset=latin-ext,thai,vietnamese"
	rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Merriweather"
	rel="stylesheet">

<style>
#customers {
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#customers td, #customers th {
	border: 1px solid #ddd;
	padding: 8px;
}

#customers tr:nth-child(even) {
	background-color: #f2f2f2;
}

#customers tr:hover {
	background-color: #ddd;
}

#customers th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #4CAF50;
	color: white;
}
</style>


</head>
<body>
	<!-- banner -->
	<div class="banner">
		<div class="header-bottom">
			<div class="header">
				<div class="container">
					<div class="w3_agile_logo">
						<h1>
							<a href="index.html"><span width="20px">Booking System
							</span></a>
						</h1>
					</div>
					<div class="header-nav">
						<nav class="navbar navbar-default">
						<div class="navbar-header navbar-left">
							<button type="button" class="navbar-toggle collapsed"
								data-toggle="collapse"
								data-target="#bs-example-navbar-collapse-1">
								<span class="sr-only">Toggle navigation</span> <span
									class="icon-bar"></span> <span class="icon-bar"></span> <span
									class="icon-bar"></span>
							</button>
						</div>
						<!-- Collect the nav links, forms, and other content for toggling -->
						<div class="collapse navbar-collapse navbar-right"
							id="bs-example-navbar-collapse-1">
							<nav class="link-effect-12">
							<ul class="nav navbar-nav w3_agile_nav">
								<li class="active"><a href="user index.jsp"><span>Home</span></a></li>
								<li><a href="Searching.jsp"><span>Booking</span></a></li>
								<li><a href="Viewbooking.jsp"><span> View
											Booking</span></a></li>
								<li><a href="logout.jsp"><span>Logout</span></a></li>
							</ul>
							</nav>
						</div>
						</nav>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
			<!-- header -->
		</div>
	</div>
	<!-- //banner -->
<body>
	<div class="container">
		<div class="container">
			<form class="well form-horizontal" action="Booking_delete.jsp"
				method="post" id="contact_form" autocomplete="off">

				<div class="w3_wthree_agileits_icons main-grid-border">
					<div class="container">
						<div class="w3ls-heading">
							<h2>View User Booking Details</h2>
						</div>
					</div>
				</div>
				<table border=1 id="customers">
					<div class="container">
						<table id="customers">
							<tr>
								<th>ROOMID</th>
								<th>BOOKINGID</th>
								<th>FULLNAME</th>
								<th>MOBILE NO</th>
								<th>EMAIL</th>
								<th>IN DATE</th>
								<th>OUT DATE</th>
								<th>TOTAL AMOUNT</th>
								<th>SELECT</th>
								<th>BOOKING CANCEL</th>

							</tr>
							<%
								Class.forName("com.mysql.jdbc.Driver");
								Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crhotel", "root", "root");
								PreparedStatement ps = con
										.prepareStatement("select * from booking where email='" + session.getAttribute("email") + "'");
								ResultSet rs = ps.executeQuery();
								while (rs.next()) {
									String n1 = rs.getString("roomid");
									String n2 = rs.getString("bookid");
									String n3 = rs.getString("fullname");
									String n4 = rs.getString("mobileno");
									String n5 = rs.getString("email");
									String n6 = rs.getString("pickup_date");
									String n7 = rs.getString("dropoff_date");
									String n8 = rs.getString("numdays");
							%>
							<tr>
								<td><%=n1%></td>
								<td><%=n2%></td>
								<td><%=n3%></td>
								<td><%=n4%></td>
								<td><%=n5%></td>
								<td><%=n6%></td>
								<td><%=n7%></td>
								<td><%=n8%></td>

								<td><input type="radio" value=<%=rs.getString("bookid")%>
									name="bookid"></td>

								<td><input type="submit" value="BOOKING CANCEL"></td>



								<%
									}
									con.close();
								%>
							
						</table>

						</form>
						</center>

					</div>


					<!-- Supportive js -->
					<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
					<!-- //Supportive js -->
					<script type="text/javascript" src="js/bootstrap.js"></script>
					<!-- bootstrap js file -->

					<!-- smooth scrolling js -->
					<script src="js/SmoothScroll.min.js"></script>
					<!-- smooth scrolling js -->

					<!-- start-smooth-scrolling -->
					<script type="text/javascript" src="js/move-top.js"></script>
					<script type="text/javascript" src="js/easing.js"></script>
					<script type="text/javascript">
						jQuery(document).ready(function($) {
							$(".scroll").click(function(event) {
								event.preventDefault();
								$('html,body').animate({
									scrollTop : $(this.hash).offset().top
								}, 1000);
							});
						});
					</script>
</body>
</html>