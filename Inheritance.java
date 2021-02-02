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
		int y=20;
		public void xyz()
		{
			System.out.println("--------------------");
		}
		public void abc()
	{
		System.out.println("hahahaha");
	}
}

class C extends B
{

			int z = 30;
			public void mns()
			{
				System.out.println("ssssssssssssssssssssssssssssssss");
			}
			
}
public class Inheritance
{
		public static void main(String args[])
		{
			A a1 = new A();
			System.out.println(a1.x);
			a1.abc();

			B b1 = new B();
			C c1 = new C();
			System.out.println(b1.x);
			System.out.println(b1.y);
			b1.abc();
			/*b1.xyz();
			c1.abc();
			c1.xyz();
			System.out.println(c1.z);
			c1.mns();
			a1.mns();*/
		}
}