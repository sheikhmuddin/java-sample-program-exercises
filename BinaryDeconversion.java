package DecimalToBinary;

//This program follows the convention of giving a fullstop after the code for an individual character
public class BinaryDeconversion
{
String binarycode;
BinaryDeconversion()//default constructor
{
  binarycode="1000011.1101111.1100100.1100101.100000.1010011.1110000.1100101.1100101.1100100.1111001.";
}
BinaryDeconversion(String x)//parameterized constructor
{
  binarycode=x;
}
public static void main(String args[])
{
   BinaryDeconversion ob;
  try{//considering the command line argument of the user as the string to be re-converted from binary format
      ob=new BinaryDeconversion(args[0]);
  }//going with the default string in case of any exceptions with the command line argument
   catch(Exception e){ob=new BinaryDeconversion();};
   System.out.print("The decoded value of binary code "+ob.binarycode+" is: ");
   ob.binaryToString(ob.binarycode);
}
char binary(char array[])
{
  int code=0;
  int temporary;
  int i;
  int j=0;
  for(i=0;array[i]!='\0';i++);//obtaining the index of the last code-character in array[]
  for(--i;i>=0;i--){
      temporary = ((int)array[i]) - ((int)('0'));
      code+=temporary*(int)(Math.pow(2,j++));//Math.pow() helps in giving the required power of 2
  }
  return (char)code;//returning the character corresponding to the integer-code whose value is in 'code'
}
void binaryToString(String code)
{
  char helper[]=new char[10+1];//assuming that the length of binary code for one character will not exceed 10
  int index = 0;
  for(int i=0;i<code.length();i++){
      if(code.charAt(i)=='.')//printing the value of the code for one character
      {
          helper[index]='\0';
          System.out.print(binary(helper));
          index=0;
      }
      else//stacking up the incomplete code for one character
      {
          helper[index++]=code.charAt(i);
      }
  }
}
}//class ends