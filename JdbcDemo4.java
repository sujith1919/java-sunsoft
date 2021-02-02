import java.sql.*;
import java.io.*;

public class JdbcDemo4
{
	public static void main(String args[])
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
			
			PreparedStatement pstmt = con.prepareStatement("insert into EMP values(?,?)");


			con.setAutoCommit(false);

		for(int i=1;i<=3;i++)
		{
			System.out.print("\nEnter name: ");
			String name = br.readLine();
			System.out.print("Enter Age: ");
			int age = Integer.parseInt(br.readLine());

			pstmt.setString(1,name);
			pstmt.setInt(2,age);
			pstmt.execute();
			if(i==1)
				con.rollback();
			if(i==3)
				con.commit();
		}		
			pstmt.close();
			con.close();
		}	
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
}