package Inheritance1;

public class son extends Father{

	public void mobile() {
		System.out.println("son buy mobile");
	}
	public void watch() {
		System.out.println("son buy watch");
	}
	public static void main(String[] args) {
		son x=new son();
		x.car();
		x.home();
		x.money();
		x.mobile();
		x.watch();
		System.out.println(x.a);
	}

}
