package String;

public class StringMethods {

	public static void main(String[] args) {
		String a="velocity";
		String b="VELOCITY";
		String c="city";
		String d="";// string is empty
		String e="good    morning  ";
		
		System.out.println(a.replace("o", "T"));//old char to new char we replace 
		System.out.println(d.isEmpty());// here empty string 
		System.out.println(a.concat(c));//addition of string
		System.out.println(a.substring(1));// subtract perticular char 
		System.out.println(a.substring(2, 5));//substract perticular char those we declair
		System.out.println(a.endsWith("y"));// string end with y so that is true
		System.out.println(a.endsWith("e"));//string is not end with e so is false
		System.out.println(a.startsWith("vel"));//string start with vel so its true
		System.out.println(a.startsWith("l"));//string is not start with l so its false
		System.out.println(a.lastIndexOf("i"));//show character in number
		System.out.println(a.indexOf("c"));// show number of index
		System.out.println(a.charAt(6));// show character of string
		System.out.println(a.contains(c));// c=city that present in a= velocity means city word
		System.out.println(a.equals(b));//compair with lenth and same charactor
		System.out.println(a.equalsIgnoreCase(b));// compair with case (upper case, lower case)
		System.out.println(a.length());// check lenth of string
		System.out.println(b.toLowerCase());//convert charactor in small letter/lower case
		System.out.println(a.toUpperCase());//convert charactor in capital letter/upper
		System.out.println(e.split("o"));//
		System.out.println(a.trim());//trim cut specifice charactor
		
		
		
	}
}
