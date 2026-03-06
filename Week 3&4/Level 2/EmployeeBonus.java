import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Declare variables
        double salary, bonus;
        int yearsOfService;

        // Take salary input
        System.out.print("Enter employee salary: ");
        salary = input.nextDouble();

        // Take years of service input
        System.out.print("Enter years of service: ");
        yearsOfService = input.nextInt();

        // Check condition for bonus
        if (yearsOfService > 5) {
            bonus = salary * 0.05;
            System.out.println("Bonus amount is: " + bonus);
        } 
        else {
            System.out.println("Employee is not eligible for bonus.");
        }

        input.close();
    }
}