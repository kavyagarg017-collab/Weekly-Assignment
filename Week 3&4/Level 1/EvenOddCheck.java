import java.util.Scanner;

public class EvenOddCheck {

    public static void main(String[] args) {

        // Create scanner object
        Scanner input = new Scanner(System.in);

        int number;

        // Take input
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Check even or odd
        if (number % 2 == 0) {
            System.out.println("The number is Even");
        }
        else {
            System.out.println("The number is Odd");
        }

        input.close();
    }
}