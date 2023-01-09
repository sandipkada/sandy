package Array;

public class MultiDimenssionArray {
    //10 20 30 i want print like  
	//40 50 50 
	//60 70 80 
	public static void main(String[] args) {
		 int ar[] []= {{10,20,30},{40,50,50},{60,70,80}};// mutidimentional Array
		
		 int a=ar.length;
		 
		 for (int i=0; i<=2;i++) {
			  
			 for (int j=0;j<=2;j++) {
				 System.out.print(ar[i][j]+" ");
			 }
			 System.out.println();
		 }
	}

}
