package Interface;

public class ABC implements A {// incomplete methode come here from "A"

	public void Demo() {
		System.out.println(" Demo methode started");
	}
	public void Test() {
		System.out.println("Test methode started");
	}
	public static void main(String[] args) {
		ABC x=new ABC();
		x.Demo();
		x.Test();
	}
}
