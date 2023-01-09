package constructor;

public class loading {

	static int a=10;
	int b=20;
	public static void main(int a) {//user define main method
		System.out.println(a);
	}
	public static void main(char x) {//user define
		System.out.println(x);
	}
	public static void main(String[] args) {// system define
		main(5464);
		main('#');
		main(5657);
		main('&');
	}
}
