package methods;

public class GlobleLocal {

	int a=80;// globle variable decleared outside the method
	
	public void test() {
		int b=78;
		int a=45;
		System.out.println(a);
		System.out.println(b);
	}
	public void test1() {
	   int c=90;// local variable inside the method
	   int b=12;
	  System.out.println(a);// global variable printing
	   System.out.println(c);
	   System.out.println(b);
}
	public static void main(String[] args) {
		GlobleLocal x= new GlobleLocal();// object create
		System.out.println(x.a);
		
		x.test();
		x.test1();
	}
}