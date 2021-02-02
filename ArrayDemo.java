public class ArrayDemo
{
	public static void main(String args[])
	{
		int a[];
		int b[] = new int[5];
		int[] c = new int[5];
		int d[] = {1,2,4,5};
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]);
		}
			System.out.println("--------------");
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
		for(int x : d)
		{
			System.out.println(x);
		}
		System.out.println("-------------");
		Student s[] =  new Student[5];
		for(int i=0;i<s.length;i++)
		{
			s[i] = new Student();
			System.out.print("Enter name : ");
			s[i].name = new java.util.Scanner(System.in).next();
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Student name :" +s[i].name);
		}

	}
}
class Student
{
	String name;
}