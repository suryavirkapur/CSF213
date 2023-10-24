
import java.util.Scanner;

public class AreaTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area areaObj = new Area();

        System.out.println("Choose the shape for which you want to calculate the area:");
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Rectangle");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the side of the square: ");
                int side = sc.nextInt();
                areaObj.calc_Area(side);
                break;
            case 2:
                System.out.print("Enter the radius of the circle: ");
                float radius = sc.nextFloat();
                areaObj.calc_Area(radius);
                break;
            case 3:
                System.out.print("Enter the length of the rectangle: ");
                float side1 = sc.nextFloat();
                System.out.print("Enter the breadth of the rectangle: ");
                float side2 = sc.nextFloat();
                areaObj.calc_Area(side1, side2);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

        areaObj.display();

    }
}
