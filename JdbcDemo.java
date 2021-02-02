import java.sql.*;

public class JdbcDemo
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
			Statement stmt = con.createStatement();
		
			stmt.executeUpdate("insert into EMP values('soman',23)");
		//	stmt.executeUpdate("delete from EMP where AGE<30");
		//	stmt.executeUpdate("update EMP set AGE=25");

				
		/*	ResultSet rs = stmt.executeQuery("select * from EMP");
			while(rs.next())
			{
				System.out.println("Name :" +rs.getString(1));
				System.out.println("Age :" +rs.getString(2));
				System.out.println();
			}
			rs.close();
		*/
			stmt.close();
			con.close();
		}	
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
}