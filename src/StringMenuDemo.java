import java.util.Scanner;

public class StringMenuDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sample string: ");
        String text = input.nextLine();

        System.out.println("\n===== STRING MENU =====");
        System.out.println("1. Display Length");
        System.out.println("2. Convert to Uppercase");
        System.out.println("3. Convert to Lowercase");
        System.out.println("4. Check if string contains a word");
        System.out.println("5. Compare with another string (equalsIgnoreCase)");
        System.out.println("========================");

        System.out.print("Enter your choice (1-5): ");
        int choice = input.nextInt();
        input.nextLine();
        switch (choice) {

            case 1:
                System.out.println("Length: " + text.length());
                break;

            case 2:
                System.out.println("Uppercase: " + text.toUpperCase());
                break;

            case 3:
                System.out.println("Lowercase: " + text.toLowerCase());
                break;

            case 4:
                System.out.print("Enter word to search: ");
                String word = input.nextLine();

                if (text.contains(word)) {
                    System.out.println("The string contains: " + word);
                } else {
                    System.out.println("The string does NOT contain: " + word);
                }
                break;

            case 5:
                System.out.print("Enter another string: ");
                String other = input.nextLine();

                if (text.equalsIgnoreCase(other)) {
                    System.out.println("Strings are equal (ignore case).");
                } else {
                    System.out.println("Strings are NOT equal.");
                }
                break;

            default:
                System.out.println("Invalid choice! Please select a number between 1 and 5.");
        }
    }
}
