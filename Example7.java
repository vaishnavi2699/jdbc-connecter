package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Example7 
{

	public static void main(String[] args)
	{
		Connection con=null;
		Scanner s=new Scanner(System.in);
		System.out.println("enter student_id to delete record from the database");
		int sid=s.nextInt();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xyz","root","2699");
			if(con!=null)
			{
				Statement stmt=con.createStatement();
                int i=stmt.executeUpdate("delete from studentinfo where student_id='"+sid+"'");
				if(i>0)
				{
					System.out.println("Records dealeted Succesfully");
				}
			}
				else
				{
					System.out.println("connection fail");
				}
				con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	}
