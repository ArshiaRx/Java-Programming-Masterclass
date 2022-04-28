public class LargestPrime {
    public static void main(String args[]) {
        // if the number is negative or does not have prime numbers, the method should return -1 to
        //indicate an invalid value.
        System.out.println(getlargestPrime(21));
        System.out.println(getlargestPrime(217));
        System.out.println(getlargestPrime(0));
        System.out.println(getlargestPrime(45));
        System.out.println(getlargestPrime(-1));
        //The method should calculate the largest prime factor of a given number and return  it.

    /*    EXAMPLE INPUT/OUTPUT:

        * getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)
        * getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)
        * getLargestPrime (0); should return -1 since 0 does not have any prime numbers
        * getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
        * getLargestPrime (-1); should return -1 since the parameter is negative

        HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.
    */
    }

    public static int getlargestPrime(int number) {

        if (number > 1) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    number /= i;
                    i--;
                }
            }
            return number;
        }
        return -1;
    }
}
