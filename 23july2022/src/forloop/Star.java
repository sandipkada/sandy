package forloop;

public class Star {
public static void main(String[] args) {
	
	for (int a=1; a<=4; a++) {// outer forloop
		
		for (int i=1; i<=3; i++) {// inner forloop
			
			System.out.print("*");   //only write (print) 
		}
		System.out.println();
	}
}
	
}