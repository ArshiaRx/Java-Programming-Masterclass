public class LeapYearCalculator {
    public static void main(String args[]) {
        System.out.println((isLeapYear(-1600)));   //false
        System.out.println(isLeapYear(1600));      //true
        System.out.println(isLeapYear(2017));      //false
        System.out.println(isLeapYear(2000));      //true
        System.out.println(isLeapYear(1800));      //False
        System.out.println(isLeapYear(1924));      //true
    }

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                    return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
