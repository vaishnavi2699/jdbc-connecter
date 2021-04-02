package Database;

import java.sql.*;
import java.util.Scanner;
import java.sql.Connection;
public class Example8 
{

	public static void main(String[] args)
	{
		Connection con=null;
		Scanner s=new Scanner(System.in);
		System.out.println("enter Student name");
		String name=s.next();
		System.out.println("enter student_id");
	    int student_id=s.nextInt();
	    System.out.println("enter marks");
	    int marks=s.nextInt();
	    System.out.println("enter gender");
	    String gender=s.next();
	    System.out.println("enter city");
	    String city=s.next();
	    System.out.println("enter college_name");
	    String college_name=s.next();
	    System.out.println("enter age");
	    int age=s.nextInt();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xyz","root","2699");
			if(con!=null)
			{
				PreparedStatement pstmt=con.prepareStatement("insert into studentinfo values(?,?,?,?,?,?,?)");
				pstmt.setString(1,name);
				pstmt.setInt(2,student_id);
				pstmt.setInt(3,marks);
				pstmt.setString(4,gender);
				pstmt.setString(5,city);
				pstmt.setString(6,college_name);
				pstmt.setInt(7,age);
				int i=pstmt.executeUpdate();
				if(i>0)
				{
					System.out.println("Records  inserted Succesfully");
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


