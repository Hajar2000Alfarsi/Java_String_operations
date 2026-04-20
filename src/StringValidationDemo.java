public class StringValidationDemo {
    public static void main(String[] args) {
        String text = "Welcome to Java Programming";
        System.out.println("Original String: " + text);
        System.out.println("Starts with 'Welcome'? " + text.startsWith("Welcome"));
        System.out.println("Ends with 'Programming'? " + text.endsWith("Programming"));
        System.out.println("Updated String: " + text.replace("Java", "Python"));
        System.out.println("Extracted Text: " + text.substring(11, 15));
        System.out.println("Length: " + text.length());

    }
}
