package DecimalToBinary;

public class DeToBi_UsingtoString_method {

	public static void main(String[] args) {
		 
		// declare the decimal number to be converted to binary
		   int decimalNumber = 45;
		   // call the method which converts the number to binary
		   printBinaryform(decimalNumber);
		}
		 
		static void printBinaryform(int number) {
		   int remainder;
		   // check if the number is 0 or 1, then it has been converted to binary
		   if (number <= 1) {
		      System.out.print(number);
		      return;
		   }
		   // divide the number by 2 using modulus operator so that we get the remainder
		   remainder = number % 2;
		   //call method again with the quotient as the number
		   printBinaryform(number / 2);
		   System.out.print(remainder);
	}

}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
