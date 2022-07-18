//will convert decimal to binary and octal but not hexadecimal since it contains character too.

public static int decimalToAnyBase(int number, int base){
	
	//taking initial resultant 0
 	int resultant = 0;
	
	//initial multiplier to form a number
 	int multiplier = 1;
	
	//execute a loop until number become 0
 	while(number > 0){
	
		//it will give digits of resultant
  	int remainder = number % base;
		
  	//reducing the number by dividing it with base
  	number = number / base;
	
  	resultant = resultant + (remainder * multiplier);
  	multiplier *= 10;
  }
  return resultant;
}
