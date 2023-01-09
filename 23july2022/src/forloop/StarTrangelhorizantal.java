package forloop;

public class StarTrangelhorizantal {
public static void main(String[] args) {
System.out.println("Enter Rows in star trangel horizontal Pattern no9");
	
	int space=4;
	int star=1;
for (int i=1; i<=9; i++) {
	for( int a=1; a<=space; a++) {
		System.out.print(" ");
	}
	for(int b=1;b<=star; b++) {
		System.out.print("*");
	}
	System.out.println();
	if (i<=4) {
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
