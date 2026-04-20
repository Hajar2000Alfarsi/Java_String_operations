public class StringReverseDemo {
    public static void main(String[] args) {
        String text = "Java Programming";

        System.out.println("Original String: " + text);

        int length = text.length();

        System.out.println("Characters (forward):");
        for (int i = 0; i < length; i++) {
            System.out.println(text.charAt(i));
        }

        String reversed = "";

        for (int i = length - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        System.out.println("\nReversed String: " + reversed);

        char target = 'a';
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("Character '" + target + "' appears: " + count + " times");


        System.out.println("\nComparison:");
        System.out.println("Original : " + text);
        System.out.println("Reversed : " + reversed);
    }
}
