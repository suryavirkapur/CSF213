
import java.util.Scanner;

public class Election {

    public static void main(String[] args) {
        int[] count = new int[6]; // 5 candidates plus one for spoilt votes
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the ballot numbers. Enter a negative number to stop:");
        while (true) {
            int ballot = scanner.nextInt();
            if (ballot < 0) // negative number to stop the voting process
                break;

            if (ballot >= 1 && ballot <= 5) // valid vote
                count[ballot]++;
            else // spoilt vote
                count[5]++;
        }
        scanner.close();

        // Display the votes
        for (int i = 1; i <= 5; i++) {
            if (i < 5)
                System.out.println("Candidate " + i + " received " + count[i] + " votes.");
            else
                System.out.println(count[5] + " spoilt votes.");
        }
    }
}
