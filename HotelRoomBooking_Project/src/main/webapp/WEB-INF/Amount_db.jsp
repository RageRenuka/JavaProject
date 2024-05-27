
<%@page import="java.sql.*"%>
<%
String roomid=request.getParameter("roomid");
String bookid=request.getParameter("bookid");
String fullname=request.getParameter("fullname");
String mobileno=request.getParameter("mobileno");
String email=request.getParameter("email");
String fdate=request.getParameter("pickup_date");
String sdate=request.getParameter("dropoff_date");
String money=request.getParameter("numdays");
int m=Integer.parseInt(money);
if(m<=0)
{
	out.println("<script>");
	out.println("alert('not Successfully Booked your room')");
	out.println("window.location.href='Booking.jsp'");
	out.println("</script>");
}
else
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crhotel","root","root");
PreparedStatement ps=con.prepareStatement("insert into booking values(?,?,?,?,?,?,?,?)");
ps.setString(1, roomid);
ps.setString(2, bookid);
ps.setString(3, fullname);
ps.setString(4, mobileno);
ps.setString(5, email);
ps.setString(6, fdate);
ps.setString(7, sdate);
ps.setString(8, money);
int a=ps.executeUpdate();
if(a>0)
{ 
	out.println("<script>");
	out.println("alert('Successfully Booked your room')");
	out.println("window.location.href='user index.jsp'");
	out.println("</script>");
}
else{
	out.println("<script>");
	out.println("alert('booking is not successfull... try again...')");
	out.println("window.location.href='Booking.jsp'");
	out.println("</script>");
}
con.close();
}
%> 
