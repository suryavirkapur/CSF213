import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private int year;
    private String id;

    public Student(String name, int age, int year, String id) {
        if (!name.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Name must only contain letters.");
        }
        if (age >= 35) {
            throw new IllegalArgumentException("Age must be less than 35.");
        }
        if (year < 1 || year > 4) {
            throw new IllegalArgumentException("Year must be between 1 and 4.");
        }
        if (!id.matches("^[a-zA-Z]\\d{4}[a-zA-Z]$")) { // Example ID format: a1234B
            throw new IllegalArgumentException("ID format is invalid.");
        }

        this.name = name;
        this.age = age;
        this.year = year;
        this.id = id;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // consume the remaining newline
        System.out.println("Enter ID: ");
        String id = scanner.nextLine();

        try {
            Student student = new Student(name, age, year, id);
            System.out.println("Student created successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}