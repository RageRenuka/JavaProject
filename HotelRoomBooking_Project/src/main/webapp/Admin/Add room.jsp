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
</head>
<body>
<!-- banner -->
	<div class="banner-1">
		<div class="header-bottom">
			<div class="header">
				<div class="container">
					<div class="w3_agile_logo">
						<h1><a href="index.html"><span width ="20px">Room Booking</span></a></h1>
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
										<li class="active"><a href="index.jsp"><span>Home</span></a></li>									
										<li><a href="Add room.jsp"><span>Add Room</span></a></li>									
										<li><a href="Update room.jsp"><span>Update Room</span></a></li>							
										<li><a href="Update room.jsp"><span>Delete Room</span></a></li>
										<li><a href="View bookings.jsp"><span>view bookings</span></a></li>
										<li><a href="Admin login.jsp"><span>Logout</span></a></li>
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
<!-- icons -->
<div class="container">
<form class="well form-horizontal" action="Add_roomdb.jsp" method="post"  id="contact_form" autocomplete="off">
<fieldset style="color: green;background-color: pink">
<div class="w3_wthree_agileits_icons main-grid-border">
		<div class="container">
			<div class="w3ls-heading">
				<h2>Add Room</h2><br><br>
			</div>					  
			<!-- Text input-->

    <div class="form-group">
     <label class="col-md-4 control-label">Room No:</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
  		<input  type="text" name="roomid" placeholder="Enter Room Id" class="form-control" >
    </div>
  </div>
  </div>
  
  <div class="form-group"> 
  <label class="col-md-4 control-label">Room Type</label>
    <div class="col-md-4 selectContainer">
    <div class="input-group">
      <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
      <select name="roomtype" class="form-control selectpicker">
      <option value="">--Select--</option>
      <option>NON-AC</option>
      <option>DELEXE</option>
      <option>SUPER DELUXE</option>
      <option>AC</option>     
    </select>
  </div></div></div>

 <div class="form-group">
     <label class="col-md-4 control-label">Price Per Day</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
  		 <input name="price_per_day" placeholder="Enter Price Per Day" class="form-control"  type="text">
    </div>
  </div>
  </div>
  
   <div class="form-group">
     <label class="col-md-4 control-label">Number of beds</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
    <select name="no_of_rooms" class="form-control selectpicker">
      <option value="">--Select--</option>
      <option>1</option>
      <option>2</option>
      <option>3</option>
      <option>4</option>
      <option>6</option>
      <option>8</option>
      <option>10</option>
      
    </select>
  </div>
  </div>
  </div>
   
   <div class="form-group"> 
  <label class="col-md-4 control-label">Location</label>
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
  <label class="col-md-4 control-label">Address</label>  
  <div class="col-md-4 inputGroupContainer">
  <div class="input-group">
  <span class="input-group-addon"></span>
  <textarea rows="3" cols="39" name="address" placeholder="Enter Address" ></textarea>
    </div>
  </div>
</div>

<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label"></label>
  <div class="col-md-4"><br>
  
    <input type="submit" class="btn btn-primary btn-block" >
    <input type="Reset" class="btn btn-primary btn-block" >
  </div>
</div></div></div></div></fieldset></form>
</body>
</html>