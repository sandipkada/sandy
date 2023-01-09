package automationtesting;

public class Datatype { 
	public static void main(String[] args) {
		
   boolean StdPass =true;// conditional DT only TRUE OR FALSE
   byte StdMaxMarks = 100;// Value from -128 to 127 instead of int to save memory     
   short StdTotalMarks =500; //value from -32768 to32768
   int StdRollNumber =1234567890; //value from -2147483648 to 2147483647(10 digit)
   long StdMobileNumber =8605196867L;//(L is mandetory)
 
   double StdAvgMarks =65.647494836374894;//fractional no. max 15
   float StdPercentage =78.544744849899440F;//(F is mandetory)
   char StdGread ='A';
   String abc ="gfkdldJHH2526";
   
System.out.println(StdPass);
System.out.println(StdMaxMarks);
System.out.println(StdTotalMarks);
System.out.println(StdRollNumber);
System.out.println(StdMobileNumber);
System.out.println(StdAvgMarks );
System.out.println(StdPercentage);
System.out.println(StdGread);
System.out.println(abc );


	}

}
