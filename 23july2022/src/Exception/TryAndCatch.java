package Exception;

public class TryAndCatch {


public static void main(String[] args) {
	int a=20;
	int b=2;
	int c=0;
	int d[]= {23,45,67,89};
	
	System.out.println("Start");
	
	try {
		c=a/b;
		System.out.println(d[2]);
	}
	catch(ArrayIndexOutOfBoundsException s) {
		System.out.println(d[3]);
	}
	System.out.println(c);
	System.out.println("Normal flow");
}

}
