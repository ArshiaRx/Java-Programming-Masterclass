//The cats spend most of the day playing. In particular, they play if the temperature is between 25 and 35 (inclusive).
//Unless it is summer, then the upper limit is 45 (inclusive) instead of 35.
//Write a method isCatPlaying that has 2 parameters. Method needs to return true if the cat is playing, otherwise return false
//1st parameter should be of type boolean and be named summer it represents if it is summer.
//2nd parameter represents the temperature and is of type int with the name temperature.

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if ((summer) && (temperature > 24 && temperature < 46)) {
           // System.out.println("true");
            return true;
        } else if (temperature < 36 && temperature > 24) {
           // System.out.println("true");
            return true;
        } else {
            //System.out.println("false");
            return false;
        }
    }
}
