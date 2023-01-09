package collection;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();//create object of Arraylist
		
		//addind data
		list.add(1234);//declare integer
		list.add("Testing");// declare string
		list.add(23.67f);//declare float
		list.add('#');//declare charactor
		
		//retrive data
		int size = list.size();
		System.out.println(size);
		System.out.println("************************************");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("****************************************");
	//Deleting data
		list.remove(3);
		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i));
			
		}
		
	}

}
