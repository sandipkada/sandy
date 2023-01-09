package forloop;

public class Star1234line {
 
	public static void main(String[] args) {
	System.out.println("Enter Row For Star Pattern 1");
		int star =1;
		for (int i=1; i<=5; i++) {   // outer condition 
			
			for (int a=1; a<=star;a++) { //inner condition
				System.out.print("*");   // just write (print)
				
			}
			System.out.println();
			star++;
		}
	}
	
}
