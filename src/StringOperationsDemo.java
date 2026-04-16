import java.util.Locale;

public class StringOperationsDemo {
    public static void main(String[] args){
        String customerName= "Ahmed";
        System.out.println("Customer Name: " + customerName);
        System.out.println("length of customer name: " + customerName.length());
        System.out.println("Customer name in uppercase: " + customerName.toUpperCase());
        System.out.println("Customer name in lowercase: " + customerName.toLowerCase());
        String companyName="Codeline";
        System.out.println(customerName.concat(" works in ").concat(companyName));

    }
}
