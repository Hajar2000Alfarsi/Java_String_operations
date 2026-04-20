import java.util.Scanner;

public class StringAnalysisSystem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a sample string: ");
        String text=sc.nextLine();

        System.out.println("\nOriginal String: " + text);

        System.out.println("\nLength: " + text.length());

        System.out.println("Enter a word to search: ");
        String word=sc.nextLine();
        if (text.contains(word)){
            System.out.println("The string contains: " + word);
        } else {
            System.out.println("The string does NOT contain: " + word);
        }

        System.out.print("\nEnter another string to compare: ");
        String other=sc.nextLine();
        if (text.trim().equalsIgnoreCase(other.trim())){
            System.out.println("Strings are equal (ignore case).");
        } else {
            System.out.println("Strings are NOT equal.");
        }

        System.out.println("\nFirst character: " + text.charAt(0));

        if (text.length() > 10) {
            System.out.println("The string is long.");
        } else {
            System.out.println("The string is short.");
        }
    }
}
