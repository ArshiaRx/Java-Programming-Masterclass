public class GreatestCommonDivisor {
    public static void main(String[] args){
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }
    //Method Successful
    public static int getGreatestCommonDivisor(int first, int second) {
        //Check if the Condition is valid
        if (first < 10 || second < 10) {
            return -1;
        }

        int CommonDivider = 0;
        // Loops and check if the two number are dividable with same two value
        for (int i = 1; i < 100; i++){
            if (first % i == 0 && second % i == 0){
                CommonDivider = i;
            }
        }
        return CommonDivider;
    }
}
