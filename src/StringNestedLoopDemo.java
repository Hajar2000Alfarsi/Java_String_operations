public class StringNestedLoopDemo {
    public static void main(String[] args) {

        String text1 = "Java";
        String text2 = "Programming";

        System.out.println("String 1: " + text1);
        System.out.println("String 2: " + text2);

        int len1 = text1.length();
        int len2 = text2.length();

        int matchCount = 0;

        System.out.println("Matching Characters:");

        for (int i = 0; i < len1; i++) {

            for (int j = 0; j < len2; j++) {

                if (text1.charAt(i) == text2.charAt(j)) {

                    System.out.println(text1.charAt(i));

                    matchCount++;
                    break;
                }
            }
        }

        System.out.println("\nTotal matching characters: " + matchCount);

        String word1 = "HELLO";
        String word2 = "WORLD";

        System.out.println("Character Comparison:");

        for (int i = 0; i < word1.length(); i++) {
            for (int j = 0; j < word2.length(); j++) {

                System.out.println(word1.charAt(i) + " vs " + word2.charAt(j));
            }
        }
    }
}
