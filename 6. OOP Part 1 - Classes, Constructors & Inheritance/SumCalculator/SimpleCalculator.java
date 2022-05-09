public class SimpleCalculator {

//  Fields (Instance Variable)
    private double firstNumber;
    private double secondNumber;

//    Getters
    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber(){
        return secondNumber;
    }

//    Setters
    public void setFirstNumber(double firstNum){
        this.firstNumber = firstNum;
    }

    public void setSecondNumber(double secondNumb){
        this.secondNumber = secondNumb;
    }

//    Additional methods
    public double getAdditionResult(){
        return firstNumber+secondNumber;
    }

    public double getSubtractionResult(){
        return firstNumber-secondNumber;
    }

    public double getMultiplicationResult(){
        return firstNumber*secondNumber;
    }

    public double getDivisionResult(){
        if (secondNumber == 0){
            return 0;
        }
        return firstNumber/secondNumber;
    }
}
