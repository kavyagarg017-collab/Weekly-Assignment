import java.util.Scanner;

public class OddEvenNumbers {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Declare variable
        int number;

        // Take input from user
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Loop from 1 to the entered number
        for (int i = 1; i <= number; i++) {

            // Check if number is even or odd
            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } 
            else {
                System.out.println(i + " is Odd");
            }
        }

        input.close();
    }
}