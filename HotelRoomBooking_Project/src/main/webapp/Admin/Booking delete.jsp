<%@page import="java.sql.*" %>
<%
 String bookid=request.getParameter("bookid");
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crhotel", "root", "root");
PreparedStatement ps=con.prepareStatement("delete from booking where bookid=?");
ps.setString(1, bookid);
boolean b=ps.execute();
if(b)
{
	out.println("<script>");
	out.println("alert('Error occured try again..!')");
	out.println("window.location.href='View bookings.jsp'");
	out.println("</script>");
}else{
	out.println("<script>");
	out.println("alert('booking delete Successfully..!')");
	out.println("window.location.href='View bookings.jsp'");
	out.println("</script>");
}
%>
