package Database;

import java.sql.*;
import java.util.Scanner;

public class Example5 
{

	public static void main(String[] args)
	{
		Connection con=null;
		Scanner s=new Scanner(System.in);
		System.out.println("enter name");
		 String name=s.next();
		 System.out.println("enter sid");
		 int sid=s.nextInt();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xyz","root","2699");
			if(con!=null)
			{
				PreparedStatement pstmt=con.prepareStatement("update studentinfo set name=? where student_id=?");
				pstmt.setString(1,name);
				pstmt.setInt(2,sid);
				int i=pstmt.executeUpdate();
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


