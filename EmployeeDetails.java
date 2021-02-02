import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) 
	{
		Employee e[] = new Employee[3];
		for(int i=0;i<e.length;i++)
		{
			e[i] = new Employee();
			
			System.out.print("Name of the employee " +i +" :" );
			e[i].name = new Scanner(System.in).nextLine();
			
			System.out.print("Age of the employee  " +i +" :" );
			e[i].age = new Scanner(System.in).nextInt();
			
			System.out.print("Salary of the employee  " +i+" :" );
			e[i].salary = new Scanner(System.in).nextInt();
			
			System.out.print("Designation of the employee  " +i+" :" );
			e[i].designation = new Scanner(System.in).nextLine();
		}
		
		for(int i=0;i<e.length;i++)
		{
			e[i].sDisplay();
		}
		for(int i=0;i<e.length;i++)
		{
			e[i].raiseSalary();
		}
		for(int i=0;i<e.length;i++)
		{
			e[i].sDisplay();
		}
	}

}
class Employee 
{
		String name;
		int age;
		int salary;
		String designation;
		
		void sDisplay()
		{
			System.out.println("Salary of "+name + " is : " +salary);
		}
		void raiseSalary()
		{
			System.out.print("Amount to be incremented or decremented " +name+" :");
			Scanner sc=new Scanner(System.in);
			int sal=sc.nextInt();
			salary=salary+sal;
			
		}
}