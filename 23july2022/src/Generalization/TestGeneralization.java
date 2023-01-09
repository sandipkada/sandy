package Generalization;

public class TestGeneralization {



	public static void main(String[]args) {
		System.out.println("*************specification of JIO operators******************");
		
		JIO x=new JIO();
		x.audiocalling();
		x.sms();
		x.internet();
		x.primmember();
		
		System.out.println("*************specification of VI operators******************");
		
		VI y=new VI();
		y.audiocalling();
		y.sms();
		y.internet();
		
		System.out.println("*************specification of Airtel operators******************");
		
		Airtel z= new Airtel();
		z.audiocalling();
		z.sms();
		z.internet();
		z.AirtelBank();
	}
}
