package Database;
import java.sql.*;
public class Example3
{

	public static void main(String[] args) 
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xyz","root","2699");
			if(con!=null)
			{
				PreparedStatement pstmt=con.prepareStatement("insert into studentinfo values(?,?,?,?,?,?,?)");
				pstmt.setString(1,"krithik");
				pstmt.setInt(2,1234);
				pstmt.setInt(3,90);
				pstmt.setString(4,"male");
				pstmt.setString(5,"Dubai");
				pstmt.setString(6,"st.france");
				pstmt.setInt(7,34);
				
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
