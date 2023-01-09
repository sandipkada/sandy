package Exception;

public class TryInsideTry {

	public static void main(String[] args) {
		
		int a=19;
		int b=0;
		int c=0;
		
		int d[]= {34,45,23,11};
		System.out.println("start");
		
		try {
			try {
				c=a/b;
			}
			catch(ArithmeticException s) {
				System.out.println("Arithmetic Exception");
			}
			System.out.println(c);
		}
		System.out.println(c);
	}
}
