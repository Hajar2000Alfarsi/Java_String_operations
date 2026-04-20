import java.util.Scanner;

public class CompleteStringProcessingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sample string: ");
        String text = sc.nextLine();

        System.out.println("Original String: " + text);

        int length = text.length();
        System.out.println("Total number of characters: " + length);

        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());

        System.out.print("Enter a word to search: ");
        String searchWord = sc.nextLine();

        if (text.contains(searchWord)) {
            System.out.println("The string contains: " + searchWord);
        } else {
            System.out.println("The string does NOT contain: " + searchWord);
        }

        System.out.print("Enter another string for comparison: ");
        String compareString = sc.nextLine();

        if (text.trim().equalsIgnoreCase(compareString.trim())) {
            System.out.println("The strings are equal (ignoring case).");
        } else {
            System.out.println("The strings are NOT equal (ignoring case).");
        }

        System.out.println("First character of the string: " + text.charAt(0));

        int vowelCount = 0;
        System.out.println("Characters in the string:");
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            System.out.println("Character at index " + i + ": " + ch);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelCount++;
            }

        }

        System.out.println("Total number of vowels: " + vowelCount);

        if (length > 10) {
            System.out.println("The string is long.");
        } else {
            System.out.println("The string is short.");
        }

    }
}
