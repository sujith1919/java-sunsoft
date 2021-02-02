import java.util.*;

public class DemoUtil
{
	public static void main(String args[])
	{
		Date d1 = new Date();
		d1.setTime(22222222);
		System.out.println(d1);

		Date d2 = new Date();
		d2.setMonth(25);
		System.out.println(d2);


		System.out.println(d1.equals(d2));

		System.out.println(d1.before(d2));
		System.out.println(d1.after(d2));

		System.out.println("------------------");

		Stack s1 =new Stack();
	
		s1.push("111");
		s1.push("121");
		s1.push("131");
		s1.push("141");
		s1.push("151");

		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());


		System.out.println("------------------");

		System.out.println(s1.peek());
		System.out.println(s1.peek());


		System.out.println(s1.search("111"));




		System.out.println(s1.empty());

		System.out.println("------------------");

		String str = "Raj|23|3456|Cler|balo|kalo|123@selfkn.com";
		StringTokenizer st = new StringTokenizer(str, "|@.");
		int count = st.countTokens();
		for(int i=1;i<=count;i++)
		{
			System.out.println(st.nextToken());
		}
		
		System.out.println("------------------");

		Vector v1 = new Vector(2);
		
		v1.add("Hell You");
		v1.add(new Date());
		v1.add(new Integer(123));
		v1.add(new Thread());
		v1.add(new String("lolololol"));

		Enumeration e = v1.elements();
		while(e.hasMoreElements())
		{
				System.out.println(e.nextElement());
		}

	}
}