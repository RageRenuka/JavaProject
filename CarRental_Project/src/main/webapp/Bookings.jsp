<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
la {
    width: 100px;
    height: 100px;
    position: relative;
    background-color: red;
    animation-name: example;
    animation-duration: 2s;
}

@keyframes example {
    0%   {background-color: red; left:0px;}
    50%  {background-color: yellow; left:100px;}
    100% {background-color: red; left:0px;}
}

</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="Style.css" >
</head>

<body style="background-color:#b4b4b4;">
<h3 style="font-size:50px;text-align:center;font-family:Comic Sans MS, cursive, sans-serif;color:blue"><b><i>Car_Rentals</i></b></h3>

 <div class="head">
  <ul>
  <li><a href="user index.jsp">Home</a></li>
  <li><a href="booking.jsp">Booking</a></li>
  <li><a href="User Booking Details.jsp">Book details</a></li>
  <li><a href="contact.jsp">Contact Us</a></li>
  <li><a href="index.jsp">Logout</a></li>
</ul>
</div> 
<br>

<div style="font-size:20px;font-family:Cursive"><u><b>Book Your Car</b></u></div>
<br>
<br>
<% 
int a=0;
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "renuka");
/* Random rand = new Random();
int rand_int2 = rand.nextInt(1000); */
PreparedStatement ps=con.prepareStatement("select max(invoiceno) from user_dates");
ResultSet rs=ps.executeQuery();
while(rs.next())
{
	a = rs.getInt("max(invoiceno)");
}
int b=a+4768;
String carno = request.getParameter("car_number");
String fdate=request.getParameter("pickup_date");
String sdate=request.getParameter("dropoff_date");
String money=request.getParameter("numdays");
session.setAttribute("bill", b);
session.setAttribute("from", fdate);
session.setAttribute("to", sdate);
session.setAttribute("carno", carno);
session.setAttribute("amount", money);
PreparedStatement pstmt=con.prepareStatement("insert into user_dates values(?,?,?,?,?,?)");
pstmt.setInt(1,b);
pstmt.setString(2, fdate);
pstmt.setString(3, sdate);
pstmt.setString(4, money);
pstmt.setString(5, carno);
HttpSession s=request.getSession(false);  
if(session!=null){  
String name=(String)s.getAttribute("name");  
  
pstmt.setString(6, name );
}
int ab=pstmt.executeUpdate();
if(ab>0)
{ 
	out.println("<script>");
	out.println("alert('Successfully Booked your car')");
	out.println("window.location.href='invoice1.jsp'");
	out.println("</script>");
}
else{
	out.println("<script>");
	out.println("alert('Successfully Booked your car')");
	out.println("window.location.href='booking.jsp'");
	out.println("</script>");
}
con.close();

%> 
</body>
</html> 