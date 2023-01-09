package Exception;

public class ThrowandThroes {

	
	static void demo()  {
		throw new NullPointerException();
	}
	public static void main(String[]args) throws InterruptedException {
		System.out.println("Hello");
		
		demo();
		Thread.sleep(4000);
		
		System.out.println("Hi");
	}
}
	


