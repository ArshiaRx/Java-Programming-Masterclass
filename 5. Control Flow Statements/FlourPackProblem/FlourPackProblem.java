public class FlourPackProblem {
    public static void main(String[] args){
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0,5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));

        System.out.println(canPack(1, 0, 6));
        System.out.println(canPack(2, 1, 5));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int bigCountValue = bigCount * 5;     //bigCount is 5kilo each
        int smallCountValue = smallCount * 1;   //smallCount is 1kilo each

        //Check if the number is valid within the parameters
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if (goal > bigCountValue + smallCountValue){
            return false;
        }
        if (goal % 5 > smallCountValue){
            return false;
        }
        return true;
    }
}
