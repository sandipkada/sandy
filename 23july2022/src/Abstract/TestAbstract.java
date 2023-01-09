package Abstract;// class name

public class TestAbstract extends ABCD {
	
	public void Test() {
		System.out.println(" Abtract methode converted to complete methode");
		// this methode present in class ABCD but there is no body
	}
	
	
	public static void main(String[] args) {
		
		TestAbstract x= new TestAbstract();
		x.Demo();
		x.Test();
		
	}
	

	

}
