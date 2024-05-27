<%@page import="java.sql.Date"%>
<%@page import="java.text.Format"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <script type="text/javascript">
        function GetDays(){
                var dropdt = new Date(document.getElementById("drop_date").value);
                var pickdt = new Date(document.getElementById("pick_date").value);
               	var date=parseInt(((dropdt - pickdt) / (24 * 3600 * 1000)));
                var amount=date*<%=Double.parseDouble((String)request.getAttribute("fai"))%>;
                return amount;
        }

        function cal(){
        if(document.getElementById("drop_date")){
            document.getElementById("numdays2").value=GetDays();
        }       
    }

    </script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/chan.css">
<title>Car Rental | Home</title>
</head>
<body>
<ul>
<h1  style="color:yellow;"><font face="Times New Roman">CAR RENTAL</font></h1>
  <li><a href="index.jsp">Home</a></li>
  <li><a href="Book.jsp">Booking</a></li>
  <li><a href="Bookdetails.jsp">Bookdetails</a></li>
  <li><a href="contact.jsp">Contact Us</a></li>
  
</ul>
 <%String fdate=request.getParameter("pickup_date");
    	String sdate=request.getParameter("dropoff_date");
    	String money=request.getParameter("numdays");
    	session.setAttribute("fdate", fdate);
    	session.setAttribute("sdate", sdate);
    	session.setAttribute("money", money);
    	String sql="insert into user_dates values(?,?,?)";
    	Class.forName("oracle.jdbc.driver.OracleDriver");
    	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "renuka");
    	PreparedStatement pstmt=con.prepareStatement(sql);
    	pstmt.setString(1, fdate);
    	pstmt.setString(2, sdate);
    	pstmt.setString(3, money);
    	int a=pstmt.executeUpdate();
    	if(a>0)
    	{ %>
    		<a href="index.jsp">Go To Index Page</a>
    	<%}
    	else
    		out.println("dates.jsp");
    	con.close();
    %>
<body style="background-color:#b4b4b4;">
<h3 style="font-size:50px;text-align:center;font-family:Comic Sans MS, cursive, sans-serif;color:blue"><b><i>Car_Rentals</i></b></h3>

 <div id="reserve_form">
<form action="dates.jsp" method="post">

    <div id="pickup_date"><p><label class="form">Pickup Date:</label> <input type="date" class="textbox" id="pick_date" name="pickup_date" onchange="cal()"></p></div>

    <div id="dropoff_date"><p><label class="form">Dropoff Date:</label><input type="date" class="textbox" id="drop_date" name="dropoff_date" onchange="cal()"/></p></div>

    <div id="numdays"><label class="form">Total Price:</label>
    <input type="text" class="textbox" id="numdays2" name="numdays"/>
    </div>
 
   <%--  <%
    String fdate=request.getParameter("pickup_date");
	String sdate=request.getParameter("dropoff_date");
	String money=request.getParameter("numdays");
	session.setAttribute("fdate", fdate);
	session.setAttribute("sdate", sdate);
	session.setAttribute("money", money);
    %> --%>
    <td width="100px"><input type="submit" width="100px" style="color:red" value="submit" ></td>
    </tr>
    </table>
    </form>
    
    </div> 
 

 </BODY>
</HTML>
