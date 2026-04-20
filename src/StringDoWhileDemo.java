public class StringDoWhileDemo {
    public static void main(String[] args) {
        String text = "Java Programming Language";
        System.out.println("Original String: " + text);
        int length = text.length();
        System.out.println("Length: " + length);

        int i = 0;
        int lowercase = 0;
        int spaces = 0;
        do {

            char ch = text.charAt(i);
            System.out.println(ch);

            if (Character.isLowerCase(ch)) {
                lowercase++;
            }

            if (ch == ' ') {
                spaces++;
            }
            i++;

        } while (i < length);
        System.out.println("\nTotal lowercase letters: " + lowercase);

        System.out.println("Total spaces: " + spaces);
    }
}
