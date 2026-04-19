public class StringModifyDemo {
    public static void main(String[] args) {
        String sentence="   Welcome to Java Programming   ";

        System.out.println("Original sentence: " + sentence);
        System.out.println("Trimmed sentence: " + sentence.trim());
        System.out.println("Does sentence contaian 'Java'? " + sentence.contains("Java"));
        System.out.println("replacce 'Java' to 'c++': " + sentence.replace("Java","c++"));


    }
}
