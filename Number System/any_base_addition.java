public static int anyBaseSum(int base, int number1, int number2){
    
    int resultant = 0;
    int powerShifter = 1;
    int carry = 0;

    while(number1 > 0 || number2 > 0 || carry > 0){
    
    //extracting single digit from numbers
    int digit1 = number1 % 10;
    int digit2 = number2 % 10;
    
    //reducing the numbers
    number1 = number1 / 10;
    number2 = number2 / 10;
    
    //calculating sum of digits       
    int digSum = digit1 + digit2 + carry;
    
    //converting it into desired base
    carry = digSum / base;
    digSum = digSum % base;
    
    //forming the resultant       
    resultant += digSum * powerShifter;
    powerShifter *= 10;
	    
    }
    return resultant;
}
