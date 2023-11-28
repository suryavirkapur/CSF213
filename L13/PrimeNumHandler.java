import java.util.Scanner;

public class PrimeNumHandler {
    public static class NegativeNumberException extends IllegalArgumentException {
        public NegativeNumberException(String errorMessage) {
            super(errorMessage);
        }
    }

    public static class Prime {
        private int number;

        public Prime(int number) {
            if (number < 0) {
                throw new NegativeNumberException("Number must be non-negative.");
            }
            this.number = number;
        }

        public boolean isPrime() {
            if (this.number <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(this.number); i++) {
                if (this.number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter start of range: ");
        int start = scanner.nextInt();
        System.out.println("Enter end of range: ");
        int end = scanner.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            try {
                Prime prime = new Prime(i);
                if (prime.isPrime()) {
                    System.out.println(i);
                }
            } catch (NegativeNumberException e) {
                System.out.println("Error for number " + i + ": " + e.getMessage());
                break;
            }
        }

        scanner.close();
    }
}