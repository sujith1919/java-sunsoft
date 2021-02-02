import java.util.*;

public class MapDemo
{
	public static void main(String args[])
	{
//		Hashtable<Integer,String> obj = new Hashtable<Integer,String>();
//		HashMap<Integer,String> obj = new HashMap<Integer,String>();
//		TreeMap<Integer,String> obj = new TreeMap<Integer,String>();
		LinkedHashMap<Integer,String> obj = new LinkedHashMap<Integer,String>();

		obj.put(111,"LOL1RAJ");
		obj.put(121,"LOLR2AJ");
		obj.put(131,"LOLRA3J");
		obj.put(141,"LOLRAJ4");
		obj.put(1151,"LO5LRAJ");
		obj.put(151,"LOLR6AJ");
		obj.put(1151,"LOLR7AJ");
		obj.put(1116,"LOLRA879J");
		obj.put(1117,"LOLRAJ0");
		
		obj.put(111,"LOL1RAJ");
		obj.put(121,"LOLR2AJ");
		obj.put(131,"LOLRA3J");

		Set s = obj.entrySet();
		Iterator i = s.iterator();

		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}