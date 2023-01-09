package Exception;

import org.apache.commons.math3.exception.MathArithmeticException;

public class OneTryMultipleCatch {
public static void main(String[] args) {
	

	int a=20;
	int b=0;
	int c=0;
	
	int d[]= {23,45,67,89};
	
	System.out.println("start");
	try {
		c=a/b;//risky code
		System.out.println(d[4]);
	}
	catch(ArrayIndexOutOfBoundsException s) {
		System.out.println("Alternate code");
		System.out.println(d[3]);
	}
	catch(ArithmeticException s) {
		b=2;
		c=a/b;
	}
	System.out.println(c);
	System.out.println("Normal flow");

}
}