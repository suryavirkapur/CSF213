import java.util.Scanner; 

public class Main
{ 
    public static void main (String[] args)
    { 
        Scanner scanner = new Scanner(System.in); 

        System.out.println ("Enter LR: "); 
        int lr = scanner.nextInt(); 
        System.out.println ("Enter UR: "); 
        int ur = scanner.nextInt(); 

        for (int i = lr; i <= ur; i++)
        { 
            if ((i > 1) && (isPrime(i)))
            { 
                System.out.println (i); 
            }
        }
    }

    public static boolean isPrime(int i)
    { 
        for (int j = 2; j <= i/2; j++)
        { 
            if (i == 2 || i == 3)
            { 
                return true; 
            }

            else if (i % j == 0)
            { 
                return false; 
            }

            else
            { 
                return true; 
            }
        }
        return false; 
    }
}