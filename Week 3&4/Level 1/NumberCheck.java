import java.util.Scanner;

public class NumberCheck {

    public static void main(String[] args) {

        // Create scanner object
        Scanner input = new Scanner(System.in);

        int number;

        // Take user input
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Check the number type
        if (number > 0) {
            System.out.println("The number is Positive");
        }
        else if (number < 0) {
            System.out.println("The number is Negative");
        }
        else {
            System.out.println("The number is Zero");
        }

        input.close();
    }
}