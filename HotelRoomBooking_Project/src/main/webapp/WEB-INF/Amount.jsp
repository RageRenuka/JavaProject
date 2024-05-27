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
.view{
     align: center;
	 margin-left: 180px;
	 margin-top:5px;
	 height: 350px;
	 width: 600px;
	 font-weight:bold;
	 color:Green;
		}
		
		</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>

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
String am =null;
String sql ="select * from addroom where roomid=?";
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crhotel","root","root");
PreparedStatement ps = con.prepareStatement(sql);  
ps.setString(1, request.getParameter("roomid"));
ResultSet rs=ps.executeQuery();
while(rs.next())
{

	am=rs.getString("price_per_day");
}
%>
<script type="text/javascript">
function GetDays(){
    var dropdt = new Date(document.getElementById("txtDatee").value);
    var pickdt = new Date(document.getElementById("txtDate").value);
   	var days=parseInt(((dropdt - pickdt) / (24 * 3600 * 1000)));
    var amount=days*<%=am %>;
    
    if(days==0)
   	{
   		return  <%=am %>;
   	}
    else if(amount<0)
   	 {
   	 	alert("Valid dates");
   	 }
  	else 
  		{
  	 		return amount;
  		} 
   }         
function cal()
{
if(document.getElementById("txtDatee")){
document.getElementById("numdays2").value=GetDays();
}  
}
</script>


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
		</div>
	</div>
<div class="container">
<form class="well form-horizontal" action="Amount_db.jsp" method="post"  id="contact_form" autocomplete="off">
<fieldset style="margin-left: 150px;color:green;">
<div class="w3_wthree_agileits_icons main-grid-border">
		<div class="container">
			<div class="w3ls-heading">
				<h2>User Book Room</h2>
			</div>	
			</div></div>
<div class="form-group">
  <label class="col-md-4 control-label">Room Id :</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"></span>
  <input name="roomid"  class="form-control"  readonly="readonly" type="text" value="<%=request.getParameter("roomid")%>" >
    </div>
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label">Booking id :</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"></span>
  <input type="number" name="bookid" value="<%=(int)(Math.random()*9999) %>"  class="form-control" readonly="readonly" >
    </div>
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label">Full Name :</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"></span>
  <input type="text"  name="fullname" class="form-control" readonly="readonly" value="<%=session.getAttribute("fullname")%>" onchange="cal()">
    </div>
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label">Mobile No:</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"></span>
  <input type="text"  name="mobileno" class="form-control" readonly="readonly" value="<%=session.getAttribute("mobileno")%>" onchange="cal()">
    </div>
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label">Email :</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"></span>
  <input type="email"  name="email" class="form-control" readonly="readonly" value="<%=session.getAttribute("email")%>" onchange="cal()">
    </div>
  </div>
</div> 

<div class="form-group">
  <label class="col-md-4 control-label">From Date:</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
    <span class="input-group-addon"></span>
  	<input type="date" cols="60" class="textbox" id="txtDate" name="pickup_date" onchange="cal()">
    </div>
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label">To Date:</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
    <span class="input-group-addon"></span>
    <input type="date" class="textbox" id="txtDatee" name="dropoff_date" onchange="cal()"/>
    </div>
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label">Total Amount:</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
    <span class="input-group-addon"></span>
    <input type="text" class="textbox" id="numdays2" cols="50" name="numdays" class="form-control" readonly="readonly"/>
    </div>
  </div>
</div>

<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label"></label>
  <div class="col-md-4">
    <input type="submit" value="Submit"  onclick = "cal()"; class="btn btn-primary btn-block" >
    <input type="Reset" value="Reset"  onclick = "cal()"; class="btn btn-primary btn-block" >
  </div>
</div></fieldset></form></div>
<%-- <tr><td>Room Id :</td>
<td><input type="text"  name="roomid"  class="form-control" readonly="readonly" value="<%=request.getParameter("roomid")%>" ></td>
</tr>  
<tr><td>Booking id :</td>
<td><input type="number" name="bookid" value="<%=(int)(Math.random()*9999) %>"  class="form-control" readonly="readonly" ></td>
</tr>
<tr>
<td>Fullname :</td>
<td><input type="text"  name="fullname" class="form-control" readonly="readonly" value="<%=session.getAttribute("fullname")%>" onchange="cal()"></td>
</tr>
<tr>
<td>Phoneno :</td>
<td><input type="text"  name="mobileno" class="form-control" readonly="readonly" value="<%=session.getAttribute("mobileno")%>" onchange="cal()"></td>
</tr>
<tr>
<td>Email :</td>
<td><input type="email"  name="email" class="form-control" readonly="readonly" value="<%=session.getAttribute("email")%>" onchange="cal()"></td>
</tr>

<tr><td>From date :</td>
<td> <input type="date" class="textbox" id="txtDate" name="pickup_date" onchange="cal()"></td>
</tr>
<tr>
<td>To date :</td>
<td><input type="date" class="textbox" id="txtDatee" name="dropoff_date" onchange="cal()"/></td>
</tr>
<tr>
<td>Total amount</td>
<td><input type="text" class="textbox" id="numdays2" name="numdays" class="form-control" readonly="readonly"/></td>
</tr>
  
 <td>  <input type="submit" value="ok"  onclick = "cal()";></td>
  <td> <input type="reset" value="reset"></td>

</table>
</form>
</div>
</div>
</div>  --%>
<!-- /.container -->		

</body>
</html>