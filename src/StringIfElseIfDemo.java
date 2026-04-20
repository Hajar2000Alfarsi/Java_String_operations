public class StringIfElseIfDemo {
    public static void main(String[] args) {
        String text = "Java";

        System.out.println("Original String: " + text);

        if (text.isEmpty()) {
            System.out.println("The string is empty.");
        }

        else if (text.length() < 5) {
            System.out.println("The string is short.");
        }

        else if (text.startsWith("J")) {
            System.out.println("The string starts with 'J'.");
        }

        else if (text.endsWith("a")) {
            System.out.println("The string ends with 'a'.");
        }

        else if (text.equalsIgnoreCase("java")) {
            System.out.println("The string equals 'java' (ignore case).");
        }

        else {
            System.out.println("None of the conditions are true.");
        }
    }
}
