package parametermethods;

public class parametermethod {

	public static void Addition (int x, int y) {// static methode
		int z=x+y;
		System.out.println("Addition="+z);
	}
	public void Multiplication (int a, int b) {// non static methode
		int c=a*b;
		System.out.println("multiplicaion="+c);
		
	}
	public static void main(String[] args) {// static methode result
		Addition(70,50);
		Addition (50,20);
		
		parametermethod s=new parametermethod();// non static (object create) result
		
		s.Addition(30, 20);
		s.Multiplication(60, 5);
		s.Multiplication(50, 7);
	}

}
