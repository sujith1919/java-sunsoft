public class LangDemo
{
	public static void main(String args[]) throws Exception
	{		
		int a = 100;
		Integer i = a;

		System.out.println(a);
		System.out.println(i);

		String s = "1050";

		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toHexString(i));
		System.out.println(Integer.toOctalString(i));
		System.out.println(Integer.parseInt(s)+60);

		System.out.println("--------------");

		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println(Math.sqrt(88));
		System.out.println(Math.cbrt(88));
		System.out.println(Math.pow(3, 5));
		System.out.println(Math.ceil(3.1));
		System.out.println(Math.floor(3.9));
		System.out.println(Math.round(3.4));
		int random = (int) (Math.random() * 55);
		System.out.println(random);

		System.out.println("--------------");

		String s1 = "Hello Everybody";
		
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1);
		System.out.println(s1.charAt(7));
		System.out.println(s1.indexOf('e'));
		System.out.println(s1.lastIndexOf('e'));
		System.out.println(s1.replace('e', '_'));

		StringBuffer sb1 = new StringBuffer("Hi");
		sb1.append("Hello");
		System.out.println(sb1);	

		System.out.println("----------------");

		Abc a1 = new Abc();	
		a1.x = 10;		
		Abc a2 = new Abc();
		a2.x = 50;		
		System.out.println(a1.equals(a2));

		System.out.println(a1);
		System.out.println(a2);

		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());

		String str1 = "Hello";
		String str2 = "Hello";

		//StringBuffer str1 = new StringBuffer("Hello");
		//StringBuffer str2 = new StringBuffer("Hello");

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

		Class c1 = a2.getClass();
		System.out.println("It is object of : "+c1.getName());

		Class c2 = Class.forName(args[0]);
		Object obj = c2.newInstance();
		System.out.println(obj);

		System.out.println("-------------");

		System.out.println("Finalize demo");

		a1 = null;
		a2 = null;
		System.gc();
		Thread.sleep(5000);
	}
}
class Abc
{
	int x;
	public String toString()
	{
		return "The value of x : "+x;
	}
	public void finalize()
	{
		System.out.println("Object with value "+x+" getting removed...");
	}
}
class Xyz
{
	public String toString()
	{
		return "The object of Xyz class";
	}
}