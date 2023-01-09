package conditional;

public class IfElseIf1 {
	
	public static void main(String[] args) {
		
		String projectdomain="Telecom";// variable declaration
		
		if (projectdomain=="HealthCare") {
			System.out.println("Medical related work");
			
		}
		else if (projectdomain=="Banking") {
			System.out.println(" work related banking transaction");
			
		}
		else if(projectdomain=="Telecom") {
			System.out.println(" work related telecomunication");
			
		}
		else if (projectdomain== "Booking portale") {
			System.out.println(" work related to booking tickets");
			
		}
		else {
			System.out.println("Random project domain");
		}
	}

}
