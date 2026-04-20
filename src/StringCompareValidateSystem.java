import java.util.Scanner;

public class StringCompareValidateSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sample string: ");
        String text = sc.nextLine();

        System.out.println("Original string: " + text);
        System.out.println("Total number of characters: " + text.length());

        System.out.println("Enter another string for comparison: ");
        String compareString = sc.nextLine();

        if (text.trim().equals(compareString.trim())) {
            System.out.println("The strings are exactly equal.");
        } else {
            System.out.println("The strings are NOT equal.");
        }

        System.out.println("enter prifix to check:" );
        String  prifix = sc.nextLine();

        if (text.startsWith(prifix)) {
            System.out.println("The original string starts with " + prifix + " .");
        } else {
            System.out.println("The original string does NOT start with " + prifix + " .");
        }

        System.out.print("Enter a suffix to check: ");
        String suffix = sc.nextLine();

        if (text.endsWith(suffix)) {
            System.out.println("The original string ends with " + suffix + " .");
        } else {
            System.out.println("The original string does NOT end with " + suffix + " .");
        }

        if (text.length() > 8) {
            System.out.println("The modified string has more than 8 characters.");
        } else {
            System.out.println("The modified string has 8 or fewer characters.");
        }
    }
}
