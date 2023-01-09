package generics;

public class Generics2 <R,L> {

	int a;
	R b;
	
	R test(L s) {
		return b;
	}{
		
	}
	public static void main(String[] args) {
		Generics2<Integer,String> g =new Generics2<Integer,String>();
		g.a=56;
		g.b=33;
		System.out.println(g.b);
	}
	
}
