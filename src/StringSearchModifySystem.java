import java.util.Scanner;

public class StringSearchModifySystem {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter a sample string: ");
        String text = sc.nextLine();

        System.out.println("\nOriginal text: " + text);

        System.out.println("Enter a word to search: ");
        String word=sc.nextLine();
        if (text.contains(word)){
            System.out.println("The string contains: " + word);
        } else {
            System.out.println("The string does NOT contain: " + word);
        }

        System.out.println("Enter a word to replace: ");
        String stringToReplace = sc.nextLine();
        System.out.println("Enter the new replacement word: ");
        String replacementWorld = sc.nextLine();

        String modifiedString = text.replace(stringToReplace,replacementWorld);
        System.out.println("Modified String: " +  modifiedString);

        System.out.println("part from modified string: " + modifiedString.substring(1,3));

        System.out.println("character at 2nd index: " + modifiedString.charAt(2) );

        if (modifiedString.length() > 8) {
            System.out.println("The modified string has more than 8 characters.");
        } else {
            System.out.println("The modified string has 8 or fewer characters.");
        }

    }
}
