package Generalization;

public class JIO implements operators {

	public void audiocalling() {// come from super class(operators)and we givr body
		System.out.println("Audio calling unlimited");
	}
	public void sms() {
		System.out.println("SMS=100 per Day");
	}
	public void internet() {
	System.out.println("Daily 2GB");
	}
	public void primmember() {// we add extre feature
		System.out.println("100 RS off prime member");
	}

}
