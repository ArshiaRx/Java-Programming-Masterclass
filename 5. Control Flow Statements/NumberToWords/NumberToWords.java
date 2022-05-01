public class NumberToWords {
    public static void main(String[] args) {

        //numberToWords -- Needs to be reversed
        numberToWords(123);     //One Two Three
        numberToWords(1010);    //One Zero One Zero
        numberToWords(1000);    //One Zero Zero Zero
        numberToWords(-12);     //Invalid Value


        System.out.println("\n");

        //getDigitCount --> Method Successful
        System.out.println(getDigitCount(0));      //1
        System.out.println(getDigitCount(123));    //3
        System.out.println(getDigitCount(-12));    //-1
        System.out.println(getDigitCount(5200));   //4

        System.out.println("\n");

        //reverse --> Method Successful
        System.out.println(reverse(-121));      //-121
        System.out.println(reverse(1212));      //2121
        System.out.println(reverse(1234));      //4321
        System.out.println(reverse(100));       //1
    }

    //Method Successful --> Need to reverse it
    public static void numberToWords(int number) {

        if (number >= 0) {
            int reversed = reverse(number);
            int OrgNumber = getDigitCount(number);

            for (int i = 0; i < OrgNumber; i++) {

                int Digit = reversed % 10;
                switch (Digit) {
                    case 0:
                        System.out.print("Zero");
                        break;
                    case 1:
                        System.out.print("One");
                        break;
                    case 2:
                        System.out.print("Two");
                        break;
                    case 3:
                        System.out.print("Three");
                        break;
                    case 4:
                        System.out.print("Four");
                        break;
                    case 5:
                        System.out.print("Five");
                        break;
                    case 6:
                        System.out.print("Six");
                        break;
                    case 7:
                        System.out.print("Seven");
                        break;
                    case 8:
                        System.out.print("Eight");
                        break;
                    case 9:
                        System.out.print("Nine");
                        break;
                }
                 System.out.print(" ");
                reversed /= 10;
            }
        } else {
            System.out.println("Invalid Value");
        }
        System.out.println("");
    }


    //Method Successful
    public static int getDigitCount(int number) {

        int count = 0;
        String DigitCount = Integer.toString(number);

        if (number < 0) {
            return -1;
        } else {
            for (int i = 0; i < DigitCount.length(); i++) {
                number /= 10;
                count++;
            }
            return count;
        }
    }

    //Working on it
    public static int reverse(int number) {                 //1212   2121
        int reverseNumber = 0;
        int LastDigit;
        while (number != 0) {
            LastDigit = number % 10;
            reverseNumber = reverseNumber * 10 + LastDigit;
            number /= 10;
        }
        return reverseNumber;
    }
}
