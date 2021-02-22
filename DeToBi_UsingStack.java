package DecimalToBinary;

import java.util.Stack;

public class DeToBi_UsingStack {

	public static void main(String[] args) {
		 
		 // initialize stack
		   Stack stack = new Stack();
		   // declare the decimal number to be converted to binary
		   int decimalNumber = 65;
		   // loop till the number is greater than 0
		   while (decimalNumber > 0) {
		      // divide the number by 2 using modulus operator so that we get the
		      // remainder
		      int remainder = decimalNumber % 2;
		      // push the remainder at the top of stack
		      stack.push(remainder);
		      // divide the number to get the quotient and assign it back to the number
		      decimalNumber = decimalNumber / 2;
		   }
		   // loop over stack till it becomes empty
		   while (!stack.isEmpty()) {
		      // remove topmost elements from the stack
		      System.out.print(stack.pop());
	}

}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
