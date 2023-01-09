package forloop;

public class Forloop {

	public static void main(String[] args) {
		String s1="Simple";
		int s2=s1.length();
	  for(int i=s2-1;i>=0;i--) {//row
		  
	  
	  for(int j=0;j<=i;j++) {//column
		  
		  System.out.print(s1.charAt(j)+" ");
	  }
	  
	  System.out.println();
	}
	}

}
