import java.sql.*;

public class JdbcDemo2
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
			Statement stmt = con.createStatement();
		
			stmt.addBatch("insert into EMP values('aoman',23)");
			stmt.addBatch("insert into EMP values('doman',22)");			
			stmt.addBatch("insert into EMP values('foman',24)");
			stmt.addBatch("insert into EMP values('goman',25)");
			stmt.addBatch("insert into EMP values('homan',26)");
			stmt.addBatch("insert into EMP values('uoman',27)");
			stmt.addBatch("insert into EMP values('ioman',28)");
			stmt.addBatch("insert into EMP values('ooman',29)");			
			stmt.addBatch("insert into EMP values('poman',33)");
			stmt.addBatch("insert into EMP values('qoman',43)");
			stmt.addBatch("insert into EMP values('woman',33)");
			stmt.addBatch("insert into EMP values('eoman',53)");
			stmt.addBatch("insert into EMP values('roman',43)");

		//	stmt.executeUpdate("delete from EMP where AGE<30");
		//	stmt.executeUpdate("update EMP set AGE=25");

			
			Thread.sleep(10000);
			stmt.executeBatch();

				
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