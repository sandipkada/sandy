package Inheritance;

public class Son123 extends Son {

	public void Laptop() {
		System.out.println("son123 laptop");
	}
  public static void main(String[] args) {
	Son123 x =new Son123();
	x.Laptop();
	x.Car();
	x.Home();
	x.Money();
	x.Bick();
	x.Laptop();
	System.out.println(x.a);
	System.out.println(x.b);
}
}
