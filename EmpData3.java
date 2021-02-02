package assignment1;

import java.io.*;
import java.sql.*;

class Emp
{
	int id;
	String name;
	int age;
	int salary;
	String desig;

	static int count=0;

	Emp(int s, String d)
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter id : ");
			id = Integer.parseInt(br.readLine());
			System.out.print("Enter name : ");
			name = br.readLine();
			System.out.print("Enter age : ");
			age = Integer.parseInt(br.readLine());
			this.salary = s;
			this.desig = d;
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "tiger");
			PreparedStatement pstmt = con.prepareStatement("insert into EMP values(?, ?, ?, ?, ?)");
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, age);
			pstmt.setInt(4, salary);
			pstmt.setString(5, desig);
			pstmt.execute();
			pstmt.close();
			con.close();

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		count++;
	}	
	public static void display()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "tiger");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from EMP");
			ResultSetMetaData rsmd = rs.getMetaData();

			int col = rsmd.getColumnCount();

			while(rs.next())
			{
				for(int i=1; i<=col; i++)
				{
					System.out.println(rsmd.getColumnName(i)+" : "+rs.getString(i));
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
	public static void raiseSalary()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "tiger");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("update EMP set SALARY=SALARY * 1.1");
			stmt.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void delete()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter ID : ");
			int id = Integer.parseInt(br.readLine());

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "tiger");
			Statement stmt = con.createStatement();
		
			stmt.executeUpdate("delete from EMP where ID="+id);
			stmt.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class Clerk extends Emp
{
	Clerk()
	{
		super(8000, "Clerk");
	}
}
class Programmer extends Emp
{
	Programmer()
	{
		super(25000, "Programmer");
	}
}
class Manager extends Emp
{
	Manager()
	{
		super(70000, "Manager");
	}
}

public class EmpData3
{
	public static void main(String args[]) throws Exception
	{
		int ch1=0, ch2=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.println("------------------------");
			System.out.println("   1.  Create   ");
			System.out.println("   2.  Display   ");
			System.out.println("   3.  Raise Salary   ");
			System.out.println("   4.  Delete   ");
			System.out.println("   5.  Exit   ");
			System.out.println("------------------------");
			System.out.print("Enter choice :- ");
			ch1 = Integer.parseInt(br.readLine());
			if(ch1==1)
			{
				do
				{
					System.out.println("------------------------");
					System.out.println("   1.  Clerk   ");
					System.out.println("   2.  Programmer   ");
					System.out.println("   3.  Manager   ");
					System.out.println("   4.  Exit   ");
					System.out.println("------------------------");
					System.out.print("Enter choice :- ");
					ch2 = Integer.parseInt(br.readLine());
					switch(ch2)
					{
						case 1 : new Clerk();
							break;
						case 2 : new Programmer();
							break;
						case 3 : new Manager();
							break;
					}
				}while(ch2 != 4);
			}
			if(ch1==2)
			{
				Emp.display();
			}
			if(ch1==3)
			{
				Emp.raiseSalary();
			}
			if(ch1==4)
			{
				Emp.delete();
			}
		}while(ch1 != 5);
		System.out.println("\nTotal no. of employees joined : "+Emp.count);
	}
}