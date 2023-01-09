package forloop;

public class Star4321type {
public static void main(String[] args) {
	System.out.println(" Star pattern no 8");
	int star=4;
	for (int i=1; i<=5;i++) {
		
		for (int a=1; a<=star;a++) {
			System.out.print("*");
			
		}
		System.out.println();
		star--;
	}
}
}
