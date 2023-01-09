package String;

public class splitMethodWithDate {
  public static void main(String[] args) {
	String s="23/06/2022";
	String []result=s.split("/");
	 for(int i=0;i<result.length; i++) {
		 System.out.println(result[i]);
	 }
}

}
