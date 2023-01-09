package Interface;

public class TestDefault1 extends TestDefault {

	public void mart() {
		System.out.println("All shops");//we change body of mart we give in testdefault
	}
	public static void main(String[] args) {
		TestDefault x= new TestDefault();
		TestDefault1 y= new TestDefault1();

	   x.Mart();
	   x.Demart();
	   
	   y.mart();
	   y.Demart();
	}

}
