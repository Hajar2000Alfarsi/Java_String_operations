public class StringRecordDemo {
    public static void main(String[] args) {
        String record = "   101, Hajar, IT, Muscat   ";
        System.out.println("Original Record: " + record + "");
        String cleanRecord= record.trim();
        System.out.println("Cleaned Record: " + cleanRecord);

        String word1 = "JAVA";
        String word2 = "java";
        System.out.println("Are words equal (ignore case)? " +
                word1.equalsIgnoreCase(word2));
        String[] parts=cleanRecord.split(",");
        System.out.println("Record parts: ");
        for(String part:parts){
            System.out.println(part);
        }

        String emptyText = "";
        System.out.println("\nIs the string empty? " + emptyText.isEmpty());
        System.out.println("Character at index 2: " + cleanRecord.charAt(2));
    }
}
