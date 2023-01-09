package Endcapsulation;

public class Encapsulation1 {

	private int a;// private specifire scope within class only
	private int b;
	
	Encapsulation1(){//user define constractar without arrgument
		a=34;
		b=65;
	}
	Encapsulation1(int c,int d){ // with arrgument
		a=90;
		b=50;
	}
	public void Test() {// we vrayped the variable in methode
		int c=a+b;
		System.out.println(" a+b="+c);
	}
}
