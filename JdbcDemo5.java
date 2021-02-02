import java.sql.*;
import java.io.*;

public class JdbcDemo5
{
	public static void main(String args[])
	{
		try
		{
			
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
			
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from EMP");
			ResultSetMetaData rsmd = rs.getMetaData();	

			int col = rsmd.getColumnCount();

			while(rs.next())
			{
				for(int i=1;i<=col;i++)
				{
					System.out.println(rsmd.getColumnName(i)+ " : "+rs.getString(i));
				}
				System.out.println();
			}
			rs.close();
			stmt.close();
			con.close();
		}	
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
}