<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
out.write("Hello JSP Page");
String user=request.getParameter("user");
String password=request.getParameter("pwd");
if(user.equals("renuka")&& password.equals("renuka")){
	RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
	rd.forward(request, response);
}else{
	RequestDispatcher rd=request.getRequestDispatcher("failure.jsp");
	rd.forward(request, response);
}
%>

</body>
</html>