class A
{
	public void abc()
	{
		System.out.println("lol");
	}
}

class B extends A
{
		public void abc()
	{
		System.out.println("hahahaha");
	}
}

class C extends B
{

			public void abc()
			{
				System.out.println("ssss");
			}
			
}
public class InheritanceDemo2
{
		public static void main(String args[])
		{
			A a1 =  new A();
			a1.abc();

			a1 = new B();
			a1.abc();

			a1 = new C();
			a1.abc();
		}
}