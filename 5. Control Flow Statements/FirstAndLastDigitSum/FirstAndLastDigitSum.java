public class FirstAndLastDigitSum {
    public static void main(String[] args){
        System.out.println(sumFirstAndLastDigit(252));
    }
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        // Integer (number) convert to a string and String name is numberAsString
        String numberAsString = Integer.toString(number);
        int intLength = numberAsString.length();
        int firstDigit = 0, last = 0;

        for(int i = 0; i < intLength; i++){
            if(i == 0){
                firstDigit = Integer.parseInt(numberAsString.substring(i,i+1));
            }
            if(i == (intLength -1)){
                lastDigit = Integer.parseInt(numberAsString.substring(i,i+1));
            }
            System.out.println(numberAsString.substring(i,i+1));
        }

        return firstDigit + lastDigit;
    }
}
