package collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {

	public static void main(String[] args) {
		Hashtable<Integer,String> table=new Hashtable<Integer,String>();
		table.put(32,"Testing");
		table.put(35,"Manual");
		table.put(36, "Automation");
		table.put(37, "API");
		table.put(38, "Selenium");
		table.put(39,"Java");
		table.put(67, "59494");
		for(Map.Entry<Integer,String>m:table.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
