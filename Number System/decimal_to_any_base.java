public static int decimalToAnyBase(int number, int base){
	
	//taking initial resultant 0
 	int resultant = 0;
	
	//initial multiplier to form a number
 	int powerShifter = 1;
	
	//execute a loop until number become 0
 	while(number > 0){
	
        //it will give digits of resultant
  	int remainder = number % base;
		
  	//reducing the number by dividing it with base
  	number = number / base;
	
  	resultant = resultant + (remainder * powerShifter);
  	powerShifter *= 10;
  }
  return resultant;
}
