package automationtesting;

public class LogicAndOrNot8Aug { 
	public static void main(String[] args) {
		// A)AND( && )logic operater
		// ( both are true = true
		System.out.println((10>5)&& (12>10));// true
   
		//2)   both are false
		System.out.println((10<5)&&(4>10));
		
		//3)	1st variable is false ,second- (true)=false.	
		System.out.println((10<6)&&(20>10));// false
		
		// 4)    1st variable is (true),second-is (false)=false
		System.out.println((23>12)&&(12>23));// false
		
//   B) 	OR (||) logic operater
		// 1) 1st condition is (true) ,2 condition is (false)=true(any on condition become
		//true ans. is (true)
		System.out.println((10>5)||(34>12)); // true
		
		// 2)    1st condition is true, sec. condition is fale= (true)
		System.out.println((10>5)||(34<12));//true
	
		// 3) 1st condition is false , 2nd con. is true =( true)
		System.out.println((10<5)||(34>12));// true
		
		// 1st and 2nd condition are false = (false)
		System.out.println((10<5)||(34<12));
		 
// C)  NOT (!)logic operater		
		
		System.out.println(!(34==5));// true
		
		System.out.println(!(3==3));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
