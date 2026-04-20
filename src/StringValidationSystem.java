import java.util.Scanner;

public class StringValidationSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sample string: ");
        String text = sc.nextLine();

        System.out.println("\nOriginal String: " + text);

        System.out.println("Length: " + text.length());

        System.out.println("Uppercase: " + text.toUpperCase());

        System.out.println("Lowercase: " + text.toLowerCase());

        System.out.print("\nEnter a word to search: ");
        String word = sc.nextLine();

        if (text.contains(word)) {
            System.out.println("The string contains: " + word);
        } else {
            System.out.println("The string does NOT contain: " + word);
        }

        System.out.print("\nEnter another string to compare: ");
        String other = sc.nextLine();

        if (text.equalsIgnoreCase(other)) {
            System.out.println("Strings are equal (ignore case).");
        } else {
            System.out.println("Strings are NOT equal.");
        }

        if (text.length() >= 4) {
            String sub = text.substring(0, 4);
            System.out.println("\nExtracted part: " + sub);
        } else {
            System.out.println("\nString is too short for substring.");
        }

        if (text.length() > 5) {
            System.out.println("The string length is greater than 5.");
        } else {
            System.out.println("The string length is 5 or less.");
        }
    }
}
