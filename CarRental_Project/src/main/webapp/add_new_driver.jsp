<%@page import="java.sql.*" %>
<%
int driver_id=Integer.parseInt(request.getParameter("driver_id"));
String driver_name=request.getParameter("driver_name");
String driver_phno=request.getParameter("driver_phno");
String driver_address=request.getParameter("driver_address");

Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","renuka");
PreparedStatement ps=con.prepareStatement("insert into `add_driver_details` values (?,?,?,?)");
ps.setInt(1, driver_id);
ps.setString(2, driver_name);
ps.setString(3, driver_phno);
ps.setString(4, driver_address);
boolean b=ps.execute();
if(b)
{
	out.println("<script>");
	out.println("alert('Error occured try again..!')");
	out.println("window.location.href='add new driver.jsp'");
	out.println("</script>");
}else{
	out.println("<script>");
	out.println("alert('Driver Details Saved Successfully..!')");
	out.println("window.location.href='add new driver.jsp'");
	out.println("</script>");
}
%>