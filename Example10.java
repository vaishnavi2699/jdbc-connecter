package Database;
import  java.sql.*;
import java.util.*;


public class Example10 
{

	public static void main(String[] args)
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter student name: ");
		 String name=s.next();
		System.out.println("Enter sid");
		 int sid=s.nextInt();
		System.out.println("Enter marks");
		 int marks=s.nextInt();
		System.out.println("Enter gender");
		 String gender=s.next();
		System.out.println("Enter city");
		 String city=s.next();
		System.out.println("Enter clgname");
		 String clgname=s.next();
		System.out.println("Enter age");
		 int age=s.nextInt();
		Connection con=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xyz","root","2699");
			if(con!=null)
			{
				Statement stmt=con.createStatement();
				int i=stmt.executeUpdate("insert into studentinfo values('"+name+"','"+sid+"','"+marks+"','"+gender+"','"+city+"','"+clgname+"','"+age+"')");
				if(i>0)
				{
					System.out.println("Records inserted succesfully");
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
