import java.util.Scanner;

public class SplitWithoutMethod {

    // Method to count length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    // Method to split string using charAt()
    public static String[] splitText(String str) {
        int len = findLength(str);

        // Count words
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int start = 0, index = 0;

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                words[index++] = str.substring(start, i);
                start = i + 1;
            }
        }

        // Last word
        words[index] = str.substring(start, len);

        return words;
    }

    // Compare two string arrays
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String text = sc.nextLine();

        String[] customSplit = splitText(text);
        String[] actualSplit = text.split(" ");

        System.out.println("\nCustom Split:");
        for (String word : customSplit) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in Split:");
        for (String word : actualSplit) {
            System.out.println(word);
        }

        boolean result = compareArrays(customSplit, actualSplit);

        System.out.println("\nAre both results same? " + result);
    }
}