import java.util.Scanner;

public class LeapYearCheck {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Variable to store year
        int year;

        // Take year input
        System.out.print("Enter a year: ");
        year = input.nextInt();

        // Check Gregorian calendar condition
        if (year >= 1582) {

            // Check leap year conditions
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year");
            } 
            else {
                System.out.println(year + " is NOT a Leap Year");
            }

        } 
        else {
            System.out.println("Please enter a year >= 1582 (Gregorian calendar)");
        }

        input.close();
    }
}