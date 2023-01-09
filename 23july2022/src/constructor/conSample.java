package constructor;

public class conSample {

	int a;
	int b;
	int m;
	String name;
	String velocity;
	
	conSample(){// user define with cons with zero argument/ parameter
		a=89;
		b=90;
		
	}
	conSample(int c,int d){//user define with cons with argument/ parameter
		a=c;
		b=d;
		
	}
	conSample(int c, int d,int i){//user define with cons with  argument/ parameter
		a=c;
		b=d;
		m=i;
	System.out.println(m+a+b);	
	}
	conSample(String p,String q){//user define with cons with  argument/ parameter
		name=p;
		velocity=q;
	}
	public void addition() {
		System.out.println(m+a+b);
	}
	public void st() {
		System.out.println(name);
		System.out.println(velocity);
	}
	public static void main(String[] args) {
		conSample s=new conSample(450,77,788);
		
		conSample x=new conSample();
		x.addition();
		//x.st();
		
		conSample y=new conSample(70,70);
		y.addition();
		
		conSample z= new conSample("sandip","tester");
		z.st();
		
	}

}
