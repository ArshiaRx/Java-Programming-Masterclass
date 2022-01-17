public class NumberPalindrome {
    public static void main(String[] args) {
        //Palindrome: is a number where its inverse is the same
        //Ex:  121,  12321
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int temporary = number;

        while (number != 0) {                           // lets say number = 707
            int lastDigit = number % 10;               // lastDigit = 707 % 10 = 7
            reverse = (reverse * 10) + lastDigit;      // reverse = 7
            number /= 10;                              // number = 707 / 10 = 7

        }
        if (temporary != reverse) {
            return false;
        } else {
            return true;
        }
    }
}
