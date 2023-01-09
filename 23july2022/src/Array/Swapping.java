package Array;

public class Swapping {

	public static void main(String[] args) {
		int a[]= {30,50,60,54,65,78,29};
		
		for(int i=0;i<=a.length-1;i++) {
			System.out.print(a[i]+" ");//we want print in one line and between space
			                            //we write s.o.print(a[i]+" ")	}
		}
		for(int i=0;i<a.length/2;i++) {
			int z;// new variable declear
			
			z=a[i];// a=[6]     we store =a[i] value in =z variavle then a[i] is empty
			a[i]=a[(a.length-1)-i];//that empty a[i] we store value of a[(a.lenth-1)-i]
			                        //then a[(a.length-1)-i] is empty now.....
			a[(a.length-1)-i]=z;// z=a[i] value store in  =a[(a.length-1)-i]
			
		}
		System.out.println();
	//	System.out.println(a[1]);
		
		for (int i=0; i<=a.length-1;i++) {
		System.out.print(a[i]+" ");
		}
	}
		}
		
	