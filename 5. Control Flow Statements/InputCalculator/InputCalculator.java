import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scan = new Scanner(System.in);

        int SUM = 0;
        int Count = 0;
        int order = 0;
        //System.out.println("Please enter a value for sum and average ...");             Personal Customize
        while (true) {
            // order++;
            //System.out.print(order + ". ");      //Personal Customize

            boolean isNextInt = scan.hasNextInt();


            if (!isNextInt){
                break;
            }
                SUM += scan.nextInt();
                Count++;

        }
        double AVG = (double) SUM / Count;
        long roundAVG = Math.round(AVG);

        System.out.println("SUM = " + SUM + " AVG = " + roundAVG);
        scan.close();

    }
}
