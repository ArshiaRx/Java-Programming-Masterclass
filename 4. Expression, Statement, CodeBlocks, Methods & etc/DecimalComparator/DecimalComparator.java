public class DecimalComparator {
    public static void main(String args[]){
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.1760));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
    public static boolean areEqualByThreeDecimalPlaces(double first, double second){
        double Num3 = first - second;
        if (Math.abs(Num3) <= 0.0009){
            return true;
        }
        else {
            return false;
        }
    }
}
