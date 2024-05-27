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
	
	String email=request.getParameter("email");
	String password=request.getParameter("password");
	session.setAttribute("name", email);
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","renuka");
	PreparedStatement ps=con.prepareStatement("select * from user_regi where email='"+email+"'and password='"+password+"'");
	ResultSet rs=ps.executeQuery();
	if(rs.next())
	{
		session.setAttribute("username", rs.getString(2));
		out.println("<script>");
		out.println("alert('Logined Successfully...!')");
		out.println("window.location.href='user index.jsp'");
		out.println("</script>");
	}else{
		out.println("<script>");
		out.println("alert('Enterd email and password are not match try again....!')");
		out.println("window.location.href='user_login.jsp'");
		out.println("</script>");
	}
%>

</body>
</html>