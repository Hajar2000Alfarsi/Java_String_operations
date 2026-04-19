public class StringProcessDemo {
    public static void main(String[] args) {
        String employeeRecord="   101, Hajar, IT Department, Muscat   ";
        System.out.println("Original String: " + employeeRecord);
        String cleanRecord= employeeRecord.trim();
        System.out.println("String without unnecessary spaces: " + cleanRecord);

        String[] parts= cleanRecord.split(",");
        System.out.println("Spilt parts :");
        for(String part:parts){
            System.out.println(part);
        }

        String word1="java";
        String word2="JAVA";
        System.out.println("Are the words equal (ignore case)? "+ word1.equalsIgnoreCase(word2));

        String emptyText="";
        System.out.println();
        System.out.println("Is the string empty? " + emptyText.isEmpty());

    }
}
