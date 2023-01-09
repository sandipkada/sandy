package forloop;

public class StarSPACE {
  public static void main(String[] args) {
	
	  int space=4;
	  int star= 1;
	  
	  for(int i=1; i<=5; i++) {   // outer condition 
		  for(int a=1; a<=space; a++) {   //inner condition 1
			  System.out.print(" ");}
		 
		  for(int b=1; b<=star; b++) {   //inner condition 2
			  System.out.print("*");
		  }
		  System.out.println();
		  space--;
		  star++;
	  }
	  
}
}
