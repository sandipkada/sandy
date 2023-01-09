package String;

public abstract class spaceString {
     public static void main(String[] args) {
		String s="velocity is the best traning institute ";
		int count=0;
		
		for(int i=0;i<s.length()-1;i++) {
			char a=s.charAt(i);
			if(a=='t') {
				count++;
			}
			
		}
		System.out.println(count);
	}
	   
}
