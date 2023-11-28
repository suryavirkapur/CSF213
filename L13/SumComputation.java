import java.util.Scanner;

public class SumComputation {
    private static int totalSum = 0;

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the total number of values (num): ");
        int num = scanner.nextInt();
        System.out.println("Enter the number of threads (n): ");
        int n = scanner.nextInt();

        scanner.close();

        int segmentLength = num / n;

        Thread[] threads = new Thread[n];
        for (int i = 0; i < n; i++) {
            int start = i * segmentLength + 1;
            int end = (i == n - 1) ? num : (i + 1) * segmentLength;
            threads[i] = new Thread(new SumTask(start, end));
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Total sum: " + totalSum);
    }

    static class SumTask implements Runnable {
        private int start, end;

        public SumTask(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            for (int i = start; i <= end; i++) {
                synchronized (SumComputation.class) {
                    totalSum += i;
                }
            }
        }
    }
}