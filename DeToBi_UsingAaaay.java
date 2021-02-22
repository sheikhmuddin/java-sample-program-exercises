package DecimalToBinary;

public class DeToBi_UsingAaaay {

	public static void main(String[] args) {
		 
	
		   //initialize array
		   int binary[] = new int[20];
		   // declare the decimal number to be converted to binary
		   int decimalNumber = 25;
		   int index = 0;
		   // loop till the number is greater than 0
		   while (decimalNumber > 0) {
		      // divide the number by 2 using modulus operator so that we get the remainder
		      int remainder = decimalNumber % 2;
		      // store the remainder in array
		      binary[index++] = remainder;
		      // divide the number to get the quotient and assign it back to the number
		      decimalNumber = decimalNumber / 2;
		   }
		   // loop over the array backwards and print the binary number
		   for (int i = index - 1; i >= 0; i--) {
		      System.out.print(binary[i]);
	}

}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
