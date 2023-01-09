package Exception;

public class TryCatch {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c;
		System.out.println("Start");
		
		try {
			c=a/b;// risky code
			System.out.println(c);
		}
		catch(Exception s) {
			System.out.println(s);
		}
		System.out.println("Exception end");
	}

}
