package Casting;

public class TestUpcasting {

public static void main(String[] args) {
	System.out.println("*******with super class object create*********");
	
	Upcasting x=new Upcasting();
	x.Demo();
	x.Static();
	x.Set();
	System.out.println("*******with sub class object create*************");
	
	Upcasting1 y=new Upcasting1() ;
		y.Demo();
		y.Set();
		y.Sub();
		
		System.out.println("********with Upcasting*******");
		// super class refrecence z=new sub class object
		Upcasting z=new Upcasting1() ;
		z.Demo();
		z.Static();
		z.Set();
			System.out.println("********DownCasting**********");
		Upcasting1 a=( Upcasting1)new Upcasting();	//Down casting syntax
		a.Demo();
		a.Set();
		a.Static();
	
	

	
}
  

}
