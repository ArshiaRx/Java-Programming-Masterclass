public class YearsAndDays {
    public static void main(String args[]) {
        printYearsAndDay(525600);
        printYearsAndDay(1051200);
        printYearsAndDay(561600);
    }

    public static void printYearsAndDay(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }

        /* 1 hour = 60 minutes
         * 1 day = 24 hours
         * 1 year = 365 days*/

        /*Steps:
         * 1st - Calculate how many minutes is in an hour
         * 2nd - Initialize day and year
         * 2nd - Then set remaining minutes to day */
        long years = ((minutes / 60) / 24) / 365;
        long remainingDay = ((minutes / 60) / 24) % 365;

        //long hours = minutes / 60;    // if we have 60 minutes divided by 60 minutes that means we have one hour
        //long days = hours / 24;          // if we have 48 hours divided by 24 hours that means we have two days
        //long years = days / 365;
        //long remainingDay = days % 365;
        
        System.out.println(minutes + " min = " + years + " y and " + remainingDay + " d");
    }
}

/* Write a method printYearsAndDays with parameter of type long named minutes.
    The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.
    If the parameter is less than 0, print text "Invalid Value".
    Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".

    XX represents the original value minutes.
    YY represents the calculated years.
    ZZ represents the calculated days.

    EXAMPLES OF INPUT/OUTPUT:

            * printYearsAndDays(525600);  → should print "525600 min = 1 y and 0 d"
            * printYearsAndDays(1051200); → should print "1051200 min = 2 y and 0 d"
            * printYearsAndDays(561600);  → should print "561600 min = 1 y and 25 d"
