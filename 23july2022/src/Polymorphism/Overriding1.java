package Polymorphism;

public class Overriding1 extends Overriding {// non static method is override done

	public void Addition() {
		System.out.println("Addition ended");// we change body of method
	}
public static void main(String[] args) {
	Overriding1 x= new Overriding1 ();// When we change  reference (overriding x=new overriding)
	x.Addition();      // out put same
 
}
}
