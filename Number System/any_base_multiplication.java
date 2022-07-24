//will perform product of binary,decimal and octal except hexadecimal since it contains character too.

public static int getProduct(int base, int number1, int number2){
   int product = 0;
   int powerShifter = 1;
  
   //Extracting digits from number2 it will get multiplied one by one with number1
   while(number2 > 0){
       
      int digit = number2 % 10;
      number2 /= 10;
         
      //getProductWithSingleDigit function will return the product of number1 with one digit of number2
      int singleProduct = getProductWithSingleDigit(base,number1,digit);
         
      //getSum function will return the sum of previous resultant and present product
      //powershifting always happens when we add products of evry digit with number
      //eg. 7896 * 34
      //    4*786 =  3144
      //    3*786 = 2358x
      //      sum = 26724
      resultant = getSum(b,resultant,oneProduct*powerShifter);
      powerShifter *= 10;
   }
   return resultant;
}
//this function will return product of number1 with single digits of number2
public static int getProductWithSingleDigit(int base,int number,int digit){
   int resultant = 0;
   int carry = 0;
   int powerShifter = 1;
   int multiplication = 0;
   int tempDigit = 0;
   int remainder = 0;
     
   while(number > 0 || carry > 0){
      tempDigit = number % 10;
      number /= 10;
         
      multiplication = tempDigit * digit + carry;
         
      carry = multiplication / base;
      remainder = multiplication % base;
         
      resultant += remainder * powerShifter;
      powerShifter *= 10;
   }
   return resultant;
}
//this is getSum function smae as any base addition 
public static int getSum(int base, int number1, int number2){
   int resultant = 0;
   int carry = 0;
   int powerShifter = 1;
   int addition = 0;
   int digit1 = 0;
   int digit2 = 0;
   int remainder = 0;

   while(number1 > 0 || number2 > 0 || carry > 0){
      digit1 = number1 % 10;
      number1 /= 10;
      digit2 = number2 % 10;
      number2 /= 10;
        
      addition = digit1 + digit2 + carry;
        
      carry = addition / base;
      remainder = addition % base;
        
      resultant += remainder * powerShifter;
      powerShifter *= 10;
   }
   return resultant;
}
