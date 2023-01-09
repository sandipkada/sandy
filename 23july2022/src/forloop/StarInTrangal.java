package forloop;

public class StarInTrangal {
public static void main(String[] args) {
System.out.println("Enter Row For Star Tringal Patter no 5");
	int space=4;
	int star=1;
	for (int i=1; i<=5; i++) {
 		for (int a=1; a<=space; a++) {
			System.out.print(" ");
		}
		for (int b=1; b<=star; b++) {
			System.out.print("*");
		}
		System.out.println();
		space--;
		star+=2;
	}
}
 

	

}
