package Casting;

  public class SonUpcast extends FatherUP {//super class property extend to sub class

	public void Bick() {//sub class property
		System.out.println("son property bick");
	}
  public static void main(String[] args) {
	FatherUP x=new SonUpcast(); 
	//referance is super class x= new subclass();
	x.car();
	x.home();

}

}
