package thiskeywordandSuperKey;

public class Thise {

	int a=70;//Globle variable
	
	public void Demo() {
		int a=80;// Local variable
		System.out.println(a);// call local variable
		
		System.out.println(this.a);// call Globle variable
	}
	public static void main(String[] args) {
		Thise x=new Thise();
		x.Demo();
	}
	

}
