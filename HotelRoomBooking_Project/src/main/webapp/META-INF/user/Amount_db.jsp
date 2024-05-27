<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<%@page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hotel Room Booking System</title>
<!-- custom-theme -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Mug house Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //custom-theme -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- js -->
<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
<script src="js/main.js"></script>
<!-- //js -->
<!-- font-awesome-icons -->
<link href="css/font-awesome.css" rel="stylesheet"> 
<!-- tabs -->
<link href="css/easy-responsive-tabs.css" rel='stylesheet' type='text/css'/>
<!-- //tabs -->
<!-- //font-awesome-icons -->
<link href="//fonts.googleapis.com/css?family=Prompt:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&amp;subset=latin-ext,thai,vietnamese" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Merriweather" rel="stylesheet">

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

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

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
						<h1><a href="index.html"><span width ="20px">Booking System </span></a></h1>
					</div>
					<div class="header-nav">
						<nav class="navbar navbar-default">
							<div class="navbar-header navbar-left">
								<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
									<span class="sr-only">Toggle navigation</span>
									<span class="icon-bar"></span>
									<span class="icon-bar"></span>
									<span class="icon-bar"></span>
								</button>
							</div>
						<!-- Collect the nav links, forms, and other content for toggling -->
							<div class="collapse navbar-collapse navbar-right" id="bs-example-navbar-collapse-1">
								<nav class="link-effect-12">
									<ul class="nav navbar-nav w3_agile_nav">
										<li class="active"><a href="user index.jsp"><span>Home</span></a></li>
										<li><a href="Searching.jsp"><span>Booking</span></a></li>
										<li><a href="Viewbooking.jsp"><span> View Booking</span></a></li>
										<li><a href="logout.jsp"><span>Logout</span></a></li>
									</ul>	
								</nav>
							</div>
						</nav>
					</div>
					<div class="clearfix"> </div>
				</div>
			</div>
<!-- header -->
		</div>
	</div>
<!-- //banner -->

<body>
<div class="container">  
<div class="container">

<div class="w3_wthree_agileits_icons main-grid-border">
		<div class="container">
			<div class="w3ls-heading">
				<h2>User Booking</h2>
			</div></div></div><body>
<div style="font-size:20px;font-family:Cursive"><u><b><b></u></div>
<br>
<br>
<%
String roomid=request.getParameter("roomid");
String bookid=request.getParameter("bookid");
String fullname=request.getParameter("fullname");
String mobileno=request.getParameter("mobileno");
String email=request.getParameter("email");
String fdate=request.getParameter("pickup_date");
String sdate=request.getParameter("dropoff_date");
String money=request.getParameter("numdays");
int m=Integer.parseInt(money);
if(m<=0)
{
	out.println("<script>");
	out.println("alert('not Successfully Booked your room')");
	out.println("window.location.href='Booking.jsp'");
	out.println("</script>");
}
else
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crhotel","root","root");
PreparedStatement ps=con.prepareStatement("insert into booking values(?,?,?,?,?,?,?,?)");
ps.setString(1, roomid);
ps.setString(2, bookid);
ps.setString(3, fullname);
ps.setString(4, mobileno);
ps.setString(5, email);
ps.setString(6, fdate);
ps.setString(7, sdate);
ps.setString(8, money);
int a=ps.executeUpdate();
if(a>0)
{ 
	out.println("<script>");
	out.println("alert('Successfully Booked your room')");
	out.println("window.location.href='user index.jsp'");
	out.println("</script>");
}
else{
	out.println("<script>");
	out.println("alert('booking is not successfull... try again...')");
	out.println("window.location.href='Booking.jsp'");
	out.println("</script>");
}
con.close();
}
%> 
</body>
</html>
</body>
</html>