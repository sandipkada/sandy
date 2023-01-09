package generics;

public class Generics<R> {

	int a;
	R b;

	public static void main(String[]args) {
		Generics<Integer> g=new Generics<Integer>();
		g.a=56;
		g.b=78;
		System.out.println(g.b);
		System.out.println(g.a);
		
		Generics<String> x=new Generics<String>();
		x.b="Velocity";
		System.out.println(x.a);
		
		Generics<Float>	y=new Generics<Float>();
		y.b=45.45f;
		System.out.println(y.b);
		}
}
