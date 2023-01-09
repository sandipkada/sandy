package forloop;

public class StarIndownTrangal {
   
	public static void main(String[] args) {
	System.out.println("Star in down direction pattern no 6");
		int space=1;
		int star=7;
		for (int i=1; i<=5; i++ ) {
			for (int a=1; a<=space; a++) {
				System.out.print(" ");
			}
			for (int b=1; b<=star; b++) {
				System.out.print("*");
			}
			System.out.println();
		if(i<=4) {
			space++;
			star-=2;}
			else {
				
				space++;
				star+=2;
			}
			
		}
		
		
	}
	
	}


