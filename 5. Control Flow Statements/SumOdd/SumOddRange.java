public class SumOddRange {
    public static void main(String[] args) {
        System.out.println((sumOdd(1, 100)));  //Should return 2500
        System.out.println((sumOdd(-1, 100)));    //Should return -1
        System.out.println((sumOdd(100, 100)));     //Should return 0
        System.out.println((sumOdd(13, 13)));     //Should return 13
        System.out.println((sumOdd(100, -100)));   //Should return -1
        System.out.println((sumOdd(100, 1000)));   //Should return 247500
    }

    public static boolean isOdd(int number) {
        if (number > 0) {
            //Check that number > 0, else return false
            if (number % 2 == 1) {
                //Check that number is odd, otherwise false
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if ((end >= start) && (start > 0 && end > 0)) {
            //end should be greater than or equal to start, both start and end needs to be greater than zero
            //else return Invalid -1

            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    //call the isOdd method to check if the number is odd
                    sum += i;
                    // if the number is odd at the range of start to end, add those number together and
                    // return the sum
                }
            }
            return sum;
        } else {
            return -1;
        }
    }
}
