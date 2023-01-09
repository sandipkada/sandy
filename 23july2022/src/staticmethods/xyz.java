package staticmethods;

public class xyz {// part 1
 public static void Sample () {// static method decleration
	 System.out.println("Running static method sample");
 }
  public static void Sample1() {
	  System.out.println("Running static method sample1");
  }
  
  public static void main(String[] args) {
	Sample();// static method calling from same class
	Sample1();
}

}
