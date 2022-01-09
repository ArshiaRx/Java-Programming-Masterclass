public class NumberOfDaysInMonth {
    public static void main(String args[]) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(-1, -2020));
    }

    /*
    Examples of input/output:
        * isLeapYear(-1600); →  should return false since the parameter is not in the range (1-9999)
        * isLeapYear(1600); → should return true since 1600 is a leap year
        * isLeapYear(2017); → should return false since 2017 is not a leap year
        * isLeapYear(2000); → should return true because 2000 is a leap year

    Examples of input/output:

            * getDaysInMonth(1, 2020); → should return 31 since January has 31 days.
            * getDaysInMonth(2, 2020); → should return 29 since February has 29 days in a leap year and 2020 is a leap year.
            * getDaysInMonth(2, 2018); → should return 28 since February has 28 days if it's not a leap year and 2018 is not a leap year.
            * getDaysInMonth(-1, 2020); → should return -1 since the parameter month is invalid.
            * getDaysInMonth(1, -2020); → should return -1 since the parameter year is outside the range of 1 to 9999.

    HINT: Use the switch statement.*/

    public static boolean isLeapYear(int year) {
        if ((year < 1) || (year > 9999)) {
            //The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
            return false;
        } else {
            if (((year % 4 == 0) && (year % 100 != 0)) || ((year % 400 == 0) && (year % 100 == 0))) {
                return true;
            } else {
                return false;
            }
            //        If the parameter is not in that range return false.
            //        Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false.
            //        A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1) || (month > 12)) {
            return -1;
        }
        if ((year < 1) || (year > 9999)) {
            return -1;
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 2: {
                    if (isLeapYear(year)) {
                        return 29;
                    } else {
                        return 28;
                    }}
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    return -1;
            }
        }
    }
}
