<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Booking Cancel</title>
</head>
<body>
<%@page import="java.sql.*" %>
<%
	
	String bookid=(String)session.getAttribute("carno");	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","renuka");
	PreparedStatement ps=con.prepareStatement("delete from user_dates where carno='"+bookid+"'");
	int rs=ps.executeUpdate();
	if(rs>0)
	{			
		out.println("<script>");
		out.println("alert('Car Booking Canceled successfully')");
		out.println("window.location.href='user index.jsp'");
		out.println("</script>");
	}else{
		out.println("<script>");
		out.println("alert('Try Agin')");
		out.println("window.location.href='user index.jsp'");
		out.println("</script>");
	}
%>
</body>
</html>