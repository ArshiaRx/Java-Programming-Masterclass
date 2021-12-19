public class PlayingCat {
    public static void main(String[] args){
        isCatPlaying(false, 44);
    }
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if ((summer) && (temperature > 24 && temperature < 46)) {
            System.out.println("true");
            return true;
        } else if (temperature < 36 && temperature > 24) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}
