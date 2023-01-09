package constructor;

public class methodoverload {
  
	
	
	public void Addititon ( int a, int  b) {
		int c=a+b;
		System.out.println(c);		
	}
	public void division (int x , int  y) {
		int z= x/y;
		System.out.println(z);	
	}
	public void multiplication(float a, float b) {
		float c=a*b;
		System.out.println(c);
	}
	public static void memo() {
		System.out.println("Running Overloading Method");
	}
	public static void main(String[] args) {
		methodoverload x= new methodoverload();
		x.Addititon(100, 40);
		x.division(354, 90);
		x.multiplication(50f, 550f);
		x.memo();
		
	}
	 
	
}
