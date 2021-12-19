public class OperatorChallenge {
    public static void main(String args[]) {

        boolean isCar = false;
        if (isCar){     //if isCar = true will run it
            System.out.println("This is not supposed to happen");
        }

        isCar = false;     //The Ternary operator ?: check if the condition is met
        boolean wasCar = isCar ? true : false;   //if isCar is false, this wont run
        //but if we set isCar to true and the first expression after ? is true
          //if isCar is false print
        if (wasCar) {  //Or set (wasCar == false) to make it run
            System.out.println("\nwasCar is true");
        }

        double twenty = 20d;  //1
        double eighty = 80.00d;  //2
        double sum = (twenty + eighty) * 100.00;  //3
        System.out.println("The result to 20.00 + 80.00 multiply hundred = " + sum);

        double theRemainder = sum % 40.00d;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);

        if (!isNoRemainder){
            System.out.println("Got some remainder");
        }
    }
}
