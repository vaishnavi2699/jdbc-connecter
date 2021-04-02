package Database;

import java.sql.*;

public class Example9 
{

	public static void main(String[] args) 
	{
       Connection con=null;
       try
       {
    	   Class.forName("com.mysql.jdbc.Driver");
    	   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xyz","root","2699");
    		if (con!=null)
    		{
    			Statement stmt=con.createStatement();
    			ResultSet rs=stmt.executeQuery("Select * from names");
    			while(rs.next())
				{
					System.out.println(rs.getString(1)+" "+rs.getString(2) );
				}
    		}
       }
       catch(Exception e)
       {
    	   System.out.println(e);
       }
       
   

	}

}
