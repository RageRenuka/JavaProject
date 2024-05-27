<%@page import="java.sql.*" %>
<%
String car_number=request.getParameter("car_number");
String car_name=request.getParameter("car_name");
String car_type=request.getParameter("car_type");
String car_company=request.getParameter("car_company");
String car_city=request.getParameter("car_city");
String no_of_seats=request.getParameter("no_of_seats");
int price_per_day=Integer.parseInt(request.getParameter("price_per_day"));

session.setAttribute("fare", price_per_day);

Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","renuka");
PreparedStatement ps=con.prepareStatement("insert into add_car_details values (?,?,?,?,?,?,?)");
ps.setString(1, car_number);
ps.setString(2, car_name);
ps.setString(3, car_type);
ps.setString(4, car_company);
ps.setString(5, car_city);
ps.setString(6, no_of_seats);
ps.setInt(7, price_per_day);
boolean b=ps.execute();
if(b)
{
	out.println("<script>");
	out.println("alert('Error occured try again..!')");
	out.println("window.location.href='add_new_car.jsp'"); 
	out.println("</script>");
}else{
	out.println("<script>");
	out.println("alert('Car Details Saved Successfully..!')");
	out.println("window.location.href='add new car.jsp'");
	out.println("</script>");
}
%>