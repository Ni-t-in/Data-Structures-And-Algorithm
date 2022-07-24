public static int getDifference(int base, int number1, int number2){
    int digit = 0;
    int digit1 = 0;
    int digit2 = 0;
    int borrow = 0;
    int powerShifter = 1;
    int resultant = 0;
        
    while(number2 > 0){
        digit1 = number1 % 10;
        number1 /= 10;
        digit2 = number2 % 10;
        number2 /= 10;
        //adding the borrow in digit
        digit2 += borrow;  
        
        if(digit2 >= digit1){
            borrow = 0;
            digit = digit2 - digit1;
        }
        else{
            //taking borrow from previous digit
            borrow = -1;
            digit = digit2 + base - digit1;
        }
            
        resultant += digit * powerShifter;
        powerShifter *= 10;
    }
    return resultant;
}
