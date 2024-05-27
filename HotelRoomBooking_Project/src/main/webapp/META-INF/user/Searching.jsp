<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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

	<div class="container">
<br>
<br>
<form class="well form-horizontal" action="Booking.jsp" method="post"  id="contact_form" autocomplete="off">
<div class="w3_wthree_agileits_icons main-grid-border">
		<div class="container">
			<div class="w3ls-heading">
				<h2>Search city</h2>
			</div><br><br><br><br>
			
			
<div class="form-group"> 
  <label class="col-md-4 control-label">Search City</label>
    <div class="col-md-4 selectContainer">
    <div class="input-group">
      <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
    <select name="location" class="form-control selectpicker">
      <option value="">--Select--</option>
      <option>TIRUPATI</option>
      <option>BANGALORE</option>
      <option>CHITTOOR</option>
      <option>CHENNAI</option>    
    </select>
    </div>
  </div>
  </div>		
<div class="form-group">
  <label class="col-md-4 control-label"></label>
  <div class="col-md-4"><br>
  
    <input type="submit" class="btn btn-primary btn-block" >
  </div>
</div>
</form>    
</div>

<%@page import="java.sql.*" %>
<%
if(request.getParameter("location")!=null){
	String searching=request.getParameter("location");
	String a[]=new String[50];
	int i=0;
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crhotel","root","root");
	PreparedStatement ps = con.prepareStatement("SELECT *  FROM  addroom WHERE `location` LIKE ? "); 
	ps.setString(1, "%" + searching + "%");
	ResultSet rs=ps.executeQuery();
	while(rs.next()){
		session.setAttribute("com",rs.getString(1));
		a[i]=rs.getString(1);
		i++;
	
		%>
	
	<tr>
	<td><%=rs.getString(1) %></td>
	<td><%=rs.getString(2) %></td>
	<td><%=rs.getString(4) %></td>
	<td><%=rs.getString(5) %></td>
	<td><%=rs.getString(6) %></td>

	<td><input type="radio" name="roomid" value="<%=rs.getString(1)%>" ></td>
	<td><input type="submit" value="Book Room" /></td>
	</tr>
	<%} con.close(); } %>
	
	</table>


</body>
</html>