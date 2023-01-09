package conditional;

public class NestedIf {

	public static void main(String[] args) {
		
		String Username="sandip";
		String Password="xyz";
		if (Username==" sandip") {// condition 1
			System.out.println("Username is correct");
			
		if (Password=="xyz") {// condition 2
			System.out.println("Password is correct");
			System.out.println("Login Successfull");
			
		}
		else {
			System.out.println("Password is wrong");
			System.out.println("Login is Failed");
			}
		 {
		
			
			System.out.println(" worng username");
			System.out.println(" Login failed"); 
		}
			
		
		
	}
	}
}