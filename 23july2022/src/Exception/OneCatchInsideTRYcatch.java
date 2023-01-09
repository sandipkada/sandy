package Exception;

public class OneCatchInsideTRYcatch {

	public static void main(String[] args) {
		int a=19;
		int b=0;
		int c=0;
		int d[]= {23,45,76,89};
		System.out.println("Start");
		
		
		
		try {
			System.out.println(d[5]);//risky codes
			c=a/b;
		}
		catch(ArithmeticException x) {
			System.out.println("Catch arithmetic exception");
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Catch array index out of bound exception");
		
		try {
			c=a/b;
			
		}
		catch(ArithmeticException x) {
			System.out.println("Arithmetic Exception1");
		}
		}
		
		System.out.println("normal flow");
	}
}
