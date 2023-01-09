package String;

public class ReverseString {

	public static void main(String[] args) {
		String a="Helloworld";
		String rev="";// beause that string store in here.
		for (int i=a.length()-1;i>=0;i--) {//a.length=length of Helloword =10-1=9 
                   //i is greater thean 0 condition is true 	
			rev=rev+a.charAt(i);//he give reverce like=dlrowolleH
		}
		System.out.println(rev);//like=dlrowolleH
		System.out.println(rev.indexOf("H"));// we found index number of reverse index
	}
	

}
