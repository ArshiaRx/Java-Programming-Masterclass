public class DigitSum {
    public static void main(String[] args){
    /*
    * Write a method with the name sumDigits that has one int parameter called number.

    * If parameter is >= 10 then the method should process the number and return sum of all digits,
      otherwise return -1 to indicate and invalid value.

    * The number from 0-9 have 1 digit so we don't want to process them, also we don't want to process negative numbers,
      so also return -1 for negative numbers.
     */
        System.out.println("The sum of the digits in number 125 is " + sumDigits(125));
        System.out.println("The sum of the digits in number -125 is " + sumDigits(-125));
        System.out.println("The sum of the digits in number 4 is " + sumDigits(4));
        System.out.println("The sum of the digits in number 32123 is " + sumDigits(32123));

    }

    private static int sumDigits(int number){
        if ((number < 10) || (number < 0)){
            return -1;
        }
        int sum = 0;
        // 125 --> 125 / 10 = 12 * 10 = 120 --> 125 - 120 = 5
        // 125 --> 125 % 10 = 25 % 10 = 5
        while (number > 0){
            // extract the least-significant digit
            int digit = number % 10;
            sum += digit;

            // drop the least-significant digit
            number /= 10;    // number = number / 10
        }
        return sum;
    }
}
