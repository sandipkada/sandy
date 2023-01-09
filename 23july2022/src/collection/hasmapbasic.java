package collection;

import java.util.HashMap;
import java.util.Map;

public class hasmapbasic {

	public static void main(String[] args) {
		HashMap<Integer,String> map= new HashMap<Integer,String>();
		map.put(11, "Testing");
		map.put(12, "Automation");
		map.put(13,"API");
		map.put(14,"Selenium");
		map.put(15, "Manual");
		map.put(16, "SQL");
		
		for(Map.Entry<Integer, String>m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		map.put(11, "C++");
		System.out.println("******************");
		
			for(Map.Entry<Integer, String> m:map.entrySet()) {
				System.out.println(m.getKey()+" "+m.getValue());
			
			
			}
	}
}
