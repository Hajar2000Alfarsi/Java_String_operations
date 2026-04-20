public class StringIfElseDemo {
    public static void main(String[] args) {

        String username = "hajar123";

        System.out.println("Username: " + username);

        if (username.length() > 5) {
            System.out.println("Username length is valid.");
        } else {
            System.out.println("Username is too short.");
        }

        String password = "admin123";

        if (password.equals("admin123")) {
            System.out.println("Password is correct.");
        } else {
            System.out.println("Password is incorrect.");
        }

        if (username.contains("a")) {
            System.out.println("Username contains the letter 'a'.");
        } else {
            System.out.println("Username does not contain the letter 'a'.");
        }

        if (username.isEmpty()) {
            System.out.println("Username is empty.");
        } else {
            System.out.println("Username is not empty.");
        }
    }
}
