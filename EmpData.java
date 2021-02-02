package employee;

import java.util.Scanner;
class Emp
{
	String name;
	int age;
	int salary ;
	String desig;
}
final class Clerk extends Emp
{	Clerk()
	{
	details();
	display();
	raiseSalary();
	}
	int amt = 2500;
	int salary = 8000;
	public void details()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("\n=====clerk========");
		System.out.print("\nEnter the clerk name : ");
		name = sc.next();
		System.out.print("Enter age : ");
		age = sc.nextInt();

	}
	public void display()
	{
		System.out.print("\n=====Details of Clerk========");
		System.out.println("\nName of Clerk: "+name);
		System.out.println("Age : "+age);
		System.out.println("Salary of Clerk: " +salary);
		System.out.println("Designation : Clerk");

	}
	public void raiseSalary()
	{
		salary = salary + amt;
		System.out.print("\n==========Clerk=============\n");
		System.out.print("Salary after the appraisal of Clerk "+name+" is : " +salary);

	
		

	}
}
final class Programmer extends Emp
{	
	Programmer()
	{
	details();
	display();
	raiseSalary();
	}
	int amt = 5000;
	int salary = 25000;
	public void details()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("\n=====Programmer========");
		System.out.print("\nEnter the Programmer name : ");
		name = sc.next();
		System.out.print("Enter age : ");
		age = sc.nextInt();

	}
	public void display()
	{
		System.out.print("\n=====Details of Programmer========");
		System.out.println("\nName of Programmer: "+name);
		System.out.println("Age : "+age);
		System.out.println("Salary of Programmer: " +salary);
		System.out.println("Designation : Programmer");

	}
	public void raiseSalary()
	{
		salary = salary + amt;
		System.out.print("\n==========Programmer=============\n");
		System.out.print("Salary after the appraisal of Programmer "+name+" is : " +salary);
	}
}
final class Manager extends Emp
{	
	Manager()
	{
	details();
	display();
	raiseSalary();
	}
	int amt = 10000;
	int salary = 70000;
	public void details()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("\n=====Manager========");
		System.out.print("\nEnter the Manager name : ");
		name = sc.next();
		System.out.print("Enter age : ");
		age = sc.nextInt();

	}
	public void display()
	{
		System.out.print("\n=====Details of Manager========");
		System.out.println("\nName of Manager: "+name);
		System.out.println("Age : "+age);
		System.out.println("Salary of Manager: " +salary);
		System.out.println("Designation : Manager");

	}
	public void raiseSalary()
	{
		salary = salary + amt;
		System.out.print("\n==========Manager=============\n");
		System.out.print("Salary after the appraisal of Manager "+name+" is : " +salary+"\n");
	}	
}

public class EmpData
{
	public static void main(String args[])
	{
		
	int choice, len, i=0;
	Clerk c[] = new Clerk[1000];
	Programmer p[] = new Programmer[1000];
	Manager m[] = new Manager[1000];
	Scanner sc = new Scanner(System.in);
	do
	{
		System.out.println("\nEnter \n1. for Clerk. \n2. for Programmer. \n3. for Manager. \n4. exit");
		choice = sc.nextInt();
		if(choice==1)
		{
			c[i] = new Clerk();
		}
		else if(choice==2)
			p[i] = new Programmer();
		else if (choice==3)
			m[i]= new Manager();
		else
		{
			System.out.println("\nTotal number of employees is: "+i);
			System.exit(0);
		}
		i++;
	}while(1==1);
	

	}
}