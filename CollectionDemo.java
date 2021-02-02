import java.util.*;

public class CollectionDemo
{
	public static void main(String args[])
	{
//		TreeSet obj = new TreeSet();
//		HashSet obj = new HashSet();
//		LinkedHashSet obj = new LinkedHashSet();

//		Vector obj = new Vector();
		
//		ArrayList obj = new ArrayList();
		LinkedList obj = new LinkedList();	
		obj.add("111");
		obj.add("121");
		obj.add("131");
		obj.add("141");	
		obj.add("151");
		obj.add("161");
		System.out.println("------------------");
		obj.add("151");
		obj.add("161");

		obj.add("111");
		obj.add("121");
		obj.add("131");
		obj.add("141");	
		obj.add("151");
		obj.add("161");
		System.out.println("------------------");

		Collections.sort(obj);
	//	Collections.reverse(obj);
	//	Collections.swap(obj, 2,7);
		Collections.shuffle(obj);

		Iterator i = obj.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}
}