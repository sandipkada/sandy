package String;

public class ConstantAndNonconstant {
 
	public static void main(String[] args) {
		
		String a="velocity";// without new keyword
		String b="velocity";// without new keyword
		
		String c=new String ("velocity");// with new keyword 
		String d=new String("velocity");//with new keyword
		
		System.out.println(a==b);//we compair a==b;=true 
		System.out.println(c==d);//we compair c==d;=false new object create here
		
		System.out.println("******************************************");
		
		b="class";// a="velocity" b="class"
		System.out.println(b);// class
		System.out.println(a);//velocity
		System.out.println(b==a);//class and velocity they create new object that way
		//class & velocity is not comapair
		System.out.println("********************************************");
		
		b="velocity";// a="velocity" b="velocity"
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b);//both are "velocity" so their are 
		//one data but 2 ref variable.
		
	}

}
