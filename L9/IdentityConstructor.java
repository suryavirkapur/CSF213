
import java.util.Random;
import java.util.Scanner;

public class IdentityConstructor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Year: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Discipline (CHEM-A1, EEE-A3, MECH-A4, CS-A7): ");
        String discipline = scanner.nextLine().toUpperCase();

        System.out.print("Enter PS/TS: ");
        String psOrTs = scanner.nextLine().toUpperCase();

        System.out.print("Enter Campus (Pilani P, Hyderabad H, Goa G, Dubai U): ");
        String campus = scanner.nextLine().toUpperCase();

        Random random = new Random();
        int randomNumber = random.nextInt(899) + 100;

        String studentId = String.format("%d%s%s%03d%s", year, discipline.charAt(0), discipline.substring(1), randomNumber, campus.charAt(0));


        String emailId = String.format("f%d@%s.bits-pilani.ac.in", year, campus.toLowerCase());

        System.out.println("BITS Student ID: " + studentId);
        System.out.println("BITS Email ID: " + emailId);
    }
}