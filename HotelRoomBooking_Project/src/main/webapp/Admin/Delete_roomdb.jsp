<%@page import="java.sql.*" %>
<%
 String room=request.getParameter("room");
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crhotel", "root", "root");
PreparedStatement ps=con.prepareStatement("delete from addroom where roomid=?");
ps.setString(1, room);
boolean b=ps.execute();
if(b)
{
	out.println("<script>");
	out.println("alert('Error occured try again..!')");
	out.println("window.location.href='Delete room.jsp'");
	out.println("</script>");
}else{
	out.println("<script>");
	out.println("alert('room delete Successfully..!')");
	out.println("window.location.href='Delete room.jsp'");
	out.println("</script>");
}
%>
