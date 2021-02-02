package assignment;

import java.util.*;
import java.io.*;
import java.sql.*;

abstract class Emp
{	
	String name;
	int age;
	int salary;
	String desig;
	
	static int count=0;

	Emp()
	{
		
		//count++;
		Scanner sc = new Scanner(System.in);
		//System.out.print("\nEnter name : ");
		name = sc.next();
		do
		{
			try
			{
				//System.out.print("Enter age : ");
				this.age = new Scanner(System.in).nextInt();
			}
			catch(InputMismatchException ime)
			{
				System.out.print("Enter correct age  :");
			}
			if(age<=21 || age>=60)
				System.out.println("Enter age between 21 - 60");
			else
			{
			return;
			}
		}while(true);
		

	}
	public String toString()
		{
			return "\nName : "+name + "\nAge : "+age + "\nSalary : "+salary + "\nDesignation : "+desig;
		}
	//public abstract void raiseSalary();
	
}
final class Clerk extends Emp
{
	Clerk()
	{
		try
		{
				salary = 5000;
				desig = "Clerk";
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
		
				Scanner scanner = new Scanner(System.in);
		
				System.out.print("Enter your name: ");
				String Name = scanner.nextLine();

				System.out.print("Enter your age: ");
				String age = scanner.nextLine();

				String sql = "insert into EMP "
					+ " (name,age)" + " values (?, ?)";
				PreparedStatement myStmt = con.prepareStatement(sql);


			myStmt.setString(1, Name);
			myStmt.setString(2, age);



			myStmt.executeUpdate();
				
	/*public void raiseSalary()
	{
		salary += 2500;
	}	*/
		}
	catch(Exception e)
			{
				System.out.println(e);
			}
	}
}
final class Programmer extends Emp
{
	Programmer()
	{
		salary = 25000;
		desig = "Programmer"; 
	}
	public void raiseSalary()
	{
		salary += 5000;
	}
}

final class Manager extends Emp
{
	Manager ()
	{
		salary = 70000;
		desig = "Manager"; 
	}
	public void raiseSalary()
	{
		salary += 10000;
	}
}

public class EmpData2
{
public static void main(String [] args)
{
	int ch1=0,ch2 =0;
//	Emp e[] = new Emp[1000];  
	ArrayList<Emp> e= new ArrayList<Emp>();
	
	do
	{
		System.out.println("-----------------------");
		System.out.println("Choose your operation:");
		System.out.println("-----------------------");
        	System.out.println("1. Create");
        	System.out.println("2. Display");
        	System.out.println("3. Raise Salary");
        	System.out.println("4. EXIT");
		System.out.println("-----------------------");
		System.out.println("Enter your choice: ");
		try
		{
					System.out.println("Enter choice :");
					ch1= new Scanner(System.in).nextInt();

					
		if(ch1 == 1)
				{	
				do
				{
					System.out.println("-----------------------");
					System.out.println("Choose your operation:");
					System.out.println("-----------------------");
        				System.out.println("1. Clerk");
        				System.out.println("2. Programmer");
        				System.out.println("3. Manager");
        				System.out.println("4. EXIT");
					System.out.println("-----------------------");
					try
					{
						//	Class.forName("oracle.jdbc.driver.OracleDriver");
						//	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
							
							System.out.println("Enter your choice: ");
							ch2= new Scanner(System.in).nextInt();
							//BufferedReader ch2 = new BufferedReader(new InputStreamReader(System.in));
							switch(ch2)
							{
								case 1 : e.add(new Clerk());
									break;
								case 2 : e.add(new Programmer());
									break;
								case 3 : e.add(new Manager());
								break;
					
							}
					}
					catch(InputMismatchException imc)
		{
			System.out.println("Enter proper choice");
		}
						}while(ch2 != 4);
			}
			if(ch1 == 2)
			{
				Iterator i = e.iterator();
					while(i.hasNext())
					{
						System.out.println(i.next());
					}
			}
				if(ch1 == 3)
			{
				Iterator j = e.iterator();
					while(j.hasNext())
					{
						Emp a = (Emp)j.next();
					//	a.raiseSalary();
					}
			}
		}
		catch(InputMismatchException imc)
		{
			System.out.println("Enter proper choice");
		}
	}while(ch1 != 4);
	System.out.println("\nTotal no of emp created: " + Emp.count);
	}


}