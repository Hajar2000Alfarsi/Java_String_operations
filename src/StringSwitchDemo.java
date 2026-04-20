public class StringSwitchDemo {
    public static void main(String[] args) {

        String role = "Admin";

        System.out.println("Role: " + role);

        switch (role) {

            case "Admin":
                System.out.println("Full access granted.");
                break;

            case "User":
                System.out.println("Limited access granted.");
                break;

            case "Guest":
                System.out.println("View only access.");
                break;

            default:
                System.out.println("Unknown role.");
        }
    }
}
