public static int anyBaseSum(int base, int number1, int number2){
  int sum = 0;
  int power = 1;
  int carry = 0;
  while(number1 > 0 || number2 > 0 || carry > 0){
      int digit1 = number1 % 10;
      int digit2 = number2 % 10;
      number1 = number1 / 10;
      number2 = number2 / 10;
           
      int digSum = digit1 + digit2 + carry;
      carry = digSum / base;
      digSum = digSum % base;
           
      sum += digSum * power;
      power *= 10;
  }
  return sum;
}
