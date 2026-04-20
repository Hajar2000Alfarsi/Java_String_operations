public class StringLoopDemo {
    public static void main(String[] args) {
        String text = "Java Programming 2025";
        System.out.println("Original String: " + text);
        int length=text.length();
        System.out.println("Length: " + length);

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            System.out.println(ch);

            char lower = Character.toLowerCase(ch);
            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                vowels++;
            }else {
                consonants++;
            }
            if(Character.isDigit(ch)){
                digits++;
            }
        }

        System.out.println("\nTotal vowels: " + vowels);
        System.out.println("Total consonants: " + consonants);
        System.out.println("Total digits: " + digits);

    }
}
