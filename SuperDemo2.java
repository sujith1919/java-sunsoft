class A
{
	A()
	{
		System.out.println("A()");	
	}
	A(int x)
	{
		System.out.println("A(int x)");	
	}
	A(String s)
	{
		System.out.println("A(String s)");	
	}
}

class B extends A
{
	B()
	{
		System.out.println("B()");	
	}
	B(int x)
	{
		super("sss");
		super(2);
		System.out.println("B(int x)");	
	}
	B(String s)
	{
		super(2);
		System.out.println("B(String s)");	
	}
}
public class SuperDemo2
{
		public static void main(String args[])
		{
		B b1 = new B(2);	
		}
}