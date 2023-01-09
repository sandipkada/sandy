package collection;

import java.util.HashSet;

public class Hashset {

    public static void main(String[] args) {
		
    	HashSet <Character> set=new HashSet <Character>();
    	
    	set.add('$');
    	set.add('@');
    	set.add('!');
    	set.add('*');
    	set.add('#');
    	
    	int size = set.size();
    	System.out.println(size);
    System.out.println("************************************");
    	for(char t:set) {
    		System.out.println(t);
    	}
    	
	}
   

}
