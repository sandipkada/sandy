package Endcapsulation;

public class TestEncapsulation extends Encapsulation1 {

	public static void main(String[] args) {
		
		TestEncapsulation x=new TestEncapsulation();//we create object of subclass
		x.Test();
		
		Encapsulation1 y=new Encapsulation1();	//zero arrgument, we create super class object
		y.Test();
		
	
		Encapsulation1 z=new Encapsulation1(50,60);// with arrgument ,we create super class object
		z.Test();
		//but ans show in TestEndcapsulation class diclear variablels(90,50)=140
	}            //it's means we achive Encapsulatin

}
