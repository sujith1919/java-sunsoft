public static void main(String [] args)
{
	Scanner input = new Scanner (System.in);
	double operation;
	String chooseOperation;

    	do
    {   
               	System.out.println("Choose your operation:");
        	System.out.println("A. Create");
        	System.out.println("B. Display");
        	System.out.println("C. Raise Salary");
        	System.out.println("D. EXIT");

        	chooseOperation = input.nextLine();

        if ((chooseOperation.equals("A")) | (chooseOperation.equals("a")))
        {
            do
		int choice, len, i=0;
	
		Emp e[] = new Emp[1000];
		//Emp e2[] = new Programmer[1000];
		//Emp e3[] = new Manager[1000];
		Scanner sc = new Scanner(System.in);
            {
               System.out.println("\nEnter \n1. for Clerk. \n2. for Programmer. \n3. for Manager. \n4. exit");
			choice = sc.nextInt();
			if(choice==1)
			{
				e[i] = new Clerk();
			}
				else if(choice==2)
				e[i] = new Programmer();
				else if (choice==3)
				e[i]= new Manager();
			else
			{
			System.out.println("\nTotal number of employees is: "+i);
			System.exit(0);
			}
			i++;
            }while(getChar.equals("Y"));
        }

        else if ((chooseOperation.equals("B")) | (chooseOperation.equals("b")))
        {
          for(i=0;i<Emp.length;i++)		
		e[i].display();  
        }

        else if ((chooseOperation.equals("C")) | (chooseOperation.equals("c")))
        {
                      for(i=0;i<Emp.length;i++)		
		e[i].raiseSalary(); 
        }

        else if ((chooseOperation.equals("D")) | (chooseOperation.equals("d")))
        {
		System.exit(0);
        }
        else
        {
            System.out.println("Invalid Selection!\n\n\n");
        }
        System.out.println("Do you want to continue?\n\nY/N");
        getChar=input.nextLine();
    }while((getChar.equals("Y"))|(getChar.equals("y")));

}    
}\










package assignment;

import java.util.Scanner;

abstract class Emp
{
	String name;
	int age;
	int salary;
	String desig;
	
	static int count=0;

	Emp()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter name : ");
		name = sc.next();
		System.out.print("Enter age : ");
		this.age = sc.nextInt();

		count++;
	}
	public final void display()
		{
				System.out.println("\nName : "+name);
				System.out.println("Age : "+age);
				System.out.println("Salary : "+salary);
				System.out.println("Designation : "+desig);
		}
	public abstract void raiseSalary();
}
final class Clerk extends Emp
{
	Clerk()
	{
		salary = 5000;
		desig = "Clerk";
	}
	public void raiseSalary()
	{
		salary += 2500;
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
		salary += 50000;
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

public class EmppData1
{
public static void main(String [] args)
{
	Scanner input = new Scanner (System.in);
	double operation;
	String chooseOperation;

    	do
    {   
               	System.out.println("Choose your operation:");
        	System.out.println("A. Create");
        	System.out.println("B. Display");
        	System.out.println("C. Raise Salary");
        	System.out.println("D. EXIT");

        	chooseOperation = input.nextLine();

        if ((chooseOperation.equals("A")) | (chooseOperation.equals("a")))
        {
            do
		int choice, len, i=0;
	
		Emp e[] = new Emp[1000];
		//Emp e2[] = new Programmer[1000];
		//Emp e3[] = new Manager[1000];
		Scanner sc = new Scanner(System.in);
            {
               System.out.println("\nEnter \n1. for Clerk. \n2. for Programmer. \n3. for Manager. \n4. exit");
			choice = sc.nextInt();
			if(choice==1)
			{
				e[i] = new Clerk();
			}
				else if(choice==2)
				e[i] = new Programmer();
				else if (choice==3)
				e[i]= new Manager();
			else
			{
			System.out.println("\nTotal number of employees is: "+i);
			System.exit(0);
			}
			i++;
            }while(getChar.equals("Y"));
        }

        else if ((chooseOperation.equals("B")) | (chooseOperation.equals("b")))
        {
          for(i=0;i<Emp.length;i++)		
		e[i].display();  
        }

        else if ((chooseOperation.equals("C")) | (chooseOperation.equals("c")))
        {
                      for(i=0;i<Emp.length;i++)		
		e[i].raiseSalary(); 
        }

        else if ((chooseOperation.equals("D")) | (chooseOperation.equals("d")))
        {
		System.exit(0);
        }
        else
        {
            System.out.println("Invalid Selection!\n\n\n");
        }
        System.out.println("Do you want to continue?\n\nY/N");
        getChar=input.nextLine();
    }while((getChar.equals("Y"))|(getChar.equals("y")));

}    