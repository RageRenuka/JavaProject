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
String fullname=request.getParameter("fullname");
String email=request.getParameter("email");
String password=request.getParameter("password");
String phoneno=request.getParameter("mobileno");
String gender=request.getParameter("gender");
String address=request.getParameter("address");
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crhotel","root","root");
PreparedStatement ps=con.prepareStatement("insert into user_reg(fullname,email,password,mobileno,gender,address) values(?,?,?,?,?,?)");
ps.setString(1, fullname);
ps.setString(2, email);
ps.setString(3, password);
ps.setString(4, phoneno);
ps.setString(5, gender);
ps.setString(6, address);
int b=ps.executeUpdate();
if(b<0)
{
	out.println("<script>");
	out.println("alert('Error occured try again..!')");
	out.println("window.location.href='User reg.html'");
	out.println("</script>");
}else{
	out.println("<script>");
	out.println("alert('Registered Successfully..!')");
	out.println("window.location.href='User login.jsp'");
	out.println("</script>");
} 
%>
</body>
</html>