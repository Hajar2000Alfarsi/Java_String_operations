public class StringCompareDemo {
    public static void main(String[] args){
        String sampleWord="Java";
        System.out.println("Original string: " + sampleWord);
        System.out.println("Character at index 3: " + sampleWord.charAt(3));
        System.out.println("substring of sample word: " + sampleWord.substring(0,2));

        String sampleWord2="Java";
        System.out.println(sampleWord + " Does equal " + sampleWord2 +" ? " +sampleWord.equals(sampleWord2));
        String sampleWord3="Python";
        System.out.println(sampleWord + " Does equal " + sampleWord3 +" ? " +sampleWord.equals(sampleWord3));
    }
}
