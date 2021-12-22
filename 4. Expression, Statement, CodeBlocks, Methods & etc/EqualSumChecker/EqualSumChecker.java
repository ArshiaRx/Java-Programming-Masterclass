public class EqualSumChecker {
    public static void main(String args[]){
        System.out.println(hadEqualSum(1, 1, 1));
        System.out.println(hadEqualSum(1, 1, 2));
        System.out.println(hadEqualSum(1, -1, 0));
    }
    public static boolean hadEqualSum (int a, int b, int c){
        if (a + b == c){
            return true;
        }
        else {
            return false;
        }
    }
}
