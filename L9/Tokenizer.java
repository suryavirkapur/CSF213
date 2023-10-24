
import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokenizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String inputLine = scanner.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(inputLine);

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            if (token.startsWith("b") || token.startsWith("B")) {
                System.out.println(token);
            }
        }
    }
}