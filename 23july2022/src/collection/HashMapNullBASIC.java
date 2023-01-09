package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapNullBASIC {

	public static void main(String[]args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(11, null);
		map.put(12, "Automation");
		map.put(13, null);
		map.put(14, null);
		map.put(null, "SQL");
		map.put(null, "Api");
		map.put(null, null);
		for(Map.Entry<Integer, String>m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		for(Map.Entry<Integer, String>m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
	}

}
}