public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));   // should return 20
        System.out.println(getEvenDigitSum(252));      // should return 4
        System.out.println(getEvenDigitSum(-22));   // should return -1

    }

    public static int getEvenDigitSum(int number) {
        // invalid for negative values
        if (number < 0) {
            return -1;
        }

        int sum = 0;

        // as long as we have number, do the following
        while (number > 0) {

            // Take the remainder
             int Remainder_lastDigit = number % 10;

            // what is left as a division
            number = number / 10;

            // check if the number is even, if yes add to sum
            if (Remainder_lastDigit % 2 == 0) {
                sum += Remainder_lastDigit;
            }
        }
        //Lastly, return the sum of even number
        return sum;
    }
}
