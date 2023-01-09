package methods;

public class SampleBlock {

	static {
		
		System.out.println("starting block running");
	}
	{
		
		System.out.println("non static block is running");
	}
	public static void main(String[] args) {
		SampleBlock a= new SampleBlock();
		System.out.println("main method started");
		SampleBlock b= new SampleBlock();
		
	}

}
