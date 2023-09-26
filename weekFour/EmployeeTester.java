import java.util.Scanner;

class Employee {
    private String id;
    private String name;
    private int dept;
    private float basic;
    private float allowance;
    private float totalSalary;

    public Employee(String id, String name, int dept, float basic) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.basic = basic;
        calculateSalary();
    }

    public void calculateSalary() {
        float hra = 0.4f * basic;

        if (dept == 1) {
            allowance = 1500;
        } else if (dept == 2) {
            allowance = 2500;
        } else if (dept == 3) {
            allowance = 3500;
        } else {
            System.out.println("Invalid department");
            return;
        }

        totalSalary = basic + hra + allowance;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("Basic: " + basic);
        System.out.println("Allowance: " + allowance);
        System.out.println("Total Salary: " + totalSalary);
    }
}

public class EmployeeTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Enter ID: ");
            String id = scanner.nextLine();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Department (1 for staff, 2 for accounts, 3 for admin): ");
            int dept = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter Basic Salary: ");
            float basic = Float.parseFloat(scanner.nextLine());

            employees[i] = new Employee(id, name, dept, basic);
            employees[i].calculateSalary();
        }

        for (Employee emp : employees) {
            emp.displayDetails();
        }

        scanner.close();
    }
}