<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.sql.*" %>
<%

String fullname=request.getParameter("fullname");
String email=request.getParameter("email");
String password=request.getParameter("password");
String phoneno=request.getParameter("phoneno");
String address=request.getParameter("address");
session.setAttribute("name",fullname);
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","renuka");
PreparedStatement ps=con.prepareStatement("insert into user_regi(fullname,email,password,phoneno,address) values (?,?,?,?,?)");

ps.setString(1, fullname);
ps.setString(2, email);
ps.setString(3, password);
ps.setString(4, phoneno);
ps.setString(5, address);
int b=ps.executeUpdate();
if(b<0)
{
	out.println("<script>");
	out.println("alert('Error occured try again..!')");
	out.println("window.location.href='user_regi.jsp'");
	out.println("</script>");
}else{
	out.println("<script>");
	out.println("alert('Registered Successfully..!')");
	out.println("window.location.href='user_login.jsp'");
	out.println("</script>");
} 
%>
</body>
</html>