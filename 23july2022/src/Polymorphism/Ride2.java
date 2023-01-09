package Polymorphism;

public class Ride2 extends Riding {

	public static void Addition() {// Static method overriding not possible
		System.out.println("Addition end");
	}
	public static void main(String[] args) {// Output not show means static method is not override.
		Riding x=new Ride2();
		x.Addition();
	}
	
	}
