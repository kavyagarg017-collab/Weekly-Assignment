import java.util.Scanner;

public class TriangleAnglesCheck {

    public static void main(String[] args) {

        // Create scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take three angle inputs
        int x, y, z;

        System.out.print("Enter first angle: ");
        x = input.nextInt();

        System.out.print("Enter second angle: ");
        y = input.nextInt();

        System.out.print("Enter third angle: ");
        z = input.nextInt();

        // Calculate sum of angles
        int sum = x + y + z;

        // Check triangle condition
        if (sum == 180) {
            System.out.println("The given angles are internal angles of a triangle");
        } else {
            System.out.println("They are not internal angles of a triangle");
        }

        input.close();
    }
}