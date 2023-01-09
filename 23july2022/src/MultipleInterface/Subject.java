package MultipleInterface;

public class Subject implements R {   // Subject is class we declair and R is interface

	// 1interface and 1 class connect with "implements keyword"
	
	public void Math() {
		System.out.println("Math methode");
	}
	public void Science() {
		System.out.println("Science methode");
	}
	public void Physics() {
		System.out.println("Physics mehode");
	}
	public void Chemistry() {
		System.out.println("Chemistry mehode");
	}
	public static void main(String[] args) {
		Subject x=new Subject();
		x.Math();
		x.Science();
		x.Physics();
		x.Chemistry();
	}
		
	}


