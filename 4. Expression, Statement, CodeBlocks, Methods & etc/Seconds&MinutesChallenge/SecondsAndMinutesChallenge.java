public class SecondsAndMinutesChallenge {
    /*
Create a method called getDurationString with two parameters, first parameter minutes and 2nd parameter seconds.
You should validate that the first parameter minutes is >= 0.
You should validate that the 2nd parameter seconds is >= 0 and <= 59.
The method should return  "Invalid value" in the method if either of the above are not true.
If the parameters are valid then calculate how many hours minutes and seconds equal the minutes and seconds passed to this method and return that value as string in format "XXh YYm ZZs" where XX represents a number of hours, YY the minutes and ZZ the seconds.

Create a 2nd method of the same name but with only one parameter seconds.
Validate that it is >= 0, and return "Invalid value" if it is not true.
If it is valid, then calculate how many minutes are in the seconds value and then call the other overloaded method passing the correct minutes and seconds calculated so that it can calculate correctly.
Call both methods to print values to the console.

Tips:
	Use int or long for your number data types is probably a good idea.
	1 minute = 60 seconds and 1 hour = 60 minutes or 3600 seconds.
	Methods should be static as we have used previously.

Bonus:
	For the input 61 minutes output should be 01h 01m 00s, but it is ok if it is 1h 1m 0s (Tip: use if-else)
	Create a new console project and call it SecondsAndMinutesChallenge
*/
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    //Constant are written in UpperCase, and finals can not be changed
    public static void main(String[] arg){
        //INVALID_VALUE_MESSAGE = "Hello";    if you write that you get a msg from outside method
        System.out.println("\n" + getDurationString(65, 45) + "--> First method check (minutes & seconds)");
        System.out.println(getDurationString(3945) + "--> Second method check (seconds)");

        //Bonus
        System.out.println(getDurationString(90,  6) + "--> Double digit minutes Test");
        System.out.println(getDurationString(625, 49) + "--> Double digit hour Test");

        //Testing two digit hours
        System.out.println(getDurationString(3600) + "--> This is 3600 seconds");
        System.out.println(getDurationString(81200) + "--> Over 20 hours test check\n");

        //This program can be extended in a way the application gives you the option using switch statements,
        //and based on the need the cases takes user input and call that method, and the result will be return.

    }

    //Write a method that converts (minutes & seconds) to (hours, minutes and seconds).
    private static String getDurationString(long minutes, long seconds){
                                            // ^ int is also fine
        if ((minutes < 0) || ((seconds < 0) || (seconds > 59) )){
            return INVALID_VALUE_MESSAGE;
        }
        long hours =  minutes / 60;
        long remainingMinutes =  minutes % 60;

        //Bonus make the return two digit
        //easy way is to use if statement
        String hoursString = hours + "h ";
        if (hours < 10){
            hoursString = "0" + hoursString;
        }

        String minutesString = remainingMinutes + "m ";
        if (remainingMinutes < 10){
            minutesString = "0" +  minutesString;
        }

        String secondsString = seconds + "s ";
        if (seconds < 10){
            secondsString = "0" + secondsString;
        }

        return hoursString + minutesString + secondsString + " ";
    }

    //Write a method that converts (seconds) to
    private static String getDurationString(long seconds){   //second goes through verification
        if (seconds < 0) {
            return "Invalid value";   //if passed, continue
        }
        long Minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(Minutes, remainingSeconds);   //return through the first method
    }
}
// Wonderful Method overloading exercise!
