import java.util.Scanner;

class SavingsAccount {
    static double annualInterestRate;
    private double savingsBalance;
    
    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
    
    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }
    
    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }
    
    public double getSavingsBalance() {
        return savingsBalance;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        SavingsAccount[] accounts = new SavingsAccount[3];
        
        for(int i = 0; i < 3; i++) {
            System.out.println("Enter the initial balance for account " + (i+1) + ": ");
            double balance = scanner.nextDouble();
            accounts[i] = new SavingsAccount(balance);
        }
        
        System.out.println("Enter the annual interest rate (e.g. 0.04 for 4%): ");
        double annualInterest = scanner.nextDouble();
        SavingsAccount.modifyInterestRate(annualInterest);
        
        for(int i = 0; i < 3; i++) {
            accounts[i].calculateMonthlyInterest();
            System.out.println("New Balance for account " + (i+1) + ": " + accounts[i].getSavingsBalance());
        }
        
        System.out.println("Enter the new annual interest rate (e.g. 0.05 for 5%): ");
        double newAnnualInterest = scanner.nextDouble();
        SavingsAccount.modifyInterestRate(newAnnualInterest);
        
        for(int i = 0; i < 3; i++) {
            accounts[i].calculateMonthlyInterest();
            System.out.println("New Balance for account " + (i+1) + " after updating interest rate: " + accounts[i].getSavingsBalance());
        }
        
        scanner.close();
    }
}
