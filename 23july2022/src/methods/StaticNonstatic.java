package methods;

public class StaticNonstatic {
   
	 static int a=10;  
	 int b=20;
	 
	 public static void main(String[] args) {
		 System.out.println("static variable ="+a);
		 
		 StaticNonstatic x= new StaticNonstatic();// object creation
		 System.out.println(" non-static variable call with ref of x="+x.b);
		 
		 StaticNonstatic y= new StaticNonstatic();// object creation 
		 System.out.println("non-static variable call with ref of y="+y.b);
		 
		 x.b=45;
		 System.out.println("non-static variable call with ref of x="+x.b);
		 System.out.println("non-static variable call with ref of x="+y.b);
		 
		 System.out.println("static variable call with ref of x="+x.a);
		 System.out.println("static variable call with ref of y="+y.a);
		 
		 x.a=80;
		 System.out.println("static variable call with ref of x="+x.a);
		 System.out.println("static variable call with ref of y="+y.a);
	}
	
}
