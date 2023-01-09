package forloop;

public class StarInUPandDOWNtrangal {
public static void main(String[] args) {
	
	int space=4;
	int star=1;
	for(int i=1; i<=9; i++) { //row
		for (int a=1; a<=space; a++) {//outer forloop condtion 
			System.out.print(" ");
		}
		for(int b=1;b<=star; b++) {// inner forloop condition 1
			System.out.print("*");
		}
		System.out.println();// inner forloop condition 2
	
	if (i<=4) { // we take if else statement 
		space--;
		star=star+2;
	}
	else {
		space++;
		star=star-2;
	}
	
	
	}
	
	
	
	
	
}
}
