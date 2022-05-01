public class LastDigitChecker {
    public static void main(String[] args) {

        //All condition passed
        System.out.println(hasSameLastDigit(41, 22, 71));  //-- true
        System.out.println(hasSameLastDigit(23, 32, 42));   //--true
        System.out.println(hasSameLastDigit(9, 99, 999));   //-- false

        //All passes
        System.out.println(isValid(10)); //true
        System.out.println(isValid(468));  //true
        System.out.println(isValid(1051)); //false
    }

    // 1st method
    public static boolean hasSameLastDigit(int a, int b, int c) {
        boolean aRange = (a > 1000 || a < 10);                  //If a, b, c are out of this range
        boolean bRange = (b > 1000 || b < 10);              //if any of them are true (Outside of Range)
        boolean cRange = (c > 1000 || c < 10);             //Return false
        String aDigit = Integer.toString(a);
        String bDigit = Integer.toString(b);
        String cDigit = Integer.toString(c);

        //Check the first condition
        if (aRange == true || bRange == true || cRange == true) {
            return false; }
      //Check the second Condition
        else {
            for (int i = 0; i < aDigit.length(); i++) {
                for (int j = 0; j < bDigit.length(); j++) {
                    for (int k = 0; k < cDigit.length(); k++) {
                        if (aDigit.charAt(aDigit.length() - 1) == bDigit.charAt(bDigit.length() - 1)) {
                            return true;
                        } else if (aDigit.charAt(aDigit.length() - 1) == cDigit.charAt(cDigit.length() - 1)) {
                            return true;
                        } else if (bDigit.charAt(bDigit.length() - 1) == cDigit.charAt(cDigit.length() - 1)) {
                            return true;
                        }
                        else {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }

    // 2nd Method
    public static boolean isValid(int isDigitValid){
        if (isDigitValid > 1000 || isDigitValid < 10){
            return false;
        }
        else{
            return true;
        }
    }
}
