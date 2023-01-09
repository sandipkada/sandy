package Interface;

public class Staticmethod implements MethodStatic {

	public void Display() {// method from interface is complete
		System.out.println("Non static method running");// we give body incomplet method.
	}
 public static void main(String[] args) {
	 Staticmethod x=new  Staticmethod();// implementstion class objet
	 x.Display();
	 MethodStatic.Show();//for calling static we take interfa name(MethodStatic)then out put come
}
}
