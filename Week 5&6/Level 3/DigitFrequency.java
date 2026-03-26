import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // Handle negative number
        number = Math.abs(number);

        // Step 1: Count digits
        long temp = number;
        int count = 0;

        if (temp == 0) count = 1; // special case for 0

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Step 2: Store digits in array
        int[] digits = new int[count];
        temp = number;

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = (int)(temp % 10);
            temp /= 10;
        }

        // Step 3: Frequency array (0–9)
        int[] freq = new int[10];

        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]]++;
        }

        // Step 4: Display frequency
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " -> " + freq[i] + " times");
            }
        }

        sc.close();
    }
}