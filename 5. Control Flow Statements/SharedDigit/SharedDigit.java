public class SharedDigit {
    public static void main(String[] args) {
        System.out.println("12, 23 should be True: " + hasSharedDigit(12, 23));   //true
        System.out.println("9, 99 should be False: " + hasSharedDigit(9, 99));     //false
        System.out.println("15 55 should be True: " + hasSharedDigit(15, 55));     //true

        //Case Passed
    }

    public static boolean hasSharedDigit(int first, int second) {
        String firstDigit = Integer.toString(first);                //Convert numbers into string to extract from the
        String secondDigit = Integer.toString(second);                   //digit position and check with one another.


        if ((first < 10 || first > 99) || (second < 10 || second > 99)) {                //Check if numbers in the range
            return false;
        } else {
                                                                                //Loop through each digit in string
            for (int i = 0; i <= firstDigit.length(); i++) {
                for (int j = 0; j <= secondDigit.length(); j++){

                    //Compares firstDigit position 1 with secondDigit position 1 & 2
                    if (firstDigit.charAt(i) == secondDigit.charAt(j) || firstDigit.charAt(i) == secondDigit.charAt(j+1)){
                        return true;
                        /*At this point with the change of ^ to true I get false, true, false. Which is completely opposite
                        from what I have to get*/

                        //Compares firstDigit position 2 with secondDigit position 1 and 2
                    } else if (firstDigit.charAt(i+1) == secondDigit.charAt(j) || firstDigit.charAt(i+1) == secondDigit.charAt(j+1)) {
                        return true;
                    }
                    else {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    
}
/*write a method name hasSharedDigit with two parameters of type int.
//Each number should be within 10 - 99 inclusive. If  one of the number is not
//within the range return false

//the method should return true if there is a digit that appears in both numbers,
//such as 2 in 12 and 23; otherwise the method should return false

* hasSharedDigit(12, 23);  -- 2 exist in the both digit
* hasSharedDigit(9, 99);  -- false 9 not in range
* hasSharedDigit(15, 55);  -- 5 appears in both digit
*/