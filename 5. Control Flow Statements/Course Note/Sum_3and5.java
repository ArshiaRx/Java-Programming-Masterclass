public class Sum_3and5 {
    /*
     * Create a for loop statement using a range of numbers from 1 to 1000 inclusive.
     * SUM all that numbers that can be divided with both 3 and also with 5.
     * For those numbers that met the above conditions, print out the number.
     * Break out the loop once you find 5 numbers that met the above condition.
     * After breaking out of the loop print the sum of the numbers that met the above conditions.
     *
     * Note: Type all code in the main method
     */
    public static void main(String[] args) {

        //int sum = 0;
        int count = 0;

        for (int i = 1; i < 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                //sum += i;
                System.out.println("Found = " + i);
            }
            if (count == 5){
                break;
            }
        }
    }
}
