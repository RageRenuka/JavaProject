package Com.Jsp.JdbcProgram.Module3;
import java.sql.*;
public class JdbcFirstStepsProgram {

	public static void main(String[] args) {
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Driver class loarded & Registered..!!");
			}
			catch(ClassNotFoundException e)
		{
				e.printStackTrace();
		}

			}

		

	}


