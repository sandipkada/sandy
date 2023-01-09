package Inheritance;

public class Son extends Father{
	
	public void Bick() {

		System.out.println(" son BICK");
	}
	public static void main(String[] args) {

	Son x = new Son();
	x.Car();
	x.Home();
	x.Money();
	x.Bick();
	System.out.println(x.a);
	System.out.println(x.b);
	
	}
}
