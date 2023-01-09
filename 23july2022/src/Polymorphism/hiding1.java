package Polymorphism;

public class hiding1 extends hiding {

 	public static void Test() {// we change body of test
		System.out.println(" Run time methode of sub");
	}
	
 	public static void main(String[] args) {
	 
     hiding1 x=new hiding1();// when non-ststic methode we create object also static your chance 
	hiding1.Test();// we create sub class object.
	
 	}
}