<%@ page import="java.sql.*" %>     
        <%
 PreparedStatement ps1;

        Connection con;
        ResultSet rs= null;
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","renuka");          
        ps1= con.prepareStatement( "DELETE FROM add_driver_details");
			int i =ps1.executeUpdate();
			if(i==0)
			{
				out.println("<script>");
				out.println("alert('Error occured try again..!')");
				out.println("window.location.href='add_new_driver.jsp'");
				out.println("</script>");
			}else{
				out.println("<script>");
				out.println("alert('User Deleted Successfully..!')");
				out.println("window.location.href='add new driver.jsp'");
				out.println("</script>");
			}
     
           
        %>