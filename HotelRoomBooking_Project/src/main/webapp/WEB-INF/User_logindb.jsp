<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DREAM HOTEL</title>
</head>
<body>
<%@page import="java.sql.*" %>
<%
	
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crhotel","root","root");
	PreparedStatement ps=con.prepareStatement("select * from user_reg where email='"+username+"'and password='"+password+"'");
	ResultSet rs=ps.executeQuery();
	if(rs.next())
	{
		
		session.setAttribute("cid", rs.getString(1));
		session.setAttribute("username", rs.getString("email"));
		session.setAttribute("email", rs.getString("email"));
		session.setAttribute("fullname", rs.getString("fullname"));
		session.setAttribute("mobileno", rs.getString("mobileno"));
		
		
		out.println("<script>");
		out.println("alert('Logined Successfully...!')");
		out.println("window.location.href='user/user index.jsp'");
		out.println("</script>");
	}else{
		out.println("<script>");
		out.println("alert('Enterd email and password are not match try again....!')");
		out.println("window.location.href='User login.jsp'");
		out.println("</script>");
	}
%>

</body>
</html>