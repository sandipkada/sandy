package Exception;

public class TryCatchFinally {

	public static void main(String[] args) {
		int a=20;
		int b=0;
		int c=0;
		
		int d[]= {10,20,30,40};
		System.out.println("Start");
		
		try {
			c=a/b;//risky
		}
		catch(ArithmeticException s) {
			System.out.println("Catch Arithmetic Exception");
		}
		finally {
			System.out.println(" finaly block executed");
			System.out.println("exception not handled");
		}
		System.out.println(c);
	}

}
