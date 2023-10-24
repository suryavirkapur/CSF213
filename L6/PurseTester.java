import java.util.Scanner;

class Purse {
    private int dirham;
    private int _50fills;
    private int _25fills;
    private double total; 

    public Purse() {
        dirham = 0;
        _50fills = 0;
        _25fills = 0;
        total = 0.0;
    }

    public void add_dirham(int count) {
        dirham += count;
        updateTotal();
    }

    public void remove_dirham(int count) {
        dirham = Math.max(0, dirham - count);
        updateTotal();
    }

    public void add_50fills(int count) {
        _50fills += count;
        updateTotal();
    }

    public void remove_50fills(int count) {
        _50fills = Math.max(0, _50fills - count);
        updateTotal();
    }

    public void add_25fills(int count) {
        _25fills += count;
        updateTotal();
    }

    public void remove_25fills(int count) {
        _25fills = Math.max(0, _25fills - count);
        updateTotal();
    }

    private void updateTotal() {
        total = dirham + (_50fills * 0.50) + (_25fills * 0.25);
    }

    public void total_cash() {
        System.out.printf("Total cash: AED %.2f\n", total);
    }
}

public class PurseTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Purse purse = new Purse();

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add dirhams");
            System.out.println("2. Remove dirhams");
            System.out.println("3. Add 50 fills");
            System.out.println("4. Remove 50 fills");
            System.out.println("5. Add 25 fills");
            System.out.println("6. Remove 25 fills");
            System.out.println("7. Display total cash");
            System.out.println("8. Exit");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();

            int count;

            switch (choice) {
                case 1:
                    System.out.print("Enter number of dirhams to add: ");
                    count = scanner.nextInt();
                    purse.add_dirham(count);
                    break;
                case 2:
                    System.out.print("Enter number of dirhams to remove: ");
                    count = scanner.nextInt();
                    purse.remove_dirham(count);
                    break;
                case 3:
                    System.out.print("Enter number of 50 fills to add: ");
                    count = scanner.nextInt();
                    purse.add_50fills(count);
                    break;
                case 4:
                    System.out.print("Enter number of 50 fills to remove: ");
                    count = scanner.nextInt();
                    purse.remove_50fills(count);
                    break;
                case 5:
                    System.out.print("Enter number of 25 fills to add: ");
                    count = scanner.nextInt();
                    purse.add_25fills(count);
                    break;
                case 6:
                    System.out.print("Enter number of 25 fills to remove: ");
                    count = scanner.nextInt();
                    purse.remove_25fills(count);
                    break;
                case 7:
                    purse.total_cash();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please choose again.");
                    break;
            }
        }
    }
}
