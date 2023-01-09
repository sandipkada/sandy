package Exception;

public class catchinsidenocatch {

	public void main(String[]args) {
		int a=20;
		int b=0;
		int c=0;
		
		int d[]= {23,45,67,89};
		System.out.println("Start");
		try {
			c=a/b;
			System.out.println(d[4]);
		}
		catch(ArrayIndexOutOfBoundsException s) {
       System.out.println("Alernative code");
       System.out.println(d[3]);
       
       catch(ArithmeticException s) {
    	   b=2;
    	   c=a/b
       }
       
		}
		
	}

}
