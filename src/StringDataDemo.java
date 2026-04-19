public class StringDataDemo {
    public static void main(String[] args) {
        String text = "Java is a powerful programming language";
        System.out.println("Original String: " + text);
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Position of 'powerful': " + text.indexOf("powerful"));
        System.out.println("Extracted Text: " + text.substring(0, 4));
        System.out.println("Contains 'Java'? " + text.contains("Java"));
    }
}
