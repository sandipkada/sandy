package Array;

import java.util.Arrays;

public class AscDsc {

    public static void main(String[] args) {
		int s[]= {45,20,30,40,50,60};
		System.out.println("..............Array all info.........");
		
		for(int i=0;i<=s.length-1;i++) {
			System.out.println(s[i]);
		}
		Arrays.sort(s);
		System.out.println("..........Array all info in Ascending order.......");
		 for(int i=0;i<=s.length-1;i++) {// ascending order
			 System.out.println(s[i]);
		 }
		 System.out.println("........Array all info in Decending order..........");
		for(int i=s.length-1;i>=0;i--) {//Decending order for loop formula
			System.out.println(s[i]);
		}
		System.out.println(s[1]);
    }	
}
