package methods;

public class Return {

	static int Demo() {  // user define with int return type 
		int a=40;
		int b=60;
		int c=a+b;
		return c;
	}
     static String Test() { //user define with int String type 
    	 return"Good Morning";
     }
    public static void main(String[] args) {
		int c=Demo();
		System.out.println(c);
	String d=Test();
	System.out.println(d);
    }


}
