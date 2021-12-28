public class calcFeetAndInchesToCentimeters {
    public static void main(String args[]) {
        double centimeter = calcFeetAndInchesToCentimeter(5, 3);
        if (centimeter < 0.0) {
            System.out.println("Invalid Parameters");
        }
        calcFeetAndInchesToCentimeter(50);
    }

    public static double calcFeetAndInchesToCentimeter(double feet, double inches) {
        if ((feet < 0) || (inches < 0) && (inches > 12)) {
            return -1;
        }
        //If the parameter is valid, calculate the centimeters
        //comprise the feet and inches passed to this method and return that value
        double Centimeter = (int) (feet * 12) * 2.54;  /* 1 inch = 2.54 cm */
        Centimeter += (inches * 2.54);                  /* foot = 12 inches */
        System.out.println("\n" + feet + " feet and " + inches + " inches = " + Centimeter + " cm");
        return Centimeter;
    }

        //create a 2nd method of the same name but with only one parameter
        //inches is the parameter
        //validate that it >= 0

        public static double calcFeetAndInchesToCentimeter(double inches){
            if (inches < 0){
                return -1;
            }
            
            double feet = (int) inches / 12;    // foot is 12 inches, feet is 1 inch
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches);
            return calcFeetAndInchesToCentimeter(feet, inches);
        }
    }
