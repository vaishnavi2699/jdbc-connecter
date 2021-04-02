package Database;
import java.sql.*;
public class Example1
{

	    public static void main(String[] args)
			{
		try {
		Class.forName("com.mysql.jdbc.Driver");  // loading driver class
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xyz","root","2699"); // connection
		if(con!=null)
		{
		System.out.println("Connection established successfully");
		}
		else
		{
		System.out.println("connection fail");
		}
		}
		catch(Exception e)
		{
		System.out.println(e);
		}

		}

   }


