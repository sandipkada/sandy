package Array;

public class Basic {

  public static void main(String[] args) {
	
	  String ar[]=new String [6];//array declaration with size
	  
	  ar[0]="JAVA";//array initalised
	  ar[1]="Automation";
	  ar[2]="Manual";
	  ar[3]="SQL";
	  ar[4]="API";
	  ar[5]="UNIX";
	  
	  System.out.println("..........print all info array.......... ");
	  for(int i=0;i<=5;i++) {
		  System.out.println(ar[i]);
		  
		  System.out.println("..........print specific info........");
		  System.out.println(ar[4]);
		  
		  
		  
		  
	  }
	  
}

}
