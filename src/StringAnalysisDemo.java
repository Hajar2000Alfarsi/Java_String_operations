public class StringAnalysisDemo {
    public static void main(String[] args) {
        String text1 = "Java Programming Language";
        System.out.println("Original String: " + text1);
        System.out.println("Length: " + text1.length());
        String text2 = "Java Programming Language";
        System.out.println("Are both strings equal? " +text1.equals(text2));
        System.out.println("Position of 'Programming': " + text1.indexOf("Programming"));
        System.out.println("Starts with 'Java'? " + text1.startsWith("Java"));
        System.out.println("Ends with 'Language'? " + text1.endsWith("Language"));

    }
}
