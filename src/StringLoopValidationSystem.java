import java.util.Scanner;

public class StringLoopValidationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sample string: ");
        String text = sc.nextLine();

        System.out.println("Original String: " + text);

        int length = text.length();
        System.out.println("Total number of characters:  " + length);

        int vowelCount = 0;
        for (int i=0 ; i < length ; i++) {
            char ch = text.toLowerCase().charAt(i);
            System.out.println("Character at index " + i + ":" + ch);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelCount++;
            }
        }
        System.out.println("Total number of vowels in the string: " + vowelCount);

        System.out.print("Enter a word to search: ");
        String searchWord = sc.nextLine();

        if (text.contains(searchWord)) {
            System.out.println("The string contains: " + searchWord);
        } else {
            System.out.println("The string does NOT contain: " + searchWord);
        }

        if (length > 10) {
            System.out.println("The string is long.");
        } else {
            System.out.println("The string is short.");
        }


    }
}
