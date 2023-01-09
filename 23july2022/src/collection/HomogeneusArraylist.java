package collection;

import java.util.ArrayList;

public class HomogeneusArraylist {

	public static void main(String[] args) {
		//Homogeneus
		ArrayList<Integer> list =new ArrayList <Integer>();
		
		//Adding data
		list.add(3546);
		list.add(23);
		list.add(232525);
		list.add(4564666);
		System.out.println(list.size());
		//retrive data
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
  System.out.println("***************************************");
	list.remove(3);
	int size = list.size();
	System.out.println(size);
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
	
	}
	
	

}
