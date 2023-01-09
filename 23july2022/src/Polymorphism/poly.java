package Polymorphism;

public class poly {// compile time polymorphism(type of polymorphism)

	public void Addition(int a,int b) {// overloddind is run in this method
		System.out.println(a+b);
	}
	
	public void Addition (int a, int b, int c) {// method name same but argument different
		System.out.println(a+b+c);
	}
	
public static void main(String[]args) {
	poly x= new poly();
	x.Addition(30, 40);
	x.Addition(440, 550, 660);
}
}
