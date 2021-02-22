package DecimalToBinary;

public class DeToBi_UsingRecursion {

	public static void main(String[] args) {
		 
		  // declare the decimal number to be converted to binary
		   int decimalNumber = 25;
		   // initialize stringbuffer which will hold the binary number
		   StringBuffer binaryBuffer = new StringBuffer();
		   // loop till the number is greater than 0
		   while (decimalNumber > 0) {
		      // divide the number by 2 using modulus operator so that we get the remainder
		      int remainder = decimalNumber % 2;
		      // add the remainder to string buffer
		      binaryBuffer.append(remainder);
		      // divide the number to get the quotient and assign it back to the number
		      decimalNumber = decimalNumber / 2;
		   }
		   //reverse the buffer and convert it to string
		   String binaryNumber = binaryBuffer.reverse().toString();
		   System.out.println(binaryNumber);
	}

}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
