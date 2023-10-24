import java.util.Scanner;

public class NumberProcessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float[] numbers = new float[10];

        System.out.println("Enter 10 floating point numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextFloat();
        }

        float min = numbers[0];
        float max = numbers[0];
        float sum = 0;

        for (float num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            sum += num;
        }
        float average = sum / 10;

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Average value: " + average);
    }
}
