package Database;
import java.sql.*;
public class Example
{

	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xyz","root","2699");
			if(con!=null)
			{
				System.out.println("Connection established succesfully");
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
