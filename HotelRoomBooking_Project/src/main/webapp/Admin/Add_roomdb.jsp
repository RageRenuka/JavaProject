<%@page import="java.sql.*" %>
<%
String roomid=request.getParameter("roomid");
String roomtype=request.getParameter("roomtype");
String no_of_rooms=request.getParameter("no_of_rooms");
String location=request.getParameter("location");
int price_per_day=Integer.parseInt(request.getParameter("price_per_day"));
String address=request.getParameter("address");
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crhotel","root","root");
PreparedStatement ps=con.prepareStatement("insert into addroom values (?,?,?,?,?,?)");
ps.setString(1, roomid);
ps.setString(2, roomtype);
ps.setString(3, no_of_rooms);
ps.setString(4, location);
ps.setInt(5, price_per_day);
ps.setString(6, address);
int b=ps.executeUpdate();
if(b<0)
{
	out.println("<script>");
	out.println("alert('Error occured try again..!')");
	out.println("window.location.href='Add room.jsp'");
	out.println("</script>");
}else{
	out.println("<script>");
	out.println("alert('room details Saved Successfully..!')");
	out.println("window.location.href='Add room.jsp'");
	out.println("</script>");
}
%>