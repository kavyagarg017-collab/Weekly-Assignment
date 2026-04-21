import java.util.Scanner;

public class StringLengthWithoutMethod {

    // Method to find length without using length()
    public static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // When index goes out of bounds, exception occurs
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.next();

        int customLength = findLength(str);
        int actualLength = str.length();

        System.out.println("Length (without method): " + customLength);
        System.out.println("Length (using length()): " + actualLength);
    }
}