package generics;

public class Generics1<R,L> {
   int a;
  R b;
  L C;
   public static void main(String[]args) {
	   Generics1<Integer,String> g=new Generics1<Integer,String>();
	   g.a=57;
	   System.out.println(g.a);
	   
	   g.b=56; 
	   System.out.println(g.b);
	   
	   g.C="velocity";
	   System.out.println(g.C);
	   
   }

}
