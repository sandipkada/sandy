package nonstaticmethods;

public class ABC {

	public void Demo() {// Declaring non-static method 
		System.out.println(" Declaring non-static method ");
		
	}
	public void Memo() { // Declaring non-static method 
		System.out.println(" Declearing non-static method 1 ");
		
	}
	public static void main(String[] args) {
		
		ABC s= new ABC();
		s.Demo();// non-static method call from same class
		s.Memo();
	}
}
