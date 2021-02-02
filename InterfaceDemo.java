interface X
{
		int a = 50;
		public void add();
		public void sub();
}
interface Y
{
		int b = 25;
		public void mul();
		public void div();
}
interface Z extends X,Y
{
}

class Calculator implements Z
{
		public void add()
			{
				System.out.println(Z.a + Y.b);
			}
		public void sub()
			{
				System.out.println(Z.a - Y.b);
			}
		public void mul()
			{
				System.out.println(Z.a * Y.b);
			}
		public void div()
			{
				System.out.println(Z.a / Y.b);
			}
}
public class InterfaceDemo
{
		public static void main(String args[])
		{
			Calculator c1 = new Calculator();

			X x1 = c1;
			x1.add();
			x1.sub();
			System.out.println("-------------------");

			Y y1 = c1;
			y1.mul();
			y1.div();
			System.out.println("-------------------");

			Z z1 = c1;
			z1.add();
			z1.sub();
			z1.mul();
			z1.div();
		}
}