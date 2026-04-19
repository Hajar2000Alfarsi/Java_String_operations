public class StringCheckDemo {
    public static void main(String[] args) {
        String message="Welcome to Java Programming";
        System.out.println("Original Message: " + message);
        System.out.println("Extracted Text: " + message.substring(11, 15));
        System.out.println("Updated Message: " + message.replace("Java", "Python"));
        System.out.println("Contains 'Java'? " +message.contains("Java"));
        System.out.println("Character at index 5: " + message.charAt(5));
        String secondText = "   Hello World   ";
        System.out.println("Cleaned Second Text: " +secondText.trim());
    }
}

