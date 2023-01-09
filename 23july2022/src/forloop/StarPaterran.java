package forloop;

public class StarPaterran {
	public static void main(String[] args) {
	int space=3;
	int star=1; 
	for (int i=1; i<=7; i++) { //outer forloop
		for (int a=1; a<=space;a++) {  // inner forloop condition 1
			System.out.print(" ");
		}
		for (int b=1; b<=star; b++) {// inner forloop condition 2
			System.out.print("* ");// "* space		
		}
		System.out.println();
	if(i<=3) {
		space--;
		star++;
	}
	else {
		space++;
		star--;
	}
	
	
	}
}
}
