
package Database;
import java.sql.*;
import java.util.Scanner;
import java.sql.Connection;

public class Example6 
{

	public static void main(String[] args) 
	{
		Connection con=null;
		Scanner s=new Scanner(System.in);
		System.out.println("enter student_id to update a name ");
		int sid=s.nextInt();
		System.out.println("enter name ");
		String name=s.next();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xyz","root","2699");
			if(con!=null)
			{
				Statement stmt=con.createStatement();
                int i=stmt.executeUpdate("update studentinfo set name='"+name+"' where student_id='"+sid+"'");
				if(i>0)
				{
					System.out.println("Records  updated Succesfully");
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


