import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to my program. What is your name? ");
        String input = scan.nextLine();
        //System.out.println("Hello, Arshia");
        System.out.println("Hello " + input + ".");
        System.out.println("Welcome to the program.");

        //int myFirstNumber = 5;
        //System.out.println("The first number is " + myFirstNumber);
    }
}
