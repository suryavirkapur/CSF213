
import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a phone number: ");
        String phoneNumber = scanner.nextLine();

        String countryCode = phoneNumber.substring(0, 5);
        System.out.println("Country Code: " + countryCode);

        if (phoneNumber.contains("55")) {
            System.out.println("Mobile Phone");
        } else if (phoneNumber.contains("4")) {
            System.out.println("Landline");
        }

        System.out.println("Phone Number: " + phoneNumber);
    }
}
