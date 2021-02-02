class A
{
	int x =10;
	public void abc()
	{
		System.out.println("lol");
	}
}

class B extends A
{
		int x=20;
		public void abc()
		{
			System.out.println("lolol");
		}
		public void xyz()
		{
			System.out.println(super.x);
			super.abc();
		}
		
}
public class SuperDemo
{
		public static void main(String args[])
		{
		B b1 = new B();
		b1.xyz();	
		}
}