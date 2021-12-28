public class MethodOverloading {
    public static void main(String args[]){
        int newScore = CalculateScore("Tim", 500);    //overloading method, using the same method
        System.out.println("New score is " + newScore);             ////different parameter value

        CalculateScore(75);
        CalculateScore();
    }
    public static int CalculateScore(String PlayerName, int score){
        System.out.println("\nPlayer " + PlayerName + " scored " + score);
        return score * 1000;
    }

    public static int CalculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int CalculateScore(){
        System.out.println("No player name, no player score.\n");
        return 0;
    }
}
