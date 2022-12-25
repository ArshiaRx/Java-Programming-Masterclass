package ComplexNumber;
public class ComplexNumber {
    //Instance Variables
    private double real, imaginary;

    //Class
    /*public ComplexNumber(){
    }*/

    //Constructor
    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }
    public void add(ComplexNumber complex){
        this.real += complex.getReal();
        this.imaginary += complex.getImaginary();
    }

    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }
    public void subtract(ComplexNumber complex){
        this.real -= complex.getReal();
        this.imaginary -= complex.getImaginary();
    }
}
